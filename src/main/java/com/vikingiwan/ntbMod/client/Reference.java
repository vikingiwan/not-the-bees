package com.vikingiwan.ntbMod.client;

import net.minecraft.creativetab.CreativeTabs;

public class Reference {
	
	public static final String MOD_ID = "ntbMod";
	public static final String MOD_NAME = "Not the Bees! Mod";
	public static final String VERSION = "1.0.0";
	public static final String CLIENT_PROXY_CLASS = "com.vikingiwan.ntbMod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.vikingiwan.ntbMod.proxy.CommonProxy";
	
	
	public static final String LOG_PREF = "[NTB MOD] ";
	
	public static int GetNextAvailableTabIndex() {
		return CreativeTabs.CREATIVE_TAB_ARRAY.length;
	}
	
}
