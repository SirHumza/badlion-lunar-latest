package com.wrapper.spotify.requests.data.player;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class SeekToPositionInCurrentlyPlayingTrackRequest extends AbstractDataRequest {
   private SeekToPositionInCurrentlyPlayingTrackRequest(SeekToPositionInCurrentlyPlayingTrackRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<SeekToPositionInCurrentlyPlayingTrackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SeekToPositionInCurrentlyPlayingTrackRequest.Builder position_ms(Integer position_ms) {
         assert position_ms != null;
         assert position_ms >= 0;
         return this.setQueryParameter("position_ms", position_ms);
      }

      public SeekToPositionInCurrentlyPlayingTrackRequest.Builder device_id(String device_id) {
         assert device_id != null;
         assert !device_id.equals("");
         return this.setQueryParameter("device_id", device_id);
      }

      public SeekToPositionInCurrentlyPlayingTrackRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/me/player/seek");
         return new SeekToPositionInCurrentlyPlayingTrackRequest(this);
      }
   }
}
