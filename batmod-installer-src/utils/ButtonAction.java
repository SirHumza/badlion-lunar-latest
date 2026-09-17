package com.batmod.installer.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ButtonAction {
   public static String Logger(String var0) {
      HttpURLConnection var1 = (HttpURLConnection)new URL(var0).openConnection();
      var1.addRequestProperty("User-Agent", "BatModInstaller/1.0");
      var1.setRequestMethod("GET");
      BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream(), StandardCharsets.UTF_8));
      StringBuilder var3 = new StringBuilder();

      String var4;
      while ((var4 = var2.readLine()) != null) {
         var3.append(var4);
         var3.append('\n');
      }

      if (var3.length() > 0) {
         var3.delete(var3.length() - 1, var3.length());
      }

      var2.close();
      return var3.toString();
   }
}
