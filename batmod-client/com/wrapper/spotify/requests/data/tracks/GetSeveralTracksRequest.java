package com.wrapper.spotify.requests.data.tracks;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetSeveralTracksRequest extends AbstractDataRequest {
   private GetSeveralTracksRequest(GetSeveralTracksRequest.Builder builder) {
      super(builder);
   }

   public Track[] execute() throws IOException, SpotifyWebApiException {
      return new Track.JsonUtil().createModelObjectArray(this.getJson(), "tracks");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetSeveralTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetSeveralTracksRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 50;
         return this.setQueryParameter("ids", ids);
      }

      public GetSeveralTracksRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetSeveralTracksRequest build() {
         this.setPath("/v1/tracks");
         return new GetSeveralTracksRequest(this);
      }
   }
}
