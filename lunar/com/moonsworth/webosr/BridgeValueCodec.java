package com.moonsworth.webosr;

@FunctionalInterface
public interface BridgeValueCodec {
   String objectToString(Object var1, Class<?> var2);
}
