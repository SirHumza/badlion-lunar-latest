package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.Modality;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class AudioAnalysisTrack extends AbstractModelObject {
   private final Long numSamples;
   private final Float duration;
   private final String sampleMd5;
   private final Integer offsetSeconds;
   private final Integer windowSeconds;
   private final Long analysisSampleRate;
   private final Integer analysisChannels;
   private final Float endOfFadeIn;
   private final Float startOfFadeOut;
   private final Float loudness;
   private final Float tempo;
   private final Float tempoConfidence;
   private final Integer timeSignature;
   private final Float timeSignatureConfidence;
   private final Integer key;
   private final Float keyConfidence;
   private final Modality mode;
   private final Float modeConfidence;
   private final String codeString;
   private final Float codeVersion;
   private final String echoprintString;
   private final Float echoprintVersion;
   private final String synchString;
   private final Float synchVersion;
   private final String rhythmString;
   private final Float rhythmVersion;

   private AudioAnalysisTrack(AudioAnalysisTrack.Builder builder) {
      super(builder);
      this.numSamples = builder.numSamples;
      this.duration = builder.duration;
      this.sampleMd5 = builder.sampleMd5;
      this.offsetSeconds = builder.offsetSeconds;
      this.windowSeconds = builder.windowSeconds;
      this.analysisSampleRate = builder.analysisSampleRate;
      this.analysisChannels = builder.analysisChannels;
      this.endOfFadeIn = builder.endOfFadeIn;
      this.startOfFadeOut = builder.startOfFadeOut;
      this.loudness = builder.loudness;
      this.tempo = builder.tempo;
      this.tempoConfidence = builder.tempoConfidence;
      this.timeSignature = builder.timeSignature;
      this.timeSignatureConfidence = builder.timeSignatureConfidence;
      this.key = builder.key;
      this.keyConfidence = builder.keyConfidence;
      this.mode = builder.mode;
      this.modeConfidence = builder.modeConfidence;
      this.codeString = builder.codeString;
      this.codeVersion = builder.codeVersion;
      this.echoprintString = builder.echoprintString;
      this.echoprintVersion = builder.echoprintVersion;
      this.synchString = builder.synchString;
      this.synchVersion = builder.synchVersion;
      this.rhythmString = builder.rhythmString;
      this.rhythmVersion = builder.rhythmVersion;
   }

   public Long getNumSamples() {
      return this.numSamples;
   }

   public Float getDuration() {
      return this.duration;
   }

   public String getSampleMd5() {
      return this.sampleMd5;
   }

   public Integer getOffsetSeconds() {
      return this.offsetSeconds;
   }

   public Integer getWindowSeconds() {
      return this.windowSeconds;
   }

   public Long getAnalysisSampleRate() {
      return this.analysisSampleRate;
   }

   public Integer getAnalysisChannels() {
      return this.analysisChannels;
   }

   public Float getEndOfFadeIn() {
      return this.endOfFadeIn;
   }

   public Float getStartOfFadeOut() {
      return this.startOfFadeOut;
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

   public Integer getTimeSignature() {
      return this.timeSignature;
   }

   public Float getTimeSignatureConfidence() {
      return this.timeSignatureConfidence;
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

   public String getCodeString() {
      return this.codeString;
   }

   public Float getCodeVersion() {
      return this.codeVersion;
   }

   public String getEchoprintString() {
      return this.echoprintString;
   }

   public Float getEchoprintVersion() {
      return this.echoprintVersion;
   }

   public String getSynchString() {
      return this.synchString;
   }

   public Float getSynchVersion() {
      return this.synchVersion;
   }

   public String getRhythmString() {
      return this.rhythmString;
   }

   public Float getRhythmVersion() {
      return this.rhythmVersion;
   }

   public AudioAnalysisTrack.Builder builder() {
      return new AudioAnalysisTrack.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Long numSamples;
      private Float duration;
      private String sampleMd5;
      private Integer offsetSeconds;
      private Integer windowSeconds;
      private Long analysisSampleRate;
      private Integer analysisChannels;
      private Float endOfFadeIn;
      private Float startOfFadeOut;
      private Float loudness;
      private Float tempo;
      private Float tempoConfidence;
      private Integer timeSignature;
      private Float timeSignatureConfidence;
      private Integer key;
      private Float keyConfidence;
      private Modality mode;
      private Float modeConfidence;
      private String codeString;
      private Float codeVersion;
      private String echoprintString;
      private Float echoprintVersion;
      private String synchString;
      private Float synchVersion;
      private String rhythmString;
      private Float rhythmVersion;

      public AudioAnalysisTrack.Builder setNumSamples(Long numSamples) {
         this.numSamples = numSamples;
         return this;
      }

      public AudioAnalysisTrack.Builder setDuration(Float duration) {
         this.duration = duration;
         return this;
      }

      public AudioAnalysisTrack.Builder setSampleMd5(String sampleMd5) {
         this.sampleMd5 = sampleMd5;
         return this;
      }

      public AudioAnalysisTrack.Builder setOffsetSeconds(Integer offsetSeconds) {
         this.offsetSeconds = offsetSeconds;
         return this;
      }

      public AudioAnalysisTrack.Builder setWindowSeconds(Integer windowSeconds) {
         this.windowSeconds = windowSeconds;
         return this;
      }

      public AudioAnalysisTrack.Builder setAnalysisSampleRate(Long analysisSampleRate) {
         this.analysisSampleRate = analysisSampleRate;
         return this;
      }

      public AudioAnalysisTrack.Builder setAnalysisChannels(Integer analysisChannels) {
         this.analysisChannels = analysisChannels;
         return this;
      }

      public AudioAnalysisTrack.Builder setEndOfFadeIn(Float endOfFadeIn) {
         this.endOfFadeIn = endOfFadeIn;
         return this;
      }

      public AudioAnalysisTrack.Builder setStartOfFadeOut(Float startOfFadeOut) {
         this.startOfFadeOut = startOfFadeOut;
         return this;
      }

      public AudioAnalysisTrack.Builder setLoudness(Float loudness) {
         this.loudness = loudness;
         return this;
      }

      public AudioAnalysisTrack.Builder setTempo(Float tempo) {
         this.tempo = tempo;
         return this;
      }

      public AudioAnalysisTrack.Builder setTempoConfidence(Float tempoConfidence) {
         this.tempoConfidence = tempoConfidence;
         return this;
      }

      public AudioAnalysisTrack.Builder setTimeSignature(Integer timeSignature) {
         this.timeSignature = timeSignature;
         return this;
      }

      public AudioAnalysisTrack.Builder setTimeSignatureConfidence(Float timeSignatureConfidence) {
         this.timeSignatureConfidence = timeSignatureConfidence;
         return this;
      }

      public AudioAnalysisTrack.Builder setKey(Integer key) {
         this.key = key;
         return this;
      }

      public AudioAnalysisTrack.Builder setKeyConfidence(Float keyConfidence) {
         this.keyConfidence = keyConfidence;
         return this;
      }

      public AudioAnalysisTrack.Builder setMode(Modality mode) {
         this.mode = mode;
         return this;
      }

      public AudioAnalysisTrack.Builder setModeConfidence(Float modeConfidence) {
         this.modeConfidence = modeConfidence;
         return this;
      }

      public AudioAnalysisTrack.Builder setCodeString(String codeString) {
         this.codeString = codeString;
         return this;
      }

      public AudioAnalysisTrack.Builder setCodeVersion(Float codeVersion) {
         this.codeVersion = codeVersion;
         return this;
      }

      public AudioAnalysisTrack.Builder setEchoprintString(String echoprintString) {
         this.echoprintString = echoprintString;
         return this;
      }

      public AudioAnalysisTrack.Builder setEchoprintVersion(Float echoprintVersion) {
         this.echoprintVersion = echoprintVersion;
         return this;
      }

      public AudioAnalysisTrack.Builder setSynchString(String synchString) {
         this.synchString = synchString;
         return this;
      }

      public AudioAnalysisTrack.Builder setSynchVersion(Float synchVersion) {
         this.synchVersion = synchVersion;
         return this;
      }

      public AudioAnalysisTrack.Builder setRhythmString(String rhythmString) {
         this.rhythmString = rhythmString;
         return this;
      }

      public AudioAnalysisTrack.Builder setRhythmVersion(Float rhythmVersion) {
         this.rhythmVersion = rhythmVersion;
         return this;
      }

      public AudioAnalysisTrack build() {
         return new AudioAnalysisTrack(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AudioAnalysisTrack> {
      public AudioAnalysisTrack createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AudioAnalysisTrack.Builder()
               .setAnalysisChannels(this.hasAndNotNull(jsonObject, "analysis_channels") ? jsonObject.get("analysis_channels").getAsInt() : null)
               .setAnalysisSampleRate(this.hasAndNotNull(jsonObject, "analysis_sample_rate") ? jsonObject.get("analysis_sample_rate").getAsLong() : null)
               .setCodeString(this.hasAndNotNull(jsonObject, "code_string") ? jsonObject.get("code_string").getAsString() : null)
               .setCodeVersion(this.hasAndNotNull(jsonObject, "code_version") ? jsonObject.get("code_version").getAsFloat() : null)
               .setDuration(this.hasAndNotNull(jsonObject, "duration") ? jsonObject.get("duration").getAsFloat() : null)
               .setEchoprintString(this.hasAndNotNull(jsonObject, "echoprintstring") ? jsonObject.get("echoprintstring").getAsString() : null)
               .setEchoprintVersion(this.hasAndNotNull(jsonObject, "echoprint_version") ? jsonObject.get("echoprint_version").getAsFloat() : null)
               .setEndOfFadeIn(this.hasAndNotNull(jsonObject, "end_of_face_in") ? jsonObject.get("end_of_face_in").getAsFloat() : null)
               .setKey(this.hasAndNotNull(jsonObject, "key") ? jsonObject.get("key").getAsInt() : null)
               .setKeyConfidence(this.hasAndNotNull(jsonObject, "key_confidence") ? jsonObject.get("key_confidence").getAsFloat() : null)
               .setLoudness(this.hasAndNotNull(jsonObject, "loudness") ? jsonObject.get("loudness").getAsFloat() : null)
               .setMode(this.hasAndNotNull(jsonObject, "type") ? Modality.keyOf(jsonObject.get("mode").getAsInt()) : null)
               .setModeConfidence(this.hasAndNotNull(jsonObject, "mode_confidence") ? jsonObject.get("mode_confidence").getAsFloat() : null)
               .setNumSamples(this.hasAndNotNull(jsonObject, "num_samples") ? jsonObject.get("num_samples").getAsLong() : null)
               .setOffsetSeconds(this.hasAndNotNull(jsonObject, "offset_seconds") ? jsonObject.get("offset_seconds").getAsInt() : null)
               .setRhythmString(this.hasAndNotNull(jsonObject, "rhythmstring") ? jsonObject.get("rhythmstring").getAsString() : null)
               .setRhythmVersion(this.hasAndNotNull(jsonObject, "rhythm_version") ? jsonObject.get("rhythm_version").getAsFloat() : null)
               .setSampleMd5(this.hasAndNotNull(jsonObject, "sample_md5") ? jsonObject.get("sample_md5").getAsString() : null)
               .setStartOfFadeOut(this.hasAndNotNull(jsonObject, "start_of_fade_out") ? jsonObject.get("start_of_fade_out").getAsFloat() : null)
               .setSynchString(this.hasAndNotNull(jsonObject, "synchstring") ? jsonObject.get("synchstring").getAsString() : null)
               .setSynchVersion(this.hasAndNotNull(jsonObject, "synch_version") ? jsonObject.get("synch_version").getAsFloat() : null)
               .setTempo(this.hasAndNotNull(jsonObject, "tempo") ? jsonObject.get("tempo").getAsFloat() : null)
               .setTempoConfidence(this.hasAndNotNull(jsonObject, "tempo_confidence") ? jsonObject.get("tempo_confidence").getAsFloat() : null)
               .setTimeSignature(this.hasAndNotNull(jsonObject, "time_sidnature") ? jsonObject.get("time_sidnature").getAsInt() : null)
               .setTimeSignatureConfidence(
                  this.hasAndNotNull(jsonObject, "time_signature_confidence") ? jsonObject.get("time_signature_confidence").getAsFloat() : null
               )
               .setWindowSeconds(this.hasAndNotNull(jsonObject, "windows_seconds") ? jsonObject.get("windows_seconds").getAsInt() : null)
               .build()
            : null;
      }
   }
}
