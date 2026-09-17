package com.wrapper.spotify.requests.data.artists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetSeveralArtistsRequest extends AbstractDataRequest {
   private GetSeveralArtistsRequest(GetSeveralArtistsRequest.Builder builder) {
      super(builder);
   }

   public Artist[] execute() throws IOException, SpotifyWebApiException {
      return new Artist.JsonUtil().createModelObjectArray(this.getJson(), "artists");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetSeveralArtistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetSeveralArtistsRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 50;
         return this.setQueryParameter("ids", ids);
      }

      public GetSeveralArtistsRequest build() {
         this.setPath("/v1/artists");
         return new GetSeveralArtistsRequest(this);
      }
   }
}
