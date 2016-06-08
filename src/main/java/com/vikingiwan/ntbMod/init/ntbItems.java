package com.vikingiwan.ntbMod.init;

import com.vikingiwan.ntbMod.client.NtbMod;
import com.vikingiwan.ntbMod.client.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ntbItems {

	public static Item cage_coin;
	
	public static void init() {
		cage_coin = new Item().setCreativeTab(NtbMod.tabNTB).setMaxStackSize(32).setUnlocalizedName("cage_coin");
	};
	
	public static void register() {
		GameRegistry.registerItem(cage_coin, cage_coin.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(cage_coin);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
