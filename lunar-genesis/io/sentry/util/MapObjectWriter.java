package io.sentry.util;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonSerializable;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
public final class MapObjectWriter implements ObjectWriter {
   @NotNull
   final Map<String, Object> root;
   @NotNull
   final ArrayDeque<Object> stack;

   public MapObjectWriter(@NotNull Map<String, Object> var1) {
      this.root = var1;
      this.stack = new ArrayDeque<>();
      this.stack.addLast(var1);
   }

   public MapObjectWriter name(@NotNull String var1) {
      this.stack.add(var1);
      return this;
   }

   public MapObjectWriter value(@NotNull ILogger var1, @Nullable Object var2) {
      if (var2 == null) {
         this.nullValue();
      } else if (var2 instanceof Character) {
         this.value(Character.toString((Character)var2));
      } else if (var2 instanceof String) {
         this.value((String)var2);
      } else if (var2 instanceof Boolean) {
         this.value(((Boolean)var2).booleanValue());
      } else if (var2 instanceof Number) {
         this.value((Number)var2);
      } else if (var2 instanceof Date) {
         this.serializeDate(var1, (Date)var2);
      } else if (var2 instanceof TimeZone) {
         this.serializeTimeZone(var1, (TimeZone)var2);
      } else if (var2 instanceof JsonSerializable) {
         ((JsonSerializable)var2).serialize(this, var1);
      } else if (var2 instanceof Collection) {
         this.serializeCollection(var1, (Collection<?>)var2);
      } else if (var2.getClass().isArray()) {
         this.serializeCollection(var1, Arrays.asList((Object[])var2));
      } else if (var2 instanceof Map) {
         this.serializeMap(var1, (Map<?, ?>)var2);
      } else if (var2 instanceof Locale) {
         this.value(var2.toString());
      } else if (var2 instanceof AtomicIntegerArray) {
         this.serializeCollection(var1, JsonSerializationUtils.atomicIntegerArrayToList((AtomicIntegerArray)var2));
      } else if (var2 instanceof AtomicBoolean) {
         this.value(((AtomicBoolean)var2).get());
      } else if (var2 instanceof URI) {
         this.value(var2.toString());
      } else if (var2 instanceof InetAddress) {
         this.value(var2.toString());
      } else if (var2 instanceof UUID) {
         this.value(var2.toString());
      } else if (var2 instanceof Currency) {
         this.value(var2.toString());
      } else if (var2 instanceof Calendar) {
         this.serializeMap(var1, JsonSerializationUtils.calendarToMap((Calendar)var2));
      } else if (var2.getClass().isEnum()) {
         this.value(var2.toString());
      } else {
         var1.log(SentryLevel.WARNING, "Failed serializing unknown object.", var2);
      }

      return this;
   }

   @Override
   public void setLenient(boolean var1) {
   }

   public MapObjectWriter beginArray() {
      this.stack.add(new ArrayList());
      return this;
   }

   public MapObjectWriter endArray() {
      this.endObject();
      return this;
   }

   public MapObjectWriter beginObject() {
      this.stack.addLast(new HashMap());
      return this;
   }

   public MapObjectWriter endObject() {
      Object var1 = this.stack.removeLast();
      this.postValue(var1);
      return this;
   }

   public MapObjectWriter value(@Nullable String var1) {
      this.postValue(var1);
      return this;
   }

   @Override
   public ObjectWriter jsonValue(@Nullable String var1) {
      return this;
   }

   public MapObjectWriter nullValue() {
      this.postValue(null);
      return this;
   }

   public MapObjectWriter value(boolean var1) {
      this.postValue(var1);
      return this;
   }

   public MapObjectWriter value(@Nullable Boolean var1) {
      this.postValue(var1);
      return this;
   }

   public MapObjectWriter value(double var1) {
      this.postValue(var1);
      return this;
   }

   public MapObjectWriter value(long var1) {
      this.postValue(var1);
      return this;
   }

   public MapObjectWriter value(@Nullable Number var1) {
      this.postValue(var1);
      return this;
   }

   private void serializeDate(@NotNull ILogger var1, @NotNull Date var2) {
      try {
         this.value(DateUtils.getTimestamp(var2));
      } catch (Exception var4) {
         var1.log(SentryLevel.ERROR, "Error when serializing Date", var4);
         this.nullValue();
      }
   }

   private void serializeTimeZone(@NotNull ILogger var1, @NotNull TimeZone var2) {
      try {
         this.value(var2.getID());
      } catch (Exception var4) {
         var1.log(SentryLevel.ERROR, "Error when serializing TimeZone", var4);
         this.nullValue();
      }
   }

   private void serializeCollection(@NotNull ILogger var1, @NotNull Collection<?> var2) {
      this.beginArray();

      for (Object var4 : var2) {
         this.value(var1, var4);
      }

      this.endArray();
   }

   private void serializeMap(@NotNull ILogger var1, @NotNull Map<?, ?> var2) {
      this.beginObject();

      for (Object var4 : var2.keySet()) {
         if (var4 instanceof String) {
            this.name((String)var4);
            this.value(var1, var2.get(var4));
         }
      }

      this.endObject();
   }

   private void postValue(@Nullable Object var1) {
      Object var2 = this.stack.peekLast();
      if (var2 instanceof List) {
         ((List)var2).add(var1);
      } else {
         if (!(var2 instanceof String)) {
            throw new IllegalStateException("Invalid stack state, expected array or string on top");
         }

         String var3 = (String)this.stack.removeLast();
         this.peekObject().put(var3, var1);
      }
   }

   @NotNull
   private Map<String, Object> peekObject() {
      Object var1 = this.stack.peekLast();
      if (var1 == null) {
         throw new IllegalStateException("Stack is empty.");
      } else if (var1 instanceof Map) {
         return (Map<String, Object>)var1;
      } else {
         throw new IllegalStateException("Stack element is not a Map.");
      }
   }
}
