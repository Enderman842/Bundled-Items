 package puxped.bundleditems.network;
 
 import net.minecraft.util.ResourceLocation;
 import net.minecraftforge.fml.network.NetworkRegistry;
 import net.minecraftforge.fml.network.simple.SimpleChannel;
 
 
 public class PacketHandler
 {
   @SuppressWarnings("unused")
private static final String NETWORK_PROTOCOL_VERSION = "1";
   public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation("bundleditems", "main"), () -> "1", "1"::equals, "1"::equals);
 }
