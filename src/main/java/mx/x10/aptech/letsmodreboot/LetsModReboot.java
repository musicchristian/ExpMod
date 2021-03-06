package mx.x10.aptech.letsmodreboot;

import mx.x10.aptech.letsmodreboot.handler.ConfigurationHandler;
import mx.x10.aptech.letsmodreboot.init.ModBlocks;
import mx.x10.aptech.letsmodreboot.init.ModItems;
import mx.x10.aptech.letsmodreboot.proxy.IProxy;
import mx.x10.aptech.letsmodreboot.reference.Reference;
import mx.x10.aptech.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {
	
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) { // Items and Blocks
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		ModItems.init();
		ModBlocks.init();
		
		LogHelper.info("Pre Initialization Complete");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) { // GUI, TileEntity, Recipes
		LogHelper.info("Initialization Complete");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) { // Finish Up
		LogHelper.info("Post Initialization Complete");
	}
	
}