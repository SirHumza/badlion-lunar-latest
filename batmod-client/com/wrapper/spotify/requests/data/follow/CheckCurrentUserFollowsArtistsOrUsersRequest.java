package com.wrapper.spotify.requests.data.follow;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class CheckCurrentUserFollowsArtistsOrUsersRequest extends AbstractDataRequest {
   private CheckCurrentUserFollowsArtistsOrUsersRequest(CheckCurrentUserFollowsArtistsOrUsersRequest.Builder builder) {
      super(builder);
   }

   public Boolean[] execute() throws IOException, SpotifyWebApiException {
      return (Boolean[])new Gson().fromJson(new JsonParser().parse(this.getJson()).getAsJsonArray(), Boolean[].class);
   }

   public static final class Builder extends AbstractDataRequest.Builder<CheckCurrentUserFollowsArtistsOrUsersRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public CheckCurrentUserFollowsArtistsOrUsersRequest.Builder type(ModelObjectType type) {
         assert type != null;
         assert type.getType().equals("artist") || type.getType().equals("user");
         return this.setQueryParameter("type", type);
      }

      public CheckCurrentUserFollowsArtistsOrUsersRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 50;
         return this.setQueryParameter("ids", ids);
      }

      public CheckCurrentUserFollowsArtistsOrUsersRequest build() {
         this.setPath("/v1/me/following/contains");
         return new CheckCurrentUserFollowsArtistsOrUsersRequest(this);
      }
   }
}
