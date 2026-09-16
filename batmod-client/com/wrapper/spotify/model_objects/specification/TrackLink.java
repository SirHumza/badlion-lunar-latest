package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class TrackLink extends AbstractModelObject {
   private final ExternalUrl externalUrls;
   private final String href;
   private final String id;
   private final ModelObjectType type;
   private final String uri;

   private TrackLink(TrackLink.Builder builder) {
      super(builder);
      this.externalUrls = builder.externalUrls;
      this.href = builder.href;
      this.id = builder.id;
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

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public TrackLink.Builder builder() {
      return new TrackLink.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private ExternalUrl externalUrls;
      private String href;
      private String id;
      private ModelObjectType type;
      private String uri;

      public TrackLink.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public TrackLink.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public TrackLink.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public TrackLink.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public TrackLink.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public TrackLink build() {
         return new TrackLink(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<TrackLink> {
      public TrackLink createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new TrackLink.Builder()
               .setExternalUrls(
                  this.hasAndNotNull(jsonObject, "external_urls")
                     ? new ExternalUrl.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_urls"))
                     : null
               )
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
