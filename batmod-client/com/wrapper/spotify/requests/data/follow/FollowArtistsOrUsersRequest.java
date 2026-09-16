package com.wrapper.spotify.requests.data.follow;

import com.google.gson.JsonArray;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class FollowArtistsOrUsersRequest extends AbstractDataRequest {
   private FollowArtistsOrUsersRequest(FollowArtistsOrUsersRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<FollowArtistsOrUsersRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public FollowArtistsOrUsersRequest.Builder type(ModelObjectType type) {
         assert type != null;
         assert type.getType().equals("artist") || type.getType().equals("user");
         return this.setQueryParameter("type", type);
      }

      public FollowArtistsOrUsersRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 50;
         return this.setQueryParameter("ids", ids);
      }

      public FollowArtistsOrUsersRequest.Builder ids(JsonArray ids) {
         assert ids != null;
         assert !ids.isJsonNull();
         assert ids.size() <= 50;
         return this.setBodyParameter("ids", ids);
      }

      public FollowArtistsOrUsersRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/me/following");
         return new FollowArtistsOrUsersRequest(this);
      }
   }
}
