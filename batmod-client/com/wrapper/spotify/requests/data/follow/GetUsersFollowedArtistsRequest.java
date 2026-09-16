package com.wrapper.spotify.requests.data.follow;

import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.PagingCursorbased;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetUsersFollowedArtistsRequest extends AbstractDataRequest {
   private GetUsersFollowedArtistsRequest(GetUsersFollowedArtistsRequest.Builder builder) {
      super(builder);
   }

   public PagingCursorbased<Artist> execute() throws IOException, SpotifyWebApiException {
      return new Artist.JsonUtil().createModelObjectPagingCursorbased(this.getJson(), "artists");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetUsersFollowedArtistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetUsersFollowedArtistsRequest.Builder type(ModelObjectType type) {
         assert type != null;
         assert type.getType().equals("artist");
         return this.setQueryParameter("type", type);
      }

      public GetUsersFollowedArtistsRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetUsersFollowedArtistsRequest.Builder after(String after) {
         assert after != null;
         return this.setQueryParameter("after", after);
      }

      public GetUsersFollowedArtistsRequest build() {
         this.setPath("/v1/me/following");
         return new GetUsersFollowedArtistsRequest(this);
      }
   }
}
