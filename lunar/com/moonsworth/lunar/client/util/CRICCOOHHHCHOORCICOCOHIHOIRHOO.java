package com.moonsworth.lunar.client.util;

import java.util.function.Consumer;

@FunctionalInterface
public interface CRICCOOHHHCHOORCICOCOHIHOIRHOO<T> extends Consumer<T> {
   void acceptWithException(T var1);

   @Override
   default void accept(T var1) {
      try {
         this.acceptWithException((T)var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
