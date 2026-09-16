package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.Modality;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class AudioAnalysisSection extends AbstractModelObject {
   private final AudioAnalysisMeasure measure;
   private final Float loudness;
   private final Float tempo;
   private final Float tempoConfidence;
   private final Integer key;
   private final Float keyConfidence;
   private final Modality mode;
   private final Float modeConfidence;
   private final Integer timeSignature;
   private final Float timeSignatureConfidence;

   private AudioAnalysisSection(AudioAnalysisSection.Builder builder) {
      super(builder);
      this.measure = builder.measure;
      this.loudness = builder.loudness;
      this.tempo = builder.tempo;
      this.tempoConfidence = builder.tempoConfidence;
      this.key = builder.key;
      this.keyConfidence = builder.keyConfidence;
      this.mode = builder.mode;
      this.modeConfidence = builder.modeConfidence;
      this.timeSignature = builder.timeSignature;
      this.timeSignatureConfidence = builder.timeSignatureConfidence;
   }

   public AudioAnalysisMeasure getMeasure() {
      return this.measure;
   }

   public Float getLoudness() {
      return this.loudness;
   }

   public Float getTempo() {
      return this.tempo;
   }

   public Float getTempoConfidence() {
      return this.tempoConfidence;
   }

   public Integer getKey() {
      return this.key;
   }

   public Float getKeyConfidence() {
      return this.keyConfidence;
   }

   public Modality getMode() {
      return this.mode;
   }

   public Float getModeConfidence() {
      return this.modeConfidence;
   }

   public Integer getTimeSignature() {
      return this.timeSignature;
   }

   public Float getTimeSignatureConfidence() {
      return this.timeSignatureConfidence;
   }

   public AudioAnalysisSection.Builder builder() {
      return new AudioAnalysisSection.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private AudioAnalysisMeasure measure;
      private Float loudness;
      private Float tempo;
      private Float tempoConfidence;
      private Integer key;
      private Float keyConfidence;
      private Modality mode;
      private Float modeConfidence;
      private Integer timeSignature;
      private Float timeSignatureConfidence;

      public AudioAnalysisSection.Builder setMeasure(AudioAnalysisMeasure measure) {
         this.measure = measure;
         return this;
      }

      public AudioAnalysisSection.Builder setLoudness(Float loudness) {
         this.loudness = loudness;
         return this;
      }

      public AudioAnalysisSection.Builder setTempo(Float tempo) {
         this.tempo = tempo;
         return this;
      }

      public AudioAnalysisSection.Builder setTempoConfidence(Float tempoConfidence) {
         this.tempoConfidence = tempoConfidence;
         return this;
      }

      public AudioAnalysisSection.Builder setKey(Integer key) {
         this.key = key;
         return this;
      }

      public AudioAnalysisSection.Builder setKeyConfidence(Float keyConfidence) {
         this.keyConfidence = keyConfidence;
         return this;
      }

      public AudioAnalysisSection.Builder setMode(Modality mode) {
         this.mode = mode;
         return this;
      }

      public AudioAnalysisSection.Builder setModeConfidence(Float modeConfidence) {
         this.modeConfidence = modeConfidence;
         return this;
      }

      public AudioAnalysisSection.Builder setTimeSignature(Integer timeSignature) {
         this.timeSignature = timeSignature;
         return this;
      }

      public AudioAnalysisSection.Builder setTimeSignatureConfidence(Float timeSignatureConfidence) {
         this.timeSignatureConfidence = timeSignatureConfidence;
         return this;
      }

      public AudioAnalysisSection build() {
         return new AudioAnalysisSection(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AudioAnalysisSection> {
      public AudioAnalysisSection createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AudioAnalysisSection.Builder()
               .setKey(this.hasAndNotNull(jsonObject, "key") ? jsonObject.get("key").getAsInt() : null)
               .setKeyConfidence(this.hasAndNotNull(jsonObject, "key_confidence") ? jsonObject.get("key_confidence").getAsFloat() : null)
               .setLoudness(this.hasAndNotNull(jsonObject, "loudness") ? jsonObject.get("loudness").getAsFloat() : null)
               .setMeasure(new AudioAnalysisMeasure.JsonUtil().createModelObject(jsonObject))
               .setMode(this.hasAndNotNull(jsonObject, "type") ? Modality.keyOf(jsonObject.get("mode").getAsInt()) : null)
               .setModeConfidence(this.hasAndNotNull(jsonObject, "mode_confidence") ? jsonObject.get("mode_confidence").getAsFloat() : null)
               .setTempo(this.hasAndNotNull(jsonObject, "tempo") ? jsonObject.get("tempo").getAsFloat() : null)
               .setTempoConfidence(this.hasAndNotNull(jsonObject, "tempo_confidence") ? jsonObject.get("tempo_confidence").getAsFloat() : null)
               .setTimeSignature(this.hasAndNotNull(jsonObject, "time_signature") ? jsonObject.get("time_signature").getAsInt() : null)
               .setTimeSignatureConfidence(
                  this.hasAndNotNull(jsonObject, "time_signature_confidence") ? jsonObject.get("time_signature_confidence").getAsFloat() : null
               )
               .build()
            : null;
      }
   }
}
