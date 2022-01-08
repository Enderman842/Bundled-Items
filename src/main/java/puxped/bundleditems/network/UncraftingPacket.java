 package puxped.bundleditems.network;
 
import java.util.function.Supplier;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;
import puxped.bundleditems.items.BundledItem;

 public class UncraftingPacket
 {
   public UncraftingPacket(PacketBuffer buffer) {}
   
   public UncraftingPacket() {}
   
   public void encode(PacketBuffer buffer) {}
   
   public void handle(Supplier<NetworkEvent.Context> context) {
     ServerPlayerEntity player = ((NetworkEvent.Context)context.get()).getSender();
     assert player != null;
     Item item = player.getHeldItemMainhand().getItem();
     if (item instanceof BundledItem) {
       ((BundledItem)item).processUncraftPacket(player);
     }
     ((NetworkEvent.Context)context.get()).setPacketHandled(true);
   }
 }
//Thanks very much, idrae_!
