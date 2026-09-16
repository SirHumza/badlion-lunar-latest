package com.wrapper.spotify.model_objects.specification;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import java.util.Map;

public class ExternalId extends AbstractModelObject {
   private final Map<String, String> externalIds;

   private ExternalId(ExternalId.Builder builder) {
      super(builder);
      this.externalIds = builder.externalIds;
   }

   public Map<String, String> getExternalIds() {
      return this.externalIds;
   }

   public ExternalId.Builder builder() {
      return new ExternalId.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Map<String, String> externalIds;

      public ExternalId.Builder setExternalIds(Map<String, String> externalIds) {
         this.externalIds = externalIds;
         return this;
      }

      public ExternalId build() {
         return new ExternalId(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<ExternalId> {
      public ExternalId createModelObject(JsonObject jsonObject) {
         if (jsonObject != null && !jsonObject.isJsonNull()) {
            Map<String, String> map = (Map<String, String>)new Gson().fromJson(jsonObject, Map.class);
            return new ExternalId.Builder().setExternalIds(map).build();
         } else {
            return null;
         }
      }
   }
}
