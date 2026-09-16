package io.sentry;

import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public final class MonitorContexts extends ConcurrentHashMap<String, Object> implements JsonSerializable {
   private static final long serialVersionUID = 3987329379811822556L;

   public MonitorContexts() {
   }

   public MonitorContexts(@NotNull MonitorContexts var1) {
      for (Entry var3 : var1.entrySet()) {
         if (var3 != null) {
            Object var4 = var3.getValue();
            if ("trace".equals(var3.getKey()) && var4 instanceof SpanContext) {
               this.setTrace(new SpanContext((SpanContext)var4));
            } else {
               this.put((String)var3.getKey(), var4);
            }
         }
      }
   }

   @Nullable
   private <T> T toContextType(@NotNull String var1, @NotNull Class<T> var2) {
      Object var3 = this.get(var1);
      return (T)(var2.isInstance(var3) ? var2.cast(var3) : null);
   }

   @Nullable
   public SpanContext getTrace() {
      return this.toContextType("trace", SpanContext.class);
   }

   public void setTrace(@Nullable SpanContext var1) {
      Objects.requireNonNull(var1, "traceContext is required");
      this.put("trace", var1);
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      ArrayList var3 = Collections.list(this.keys());
      Collections.sort(var3);

      for (String var5 : var3) {
         Object var6 = this.get(var5);
         if (var6 != null) {
            var1.name(var5).value(var2, var6);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<MonitorContexts> {
      @NotNull
      public MonitorContexts deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         MonitorContexts var3 = new MonitorContexts();
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var4 = var1.nextName();
            switch (var4) {
               case "trace":
                  var3.setTrace(new SpanContext.Deserializer().deserialize(var1, var2));
                  break;
               default:
                  Object var7 = var1.nextObjectOrNull();
                  if (var7 != null) {
                     var3.put(var4, var7);
                  }
            }
         }

         var1.endObject();
         return var3;
      }
   }
}
