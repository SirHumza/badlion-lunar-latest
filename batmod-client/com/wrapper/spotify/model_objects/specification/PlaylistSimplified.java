package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import com.wrapper.spotify.model_objects.miscellaneous.PlaylistTracksInformation;
import com.wrapper.spotify.requests.data.search.interfaces.ISearchModelObject;

public class PlaylistSimplified extends AbstractModelObject implements ISearchModelObject {
   private final Boolean collaborative;
   private final ExternalUrl externalUrls;
   private final String href;
   private final String id;
   private final Image[] images;
   private final String name;
   private final User owner;
   private final Boolean publicAccess;
   private final String snapshotId;
   private final PlaylistTracksInformation tracks;
   private final ModelObjectType type;
   private final String uri;

   private PlaylistSimplified(PlaylistSimplified.Builder builder) {
      super(builder);
      this.collaborative = builder.collaborative;
      this.externalUrls = builder.externalUrls;
      this.href = builder.href;
      this.id = builder.id;
      this.images = builder.images;
      this.name = builder.name;
      this.owner = builder.owner;
      this.publicAccess = builder.publicAccess;
      this.snapshotId = builder.snapshotId;
      this.tracks = builder.tracks;
      this.type = builder.type;
      this.uri = builder.uri;
   }

   public Boolean getIsCollaborative() {
      return this.collaborative;
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

   public Image[] getImages() {
      return this.images;
   }

   public String getName() {
      return this.name;
   }

   public User getOwner() {
      return this.owner;
   }

   public Boolean getIsPublicAccess() {
      return this.publicAccess;
   }

   public String getSnapshotId() {
      return this.snapshotId;
   }

   public PlaylistTracksInformation getTracks() {
      return this.tracks;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public PlaylistSimplified.Builder builder() {
      return new PlaylistSimplified.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Boolean collaborative;
      private ExternalUrl externalUrls;
      private String href;
      private String id;
      private Image[] images;
      private String name;
      private User owner;
      private Boolean publicAccess;
      private String snapshotId;
      private PlaylistTracksInformation tracks;
      private ModelObjectType type;
      private String uri;

      public PlaylistSimplified.Builder setCollaborative(Boolean collaborative) {
         this.collaborative = collaborative;
         return this;
      }

      public PlaylistSimplified.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public PlaylistSimplified.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public PlaylistSimplified.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public PlaylistSimplified.Builder setImages(Image... images) {
         this.images = images;
         return this;
      }

      public PlaylistSimplified.Builder setName(String name) {
         this.name = name;
         return this;
      }

      public PlaylistSimplified.Builder setOwner(User owner) {
         this.owner = owner;
         return this;
      }

      public PlaylistSimplified.Builder setPublicAccess(Boolean publicAccess) {
         this.publicAccess = publicAccess;
         return this;
      }

      public PlaylistSimplified.Builder setSnapshotId(String snapshotId) {
         this.snapshotId = snapshotId;
         return this;
      }

      public PlaylistSimplified.Builder setTracks(PlaylistTracksInformation tracks) {
         this.tracks = tracks;
         return this;
      }

      public PlaylistSimplified.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public PlaylistSimplified.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public PlaylistSimplified build() {
         return new PlaylistSimplified(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<PlaylistSimplified> {
      public PlaylistSimplified createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new PlaylistSimplified.Builder()
               .setCollaborative(this.hasAndNotNull(jsonObject, "collaborative") ? jsonObject.get("collaborative").getAsBoolean() : null)
               .setExternalUrls(
                  this.hasAndNotNull(jsonObject, "external_urls")
                     ? new ExternalUrl.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_urls"))
                     : null
               )
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setImages(this.hasAndNotNull(jsonObject, "images") ? new Image.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("images")) : null)
               .setName(this.hasAndNotNull(jsonObject, "name") ? jsonObject.get("name").getAsString() : null)
               .setOwner(this.hasAndNotNull(jsonObject, "owner") ? new User.JsonUtil().createModelObject(jsonObject.getAsJsonObject("owner")) : null)
               .setPublicAccess(this.hasAndNotNull(jsonObject, "public") ? jsonObject.get("public").getAsBoolean() : null)
               .setSnapshotId(this.hasAndNotNull(jsonObject, "snapshot_id") ? jsonObject.get("snapshot_id").getAsString() : null)
               .setTracks(
                  this.hasAndNotNull(jsonObject, "tracks")
                     ? new PlaylistTracksInformation.JsonUtil().createModelObject(jsonObject.getAsJsonObject("tracks"))
                     : null
               )
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
