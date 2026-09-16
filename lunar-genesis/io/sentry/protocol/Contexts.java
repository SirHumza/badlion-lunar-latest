package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SpanContext;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Contexts extends ConcurrentHashMap<String, Object> implements JsonSerializable {
   private static final long serialVersionUID = 252445813254943011L;
   public static final String REPLAY_ID = "replay_id";
   @NotNull
   private final Object responseLock = new Object();

   public Contexts() {
   }

   public Contexts(@NotNull Contexts var1) {
      for (Entry var3 : var1.entrySet()) {
         if (var3 != null) {
            Object var4 = var3.getValue();
            if ("app".equals(var3.getKey()) && var4 instanceof App) {
               this.setApp(new App((App)var4));
            } else if ("browser".equals(var3.getKey()) && var4 instanceof Browser) {
               this.setBrowser(new Browser((Browser)var4));
            } else if ("device".equals(var3.getKey()) && var4 instanceof Device) {
               this.setDevice(new Device((Device)var4));
            } else if ("os".equals(var3.getKey()) && var4 instanceof OperatingSystem) {
               this.setOperatingSystem(new OperatingSystem((OperatingSystem)var4));
            } else if ("runtime".equals(var3.getKey()) && var4 instanceof SentryRuntime) {
               this.setRuntime(new SentryRuntime((SentryRuntime)var4));
            } else if ("gpu".equals(var3.getKey()) && var4 instanceof Gpu) {
               this.setGpu(new Gpu((Gpu)var4));
            } else if ("trace".equals(var3.getKey()) && var4 instanceof SpanContext) {
               this.setTrace(new SpanContext((SpanContext)var4));
            } else if ("response".equals(var3.getKey()) && var4 instanceof Response) {
               this.setResponse(new Response((Response)var4));
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

   @Nullable
   public App getApp() {
      return this.toContextType("app", App.class);
   }

   public void setApp(@NotNull App var1) {
      this.put("app", var1);
   }

   @Nullable
   public Browser getBrowser() {
      return this.toContextType("browser", Browser.class);
   }

   public void setBrowser(@NotNull Browser var1) {
      this.put("browser", var1);
   }

   @Nullable
   public Device getDevice() {
      return this.toContextType("device", Device.class);
   }

   public void setDevice(@NotNull Device var1) {
      this.put("device", var1);
   }

   @Nullable
   public OperatingSystem getOperatingSystem() {
      return this.toContextType("os", OperatingSystem.class);
   }

   public void setOperatingSystem(@NotNull OperatingSystem var1) {
      this.put("os", var1);
   }

   @Nullable
   public SentryRuntime getRuntime() {
      return this.toContextType("runtime", SentryRuntime.class);
   }

   public void setRuntime(@NotNull SentryRuntime var1) {
      this.put("runtime", var1);
   }

   @Nullable
   public Gpu getGpu() {
      return this.toContextType("gpu", Gpu.class);
   }

   public void setGpu(@NotNull Gpu var1) {
      this.put("gpu", var1);
   }

   @Nullable
   public Response getResponse() {
      return this.toContextType("response", Response.class);
   }

   public void withResponse(HintUtils.SentryConsumer<Response> var1) {
      synchronized (this.responseLock) {
         Response var3 = this.getResponse();
         if (var3 != null) {
            var1.accept(var3);
         } else {
            Response var4 = new Response();
            this.setResponse(var4);
            var1.accept(var4);
         }
      }
   }

   public void setResponse(@NotNull Response var1) {
      synchronized (this.responseLock) {
         this.put("response", var1);
      }
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

   public static final class Deserializer implements JsonDeserializer<Contexts> {
      @NotNull
      public Contexts deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         Contexts var3 = new Contexts();
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var4 = var1.nextName();
            switch (var4) {
               case "app":
                  var3.setApp(new App.Deserializer().deserialize(var1, var2));
                  break;
               case "browser":
                  var3.setBrowser(new Browser.Deserializer().deserialize(var1, var2));
                  break;
               case "device":
                  var3.setDevice(new Device.Deserializer().deserialize(var1, var2));
                  break;
               case "gpu":
                  var3.setGpu(new Gpu.Deserializer().deserialize(var1, var2));
                  break;
               case "os":
                  var3.setOperatingSystem(new OperatingSystem.Deserializer().deserialize(var1, var2));
                  break;
               case "runtime":
                  var3.setRuntime(new SentryRuntime.Deserializer().deserialize(var1, var2));
                  break;
               case "trace":
                  var3.setTrace(new SpanContext.Deserializer().deserialize(var1, var2));
                  break;
               case "response":
                  var3.setResponse(new Response.Deserializer().deserialize(var1, var2));
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
