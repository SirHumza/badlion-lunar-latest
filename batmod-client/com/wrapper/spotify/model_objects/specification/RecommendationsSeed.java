package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class RecommendationsSeed extends AbstractModelObject {
   private final Integer afterFilteringSize;
   private final Integer afterRelinkingSize;
   private final String href;
   private final String id;
   private final Integer initialPoolSize;
   private final ModelObjectType type;

   private RecommendationsSeed(RecommendationsSeed.Builder builder) {
      super(builder);
      this.afterFilteringSize = builder.afterFilteringSize;
      this.afterRelinkingSize = builder.afterRelinkingSize;
      this.href = builder.href;
      this.id = builder.id;
      this.initialPoolSize = builder.initialPoolSize;
      this.type = builder.type;
   }

   public Integer getAfterFilteringSize() {
      return this.afterFilteringSize;
   }

   public Integer getAfterRelinkingSize() {
      return this.afterRelinkingSize;
   }

   public String getHref() {
      return this.href;
   }

   public String getId() {
      return this.id;
   }

   public Integer getInitialPoolSize() {
      return this.initialPoolSize;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public RecommendationsSeed.Builder builder() {
      return new RecommendationsSeed.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Integer afterFilteringSize;
      private Integer afterRelinkingSize;
      private String href;
      private String id;
      private Integer initialPoolSize;
      private ModelObjectType type;

      public RecommendationsSeed.Builder setAfterFilteringSize(Integer afterFilteringSize) {
         this.afterFilteringSize = afterFilteringSize;
         return this;
      }

      public RecommendationsSeed.Builder setAfterRelinkingSize(Integer afterRelinkingSize) {
         this.afterRelinkingSize = afterRelinkingSize;
         return this;
      }

      public RecommendationsSeed.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public RecommendationsSeed.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public RecommendationsSeed.Builder setInitialPoolSize(Integer initialPoolSize) {
         this.initialPoolSize = initialPoolSize;
         return this;
      }

      public RecommendationsSeed.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public RecommendationsSeed build() {
         return new RecommendationsSeed(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<RecommendationsSeed> {
      public RecommendationsSeed createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new RecommendationsSeed.Builder()
               .setAfterFilteringSize(this.hasAndNotNull(jsonObject, "afterFilteringSize") ? jsonObject.get("afterFilteringSize").getAsInt() : null)
               .setAfterRelinkingSize(this.hasAndNotNull(jsonObject, "afterRelinkingSize") ? jsonObject.get("afterRelinkingSize").getAsInt() : null)
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setInitialPoolSize(this.hasAndNotNull(jsonObject, "initialPoolSize") ? jsonObject.get("initialPoolSize").getAsInt() : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .build()
            : null;
      }
   }
}
