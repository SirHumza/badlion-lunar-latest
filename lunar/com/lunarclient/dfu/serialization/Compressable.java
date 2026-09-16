package com.lunarclient.dfu.serialization;

public interface Compressable extends Keyable {
   <T> KeyCompressor<T> compressor(DynamicOps<T> var1);
}
