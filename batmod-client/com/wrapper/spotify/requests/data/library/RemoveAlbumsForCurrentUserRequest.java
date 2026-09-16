package com.wrapper.spotify.requests.data.library;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class RemoveAlbumsForCurrentUserRequest extends AbstractDataRequest {
   private RemoveAlbumsForCurrentUserRequest(RemoveAlbumsForCurrentUserRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.deleteJson();
   }

   public static class Builder extends AbstractDataRequest.Builder<RemoveAlbumsForCurrentUserRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public RemoveAlbumsForCurrentUserRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 50;
         return this.setQueryParameter("ids", ids);
      }

      public RemoveAlbumsForCurrentUserRequest build() {
         this.setPath("/v1/me/albums");
         return new RemoveAlbumsForCurrentUserRequest(this);
      }
   }
}
