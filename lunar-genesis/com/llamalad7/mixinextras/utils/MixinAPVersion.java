package com.llamalad7.mixinextras.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import javax.annotation.processing.ProcessingEnvironment;
import javax.tools.Diagnostic.Kind;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.spongepowered.asm.util.VersionNumber;

public class MixinAPVersion {
   private static final String MIN_VERSION = "0.8.3";
   private static final VersionNumber MIN_VERSION_NUMBER = VersionNumber.parse("0.8.3");
   private static final String BOOTSTRAP_ClASS = "org/spongepowered/asm/launch/MixinBootstrap.class";
   private static boolean checked = false;

   public static void check(ProcessingEnvironment var0) {
      if (!checked) {
         checked = true;

         try {
            InputStream var1 = findBootstrapClass();

            label73: {
               label79: {
                  try {
                     if (var1 == null) {
                        printFailed(var0);
                        break label79;
                     }

                     ClassNode var2 = new ClassNode();
                     new ClassReader(var1).accept(var2, 1);
                     VersionNumber var3 = getBootstrapVersion(var2);
                     if (var3 == null) {
                        printFailed(var0);
                        break label73;
                     }

                     if (var3.compareTo(MIN_VERSION_NUMBER) < 0) {
                        throw new IllegalStateException("MixinExtras requires the Mixin AP to be at least 0.8.3");
                     }
                  } catch (Throwable var5) {
                     if (var1 != null) {
                        try {
                           var1.close();
                        } catch (Throwable var4) {
                           var5.addSuppressed(var4);
                        }
                     }

                     throw var5;
                  }

                  if (var1 != null) {
                     var1.close();
                  }

                  return;
               }

               if (var1 != null) {
                  var1.close();
               }

               return;
            }

            if (var1 != null) {
               var1.close();
            }
         } catch (IOException var6) {
            printFailed(var0);
         }
      }
   }

   private static VersionNumber getBootstrapVersion(ClassNode var0) {
      for (FieldNode var2 : var0.fields) {
         if (var2.name.equals("VERSION")) {
            if (!(var2.value instanceof String)) {
               return null;
            }

            return VersionNumber.parse((String)var2.value);
         }
      }

      return null;
   }

   private static void printFailed(ProcessingEnvironment var0) {
      var0.getMessager().printMessage(Kind.WARNING, "[MixinExtras] Failed to determine Mixin version. Assuming >=0.8.3");
   }

   private static InputStream findBootstrapClass() {
      Enumeration var0 = MixinAPVersion.class.getClassLoader().getResources("org/spongepowered/asm/launch/MixinBootstrap.class");
      return !var0.hasMoreElements() ? null : ((URL)var0.nextElement()).openStream();
   }
}
