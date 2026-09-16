package org.spongepowered.include.com.google.common.collect;

import javax.annotation.Nullable;

public final class Multimaps {
   static boolean equalsImpl(Multimap<?, ?> var0, @Nullable Object var1) {
      if (var1 == var0) {
         return true;
      } else if (var1 instanceof Multimap) {
         Multimap var2 = (Multimap)var1;
         return var0.asMap().equals(var2.asMap());
      } else {
         return false;
      }
   }
}
