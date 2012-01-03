package org.unxoft.lightstone.entity;

import net.minecraft.server.EntitySnowman;
import org.unxoft.lightstone.CraftServer;
import org.bukkit.entity.Snowman;

public class CraftSnowman extends CraftCreature implements Snowman {
    public CraftSnowman(CraftServer server, EntitySnowman entity) {
        super(server, entity);
    }

    @Override
    public EntitySnowman getHandle() {
        return (EntitySnowman) entity;
    }

    @Override
    public String toString() {
        return "CraftSnowman";
    }
}
