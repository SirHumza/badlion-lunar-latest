package org.json;

import java.util.Enumeration;
import java.util.Properties;

public class Property {
   public static JSONObject toJSONObject(Properties var0) {
      JSONObject var1 = new JSONObject();
      if (var0 != null && !var0.isEmpty()) {
         Enumeration var2 = var0.propertyNames();

         while (var2.hasMoreElements()) {
            String var3 = (String)var2.nextElement();
            var1.put(var3, var0.getProperty(var3));
         }
      }

      return var1;
   }

   public static Properties toProperties(JSONObject var0) {
      Properties var1 = new Properties();
      if (var0 != null) {
         for (String var3 : var0.keySet()) {
            Object var4 = var0.opt(var3);
            if (!JSONObject.NULL.equals(var4)) {
               var1.put(var3, var4.toString());
            }
         }
      }

      return var1;
   }
}
