package com.Phwaa.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Phwaa.testmod.blocks.BlockBase;
import com.Phwaa.testmod.blocks.LapisIngotBlock;
import com.Phwaa.testmod.blocks.machines.BlockLapisFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block LAPIS_INGOT_BLOCK = new LapisIngotBlock("lapis_ingot_block", Material.IRON);
	public static final Block LAPRILLIUM_BLOCK = new BlockBase("laprillium_block", Material.IRON);
	
	public static final Block LAPIS_FURNACE = new BlockLapisFurnace("lapis_furnace", Material.IRON);

}
