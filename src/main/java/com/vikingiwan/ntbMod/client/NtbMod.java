package com.vikingiwan.ntbMod.client;
import com.vikingiwan.ntbMod.init.ntbBlocks;
import com.vikingiwan.ntbMod.init.ntbItems;
import com.vikingiwan.ntbMod.init.ntbTab;
import com.vikingiwan.ntbMod.proxy.CommonProxy;

import jline.internal.Log;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class NtbMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide =  Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static ntbTab tabNTB = new ntbTab(Reference.GetNextAvailableTabIndex(), "tabNTB");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Log.info(Reference.LOG_PREF + "Hello MineCraft!");
		ntbItems.init();
		ntbItems.register();
		ntbBlocks.init();
		ntbBlocks.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		Log.info(Reference.LOG_PREF + "Getting some things ready...");
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Log.info(Reference.LOG_PREF + "Ok, we're ready, Have fun!");
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		
	}
}
