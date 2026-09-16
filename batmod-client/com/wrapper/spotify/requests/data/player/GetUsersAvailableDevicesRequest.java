package com.wrapper.spotify.requests.data.player;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.miscellaneous.Device;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetUsersAvailableDevicesRequest extends AbstractDataRequest {
   private GetUsersAvailableDevicesRequest(GetUsersAvailableDevicesRequest.Builder builder) {
      super(builder);
   }

   public Device[] execute() throws IOException, SpotifyWebApiException {
      return new Device.JsonUtil().createModelObjectArray(this.getJson(), "devices");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetUsersAvailableDevicesRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetUsersAvailableDevicesRequest build() {
         this.setPath("/v1/me/player/devices");
         return new GetUsersAvailableDevicesRequest(this);
      }
   }
}
