package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Category extends AbstractModelObject {
   private final String href;
   private final Image[] icons;
   private final String id;
   private final String name;

   private Category(Category.Builder builder) {
      super(builder);
      this.href = builder.href;
      this.icons = builder.icons;
      this.id = builder.id;
      this.name = builder.name;
   }

   public String getHref() {
      return this.href;
   }

   public Image[] getIcons() {
      return this.icons;
   }

   public String getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public Category.Builder builder() {
      return new Category.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String href;
      private Image[] icons;
      private String id;
      private String name;

      public Category.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public Category.Builder setIcons(Image... icons) {
         this.icons = icons;
         return this;
      }

      public Category.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public Category.Builder setName(String name) {
         this.name = name;
         return this;
      }

      public Category build() {
         return new Category(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Category> {
      public Category createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Category.Builder()
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setIcons(this.hasAndNotNull(jsonObject, "icons") ? new Image.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("icons")) : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setName(this.hasAndNotNull(jsonObject, "name") ? jsonObject.get("name").getAsString() : null)
               .build()
            : null;
      }
   }
}
