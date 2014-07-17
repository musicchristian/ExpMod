package mx.x10.aptech.letsmodreboot.creativetab;

import mx.x10.aptech.letsmodreboot.init.ModItems;
import mx.x10.aptech.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMR {
	
	public static final CreativeTabs LMR_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		
		@Override
		public Item getTabIconItem() {
			return ModItems.itemObsStick;
		}
		
	};
	
}
