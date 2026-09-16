package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Image extends AbstractModelObject {
   private final Integer height;
   private final String url;
   private final Integer width;

   private Image(Image.Builder builder) {
      super(builder);
      this.height = builder.height;
      this.url = builder.url;
      this.width = builder.width;
   }

   public Integer getHeight() {
      return this.height;
   }

   public String getUrl() {
      return this.url;
   }

   public Integer getWidth() {
      return this.width;
   }

   public Image.Builder builder() {
      return new Image.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Integer height;
      private String url;
      private Integer width;

      public Image.Builder setHeight(Integer height) {
         this.height = height;
         return this;
      }

      public Image.Builder setUrl(String url) {
         this.url = url;
         return this;
      }

      public Image.Builder setWidth(Integer width) {
         this.width = width;
         return this;
      }

      public Image build() {
         return new Image(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Image> {
      public Image createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Image.Builder()
               .setHeight(this.hasAndNotNull(jsonObject, "height") ? jsonObject.get("height").getAsInt() : null)
               .setUrl(this.hasAndNotNull(jsonObject, "url") ? jsonObject.get("url").getAsString() : null)
               .setWidth(this.hasAndNotNull(jsonObject, "width") ? jsonObject.get("width").getAsInt() : null)
               .build()
            : null;
      }
   }
}
