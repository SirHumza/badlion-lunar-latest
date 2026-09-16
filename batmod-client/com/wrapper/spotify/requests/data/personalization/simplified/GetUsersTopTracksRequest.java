package com.wrapper.spotify.requests.data.personalization.simplified;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetUsersTopTracksRequest extends AbstractDataRequest {
   private GetUsersTopTracksRequest(GetUsersTopTracksRequest.Builder builder) {
      super(builder);
   }

   public Paging<Track> execute() throws IOException, SpotifyWebApiException {
      return new Track.JsonUtil().createModelObjectPaging(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetUsersTopTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetUsersTopTracksRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetUsersTopTracksRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetUsersTopTracksRequest.Builder time_range(String time_range) {
         assert time_range != null;
         assert time_range.equals("long_term") || time_range.equals("medium_term") || time_range.equals("short_term");
         return this.setQueryParameter("time_range", time_range);
      }

      public GetUsersTopTracksRequest build() {
         this.setPath("/v1/me/top/tracks");
         return new GetUsersTopTracksRequest(this);
      }
   }
}
