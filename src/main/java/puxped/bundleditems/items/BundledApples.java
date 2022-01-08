 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledApples extends BundledItem {
   public BundledApples(Item.Properties properties) {
     super(properties);
   }
 
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.APPLE, Items.BOWL, 8, 1);
   }
 }
