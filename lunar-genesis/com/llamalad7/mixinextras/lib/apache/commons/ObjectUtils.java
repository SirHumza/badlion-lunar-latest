package com.llamalad7.mixinextras.lib.apache.commons;

import java.io.Serializable;

public class ObjectUtils {
   public static final ObjectUtils.Null NULL = new ObjectUtils.Null();

   @Deprecated
   public static boolean equals(Object var0, Object var1) {
      if (var0 == var1) {
         return true;
      } else {
         return var0 != null && var1 != null ? var0.equals(var1) : false;
      }
   }

   @Override
   public String toString() {
      return super.toString();
   }

   public static class Null implements Serializable {
      Null() {
      }
   }
}
