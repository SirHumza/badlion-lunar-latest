package com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Locale;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHOHROICIIOHIIHCOHOHROCHHHIHCH() {
      String var0 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      if (var0.contains("win")) {
         return com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WINDOWS;
      } else if (var0.contains("mac")) {
         return com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OSX;
      } else if (var0.contains("solaris")) {
         return com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SOLARIS;
      } else if (var0.contains("sunos")) {
         return com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SOLARIS;
      } else if (var0.contains("linux")) {
         return com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LINUX;
      } else {
         return var0.contains("unix")
            ? com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LINUX
            : com.moonsworth.lunar.legacy.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.UNKNOWN;
      }
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      LINUX("linux"),
      SOLARIS("solaris"),
      WINDOWS("windows") {
         @Override
         public String[] getOpenUrlArguments(URL var1) {
            return new String[]{"rundll32", "url.dll,FileProtocolHandler", var1.toString()};
         }
      },
      OSX("mac") {
         @Override
         public String[] getOpenUrlArguments(URL var1) {
            return new String[]{"open", var1.toString()};
         }
      },
      UNKNOWN("unknown");

      public final String telemetryName;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
         this.telemetryName = var3;
      }

      public void openUrl(URL var1) {
         try {
            Process var2 = Runtime.getRuntime().exec(this.getOpenUrlArguments(var1));
            var2.getInputStream().close();
            var2.getErrorStream().close();
            var2.getOutputStream().close();
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      public void openUri(URI var1) {
         try {
            this.openUrl(var1.toURL());
         } catch (MalformedURLException var3) {
            var3.printStackTrace();
         }
      }

      public void openFile(File var1) {
         try {
            this.openUrl(var1.toURI().toURL());
         } catch (MalformedURLException var3) {
            var3.printStackTrace();
         }
      }

      public String[] getOpenUrlArguments(URL var1) {
         String var2 = var1.toString();
         if ("file".equals(var1.getProtocol())) {
            var2 = var2.replace("file:", "file://");
         }

         return new String[]{"xdg-open", var2};
      }

      public void openUri(String var1) {
         try {
            this.openUrl(new URI(var1).toURL());
         } catch (IllegalArgumentException | URISyntaxException | MalformedURLException var3) {
            var3.printStackTrace();
         }
      }

      public String telemetryName() {
         return this.telemetryName;
      }
   }
}
