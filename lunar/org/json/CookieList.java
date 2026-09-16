package org.json;

public class CookieList {
   public static JSONObject toJSONObject(String var0) {
      JSONObject var1 = new JSONObject();
      JSONTokener var2 = new JSONTokener(var0);

      while (var2.more()) {
         String var3 = Cookie.unescape(var2.nextTo('='));
         var2.next('=');
         var1.put(var3, Cookie.unescape(var2.nextTo(';')));
         var2.next();
      }

      return var1;
   }

   public static String toString(JSONObject var0) {
      boolean var1 = false;
      StringBuilder var2 = new StringBuilder();

      for (String var4 : var0.keySet()) {
         Object var5 = var0.opt(var4);
         if (!JSONObject.NULL.equals(var5)) {
            if (var1) {
               var2.append(';');
            }

            var2.append(Cookie.escape(var4));
            var2.append("=");
            var2.append(Cookie.escape(var5.toString()));
            var1 = true;
         }
      }

      return var2.toString();
   }
}
