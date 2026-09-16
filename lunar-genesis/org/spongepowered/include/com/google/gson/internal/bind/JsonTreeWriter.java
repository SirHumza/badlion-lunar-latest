package org.spongepowered.include.com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.spongepowered.include.com.google.gson.JsonArray;
import org.spongepowered.include.com.google.gson.JsonElement;
import org.spongepowered.include.com.google.gson.JsonNull;
import org.spongepowered.include.com.google.gson.JsonObject;
import org.spongepowered.include.com.google.gson.JsonPrimitive;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;

public final class JsonTreeWriter extends JsonWriter {
   private static final Writer UNWRITABLE_WRITER = new Writer() {
      @Override
      public void write(char[] var1, int var2, int var3) {
         throw new AssertionError();
      }

      @Override
      public void flush() {
         throw new AssertionError();
      }

      @Override
      public void close() {
         throw new AssertionError();
      }
   };
   private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive("closed");
   private final List<JsonElement> stack = new ArrayList<>();
   private String pendingName;
   private JsonElement product = JsonNull.INSTANCE;

   public JsonTreeWriter() {
      super(UNWRITABLE_WRITER);
   }

   public JsonElement get() {
      if (!this.stack.isEmpty()) {
         throw new IllegalStateException("Expected one JSON element but was " + this.stack);
      } else {
         return this.product;
      }
   }

   private JsonElement peek() {
      return this.stack.get(this.stack.size() - 1);
   }

   private void put(JsonElement var1) {
      if (this.pendingName != null) {
         if (!var1.isJsonNull() || this.getSerializeNulls()) {
            JsonObject var2 = (JsonObject)this.peek();
            var2.add(this.pendingName, var1);
         }

         this.pendingName = null;
      } else if (this.stack.isEmpty()) {
         this.product = var1;
      } else {
         JsonElement var3 = this.peek();
         if (!(var3 instanceof JsonArray)) {
            throw new IllegalStateException();
         }

         ((JsonArray)var3).add(var1);
      }
   }

   @Override
   public JsonWriter beginArray() {
      JsonArray var1 = new JsonArray();
      this.put(var1);
      this.stack.add(var1);
      return this;
   }

   @Override
   public JsonWriter endArray() {
      if (!this.stack.isEmpty() && this.pendingName == null) {
         JsonElement var1 = this.peek();
         if (var1 instanceof JsonArray) {
            this.stack.remove(this.stack.size() - 1);
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public JsonWriter beginObject() {
      JsonObject var1 = new JsonObject();
      this.put(var1);
      this.stack.add(var1);
      return this;
   }

   @Override
   public JsonWriter endObject() {
      if (!this.stack.isEmpty() && this.pendingName == null) {
         JsonElement var1 = this.peek();
         if (var1 instanceof JsonObject) {
            this.stack.remove(this.stack.size() - 1);
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public JsonWriter name(String var1) {
      if (!this.stack.isEmpty() && this.pendingName == null) {
         JsonElement var2 = this.peek();
         if (var2 instanceof JsonObject) {
            this.pendingName = var1;
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public JsonWriter value(String var1) {
      if (var1 == null) {
         return this.nullValue();
      }

      this.put(new JsonPrimitive(var1));
      return this;
   }

   @Override
   public JsonWriter nullValue() {
      this.put(JsonNull.INSTANCE);
      return this;
   }

   @Override
   public JsonWriter value(boolean var1) {
      this.put(new JsonPrimitive(var1));
      return this;
   }

   @Override
   public JsonWriter value(long var1) {
      this.put(new JsonPrimitive(var1));
      return this;
   }

   @Override
   public JsonWriter value(Number var1) {
      if (var1 == null) {
         return this.nullValue();
      }

      if (!this.isLenient()) {
         double var2 = var1.doubleValue();
         if (Double.isNaN(var2) || Double.isInfinite(var2)) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + var1);
         }
      }

      this.put(new JsonPrimitive(var1));
      return this;
   }

   @Override
   public void flush() {
   }

   @Override
   public void close() {
      if (!this.stack.isEmpty()) {
         throw new IOException("Incomplete document");
      }

      this.stack.add(SENTINEL_CLOSED);
   }
}
