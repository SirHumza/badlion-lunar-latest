package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class AudioAnalysis extends AbstractModelObject {
   private final AudioAnalysisMeasure[] bars;
   private final AudioAnalysisMeasure[] beats;
   private final AudioAnalysisMeta meta;
   private final AudioAnalysisSection[] sections;
   private final AudioAnalysisSegment[] segments;
   private final AudioAnalysisMeasure[] tatums;
   private final AudioAnalysisTrack track;

   private AudioAnalysis(AudioAnalysis.Builder builder) {
      super(builder);
      this.bars = builder.bars;
      this.beats = builder.beats;
      this.meta = builder.meta;
      this.sections = builder.sections;
      this.segments = builder.segments;
      this.tatums = builder.tatums;
      this.track = builder.track;
   }

   public AudioAnalysisMeasure[] getBars() {
      return this.bars;
   }

   public AudioAnalysisMeasure[] getBeats() {
      return this.beats;
   }

   public AudioAnalysisMeta getMeta() {
      return this.meta;
   }

   public AudioAnalysisSection[] getSections() {
      return this.sections;
   }

   public AudioAnalysisSegment[] getSegments() {
      return this.segments;
   }

   public AudioAnalysisMeasure[] getTatums() {
      return this.tatums;
   }

   public AudioAnalysisTrack getTrack() {
      return this.track;
   }

   public AudioAnalysis.Builder builder() {
      return new AudioAnalysis.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private AudioAnalysisMeasure[] bars;
      private AudioAnalysisMeasure[] beats;
      private AudioAnalysisMeta meta;
      private AudioAnalysisSection[] sections;
      private AudioAnalysisSegment[] segments;
      private AudioAnalysisMeasure[] tatums;
      private AudioAnalysisTrack track;

      public AudioAnalysis.Builder setBars(AudioAnalysisMeasure[] bars) {
         this.bars = bars;
         return this;
      }

      public AudioAnalysis.Builder setBeats(AudioAnalysisMeasure[] beats) {
         this.beats = beats;
         return this;
      }

      public AudioAnalysis.Builder setMeta(AudioAnalysisMeta meta) {
         this.meta = meta;
         return this;
      }

      public AudioAnalysis.Builder setSections(AudioAnalysisSection[] sections) {
         this.sections = sections;
         return this;
      }

      public AudioAnalysis.Builder setSegments(AudioAnalysisSegment[] segments) {
         this.segments = segments;
         return this;
      }

      public AudioAnalysis.Builder setTatums(AudioAnalysisMeasure[] tatums) {
         this.tatums = tatums;
         return this;
      }

      public AudioAnalysis.Builder setTrack(AudioAnalysisTrack track) {
         this.track = track;
         return this;
      }

      public AudioAnalysis build() {
         return new AudioAnalysis(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AudioAnalysis> {
      public AudioAnalysis createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AudioAnalysis.Builder()
               .setBars(
                  this.hasAndNotNull(jsonObject, "bars") ? new AudioAnalysisMeasure.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("bars")) : null
               )
               .setBeats(
                  this.hasAndNotNull(jsonObject, "beats")
                     ? new AudioAnalysisMeasure.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("beats"))
                     : null
               )
               .setMeta(this.hasAndNotNull(jsonObject, "meta") ? new AudioAnalysisMeta.JsonUtil().createModelObject(jsonObject.getAsJsonObject("meta")) : null)
               .setSections(
                  this.hasAndNotNull(jsonObject, "sections")
                     ? new AudioAnalysisSection.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("sections"))
                     : null
               )
               .setSegments(
                  this.hasAndNotNull(jsonObject, "segments")
                     ? new AudioAnalysisSegment.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("segments"))
                     : null
               )
               .setTatums(
                  this.hasAndNotNull(jsonObject, "tatums")
                     ? new AudioAnalysisMeasure.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("tatums"))
                     : null
               )
               .setTrack(
                  this.hasAndNotNull(jsonObject, "track") ? new AudioAnalysisTrack.JsonUtil().createModelObject(jsonObject.getAsJsonObject("track")) : null
               )
               .build()
            : null;
      }
   }
}
