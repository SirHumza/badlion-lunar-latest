package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
import java.io.File;
import java.nio.file.Files;
import java.util.Objects;

public enum RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   ULTRALIGHT("UltralightCore", "WebCore", "Ultralight"),
   COMMON("WebOSR-Binding");

   private final String[] natives;

   RRCRRCORICCHOHHIRCHIROOHIIOHCO(String... var3) {
      this.natives = var3;
   }

   public void load() {
      tryLoadNatives(this.natives);
   }

   public static void loadWebOSR() {
      if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isWindows()) {
         System.loadLibrary("vcruntime140");
         System.loadLibrary("vcruntime140_1");
         System.loadLibrary("msvcp140");
         System.loadLibrary("msvcp140_atomic_wait");
         System.loadLibrary("msvcp140_codecvt_ids");
         System.loadLibrary("msvcp140_1");
         System.loadLibrary("msvcp140_2");
      } else if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isLinux()
         && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIIHRIHORROOHHHIHROHCOIROIIIOO().isPresent()) {
         for (File var3 : Objects.requireNonNull(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIIHRIHORROOHHHIHROHCOIROIIIOO().get().listFiles())) {
            if (var3.getName().endsWith("*.ttf")) {
               try {
                  Files.copy(var3.toPath(), new File("/usr/local/share/fonts/", var3.getName()).toPath());
               } catch (Exception var5) {
                  var5.printStackTrace();
               }
            }
         }
      }

      ULTRALIGHT.load();
      COMMON.load();
   }

   private static void tryLoadNatives(String... var0) {
      for (String var4 : var0) {
         try {
            if (!RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isWindows()) {
               if (var4.endsWith("-0")) {
                  var4 = var4.replace("-0", "");
               }

               if (var4.startsWith("lib")) {
                  var4 = var4.substring(3);
               }
            }

            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "WebOSR", "Loading native: " + var4
            );
            System.loadLibrary(var4);
         } catch (UnsatisfiedLinkError var6) {
            var6.printStackTrace();
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "WebOSR", "Failed to load library " + var4
            );
         }
      }
   }
}
