package turniplabs.examplemod;


import net.minecraft.core.block.Block;
import net.minecraft.core.item.tag.ItemTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.*;
import turniplabs.halplibe.helper.ItemHelper;

public class ModItems {
	public static final ToolMaterial molten =
		(new ToolMaterial()).setDurability(100).setEfficiency(8.0F, 43.0F).setMiningLevel(2);
	public static final Item swordMolten = ItemHelper.createItem(ExampleMod.MOD_ID, new ItemToolSword("sword.molten", Block.blocksList.length + 3000, molten), "sword.molten", "swordMolten.png").setMaxStackSize(1).withTags(ItemTags.preventCreativeMining);


	public static void register(){}







}

