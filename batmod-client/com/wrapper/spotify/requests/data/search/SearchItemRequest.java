package com.wrapper.spotify.requests.data.search;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.special.SearchResult;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class SearchItemRequest extends AbstractDataRequest {
   private SearchItemRequest(SearchItemRequest.Builder builder) {
      super(builder);
   }

   public SearchResult execute() throws IOException, SpotifyWebApiException {
      return new SearchResult.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<SearchItemRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SearchItemRequest.Builder q(String q) {
         assert q != null;
         assert !q.equals("");
         return this.setQueryParameter("q", q);
      }

      public SearchItemRequest.Builder type(String type) {
         assert type != null;
         assert type.matches("((^|,)(album|artist|playlist|track))+$");
         return this.setQueryParameter("type", type);
      }

      public SearchItemRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public SearchItemRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public SearchItemRequest.Builder offset(Integer offset) {
         assert offset != null;
         assert 0 <= offset && offset <= 100000;
         return this.setQueryParameter("offset", offset);
      }

      public SearchItemRequest build() {
         this.setPath("/v1/search");
         return new SearchItemRequest(this);
      }
   }
}
