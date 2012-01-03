package org.unxoft.lightstone.entity;

import net.minecraft.server.EntityEnderCrystal;
import org.unxoft.lightstone.CraftServer;
import org.bukkit.entity.EnderCrystal;

public class CraftEnderCrystal extends CraftEntity implements EnderCrystal {
    public CraftEnderCrystal(CraftServer server, EntityEnderCrystal entity) {
        super(server, entity);
    }

    @Override
    public EntityEnderCrystal getHandle() {
        return (EntityEnderCrystal) entity;
    }

    @Override
    public String toString() {
        return "CraftEnderCrystal";
    }
}
