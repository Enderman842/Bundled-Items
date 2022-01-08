 package puxped.bundleditems;
 import net.minecraft.item.ItemGroup;
 import net.minecraft.item.ItemStack;
 
 public class CTab extends ItemGroup {
   public CTab() {
     super("bundleditems");
     setBackgroundImageName("bundleditems.png");
		     setNoTitle();
   }
   
   public ItemStack createIcon() {
     return new ItemStack(BItems.secret_item);
   }
 }
