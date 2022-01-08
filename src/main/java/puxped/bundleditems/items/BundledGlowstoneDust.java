 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
import puxped.bundleditems.BItems;
 
 public class BundledGlowstoneDust extends BundledItem {
   public BundledGlowstoneDust(Item.Properties properties) {
     super(properties);
   }
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.GLOWSTONE_DUST, BItems.small_bottle, 8, 1);
   }
 }
