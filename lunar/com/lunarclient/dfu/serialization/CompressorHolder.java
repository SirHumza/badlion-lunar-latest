package com.lunarclient.dfu.serialization;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public abstract class CompressorHolder implements Compressable {
   private final Map<DynamicOps<?>, KeyCompressor<?>> compressors = new Object2ObjectArrayMap();

   @Override
   public <T> KeyCompressor<T> compressor(DynamicOps<T> var1) {
      return (KeyCompressor<T>)this.compressors.computeIfAbsent(var1, var2 -> new KeyCompressor(var1, this.keys(var1)));
   }
}
