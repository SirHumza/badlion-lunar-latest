package com.wrapper.spotify.requests.data.search.simplified;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.AlbumSimplified;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class SearchAlbumsRequest extends AbstractDataRequest {
   private SearchAlbumsRequest(SearchAlbumsRequest.Builder builder) {
      super(builder);
   }

   public Paging<AlbumSimplified> execute() throws IOException, SpotifyWebApiException {
      return new AlbumSimplified.JsonUtil().createModelObjectPaging(this.getJson(), "albums");
   }

   public static final class Builder extends AbstractDataRequest.Builder<SearchAlbumsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SearchAlbumsRequest.Builder q(String q) {
         assert q != null;
         assert !q.equals("");
         return this.setQueryParameter("q", q);
      }

      public SearchAlbumsRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public SearchAlbumsRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public SearchAlbumsRequest.Builder offset(Integer offset) {
         assert offset != null;
         assert 0 <= offset && offset <= 100000;
         return this.setQueryParameter("offset", offset);
      }

      public SearchAlbumsRequest build() {
         this.setPath("/v1/search");
         this.setQueryParameter("type", "album");
         return new SearchAlbumsRequest(this);
      }
   }
}
