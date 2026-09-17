package com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;

import java.util.regex.Pattern;
import lombok.Generated;
import org.apache.commons.lang3.exception.ExceptionUtils;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH {
   public static boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Throwable var0) {
      if (var0.getCause() != null && !HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0.getCause())) {
         return false;
      }

      String var1 = ExceptionUtils.getStackTrace(var0);

      for (Pattern var3 : com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OHIHHOHICIOOHOHRIOCRHHCOIHCIOR()) {
         if (var3.matcher(var1).find()) {
            return false;
         }
      }

      return !(var0 instanceof OutOfMemoryError);
   }

   public static Throwable OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Throwable var0) {
      if (var0 == null) {
         return null;
      }

      CORCOCICIRIOHROHROIIOOHICCHCRR(var0);
      String var1 = var0.getMessage();
      if (var1 != null) {
         String var2 = HOHOHHOCOHIRRRICIRIRROIICORCCO(var1);
         if (!var2.equals(var1)) {
            boolean var3 = var0.getCause() != null;
            Throwable var4 = var3 ? OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0.getCause()) : null;

            try {
               Throwable var5;
               if (var3) {
                  var5 = (Throwable)var0.getClass().getConstructor(String.class, Throwable.class).newInstance(var2, var4);
               } else {
                  var5 = (Throwable)var0.getClass().getConstructor(String.class).newInstance(var2);
               }

               var5.setStackTrace(var0.getStackTrace());
               var0 = var5;
            } catch (Throwable var6) {
               var0 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var2, var4);
            }
         }
      }

      return var0;
   }

   private static void CORCOCICIRIOHROHROIIOOHICCHCRR(Throwable var0) {
      StackTraceElement[] var1 = var0.getStackTrace();

      for (int var2 = 0; var2 < var1.length; var2++) {
         StackTraceElement var3 = var1[var2];
         var1[var2] = new StackTraceElement(
            var3.getClassLoaderName(),
            var3.getModuleName(),
            var3.getModuleVersion(),
            var3.getClassName(),
            HCCROIOHHIHOOHCCHRHHCHOOIIIOCO(var3.getMethodName()),
            var3.getFileName(),
            var3.getLineNumber()
         );
      }

      var0.setStackTrace(var1);
   }

   private static String HOHOHHOCOHIRRRICIRIRROIICORCCO(String var0) {
      return var0.replaceAll("com\\.moonsworth\\.lunar(\\.[ICHOR]+)+", "Obf'd")
         .replaceAll("[ICHOR]{5,}", "Obf'd")
         .replaceAll("'Genesis' @[a-f0-9A-F]+", "Genesis");
   }

   private static String HCCROIOHHIHOOHCCHRHHCHOOIIIOCO(String var0) {
      return var0.replaceFirst("handler\\$[A-Za-z0-9]+\\$", "handler_")
         .replaceFirst("redirect\\$[A-Za-z0-9]+\\$", "redirect_")
         .replaceFirst("proxy\\$[A-Za-z0-9]+\\$", "proxy_")
         .replaceFirst("wrapOperation\\$[A-Za-z0-9]+\\$", "wrapOperation_");
   }

   @Generated
   private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
