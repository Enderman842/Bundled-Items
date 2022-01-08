 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
import puxped.bundleditems.BItems;
 
 public class BundledArrows extends BundledItem {
   public BundledArrows(Item.Properties properties) {
     super(properties);
   }
 
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.ARROW, BItems.quiver, 8, 1);
   }
 }
