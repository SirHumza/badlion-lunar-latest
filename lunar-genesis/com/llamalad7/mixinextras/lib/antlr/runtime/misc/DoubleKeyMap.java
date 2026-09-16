package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

import java.util.LinkedHashMap;
import java.util.Map;

public class DoubleKeyMap<Key1, Key2, Value> {
   Map<Key1, Map<Key2, Value>> data = new LinkedHashMap<>();

   public Value put(Key1 var1, Key2 var2, Value var3) {
      Map var4 = this.data.get(var1);
      Object var5 = null;
      if (var4 == null) {
         var4 = new LinkedHashMap();
         this.data.put((Key1)var1, var4);
      } else {
         var5 = var4.get(var2);
      }

      var4.put(var2, var3);
      return (Value)var5;
   }

   public Value get(Key1 var1, Key2 var2) {
      Map var3 = this.data.get(var1);
      return (Value)(var3 == null ? null : var3.get(var2));
   }
}
