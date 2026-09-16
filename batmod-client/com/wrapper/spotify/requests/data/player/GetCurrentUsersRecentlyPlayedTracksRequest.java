package com.wrapper.spotify.requests.data.player;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.PagingCursorbased;
import com.wrapper.spotify.model_objects.specification.PlayHistory;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import java.util.Date;

public class GetCurrentUsersRecentlyPlayedTracksRequest extends AbstractDataRequest {
   private GetCurrentUsersRecentlyPlayedTracksRequest(GetCurrentUsersRecentlyPlayedTracksRequest.Builder builder) {
      super(builder);
   }

   public PagingCursorbased<PlayHistory> execute() throws IOException, SpotifyWebApiException {
      return new PlayHistory.JsonUtil().createModelObjectPagingCursorbased(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetCurrentUsersRecentlyPlayedTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetCurrentUsersRecentlyPlayedTracksRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetCurrentUsersRecentlyPlayedTracksRequest.Builder after(Date after) {
         assert after != null;
         return this.setQueryParameter("after", SpotifyApi.formatDefaultDate(after));
      }

      public GetCurrentUsersRecentlyPlayedTracksRequest.Builder before(Date before) {
         assert before != null;
         return this.setQueryParameter("before", SpotifyApi.formatDefaultDate(before));
      }

      public GetCurrentUsersRecentlyPlayedTracksRequest build() {
         this.setPath("/v1/me/player/recently-played");
         return new GetCurrentUsersRecentlyPlayedTracksRequest(this);
      }
   }
}
