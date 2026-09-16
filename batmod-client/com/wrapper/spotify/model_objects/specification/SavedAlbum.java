package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;

public class SavedAlbum extends AbstractModelObject {
   private final Date addedAt;
   private final Album album;

   private SavedAlbum(SavedAlbum.Builder builder) {
      super(builder);
      this.addedAt = builder.addedAt;
      this.album = builder.album;
   }

   public Date getAddedAt() {
      return this.addedAt;
   }

   public Album getAlbum() {
      return this.album;
   }

   public SavedAlbum.Builder builder() {
      return new SavedAlbum.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Date addedAt;
      private Album album;

      public SavedAlbum.Builder setAddedAt(Date addedAt) {
         this.addedAt = addedAt;
         return this;
      }

      public SavedAlbum.Builder setAlbum(Album album) {
         this.album = album;
         return this;
      }

      public SavedAlbum build() {
         return new SavedAlbum(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<SavedAlbum> {
      public SavedAlbum createModelObject(JsonObject jsonObject) {
         if (jsonObject != null && !jsonObject.isJsonNull()) {
            try {
               return new SavedAlbum.Builder()
                  .setAddedAt(this.hasAndNotNull(jsonObject, "added_at") ? SpotifyApi.parseDefaultDate(jsonObject.get("added_at").getAsString()) : null)
                  .setAlbum(this.hasAndNotNull(jsonObject, "album") ? new Album.JsonUtil().createModelObject(jsonObject.getAsJsonObject("album")) : null)
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
