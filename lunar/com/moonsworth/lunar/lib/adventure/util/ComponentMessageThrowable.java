package com.moonsworth.lunar.lib.adventure.util;

import com.moonsworth.lunar.lib.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

public interface ComponentMessageThrowable {
   @Nullable
   static Component getMessage(@Nullable Throwable var0) {
      return var0 instanceof ComponentMessageThrowable ? ((ComponentMessageThrowable)var0).componentMessage() : null;
   }

   @Nullable
   static Component getOrConvertMessage(@Nullable Throwable var0) {
      if (var0 instanceof ComponentMessageThrowable) {
         return ((ComponentMessageThrowable)var0).componentMessage();
      }

      if (var0 != null) {
         String var1 = var0.getMessage();
         if (var1 != null) {
            return Component.text(var1);
         }
      }

      return null;
   }

   @Nullable
   Component componentMessage();
}
