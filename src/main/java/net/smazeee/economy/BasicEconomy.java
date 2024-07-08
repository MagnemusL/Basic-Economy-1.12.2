package net.smazeee.economy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.smazeee.economy.events.ModEvents;
import net.smazeee.economy.proxy.ClientProxy;
import net.smazeee.economy.proxy.CommonProxy;
import net.smazeee.economy.registry.ItemRegistry;
import net.smazeee.economy.util.interfaces.IProxy;
import org.apache.logging.log4j.Logger;

@Mod(modid = BasicEconomy.MODID, name = BasicEconomy.NAME, version = BasicEconomy.VERSION)
public class BasicEconomy {
    public static final String MODID = "economy";
    public static final String NAME = "Basic Economy";
    public static final String VERSION = "1.0";

    public static final String CLIENT_PROXY = "net.smazeee.economy.proxy.ClientProxy";
    public static final String COMMON_PROXY = "net.smazeee.economy.proxy.CommonProxy";
    public static final int CENTRAL_BANK_GUI = 2;

    //I got the logs in my loggers logging all my logs
    private static Logger logger;

    public static final CreativeTabs BASIC_ECONOMY = new CreativeTabs(CreativeTabs.getNextID(), "basic_economy")  {

        public ItemStack getTabIconItem() {
            return new ItemStack(ItemRegistry.GOLD_COIN);
        }
    };

    @Instance
    public static BasicEconomy instance;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = COMMON_PROXY)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(NAME + " initialized.");
        MinecraftForge.EVENT_BUS.register(new ModEvents());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @EventHandler
    public void serverInit(FMLServerStartingEvent event) {

    }
}
