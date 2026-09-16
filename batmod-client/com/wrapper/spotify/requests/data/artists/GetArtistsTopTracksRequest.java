package com.wrapper.spotify.requests.data.artists;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetArtistsTopTracksRequest extends AbstractDataRequest {
   private GetArtistsTopTracksRequest(GetArtistsTopTracksRequest.Builder builder) {
      super(builder);
   }

   public Track[] execute() throws IOException, SpotifyWebApiException {
      return new Track.JsonUtil().createModelObjectArray(this.getJson(), "tracks");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetArtistsTopTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetArtistsTopTracksRequest.Builder id(String id) {
         assert id != null;
         assert !id.equals("");
         return this.setPathParameter("id", id);
      }

      public GetArtistsTopTracksRequest.Builder country(CountryCode country) {
         assert country != null;
         return this.setQueryParameter("country", country);
      }

      public GetArtistsTopTracksRequest build() {
         this.setPath("/v1/artists/{id}/top-tracks");
         return new GetArtistsTopTracksRequest(this);
      }
   }
}
