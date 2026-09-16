package com.llamalad7.mixinextras.injector;

public class MixinExtrasHooks {
   public static StringBuilder replaceContents(StringBuilder var0, String var1) {
      return var0.replace(0, var0.length(), var1);
   }
}
