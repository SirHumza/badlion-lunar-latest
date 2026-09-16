package com.wrapper.spotify.requests.data.browse;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.AlbumSimplified;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetListOfNewReleasesRequest extends AbstractDataRequest {
   private GetListOfNewReleasesRequest(GetListOfNewReleasesRequest.Builder builder) {
      super(builder);
   }

   public Paging<AlbumSimplified> execute() throws IOException, SpotifyWebApiException {
      return new AlbumSimplified.JsonUtil().createModelObjectPaging(this.getJson(), "albums");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetListOfNewReleasesRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetListOfNewReleasesRequest.Builder country(CountryCode country) {
         assert country != null;
         return this.setQueryParameter("country", country);
      }

      public GetListOfNewReleasesRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetListOfNewReleasesRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetListOfNewReleasesRequest build() {
         this.setPath("/v1/browse/new-releases");
         return new GetListOfNewReleasesRequest(this);
      }
   }
}
