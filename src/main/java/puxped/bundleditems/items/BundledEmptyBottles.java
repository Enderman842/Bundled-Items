 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledEmptyBottles extends BundledItem {
   public BundledEmptyBottles(Item.Properties properties) {
     super(properties);
   }
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.GLASS_BOTTLE, null, 9, 0);
   }
 }
 /* 15 */