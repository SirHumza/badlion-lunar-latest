package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;

public class SavedTrack extends AbstractModelObject {
   private final Date addedAt;
   private final Track track;

   private SavedTrack(SavedTrack.Builder builder) {
      super(builder);
      this.addedAt = builder.addedAt;
      this.track = builder.track;
   }

   public Date getAddedAt() {
      return this.addedAt;
   }

   public Track getTrack() {
      return this.track;
   }

   public SavedTrack.Builder builder() {
      return new SavedTrack.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Date addedAt;
      private Track track;

      public SavedTrack.Builder setAddedAt(Date addedAt) {
         this.addedAt = addedAt;
         return this;
      }

      public SavedTrack.Builder setTrack(Track track) {
         this.track = track;
         return this;
      }

      public SavedTrack build() {
         return new SavedTrack(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<SavedTrack> {
      public SavedTrack createModelObject(JsonObject jsonObject) {
         if (jsonObject != null && !jsonObject.isJsonNull()) {
            try {
               return new SavedTrack.Builder()
                  .setAddedAt(this.hasAndNotNull(jsonObject, "added_at") ? SpotifyApi.parseDefaultDate(jsonObject.get("added_at").getAsString()) : null)
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
