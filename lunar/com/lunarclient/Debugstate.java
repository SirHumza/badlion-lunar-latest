package com.lunarclient;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.enums.DebugState;

public final class JsonObjectUtil {
   public static void compare(JsonElement var0, JsonElement var1, DebugState var2) {
      if (compare(var0, var1, "", var2)) {
         throw new IllegalStateException("JsonObjects are not equal - see logs for more info");
      }
   }

   private static boolean compare(JsonElement var0, JsonElement var1, String var2, DebugState var3) {
      boolean var4 = false;
      if (var0.equals(var1)) {
         return false;
      }

      JsonObjectUtil.Type var5 = JsonObjectUtil.Type.getFromElement(var0);
      JsonObjectUtil.Type var6 = JsonObjectUtil.Type.getFromElement(var1);
      if (var5 == JsonObjectUtil.Type.OBJECT && var6 == JsonObjectUtil.Type.OBJECT) {
         JsonObject var11 = var0.getAsJsonObject();
         JsonObject var12 = var1.getAsJsonObject();

         for (String var10 : var11.keySet()) {
            if (var12.has(var10)) {
               if (compare(var11.get(var10), var12.get(var10), var2 + "." + var10, var3)) {
                  var4 = true;
               }
            } else if (var3 == DebugState.ALL || var3 == DebugState.ONLY_MISSING) {
               System.out.println("Field presence mismatch at path: " + var2);
               System.out.println("actual has field " + var10 + ", but parsed does not.\n");
               var4 = true;
            }
         }

         for (String var15 : var12.keySet()) {
            if (!var11.has(var15) && (var3 == DebugState.ALL || var3 == DebugState.ONLY_EXTRA)) {
               System.out.println("Field presence mismatch at path: " + var2);
               System.out.println("parsed has field " + var15 + ", but actual does not.\n");
               var4 = true;
            }
         }
      } else if (var5 == JsonObjectUtil.Type.ARRAY && var6 == JsonObjectUtil.Type.ARRAY) {
         JsonArray var7 = var0.getAsJsonArray();
         JsonArray var8 = var1.getAsJsonArray();
         if (var7.size() != var8.size()) {
            if (var3 == DebugState.ALL || var3 == DebugState.ONLY_MISMATCHES) {
               System.out.println("Array length mismatch at path: " + var2);
               System.out.println("A size: " + var7.size());
               System.out.println("B size: " + var8.size() + "\n");
               var4 = true;
            }
         } else {
            for (int var9 = 0; var9 < var7.size(); var9++) {
               if (compare(var7.get(var9), var8.get(var9), var2 + "[" + var9 + "]", var3)) {
                  var4 = true;
               }
            }
         }
      } else if (var5 == JsonObjectUtil.Type.PRIMITIVE && var6 == JsonObjectUtil.Type.PRIMITIVE) {
         if (var3 == DebugState.ALL || var3 == DebugState.ONLY_MISMATCHES) {
            System.out.println("Value mismatch at path: " + var2);
            System.out.println("A: " + var0);
            System.out.println("B: " + var1 + "\n");
            var4 = true;
         }
      } else if (var3 == DebugState.ALL || var3 == DebugState.ONLY_MISMATCHES) {
         System.out.println("Type mismatch at path: " + var2);
         System.out.println("A: " + var5.getValue());
         System.out.println("B: " + var6.getValue() + "\n");
         var4 = true;
      }

      return var4;
   }

   private JsonObjectUtil() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   private enum Type {
      OBJECT("Object"),
      ARRAY("Array"),
      PRIMITIVE("Primitive"),
      NULL("Null");

      private final String value;

      private static JsonObjectUtil.Type getFromElement(JsonElement var0) {
         if (var0.isJsonObject()) {
            return OBJECT;
         } else if (var0.isJsonArray()) {
            return ARRAY;
         } else {
            return var0.isJsonPrimitive() ? PRIMITIVE : NULL;
         }
      }

      public String getValue() {
         return this.value;
      }

      Type(String var3) {
         this.value = var3;
      }
   }
}
