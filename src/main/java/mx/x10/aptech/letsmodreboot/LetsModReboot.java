package mx.x10.aptech.letsmodreboot;

import mx.x10.aptech.letsmodreboot.configuration.ConfigurationHandler;
import mx.x10.aptech.letsmodreboot.proxy.IProxy;
import mx.x10.aptech.letsmodreboot.proxy.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsModReboot {
	
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) { // Items and Blocks
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) { // GUI, TileEntity, Recipes
	
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) { // Finish Up
	
	}
	
}