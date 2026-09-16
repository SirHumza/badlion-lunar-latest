package com.wrapper.spotify.model_objects.special;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class PlaylistTrackPosition extends AbstractModelObject {
   private final String uri;
   private final int[] positions;

   public PlaylistTrackPosition(PlaylistTrackPosition.Builder builder) {
      super(builder);
      this.uri = builder.uri;
      this.positions = builder.positions;
   }

   public String getUri() {
      return this.uri;
   }

   public int[] getPositions() {
      return this.positions;
   }

   public PlaylistTrackPosition.Builder builder() {
      return new PlaylistTrackPosition.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String uri;
      private int[] positions;

      public PlaylistTrackPosition.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public PlaylistTrackPosition.Builder setPositions(int... positions) {
         this.positions = positions;
         return this;
      }

      public PlaylistTrackPosition build() {
         return new PlaylistTrackPosition(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<PlaylistTrackPosition> {
      public PlaylistTrackPosition createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new PlaylistTrackPosition.Builder()
               .setPositions(
                  this.hasAndNotNull(jsonObject, "positions") ? (int[])new Gson().fromJson(jsonObject.getAsJsonArray("positions"), int[].class) : null
               )
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
