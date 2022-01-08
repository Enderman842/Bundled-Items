 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
import puxped.bundleditems.BItems;
 
 public class BundledRedstone extends BundledItem {
   public BundledRedstone(Item.Properties properties) {
     super(properties);
   }
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.REDSTONE, BItems.small_bottle, 8, 1);
   }
 }
