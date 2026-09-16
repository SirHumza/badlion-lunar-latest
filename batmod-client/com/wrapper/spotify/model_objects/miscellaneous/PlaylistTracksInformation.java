package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class PlaylistTracksInformation extends AbstractModelObject {
   private final String href;
   private final Integer total;

   private PlaylistTracksInformation(PlaylistTracksInformation.Builder builder) {
      super(builder);
      this.href = builder.href;
      this.total = builder.total;
   }

   public String getHref() {
      return this.href;
   }

   public Integer getTotal() {
      return this.total;
   }

   public PlaylistTracksInformation.Builder builder() {
      return new PlaylistTracksInformation.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String href;
      private Integer total;

      public PlaylistTracksInformation.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public PlaylistTracksInformation.Builder setTotal(Integer total) {
         this.total = total;
         return this;
      }

      public PlaylistTracksInformation build() {
         return new PlaylistTracksInformation(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<PlaylistTracksInformation> {
      public PlaylistTracksInformation createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new PlaylistTracksInformation.Builder()
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setTotal(this.hasAndNotNull(jsonObject, "total") ? jsonObject.get("total").getAsInt() : null)
               .build()
            : null;
      }
   }
}
