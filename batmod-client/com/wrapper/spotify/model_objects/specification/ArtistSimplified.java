package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class ArtistSimplified extends AbstractModelObject {
   private final ExternalUrl externalUrls;
   private final String href;
   private final String id;
   private final String name;
   private final ModelObjectType type;
   private final String uri;

   private ArtistSimplified(ArtistSimplified.Builder builder) {
      super(builder);
      this.externalUrls = builder.externalUrls;
      this.href = builder.href;
      this.id = builder.id;
      this.name = builder.name;
      this.type = builder.type;
      this.uri = builder.uri;
   }

   public ExternalUrl getExternalUrls() {
      return this.externalUrls;
   }

   public String getHref() {
      return this.href;
   }

   public String getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public ArtistSimplified.Builder builder() {
      return new ArtistSimplified.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private ExternalUrl externalUrls;
      private String href;
      private String id;
      private String name;
      private ModelObjectType type;
      private String uri;

      public ArtistSimplified.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public ArtistSimplified.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public ArtistSimplified.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public ArtistSimplified.Builder setName(String name) {
         this.name = name;
         return this;
      }

      public ArtistSimplified.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public ArtistSimplified.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public ArtistSimplified build() {
         return new ArtistSimplified(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<ArtistSimplified> {
      public ArtistSimplified createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new ArtistSimplified.Builder()
               .setExternalUrls(
                  this.hasAndNotNull(jsonObject, "external_urls")
                     ? new ExternalUrl.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_urls"))
                     : null
               )
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setName(this.hasAndNotNull(jsonObject, "name") ? jsonObject.get("name").getAsString() : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
