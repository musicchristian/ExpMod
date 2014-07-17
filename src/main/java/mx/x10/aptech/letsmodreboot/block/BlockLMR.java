package mx.x10.aptech.letsmodreboot.block;

import mx.x10.aptech.letsmodreboot.creativetab.CreativeTabLMR;
import mx.x10.aptech.letsmodreboot.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLMR extends Block {
	
	public BlockLMR(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabLMR.LMR_TAB);
	}
	
	public BlockLMR() {
		this(Material.rock);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
}