package com.vikingiwan.ntbMod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ntbTab extends CreativeTabs {
	
	public ntbTab(int index, String label) {
		super(index, label);
		//this.setBackgroundImageName("Ntbmod.png");
		
	}

	@Override
	public Item getTabIconItem() {
		return ntbItems.cage_coin;
		
	}

}
