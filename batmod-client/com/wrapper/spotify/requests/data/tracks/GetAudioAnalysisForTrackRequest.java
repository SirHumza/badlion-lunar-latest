package com.wrapper.spotify.requests.data.tracks;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.miscellaneous.AudioAnalysis;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetAudioAnalysisForTrackRequest extends AbstractDataRequest {
   private GetAudioAnalysisForTrackRequest(GetAudioAnalysisForTrackRequest.Builder builder) {
      super(builder);
   }

   public AudioAnalysis execute() throws IOException, SpotifyWebApiException {
      return new AudioAnalysis.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetAudioAnalysisForTrackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetAudioAnalysisForTrackRequest.Builder id(String id) {
         assert id != null;
         assert !id.equals("");
         return this.setPathParameter("id", id);
      }

      public GetAudioAnalysisForTrackRequest build() {
         this.setPath("/v1/audio-analysis/{id}");
         return new GetAudioAnalysisForTrackRequest(this);
      }
   }
}
