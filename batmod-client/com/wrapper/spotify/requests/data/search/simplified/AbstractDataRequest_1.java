package com.wrapper.spotify.requests.data.search.simplified;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class SearchTracksRequest extends AbstractDataRequest {
   private SearchTracksRequest(SearchTracksRequest.Builder builder) {
      super(builder);
   }

   public Paging<Track> execute() throws IOException, SpotifyWebApiException {
      return new Track.JsonUtil().createModelObjectPaging(this.getJson(), "tracks");
   }

   public static final class Builder extends AbstractDataRequest.Builder<SearchTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SearchTracksRequest.Builder q(String q) {
         assert q != null;
         assert !q.equals("");
         return this.setQueryParameter("q", q);
      }

      public SearchTracksRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public SearchTracksRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public SearchTracksRequest.Builder offset(Integer offset) {
         assert offset != null;
         assert 0 <= offset && offset <= 100000;
         return this.setQueryParameter("offset", offset);
      }

      public SearchTracksRequest build() {
         this.setPath("/v1/search");
         this.setQueryParameter("type", "track");
         return new SearchTracksRequest(this);
      }
   }
}
