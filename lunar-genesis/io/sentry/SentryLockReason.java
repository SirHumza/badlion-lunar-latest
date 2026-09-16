package io.sentry;

import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryLockReason implements JsonSerializable, JsonUnknown {
   public static final int LOCKED = 1;
   public static final int WAITING = 2;
   public static final int SLEEPING = 4;
   public static final int BLOCKED = 8;
   public static final int ANY = 15;
   private int type;
   @Nullable
   private String address;
   @Nullable
   private String packageName;
   @Nullable
   private String className;
   @Nullable
   private Long threadId;
   @Nullable
   private Map<String, Object> unknown;

   public SentryLockReason() {
   }

   public SentryLockReason(@NotNull SentryLockReason var1) {
      this.type = var1.type;
      this.address = var1.address;
      this.packageName = var1.packageName;
      this.className = var1.className;
      this.threadId = var1.threadId;
      this.unknown = CollectionUtils.newConcurrentHashMap(var1.unknown);
   }

   public int getType() {
      return this.type;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   @Nullable
   public String getAddress() {
      return this.address;
   }

   public void setAddress(@Nullable String var1) {
      this.address = var1;
   }

   @Nullable
   public String getPackageName() {
      return this.packageName;
   }

   public void setPackageName(@Nullable String var1) {
      this.packageName = var1;
   }

   @Nullable
   public String getClassName() {
      return this.className;
   }

   public void setClassName(@Nullable String var1) {
      this.className = var1;
   }

   @Nullable
   public Long getThreadId() {
      return this.threadId;
   }

   public void setThreadId(@Nullable Long var1) {
      this.threadId = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         SentryLockReason var2 = (SentryLockReason)var1;
         return Objects.equals(this.address, var2.address);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.address);
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
      var1.name("type").value(this.type);
      if (this.address != null) {
         var1.name("address").value(this.address);
      }

      if (this.packageName != null) {
         var1.name("package_name").value(this.packageName);
      }

      if (this.className != null) {
         var1.name("class_name").value(this.className);
      }

      if (this.threadId != null) {
         var1.name("thread_id").value(this.threadId);
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

   public static final class Deserializer implements JsonDeserializer<SentryLockReason> {
      @NotNull
      public SentryLockReason deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         SentryLockReason var3 = new SentryLockReason();
         ConcurrentHashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "type":
                  var3.type = var1.nextInt();
                  break;
               case "address":
                  var3.address = var1.nextStringOrNull();
                  break;
               case "package_name":
                  var3.packageName = var1.nextStringOrNull();
                  break;
               case "class_name":
                  var3.className = var1.nextStringOrNull();
                  break;
               case "thread_id":
                  var3.threadId = var1.nextLongOrNull();
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
      public static final String TYPE = "type";
      public static final String ADDRESS = "address";
      public static final String PACKAGE_NAME = "package_name";
      public static final String CLASS_NAME = "class_name";
      public static final String THREAD_ID = "thread_id";
   }
}
