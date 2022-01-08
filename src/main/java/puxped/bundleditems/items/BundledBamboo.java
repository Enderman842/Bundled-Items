 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledBamboo extends BundledItem {
   public BundledBamboo(Item.Properties properties) {
     super(properties);
   }
 
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.BAMBOO, null, 9, 0);
   }
 }


/* Location:              G:\MODDING2\BundledItems1165\bundleditems-mc1.16.4-1.4.0.jar!\enderman842\bundleditems\items\BundledBamboo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */