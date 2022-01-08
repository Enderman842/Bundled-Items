 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledCod extends BundledItem {
   public BundledCod(Item.Properties properties) {
     super(properties);
   }
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.COD, null, 9, 0);
   }
 }
