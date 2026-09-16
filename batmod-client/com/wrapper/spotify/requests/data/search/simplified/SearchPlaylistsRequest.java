package com.wrapper.spotify.requests.data.search.simplified;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PlaylistSimplified;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class SearchPlaylistsRequest extends AbstractDataRequest {
   private SearchPlaylistsRequest(SearchPlaylistsRequest.Builder builder) {
      super(builder);
   }

   public Paging<PlaylistSimplified> execute() throws IOException, SpotifyWebApiException {
      return new PlaylistSimplified.JsonUtil().createModelObjectPaging(this.getJson(), "playlists");
   }

   public static final class Builder extends AbstractDataRequest.Builder<SearchPlaylistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SearchPlaylistsRequest.Builder q(String q) {
         assert q != null;
         assert !q.equals("");
         return this.setQueryParameter("q", q);
      }

      public SearchPlaylistsRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public SearchPlaylistsRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public SearchPlaylistsRequest.Builder offset(Integer offset) {
         assert offset != null;
         assert 0 <= offset && offset <= 100000;
         return this.setQueryParameter("offset", offset);
      }

      public SearchPlaylistsRequest build() {
         this.setPath("/v1/search");
         this.setQueryParameter("type", "playlist");
         return new SearchPlaylistsRequest(this);
      }
   }
}
