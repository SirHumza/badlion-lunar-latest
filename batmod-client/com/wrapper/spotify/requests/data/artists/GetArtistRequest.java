package com.wrapper.spotify.requests.data.artists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetArtistRequest extends AbstractDataRequest {
   private GetArtistRequest(GetArtistRequest.Builder builder) {
      super(builder);
   }

   public Artist execute() throws IOException, SpotifyWebApiException {
      return new Artist.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetArtistRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetArtistRequest.Builder id(String id) {
         assert id != null;
         assert !id.equals("");
         return this.setPathParameter("id", id);
      }

      public GetArtistRequest build() {
         this.setPath("/v1/artists/{id}");
         return new GetArtistRequest(this);
      }
   }
}
