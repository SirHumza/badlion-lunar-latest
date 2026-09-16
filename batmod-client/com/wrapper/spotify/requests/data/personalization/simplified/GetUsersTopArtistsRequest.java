package com.wrapper.spotify.requests.data.personalization.simplified;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetUsersTopArtistsRequest extends AbstractDataRequest {
   private GetUsersTopArtistsRequest(GetUsersTopArtistsRequest.Builder builder) {
      super(builder);
   }

   public Paging<Artist> execute() throws IOException, SpotifyWebApiException {
      return new Artist.JsonUtil().createModelObjectPaging(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetUsersTopArtistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetUsersTopArtistsRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetUsersTopArtistsRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetUsersTopArtistsRequest.Builder time_range(String time_range) {
         assert time_range != null;
         assert time_range.equals("long_term") || time_range.equals("medium_term") || time_range.equals("short_term");
         return this.setQueryParameter("time_range", time_range);
      }

      public GetUsersTopArtistsRequest build() {
         this.setPath("/v1/me/top/artists");
         return new GetUsersTopArtistsRequest(this);
      }
   }
}
