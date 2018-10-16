package com.Phwaa.testmod.util.handlers;

import com.Phwaa.testmod.blocks.machines.ContainerLapisFurnace;
import com.Phwaa.testmod.blocks.machines.GuiLapisFurnace;
import com.Phwaa.testmod.blocks.machines.TileEntityLapisFurnace;
import com.Phwaa.testmod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_LAPIS_FURNACE) return new ContainerLapisFurnace(player.inventory, (TileEntityLapisFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_LAPIS_FURNACE) return new GuiLapisFurnace(player.inventory, (TileEntityLapisFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}
