package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;

public class PlaylistTrack extends AbstractModelObject {
   private final Date addedAt;
   private final User addedBy;
   private final Boolean isLocal;
   private final Track track;

   private PlaylistTrack(PlaylistTrack.Builder builder) {
      super(builder);
      this.addedAt = builder.addedAt;
      this.addedBy = builder.addedBy;
      this.isLocal = builder.isLocal;
      this.track = builder.track;
   }

   public Date getAddedAt() {
      return this.addedAt;
   }

   public User getAddedBy() {
      return this.addedBy;
   }

   public Boolean getIsLocal() {
      return this.isLocal;
   }

   public Track getTrack() {
      return this.track;
   }

   public PlaylistTrack.Builder builder() {
      return new PlaylistTrack.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Date addedAt;
      private User addedBy;
      private Boolean isLocal;
      private Track track;

      public PlaylistTrack.Builder setAddedAt(Date addedAt) {
         this.addedAt = addedAt;
         return this;
      }

      public PlaylistTrack.Builder setAddedBy(User addedBy) {
         this.addedBy = addedBy;
         return this;
      }

      public PlaylistTrack.Builder setIsLocal(Boolean isLocal) {
         this.isLocal = isLocal;
         return this;
      }

      public PlaylistTrack.Builder setTrack(Track track) {
         this.track = track;
         return this;
      }

      public PlaylistTrack build() {
         return new PlaylistTrack(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<PlaylistTrack> {
      public PlaylistTrack createModelObject(JsonObject jsonObject) {
         if (jsonObject != null && !jsonObject.isJsonNull()) {
            try {
               return new PlaylistTrack.Builder()
                  .setAddedAt(this.hasAndNotNull(jsonObject, "added_at") ? SpotifyApi.parseDefaultDate(jsonObject.get("added_at").getAsString()) : null)
                  .setAddedBy(
                     this.hasAndNotNull(jsonObject, "added_by") ? new User.JsonUtil().createModelObject(jsonObject.get("added_by").getAsJsonObject()) : null
                  )
                  .setIsLocal(this.hasAndNotNull(jsonObject, "is_local") ? jsonObject.get("is_local").getAsBoolean() : null)
                  .setTrack(this.hasAndNotNull(jsonObject, "track") ? new Track.JsonUtil().createModelObject(jsonObject.getAsJsonObject("track")) : null)
                  .build();
            } catch (ParseException e) {
               SpotifyApi.LOGGER.log(Level.SEVERE, e.getMessage());
               return null;
            }
         } else {
            return null;
         }
      }
   }
}
