package com.wrapper.spotify.requests.data.browse;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PlaylistSimplified;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetCategorysPlaylistsRequest extends AbstractDataRequest {
   private GetCategorysPlaylistsRequest(GetCategorysPlaylistsRequest.Builder builder) {
      super(builder);
   }

   public Paging<PlaylistSimplified> execute() throws IOException, SpotifyWebApiException {
      return new PlaylistSimplified.JsonUtil().createModelObjectPaging(this.getJson(), "playlists");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetCategorysPlaylistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetCategorysPlaylistsRequest.Builder category_id(String category_id) {
         assert category_id != null;
         assert category_id.matches("^[a-z]+$");
         return this.setPathParameter("category_id", category_id);
      }

      public GetCategorysPlaylistsRequest.Builder country(CountryCode country) {
         assert country != null;
         return this.setQueryParameter("country", country);
      }

      public GetCategorysPlaylistsRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetCategorysPlaylistsRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetCategorysPlaylistsRequest build() {
         this.setPath("/v1/browse/categories/{category_id}/playlists");
         return new GetCategorysPlaylistsRequest(this);
      }
   }
}
