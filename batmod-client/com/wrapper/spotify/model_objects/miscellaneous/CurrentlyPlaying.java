package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import com.wrapper.spotify.model_objects.specification.Context;
import com.wrapper.spotify.model_objects.specification.Track;

public class CurrentlyPlaying extends AbstractModelObject {
   private final Context context;
   private final Long timestamp;
   private final Integer progress_ms;
   private final Boolean is_playing;
   private final Track item;

   private CurrentlyPlaying(CurrentlyPlaying.Builder builder) {
      super(builder);
      this.context = builder.context;
      this.timestamp = builder.timestamp;
      this.progress_ms = builder.progress_ms;
      this.is_playing = builder.is_playing;
      this.item = builder.item;
   }

   public Context getContext() {
      return this.context;
   }

   public Long getTimestamp() {
      return this.timestamp;
   }

   public Integer getProgress_ms() {
      return this.progress_ms;
   }

   public Boolean getIs_playing() {
      return this.is_playing;
   }

   public Track getItem() {
      return this.item;
   }

   public CurrentlyPlaying.Builder builder() {
      return new CurrentlyPlaying.Builder();
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (obj == null) {
         return false;
      }

      if (!(obj instanceof CurrentlyPlaying)) {
         return false;
      }

      CurrentlyPlaying other = (CurrentlyPlaying)obj;
      return this.getItem() != null
         && other.getItem() != null
         && this.getItem().getUri() != null
         && other.getItem().getUri() != null
         && this.getItem().getUri().equals(other.getItem().getUri());
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Context context;
      private Long timestamp;
      private Integer progress_ms;
      private Boolean is_playing;
      private Track item;

      public CurrentlyPlaying.Builder setContext(Context context) {
         this.context = context;
         return this;
      }

      public CurrentlyPlaying.Builder setTimestamp(Long timestamp) {
         this.timestamp = timestamp;
         return this;
      }

      public CurrentlyPlaying.Builder setProgress_ms(Integer progress_ms) {
         this.progress_ms = progress_ms;
         return this;
      }

      public CurrentlyPlaying.Builder setIs_playing(Boolean is_playing) {
         this.is_playing = is_playing;
         return this;
      }

      public CurrentlyPlaying.Builder setItem(Track item) {
         this.item = item;
         return this;
      }

      public CurrentlyPlaying build() {
         return new CurrentlyPlaying(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<CurrentlyPlaying> {
      public CurrentlyPlaying createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new CurrentlyPlaying.Builder()
               .setContext(this.hasAndNotNull(jsonObject, "context") ? new Context.JsonUtil().createModelObject(jsonObject.getAsJsonObject("context")) : null)
               .setTimestamp(this.hasAndNotNull(jsonObject, "timestamp") ? jsonObject.get("timestamp").getAsLong() : null)
               .setProgress_ms(this.hasAndNotNull(jsonObject, "progress_ms") ? jsonObject.get("progress_ms").getAsInt() : null)
               .setIs_playing(this.hasAndNotNull(jsonObject, "is_playing") ? jsonObject.get("is_playing").getAsBoolean() : null)
               .setItem(this.hasAndNotNull(jsonObject, "item") ? new Track.JsonUtil().createModelObject(jsonObject.getAsJsonObject("item")) : null)
               .build()
            : null;
      }
   }
}
