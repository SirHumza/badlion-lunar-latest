package com.moonsworth.webosr.handler;

import com.moonsworth.webosr.wrappers.Browser;
import com.moonsworth.webosr.wrappers.PromiseJS;

@FunctionalInterface
public interface FunctionJS {
   void invoke(PromiseJS<?> var1, Browser var2, String var3, String[] var4);
}
