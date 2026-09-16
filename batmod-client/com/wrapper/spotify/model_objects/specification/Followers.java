package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Followers extends AbstractModelObject {
   private final String href;
   private final Integer total;

   private Followers(Followers.Builder builder) {
      super(builder);
      this.href = builder.href;
      this.total = builder.total;
   }

   public String getHref() {
      return this.href;
   }

   public Integer getTotal() {
      return this.total;
   }

   public Followers.Builder builder() {
      return new Followers.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String href;
      private Integer total;

      public Followers.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public Followers.Builder setTotal(Integer total) {
         this.total = total;
         return this;
      }

      public Followers build() {
         return new Followers(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Followers> {
      public Followers createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Followers.Builder()
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setTotal(this.hasAndNotNull(jsonObject, "total") ? jsonObject.get("total").getAsInt() : null)
               .build()
            : null;
      }
   }
}
