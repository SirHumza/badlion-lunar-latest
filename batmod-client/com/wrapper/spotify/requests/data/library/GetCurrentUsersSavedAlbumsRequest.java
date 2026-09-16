package com.wrapper.spotify.requests.data.library;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.SavedAlbum;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetCurrentUsersSavedAlbumsRequest extends AbstractDataRequest {
   private GetCurrentUsersSavedAlbumsRequest(GetCurrentUsersSavedAlbumsRequest.Builder builder) {
      super(builder);
   }

   public Paging<SavedAlbum> execute() throws IOException, SpotifyWebApiException {
      return new SavedAlbum.JsonUtil().createModelObjectPaging(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetCurrentUsersSavedAlbumsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetCurrentUsersSavedAlbumsRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetCurrentUsersSavedAlbumsRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetCurrentUsersSavedAlbumsRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetCurrentUsersSavedAlbumsRequest build() {
         this.setPath("/v1/me/albums");
         return new GetCurrentUsersSavedAlbumsRequest(this);
      }
   }
}
