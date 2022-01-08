 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledBread extends BundledItem {
   public BundledBread(Item.Properties properties) {
     super(properties);
   }
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.BREAD, null, 9, 0);
   }
 }
