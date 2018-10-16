package com.Phwaa.testmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() {
		GameRegistry.addSmelting(ModItems.LAPIS_INGOT, new ItemStack(ModBlocks.LAPIS_INGOT_BLOCK, 1), 1.5f);
	}

}
