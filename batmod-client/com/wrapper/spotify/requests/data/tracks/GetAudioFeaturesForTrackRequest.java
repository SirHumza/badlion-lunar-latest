package com.wrapper.spotify.requests.data.tracks;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.AudioFeatures;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetAudioFeaturesForTrackRequest extends AbstractDataRequest {
   private GetAudioFeaturesForTrackRequest(GetAudioFeaturesForTrackRequest.Builder builder) {
      super(builder);
   }

   public AudioFeatures execute() throws IOException, SpotifyWebApiException {
      return new AudioFeatures.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetAudioFeaturesForTrackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetAudioFeaturesForTrackRequest.Builder id(String id) {
         assert id != null;
         assert !id.equals("");
         return this.setPathParameter("id", id);
      }

      public GetAudioFeaturesForTrackRequest build() {
         this.setPath("/v1/audio-features/{id}");
         return new GetAudioFeaturesForTrackRequest(this);
      }
   }
}
