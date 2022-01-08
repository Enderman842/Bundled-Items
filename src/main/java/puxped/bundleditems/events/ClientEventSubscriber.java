 package puxped.bundleditems.events;
 
 import net.minecraft.client.Minecraft;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.api.distmarker.Dist;
 import net.minecraftforge.client.event.InputEvent;
 import net.minecraftforge.eventbus.api.SubscribeEvent;
 import net.minecraftforge.fml.common.Mod;
 import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import puxped.bundleditems.network.PacketHandler;
import puxped.bundleditems.network.UncraftingPacket;
 
 
 
 
 @EventBusSubscriber(modid = "bundleditems", bus = Mod.EventBusSubscriber.Bus.FORGE, value = {Dist.CLIENT})
 public class ClientEventSubscriber
 {
   @SubscribeEvent
   public static void onKeyPressed(InputEvent.MouseInputEvent event) {
     if ((Minecraft.getInstance()).player != null) {
       ItemStack itemStack = (Minecraft.getInstance()).player.getHeldItemMainhand();
       if (event.getButton() == 1 && event.getMods() == 1 && 
         itemStack.getItem() instanceof puxped.bundleditems.items.BundledItem)
         PacketHandler.INSTANCE.sendToServer(new UncraftingPacket()); 
     } 
   }
 }
