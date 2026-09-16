package com.wrapper.spotify.model_objects.special;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PlaylistSimplified;

public class FeaturedPlaylists extends AbstractModelObject {
   private final String message;
   private final Paging<PlaylistSimplified> playlists;

   private FeaturedPlaylists(FeaturedPlaylists.Builder builder) {
      super(builder);
      this.message = builder.message;
      this.playlists = builder.playlists;
   }

   public String getMessage() {
      return this.message;
   }

   public Paging<PlaylistSimplified> getPlaylists() {
      return this.playlists;
   }

   public FeaturedPlaylists.Builder builder() {
      return new FeaturedPlaylists.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String message;
      private Paging<PlaylistSimplified> playlists;

      public FeaturedPlaylists.Builder setMessage(String message) {
         this.message = message;
         return this;
      }

      public FeaturedPlaylists.Builder setPlaylists(Paging<PlaylistSimplified> playlists) {
         this.playlists = playlists;
         return this;
      }

      public FeaturedPlaylists build() {
         return new FeaturedPlaylists(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<FeaturedPlaylists> {
      public FeaturedPlaylists createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new FeaturedPlaylists.Builder()
               .setMessage(this.hasAndNotNull(jsonObject, "message") ? jsonObject.get("message").getAsString() : null)
               .setPlaylists(
                  this.hasAndNotNull(jsonObject, "playlists")
                     ? new PlaylistSimplified.JsonUtil().createModelObjectPaging(jsonObject.getAsJsonObject("playlists"))
                     : null
               )
               .build()
            : null;
      }
   }
}
