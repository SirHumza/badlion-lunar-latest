package com.wrapper.spotify.requests.data.player;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class SetVolumeForUsersPlaybackRequest extends AbstractDataRequest {
   private SetVolumeForUsersPlaybackRequest(SetVolumeForUsersPlaybackRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<SetVolumeForUsersPlaybackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SetVolumeForUsersPlaybackRequest.Builder volume_percent(Integer volume_percent) {
         assert volume_percent != null;
         assert 0 <= volume_percent && volume_percent <= 100;
         return this.setQueryParameter("volume_percent", volume_percent);
      }

      public SetVolumeForUsersPlaybackRequest.Builder device_id(String device_id) {
         assert device_id != null;
         assert !device_id.equals("");
         return this.setQueryParameter("device_id", device_id);
      }

      public SetVolumeForUsersPlaybackRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/me/player/volume");
         return new SetVolumeForUsersPlaybackRequest(this);
      }
   }
}
