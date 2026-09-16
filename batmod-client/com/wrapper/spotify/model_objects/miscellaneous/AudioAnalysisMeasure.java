package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class AudioAnalysisMeasure extends AbstractModelObject {
   private final Float confidence;
   private final Float duration;
   private final Float start;

   private AudioAnalysisMeasure(AudioAnalysisMeasure.Builder builder) {
      super(builder);
      this.confidence = builder.confidence;
      this.duration = builder.duration;
      this.start = builder.start;
   }

   public Float getConfidence() {
      return this.confidence;
   }

   public Float getDuration() {
      return this.duration;
   }

   public Float getStart() {
      return this.start;
   }

   public AudioAnalysisMeasure.Builder builder() {
      return new AudioAnalysisMeasure.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Float confidence;
      private Float duration;
      private Float start;

      public AudioAnalysisMeasure.Builder setConfidence(Float confidence) {
         this.confidence = confidence;
         return this;
      }

      public AudioAnalysisMeasure.Builder setDuration(Float duration) {
         this.duration = duration;
         return this;
      }

      public AudioAnalysisMeasure.Builder setStart(Float start) {
         this.start = start;
         return this;
      }

      public AudioAnalysisMeasure build() {
         return new AudioAnalysisMeasure(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AudioAnalysisMeasure> {
      public AudioAnalysisMeasure createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AudioAnalysisMeasure.Builder()
               .setConfidence(this.hasAndNotNull(jsonObject, "confidence") ? jsonObject.get("confidence").getAsFloat() : null)
               .setDuration(this.hasAndNotNull(jsonObject, "duration") ? jsonObject.get("duration").getAsFloat() : null)
               .setStart(this.hasAndNotNull(jsonObject, "start") ? jsonObject.get("start").getAsFloat() : null)
               .build()
            : null;
      }
   }
}
