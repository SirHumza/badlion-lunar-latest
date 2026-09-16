package com.wrapper.spotify.requests.data.library;

import com.google.gson.JsonArray;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class SaveAlbumsForCurrentUserRequest extends AbstractDataRequest {
   private SaveAlbumsForCurrentUserRequest(SaveAlbumsForCurrentUserRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<SaveAlbumsForCurrentUserRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public SaveAlbumsForCurrentUserRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 50;
         return this.setQueryParameter("ids", ids);
      }

      public SaveAlbumsForCurrentUserRequest.Builder ids(JsonArray ids) {
         assert ids != null;
         assert !ids.isJsonNull();
         assert ids.size() <= 50;
         return this.setBodyParameter("ids", ids);
      }

      public SaveAlbumsForCurrentUserRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/me/albums");
         return new SaveAlbumsForCurrentUserRequest(this);
      }
   }
}
