package com.wrapper.spotify.requests.data.users_profile;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.User;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetUsersProfileRequest extends AbstractDataRequest {
   private GetUsersProfileRequest(GetUsersProfileRequest.Builder builder) {
      super(builder);
   }

   public User execute() throws IOException, SpotifyWebApiException {
      return new User.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetUsersProfileRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetUsersProfileRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public GetUsersProfileRequest build() {
         this.setPath("/v1/users/{user_id}");
         return new GetUsersProfileRequest(this);
      }
   }
}
