package io.sentry;

import io.sentry.vendor.gson.stream.JsonReader;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class JsonObjectReader implements ObjectReader {
   @NotNull
   private final JsonReader jsonReader;

   public JsonObjectReader(Reader var1) {
      this.jsonReader = new JsonReader(var1);
   }

   @Nullable
   @Override
   public String nextStringOrNull() {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      } else {
         return this.jsonReader.nextString();
      }
   }

   @Nullable
   @Override
   public Double nextDoubleOrNull() {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      } else {
         return this.jsonReader.nextDouble();
      }
   }

   @Nullable
   @Override
   public Float nextFloatOrNull() {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      } else {
         return this.nextFloat();
      }
   }

   @Override
   public float nextFloat() {
      return (float)this.jsonReader.nextDouble();
   }

   @Nullable
   @Override
   public Long nextLongOrNull() {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      } else {
         return this.jsonReader.nextLong();
      }
   }

   @Nullable
   @Override
   public Integer nextIntegerOrNull() {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      } else {
         return this.jsonReader.nextInt();
      }
   }

   @Nullable
   @Override
   public Boolean nextBooleanOrNull() {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      } else {
         return this.jsonReader.nextBoolean();
      }
   }

   @Override
   public void nextUnknown(ILogger var1, Map<String, Object> var2, String var3) {
      try {
         var2.put(var3, this.nextObjectOrNull());
      } catch (Exception var5) {
         var1.log(SentryLevel.ERROR, var5, "Error deserializing unknown key: %s", var3);
      }
   }

   @Nullable
   @Override
   public <T> List<T> nextListOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2) {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      }

      this.jsonReader.beginArray();
      ArrayList var3 = new ArrayList();
      if (this.jsonReader.hasNext()) {
         do {
            try {
               var3.add(var2.deserialize(this, var1));
            } catch (Exception var5) {
               var1.log(SentryLevel.WARNING, "Failed to deserialize object in list.", var5);
            }
         } while (this.jsonReader.peek() == JsonToken.BEGIN_OBJECT);
      }

      this.jsonReader.endArray();
      return var3;
   }

   @Nullable
   @Override
   public <T> Map<String, T> nextMapOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2) {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      }

      this.jsonReader.beginObject();
      HashMap var3 = new HashMap();
      if (this.jsonReader.hasNext()) {
         do {
            try {
               String var4 = this.jsonReader.nextName();
               var3.put(var4, var2.deserialize(this, var1));
            } catch (Exception var5) {
               var1.log(SentryLevel.WARNING, "Failed to deserialize object in map.", var5);
            }
         } while (this.jsonReader.peek() == JsonToken.BEGIN_OBJECT || this.jsonReader.peek() == JsonToken.NAME);
      }

      this.jsonReader.endObject();
      return var3;
   }

   @Nullable
   @Override
   public <T> Map<String, List<T>> nextMapOfListOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2) {
      if (this.peek() == JsonToken.NULL) {
         this.nextNull();
         return null;
      }

      HashMap var3 = new HashMap();
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
   }

   @Nullable
   @Override
   public <T> T nextOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2) {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      } else {
         return (T)var2.deserialize(this, var1);
      }
   }

   @Nullable
   @Override
   public Date nextDateOrNull(ILogger var1) {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      } else {
         return ObjectReader.dateOrNull(this.jsonReader.nextString(), var1);
      }
   }

   @Nullable
   @Override
   public TimeZone nextTimeZoneOrNull(ILogger var1) {
      if (this.jsonReader.peek() == JsonToken.NULL) {
         this.jsonReader.nextNull();
         return null;
      }

      try {
         return TimeZone.getTimeZone(this.jsonReader.nextString());
      } catch (Exception var3) {
         var1.log(SentryLevel.ERROR, "Error when deserializing TimeZone", var3);
         return null;
      }
   }

   @Nullable
   @Override
   public Object nextObjectOrNull() {
      return new JsonObjectDeserializer().deserialize(this);
   }

   @NotNull
   @Override
   public JsonToken peek() {
      return this.jsonReader.peek();
   }

   @NotNull
   @Override
   public String nextName() {
      return this.jsonReader.nextName();
   }

   @Override
   public void beginObject() {
      this.jsonReader.beginObject();
   }

   @Override
   public void endObject() {
      this.jsonReader.endObject();
   }

   @Override
   public void beginArray() {
      this.jsonReader.beginArray();
   }

   @Override
   public void endArray() {
      this.jsonReader.endArray();
   }

   @Override
   public boolean hasNext() {
      return this.jsonReader.hasNext();
   }

   @Override
   public int nextInt() {
      return this.jsonReader.nextInt();
   }

   @Override
   public long nextLong() {
      return this.jsonReader.nextLong();
   }

   @Override
   public String nextString() {
      return this.jsonReader.nextString();
   }

   @Override
   public boolean nextBoolean() {
      return this.jsonReader.nextBoolean();
   }

   @Override
   public double nextDouble() {
      return this.jsonReader.nextDouble();
   }

   @Override
   public void nextNull() {
      this.jsonReader.nextNull();
   }

   @Override
   public void setLenient(boolean var1) {
      this.jsonReader.setLenient(var1);
   }

   @Override
   public void skipValue() {
      this.jsonReader.skipValue();
   }

   @Override
   public void close() {
      this.jsonReader.close();
   }
}
