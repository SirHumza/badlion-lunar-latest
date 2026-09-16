package com.wrapper.spotify.requests.data.albums;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Album;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetSeveralAlbumsRequest extends AbstractDataRequest {
   private GetSeveralAlbumsRequest(GetSeveralAlbumsRequest.Builder builder) {
      super(builder);
   }

   public Album[] execute() throws IOException, SpotifyWebApiException {
      return new Album.JsonUtil().createModelObjectArray(this.getJson(), "albums");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetSeveralAlbumsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetSeveralAlbumsRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 20;
         return this.setQueryParameter("ids", ids);
      }

      public GetSeveralAlbumsRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetSeveralAlbumsRequest build() {
         this.setPath("/v1/albums");
         return new GetSeveralAlbumsRequest(this);
      }
   }
}
