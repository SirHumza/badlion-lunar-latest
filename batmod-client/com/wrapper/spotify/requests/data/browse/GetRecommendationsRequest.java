package com.wrapper.spotify.requests.data.browse;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Recommendations;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetRecommendationsRequest extends AbstractDataRequest {
   private GetRecommendationsRequest(GetRecommendationsRequest.Builder builder) {
      super(builder);
   }

   public Recommendations execute() throws IOException, SpotifyWebApiException {
      return new Recommendations.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetRecommendationsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetRecommendationsRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 100;
         return this.setQueryParameter("limit", limit);
      }

      public GetRecommendationsRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetRecommendationsRequest.Builder max_acousticness(Float max_acousticness) {
         assert max_acousticness != null;
         assert 0.0 <= max_acousticness.floatValue() && max_acousticness.floatValue() <= 1.0;
         return this.setQueryParameter("max_acousticness", max_acousticness);
      }

      public GetRecommendationsRequest.Builder max_danceability(Float max_danceability) {
         assert max_danceability != null;
         assert 0.0 <= max_danceability.floatValue() && max_danceability.floatValue() <= 1.0;
         return this.setQueryParameter("max_danceability", max_danceability);
      }

      public GetRecommendationsRequest.Builder max_duration_ms(Integer max_duration_ms) {
         assert max_duration_ms != null;
         return this.setQueryParameter("max_duration_ms", max_duration_ms);
      }

      public GetRecommendationsRequest.Builder max_energy(Float max_energy) {
         assert max_energy != null;
         assert 0.0 <= max_energy.floatValue() && max_energy.floatValue() <= 1.0;
         return this.setQueryParameter("max_energy", max_energy);
      }

      public GetRecommendationsRequest.Builder max_instrumentalness(Float max_instrumentalness) {
         assert max_instrumentalness != null;
         assert 0.0 <= max_instrumentalness.floatValue() && max_instrumentalness.floatValue() <= 1.0;
         return this.setQueryParameter("max_instrumentalness", max_instrumentalness);
      }

      public GetRecommendationsRequest.Builder max_key(Integer max_key) {
         assert max_key != null;
         assert 0 <= max_key && max_key <= 11;
         return this.setQueryParameter("max_key", max_key);
      }

      public GetRecommendationsRequest.Builder max_liveness(Float max_liveness) {
         assert max_liveness != null;
         assert 0.0 <= max_liveness.floatValue() && max_liveness.floatValue() <= 1.0;
         return this.setQueryParameter("max_liveness", max_liveness);
      }

      public GetRecommendationsRequest.Builder max_loudness(Float max_loudness) {
         assert max_loudness != null;
         return this.setQueryParameter("max_loudness", max_loudness);
      }

      public GetRecommendationsRequest.Builder max_mode(Integer max_mode) {
         assert max_mode != null;
         assert max_mode == 0 || max_mode == 1;
         return this.setQueryParameter("max_mode", max_mode);
      }

      public GetRecommendationsRequest.Builder max_popularity(Integer max_popularity) {
         assert max_popularity != null;
         assert 0 <= max_popularity && max_popularity <= 100;
         return this.setQueryParameter("max_popularity", max_popularity);
      }

      public GetRecommendationsRequest.Builder max_speechiness(Float max_speechiness) {
         assert max_speechiness != null;
         assert 0.0 <= max_speechiness.floatValue() && max_speechiness.floatValue() <= 1.0;
         return this.setQueryParameter("max_speechiness", max_speechiness);
      }

      public GetRecommendationsRequest.Builder max_tempo(Float max_tempo) {
         assert max_tempo != null;
         assert max_tempo >= 0.0F;
         return this.setQueryParameter("max_tempo", max_tempo);
      }

      public GetRecommendationsRequest.Builder max_time_signature(Integer max_time_signature) {
         assert max_time_signature != null;
         return this.setQueryParameter("max_time_signature", max_time_signature);
      }

      public GetRecommendationsRequest.Builder max_valence(Float max_valence) {
         assert max_valence != null;
         assert 0.0 <= max_valence.floatValue() && max_valence.floatValue() <= 1.0;
         return this.setQueryParameter("max_valence", max_valence);
      }

      public GetRecommendationsRequest.Builder min_acousticness(Float min_acousticness) {
         assert min_acousticness != null;
         assert 0.0 <= min_acousticness.floatValue() && min_acousticness.floatValue() <= 1.0;
         return this.setQueryParameter("min_acousticness", min_acousticness);
      }

      public GetRecommendationsRequest.Builder min_danceability(Float min_danceability) {
         assert min_danceability != null;
         assert 0.0 <= min_danceability.floatValue() && min_danceability.floatValue() <= 1.0;
         return this.setQueryParameter("min_danceability", min_danceability);
      }

      public GetRecommendationsRequest.Builder min_duration_ms(Integer min_duration_ms) {
         assert min_duration_ms != null;
         return this.setQueryParameter("min_duration_ms", min_duration_ms);
      }

      public GetRecommendationsRequest.Builder min_energy(Float min_energy) {
         assert min_energy != null;
         assert 0.0 <= min_energy.floatValue() && min_energy.floatValue() <= 1.0;
         return this.setQueryParameter("min_energy", min_energy);
      }

      public GetRecommendationsRequest.Builder min_instrumentalness(Float min_instrumentalness) {
         assert min_instrumentalness != null;
         assert 0.0 <= min_instrumentalness.floatValue() && min_instrumentalness.floatValue() <= 1.0;
         return this.setQueryParameter("min_instrumentalness", min_instrumentalness);
      }

      public GetRecommendationsRequest.Builder min_key(Integer min_key) {
         assert min_key != null;
         assert 0 <= min_key && min_key <= 11;
         return this.setQueryParameter("min_key", min_key);
      }

      public GetRecommendationsRequest.Builder min_liveness(Float min_liveness) {
         assert min_liveness != null;
         assert 0.0 <= min_liveness.floatValue() && min_liveness.floatValue() <= 1.0;
         return this.setQueryParameter("min_liveness", min_liveness);
      }

      public GetRecommendationsRequest.Builder min_loudness(Float min_loudness) {
         assert min_loudness != null;
         return this.setQueryParameter("min_loudness", min_loudness);
      }

      public GetRecommendationsRequest.Builder min_mode(Integer min_mode) {
         assert min_mode != null;
         assert min_mode == 0 || min_mode == 1;
         return this.setQueryParameter("min_mode", min_mode);
      }

      public GetRecommendationsRequest.Builder min_popularity(Integer min_popularity) {
         assert min_popularity != null;
         assert 0 <= min_popularity && min_popularity <= 100;
         return this.setQueryParameter("min_popularity", min_popularity);
      }

      public GetRecommendationsRequest.Builder min_speechiness(Float min_speechiness) {
         assert min_speechiness != null;
         assert 0.0 <= min_speechiness.floatValue() && min_speechiness.floatValue() <= 1.0;
         return this.setQueryParameter("min_speechiness", min_speechiness);
      }

      public GetRecommendationsRequest.Builder min_tempo(Float min_tempo) {
         assert min_tempo != null;
         assert min_tempo >= 0.0F;
         return this.setQueryParameter("min_tempo", min_tempo);
      }

      public GetRecommendationsRequest.Builder min_time_signature(Integer min_time_signature) {
         assert min_time_signature != null;
         return this.setQueryParameter("min_time_signature", min_time_signature);
      }

      public GetRecommendationsRequest.Builder min_valence(Float min_valence) {
         assert min_valence != null;
         assert 0.0 <= min_valence.floatValue() && min_valence.floatValue() <= 1.0;
         return this.setQueryParameter("min_valence", min_valence);
      }

      public GetRecommendationsRequest.Builder seed_artists(String seed_artists) {
         assert seed_artists != null;
         assert seed_artists.split(",").length <= 5;
         return this.setQueryParameter("seed_artists", seed_artists);
      }

      public GetRecommendationsRequest.Builder seed_genres(String seed_genres) {
         assert seed_genres != null;
         assert seed_genres.split(",").length <= 5;
         return this.setQueryParameter("seed_genres", seed_genres);
      }

      public GetRecommendationsRequest.Builder seed_tracks(String seed_tracks) {
         assert seed_tracks != null;
         assert seed_tracks.split(",").length <= 5;
         return this.setQueryParameter("seed_tracks", seed_tracks);
      }

      public GetRecommendationsRequest.Builder target_acousticness(Float target_acousticness) {
         assert target_acousticness != null;
         assert 0.0 <= target_acousticness.floatValue() && target_acousticness.floatValue() <= 1.0;
         return this.setQueryParameter("target_acousticness", target_acousticness);
      }

      public GetRecommendationsRequest.Builder target_danceability(Float target_danceability) {
         assert target_danceability != null;
         assert 0.0 <= target_danceability.floatValue() && target_danceability.floatValue() <= 1.0;
         return this.setQueryParameter("target_danceability", target_danceability);
      }

      public GetRecommendationsRequest.Builder target_duration_ms(Integer target_duration_ms) {
         assert target_duration_ms != null;
         return this.setQueryParameter("target_duration_ms", target_duration_ms);
      }

      public GetRecommendationsRequest.Builder target_energy(Float target_energy) {
         assert target_energy != null;
         assert 0.0 <= target_energy.floatValue() && target_energy.floatValue() <= 1.0;
         return this.setQueryParameter("target_energy", target_energy);
      }

      public GetRecommendationsRequest.Builder target_instrumentalness(Float target_instrumentalness) {
         assert target_instrumentalness != null;
         assert 0.0 <= target_instrumentalness.floatValue() && target_instrumentalness.floatValue() <= 1.0;
         return this.setQueryParameter("target_instrumentalness", target_instrumentalness);
      }

      public GetRecommendationsRequest.Builder target_key(Integer target_key) {
         assert target_key != null;
         assert 0 <= target_key && target_key <= 11;
         return this.setQueryParameter("target_key", target_key);
      }

      public GetRecommendationsRequest.Builder target_liveness(Float target_liveness) {
         assert target_liveness != null;
         assert 0.0 <= target_liveness.floatValue() && target_liveness.floatValue() <= 1.0;
         return this.setQueryParameter("target_liveness", target_liveness);
      }

      public GetRecommendationsRequest.Builder target_loudness(Float target_loudness) {
         assert target_loudness != null;
         return this.setQueryParameter("target_loudness", target_loudness);
      }

      public GetRecommendationsRequest.Builder target_mode(Integer target_mode) {
         assert target_mode != null;
         assert target_mode == 0 || target_mode == 1;
         return this.setQueryParameter("target_mode", target_mode);
      }

      public GetRecommendationsRequest.Builder target_popularity(Integer target_popularity) {
         assert target_popularity != null;
         assert 0 <= target_popularity && target_popularity <= 100;
         return this.setQueryParameter("target_popularity", target_popularity);
      }

      public GetRecommendationsRequest.Builder target_speechiness(Float target_speechiness) {
         assert target_speechiness != null;
         assert 0.0 <= target_speechiness.floatValue() && target_speechiness.floatValue() <= 1.0;
         return this.setQueryParameter("target_speechiness", target_speechiness);
      }

      public GetRecommendationsRequest.Builder target_tempo(Float target_tempo) {
         assert target_tempo != null;
         assert target_tempo >= 0.0F;
         return this.setQueryParameter("target_tempo", target_tempo);
      }

      public GetRecommendationsRequest.Builder target_time_signature(Integer target_time_signature) {
         assert target_time_signature != null;
         return this.setQueryParameter("target_time_signature", target_time_signature);
      }

      public GetRecommendationsRequest.Builder target_valence(Float target_valence) {
         assert target_valence != null;
         assert 0.0 <= target_valence.floatValue() && target_valence.floatValue() <= 1.0;
         return this.setQueryParameter("target_valence", target_valence);
      }

      public GetRecommendationsRequest build() {
         this.setPath("/v1/recommendations");
         return new GetRecommendationsRequest(this);
      }
   }
}
