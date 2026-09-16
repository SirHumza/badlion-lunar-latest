package com.llamalad7.mixinextras.utils;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class UniquenessHelper {
   public static String getUniqueMethodName(ClassNode var0, String var1) {
      int var2 = var0.methods.size();

      while (true) {
         String var3 = var1 + '$' + var2;
         boolean var4 = true;

         for (MethodNode var6 : var0.methods) {
            if (var6.name.equals(var3)) {
               var4 = false;
               break;
            }
         }

         if (var4) {
            return var3;
         }

         var2++;
      }
   }
}
