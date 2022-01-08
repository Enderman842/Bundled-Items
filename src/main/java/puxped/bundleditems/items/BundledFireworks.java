 package puxped.bundleditems.items;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.entity.projectile.FireworkRocketEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.item.ItemUseContext;
 import net.minecraft.item.Items;
 import net.minecraft.util.ActionResultType;
 import net.minecraft.util.math.vector.Vector3d;
 import net.minecraft.world.World;
 
 public class BundledFireworks extends BundledItem {
   public BundledFireworks(Item.Properties properties) {
     super(properties);
   }
   public ActionResultType onItemUse(ItemUseContext context) {
      World world = context.getWorld();
      if (!world.isRemote) {
       ItemStack itemstack = context.getItem();
       Vector3d vec3d = context.getHitVec();
       FireworkRocketEntity fireworkrocketentity1 = new FireworkRocketEntity(world, vec3d.x, vec3d.y, vec3d.z, itemstack);
       FireworkRocketEntity fireworkrocketentity2 = new FireworkRocketEntity(world, vec3d.x + 0.5D, vec3d.y, vec3d.z + 0.5D, itemstack);
       FireworkRocketEntity fireworkrocketentity3 = new FireworkRocketEntity(world, vec3d.x + 0.5D, vec3d.y, vec3d.z, itemstack);
       FireworkRocketEntity fireworkrocketentity4 = new FireworkRocketEntity(world, vec3d.x, vec3d.y, vec3d.z + 0.5D, itemstack);
       FireworkRocketEntity fireworkrocketentity5 = new FireworkRocketEntity(world, vec3d.x - 0.5D, vec3d.y, vec3d.z, itemstack);
       FireworkRocketEntity fireworkrocketentity6 = new FireworkRocketEntity(world, vec3d.x - 0.5D, vec3d.y, vec3d.z - 0.5D, itemstack);
       FireworkRocketEntity fireworkrocketentity7 = new FireworkRocketEntity(world, vec3d.x, vec3d.y, vec3d.z - 0.5D, itemstack);
       FireworkRocketEntity fireworkrocketentity8 = new FireworkRocketEntity(world, vec3d.x + 0.5D, vec3d.y, vec3d.z - 0.5D, itemstack);
       FireworkRocketEntity fireworkrocketentity9 = new FireworkRocketEntity(world, vec3d.x - 0.5D, vec3d.y, vec3d.z + 0.5D, itemstack);
       world.addEntity((Entity)fireworkrocketentity1);
       world.addEntity((Entity)fireworkrocketentity2);
       world.addEntity((Entity)fireworkrocketentity3);
       world.addEntity((Entity)fireworkrocketentity4);
       world.addEntity((Entity)fireworkrocketentity5);
       world.addEntity((Entity)fireworkrocketentity6);
       world.addEntity((Entity)fireworkrocketentity7);
       world.addEntity((Entity)fireworkrocketentity8);
       world.addEntity((Entity)fireworkrocketentity9);
       itemstack.shrink(1);
     } 
     
     return ActionResultType.SUCCESS;
   }
 
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.FIREWORK_ROCKET, null, 9, 0);
   }
 }
