package com.wrapper.spotify.requests.data.tracks;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.AudioFeatures;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetAudioFeaturesForSeveralTracksRequest extends AbstractDataRequest {
   private GetAudioFeaturesForSeveralTracksRequest(GetAudioFeaturesForSeveralTracksRequest.Builder builder) {
      super(builder);
   }

   public AudioFeatures[] execute() throws IOException, SpotifyWebApiException {
      return new AudioFeatures.JsonUtil().createModelObjectArray(this.getJson(), "audio_features");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetAudioFeaturesForSeveralTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetAudioFeaturesForSeveralTracksRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 100;
         return this.setQueryParameter("ids", ids);
      }

      public GetAudioFeaturesForSeveralTracksRequest build() {
         this.setPath("/v1/audio-features");
         return new GetAudioFeaturesForSeveralTracksRequest(this);
      }
   }
}
