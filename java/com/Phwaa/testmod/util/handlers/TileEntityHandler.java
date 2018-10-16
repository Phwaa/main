package com.Phwaa.testmod.util.handlers;

import com.Phwaa.testmod.blocks.machines.TileEntityLapisFurnace;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityLapisFurnace.class, "lapis_furnace");
	}

}
