package com.wrapper.spotify.requests.data.player;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.miscellaneous.CurrentlyPlayingContext;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetInformationAboutUsersCurrentPlaybackRequest extends AbstractDataRequest {
   private GetInformationAboutUsersCurrentPlaybackRequest(GetInformationAboutUsersCurrentPlaybackRequest.Builder builder) {
      super(builder);
   }

   public CurrentlyPlayingContext execute() throws IOException, SpotifyWebApiException {
      return new CurrentlyPlayingContext.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetInformationAboutUsersCurrentPlaybackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetInformationAboutUsersCurrentPlaybackRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetInformationAboutUsersCurrentPlaybackRequest build() {
         this.setPath("/v1/me/player");
         return new GetInformationAboutUsersCurrentPlaybackRequest(this);
      }
   }
}
