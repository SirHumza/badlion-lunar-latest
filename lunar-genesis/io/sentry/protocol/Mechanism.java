package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Mechanism implements JsonSerializable, JsonUnknown {
   @Nullable
   private final transient Thread thread;
   @Nullable
   private String type;
   @Nullable
   private String description;
   @Nullable
   private String helpLink;
   @Nullable
   private Boolean handled;
   @Nullable
   private Map<String, Object> meta;
   @Nullable
   private Map<String, Object> data;
   @Nullable
   private Boolean synthetic;
   @Nullable
   private Map<String, Object> unknown;

   public Mechanism() {
      this(null);
   }

   public Mechanism(@Nullable Thread var1) {
      this.thread = var1;
   }

   @Nullable
   public String getType() {
      return this.type;
   }

   public void setType(@Nullable String var1) {
      this.type = var1;
   }

   @Nullable
   public String getDescription() {
      return this.description;
   }

   public void setDescription(@Nullable String var1) {
      this.description = var1;
   }

   @Nullable
   public String getHelpLink() {
      return this.helpLink;
   }

   public void setHelpLink(@Nullable String var1) {
      this.helpLink = var1;
   }

   @Nullable
   public Boolean isHandled() {
      return this.handled;
   }

   public void setHandled(@Nullable Boolean var1) {
      this.handled = var1;
   }

   @Nullable
   public Map<String, Object> getMeta() {
      return this.meta;
   }

   public void setMeta(@Nullable Map<String, Object> var1) {
      this.meta = CollectionUtils.newHashMap(var1);
   }

   @Nullable
   public Map<String, Object> getData() {
      return this.data;
   }

   public void setData(@Nullable Map<String, Object> var1) {
      this.data = CollectionUtils.newHashMap(var1);
   }

   @Nullable
   Thread getThread() {
      return this.thread;
   }

   @Nullable
   public Boolean getSynthetic() {
      return this.synthetic;
   }

   public void setSynthetic(@Nullable Boolean var1) {
      this.synthetic = var1;
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
      if (this.type != null) {
         var1.name("type").value(this.type);
      }

      if (this.description != null) {
         var1.name("description").value(this.description);
      }

      if (this.helpLink != null) {
         var1.name("help_link").value(this.helpLink);
      }

      if (this.handled != null) {
         var1.name("handled").value(this.handled);
      }

      if (this.meta != null) {
         var1.name("meta").value(var2, this.meta);
      }

      if (this.data != null) {
         var1.name("data").value(var2, this.data);
      }

      if (this.synthetic != null) {
         var1.name("synthetic").value(this.synthetic);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<Mechanism> {
      @NotNull
      public Mechanism deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         Mechanism var3 = new Mechanism();
         HashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "type":
                  var3.type = var1.nextStringOrNull();
                  break;
               case "description":
                  var3.description = var1.nextStringOrNull();
                  break;
               case "help_link":
                  var3.helpLink = var1.nextStringOrNull();
                  break;
               case "handled":
                  var3.handled = var1.nextBooleanOrNull();
                  break;
               case "meta":
                  var3.meta = CollectionUtils.newConcurrentHashMap((Map<String, Object>)var1.nextObjectOrNull());
                  break;
               case "data":
                  var3.data = CollectionUtils.newConcurrentHashMap((Map<String, Object>)var1.nextObjectOrNull());
                  break;
               case "synthetic":
                  var3.synthetic = var1.nextBooleanOrNull();
                  break;
               default:
                  if (var4 == null) {
                     var4 = new HashMap();
                  }

                  var1.nextUnknown(var2, var4, var5);
            }
         }

         var1.endObject();
         var3.setUnknown(var4);
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String TYPE = "type";
      public static final String DESCRIPTION = "description";
      public static final String HELP_LINK = "help_link";
      public static final String HANDLED = "handled";
      public static final String META = "meta";
      public static final String DATA = "data";
      public static final String SYNTHETIC = "synthetic";
   }
}
