package com.wrapper.spotify.requests.data.library;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class CheckUsersSavedAlbumsRequest extends AbstractDataRequest {
   private CheckUsersSavedAlbumsRequest(CheckUsersSavedAlbumsRequest.Builder builder) {
      super(builder);
   }

   public Boolean[] execute() throws IOException, SpotifyWebApiException {
      return (Boolean[])new Gson().fromJson(new JsonParser().parse(this.getJson()).getAsJsonArray(), Boolean[].class);
   }

   public static final class Builder extends AbstractDataRequest.Builder<CheckUsersSavedAlbumsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public CheckUsersSavedAlbumsRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 50;
         return this.setQueryParameter("ids", ids);
      }

      public CheckUsersSavedAlbumsRequest build() {
         this.setPath("/v1/me/albums/contains");
         return new CheckUsersSavedAlbumsRequest(this);
      }
   }
}
