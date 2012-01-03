package org.unxoft.lightstone.entity;

import net.minecraft.server.EntityWeatherLighting;
import org.unxoft.lightstone.CraftServer;
import org.bukkit.entity.LightningStrike;

public class CraftLightningStrike extends CraftEntity implements LightningStrike {
    public CraftLightningStrike(final CraftServer server, final EntityWeatherLighting entity) {
        super(server, entity);
    }

    public boolean isEffect() {
        return ((EntityWeatherLighting) super.getHandle()).isEffect;
    }

    @Override
    public EntityWeatherLighting getHandle() {
        return (EntityWeatherLighting) entity;
    }

    @Override
    public String toString() {
        return "CraftLightningStrik";
    }
}
