package org.unxoft.lightstone.entity;

import net.minecraft.server.EntityGiantZombie;

import org.unxoft.lightstone.CraftServer;
import org.bukkit.entity.Giant;

public class CraftGiant extends CraftMonster implements Giant {

    public CraftGiant(CraftServer server, EntityGiantZombie entity) {
        super(server, entity);
    }

    @Override
    public EntityGiantZombie getHandle() {
        return (EntityGiantZombie) entity;
    }

    @Override
    public String toString() {
        return "CraftGiant";
    }
}
