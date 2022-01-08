 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledBricks extends BundledItem {
   public BundledBricks(Item.Properties properties) {
     super(properties);
   }
 
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.BRICK, null, 9, 0);
   }
 }
