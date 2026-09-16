package com.google.gson.internal.bind;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

public final class JsonTreeReader extends JsonReader {
   private static final Reader UNREADABLE_READER = new Reader() {
      @Override
      public int read(char[] var1, int var2, int var3) {
         throw new AssertionError();
      }

      @Override
      public void close() {
         throw new AssertionError();
      }
   };
   private static final Object SENTINEL_CLOSED = new Object();
   private Object[] stack = new Object[32];
   private int stackSize = 0;
   private String[] pathNames = new String[32];
   private int[] pathIndices = new int[32];

   public JsonTreeReader(JsonElement var1) {
      super(UNREADABLE_READER);
      this.push(var1);
   }

   @Override
   public void beginArray() {
      this.expect(JsonToken.BEGIN_ARRAY);
      JsonArray var1 = (JsonArray)this.peekStack();
      this.push(var1.iterator());
      this.pathIndices[this.stackSize - 1] = 0;
   }

   @Override
   public void endArray() {
      this.expect(JsonToken.END_ARRAY);
      this.popStack();
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }
   }

   @Override
   public void beginObject() {
      this.expect(JsonToken.BEGIN_OBJECT);
      JsonObject var1 = (JsonObject)this.peekStack();
      this.push(var1.entrySet().iterator());
   }

   @Override
   public void endObject() {
      this.expect(JsonToken.END_OBJECT);
      this.pathNames[this.stackSize - 1] = null;
      this.popStack();
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }
   }

   @Override
   public boolean hasNext() {
      JsonToken var1 = this.peek();
      return var1 != JsonToken.END_OBJECT && var1 != JsonToken.END_ARRAY && var1 != JsonToken.END_DOCUMENT;
   }

   @Override
   public JsonToken peek() {
      if (this.stackSize == 0) {
         return JsonToken.END_DOCUMENT;
      }

      Object var1 = this.peekStack();
      if (var1 instanceof Iterator) {
         boolean var4 = this.stack[this.stackSize - 2] instanceof JsonObject;
         Iterator var3 = (Iterator)var1;
         if (var3.hasNext()) {
            if (var4) {
               return JsonToken.NAME;
            }

            this.push(var3.next());
            return this.peek();
         } else {
            return var4 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
         }
      } else {
         if (var1 instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
         }

         if (var1 instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
         }

         if (var1 instanceof JsonPrimitive) {
            JsonPrimitive var2 = (JsonPrimitive)var1;
            if (var2.isString()) {
               return JsonToken.STRING;
            } else if (var2.isBoolean()) {
               return JsonToken.BOOLEAN;
            } else if (var2.isNumber()) {
               return JsonToken.NUMBER;
            } else {
               throw new AssertionError();
            }
         } else if (var1 instanceof JsonNull) {
            return JsonToken.NULL;
         } else if (var1 == SENTINEL_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
         } else {
            throw new MalformedJsonException("Custom JsonElement subclass " + var1.getClass().getName() + " is not supported");
         }
      }
   }

   private Object peekStack() {
      return this.stack[this.stackSize - 1];
   }

   @CanIgnoreReturnValue
   private Object popStack() {
      Object var1 = this.stack[--this.stackSize];
      this.stack[this.stackSize] = null;
      return var1;
   }

   private void expect(JsonToken var1) {
      if (this.peek() != var1) {
         throw new IllegalStateException("Expected " + var1 + " but was " + this.peek() + this.locationString());
      }
   }

   private String nextName(boolean var1) {
      this.expect(JsonToken.NAME);
      Iterator var2 = (Iterator)this.peekStack();
      Entry var3 = (Entry)var2.next();
      String var4 = (String)var3.getKey();
      this.pathNames[this.stackSize - 1] = var1 ? "<skipped>" : var4;
      this.push(var3.getValue());
      return var4;
   }

   @Override
   public String nextName() {
      return this.nextName(false);
   }

   @Override
   public String nextString() {
      JsonToken var1 = this.peek();
      if (var1 != JsonToken.STRING && var1 != JsonToken.NUMBER) {
         throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + var1 + this.locationString());
      }

      String var2 = ((JsonPrimitive)this.popStack()).getAsString();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }

      return var2;
   }

   @Override
   public boolean nextBoolean() {
      this.expect(JsonToken.BOOLEAN);
      boolean var1 = ((JsonPrimitive)this.popStack()).getAsBoolean();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }

      return var1;
   }

   @Override
   public void nextNull() {
      this.expect(JsonToken.NULL);
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }
   }

   @Override
   public double nextDouble() {
      JsonToken var1 = this.peek();
      if (var1 != JsonToken.NUMBER && var1 != JsonToken.STRING) {
         throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + var1 + this.locationString());
      }

      double var2 = ((JsonPrimitive)this.peekStack()).getAsDouble();
      if (this.isLenient() || !Double.isNaN(var2) && !Double.isInfinite(var2)) {
         this.popStack();
         if (this.stackSize > 0) {
            this.pathIndices[this.stackSize - 1]++;
         }

         return var2;
      } else {
         throw new MalformedJsonException("JSON forbids NaN and infinities: " + var2);
      }
   }

   @Override
   public long nextLong() {
      JsonToken var1 = this.peek();
      if (var1 != JsonToken.NUMBER && var1 != JsonToken.STRING) {
         throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + var1 + this.locationString());
      }

      long var2 = ((JsonPrimitive)this.peekStack()).getAsLong();
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }

      return var2;
   }

   @Override
   public int nextInt() {
      JsonToken var1 = this.peek();
      if (var1 != JsonToken.NUMBER && var1 != JsonToken.STRING) {
         throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + var1 + this.locationString());
      }

      int var2 = ((JsonPrimitive)this.peekStack()).getAsInt();
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }

      return var2;
   }

   JsonElement nextJsonElement() {
      JsonToken var1 = this.peek();
      if (var1 != JsonToken.NAME && var1 != JsonToken.END_ARRAY && var1 != JsonToken.END_OBJECT && var1 != JsonToken.END_DOCUMENT) {
         JsonElement var2 = (JsonElement)this.peekStack();
         this.skipValue();
         return var2;
      } else {
         throw new IllegalStateException("Unexpected " + var1 + " when reading a JsonElement.");
      }
   }

   @Override
   public void close() {
      this.stack = new Object[]{SENTINEL_CLOSED};
      this.stackSize = 1;
   }

   @Override
   public void skipValue() {
      JsonToken var1 = this.peek();
      switch (var1) {
         case NAME:
            String var2 = this.nextName(true);
            break;
         case END_ARRAY:
            this.endArray();
            break;
         case END_OBJECT:
            this.endObject();
         case END_DOCUMENT:
            break;
         default:
            this.popStack();
            if (this.stackSize > 0) {
               this.pathIndices[this.stackSize - 1]++;
            }
      }
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.locationString();
   }

   public void promoteNameToValue() {
      this.expect(JsonToken.NAME);
      Iterator var1 = (Iterator)this.peekStack();
      Entry var2 = (Entry)var1.next();
      this.push(var2.getValue());
      this.push(new JsonPrimitive((String)var2.getKey()));
   }

   private void push(Object var1) {
      if (this.stackSize == this.stack.length) {
         int var2 = this.stackSize * 2;
         this.stack = Arrays.copyOf(this.stack, var2);
         this.pathIndices = Arrays.copyOf(this.pathIndices, var2);
         this.pathNames = Arrays.copyOf(this.pathNames, var2);
      }

      this.stack[this.stackSize++] = var1;
   }

   private String getPath(boolean var1) {
      StringBuilder var2 = new StringBuilder().append('$');

      for (int var3 = 0; var3 < this.stackSize; var3++) {
         if (this.stack[var3] instanceof JsonArray) {
            var3++;
            if (var3 < this.stackSize && this.stack[var3] instanceof Iterator) {
               int var4 = this.pathIndices[var3];
               if (var1 && var4 > 0 && (var3 == this.stackSize - 1 || var3 == this.stackSize - 2)) {
                  var4--;
               }

               var2.append('[').append(var4).append(']');
            }
         } else if (this.stack[var3] instanceof JsonObject) {
            var3++;
            if (var3 < this.stackSize && this.stack[var3] instanceof Iterator) {
               var2.append('.');
               if (this.pathNames[var3] != null) {
                  var2.append(this.pathNames[var3]);
               }
            }
         }
      }

      return var2.toString();
   }

   @Override
   public String getPath() {
      return this.getPath(false);
   }

   @Override
   public String getPreviousPath() {
      return this.getPath(true);
   }

   private String locationString() {
      return " at path " + this.getPath();
   }
}
