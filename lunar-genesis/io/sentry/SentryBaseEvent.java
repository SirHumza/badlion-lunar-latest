package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Request;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class SentryBaseEvent {
   public static final String DEFAULT_PLATFORM = "java";
   @Nullable
   private SentryId eventId;
   @NotNull
   private final Contexts contexts = new Contexts();
   @Nullable
   private SdkVersion sdk;
   @Nullable
   private Request request;
   @Nullable
   private Map<String, String> tags;
   @Nullable
   private String release;
   @Nullable
   private String environment;
   @Nullable
   private String platform;
   @Nullable
   private User user;
   @Nullable
   protected transient Throwable throwable;
   @Nullable
   private String serverName;
   @Nullable
   private String dist;
   @Nullable
   private List<Breadcrumb> breadcrumbs;
   @Nullable
   private DebugMeta debugMeta;
   @Nullable
   private Map<String, Object> extra;

   protected SentryBaseEvent(@NotNull SentryId var1) {
      this.eventId = var1;
   }

   protected SentryBaseEvent() {
      this(new SentryId());
   }

   @Nullable
   public SentryId getEventId() {
      return this.eventId;
   }

   public void setEventId(@Nullable SentryId var1) {
      this.eventId = var1;
   }

   @NotNull
   public Contexts getContexts() {
      return this.contexts;
   }

   @Nullable
   public SdkVersion getSdk() {
      return this.sdk;
   }

   public void setSdk(@Nullable SdkVersion var1) {
      this.sdk = var1;
   }

   @Nullable
   public Request getRequest() {
      return this.request;
   }

   public void setRequest(@Nullable Request var1) {
      this.request = var1;
   }

   @Nullable
   public Throwable getThrowable() {
      Throwable var1 = this.throwable;
      return var1 instanceof ExceptionMechanismException ? ((ExceptionMechanismException)var1).getThrowable() : var1;
   }

   @ApiStatus.Internal
   @Nullable
   public Throwable getThrowableMechanism() {
      return this.throwable;
   }

   public void setThrowable(@Nullable Throwable var1) {
      this.throwable = var1;
   }

   @ApiStatus.Internal
   @Nullable
   public Map<String, String> getTags() {
      return this.tags;
   }

   public void setTags(@Nullable Map<String, String> var1) {
      this.tags = CollectionUtils.newHashMap(var1);
   }

   public void removeTag(@NotNull String var1) {
      if (this.tags != null) {
         this.tags.remove(var1);
      }
   }

   @Nullable
   public String getTag(@NotNull String var1) {
      return this.tags != null ? this.tags.get(var1) : null;
   }

   public void setTag(@NotNull String var1, @NotNull String var2) {
      if (this.tags == null) {
         this.tags = new HashMap<>();
      }

      this.tags.put(var1, var2);
   }

   @Nullable
   public String getRelease() {
      return this.release;
   }

   public void setRelease(@Nullable String var1) {
      this.release = var1;
   }

   @Nullable
   public String getEnvironment() {
      return this.environment;
   }

   public void setEnvironment(@Nullable String var1) {
      this.environment = var1;
   }

   @Nullable
   public String getPlatform() {
      return this.platform;
   }

   public void setPlatform(@Nullable String var1) {
      this.platform = var1;
   }

   @Nullable
   public String getServerName() {
      return this.serverName;
   }

   public void setServerName(@Nullable String var1) {
      this.serverName = var1;
   }

   @Nullable
   public String getDist() {
      return this.dist;
   }

   public void setDist(@Nullable String var1) {
      this.dist = var1;
   }

   @Nullable
   public User getUser() {
      return this.user;
   }

   public void setUser(@Nullable User var1) {
      this.user = var1;
   }

   @Nullable
   public List<Breadcrumb> getBreadcrumbs() {
      return this.breadcrumbs;
   }

   public void setBreadcrumbs(@Nullable List<Breadcrumb> var1) {
      this.breadcrumbs = CollectionUtils.newArrayList(var1);
   }

   public void addBreadcrumb(@NotNull Breadcrumb var1) {
      if (this.breadcrumbs == null) {
         this.breadcrumbs = new ArrayList<>();
      }

      this.breadcrumbs.add(var1);
   }

   @Nullable
   public DebugMeta getDebugMeta() {
      return this.debugMeta;
   }

   public void setDebugMeta(@Nullable DebugMeta var1) {
      this.debugMeta = var1;
   }

   @Nullable
   public Map<String, Object> getExtras() {
      return this.extra;
   }

   public void setExtras(@Nullable Map<String, Object> var1) {
      this.extra = CollectionUtils.newHashMap(var1);
   }

   public void setExtra(@NotNull String var1, @NotNull Object var2) {
      if (this.extra == null) {
         this.extra = new HashMap<>();
      }

      this.extra.put(var1, var2);
   }

   public void removeExtra(@NotNull String var1) {
      if (this.extra != null) {
         this.extra.remove(var1);
      }
   }

   @Nullable
   public Object getExtra(@NotNull String var1) {
      return this.extra != null ? this.extra.get(var1) : null;
   }

   public void addBreadcrumb(@Nullable String var1) {
      this.addBreadcrumb(new Breadcrumb(var1));
   }

   public static final class Deserializer {
      public boolean deserializeValue(@NotNull SentryBaseEvent var1, @NotNull String var2, @NotNull ObjectReader var3, @NotNull ILogger var4) {
         switch (var2) {
            case "event_id":
               var1.eventId = var3.nextOrNull(var4, new SentryId.Deserializer());
               return true;
            case "contexts":
               Contexts var7 = new Contexts.Deserializer().deserialize(var3, var4);
               var1.contexts.putAll(var7);
               return true;
            case "sdk":
               var1.sdk = var3.nextOrNull(var4, new SdkVersion.Deserializer());
               return true;
            case "request":
               var1.request = var3.nextOrNull(var4, new Request.Deserializer());
               return true;
            case "tags":
               Map var8 = (Map)var3.nextObjectOrNull();
               var1.tags = CollectionUtils.newConcurrentHashMap(var8);
               return true;
            case "release":
               var1.release = var3.nextStringOrNull();
               return true;
            case "environment":
               var1.environment = var3.nextStringOrNull();
               return true;
            case "platform":
               var1.platform = var3.nextStringOrNull();
               return true;
            case "user":
               var1.user = var3.nextOrNull(var4, new User.Deserializer());
               return true;
            case "server_name":
               var1.serverName = var3.nextStringOrNull();
               return true;
            case "dist":
               var1.dist = var3.nextStringOrNull();
               return true;
            case "breadcrumbs":
               var1.breadcrumbs = var3.nextListOrNull(var4, new Breadcrumb.Deserializer());
               return true;
            case "debug_meta":
               var1.debugMeta = var3.nextOrNull(var4, new DebugMeta.Deserializer());
               return true;
            case "extra":
               Map var9 = (Map)var3.nextObjectOrNull();
               var1.extra = CollectionUtils.newConcurrentHashMap(var9);
               return true;
            default:
               return false;
         }
      }
   }

   public static final class JsonKeys {
      public static final String EVENT_ID = "event_id";
      public static final String CONTEXTS = "contexts";
      public static final String SDK = "sdk";
      public static final String REQUEST = "request";
      public static final String TAGS = "tags";
      public static final String RELEASE = "release";
      public static final String ENVIRONMENT = "environment";
      public static final String PLATFORM = "platform";
      public static final String USER = "user";
      public static final String SERVER_NAME = "server_name";
      public static final String DIST = "dist";
      public static final String BREADCRUMBS = "breadcrumbs";
      public static final String DEBUG_META = "debug_meta";
      public static final String EXTRA = "extra";
   }

   public static final class Serializer {
      public void serialize(@NotNull SentryBaseEvent var1, @NotNull ObjectWriter var2, @NotNull ILogger var3) {
         if (var1.eventId != null) {
            var2.name("event_id").value(var3, var1.eventId);
         }

         var2.name("contexts").value(var3, var1.contexts);
         if (var1.sdk != null) {
            var2.name("sdk").value(var3, var1.sdk);
         }

         if (var1.request != null) {
            var2.name("request").value(var3, var1.request);
         }

         if (var1.tags != null && !var1.tags.isEmpty()) {
            var2.name("tags").value(var3, var1.tags);
         }

         if (var1.release != null) {
            var2.name("release").value(var1.release);
         }

         if (var1.environment != null) {
            var2.name("environment").value(var1.environment);
         }

         if (var1.platform != null) {
            var2.name("platform").value(var1.platform);
         }

         if (var1.user != null) {
            var2.name("user").value(var3, var1.user);
         }

         if (var1.serverName != null) {
            var2.name("server_name").value(var1.serverName);
         }

         if (var1.dist != null) {
            var2.name("dist").value(var1.dist);
         }

         if (var1.breadcrumbs != null && !var1.breadcrumbs.isEmpty()) {
            var2.name("breadcrumbs").value(var3, var1.breadcrumbs);
         }

         if (var1.debugMeta != null) {
            var2.name("debug_meta").value(var3, var1.debugMeta);
         }

         if (var1.extra != null && !var1.extra.isEmpty()) {
            var2.name("extra").value(var3, var1.extra);
         }
      }
   }
}
