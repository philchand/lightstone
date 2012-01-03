package org.unxoft.lightstone.entity;

import net.minecraft.server.EntityEnderSignal;
import org.unxoft.lightstone.CraftServer;
import org.bukkit.entity.EnderSignal;

public class CraftEnderSignal extends CraftEntity implements EnderSignal {
    public CraftEnderSignal(CraftServer server, EntityEnderSignal entity) {
        super(server, entity);
    }

    @Override
    public EntityEnderSignal getHandle() {
        return (EntityEnderSignal) entity;
    }

    @Override
    public String toString() {
        return "CraftEnderSignal";
    }
}
