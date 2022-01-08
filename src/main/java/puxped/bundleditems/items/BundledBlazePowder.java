 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledBlazePowder extends BundledItem {
   public BundledBlazePowder(Item.Properties properties) {
     super(properties);
   }
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.BLAZE_POWDER, Items.BOWL, 8, 1);
   }
 }
