package org.json;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public class JSONWriter {
   private static final int maxdepth = 200;
   private boolean comma = false;
   protected char mode = 'i';
   private final JSONObject[] stack = new JSONObject[200];
   private int top = 0;
   protected Appendable writer;

   public JSONWriter(Appendable var1) {
      this.writer = var1;
   }

   private JSONWriter append(String var1) {
      if (var1 == null) {
         throw new JSONException("Null pointer");
      }

      if (this.mode != 'o' && this.mode != 'a') {
         throw new JSONException("Value out of sequence.");
      }

      try {
         if (this.comma && this.mode == 'a') {
            this.writer.append(',');
         }

         this.writer.append(var1);
      } catch (IOException var3) {
         throw new JSONException(var3);
      }

      if (this.mode == 'o') {
         this.mode = 'k';
      }

      this.comma = true;
      return this;
   }

   public JSONWriter array() {
      if (this.mode != 'i' && this.mode != 'o' && this.mode != 'a') {
         throw new JSONException("Misplaced array.");
      }

      this.push(null);
      this.append("[");
      this.comma = false;
      return this;
   }

   private JSONWriter end(char var1, char var2) {
      if (this.mode != var1) {
         throw new JSONException(var1 == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
      }

      this.pop(var1);

      try {
         this.writer.append(var2);
      } catch (IOException var4) {
         throw new JSONException(var4);
      }

      this.comma = true;
      return this;
   }

   public JSONWriter endArray() {
      return this.end('a', ']');
   }

   public JSONWriter endObject() {
      return this.end('k', '}');
   }

   public JSONWriter key(String var1) {
      if (var1 == null) {
         throw new JSONException("Null key.");
      }

      if (this.mode == 'k') {
         try {
            JSONObject var2 = this.stack[this.top - 1];
            if (var2.has(var1)) {
               throw new JSONException("Duplicate key \"" + var1 + "\"");
            }

            var2.put(var1, true);
            if (this.comma) {
               this.writer.append(',');
            }

            this.writer.append(JSONObject.quote(var1));
            this.writer.append(':');
            this.comma = false;
            this.mode = 'o';
            return this;
         } catch (IOException var3) {
            throw new JSONException(var3);
         }
      } else {
         throw new JSONException("Misplaced key.");
      }
   }

   public JSONWriter object() {
      if (this.mode == 'i') {
         this.mode = 'o';
      }

      if (this.mode != 'o' && this.mode != 'a') {
         throw new JSONException("Misplaced object.");
      }

      this.append("{");
      this.push(new JSONObject());
      this.comma = false;
      return this;
   }

   private void pop(char var1) {
      if (this.top <= 0) {
         throw new JSONException("Nesting error.");
      }

      int var2 = this.stack[this.top - 1] == null ? 97 : 107;
      if (var2 != var1) {
         throw new JSONException("Nesting error.");
      }

      this.top--;
      this.mode = (char)(this.top == 0 ? 100 : (this.stack[this.top - 1] == null ? 97 : 107));
   }

   private void push(JSONObject var1) {
      if (this.top >= 200) {
         throw new JSONException("Nesting too deep.");
      }

      this.stack[this.top] = var1;
      this.mode = (char)(var1 == null ? 97 : 107);
      this.top++;
   }

   public static String valueToString(Object var0) {
      if (var0 == null || var0.equals(null)) {
         return "null";
      }

      if (var0 instanceof JSONString) {
         String var7;
         try {
            var7 = ((JSONString)var0).toJSONString();
         } catch (Exception var3) {
            throw new JSONException(var3);
         }

         if (var7 instanceof String) {
            return var7;
         } else {
            throw new JSONException("Bad value from toJSONString: " + var7);
         }
      } else if (var0 instanceof Number) {
         String var6 = JSONObject.numberToString((Number)var0);

         try {
            new BigDecimal(var6);
            return var6;
         } catch (NumberFormatException var4) {
            return JSONObject.quote(var6);
         }
      } else if (var0 instanceof Boolean || var0 instanceof JSONObject || var0 instanceof JSONArray) {
         return var0.toString();
      } else if (var0 instanceof Map) {
         Map var5 = (Map)var0;
         return new JSONObject(var5).toString();
      } else if (var0 instanceof Collection) {
         Collection var1 = (Collection)var0;
         return new JSONArray(var1).toString();
      } else if (var0.getClass().isArray()) {
         return new JSONArray(var0).toString();
      } else {
         return var0 instanceof Enum ? JSONObject.quote(((Enum)var0).name()) : JSONObject.quote(var0.toString());
      }
   }

   public JSONWriter value(boolean var1) {
      return this.append(var1 ? "true" : "false");
   }

   public JSONWriter value(double var1) {
      return this.value(Double.valueOf(var1));
   }

   public JSONWriter value(long var1) {
      return this.append(Long.toString(var1));
   }

   public JSONWriter value(Object var1) {
      return this.append(valueToString(var1));
   }
}
