package com.Phwaa.testmod.items.tools;

import com.Phwaa.testmod.init.ModItems;
import com.Phwaa.testmod.util.IHasModel;
import com.Phwaa.testmod.util.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel
{
	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
