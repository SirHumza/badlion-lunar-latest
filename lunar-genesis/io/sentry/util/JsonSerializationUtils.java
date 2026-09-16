package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.ISerializer;
import io.sentry.JsonSerializable;
import io.sentry.SentryLevel;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class JsonSerializationUtils {
   private static final Charset UTF_8 = Charset.forName("UTF-8");

   @NotNull
   public static Map<String, Object> calendarToMap(@NotNull Calendar var0) {
      HashMap var1 = new HashMap();
      var1.put("year", var0.get(1));
      var1.put("month", var0.get(2));
      var1.put("dayOfMonth", var0.get(5));
      var1.put("hourOfDay", var0.get(11));
      var1.put("minute", var0.get(12));
      var1.put("second", var0.get(13));
      return var1;
   }

   @NotNull
   public static List<Object> atomicIntegerArrayToList(@NotNull AtomicIntegerArray var0) {
      int var1 = var0.length();
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(var0.get(var3));
      }

      return var2;
   }

   @Nullable
   public static byte[] bytesFrom(@NotNull ISerializer var0, @NotNull ILogger var1, @NotNull JsonSerializable var2) {
      try {
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();

         byte[] var5;
         try {
            BufferedWriter var4 = new BufferedWriter(new OutputStreamWriter(var3, UTF_8));

            try {
               var0.serialize(var2, var4);
               var5 = var3.toByteArray();
            } catch (Throwable var9) {
               try {
                  var4.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }

               throw var9;
            }

            var4.close();
         } catch (Throwable var10) {
            try {
               var3.close();
            } catch (Throwable var7) {
               var10.addSuppressed(var7);
            }

            throw var10;
         }

         var3.close();
         return var5;
      } catch (Throwable var11) {
         var1.log(SentryLevel.ERROR, "Could not serialize serializable", var11);
         return null;
      }
   }
}
