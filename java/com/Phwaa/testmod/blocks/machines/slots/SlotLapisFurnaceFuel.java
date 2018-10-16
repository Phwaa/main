package com.Phwaa.testmod.blocks.machines.slots;

import com.Phwaa.testmod.blocks.machines.TileEntityLapisFurnace;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotLapisFurnaceFuel extends Slot
{
	public SlotLapisFurnaceFuel(IInventory inventory, int index, int x, int y)
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityLapisFurnace.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack)
	{
		return super.getItemStackLimit(stack);
	}

}
