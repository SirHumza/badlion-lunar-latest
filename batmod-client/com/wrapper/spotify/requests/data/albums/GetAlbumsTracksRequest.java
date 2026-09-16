package com.wrapper.spotify.requests.data.albums;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.TrackSimplified;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetAlbumsTracksRequest extends AbstractDataRequest {
   private GetAlbumsTracksRequest(GetAlbumsTracksRequest.Builder builder) {
      super(builder);
   }

   public Paging<TrackSimplified> execute() throws IOException, SpotifyWebApiException {
      return new TrackSimplified.JsonUtil().createModelObjectPaging(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetAlbumsTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetAlbumsTracksRequest.Builder id(String id) {
         assert id != null;
         assert !id.equals("");
         return this.setPathParameter("id", id);
      }

      public GetAlbumsTracksRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetAlbumsTracksRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetAlbumsTracksRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetAlbumsTracksRequest build() {
         this.setPath("/v1/albums/{id}/tracks");
         return new GetAlbumsTracksRequest(this);
      }
   }
}
