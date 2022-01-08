 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.Items;
 
 public class BundledBirchSaplings extends BundledItem {
   public BundledBirchSaplings(Item.Properties properties) {
     super(properties);
   }
 
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.BIRCH_SAPLING, null, 9, 0);
   }
 }


/* Location:              G:\MODDING2\BundledItems1165\bundleditems-mc1.16.4-1.4.0.jar!\enderman842\bundleditems\items\BundledBirchSaplings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */