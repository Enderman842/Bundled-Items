 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledClayBalls extends BundledItem {
   public BundledClayBalls(Item.Properties properties) {
     super(properties);
   }
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.CLAY_BALL, Items.BOWL, 8, 1);
   }
 }
