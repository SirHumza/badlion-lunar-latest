package com.wrapper.spotify.requests.data.player;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class SkipUsersPlaybackToNextTrackRequest extends AbstractDataRequest {
   private SkipUsersPlaybackToNextTrackRequest(SkipUsersPlaybackToNextTrackRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.postJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<SkipUsersPlaybackToNextTrackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SkipUsersPlaybackToNextTrackRequest.Builder device_id(String device_id) {
         assert device_id != null;
         assert !device_id.equals("");
         return this.setQueryParameter("device_id", device_id);
      }

      public SkipUsersPlaybackToNextTrackRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/me/player/next");
         return new SkipUsersPlaybackToNextTrackRequest(this);
      }
   }
}
