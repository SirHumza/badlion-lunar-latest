package com.wrapper.spotify.requests.data.playlists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PlaylistSimplified;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetListOfCurrentUsersPlaylistsRequest extends AbstractDataRequest {
   private GetListOfCurrentUsersPlaylistsRequest(GetListOfCurrentUsersPlaylistsRequest.Builder builder) {
      super(builder);
   }

   public Paging<PlaylistSimplified> execute() throws IOException, SpotifyWebApiException {
      return new PlaylistSimplified.JsonUtil().createModelObjectPaging(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetListOfCurrentUsersPlaylistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetListOfCurrentUsersPlaylistsRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetListOfCurrentUsersPlaylistsRequest.Builder offset(Integer offset) {
         assert 0 <= offset && offset <= 100000;
         return this.setQueryParameter("offset", offset);
      }

      public GetListOfCurrentUsersPlaylistsRequest build() {
         this.setPath("/v1/me/playlists");
         return new GetListOfCurrentUsersPlaylistsRequest(this);
      }
   }
}
