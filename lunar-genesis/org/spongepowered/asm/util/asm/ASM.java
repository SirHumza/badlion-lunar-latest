package org.spongepowered.asm.util.asm;

import java.lang.reflect.Field;
import java.util.jar.Attributes.Name;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.launch.platform.MainAttributes;
import org.spongepowered.asm.util.VersionNumber;

public final class ASM {
   private static int majorVersion = 5;
   private static int minorVersion = 0;
   private static int implMinorVersion = 0;
   private static int patchVersion = 0;
   private static String maxVersion = "FALLBACK";
   private static int maxClassVersion = 50;
   private static int maxClassMajorVersion = 50;
   private static int maxClassMinorVersion = 0;
   private static String maxJavaVersion = "V1.6";
   public static final int API_VERSION = detectVersion();

   private ASM() {
   }

   public static boolean isAtLeastVersion(int var0) {
      return majorVersion >= var0;
   }

   public static boolean isAtLeastVersion(int var0, int var1) {
      return majorVersion >= var0 && (majorVersion > var0 || implMinorVersion >= var1);
   }

   public static boolean isAtLeastVersion(int var0, int var1, int var2) {
      return majorVersion != var0 ? majorVersion > var0 : implMinorVersion >= var1 && (implMinorVersion > var1 || patchVersion >= var2);
   }

   public static int getApiVersionMajor() {
      return majorVersion;
   }

   public static int getApiVersionMinor() {
      return minorVersion;
   }

   public static String getApiVersionString() {
      return String.format("%d.%d", majorVersion, minorVersion);
   }

   public static String getVersionString() {
      return String.format("ASM %d.%d%s (%s)", majorVersion, implMinorVersion, patchVersion > 0 ? "." + patchVersion : "", maxVersion);
   }

   public static int getMaxSupportedClassVersion() {
      return maxClassVersion;
   }

   public static int getMaxSupportedClassVersionMajor() {
      return maxClassMajorVersion;
   }

   public static int getMaxSupportedClassVersionMinor() {
      return maxClassMinorVersion;
   }

   public static String getClassVersionString() {
      return String.format("Up to Java %s (class file version %d.%d)", maxJavaVersion, maxClassMajorVersion, maxClassMinorVersion);
   }

   private static int detectVersion() {
      int var0 = 262144;
      VersionNumber var1 = getPackageVersion(Opcodes.class);

      for (Field var5 : Opcodes.class.getDeclaredFields()) {
         if (var5.getType() == int.class) {
            try {
               String var6 = var5.getName();
               int var7 = var5.getInt(null);
               if (var6.startsWith("ASM")) {
                  int var8 = var7 >> 8 & 0xFF;
                  int var9 = var7 >> 16 & 0xFF;
                  boolean var10 = (var7 >> 24 & 0xFF) != 0;
                  if (var9 >= majorVersion) {
                     maxVersion = var6;
                     if (!var10) {
                        var0 = var7;
                        majorVersion = var9;
                        implMinorVersion = var8;
                        minorVersion = var8;
                        if (var1.getMajor() == var9 && var8 == 0) {
                           implMinorVersion = var1.getMinor();
                           patchVersion = var1.getPatch();
                        }
                     }
                  }
               } else if (var6.matches("V([0-9_]+)")) {
                  int var12 = var7 >> 16 & 65535;
                  int var13 = var7 & 65535;
                  if (var13 > maxClassMajorVersion || var13 == maxClassMajorVersion && var12 > maxClassMinorVersion) {
                     maxClassMajorVersion = var13;
                     maxClassMinorVersion = var12;
                     maxClassVersion = var7;
                     maxJavaVersion = var6.replace('_', '.').substring(1);
                  }
               } else if ("ACC_PUBLIC".equals(var6)) {
                  break;
               }
            } catch (ReflectiveOperationException var11) {
               throw new Error(var11);
            }
         }
      }

      return var0;
   }

   private static VersionNumber getPackageVersion(Class<?> var0) {
      String var1 = var0.getPackage().getImplementationVersion();
      if (var1 != null) {
         return VersionNumber.parse(var1);
      }

      try {
         MainAttributes var2 = MainAttributes.of(var0.getProtectionDomain().getCodeSource().getLocation().toURI());
         return VersionNumber.parse(var2.get(Name.IMPLEMENTATION_VERSION));
      } catch (Exception var3) {
         return VersionNumber.NONE;
      }
   }
}
