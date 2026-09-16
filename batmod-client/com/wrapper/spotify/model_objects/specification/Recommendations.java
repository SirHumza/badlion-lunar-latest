package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Recommendations extends AbstractModelObject {
   private final RecommendationsSeed[] seeds;
   private final TrackSimplified[] tracks;

   private Recommendations(Recommendations.Builder builder) {
      super(builder);
      this.seeds = builder.seeds;
      this.tracks = builder.tracks;
   }

   public RecommendationsSeed[] getSeeds() {
      return this.seeds;
   }

   public TrackSimplified[] getTracks() {
      return this.tracks;
   }

   public Recommendations.Builder builder() {
      return new Recommendations.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private RecommendationsSeed[] seeds;
      private TrackSimplified[] tracks;

      public Recommendations.Builder setSeeds(RecommendationsSeed... seeds) {
         this.seeds = seeds;
         return this;
      }

      public Recommendations.Builder setTracks(TrackSimplified... tracks) {
         this.tracks = tracks;
         return this;
      }

      public Recommendations build() {
         return new Recommendations(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Recommendations> {
      public Recommendations createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Recommendations.Builder()
               .setSeeds(
                  this.hasAndNotNull(jsonObject, "seeds")
                     ? new RecommendationsSeed.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("seeds"))
                     : null
               )
               .setTracks(
                  this.hasAndNotNull(jsonObject, "tracks") ? new TrackSimplified.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("tracks")) : null
               )
               .build()
            : null;
      }
   }
}
