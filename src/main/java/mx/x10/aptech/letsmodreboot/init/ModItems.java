package mx.x10.aptech.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import mx.x10.aptech.letsmodreboot.item.ItemLMR;
import mx.x10.aptech.letsmodreboot.item.ItemObsStick;
import mx.x10.aptech.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	
	public static final ItemLMR itemObsStick = new ItemObsStick();
	
	public static void init() {
		GameRegistry.registerItem(itemObsStick, "obsStick");
	}
	
}
