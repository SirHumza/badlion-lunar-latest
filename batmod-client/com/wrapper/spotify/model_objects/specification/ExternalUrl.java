package com.wrapper.spotify.model_objects.specification;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import java.util.Map;

public class ExternalUrl extends AbstractModelObject {
   private final Map<String, String> externalUrls;

   private ExternalUrl(ExternalUrl.Builder builder) {
      super(builder);
      this.externalUrls = builder.externalUrls;
   }

   public String get(String key) {
      return this.externalUrls.get(key);
   }

   public Map<String, String> getExternalUrls() {
      return this.externalUrls;
   }

   public ExternalUrl.Builder builder() {
      return new ExternalUrl.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Map<String, String> externalUrls;

      public ExternalUrl.Builder setExternalUrls(Map<String, String> externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public ExternalUrl build() {
         return new ExternalUrl(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<ExternalUrl> {
      public ExternalUrl createModelObject(JsonObject jsonObject) {
         if (jsonObject != null && !jsonObject.isJsonNull()) {
            Map<String, String> map = (Map<String, String>)new Gson().fromJson(jsonObject, Map.class);
            return new ExternalUrl.Builder().setExternalUrls(map).build();
         } else {
            return null;
         }
      }
   }
}
