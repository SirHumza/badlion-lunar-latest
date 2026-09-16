package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ObjectReader extends Closeable {
   @Nullable
   static Date dateOrNull(@Nullable String var0, @NotNull ILogger var1) {
      if (var0 == null) {
         return null;
      }

      try {
         return DateUtils.getDateTime(var0);
      } catch (Exception var5) {
         try {
            return DateUtils.getDateTimeWithMillisPrecision(var0);
         } catch (Exception var4) {
            var1.log(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", var4);
            return null;
         }
      }
   }

   void nextUnknown(ILogger var1, Map<String, Object> var2, String var3);

   @Nullable
   <T> List<T> nextListOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2);

   @Nullable
   <T> Map<String, T> nextMapOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2);

   @Nullable
   <T> Map<String, List<T>> nextMapOfListOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2);

   @Nullable
   <T> T nextOrNull(@NotNull ILogger var1, @NotNull JsonDeserializer<T> var2);

   @Nullable
   Date nextDateOrNull(ILogger var1);

   @Nullable
   TimeZone nextTimeZoneOrNull(ILogger var1);

   @Nullable
   Object nextObjectOrNull();

   @NotNull
   JsonToken peek();

   @NotNull
   String nextName();

   void beginObject();

   void endObject();

   void beginArray();

   void endArray();

   boolean hasNext();

   int nextInt();

   @Nullable
   Integer nextIntegerOrNull();

   long nextLong();

   @Nullable
   Long nextLongOrNull();

   String nextString();

   @Nullable
   String nextStringOrNull();

   boolean nextBoolean();

   @Nullable
   Boolean nextBooleanOrNull();

   double nextDouble();

   @Nullable
   Double nextDoubleOrNull();

   float nextFloat();

   @Nullable
   Float nextFloatOrNull();

   void nextNull();

   void setLenient(boolean var1);

   void skipValue();
}
