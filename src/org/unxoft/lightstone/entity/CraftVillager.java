package org.unxoft.lightstone.entity;

import net.minecraft.server.EntityVillager;
import org.unxoft.lightstone.CraftServer;
import org.bukkit.entity.Villager;

public class CraftVillager extends CraftCreature implements Villager {
    public CraftVillager(CraftServer server, EntityVillager entity) {
        super(server, entity);
    }

    @Override
    public EntityVillager getHandle() {
        return (EntityVillager) entity;
    }

    @Override
    public String toString() {
        return "CraftVillager";
    }
}
