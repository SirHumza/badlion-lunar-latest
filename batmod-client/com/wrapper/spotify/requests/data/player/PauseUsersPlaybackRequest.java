package com.wrapper.spotify.requests.data.player;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class PauseUsersPlaybackRequest extends AbstractDataRequest {
   private PauseUsersPlaybackRequest(PauseUsersPlaybackRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<PauseUsersPlaybackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public PauseUsersPlaybackRequest.Builder device_id(String device_id) {
         assert device_id != null;
         assert !device_id.equals("");
         return this.setQueryParameter("device_id", device_id);
      }

      public PauseUsersPlaybackRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/me/player/pause");
         return new PauseUsersPlaybackRequest(this);
      }
   }
}
