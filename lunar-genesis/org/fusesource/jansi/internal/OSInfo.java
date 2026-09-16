package org.fusesource.jansi.internal;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;

public class OSInfo {
   public static final String X86 = "x86";
   public static final String X86_64 = "x86_64";
   public static final String IA64_32 = "ia64_32";
   public static final String IA64 = "ia64";
   public static final String PPC = "ppc";
   public static final String PPC64 = "ppc64";
   private static final HashMap<String, String> archMapping = new HashMap<>();

   public static void main(String[] var0) {
      if (var0.length >= 1) {
         if ("--os".equals(var0[0])) {
            System.out.print(getOSName());
            return;
         }

         if ("--arch".equals(var0[0])) {
            System.out.print(getArchName());
            return;
         }
      }

      System.out.print(getNativeLibFolderPathForCurrentOS());
   }

   public static String getNativeLibFolderPathForCurrentOS() {
      return getOSName() + "/" + getArchName();
   }

   public static String getOSName() {
      return translateOSNameToFolderName(System.getProperty("os.name"));
   }

   public static boolean isAndroid() {
      return System.getProperty("java.runtime.name", "").toLowerCase().contains("android");
   }

   public static boolean isAlpine() {
      try {
         Process var0 = Runtime.getRuntime().exec("cat /etc/os-release | grep ^ID");
         var0.waitFor();
         InputStream var1 = var0.getInputStream();

         try {
            return readFully(var1).toLowerCase().contains("alpine");
         } finally {
            var1.close();
         }
      } catch (Throwable var7) {
         return false;
      }
   }

   static String getHardwareName() {
      try {
         Process var0 = Runtime.getRuntime().exec("uname -m");
         var0.waitFor();
         InputStream var1 = var0.getInputStream();

         try {
            return readFully(var1);
         } finally {
            var1.close();
         }
      } catch (Throwable var7) {
         System.err.println("Error while running uname -m: " + var7.getMessage());
         return "unknown";
      }
   }

   private static String readFully(InputStream var0) {
      int var1 = 0;
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      byte[] var3 = new byte[32];

      while ((var1 = var0.read(var3, 0, var3.length)) >= 0) {
         var2.write(var3, 0, var1);
      }

      return var2.toString();
   }

   static String resolveArmArchType() {
      if (System.getProperty("os.name").contains("Linux")) {
         String var0 = getHardwareName();
         if (var0.startsWith("armv6")) {
            return "armv6";
         }

         if (var0.startsWith("armv7")) {
            return "armv7";
         }

         if (var0.startsWith("armv5")) {
            return "arm";
         }

         if (var0.equals("aarch64")) {
            return "arm64";
         }

         String var1 = System.getProperty("sun.arch.abi");
         if (var1 != null && var1.startsWith("gnueabihf")) {
            return "armv7";
         }
      }

      return "arm";
   }

   public static String getArchName() {
      String var0 = System.getProperty("os.arch");
      if (isAndroid()) {
         return "android-arm";
      }

      if (var0.startsWith("arm")) {
         var0 = resolveArmArchType();
      } else {
         String var1 = var0.toLowerCase(Locale.US);
         if (archMapping.containsKey(var1)) {
            return archMapping.get(var1);
         }
      }

      return translateArchNameToFolderName(var0);
   }

   static String translateOSNameToFolderName(String var0) {
      if (var0.contains("Windows")) {
         return "Windows";
      } else if (var0.contains("Mac") || var0.contains("Darwin")) {
         return "Mac";
      } else if (var0.contains("Linux")) {
         return "Linux";
      } else {
         return var0.contains("AIX") ? "AIX" : var0.replaceAll("\\W", "");
      }
   }

   static String translateArchNameToFolderName(String var0) {
      return var0.replaceAll("\\W", "");
   }

   static {
      archMapping.put("x86", "x86");
      archMapping.put("i386", "x86");
      archMapping.put("i486", "x86");
      archMapping.put("i586", "x86");
      archMapping.put("i686", "x86");
      archMapping.put("pentium", "x86");
      archMapping.put("x86_64", "x86_64");
      archMapping.put("amd64", "x86_64");
      archMapping.put("em64t", "x86_64");
      archMapping.put("universal", "x86_64");
      archMapping.put("ia64", "ia64");
      archMapping.put("ia64w", "ia64");
      archMapping.put("ia64_32", "ia64_32");
      archMapping.put("ia64n", "ia64_32");
      archMapping.put("ppc", "ppc");
      archMapping.put("power", "ppc");
      archMapping.put("powerpc", "ppc");
      archMapping.put("power_pc", "ppc");
      archMapping.put("power_rs", "ppc");
      archMapping.put("ppc64", "ppc64");
      archMapping.put("power64", "ppc64");
      archMapping.put("powerpc64", "ppc64");
      archMapping.put("power_pc64", "ppc64");
      archMapping.put("power_rs64", "ppc64");
   }
}
