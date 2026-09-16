package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class AudioAnalysisSegment extends AbstractModelObject {
   private final AudioAnalysisMeasure measure;
   private final Float loudnessStart;
   private final Float loudnessMaxTime;
   private final Float loudnessMax;
   private final Float loudnessEnd;
   private final float[] pitches;
   private final float[] timbre;

   private AudioAnalysisSegment(AudioAnalysisSegment.Builder builder) {
      super(builder);
      this.measure = builder.measure;
      this.loudnessStart = builder.loudnessStart;
      this.loudnessMaxTime = builder.loudnessMaxTime;
      this.loudnessMax = builder.loudnessMax;
      this.loudnessEnd = builder.loudnessEnd;
      this.pitches = builder.pitches;
      this.timbre = builder.timbre;
   }

   public AudioAnalysisMeasure getMeasure() {
      return this.measure;
   }

   public Float getLoudnessStart() {
      return this.loudnessStart;
   }

   public Float getLoudnessMaxTime() {
      return this.loudnessMaxTime;
   }

   public Float getLoudnessMax() {
      return this.loudnessMax;
   }

   public Float getLoudnessEnd() {
      return this.loudnessEnd;
   }

   public float[] getPitches() {
      return this.pitches;
   }

   public float[] getTimbre() {
      return this.timbre;
   }

   public AudioAnalysisSegment.Builder builder() {
      return new AudioAnalysisSegment.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private AudioAnalysisMeasure measure;
      private Float loudnessStart;
      private Float loudnessMaxTime;
      private Float loudnessMax;
      private Float loudnessEnd;
      private float[] pitches;
      private float[] timbre;

      public AudioAnalysisSegment.Builder setMeasure(AudioAnalysisMeasure measure) {
         this.measure = measure;
         return this;
      }

      public AudioAnalysisSegment.Builder setLoudnessStart(Float loudnessStart) {
         this.loudnessStart = loudnessStart;
         return this;
      }

      public AudioAnalysisSegment.Builder setLoudnessMaxTime(Float loudnessMaxTime) {
         this.loudnessMaxTime = loudnessMaxTime;
         return this;
      }

      public AudioAnalysisSegment.Builder setLoudnessMax(Float loudnessMax) {
         this.loudnessMax = loudnessMax;
         return this;
      }

      public AudioAnalysisSegment.Builder setLoudnessEnd(Float loudnessEnd) {
         this.loudnessEnd = loudnessEnd;
         return this;
      }

      public AudioAnalysisSegment.Builder setPitches(float[] pitches) {
         this.pitches = pitches;
         return this;
      }

      public AudioAnalysisSegment.Builder setTimbre(float[] timbre) {
         this.timbre = timbre;
         return this;
      }

      public AudioAnalysisSegment build() {
         return new AudioAnalysisSegment(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AudioAnalysisSegment> {
      public AudioAnalysisSegment createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AudioAnalysisSegment.Builder()
               .setLoudnessEnd(this.hasAndNotNull(jsonObject, "loudness_end") ? jsonObject.get("loudness_end").getAsFloat() : null)
               .setLoudnessMax(this.hasAndNotNull(jsonObject, "loudness_max") ? jsonObject.get("loudness_max").getAsFloat() : null)
               .setLoudnessMaxTime(this.hasAndNotNull(jsonObject, "loudness_max_time") ? jsonObject.get("loudness_max_time").getAsFloat() : null)
               .setLoudnessStart(this.hasAndNotNull(jsonObject, "loudness_start") ? jsonObject.get("loudness_start").getAsFloat() : null)
               .setMeasure(new AudioAnalysisMeasure.JsonUtil().createModelObject(jsonObject))
               .setPitches(this.hasAndNotNull(jsonObject, "pitches") ? (float[])new Gson().fromJson(jsonObject.getAsJsonArray("pitches"), float[].class) : null)
               .setTimbre(this.hasAndNotNull(jsonObject, "timbre") ? (float[])new Gson().fromJson(jsonObject.getAsJsonArray("timbre"), float[].class) : null)
               .build()
            : null;
      }
   }
}
