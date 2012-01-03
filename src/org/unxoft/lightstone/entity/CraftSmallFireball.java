package org.unxoft.lightstone.entity;

import net.minecraft.server.EntitySmallFireball;
import org.unxoft.lightstone.CraftServer;
import org.bukkit.entity.SmallFireball;

public class CraftSmallFireball extends CraftFireball implements SmallFireball {
    public CraftSmallFireball(CraftServer server, EntitySmallFireball entity) {
        super(server, entity);
    }

    @Override
    public EntitySmallFireball getHandle() {
        return (EntitySmallFireball) entity;
    }

    @Override
    public String toString() {
        return "CraftSmallFireball";
    }
}
