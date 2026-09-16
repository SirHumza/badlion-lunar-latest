package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import com.wrapper.spotify.model_objects.specification.Context;
import com.wrapper.spotify.model_objects.specification.Track;

public class CurrentlyPlayingContext extends AbstractModelObject {
   private final Device device;
   private final String repeat_state;
   private final Boolean shuffle_state;
   private final Context context;
   private final Long timestamp;
   private final Integer progress_ms;
   private final Boolean is_playing;
   private final Track item;

   private CurrentlyPlayingContext(CurrentlyPlayingContext.Builder builder) {
      super(builder);
      this.device = builder.device;
      this.repeat_state = builder.repeat_state;
      this.shuffle_state = builder.shuffle_state;
      this.context = builder.context;
      this.timestamp = builder.timestamp;
      this.progress_ms = builder.progress_ms;
      this.is_playing = builder.is_playing;
      this.item = builder.item;
   }

   public Device getDevice() {
      return this.device;
   }

   public String getRepeat_state() {
      return this.repeat_state;
   }

   public Boolean getShuffle_state() {
      return this.shuffle_state;
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

   public CurrentlyPlayingContext.Builder builder() {
      return new CurrentlyPlayingContext.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Device device;
      private String repeat_state;
      private Boolean shuffle_state;
      private Context context;
      private Long timestamp;
      private Integer progress_ms;
      private Boolean is_playing;
      private Track item;

      public CurrentlyPlayingContext.Builder setDevice(Device device) {
         this.device = device;
         return this;
      }

      public CurrentlyPlayingContext.Builder setRepeat_state(String repeat_state) {
         this.repeat_state = repeat_state;
         return this;
      }

      public CurrentlyPlayingContext.Builder setShuffle_state(Boolean shuffle_state) {
         this.shuffle_state = shuffle_state;
         return this;
      }

      public CurrentlyPlayingContext.Builder setContext(Context context) {
         this.context = context;
         return this;
      }

      public CurrentlyPlayingContext.Builder setTimestamp(Long timestamp) {
         this.timestamp = timestamp;
         return this;
      }

      public CurrentlyPlayingContext.Builder setProgress_ms(Integer progress_ms) {
         this.progress_ms = progress_ms;
         return this;
      }

      public CurrentlyPlayingContext.Builder setIs_playing(Boolean is_playing) {
         this.is_playing = is_playing;
         return this;
      }

      public CurrentlyPlayingContext.Builder setItem(Track item) {
         this.item = item;
         return this;
      }

      public CurrentlyPlayingContext build() {
         return new CurrentlyPlayingContext(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<CurrentlyPlayingContext> {
      public CurrentlyPlayingContext createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new CurrentlyPlayingContext.Builder()
               .setDevice(this.hasAndNotNull(jsonObject, "device") ? new Device.JsonUtil().createModelObject(jsonObject.getAsJsonObject("device")) : null)
               .setRepeat_state(this.hasAndNotNull(jsonObject, "repeat_state") ? jsonObject.get("repeat_state").getAsString() : null)
               .setShuffle_state(this.hasAndNotNull(jsonObject, "shuffle_state") ? jsonObject.get("shuffle_state").getAsBoolean() : null)
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
