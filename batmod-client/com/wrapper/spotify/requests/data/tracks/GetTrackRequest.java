package com.wrapper.spotify.requests.data.tracks;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetTrackRequest extends AbstractDataRequest {
   private GetTrackRequest(GetTrackRequest.Builder builder) {
      super(builder);
   }

   public Track execute() throws IOException, SpotifyWebApiException {
      return new Track.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetTrackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetTrackRequest.Builder id(String id) {
         assert id != null;
         assert !id.equals("");
         return this.setPathParameter("id", id);
      }

      public GetTrackRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetTrackRequest build() {
         this.setPath("/v1/tracks/{id}");
         return new GetTrackRequest(this);
      }
   }
}
