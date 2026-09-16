package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;

public class PlayHistory extends AbstractModelObject {
   private final TrackSimplified track;
   private final Date playedAt;
   private final Context context;

   private PlayHistory(PlayHistory.Builder builder) {
      super(builder);
      this.track = builder.track;
      this.playedAt = builder.playedAt;
      this.context = builder.context;
   }

   public TrackSimplified getTrack() {
      return this.track;
   }

   public Date getPlayedAt() {
      return this.playedAt;
   }

   public Context getContext() {
      return this.context;
   }

   public PlayHistory.Builder builder() {
      return new PlayHistory.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private TrackSimplified track;
      private Date playedAt;
      private Context context;

      public PlayHistory.Builder setTrack(TrackSimplified track) {
         this.track = track;
         return this;
      }

      public PlayHistory.Builder setPlayedAt(Date playedAt) {
         this.playedAt = playedAt;
         return this;
      }

      public PlayHistory.Builder setContext(Context context) {
         this.context = context;
         return this;
      }

      public PlayHistory build() {
         return new PlayHistory(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<PlayHistory> {
      public PlayHistory createModelObject(JsonObject jsonObject) {
         if (jsonObject != null && !jsonObject.isJsonNull()) {
            try {
               return new PlayHistory.Builder()
                  .setTrack(
                     this.hasAndNotNull(jsonObject, "track") ? new TrackSimplified.JsonUtil().createModelObject(jsonObject.getAsJsonObject("track")) : null
                  )
                  .setPlayedAt(this.hasAndNotNull(jsonObject, "played_at") ? SpotifyApi.parseDefaultDate(jsonObject.get("played_at").getAsString()) : null)
                  .setContext(
                     this.hasAndNotNull(jsonObject, "context") ? new Context.JsonUtil().createModelObject(jsonObject.getAsJsonObject("context")) : null
                  )
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
