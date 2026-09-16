package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Context extends AbstractModelObject {
   private final ModelObjectType type;
   private final String href;
   private final ExternalUrl externalUrls;
   private final String uri;

   private Context(Context.Builder builder) {
      super(builder);
      this.type = builder.type;
      this.href = builder.href;
      this.externalUrls = builder.externalUrls;
      this.uri = builder.uri;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getHref() {
      return this.href;
   }

   public ExternalUrl getExternalUrls() {
      return this.externalUrls;
   }

   public String getUri() {
      return this.uri;
   }

   public Context.Builder builder() {
      return new Context.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private ModelObjectType type;
      private String href;
      private ExternalUrl externalUrls;
      private String uri;

      public Context.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public Context.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public Context.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public Context.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public Context build() {
         return new Context(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Context> {
      public Context createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Context.Builder()
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setExternalUrls(
                  this.hasAndNotNull(jsonObject, "external_urls")
                     ? new ExternalUrl.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_urls"))
                     : null
               )
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
