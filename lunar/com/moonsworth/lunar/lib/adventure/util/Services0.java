package com.moonsworth.lunar.lib.adventure.util;

import java.util.ServiceLoader;

final class Services0 {
   private Services0() {
   }

   static <S> ServiceLoader<S> loader(Class<S> var0) {
      return ServiceLoader.load(var0, var0.getClassLoader());
   }
}
