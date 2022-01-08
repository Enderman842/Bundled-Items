 package puxped.bundleditems.items;
 
 import net.minecraft.entity.player.ServerPlayerEntity;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.item.Items;
 import net.minecraft.util.ResourceLocation;
 import net.minecraftforge.api.distmarker.Dist;
 import net.minecraftforge.api.distmarker.OnlyIn;
 
 public class BundledEGoldenApple extends BundledItem {
   public BundledEGoldenApple(Item.Properties properties) {
     super(properties);
     setRegistryName(location("bundled_enchanted_golden_apples"));
   }
   @OnlyIn(Dist.CLIENT)
   public boolean hasEffect(ItemStack stack) {
     return true;
   }
   
   public void processUncraftPacket(ServerPlayerEntity playerIn) {
     uncraft(playerIn, Items.ENCHANTED_GOLDEN_APPLE, Items.BOWL, 8, 1);
   }
   private static ResourceLocation location(String name) {
     return new ResourceLocation("bundleditems", name);
   }
 }
