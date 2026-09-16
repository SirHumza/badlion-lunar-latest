package org.spongepowered.include.com.google.gson.internal.bind;

import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.spongepowered.include.com.google.gson.JsonArray;
import org.spongepowered.include.com.google.gson.JsonNull;
import org.spongepowered.include.com.google.gson.JsonObject;
import org.spongepowered.include.com.google.gson.JsonPrimitive;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonToken;

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
   private final List<Object> stack;

   @Override
   public void beginArray() {
      this.expect(JsonToken.BEGIN_ARRAY);
      JsonArray var1 = (JsonArray)this.peekStack();
      this.stack.add(var1.iterator());
   }

   @Override
   public void endArray() {
      this.expect(JsonToken.END_ARRAY);
      this.popStack();
      this.popStack();
   }

   @Override
   public void beginObject() {
      this.expect(JsonToken.BEGIN_OBJECT);
      JsonObject var1 = (JsonObject)this.peekStack();
      this.stack.add(var1.entrySet().iterator());
   }

   @Override
   public void endObject() {
      this.expect(JsonToken.END_OBJECT);
      this.popStack();
      this.popStack();
   }

   @Override
   public boolean hasNext() {
      JsonToken var1 = this.peek();
      return var1 != JsonToken.END_OBJECT && var1 != JsonToken.END_ARRAY;
   }

   @Override
   public JsonToken peek() {
      if (this.stack.isEmpty()) {
         return JsonToken.END_DOCUMENT;
      }

      Object var1 = this.peekStack();
      if (var1 instanceof Iterator) {
         boolean var4 = this.stack.get(this.stack.size() - 2) instanceof JsonObject;
         Iterator var3 = (Iterator)var1;
         if (var3.hasNext()) {
            if (var4) {
               return JsonToken.NAME;
            }

            this.stack.add(var3.next());
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
            throw new AssertionError();
         }
      }
   }

   private Object peekStack() {
      return this.stack.get(this.stack.size() - 1);
   }

   private Object popStack() {
      return this.stack.remove(this.stack.size() - 1);
   }

   private void expect(JsonToken var1) {
      if (this.peek() != var1) {
         throw new IllegalStateException("Expected " + var1 + " but was " + this.peek());
      }
   }

   @Override
   public String nextName() {
      this.expect(JsonToken.NAME);
      Iterator var1 = (Iterator)this.peekStack();
      Entry var2 = (Entry)var1.next();
      this.stack.add(var2.getValue());
      return (String)var2.getKey();
   }

   @Override
   public String nextString() {
      JsonToken var1 = this.peek();
      if (var1 != JsonToken.STRING && var1 != JsonToken.NUMBER) {
         throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + var1);
      } else {
         return ((JsonPrimitive)this.popStack()).getAsString();
      }
   }

   @Override
   public boolean nextBoolean() {
      this.expect(JsonToken.BOOLEAN);
      return ((JsonPrimitive)this.popStack()).getAsBoolean();
   }

   @Override
   public void nextNull() {
      this.expect(JsonToken.NULL);
      this.popStack();
   }

   @Override
   public double nextDouble() {
      JsonToken var1 = this.peek();
      if (var1 != JsonToken.NUMBER && var1 != JsonToken.STRING) {
         throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + var1);
      } else {
         double var2 = ((JsonPrimitive)this.peekStack()).getAsDouble();
         if (this.isLenient() || !Double.isNaN(var2) && !Double.isInfinite(var2)) {
            this.popStack();
            return var2;
         } else {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + var2);
         }
      }
   }

   @Override
   public long nextLong() {
      JsonToken var1 = this.peek();
      if (var1 != JsonToken.NUMBER && var1 != JsonToken.STRING) {
         throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + var1);
      }

      long var2 = ((JsonPrimitive)this.peekStack()).getAsLong();
      this.popStack();
      return var2;
   }

   @Override
   public int nextInt() {
      JsonToken var1 = this.peek();
      if (var1 != JsonToken.NUMBER && var1 != JsonToken.STRING) {
         throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + var1);
      }

      int var2 = ((JsonPrimitive)this.peekStack()).getAsInt();
      this.popStack();
      return var2;
   }

   @Override
   public void close() {
      this.stack.clear();
      this.stack.add(SENTINEL_CLOSED);
   }

   @Override
   public void skipValue() {
      if (this.peek() == JsonToken.NAME) {
         this.nextName();
      } else {
         this.popStack();
      }
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public void promoteNameToValue() {
      this.expect(JsonToken.NAME);
      Iterator var1 = (Iterator)this.peekStack();
      Entry var2 = (Entry)var1.next();
      this.stack.add(var2.getValue());
      this.stack.add(new JsonPrimitive((String)var2.getKey()));
   }
}
