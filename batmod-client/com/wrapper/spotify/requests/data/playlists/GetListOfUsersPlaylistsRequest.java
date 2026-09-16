package com.wrapper.spotify.requests.data.playlists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PlaylistSimplified;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetListOfUsersPlaylistsRequest extends AbstractDataRequest {
   private GetListOfUsersPlaylistsRequest(GetListOfUsersPlaylistsRequest.Builder builder) {
      super(builder);
   }

   public Paging<PlaylistSimplified> execute() throws IOException, SpotifyWebApiException {
      return new PlaylistSimplified.JsonUtil().createModelObjectPaging(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetListOfUsersPlaylistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetListOfUsersPlaylistsRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public GetListOfUsersPlaylistsRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetListOfUsersPlaylistsRequest.Builder offset(Integer offset) {
         assert 0 <= offset && offset <= 100000;
         return this.setQueryParameter("offset", offset);
      }

      public GetListOfUsersPlaylistsRequest build() {
         this.setPath("/v1/users/{user_id}/playlists");
         return new GetListOfUsersPlaylistsRequest(this);
      }
   }
}
