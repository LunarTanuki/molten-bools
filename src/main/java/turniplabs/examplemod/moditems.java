package turniplabs.examplemod;


import net.minecraft.core.item.tag.ItemTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.*;
import turniplabs.halplibe.helper.ItemHelper;

public class moditems {


	public static void register(){}
	public static final ToolMaterial molten =
		(new ToolMaterial()).setDurability(100).setEfficiency(8.0F, 43.0F).setMiningLevel(2);


	public static final Item swordMolten = ItemHelper.createItem("examplemod", new ItemToolSword("sword.molten", 1150, molten), "sword.molten", "assets.examplemod.item/swordMolten.png").setMaxStackSize(1).withTags(ItemTags.preventCreativeMining);



}

