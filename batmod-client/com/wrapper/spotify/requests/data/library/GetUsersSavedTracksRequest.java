package com.wrapper.spotify.requests.data.library;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.SavedTrack;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetUsersSavedTracksRequest extends AbstractDataRequest {
   private GetUsersSavedTracksRequest(GetUsersSavedTracksRequest.Builder builder) {
      super(builder);
   }

   public Paging<SavedTrack> execute() throws IOException, SpotifyWebApiException {
      return new SavedTrack.JsonUtil().createModelObjectPaging(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetUsersSavedTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetUsersSavedTracksRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetUsersSavedTracksRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetUsersSavedTracksRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetUsersSavedTracksRequest build() {
         this.setPath("/v1/me/tracks");
         return new GetUsersSavedTracksRequest(this);
      }
   }
}
