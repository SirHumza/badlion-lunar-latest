package com.moonsworth.lunar.ichor.util;

import java.util.Optional;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.objectweb.asm.ClassWriter;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI extends ClassWriter {
   private final ClassLoader classLoader;
   private static final String HIHIOCCICCRICRORIOHOHOCIRHRCRO = "java/lang/Object";

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI(ClassLoader var1, int var2) {
      super(var2);
      this.classLoader = var1;
   }

   @Override
   protected ClassLoader getClassLoader() {
      return this.classLoader;
   }

   @Override
   protected String getCommonSuperClass(String var1, String var2) {
      if (var1.equals(var2)) {
         return var1;
      }

      if (this.classLoader instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3) {
         InheritanceProvider var11 = var3.HOIIOIHICHOCHRCICHOIOOCCCOOCRH();

         Optional var5;
         Optional var6;
         try {
            var5 = var11.provide(var1);
            var6 = var11.provide(var2);
         } catch (ClassCircularityError var10) {
            System.err.println("CIRCLE?!?!?! " + var1 + " ^ " + var2);
            throw var10;
         }

         if (var5.isPresent() && var6.isPresent()) {
            InheritanceProvider.ClassInfo var7 = (InheritanceProvider.ClassInfo)var5.get();
            InheritanceProvider.ClassInfo var8 = (InheritanceProvider.ClassInfo)var6.get();
            if (var8.hasParent(var7, var11)) {
               System.out.println("LoaderAwareClassWriter.getCommonSuperClass: " + var1 + " ^ " + var2 + " => " + var7.getName());
               return var7.getName();
            }

            if (var7.hasParent(var8, var11)) {
               System.out.println("LoaderAwareClassWriter.getCommonSuperClass: " + var1 + " ^ " + var2 + " => " + var8.getName());
               return var8.getName();
            }

            if (var7.isInterface() || var8.isInterface()) {
               System.out.println("LoaderAwareClassWriter.getCommonSuperClass: " + var1 + " ^ " + var2 + " => obj, they're interfaces");
               return "java/lang/Object";
            }

            String var9 = var7.getName();

            do {
               var9 = var11.provide(var9).map(InheritanceProvider.ClassInfo::getSuperName).filter(var0 -> !var0.isEmpty()).orElse(null);
               System.out.println("LoaderAwareClassWriter.getCommonSuperClass: " + var9);
            } while (var9 != null && !var8.hasParent(var9, var11));

            if (var9 != null) {
               return var9;
            }
         }
      }

      return super.getCommonSuperClass(var1, var2);
   }
}
