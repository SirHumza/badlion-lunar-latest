package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.Modality;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class AudioFeatures extends AbstractModelObject {
   private final Float acousticness;
   private final String analysisUrl;
   private final Float danceability;
   private final Integer durationMs;
   private final Float energy;
   private final String id;
   private final Float instrumentalness;
   private final Integer key;
   private final Float liveness;
   private final Float loudness;
   private final Modality mode;
   private final Float speechiness;
   private final Float tempo;
   private final Integer timeSignature;
   private final String trackHref;
   private final ModelObjectType type;
   private final String uri;
   private final Float valence;

   private AudioFeatures(AudioFeatures.Builder builder) {
      super(builder);
      this.acousticness = builder.acousticness;
      this.analysisUrl = builder.analysisUrl;
      this.danceability = builder.danceability;
      this.durationMs = builder.durationMs;
      this.energy = builder.energy;
      this.id = builder.id;
      this.instrumentalness = builder.instrumentalness;
      this.key = builder.key;
      this.liveness = builder.liveness;
      this.loudness = builder.loudness;
      this.mode = builder.mode;
      this.speechiness = builder.speechiness;
      this.tempo = builder.tempo;
      this.timeSignature = builder.timeSignature;
      this.trackHref = builder.trackHref;
      this.type = builder.type;
      this.uri = builder.uri;
      this.valence = builder.valence;
   }

   public Float getAcousticness() {
      return this.acousticness;
   }

   public String getAnalysisUrl() {
      return this.analysisUrl;
   }

   public Float getDanceability() {
      return this.danceability;
   }

   public Integer getDurationMs() {
      return this.durationMs;
   }

   public Float getEnergy() {
      return this.energy;
   }

   public String getId() {
      return this.id;
   }

   public Float getInstrumentalness() {
      return this.instrumentalness;
   }

   public Integer getKey() {
      return this.key;
   }

   public Float getLiveness() {
      return this.liveness;
   }

   public Float getLoudness() {
      return this.loudness;
   }

   public Modality getMode() {
      return this.mode;
   }

   public Float getSpeechiness() {
      return this.speechiness;
   }

   public Float getTempo() {
      return this.tempo;
   }

   public Integer getTimeSignature() {
      return this.timeSignature;
   }

   public String getTrackHref() {
      return this.trackHref;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public Float getValence() {
      return this.valence;
   }

   public AudioFeatures.Builder builder() {
      return new AudioFeatures.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Float acousticness;
      private String analysisUrl;
      private Float danceability;
      private Integer durationMs;
      private Float energy;
      private String id;
      private Float instrumentalness;
      private Integer key;
      private Float liveness;
      private Float loudness;
      private Modality mode;
      private Float speechiness;
      private Float tempo;
      private Integer timeSignature;
      private String trackHref;
      private ModelObjectType type;
      private String uri;
      private Float valence;

      public AudioFeatures.Builder setAcousticness(Float acousticness) {
         this.acousticness = acousticness;
         return this;
      }

      public AudioFeatures.Builder setAnalysisUrl(String analysisUrl) {
         this.analysisUrl = analysisUrl;
         return this;
      }

      public AudioFeatures.Builder setDanceability(Float danceability) {
         this.danceability = danceability;
         return this;
      }

      public AudioFeatures.Builder setDurationMs(Integer durationMs) {
         this.durationMs = durationMs;
         return this;
      }

      public AudioFeatures.Builder setEnergy(Float energy) {
         this.energy = energy;
         return this;
      }

      public AudioFeatures.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public AudioFeatures.Builder setInstrumentalness(Float instrumentalness) {
         this.instrumentalness = instrumentalness;
         return this;
      }

      public AudioFeatures.Builder setKey(Integer key) {
         this.key = key;
         return this;
      }

      public AudioFeatures.Builder setLiveness(Float liveness) {
         this.liveness = liveness;
         return this;
      }

      public AudioFeatures.Builder setLoudness(Float loudness) {
         this.loudness = loudness;
         return this;
      }

      public AudioFeatures.Builder setMode(Modality mode) {
         this.mode = mode;
         return this;
      }

      public AudioFeatures.Builder setSpeechiness(Float speechiness) {
         this.speechiness = speechiness;
         return this;
      }

      public AudioFeatures.Builder setTempo(Float tempo) {
         this.tempo = tempo;
         return this;
      }

      public AudioFeatures.Builder setTimeSignature(Integer timeSignature) {
         this.timeSignature = timeSignature;
         return this;
      }

      public AudioFeatures.Builder setTrackHref(String trackHref) {
         this.trackHref = trackHref;
         return this;
      }

      public AudioFeatures.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public AudioFeatures.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public AudioFeatures.Builder setValence(Float valence) {
         this.valence = valence;
         return this;
      }

      public AudioFeatures build() {
         return new AudioFeatures(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AudioFeatures> {
      public AudioFeatures createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AudioFeatures.Builder()
               .setAcousticness(this.hasAndNotNull(jsonObject, "acousticness") ? jsonObject.get("acousticness").getAsFloat() : null)
               .setAnalysisUrl(this.hasAndNotNull(jsonObject, "analysis_url") ? jsonObject.get("analysis_url").getAsString() : null)
               .setDanceability(this.hasAndNotNull(jsonObject, "danceability") ? jsonObject.get("danceability").getAsFloat() : null)
               .setDurationMs(this.hasAndNotNull(jsonObject, "duration_ms") ? jsonObject.get("duration_ms").getAsInt() : null)
               .setEnergy(this.hasAndNotNull(jsonObject, "energy") ? jsonObject.get("energy").getAsFloat() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setInstrumentalness(this.hasAndNotNull(jsonObject, "instrumentalness") ? jsonObject.get("instrumentalness").getAsFloat() : null)
               .setKey(this.hasAndNotNull(jsonObject, "key") ? jsonObject.get("key").getAsInt() : null)
               .setLiveness(this.hasAndNotNull(jsonObject, "liveness") ? jsonObject.get("liveness").getAsFloat() : null)
               .setLoudness(this.hasAndNotNull(jsonObject, "loudness") ? jsonObject.get("loudness").getAsFloat() : null)
               .setMode(this.hasAndNotNull(jsonObject, "mode") ? Modality.keyOf(jsonObject.get("mode").getAsInt()) : null)
               .setSpeechiness(this.hasAndNotNull(jsonObject, "speechiness") ? jsonObject.get("speechiness").getAsFloat() : null)
               .setTempo(this.hasAndNotNull(jsonObject, "tempo") ? jsonObject.get("tempo").getAsFloat() : null)
               .setTimeSignature(this.hasAndNotNull(jsonObject, "time_signature") ? jsonObject.get("time_signature").getAsInt() : null)
               .setTrackHref(this.hasAndNotNull(jsonObject, "track_href") ? jsonObject.get("track_href").getAsString() : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .setValence(this.hasAndNotNull(jsonObject, "valence") ? jsonObject.get("valence").getAsFloat() : null)
               .build()
            : null;
      }
   }
}
