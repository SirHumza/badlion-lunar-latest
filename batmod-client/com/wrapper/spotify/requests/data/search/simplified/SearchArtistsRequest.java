package com.wrapper.spotify.requests.data.search.simplified;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class SearchArtistsRequest extends AbstractDataRequest {
   private SearchArtistsRequest(SearchArtistsRequest.Builder builder) {
      super(builder);
   }

   public Paging<Artist> execute() throws IOException, SpotifyWebApiException {
      return new Artist.JsonUtil().createModelObjectPaging(this.getJson(), "artists");
   }

   public static final class Builder extends AbstractDataRequest.Builder<SearchArtistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SearchArtistsRequest.Builder q(String q) {
         assert q != null;
         assert !q.equals("");
         return this.setQueryParameter("q", q);
      }

      public SearchArtistsRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public SearchArtistsRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public SearchArtistsRequest.Builder offset(Integer offset) {
         assert offset != null;
         assert 0 <= offset && offset <= 100000;
         return this.setQueryParameter("offset", offset);
      }

      public SearchArtistsRequest build() {
         this.setPath("/v1/search");
         this.setQueryParameter("type", "artist");
         return new SearchArtistsRequest(this);
      }
   }
}
