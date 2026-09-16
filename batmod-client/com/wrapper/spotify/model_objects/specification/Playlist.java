package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Playlist extends AbstractModelObject {
   private final Boolean collaborative;
   private final String description;
   private final ExternalUrl externalUrls;
   private final Followers followers;
   private final String href;
   private final String id;
   private final Image[] images;
   private final String name;
   private final User owner;
   private final Boolean publicAccess;
   private final String snapshotId;
   private final Paging<PlaylistTrack> tracks;
   private final ModelObjectType type;
   private final String uri;

   private Playlist(Playlist.Builder builder) {
      super(builder);
      this.collaborative = builder.collaborative;
      this.description = builder.description;
      this.externalUrls = builder.externalUrls;
      this.followers = builder.followers;
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

   public String getDescription() {
      return this.description;
   }

   public ExternalUrl getExternalUrls() {
      return this.externalUrls;
   }

   public Followers getFollowers() {
      return this.followers;
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

   public Paging<PlaylistTrack> getTracks() {
      return this.tracks;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public Playlist.Builder builder() {
      return new Playlist.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Boolean collaborative;
      private String description;
      private ExternalUrl externalUrls;
      private Followers followers;
      private String href;
      private String id;
      private Image[] images;
      private String name;
      private User owner;
      private Boolean publicAccess;
      private String snapshotId;
      private Paging<PlaylistTrack> tracks;
      private ModelObjectType type;
      private String uri;

      public Playlist.Builder setCollaborative(Boolean collaborative) {
         this.collaborative = collaborative;
         return this;
      }

      public Playlist.Builder setDescription(String description) {
         this.description = description;
         return this;
      }

      public Playlist.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public Playlist.Builder setFollowers(Followers followers) {
         this.followers = followers;
         return this;
      }

      public Playlist.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public Playlist.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public Playlist.Builder setImages(Image... images) {
         this.images = images;
         return this;
      }

      public Playlist.Builder setName(String name) {
         this.name = name;
         return this;
      }

      public Playlist.Builder setOwner(User owner) {
         this.owner = owner;
         return this;
      }

      public Playlist.Builder setPublicAccess(Boolean publicAccess) {
         this.publicAccess = publicAccess;
         return this;
      }

      public Playlist.Builder setSnapshotId(String snapshotId) {
         this.snapshotId = snapshotId;
         return this;
      }

      public Playlist.Builder setTracks(Paging<PlaylistTrack> tracks) {
         this.tracks = tracks;
         return this;
      }

      public Playlist.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public Playlist.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public Playlist build() {
         return new Playlist(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Playlist> {
      public Playlist createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Playlist.Builder()
               .setCollaborative(this.hasAndNotNull(jsonObject, "collaborative") ? jsonObject.get("collaborative").getAsBoolean() : null)
               .setDescription(this.hasAndNotNull(jsonObject, "description") ? jsonObject.get("description").getAsString() : null)
               .setExternalUrls(
                  this.hasAndNotNull(jsonObject, "external_urls")
                     ? new ExternalUrl.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_urls"))
                     : null
               )
               .setFollowers(
                  this.hasAndNotNull(jsonObject, "followers") ? new Followers.JsonUtil().createModelObject(jsonObject.getAsJsonObject("followers")) : null
               )
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setImages(this.hasAndNotNull(jsonObject, "images") ? new Image.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("images")) : null)
               .setName(this.hasAndNotNull(jsonObject, "name") ? jsonObject.get("name").getAsString() : null)
               .setOwner(this.hasAndNotNull(jsonObject, "owner") ? new User.JsonUtil().createModelObject(jsonObject.getAsJsonObject("owner")) : null)
               .setPublicAccess(this.hasAndNotNull(jsonObject, "public") ? jsonObject.get("public").getAsBoolean() : null)
               .setSnapshotId(this.hasAndNotNull(jsonObject, "snapshot_id") ? jsonObject.get("snapshot_id").getAsString() : null)
               .setTracks(
                  this.hasAndNotNull(jsonObject, "tracks") ? new PlaylistTrack.JsonUtil().createModelObjectPaging(jsonObject.getAsJsonObject("tracks")) : null
               )
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
