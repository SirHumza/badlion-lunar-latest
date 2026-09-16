package com.lunarclient.apollo.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import lombok.Generated;

final class ReflectiveConsumer<T extends Event> implements Consumer<T> {
   private final Object instance;
   private final Method method;

   ReflectiveConsumer(Object var1, Method var2) {
      this.instance = var1;
      this.method = var2;
      var2.setAccessible(true);
   }

   public void accept(T var1) {
      try {
         this.method.invoke(this.instance, var1);
      } catch (IllegalAccessException | InvocationTargetException var3) {
         var3.printStackTrace();
      }
   }

   @Generated
   public Object getInstance() {
      return this.instance;
   }
}
