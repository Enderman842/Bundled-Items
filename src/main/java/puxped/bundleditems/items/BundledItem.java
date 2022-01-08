 package puxped.bundleditems.items;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.item.ItemEntity;
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.IItemProvider;
 import net.minecraft.world.World;
 
 public abstract class BundledItem extends Item {
   public BundledItem(Item.Properties properties) {
     super(properties);
   }
   
   public abstract void processUncraftPacket(ServerPlayerEntity paramServerPlayerEntity);
   
   public void uncraft(ServerPlayerEntity playerIn, Item output1, Item output2, int quantity1, int quantity2) {
     ItemStack itemstack = playerIn.getHeldItemMainhand();
     World worldIn = playerIn.world;
     if (!worldIn.isRemote) {
       worldIn.addEntity((Entity)new ItemEntity(worldIn, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), new ItemStack((IItemProvider)output1, quantity1)));
       if (output2 != null) {
         worldIn.addEntity((Entity)new ItemEntity(worldIn, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), new ItemStack((IItemProvider)output2, quantity2)));
       }
       if (!playerIn.abilities.isCreativeMode)
         itemstack.shrink(1); 
     } 
   }
 }
