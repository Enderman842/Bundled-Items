 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledBakedPotatoes extends BundledItem {
   public BundledBakedPotatoes(Item.Properties properties) {
     super(properties);
   }
 
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.BAKED_POTATO, null, 9, 0);
   }
 }
