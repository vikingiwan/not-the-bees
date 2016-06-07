package com.vikingiwan.ntbMod.proxy;

import com.vikingiwan.ntbMod.init.ntbItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		ntbItems.registerRenders();
	}
}
