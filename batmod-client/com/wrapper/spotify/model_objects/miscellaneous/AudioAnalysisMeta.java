package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class AudioAnalysisMeta extends AbstractModelObject {
   private final String analyzerVersion;
   private final String platform;
   private final String detailedStatus;
   private final Integer statusCode;
   private final Long timestamp;
   private final Float analysisTime;
   private final String inputProcess;

   private AudioAnalysisMeta(AudioAnalysisMeta.Builder builder) {
      super(builder);
      this.analyzerVersion = builder.analyzerVersion;
      this.platform = builder.platform;
      this.detailedStatus = builder.detailedStatus;
      this.statusCode = builder.statusCode;
      this.timestamp = builder.timestamp;
      this.analysisTime = builder.analysisTime;
      this.inputProcess = builder.inputProcess;
   }

   public String getAnalyzerVersion() {
      return this.analyzerVersion;
   }

   public String getPlatform() {
      return this.platform;
   }

   public String getDetailedStatus() {
      return this.detailedStatus;
   }

   public Integer getStatusCode() {
      return this.statusCode;
   }

   public Long getTimestamp() {
      return this.timestamp;
   }

   public Float getAnalysisTime() {
      return this.analysisTime;
   }

   public String getInputProcess() {
      return this.inputProcess;
   }

   public AudioAnalysisMeta.Builder builder() {
      return new AudioAnalysisMeta.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String analyzerVersion;
      private String platform;
      private String detailedStatus;
      private Integer statusCode;
      private Long timestamp;
      private Float analysisTime;
      private String inputProcess;

      public AudioAnalysisMeta.Builder setAnalyzerVersion(String analyzerVersion) {
         this.analyzerVersion = analyzerVersion;
         return this;
      }

      public AudioAnalysisMeta.Builder setPlatform(String platform) {
         this.platform = platform;
         return this;
      }

      public AudioAnalysisMeta.Builder setDetailedStatus(String detailedStatus) {
         this.detailedStatus = detailedStatus;
         return this;
      }

      public AudioAnalysisMeta.Builder setStatusCode(Integer statusCode) {
         this.statusCode = statusCode;
         return this;
      }

      public AudioAnalysisMeta.Builder setTimestamp(Long timestamp) {
         this.timestamp = timestamp;
         return this;
      }

      public AudioAnalysisMeta.Builder setAnalysisTime(Float analysisTime) {
         this.analysisTime = analysisTime;
         return this;
      }

      public AudioAnalysisMeta.Builder setInputProcess(String inputProcess) {
         this.inputProcess = inputProcess;
         return this;
      }

      public AudioAnalysisMeta build() {
         return new AudioAnalysisMeta(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AudioAnalysisMeta> {
      public AudioAnalysisMeta createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AudioAnalysisMeta.Builder()
               .setAnalysisTime(this.hasAndNotNull(jsonObject, "analysis_time") ? jsonObject.get("analysis_time").getAsFloat() : null)
               .setAnalyzerVersion(this.hasAndNotNull(jsonObject, "analysis_time") ? jsonObject.get("analyzer_version").getAsString() : null)
               .setDetailedStatus(this.hasAndNotNull(jsonObject, "analysis_time") ? jsonObject.get("detailed_status").getAsString() : null)
               .setInputProcess(this.hasAndNotNull(jsonObject, "analysis_time") ? jsonObject.get("input_process").getAsString() : null)
               .setPlatform(this.hasAndNotNull(jsonObject, "analysis_time") ? jsonObject.get("platform").getAsString() : null)
               .setStatusCode(this.hasAndNotNull(jsonObject, "analysis_time") ? jsonObject.get("status_code").getAsInt() : null)
               .setTimestamp(this.hasAndNotNull(jsonObject, "analysis_time") ? jsonObject.get("timestamp").getAsLong() : null)
               .build()
            : null;
      }
   }
}
