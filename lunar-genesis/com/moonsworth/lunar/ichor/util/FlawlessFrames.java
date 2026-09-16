package com.moonsworth.lunar.ichor.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

@OOROOCCIRCCRHOIOIORIHCHHOOCCOR
public class FlawlessFrames {
   private static final List<Consumer<Boolean>> consumers = new ArrayList<>();
   private static boolean enabled;

   public static void register(Function<String, Consumer<Boolean>> var0) {
      consumers.add((Consumer<Boolean>)var0.apply("lunar"));
   }

   public static void set(boolean var0) {
      if (enabled != var0) {
         enabled = var0;

         for (Consumer var2 : consumers) {
            var2.accept(var0);
         }
      }
   }

   public static boolean get() {
      return enabled;
   }
}
