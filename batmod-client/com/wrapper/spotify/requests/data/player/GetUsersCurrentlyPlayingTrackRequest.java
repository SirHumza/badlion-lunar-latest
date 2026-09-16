package com.wrapper.spotify.requests.data.player;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.miscellaneous.CurrentlyPlaying;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetUsersCurrentlyPlayingTrackRequest extends AbstractDataRequest {
   private GetUsersCurrentlyPlayingTrackRequest(GetUsersCurrentlyPlayingTrackRequest.Builder builder) {
      super(builder);
   }

   public CurrentlyPlaying execute() throws IOException, SpotifyWebApiException {
      return new CurrentlyPlaying.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetUsersCurrentlyPlayingTrackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetUsersCurrentlyPlayingTrackRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetUsersCurrentlyPlayingTrackRequest build() {
         this.setPath("/v1/me/player/currently-playing");
         return new GetUsersCurrentlyPlayingTrackRequest(this);
      }
   }
}
