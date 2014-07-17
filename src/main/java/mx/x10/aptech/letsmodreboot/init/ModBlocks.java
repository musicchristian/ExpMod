package mx.x10.aptech.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import mx.x10.aptech.letsmodreboot.block.BlockLMR;
import mx.x10.aptech.letsmodreboot.block.BlockOreCopper;
import mx.x10.aptech.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	
	public static final BlockLMR blockOreCopper = new BlockOreCopper();
	
	public static void init() {
		GameRegistry.registerBlock(blockOreCopper, "oreCopper");
	}
	
}