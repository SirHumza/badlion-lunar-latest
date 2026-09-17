package com.wrapper.spotify.requests.data.albums;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Album;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetAlbumRequest extends AbstractDataRequest {
   private GetAlbumRequest(GetAlbumRequest.Builder builder) {
      super(builder);
   }

   public Album execute() throws IOException, SpotifyWebApiException {
      return new Album.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetAlbumRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetAlbumRequest.Builder id(String id) {
         assert id != null;
         assert !id.equals("");
         return this.setPathParameter("id", id);
      }

      public GetAlbumRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetAlbumRequest build() {
         this.setPath("/v1/albums/{id}");
         return new GetAlbumRequest(this);
      }
   }
}
