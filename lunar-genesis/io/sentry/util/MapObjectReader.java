package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.ObjectReader;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MapObjectReader implements ObjectReader {
   private final Deque<Entry<String, Object>> stack = new ArrayDeque<>();

   public MapObjectReader(Map<String, Object> var1) {
      this.stack.addLast(new SimpleEntry<>(null, var1));
   }

   @Override
   public void nextUnknown(@NotNull ILogger var1, Map<String, Object> var2, String var3) {
      try {
         var2.put(var3, this.nextObjectOrNull());
      } catch (Exception var5) {
         var1.log(SentryLevel.ERROR, var5, "Error deserializing unknown key: %s", var3);
      }
   }

   @Nullable
   @Override
   public <T> List<T> nextListOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2) {
      if (this.peek() == JsonToken.NULL) {
         this.nextNull();
         return null;
      }

      try {
         this.beginArray();
         ArrayList var3 = new ArrayList();
         if (this.hasNext()) {
            do {
               try {
                  var3.add(var2.deserialize(this, var1));
               } catch (Exception var5) {
                  var1.log(SentryLevel.WARNING, "Failed to deserialize object in list.", var5);
               }
            } while (this.peek() == JsonToken.BEGIN_OBJECT);
         }

         this.endArray();
         return var3;
      } catch (Exception var6) {
         throw new IOException(var6);
      }
   }

   @Nullable
   @Override
   public <T> Map<String, T> nextMapOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2) {
      if (this.peek() == JsonToken.NULL) {
         this.nextNull();
         return null;
      }

      try {
         this.beginObject();
         HashMap var3 = new HashMap();
         if (this.hasNext()) {
            do {
               try {
                  String var4 = this.nextName();
                  var3.put(var4, var2.deserialize(this, var1));
               } catch (Exception var5) {
                  var1.log(SentryLevel.WARNING, "Failed to deserialize object in map.", var5);
               }
            } while (this.peek() == JsonToken.BEGIN_OBJECT || this.peek() == JsonToken.NAME);
         }

         this.endObject();
         return var3;
      } catch (Exception var6) {
         throw new IOException(var6);
      }
   }

   @Nullable
   @Override
   public <T> Map<String, List<T>> nextMapOfListOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2) {
      if (this.peek() == JsonToken.NULL) {
         this.nextNull();
         return null;
      }

      HashMap var3 = new HashMap();

      try {
         this.beginObject();
         if (this.hasNext()) {
            do {
               String var4 = this.nextName();
               List var5 = this.nextListOrNull(var1, var2);
               if (var5 != null) {
                  var3.put(var4, var5);
               }
            } while (this.peek() == JsonToken.BEGIN_OBJECT || this.peek() == JsonToken.NAME);
         }

         this.endObject();
         return var3;
      } catch (Exception var6) {
         throw new IOException(var6);
      }
   }

   @Nullable
   @Override
   public <T> T nextOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2) {
      return this.nextValueOrNull(var1, var2);
   }

   @Nullable
   @Override
   public Date nextDateOrNull(@NotNull ILogger var1) {
      String var2 = this.nextStringOrNull();
      return ObjectReader.dateOrNull(var2, var1);
   }

   @Nullable
   @Override
   public TimeZone nextTimeZoneOrNull(@NotNull ILogger var1) {
      String var2 = this.nextStringOrNull();
      return var2 != null ? TimeZone.getTimeZone(var2) : null;
   }

   @Nullable
   @Override
   public Object nextObjectOrNull() {
      return this.nextValueOrNull();
   }

   @NotNull
   @Override
   public JsonToken peek() {
      if (this.stack.isEmpty()) {
         return JsonToken.END_DOCUMENT;
      } else {
         Entry var1 = this.stack.peekLast();
         if (var1 == null) {
            return JsonToken.END_DOCUMENT;
         } else if (var1.getKey() != null) {
            return JsonToken.NAME;
         } else {
            Object var2 = var1.getValue();
            if (var2 instanceof Map) {
               return JsonToken.BEGIN_OBJECT;
            } else if (var2 instanceof List) {
               return JsonToken.BEGIN_ARRAY;
            } else if (var2 instanceof String) {
               return JsonToken.STRING;
            } else if (var2 instanceof Number) {
               return JsonToken.NUMBER;
            } else if (var2 instanceof Boolean) {
               return JsonToken.BOOLEAN;
            } else {
               return var2 instanceof JsonToken ? (JsonToken)var2 : JsonToken.END_DOCUMENT;
            }
         }
      }
   }

   @NotNull
   @Override
   public String nextName() {
      Entry var1 = this.stack.peekLast();
      if (var1 != null && var1.getKey() != null) {
         return (String)var1.getKey();
      } else {
         throw new IOException("Expected a name but was " + this.peek());
      }
   }

   @Override
   public void beginObject() {
      Entry var1 = this.stack.removeLast();
      if (var1 == null) {
         throw new IOException("No more entries");
      }

      Object var2 = var1.getValue();
      if (!(var2 instanceof Map)) {
         throw new IOException("Current token is not an object");
      }

      this.stack.addLast(new SimpleEntry<>(null, JsonToken.END_OBJECT));

      for (Entry var4 : ((Map)var2).entrySet()) {
         this.stack.addLast(var4);
      }
   }

   @Override
   public void endObject() {
      if (this.stack.size() > 1) {
         this.stack.removeLast();
      }
   }

   @Override
   public void beginArray() {
      Entry var1 = this.stack.removeLast();
      if (var1 == null) {
         throw new IOException("No more entries");
      }

      Object var2 = var1.getValue();
      if (!(var2 instanceof List)) {
         throw new IOException("Current token is not an object");
      }

      this.stack.addLast(new SimpleEntry<>(null, JsonToken.END_ARRAY));

      for (int var3 = ((List)var2).size() - 1; var3 >= 0; var3--) {
         Object var4 = ((List)var2).get(var3);
         this.stack.addLast(new SimpleEntry<>(null, var4));
      }
   }

   @Override
   public void endArray() {
      if (this.stack.size() > 1) {
         this.stack.removeLast();
      }
   }

   @Override
   public boolean hasNext() {
      return !this.stack.isEmpty();
   }

   @Override
   public int nextInt() {
      Object var1 = this.nextValueOrNull();
      if (var1 instanceof Number) {
         return ((Number)var1).intValue();
      } else {
         throw new IOException("Expected int");
      }
   }

   @Nullable
   @Override
   public Integer nextIntegerOrNull() {
      Object var1 = this.nextValueOrNull();
      return var1 instanceof Number ? ((Number)var1).intValue() : null;
   }

   @Override
   public long nextLong() {
      Object var1 = this.nextValueOrNull();
      if (var1 instanceof Number) {
         return ((Number)var1).longValue();
      } else {
         throw new IOException("Expected long");
      }
   }

   @Nullable
   @Override
   public Long nextLongOrNull() {
      Object var1 = this.nextValueOrNull();
      return var1 instanceof Number ? ((Number)var1).longValue() : null;
   }

   @Override
   public String nextString() {
      String var1 = this.nextValueOrNull();
      if (var1 != null) {
         return var1;
      } else {
         throw new IOException("Expected string");
      }
   }

   @Nullable
   @Override
   public String nextStringOrNull() {
      return this.nextValueOrNull();
   }

   @Override
   public boolean nextBoolean() {
      Boolean var1 = this.nextValueOrNull();
      if (var1 != null) {
         return var1;
      } else {
         throw new IOException("Expected boolean");
      }
   }

   @Nullable
   @Override
   public Boolean nextBooleanOrNull() {
      return this.nextValueOrNull();
   }

   @Override
   public double nextDouble() {
      Object var1 = this.nextValueOrNull();
      if (var1 instanceof Number) {
         return ((Number)var1).doubleValue();
      } else {
         throw new IOException("Expected double");
      }
   }

   @Nullable
   @Override
   public Double nextDoubleOrNull() {
      Object var1 = this.nextValueOrNull();
      return var1 instanceof Number ? ((Number)var1).doubleValue() : null;
   }

   @Nullable
   @Override
   public Float nextFloatOrNull() {
      Object var1 = this.nextValueOrNull();
      return var1 instanceof Number ? ((Number)var1).floatValue() : null;
   }

   @Override
   public float nextFloat() {
      Object var1 = this.nextValueOrNull();
      if (var1 instanceof Number) {
         return ((Number)var1).floatValue();
      } else {
         throw new IOException("Expected float");
      }
   }

   @Override
   public void nextNull() {
      Object var1 = this.nextValueOrNull();
      if (var1 != null) {
         throw new IOException("Expected null but was " + this.peek());
      }
   }

   @Override
   public void setLenient(boolean var1) {
   }

   @Override
   public void skipValue() {
   }

   @Nullable
   private <T> T nextValueOrNull() {
      try {
         return this.nextValueOrNull(null, null);
      } catch (Exception var2) {
         throw new IOException(var2);
      }
   }

   @Nullable
   private <T> T nextValueOrNull(@Nullable ILogger var1, @Nullable JsonDeserializer<T> var2) {
      Entry var3 = this.stack.peekLast();
      if (var3 == null) {
         return null;
      }

      Object var4 = var3.getValue();
      if (var2 != null && var1 != null) {
         return (T)var2.deserialize(this, var1);
      }

      this.stack.removeLast();
      return (T)var4;
   }

   @Override
   public void close() {
      this.stack.clear();
   }
}
