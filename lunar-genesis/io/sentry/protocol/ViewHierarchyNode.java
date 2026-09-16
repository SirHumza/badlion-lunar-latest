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

public final class ViewHierarchyNode implements JsonSerializable, JsonUnknown {
   @Nullable
   private String renderingSystem;
   @Nullable
   private String type;
   @Nullable
   private String identifier;
   @Nullable
   private String tag;
   @Nullable
   private Double width;
   @Nullable
   private Double height;
   @Nullable
   private Double x;
   @Nullable
   private Double y;
   @Nullable
   private String visibility;
   @Nullable
   private Double alpha;
   @Nullable
   private List<ViewHierarchyNode> children;
   @Nullable
   private Map<String, Object> unknown;

   public void setRenderingSystem(String var1) {
      this.renderingSystem = var1;
   }

   public void setType(String var1) {
      this.type = var1;
   }

   public void setIdentifier(@Nullable String var1) {
      this.identifier = var1;
   }

   public void setTag(@Nullable String var1) {
      this.tag = var1;
   }

   public void setWidth(@Nullable Double var1) {
      this.width = var1;
   }

   public void setHeight(@Nullable Double var1) {
      this.height = var1;
   }

   public void setX(@Nullable Double var1) {
      this.x = var1;
   }

   public void setY(@Nullable Double var1) {
      this.y = var1;
   }

   public void setVisibility(@Nullable String var1) {
      this.visibility = var1;
   }

   public void setAlpha(@Nullable Double var1) {
      this.alpha = var1;
   }

   public void setChildren(@Nullable List<ViewHierarchyNode> var1) {
      this.children = var1;
   }

   @Nullable
   public String getRenderingSystem() {
      return this.renderingSystem;
   }

   @Nullable
   public String getType() {
      return this.type;
   }

   @Nullable
   public String getIdentifier() {
      return this.identifier;
   }

   @Nullable
   public String getTag() {
      return this.tag;
   }

   @Nullable
   public Double getWidth() {
      return this.width;
   }

   @Nullable
   public Double getHeight() {
      return this.height;
   }

   @Nullable
   public Double getX() {
      return this.x;
   }

   @Nullable
   public Double getY() {
      return this.y;
   }

   @Nullable
   public String getVisibility() {
      return this.visibility;
   }

   @Nullable
   public Double getAlpha() {
      return this.alpha;
   }

   @Nullable
   public List<ViewHierarchyNode> getChildren() {
      return this.children;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.renderingSystem != null) {
         var1.name("rendering_system").value(this.renderingSystem);
      }

      if (this.type != null) {
         var1.name("type").value(this.type);
      }

      if (this.identifier != null) {
         var1.name("identifier").value(this.identifier);
      }

      if (this.tag != null) {
         var1.name("tag").value(this.tag);
      }

      if (this.width != null) {
         var1.name("width").value(this.width);
      }

      if (this.height != null) {
         var1.name("height").value(this.height);
      }

      if (this.x != null) {
         var1.name("x").value(this.x);
      }

      if (this.y != null) {
         var1.name("y").value(this.y);
      }

      if (this.visibility != null) {
         var1.name("visibility").value(this.visibility);
      }

      if (this.alpha != null) {
         var1.name("alpha").value(this.alpha);
      }

      if (this.children != null && !this.children.isEmpty()) {
         var1.name("children").value(var2, this.children);
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

   public static final class Deserializer implements JsonDeserializer<ViewHierarchyNode> {
      @NotNull
      public ViewHierarchyNode deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         HashMap var3 = null;
         ViewHierarchyNode var4 = new ViewHierarchyNode();
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "rendering_system":
                  var4.renderingSystem = var1.nextStringOrNull();
                  break;
               case "type":
                  var4.type = var1.nextStringOrNull();
                  break;
               case "identifier":
                  var4.identifier = var1.nextStringOrNull();
                  break;
               case "tag":
                  var4.tag = var1.nextStringOrNull();
                  break;
               case "width":
                  var4.width = var1.nextDoubleOrNull();
                  break;
               case "height":
                  var4.height = var1.nextDoubleOrNull();
                  break;
               case "x":
                  var4.x = var1.nextDoubleOrNull();
                  break;
               case "y":
                  var4.y = var1.nextDoubleOrNull();
                  break;
               case "visibility":
                  var4.visibility = var1.nextStringOrNull();
                  break;
               case "alpha":
                  var4.alpha = var1.nextDoubleOrNull();
                  break;
               case "children":
                  var4.children = var1.nextListOrNull(var2, this);
                  break;
               default:
                  if (var3 == null) {
                     var3 = new HashMap();
                  }

                  var1.nextUnknown(var2, var3, var5);
            }
         }

         var1.endObject();
         var4.setUnknown(var3);
         return var4;
      }
   }

   public static final class JsonKeys {
      public static final String RENDERING_SYSTEM = "rendering_system";
      public static final String TYPE = "type";
      public static final String IDENTIFIER = "identifier";
      public static final String TAG = "tag";
      public static final String WIDTH = "width";
      public static final String HEIGHT = "height";
      public static final String X = "x";
      public static final String Y = "y";
      public static final String VISIBILITY = "visibility";
      public static final String ALPHA = "alpha";
      public static final String CHILDREN = "children";
   }
}
