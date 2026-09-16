package org.spongepowered.include.com.google.common.collect;

import java.lang.reflect.Array;

final class Platform {
   static <T> T[] newArray(T[] var0, int var1) {
      Class var2 = var0.getClass().getComponentType();
      return (T[])((Object[])Array.newInstance(var2, var1));
   }
}
