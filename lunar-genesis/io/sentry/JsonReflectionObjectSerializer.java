package io.sentry;

import io.sentry.util.JsonSerializationUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class JsonReflectionObjectSerializer {
   private final Set<Object> visiting = new HashSet<>();
   private final int maxDepth;

   JsonReflectionObjectSerializer(int var1) {
      this.maxDepth = var1;
   }

   @Nullable
   public Object serialize(@Nullable Object var1, @NotNull ILogger var2) {
      if (var1 == null) {
         return null;
      }

      if (var1 instanceof Character) {
         return var1.toString();
      }

      if (var1 instanceof Number) {
         return var1;
      }

      if (var1 instanceof Boolean) {
         return var1;
      }

      if (var1 instanceof String) {
         return var1;
      }

      if (var1 instanceof Locale) {
         return var1.toString();
      }

      if (var1 instanceof AtomicIntegerArray) {
         return JsonSerializationUtils.atomicIntegerArrayToList((AtomicIntegerArray)var1);
      }

      if (var1 instanceof AtomicBoolean) {
         return ((AtomicBoolean)var1).get();
      }

      if (var1 instanceof URI) {
         return var1.toString();
      }

      if (var1 instanceof InetAddress) {
         return var1.toString();
      }

      if (var1 instanceof UUID) {
         return var1.toString();
      }

      if (var1 instanceof Currency) {
         return var1.toString();
      }

      if (var1 instanceof Calendar) {
         return JsonSerializationUtils.calendarToMap((Calendar)var1);
      }

      if (var1.getClass().isEnum()) {
         return var1.toString();
      }

      if (this.visiting.contains(var1)) {
         var2.log(SentryLevel.INFO, "Cyclic reference detected. Calling toString() on object.");
         return var1.toString();
      }

      this.visiting.add(var1);
      if (this.visiting.size() > this.maxDepth) {
         this.visiting.remove(var1);
         var2.log(SentryLevel.INFO, "Max depth exceeded. Calling toString() on object.");
         return var1.toString();
      }

      Object var3 = null;

      try {
         if (var1.getClass().isArray()) {
            var3 = this.list((Object[])var1, var2);
         } else if (var1 instanceof Collection) {
            var3 = this.list((Collection<?>)var1, var2);
         } else if (var1 instanceof Map) {
            var3 = this.map((Map<?, ?>)var1, var2);
         } else {
            Map var4 = this.serializeObject(var1, var2);
            if (var4.isEmpty()) {
               var3 = var1.toString();
            } else {
               var3 = var4;
            }
         }
      } catch (Exception var8) {
         var2.log(SentryLevel.INFO, "Not serializing object due to throwing sub-path.", var8);
      } finally {
         this.visiting.remove(var1);
      }

      return var3;
   }

   @NotNull
   public Map<String, Object> serializeObject(@NotNull Object var1, @NotNull ILogger var2) {
      Field[] var3 = var1.getClass().getDeclaredFields();
      HashMap var4 = new HashMap();

      for (Field var8 : var3) {
         if (!Modifier.isTransient(var8.getModifiers()) && !Modifier.isStatic(var8.getModifiers())) {
            String var9 = var8.getName();

            try {
               var8.setAccessible(true);
               Object var10 = var8.get(var1);
               var4.put(var9, this.serialize(var10, var2));
               var8.setAccessible(false);
            } catch (Exception var11) {
               var2.log(SentryLevel.INFO, "Cannot access field " + var9 + ".");
            }
         }
      }

      return var4;
   }

   @NotNull
   private List<Object> list(@NotNull Object[] var1, @NotNull ILogger var2) {
      ArrayList var3 = new ArrayList();

      for (Object var7 : var1) {
         var3.add(this.serialize(var7, var2));
      }

      return var3;
   }

   @NotNull
   private List<Object> list(@NotNull Collection<?> var1, @NotNull ILogger var2) {
      ArrayList var3 = new ArrayList();

      for (Object var5 : var1) {
         var3.add(this.serialize(var5, var2));
      }

      return var3;
   }

   @NotNull
   private Map<String, Object> map(@NotNull Map<?, ?> var1, @NotNull ILogger var2) {
      HashMap var3 = new HashMap();

      for (Object var5 : var1.keySet()) {
         Object var6 = var1.get(var5);
         if (var6 != null) {
            var3.put(var5.toString(), this.serialize(var6, var2));
         } else {
            var3.put(var5.toString(), null);
         }
      }

      return var3;
   }
}
