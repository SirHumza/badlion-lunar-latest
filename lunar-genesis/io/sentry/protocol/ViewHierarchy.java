package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ViewHierarchy implements JsonSerializable, JsonUnknown {
   @Nullable
   private final String renderingSystem;
   @Nullable
   private final List<ViewHierarchyNode> windows;
   @Nullable
   private Map<String, Object> unknown;

   public ViewHierarchy(@Nullable String var1, @Nullable List<ViewHierarchyNode> var2) {
      this.renderingSystem = var1;
      this.windows = var2;
   }

   @Nullable
   public String getRenderingSystem() {
      return this.renderingSystem;
   }

   @Nullable
   public List<ViewHierarchyNode> getWindows() {
      return this.windows;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.renderingSystem != null) {
         var1.name("rendering_system").value(this.renderingSystem);
      }

      if (this.windows != null) {
         var1.name("windows").value(var2, this.windows);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
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

   public static final class Deserializer implements JsonDeserializer<ViewHierarchy> {
      @NotNull
      public ViewHierarchy deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         String var3 = null;
         List var4 = null;
         HashMap var5 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var6 = var1.nextName();
            switch (var6) {
               case "rendering_system":
                  var3 = var1.nextStringOrNull();
                  break;
               case "windows":
                  var4 = var1.nextListOrNull(var2, new ViewHierarchyNode.Deserializer());
                  break;
               default:
                  if (var5 == null) {
                     var5 = new HashMap();
                  }

                  var1.nextUnknown(var2, var5, var6);
            }
         }

         var1.endObject();
         ViewHierarchy var9 = new ViewHierarchy(var3, var4);
         var9.setUnknown(var5);
         return var9;
      }
   }

   public static final class JsonKeys {
      public static final String RENDERING_SYSTEM = "rendering_system";
      public static final String WINDOWS = "windows";
   }
}
