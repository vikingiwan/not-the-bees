package com.vikingiwan.ntbMod.block;

import java.util.Random;

import javax.annotation.Nullable;

import com.vikingiwan.ntbMod.client.NtbMod;
import com.vikingiwan.ntbMod.init.ntbItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.MathHelper;

public class BlockCageOre extends Block{

	public BlockCageOre(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("cage_ore");
		this.setCreativeTab(NtbMod.tabNTB);
		this.setHardness(5.0f);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.5625f);
		this.setLightOpacity(16);
		this.setResistance(1.5f);
		this.setSoundType(SoundType.STONE);
	}
	
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return MathHelper.clamp_int(1 + random.nextInt(fortune + 1), 1, 4);
	}
	    
	/**
	public int quantityDropped(Random random) {
			return 2 + random.nextInt(3);
	}
	*/
	    
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return ntbItems.cage_coin;
	}
	    
	public MapColor getMapColor(IBlockState state) {
			return MapColor.GOLD;
	}
		

}
