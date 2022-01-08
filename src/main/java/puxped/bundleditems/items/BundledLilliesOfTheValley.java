 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledLilliesOfTheValley extends BundledItem {
   public BundledLilliesOfTheValley(Item.Properties properties) {
     super(properties);
   }
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.LILY_OF_THE_VALLEY, Items.PAPER, 8, 1);
   }
 }
