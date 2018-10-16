package com.Phwaa.testmod.init;

import java.util.ArrayList;

import com.Phwaa.testmod.items.ItemBase;
import com.Phwaa.testmod.items.armor.ArmorBase;
import com.Phwaa.testmod.items.tools.ToolAxe;
import com.Phwaa.testmod.items.tools.ToolHoe;
import com.Phwaa.testmod.items.tools.ToolPickaxe;
import com.Phwaa.testmod.items.tools.ToolSpade;
import com.Phwaa.testmod.items.tools.ToolSword;
import com.Phwaa.testmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final ArrayList<Item> ITEMS = new ArrayList<Item>();
	
	//MATERIALS
	public static final ToolMaterial MATERIAL_LAPIS_INGOT = EnumHelper.addToolMaterial("material_lapis_ingot", 3, 3250, 10.0F, 9.0F, 20);
	public static final ArmorMaterial ARMOR_MATERIAL_LAPIS_INGOT = EnumHelper.addArmorMaterial("armor_material_lapis_ingot", Reference.MOD_ID + ":lapis_ingot", 25, 
			new int[] {6, 12, 16, 6}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
			
	
	//ITEMS
	public static final Item LAPIS_INGOT = new ItemBase("lapis_ingot");
	public static final Item LAPRILLIUM_INGOT = new ItemBase("laprillium_ingot");
	
	//TOOLS
//	public static final ItemSword LAPIS_SWORD = new ToolSword("lapis_sword", MATERIAL_LAPIS_INGOT);
//	public static final ItemSpade LAPIS_SHOVEL = new ToolSpade("lapis_spade", MATERIAL_LAPIS_INGOT);
//	public static final ItemPickaxe LAPIS_PICKAXE = new ToolPickaxe("lapis_pickaxe", MATERIAL_LAPIS_INGOT);
//	public static final ItemAxe LAPIS_AXE = new ToolAxe("lapis_axe", MATERIAL_LAPIS_INGOT);
//	public static final ItemHoe LAPIS_HOE = new ToolHoe("lapis_hoe", MATERIAL_LAPIS_INGOT);
	
	//ARMOR
//	public static final Item LAPIS_INGOT_HELMET = new ArmorBase("lapis_ingot_helmet", ARMOR_MATERIAL_LAPIS_INGOT, 1, EntityEquipmentSlot.HEAD);
//	public static final Item LAPIS_INGOT_CHESTPLATE = new ArmorBase("lapis_ingot_chestplate", ARMOR_MATERIAL_LAPIS_INGOT, 1, EntityEquipmentSlot.CHEST);
//	public static final Item LAPIS_INGOT_LEGGINGS = new ArmorBase("lapis_ingot_leggings", ARMOR_MATERIAL_LAPIS_INGOT, 2, EntityEquipmentSlot.LEGS);
//	public static final Item LAPIS_INGOT_BOOTS = new ArmorBase("lapis_ingot_boots", ARMOR_MATERIAL_LAPIS_INGOT, 1, EntityEquipmentSlot.FEET);

}