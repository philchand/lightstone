package net.minecraft.server;

// lightstone start
import org.unxoft.lightstone.block.CraftBlockState;
import org.unxoft.lightstone.event.CraftEventFactory;
import org.bukkit.event.block.BlockPlaceEvent;
// lightstone end

public class ItemSign extends Item {

    public ItemSign(int i) {
        super(i);
        this.maxStackSize = 1;
    }

    public boolean a(ItemStack itemstack, EntityHuman entityhuman, World world, int i, int j, int k, int l) {
        if (l == 0) {
            return false;
        } else if (!world.getMaterial(i, j, k).isBuildable()) {
            return false;
        } else {
            int clickedX = i, clickedY = j, clickedZ = k; // lightstone

            if (l == 1) {
                ++j;
            }

            if (l == 2) {
                --k;
            }

            if (l == 3) {
                ++k;
            }

            if (l == 4) {
                --i;
            }

            if (l == 5) {
                ++i;
            }

            if (!entityhuman.d(i, j, k)) {
                return false;
            } else if (!Block.SIGN_POST.canPlace(world, i, j, k)) {
                return false;
            } else {
                CraftBlockState blockState = CraftBlockState.getBlockState(world, i, j, k); // lightstone

                if (l == 1) {
                    int i1 = MathHelper.floor((double) ((entityhuman.yaw + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;

                    world.setTypeIdAndData(i, j, k, Block.SIGN_POST.id, i1);
                } else {
                    world.setTypeIdAndData(i, j, k, Block.WALL_SIGN.id, l);
                }

                // lightstone start - sign
                BlockPlaceEvent event = CraftEventFactory.callBlockPlaceEvent(world, entityhuman, blockState, clickedX, clickedY, clickedZ, l == 1 ? Block.SIGN_POST : Block.WALL_SIGN);

                if (event.isCancelled() || !event.canBuild()) {
                    event.getBlockPlaced().setTypeIdAndData(blockState.getTypeId(), blockState.getRawData(), false);
                    return false;
                }
                // lightstone end

                --itemstack.count;
                TileEntitySign tileentitysign = (TileEntitySign) world.getTileEntity(i, j, k);

                if (tileentitysign != null) {
                    entityhuman.a(tileentitysign);
                }

                return true;
            }
        }
    }
}
