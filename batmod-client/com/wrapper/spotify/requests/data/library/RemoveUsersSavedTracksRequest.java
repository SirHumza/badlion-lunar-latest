package com.wrapper.spotify.requests.data.library;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class RemoveUsersSavedTracksRequest extends AbstractDataRequest {
   private RemoveUsersSavedTracksRequest(RemoveUsersSavedTracksRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.deleteJson();
   }

   public static class Builder extends AbstractDataRequest.Builder<RemoveUsersSavedTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public RemoveUsersSavedTracksRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 50;
         return this.setQueryParameter("ids", ids);
      }

      public RemoveUsersSavedTracksRequest build() {
         this.setPath("/v1/me/tracks");
         return new RemoveUsersSavedTracksRequest(this);
      }
   }
}
