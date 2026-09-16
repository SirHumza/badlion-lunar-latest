package com.wrapper.spotify.requests.data.artists;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.AlbumSimplified;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetArtistsAlbumsRequest extends AbstractDataRequest {
   private GetArtistsAlbumsRequest(GetArtistsAlbumsRequest.Builder builder) {
      super(builder);
   }

   public Paging<AlbumSimplified> execute() throws IOException, SpotifyWebApiException {
      return new AlbumSimplified.JsonUtil().createModelObjectPaging(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetArtistsAlbumsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetArtistsAlbumsRequest.Builder id(String id) {
         assert id != null;
         assert !id.equals("");
         return this.setPathParameter("id", id);
      }

      public GetArtistsAlbumsRequest.Builder album_type(String album_type) {
         assert album_type != null;
         assert album_type.matches("((^|,)(single|album|appears_on|compilation))+$");
         return this.setQueryParameter("album_type", album_type);
      }

      public GetArtistsAlbumsRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetArtistsAlbumsRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetArtistsAlbumsRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetArtistsAlbumsRequest build() {
         this.setPath("/v1/artists/{id}/albums");
         return new GetArtistsAlbumsRequest(this);
      }
   }
}
