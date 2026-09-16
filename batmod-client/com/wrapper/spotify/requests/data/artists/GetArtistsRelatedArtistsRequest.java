package com.wrapper.spotify.requests.data.artists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetArtistsRelatedArtistsRequest extends AbstractDataRequest {
   private GetArtistsRelatedArtistsRequest(GetArtistsRelatedArtistsRequest.Builder builder) {
      super(builder);
   }

   public Artist[] execute() throws IOException, SpotifyWebApiException {
      return new Artist.JsonUtil().createModelObjectArray(this.getJson(), "artists");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetArtistsRelatedArtistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetArtistsRelatedArtistsRequest.Builder id(String id) {
         assert id != null;
         assert !id.equals("");
         return this.setPathParameter("id", id);
      }

      public GetArtistsRelatedArtistsRequest build() {
         this.setPath("/v1/artists/{id}/related-artists");
         return new GetArtistsRelatedArtistsRequest(this);
      }
   }
}
