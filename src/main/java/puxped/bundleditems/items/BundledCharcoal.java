 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledCharcoal extends BundledItem {
   public BundledCharcoal(Item.Properties properties) {
     super(properties);
   }
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.CHARCOAL, Items.BOWL, 8, 1);
   }
 }
