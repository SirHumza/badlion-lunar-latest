package io.sentry;

import io.sentry.util.JsonSerializationUtils;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class JsonObjectSerializer {
   public static final String OBJECT_PLACEHOLDER = "[OBJECT]";
   public final JsonReflectionObjectSerializer jsonReflectionObjectSerializer;

   public JsonObjectSerializer(int var1) {
      this.jsonReflectionObjectSerializer = new JsonReflectionObjectSerializer(var1);
   }

   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2, @Nullable Object var3) {
      if (var3 == null) {
         var1.nullValue();
      } else if (var3 instanceof Character) {
         var1.value(Character.toString((Character)var3));
      } else if (var3 instanceof String) {
         var1.value((String)var3);
      } else if (var3 instanceof Boolean) {
         var1.value(((Boolean)var3).booleanValue());
      } else if (var3 instanceof Number) {
         var1.value((Number)var3);
      } else if (var3 instanceof Date) {
         this.serializeDate(var1, var2, (Date)var3);
      } else if (var3 instanceof TimeZone) {
         this.serializeTimeZone(var1, var2, (TimeZone)var3);
      } else if (var3 instanceof JsonSerializable) {
         ((JsonSerializable)var3).serialize(var1, var2);
      } else if (var3 instanceof Collection) {
         this.serializeCollection(var1, var2, (Collection<?>)var3);
      } else if (var3.getClass().isArray()) {
         this.serializeCollection(var1, var2, Arrays.asList((Object[])var3));
      } else if (var3 instanceof Map) {
         this.serializeMap(var1, var2, (Map<?, ?>)var3);
      } else if (var3 instanceof Locale) {
         var1.value(var3.toString());
      } else if (var3 instanceof AtomicIntegerArray) {
         this.serializeCollection(var1, var2, JsonSerializationUtils.atomicIntegerArrayToList((AtomicIntegerArray)var3));
      } else if (var3 instanceof AtomicBoolean) {
         var1.value(((AtomicBoolean)var3).get());
      } else if (var3 instanceof URI) {
         var1.value(var3.toString());
      } else if (var3 instanceof InetAddress) {
         var1.value(var3.toString());
      } else if (var3 instanceof UUID) {
         var1.value(var3.toString());
      } else if (var3 instanceof Currency) {
         var1.value(var3.toString());
      } else if (var3 instanceof Calendar) {
         this.serializeMap(var1, var2, JsonSerializationUtils.calendarToMap((Calendar)var3));
      } else if (var3.getClass().isEnum()) {
         var1.value(var3.toString());
      } else {
         try {
            Object var4 = this.jsonReflectionObjectSerializer.serialize(var3, var2);
            this.serialize(var1, var2, var4);
         } catch (Exception var5) {
            var2.log(SentryLevel.ERROR, "Failed serializing unknown object.", var5);
            var1.value("[OBJECT]");
         }
      }
   }

   private void serializeDate(@NotNull ObjectWriter var1, @NotNull ILogger var2, @NotNull Date var3) {
      try {
         var1.value(DateUtils.getTimestamp(var3));
      } catch (Exception var5) {
         var2.log(SentryLevel.ERROR, "Error when serializing Date", var5);
         var1.nullValue();
      }
   }

   private void serializeTimeZone(@NotNull ObjectWriter var1, @NotNull ILogger var2, @NotNull TimeZone var3) {
      try {
         var1.value(var3.getID());
      } catch (Exception var5) {
         var2.log(SentryLevel.ERROR, "Error when serializing TimeZone", var5);
         var1.nullValue();
      }
   }

   private void serializeCollection(@NotNull ObjectWriter var1, @NotNull ILogger var2, @NotNull Collection<?> var3) {
      var1.beginArray();

      for (Object var5 : var3) {
         this.serialize(var1, var2, var5);
      }

      var1.endArray();
   }

   private void serializeMap(@NotNull ObjectWriter var1, @NotNull ILogger var2, @NotNull Map<?, ?> var3) {
      var1.beginObject();

      for (Object var5 : var3.keySet()) {
         if (var5 instanceof String) {
            var1.name((String)var5);
            this.serialize(var1, var2, var3.get(var5));
         }
      }

      var1.endObject();
   }
}
