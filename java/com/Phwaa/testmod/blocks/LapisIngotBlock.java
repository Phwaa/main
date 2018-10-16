package com.Phwaa.testmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LapisIngotBlock extends BlockBase
{

	public LapisIngotBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(60.0F);
		setHarvestLevel("pickaxe", 2);
	//	setLightLevel(0.0F);
	//	setLightOpacity(0);
	//	setBlockUnbreakable();
		
	}
	

}
