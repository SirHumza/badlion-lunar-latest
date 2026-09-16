package com.moonsworth.lunar.ichor.util;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class IOIICIRIICICIIOORHCIIIIRRIHRHI<K, V> extends LinkedHashMap<K, V> {
   private final int RRIRIROHIIRIIROCCHOROORHIOHHIO;

   public IOIICIRIICICIIOORHCIIIIRRIHRHI(int var1) {
      super(var1);
      this.RRIRIROHIIRIIROCCHOROORHIOHHIO = var1;
   }

   @Override
   protected boolean removeEldestEntry(Entry<K, V> var1) {
      return this.size() > this.RRIRIROHIIRIIROCCHOROORHIOHHIO;
   }
}
