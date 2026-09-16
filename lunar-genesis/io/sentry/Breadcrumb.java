package io.sentry;

import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.util.UrlUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Breadcrumb implements JsonSerializable, JsonUnknown {
   @Nullable
   private final Long timestampMs;
   @Nullable
   private Date timestamp;
   @Nullable
   private String message;
   @Nullable
   private String type;
   @NotNull
   private Map<String, Object> data = new ConcurrentHashMap<>();
   @Nullable
   private String category;
   @Nullable
   private String origin;
   @Nullable
   private SentryLevel level;
   @Nullable
   private Map<String, Object> unknown;

   public Breadcrumb(@NotNull Date var1) {
      this.timestamp = var1;
      this.timestampMs = null;
   }

   public Breadcrumb(long var1) {
      this.timestampMs = var1;
      this.timestamp = null;
   }

   Breadcrumb(@NotNull Breadcrumb var1) {
      this.timestamp = var1.timestamp;
      this.timestampMs = var1.timestampMs;
      this.message = var1.message;
      this.type = var1.type;
      this.category = var1.category;
      this.origin = var1.origin;
      Map var2 = CollectionUtils.newConcurrentHashMap(var1.data);
      if (var2 != null) {
         this.data = var2;
      }

      this.unknown = CollectionUtils.newConcurrentHashMap(var1.unknown);
      this.level = var1.level;
   }

   public static Breadcrumb fromMap(@NotNull Map<String, Object> var0, @NotNull SentryOptions var1) {
      Date var2 = DateUtils.getCurrentDateTime();
      String var3 = null;
      String var4 = null;
      ConcurrentHashMap var5 = new ConcurrentHashMap();
      String var6 = null;
      String var7 = null;
      SentryLevel var8 = null;
      ConcurrentHashMap var9 = null;

      for (Entry var11 : var0.entrySet()) {
         Object var12 = var11.getValue();
         switch ((String)var11.getKey()) {
            case "timestamp":
               if (var12 instanceof String) {
                  Date var20 = ObjectReader.dateOrNull((String)var12, var1.getLogger());
                  if (var20 != null) {
                     var2 = var20;
                  }
               }
               break;
            case "message":
               var3 = var12 instanceof String ? (String)var12 : null;
               break;
            case "type":
               var4 = var12 instanceof String ? (String)var12 : null;
               break;
            case "data":
               Map var15 = var12 instanceof Map ? (Map)var12 : null;
               if (var15 != null) {
                  for (Entry var17 : var15.entrySet()) {
                     if (var17.getKey() instanceof String && var17.getValue() != null) {
                        var5.put((String)var17.getKey(), var17.getValue());
                     } else {
                        var1.getLogger().log(SentryLevel.WARNING, "Invalid key or null value in data map.");
                     }
                  }
               }
               break;
            case "category":
               var6 = var12 instanceof String ? (String)var12 : null;
               break;
            case "origin":
               var7 = var12 instanceof String ? (String)var12 : null;
               break;
            case "level":
               String var16 = var12 instanceof String ? (String)var12 : null;
               if (var16 != null) {
                  try {
                     var8 = SentryLevel.valueOf(var16.toUpperCase(Locale.ROOT));
                  } catch (Exception var18) {
                  }
               }
               break;
            default:
               if (var9 == null) {
                  var9 = new ConcurrentHashMap();
               }

               var9.put((String)var11.getKey(), var11.getValue());
         }
      }

      Breadcrumb var19 = new Breadcrumb(var2);
      var19.message = var3;
      var19.type = var4;
      var19.data = var5;
      var19.category = var6;
      var19.origin = var7;
      var19.level = var8;
      var19.setUnknown(var9);
      return var19;
   }

   @NotNull
   public static Breadcrumb http(@NotNull String var0, @NotNull String var1) {
      Breadcrumb var2 = new Breadcrumb();
      UrlUtils.UrlDetails var3 = UrlUtils.parse(var0);
      var2.setType("http");
      var2.setCategory("http");
      if (var3.getUrl() != null) {
         var2.setData("url", var3.getUrl());
      }

      var2.setData("method", var1.toUpperCase(Locale.ROOT));
      if (var3.getQuery() != null) {
         var2.setData("http.query", var3.getQuery());
      }

      if (var3.getFragment() != null) {
         var2.setData("http.fragment", var3.getFragment());
      }

      return var2;
   }

   @NotNull
   public static Breadcrumb http(@NotNull String var0, @NotNull String var1, @Nullable Integer var2) {
      Breadcrumb var3 = http(var0, var1);
      if (var2 != null) {
         var3.setData("status_code", var2);
      }

      return var3;
   }

   @NotNull
   public static Breadcrumb graphqlOperation(@Nullable String var0, @Nullable String var1, @Nullable String var2) {
      Breadcrumb var3 = new Breadcrumb();
      var3.setType("graphql");
      if (var0 != null) {
         var3.setData("operation_name", var0);
      }

      if (var1 != null) {
         var3.setData("operation_type", var1);
         var3.setCategory(var1);
      } else {
         var3.setCategory("graphql.operation");
      }

      if (var2 != null) {
         var3.setData("operation_id", var2);
      }

      return var3;
   }

   @NotNull
   public static Breadcrumb graphqlDataFetcher(@Nullable String var0, @Nullable String var1, @Nullable String var2, @Nullable String var3) {
      Breadcrumb var4 = new Breadcrumb();
      var4.setType("graphql");
      var4.setCategory("graphql.fetcher");
      if (var0 != null) {
         var4.setData("path", var0);
      }

      if (var1 != null) {
         var4.setData("field", var1);
      }

      if (var2 != null) {
         var4.setData("type", var2);
      }

      if (var3 != null) {
         var4.setData("object_type", var3);
      }

      return var4;
   }

   @NotNull
   public static Breadcrumb graphqlDataLoader(@NotNull Iterable<?> var0, @Nullable Class<?> var1, @Nullable Class<?> var2, @Nullable String var3) {
      Breadcrumb var4 = new Breadcrumb();
      var4.setType("graphql");
      var4.setCategory("graphql.data_loader");
      ArrayList var5 = new ArrayList();

      for (Object var7 : var0) {
         var5.add(var7.toString());
      }

      var4.setData("keys", var5);
      if (var1 != null) {
         var4.setData("key_type", var1.getName());
      }

      if (var2 != null) {
         var4.setData("value_type", var2.getName());
      }

      if (var3 != null) {
         var4.setData("name", var3);
      }

      return var4;
   }

   @NotNull
   public static Breadcrumb navigation(@NotNull String var0, @NotNull String var1) {
      Breadcrumb var2 = new Breadcrumb();
      var2.setCategory("navigation");
      var2.setType("navigation");
      var2.setData("from", var0);
      var2.setData("to", var1);
      return var2;
   }

   @NotNull
   public static Breadcrumb transaction(@NotNull String var0) {
      Breadcrumb var1 = new Breadcrumb();
      var1.setType("default");
      var1.setCategory("sentry.transaction");
      var1.setMessage(var0);
      return var1;
   }

   @NotNull
   public static Breadcrumb debug(@NotNull String var0) {
      Breadcrumb var1 = new Breadcrumb();
      var1.setType("debug");
      var1.setMessage(var0);
      var1.setLevel(SentryLevel.DEBUG);
      return var1;
   }

   @NotNull
   public static Breadcrumb error(@NotNull String var0) {
      Breadcrumb var1 = new Breadcrumb();
      var1.setType("error");
      var1.setMessage(var0);
      var1.setLevel(SentryLevel.ERROR);
      return var1;
   }

   @NotNull
   public static Breadcrumb info(@NotNull String var0) {
      Breadcrumb var1 = new Breadcrumb();
      var1.setType("info");
      var1.setMessage(var0);
      var1.setLevel(SentryLevel.INFO);
      return var1;
   }

   @NotNull
   public static Breadcrumb query(@NotNull String var0) {
      Breadcrumb var1 = new Breadcrumb();
      var1.setType("query");
      var1.setMessage(var0);
      return var1;
   }

   @NotNull
   public static Breadcrumb ui(@NotNull String var0, @NotNull String var1) {
      Breadcrumb var2 = new Breadcrumb();
      var2.setType("default");
      var2.setCategory("ui." + var0);
      var2.setMessage(var1);
      return var2;
   }

   @NotNull
   public static Breadcrumb user(@NotNull String var0, @NotNull String var1) {
      Breadcrumb var2 = new Breadcrumb();
      var2.setType("user");
      var2.setCategory(var0);
      var2.setMessage(var1);
      return var2;
   }

   @NotNull
   public static Breadcrumb userInteraction(@NotNull String var0, @Nullable String var1, @Nullable String var2) {
      return userInteraction(var0, var1, var2, Collections.emptyMap());
   }

   @NotNull
   public static Breadcrumb userInteraction(
      @NotNull String var0, @Nullable String var1, @Nullable String var2, @Nullable String var3, @NotNull Map<String, Object> var4
   ) {
      Breadcrumb var5 = new Breadcrumb();
      var5.setType("user");
      var5.setCategory("ui." + var0);
      if (var1 != null) {
         var5.setData("view.id", var1);
      }

      if (var2 != null) {
         var5.setData("view.class", var2);
      }

      if (var3 != null) {
         var5.setData("view.tag", var3);
      }

      for (Entry var7 : var4.entrySet()) {
         var5.getData().put((String)var7.getKey(), var7.getValue());
      }

      var5.setLevel(SentryLevel.INFO);
      return var5;
   }

   @NotNull
   public static Breadcrumb userInteraction(@NotNull String var0, @Nullable String var1, @Nullable String var2, @NotNull Map<String, Object> var3) {
      return userInteraction(var0, var1, var2, null, var3);
   }

   public Breadcrumb() {
      this(System.currentTimeMillis());
   }

   public Breadcrumb(@Nullable String var1) {
      this();
      this.message = var1;
   }

   @NotNull
   public Date getTimestamp() {
      if (this.timestamp != null) {
         return (Date)this.timestamp.clone();
      } else if (this.timestampMs != null) {
         this.timestamp = DateUtils.getDateTime(this.timestampMs);
         return this.timestamp;
      } else {
         throw new IllegalStateException("No timestamp set for breadcrumb");
      }
   }

   @Nullable
   public String getMessage() {
      return this.message;
   }

   public void setMessage(@Nullable String var1) {
      this.message = var1;
   }

   @Nullable
   public String getType() {
      return this.type;
   }

   public void setType(@Nullable String var1) {
      this.type = var1;
   }

   @ApiStatus.Internal
   @NotNull
   public Map<String, Object> getData() {
      return this.data;
   }

   @Nullable
   public Object getData(@NotNull String var1) {
      return this.data.get(var1);
   }

   public void setData(@NotNull String var1, @NotNull Object var2) {
      this.data.put(var1, var2);
   }

   public void removeData(@NotNull String var1) {
      this.data.remove(var1);
   }

   @Nullable
   public String getCategory() {
      return this.category;
   }

   public void setCategory(@Nullable String var1) {
      this.category = var1;
   }

   @Nullable
   public String getOrigin() {
      return this.origin;
   }

   public void setOrigin(@Nullable String var1) {
      this.origin = var1;
   }

   @Nullable
   public SentryLevel getLevel() {
      return this.level;
   }

   public void setLevel(@Nullable SentryLevel var1) {
      this.level = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Breadcrumb var2 = (Breadcrumb)var1;
         return this.getTimestamp().getTime() == var2.getTimestamp().getTime()
            && Objects.equals(this.message, var2.message)
            && Objects.equals(this.type, var2.type)
            && Objects.equals(this.category, var2.category)
            && Objects.equals(this.origin, var2.origin)
            && this.level == var2.level;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.timestamp, this.message, this.type, this.category, this.origin, this.level);
   }

   @Nullable
   @Override
   public Map<String, Object> getUnknown() {
      return this.unknown;
   }

   @Override
   public void setUnknown(@Nullable Map<String, Object> var1) {
      this.unknown = var1;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("timestamp").value(var2, this.getTimestamp());
      if (this.message != null) {
         var1.name("message").value(this.message);
      }

      if (this.type != null) {
         var1.name("type").value(this.type);
      }

      var1.name("data").value(var2, this.data);
      if (this.category != null) {
         var1.name("category").value(this.category);
      }

      if (this.origin != null) {
         var1.name("origin").value(this.origin);
      }

      if (this.level != null) {
         var1.name("level").value(var2, this.level);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<Breadcrumb> {
      @NotNull
      public Breadcrumb deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Date var3 = DateUtils.getCurrentDateTime();
         String var4 = null;
         String var5 = null;
         Map var6 = new ConcurrentHashMap();
         String var7 = null;
         String var8 = null;
         SentryLevel var9 = null;
         ConcurrentHashMap var10 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var11 = var1.nextName();
            switch (var11) {
               case "timestamp":
                  Date var14 = var1.nextDateOrNull(var2);
                  if (var14 != null) {
                     var3 = var14;
                  }
                  break;
               case "message":
                  var4 = var1.nextStringOrNull();
                  break;
               case "type":
                  var5 = var1.nextStringOrNull();
                  break;
               case "data":
                  Map var15 = CollectionUtils.newConcurrentHashMap((Map)var1.nextObjectOrNull());
                  if (var15 != null) {
                     var6 = var15;
                  }
                  break;
               case "category":
                  var7 = var1.nextStringOrNull();
                  break;
               case "origin":
                  var8 = var1.nextStringOrNull();
                  break;
               case "level":
                  try {
                     var9 = new SentryLevel.Deserializer().deserialize(var1, var2);
                  } catch (Exception var17) {
                     var2.log(SentryLevel.ERROR, var17, "Error when deserializing SentryLevel");
                  }
                  break;
               default:
                  if (var10 == null) {
                     var10 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var10, var11);
            }
         }

         Breadcrumb var18 = new Breadcrumb(var3);
         var18.message = var4;
         var18.type = var5;
         var18.data = var6;
         var18.category = var7;
         var18.origin = var8;
         var18.level = var9;
         var18.setUnknown(var10);
         var1.endObject();
         return var18;
      }
   }

   public static final class JsonKeys {
      public static final String TIMESTAMP = "timestamp";
      public static final String MESSAGE = "message";
      public static final String TYPE = "type";
      public static final String DATA = "data";
      public static final String CATEGORY = "category";
      public static final String ORIGIN = "origin";
      public static final String LEVEL = "level";
   }
}
