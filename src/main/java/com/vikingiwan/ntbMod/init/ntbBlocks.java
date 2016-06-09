package com.vikingiwan.ntbMod.init;


import com.vikingiwan.ntbMod.block.BlockCageOre;
import com.vikingiwan.ntbMod.client.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ntbBlocks {

	public static Block cage_ore;
	
	public static void init() {
		
	}
	
	public static void register() {
		GameRegistry.registerBlock(cage_ore = new BlockCageOre(Material.ROCK), cage_ore.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(cage_ore);
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
