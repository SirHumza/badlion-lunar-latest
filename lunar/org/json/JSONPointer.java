package org.json;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JSONPointer {
   private static final String ENCODING = "utf-8";
   private final List<String> refTokens;

   public static JSONPointer.Builder builder() {
      return new JSONPointer.Builder();
   }

   public JSONPointer(String var1) {
      if (var1 == null) {
         throw new NullPointerException("pointer cannot be null");
      }

      if (!var1.isEmpty() && !var1.equals("#")) {
         String var7;
         if (var1.startsWith("#/")) {
            var7 = var1.substring(2);

            try {
               var7 = URLDecoder.decode(var7, "utf-8");
            } catch (UnsupportedEncodingException var6) {
               throw new RuntimeException(var6);
            }
         } else {
            if (!var1.startsWith("/")) {
               throw new IllegalArgumentException("a JSON pointer should start with '/' or '#/'");
            }

            var7 = var1.substring(1);
         }

         this.refTokens = new ArrayList<>();
         int var3 = -1;
         int var4 = 0;

         do {
            var4 = var3 + 1;
            var3 = var7.indexOf(47, var4);
            if (var4 == var3 || var4 == var7.length()) {
               this.refTokens.add("");
            } else if (var3 >= 0) {
               String var5 = var7.substring(var4, var3);
               this.refTokens.add(this.unescape(var5));
            } else {
               String var9 = var7.substring(var4);
               this.refTokens.add(this.unescape(var9));
            }
         } while (var3 >= 0);
      } else {
         this.refTokens = Collections.emptyList();
      }
   }

   public JSONPointer(List<String> var1) {
      this.refTokens = new ArrayList<>(var1);
   }

   private String unescape(String var1) {
      return var1.replace("~1", "/").replace("~0", "~").replace("\\\"", "\"").replace("\\\\", "\\");
   }

   public Object queryFrom(Object var1) {
      if (this.refTokens.isEmpty()) {
         return var1;
      }

      Object var2 = var1;

      for (String var4 : this.refTokens) {
         if (var2 instanceof JSONObject) {
            var2 = ((JSONObject)var2).opt(this.unescape(var4));
         } else {
            if (!(var2 instanceof JSONArray)) {
               throw new JSONPointerException(String.format("value [%s] is not an array or object therefore its key %s cannot be resolved", var2, var4));
            }

            var2 = this.readByIndexToken(var2, var4);
         }
      }

      return var2;
   }

   private Object readByIndexToken(Object var1, String var2) {
      try {
         int var3 = Integer.parseInt(var2);
         JSONArray var4 = (JSONArray)var1;
         if (var3 >= var4.length()) {
            throw new JSONPointerException(String.format("index %d is out of bounds - the array has %d elements", var3, var4.length()));
         }

         try {
            return var4.get(var3);
         } catch (JSONException var6) {
            throw new JSONPointerException("Error reading value at index position " + var3, var6);
         }
      } catch (NumberFormatException var7) {
         throw new JSONPointerException(String.format("%s is not an array index", var2), var7);
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("");

      for (String var3 : this.refTokens) {
         var1.append('/').append(this.escape(var3));
      }

      return var1.toString();
   }

   private String escape(String var1) {
      return var1.replace("~", "~0").replace("/", "~1").replace("\\", "\\\\").replace("\"", "\\\"");
   }

   public String toURIFragment() {
      try {
         StringBuilder var1 = new StringBuilder("#");

         for (String var3 : this.refTokens) {
            var1.append('/').append(URLEncoder.encode(var3, "utf-8"));
         }

         return var1.toString();
      } catch (UnsupportedEncodingException var4) {
         throw new RuntimeException(var4);
      }
   }

   public static class Builder {
      private final List<String> refTokens = new ArrayList<>();

      public JSONPointer build() {
         return new JSONPointer(this.refTokens);
      }

      public JSONPointer.Builder append(String var1) {
         if (var1 == null) {
            throw new NullPointerException("token cannot be null");
         }

         this.refTokens.add(var1);
         return this;
      }

      public JSONPointer.Builder append(int var1) {
         this.refTokens.add(String.valueOf(var1));
         return this;
      }
   }
}
