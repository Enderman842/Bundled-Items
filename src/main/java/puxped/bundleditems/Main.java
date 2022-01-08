 package puxped.bundleditems;
 
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import puxped.bundleditems.items.BundledAcaciaSaplings;
import puxped.bundleditems.items.BundledAlliums;
import puxped.bundleditems.items.BundledApples;
import puxped.bundleditems.items.BundledArrows;
import puxped.bundleditems.items.BundledAzureBluets;
import puxped.bundleditems.items.BundledBakedPotatoes;
import puxped.bundleditems.items.BundledBirchSaplings;
import puxped.bundleditems.items.BundledBlazePowder;
import puxped.bundleditems.items.BundledBlazeRods;
import puxped.bundleditems.items.BundledBlueOrchids;
import puxped.bundleditems.items.BundledBones;
import puxped.bundleditems.items.BundledBooks;
import puxped.bundleditems.items.BundledBowls;
import puxped.bundleditems.items.BundledBread;
import puxped.bundleditems.items.BundledBricks;
import puxped.bundleditems.items.BundledBuckets;
import puxped.bundleditems.items.BundledCarrots;
import puxped.bundleditems.items.BundledChorusFruits;
import puxped.bundleditems.items.BundledClayBalls;
import puxped.bundleditems.items.BundledCod;
import puxped.bundleditems.items.BundledCookedBeef;
import puxped.bundleditems.items.BundledCookedChicken;
import puxped.bundleditems.items.BundledCookedCod;
import puxped.bundleditems.items.BundledCookedMutton;
import puxped.bundleditems.items.BundledCookedPorkchop;
import puxped.bundleditems.items.BundledCookedRabbit;
import puxped.bundleditems.items.BundledCookedSalmon;
import puxped.bundleditems.items.BundledCookies;
import puxped.bundleditems.items.BundledCornflowers;
import puxped.bundleditems.items.BundledDandelions;
import puxped.bundleditems.items.BundledDarkOakSaplings;
import puxped.bundleditems.items.BundledEGoldenApple;
import puxped.bundleditems.items.BundledEmptyBottles;
import puxped.bundleditems.items.BundledFeathers;
import puxped.bundleditems.items.BundledFireworks;
import puxped.bundleditems.items.BundledFlints;
import puxped.bundleditems.items.BundledGlowstoneDust;
import puxped.bundleditems.items.BundledGoldenApples;
import puxped.bundleditems.items.BundledGoldenCarrots;
import puxped.bundleditems.items.BundledGunpowder;
import puxped.bundleditems.items.BundledJungleSaplings;
import puxped.bundleditems.items.BundledLeather;
import puxped.bundleditems.items.BundledLilliesOfTheValley;
import puxped.bundleditems.items.BundledNameTags;
import puxped.bundleditems.items.BundledNetherStars;
import puxped.bundleditems.items.BundledNetherWarts;
import puxped.bundleditems.items.BundledNetherbricks;
import puxped.bundleditems.items.BundledOakSaplings;
import puxped.bundleditems.items.BundledOrangeTulips;
import puxped.bundleditems.items.BundledOxeyeDaisies;
import puxped.bundleditems.items.BundledPaper;
import puxped.bundleditems.items.BundledPinkTulips;
import puxped.bundleditems.items.BundledPoppedChorusFruits;
import puxped.bundleditems.items.BundledPoppies;
import puxped.bundleditems.items.BundledPorkchop;
import puxped.bundleditems.items.BundledRawBeef;
import puxped.bundleditems.items.BundledRawChicken;
import puxped.bundleditems.items.BundledRawMutton;
import puxped.bundleditems.items.BundledRawPotatoes;
import puxped.bundleditems.items.BundledRawRabbit;
import puxped.bundleditems.items.BundledRedTulips;
import puxped.bundleditems.items.BundledRedstone;
import puxped.bundleditems.items.BundledRottenFlesh;
import puxped.bundleditems.items.BundledSalmon;
import puxped.bundleditems.items.BundledSeeds;
import puxped.bundleditems.items.BundledSlimeballs;
import puxped.bundleditems.items.BundledSnowballs;
import puxped.bundleditems.items.BundledSpruceSaplings;
import puxped.bundleditems.items.BundledSticks;
import puxped.bundleditems.items.BundledString;
import puxped.bundleditems.items.BundledSugar;
import puxped.bundleditems.items.BundledSugarCane;
import puxped.bundleditems.items.BundledVines;
import puxped.bundleditems.items.BundledWhiteTulips;
import puxped.bundleditems.items.BundledWitherRoses;
import puxped.bundleditems.network.PacketHandler;
import puxped.bundleditems.network.UncraftingPacket;

 import org.apache.logging.log4j.LogManager;
 import org.apache.logging.log4j.Logger;
 
 @Mod("bundleditems")
 public class Main {
   public static Main instance;
   public static final Logger logger = LogManager.getLogger("bundleditems"); public static final String MOD_ID = "bundleditems";
   public static final ItemGroup bundleditems = new CTab();
   
   public Main() {
     instance = this;
     FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
     FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
     MinecraftForge.EVENT_BUS.register(this);
   }
   private void setup(FMLCommonSetupEvent event) {
     PacketHandler.INSTANCE.registerMessage(0, UncraftingPacket.class, UncraftingPacket::encode, UncraftingPacket::new, UncraftingPacket::handle);
   }
   
   private void clientRegistries(FMLClientSetupEvent event) {}
   
   @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
   public static class RegistryEvents
   {
     @SubscribeEvent
     public static void registerItems(RegistryEvent.Register<Item> event) {
       event.getRegistry().registerAll(new Item[] {
             
             BItems.secret_item = (Item)(new Item((new Item.Properties()).group(null))).setRegistryName(location("secret_item")), 
             BItems.bundled_oak_saplings = (Item)(new BundledOakSaplings((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_oak_saplings")), 
             BItems.bundled_spruce_saplings = (Item)(new BundledSpruceSaplings((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_spruce_saplings")), 
             BItems.bundled_birch_saplings = (Item)(new BundledBirchSaplings((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_birch_saplings")), 
             BItems.bundled_jungle_saplings = (Item)(new BundledJungleSaplings((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_jungle_saplings")), 
             BItems.bundled_acacia_saplings = (Item)(new BundledAcaciaSaplings((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_acacia_saplings")), 
             BItems.bundled_dark_oak_saplings = (Item)(new BundledDarkOakSaplings((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_dark_oak_saplings")), 
             BItems.bundled_dandelions = (Item)(new BundledDandelions((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_dandelions")), 
             BItems.bundled_poppies = (Item)(new BundledPoppies((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_poppies")), 
             BItems.bundled_blue_orchids = (Item)(new BundledBlueOrchids((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_blue_orchids")), 
             BItems.bundled_alliums = (Item)(new BundledAlliums((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_alliums")), 
             BItems.bundled_azure_bluets = (Item)(new BundledAzureBluets((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_azure_bluets")), 
             BItems.bundled_red_tulips = (Item)(new BundledRedTulips((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_red_tulips")), 
             BItems.bundled_orange_tulips = (Item)(new BundledOrangeTulips((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_orange_tulips")), 
             BItems.bundled_white_tulips = (Item)(new BundledWhiteTulips((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_white_tulips")), 
             BItems.bundled_pink_tulips = (Item)(new BundledPinkTulips((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_pink_tulips")), 
             BItems.bundled_oxeye_daisies = (Item)(new BundledOxeyeDaisies((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_oxeye_daisies")), 
             BItems.bundled_cornflowers = (Item)(new BundledCornflowers((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cornflowers")), 
             BItems.bundled_lilies_of_the_valley = (Item)(new BundledLilliesOfTheValley((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_lilies_of_the_valley")), 
             BItems.bundled_wither_roses = (Item)(new BundledWitherRoses((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_wither_roses")),
             BItems.bundled_vines = (Item)(new BundledVines((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_vines")), 
             BItems.bundled_apples = (Item)(new BundledApples((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_apples")), 
             BItems.bundled_golden_apples = (Item)(new BundledGoldenApples((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_golden_apples")), 
             (Item)(BItems.bundled_enchanted_golden_apple = new BundledEGoldenApple((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))), 
             BItems.quiver = (Item)(new Item((new Item.Properties()).group(Main.bundleditems))).setRegistryName(location("quiver")), 
             BItems.bundled_arrows = (Item)(new BundledArrows((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_arrows")), 
             BItems.bundled_bones = (Item)(new BundledBones((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_bones")), 
             BItems.bundled_sticks = (Item)(new BundledSticks((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_sticks")), 
             BItems.bundled_blaze_rods = (Item)(new BundledBlazeRods((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_blaze_rods")), 
             BItems.bundled_bowls = (Item)(new BundledBowls((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_bowls")), 
             BItems.bundled_snowballs = (Item)(new BundledSnowballs((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_snowballs")), 
             BItems.bundled_slimeballs = (Item)(new BundledSlimeballs((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_slimeballs")), 
             BItems.bundled_blaze_powder = (Item)(new BundledBlazePowder((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_blaze_powder")), 
             BItems.bundled_clay_balls = (Item)(new BundledClayBalls((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_clay_balls")), 
             BItems.bundled_nether_warts = (Item)(new BundledNetherWarts((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_nether_warts")), 
             BItems.bundled_string = (Item)(new BundledString((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_string")), 
             BItems.bundled_feathers = (Item)(new BundledFeathers((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_feathers")), 
             BItems.bundled_empty_bottles = (Item)(new BundledEmptyBottles((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_empty_bottles")), 
             BItems.bundled_water_bottles = (Item)(new Item((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_water_bottles")), 
             BItems.small_bottle = (Item)(new Item((new Item.Properties()).group(Main.bundleditems))).setRegistryName(location("small_bottle")), 
             BItems.bundled_glowstone_dust = (Item)(new BundledGlowstoneDust((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_glowstone_dust")), 
             BItems.bundled_gunpowder = (Item)(new BundledGunpowder((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_gunpowder")), 
             BItems.bundled_redstone = (Item)(new BundledRedstone((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_redstone")), 
             BItems.bundled_sugar = (Item)(new BundledSugar((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_sugar")), 
             BItems.bundled_seeds = (Item)(new BundledSeeds((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_seeds")), 
             BItems.bundled_bread = (Item)(new BundledBread((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_bread")), 
             BItems.bundled_flints = (Item)(new BundledFlints((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_flints")), 
             BItems.bundled_buckets = (Item)(new BundledBuckets((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_buckets")), 
             BItems.bundled_name_tags = (Item)(new BundledNameTags((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_name_tags")), 
             BItems.bundled_porkchop = (Item)(new BundledPorkchop((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_porkchop")), 
             BItems.bundled_cooked_porkchop = (Item)(new BundledCookedPorkchop((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cooked_porkchop")), 
             BItems.bundled_raw_beef = (Item)(new BundledRawBeef((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_raw_beef")), 
             BItems.bundled_cooked_beef = (Item)(new BundledCookedBeef((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cooked_beef")), 
             BItems.bundled_raw_chicken = (Item)(new BundledRawChicken((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_raw_chicken")), 
             BItems.bundled_cooked_chicken = (Item)(new BundledCookedChicken((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cooked_chicken")), 
             BItems.bundled_raw_mutton = (Item)(new BundledRawMutton((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_raw_mutton")), 
             BItems.bundled_cooked_mutton = (Item)(new BundledCookedMutton((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cooked_mutton")), 
             BItems.bundled_raw_rabbit = (Item)(new BundledRawRabbit((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_raw_rabbit")), 
             BItems.bundled_cooked_rabbit = (Item)(new BundledCookedRabbit((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cooked_rabbit")), 
             BItems.bundled_rotten_flesh = (Item)(new BundledRottenFlesh((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_rotten_flesh")), 
             BItems.bundled_leather = (Item)(new BundledLeather((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_leather")), 
             BItems.bundled_bricks = (Item)(new BundledBricks((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_bricks")), 
             BItems.bundled_netherbricks = (Item)(new BundledNetherbricks((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_netherbricks")), 
             BItems.bundled_sugar_cane = (Item)(new BundledSugarCane((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_sugar_cane")), 
             BItems.bundled_paper = (Item)(new BundledPaper((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_paper")), 
             BItems.bundled_books = (Item)(new BundledBooks((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_books")), 
             BItems.bundled_cod = (Item)(new BundledCod((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cod")), 
             BItems.bundled_salmon = (Item)(new BundledSalmon((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_salmon")), 
             BItems.bundled_cooked_cod = (Item)(new BundledCookedCod((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cooked_cod")), 
             BItems.bundled_cooked_salmon = (Item)(new BundledCookedSalmon((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cooked_salmon")), 
             BItems.bundled_cookies = (Item)(new BundledCookies((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_cookies")), 
             BItems.bundled_carrots = (Item)(new BundledCarrots((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_carrots")), 
             BItems.bundled_golden_carrots = (Item)(new BundledGoldenCarrots((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_golden_carrots")), 
             BItems.bundled_raw_potatoes = (Item)(new BundledRawPotatoes((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_potatoes")), 
             BItems.bundled_baked_potatoes = (Item)(new BundledBakedPotatoes((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_baked_potatoes")), 
             (Item)(BItems.bundled_nether_stars = new BundledNetherStars((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))), 
             BItems.bundled_fireworks = (Item)(new BundledFireworks((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_fireworks")), 
             BItems.bundled_chorus_fruits = (Item)(new BundledChorusFruits((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_chorus_fruits")), 
             BItems.bundled_popped_chorus_fruits = (Item)(new BundledPoppedChorusFruits((new Item.Properties()).maxStackSize(32).group(Main.bundleditems))).setRegistryName(location("bundled_popped_chorus_fruits"))
           });
     }
     
     private static ResourceLocation location(String name) {
       return new ResourceLocation("bundleditems", name);
     }
   }
 }
