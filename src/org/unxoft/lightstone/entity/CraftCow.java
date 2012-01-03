package org.unxoft.lightstone.entity;

import net.minecraft.server.EntityCow;
import org.unxoft.lightstone.CraftServer;
import org.bukkit.entity.Cow;

public class CraftCow extends CraftAnimals implements Cow {

    public CraftCow(CraftServer server, EntityCow entity) {
        super(server, entity);
    }

    @Override
    public EntityCow getHandle() {
        return (EntityCow) entity;
    }

    @Override
    public String toString() {
        return "CraftCow";
    }
}
