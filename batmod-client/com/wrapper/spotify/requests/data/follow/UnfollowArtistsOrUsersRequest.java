package com.wrapper.spotify.requests.data.follow;

import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class UnfollowArtistsOrUsersRequest extends AbstractDataRequest {
   private UnfollowArtistsOrUsersRequest(UnfollowArtistsOrUsersRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.deleteJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<UnfollowArtistsOrUsersRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public UnfollowArtistsOrUsersRequest.Builder type(ModelObjectType type) {
         assert type != null;
         assert type.getType().equals("artist") || type.getType().equals("user");
         return this.setQueryParameter("type", type);
      }

      public UnfollowArtistsOrUsersRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 50;
         return this.setQueryParameter("ids", ids);
      }

      public UnfollowArtistsOrUsersRequest build() {
         this.setPath("/v1/me/following");
         return new UnfollowArtistsOrUsersRequest(this);
      }
   }
}
