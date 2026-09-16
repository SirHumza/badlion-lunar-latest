package org.java_websocket.extensions;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExtensionRequestData {
   public static String EMPTY_VALUE = "";
   private Map<String, String> extensionParameters = new LinkedHashMap<>();
   private String extensionName;

   private ExtensionRequestData() {
   }

   public static ExtensionRequestData parseExtensionRequest(String var0) {
      ExtensionRequestData var1 = new ExtensionRequestData();
      String[] var2 = var0.split(";");
      var1.extensionName = var2[0].trim();

      for (int var3 = 1; var3 < var2.length; var3++) {
         String[] var4 = var2[var3].split("=");
         String var5 = EMPTY_VALUE;
         if (var4.length > 1) {
            String var6 = var4[1].trim();
            if (var6.startsWith("\"") && var6.endsWith("\"") || var6.startsWith("'") && var6.endsWith("'") && var6.length() > 2) {
               var6 = var6.substring(1, var6.length() - 1);
            }

            var5 = var6;
         }

         var1.extensionParameters.put(var4[0].trim(), var5);
      }

      return var1;
   }

   public String getExtensionName() {
      return this.extensionName;
   }

   public Map<String, String> getExtensionParameters() {
      return this.extensionParameters;
   }
}
