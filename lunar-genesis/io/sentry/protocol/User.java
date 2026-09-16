package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class User implements JsonSerializable, JsonUnknown {
   @Nullable
   private String email;
   @Nullable
   private String id;
   @Nullable
   private String username;
   @Deprecated
   @Nullable
   private String segment;
   @Nullable
   private String ipAddress;
   @Nullable
   private String name;
   @Nullable
   private Geo geo;
   @Nullable
   private Map<String, @NotNull String> data;
   @Nullable
   private Map<String, @NotNull Object> unknown;

   public User() {
   }

   public User(@NotNull User var1) {
      this.email = var1.email;
      this.username = var1.username;
      this.id = var1.id;
      this.ipAddress = var1.ipAddress;
      this.segment = var1.segment;
      this.name = var1.name;
      this.geo = var1.geo;
      this.data = CollectionUtils.newConcurrentHashMap(var1.data);
      this.unknown = CollectionUtils.newConcurrentHashMap(var1.unknown);
   }

   public static User fromMap(@NotNull Map<String, Object> var0, @NotNull SentryOptions var1) {
      User var2 = new User();
      ConcurrentHashMap var3 = null;

      for (Entry var5 : var0.entrySet()) {
         Object var6 = var5.getValue();
         switch ((String)var5.getKey()) {
            case "email":
               var2.email = var6 instanceof String ? (String)var6 : null;
               break;
            case "id":
               var2.id = var6 instanceof String ? (String)var6 : null;
               break;
            case "username":
               var2.username = var6 instanceof String ? (String)var6 : null;
               break;
            case "segment":
               var2.segment = var6 instanceof String ? (String)var6 : null;
               break;
            case "ip_address":
               var2.ipAddress = var6 instanceof String ? (String)var6 : null;
               break;
            case "name":
               var2.name = var6 instanceof String ? (String)var6 : null;
               break;
            case "geo":
               Map var9 = var6 instanceof Map ? (Map)var6 : null;
               if (var9 == null) {
                  break;
               }

               ConcurrentHashMap var15 = new ConcurrentHashMap();

               for (Entry var19 : var9.entrySet()) {
                  if (var19.getKey() instanceof String && var19.getValue() != null) {
                     var15.put((String)var19.getKey(), var19.getValue());
                  } else {
                     var1.getLogger().log(SentryLevel.WARNING, "Invalid key type in gep map.");
                  }
               }

               var2.geo = Geo.fromMap(var15);
               break;
            case "data":
               Map var10 = var6 instanceof Map ? (Map)var6 : null;
               if (var10 == null) {
                  break;
               }

               ConcurrentHashMap var16 = new ConcurrentHashMap();

               for (Entry var20 : var10.entrySet()) {
                  if (var20.getKey() instanceof String && var20.getValue() != null) {
                     var16.put((String)var20.getKey(), var20.getValue().toString());
                  } else {
                     var1.getLogger().log(SentryLevel.WARNING, "Invalid key or null value in data map.");
                  }
               }

               var2.data = var16;
               break;
            case "other":
               Map var11 = var6 instanceof Map ? (Map)var6 : null;
               if (var11 != null && (var2.data == null || var2.data.isEmpty())) {
                  ConcurrentHashMap var12 = new ConcurrentHashMap();

                  for (Entry var14 : var11.entrySet()) {
                     if (var14.getKey() instanceof String && var14.getValue() != null) {
                        var12.put((String)var14.getKey(), var14.getValue().toString());
                     } else {
                        var1.getLogger().log(SentryLevel.WARNING, "Invalid key or null value in other map.");
                     }
                  }

                  var2.data = var12;
               }
               break;
            default:
               if (var3 == null) {
                  var3 = new ConcurrentHashMap();
               }

               var3.put((String)var5.getKey(), var5.getValue());
         }
      }

      var2.unknown = var3;
      return var2;
   }

   @Nullable
   public String getEmail() {
      return this.email;
   }

   public void setEmail(@Nullable String var1) {
      this.email = var1;
   }

   @Nullable
   public String getId() {
      return this.id;
   }

   public void setId(@Nullable String var1) {
      this.id = var1;
   }

   @Nullable
   public String getUsername() {
      return this.username;
   }

   public void setUsername(@Nullable String var1) {
      this.username = var1;
   }

   @Deprecated
   @Nullable
   public String getSegment() {
      return this.segment;
   }

   @Deprecated
   public void setSegment(@Nullable String var1) {
      this.segment = var1;
   }

   @Nullable
   public String getIpAddress() {
      return this.ipAddress;
   }

   public void setIpAddress(@Nullable String var1) {
      this.ipAddress = var1;
   }

   @Deprecated
   @Nullable
   public Map<String, @NotNull String> getOthers() {
      return this.getData();
   }

   @Deprecated
   public void setOthers(@Nullable Map<String, @NotNull String> var1) {
      this.setData(var1);
   }

   @Nullable
   public String getName() {
      return this.name;
   }

   public void setName(@Nullable String var1) {
      this.name = var1;
   }

   @Nullable
   public Geo getGeo() {
      return this.geo;
   }

   public void setGeo(@Nullable Geo var1) {
      this.geo = var1;
   }

   @Nullable
   public Map<String, @NotNull String> getData() {
      return this.data;
   }

   public void setData(@Nullable Map<String, @NotNull String> var1) {
      this.data = CollectionUtils.newConcurrentHashMap(var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         User var2 = (User)var1;
         return Objects.equals(this.email, var2.email)
            && Objects.equals(this.id, var2.id)
            && Objects.equals(this.username, var2.username)
            && Objects.equals(this.segment, var2.segment)
            && Objects.equals(this.ipAddress, var2.ipAddress);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.email, this.id, this.username, this.segment, this.ipAddress);
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
      if (this.email != null) {
         var1.name("email").value(this.email);
      }

      if (this.id != null) {
         var1.name("id").value(this.id);
      }

      if (this.username != null) {
         var1.name("username").value(this.username);
      }

      if (this.segment != null) {
         var1.name("segment").value(this.segment);
      }

      if (this.ipAddress != null) {
         var1.name("ip_address").value(this.ipAddress);
      }

      if (this.name != null) {
         var1.name("name").value(this.name);
      }

      if (this.geo != null) {
         var1.name("geo");
         this.geo.serialize(var1, var2);
      }

      if (this.data != null) {
         var1.name("data").value(var2, this.data);
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

   public static final class Deserializer implements JsonDeserializer<User> {
      @NotNull
      public User deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         User var3 = new User();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "email":
                  var3.email = var1.nextStringOrNull();
                  break;
               case "id":
                  var3.id = var1.nextStringOrNull();
                  break;
               case "username":
                  var3.username = var1.nextStringOrNull();
                  break;
               case "segment":
                  var3.segment = var1.nextStringOrNull();
                  break;
               case "ip_address":
                  var3.ipAddress = var1.nextStringOrNull();
                  break;
               case "name":
                  var3.name = var1.nextStringOrNull();
                  break;
               case "geo":
                  var3.geo = new Geo.Deserializer().deserialize(var1, var2);
                  break;
               case "data":
                  var3.data = CollectionUtils.newConcurrentHashMap((Map<String, String>)var1.nextObjectOrNull());
                  break;
               case "other":
                  if (var3.data == null || var3.data.isEmpty()) {
                     var3.data = CollectionUtils.newConcurrentHashMap((Map<String, String>)var1.nextObjectOrNull());
                  }
                  break;
               default:
                  if (var4 == null) {
                     var4 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var4, var5);
            }
         }

         var3.setUnknown(var4);
         var1.endObject();
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String EMAIL = "email";
      public static final String ID = "id";
      public static final String USERNAME = "username";
      public static final String SEGMENT = "segment";
      public static final String IP_ADDRESS = "ip_address";
      public static final String NAME = "name";
      public static final String GEO = "geo";
      public static final String OTHER = "other";
      public static final String DATA = "data";
   }
}
