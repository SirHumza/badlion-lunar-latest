package com.wrapper.spotify.requests.data.player;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class SetRepeatModeOnUsersPlaybackRequest extends AbstractDataRequest {
   private SetRepeatModeOnUsersPlaybackRequest(SetRepeatModeOnUsersPlaybackRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<SetRepeatModeOnUsersPlaybackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SetRepeatModeOnUsersPlaybackRequest.Builder state(String state) {
         assert state != null;
         assert state.equals("track") || state.equals("context") || state.equals("off");
         return this.setQueryParameter("state", state);
      }

      public SetRepeatModeOnUsersPlaybackRequest.Builder device_id(String device_id) {
         assert device_id != null;
         assert !device_id.equals("");
         return this.setQueryParameter("device_id", device_id);
      }

      public SetRepeatModeOnUsersPlaybackRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/me/player/repeat");
         return new SetRepeatModeOnUsersPlaybackRequest(this);
      }
   }
}
