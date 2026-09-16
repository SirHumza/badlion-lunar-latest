package com.wrapper.spotify.requests.data.player;

import com.google.gson.JsonArray;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class TransferUsersPlaybackRequest extends AbstractDataRequest {
   private TransferUsersPlaybackRequest(TransferUsersPlaybackRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<TransferUsersPlaybackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public TransferUsersPlaybackRequest.Builder device_ids(JsonArray device_ids) {
         assert device_ids != null;
         assert !device_ids.isJsonNull();
         assert device_ids.size() == 1;
         return this.setBodyParameter("device_ids", device_ids);
      }

      public TransferUsersPlaybackRequest.Builder play(Boolean play) {
         return this.setBodyParameter("play", play);
      }

      public TransferUsersPlaybackRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/me/player");
         return new TransferUsersPlaybackRequest(this);
      }
   }
}
