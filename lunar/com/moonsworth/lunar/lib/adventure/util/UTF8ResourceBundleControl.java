package com.moonsworth.lunar.lib.adventure.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;
import org.jetbrains.annotations.NotNull;

public final class UTF8ResourceBundleControl extends Control {
   private static final UTF8ResourceBundleControl INSTANCE = new UTF8ResourceBundleControl();

   @Deprecated
   public static @NotNull Control get() {
      return INSTANCE;
   }

   public static @NotNull Control utf8ResourceBundleControl() {
      return INSTANCE;
   }

   @Override
   public ResourceBundle newBundle(String var1, Locale var2, String var3, ClassLoader var4, boolean var5) {
      if (var3.equals("java.properties")) {
         String var6 = this.toBundleName(var1, var2);
         String var7 = this.toResourceName(var6, "properties");
         InputStream var8 = null;
         if (var5) {
            URL var9 = var4.getResource(var7);
            if (var9 != null) {
               URLConnection var10 = var9.openConnection();
               if (var10 != null) {
                  var10.setUseCaches(false);
                  var8 = var10.getInputStream();
               }
            }
         } else {
            var8 = var4.getResourceAsStream(var7);
         }

         if (var8 != null) {
            InputStreamReader var14 = new InputStreamReader(var8, StandardCharsets.UTF_8);

            PropertyResourceBundle var15;
            try {
               var15 = new PropertyResourceBundle(var14);
            } catch (Throwable var13) {
               try {
                  var14.close();
               } catch (Throwable var12) {
                  var13.addSuppressed(var12);
               }

               throw var13;
            }

            var14.close();
            return var15;
         } else {
            return null;
         }
      } else {
         return super.newBundle(var1, var2, var3, var4, var5);
      }
   }
}
