package com.wrapper.spotify.requests.data.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class StartResumeUsersPlaybackRequest extends AbstractDataRequest {
   private StartResumeUsersPlaybackRequest(StartResumeUsersPlaybackRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<StartResumeUsersPlaybackRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public StartResumeUsersPlaybackRequest.Builder device_id(String device_id) {
         assert device_id != null;
         assert !device_id.equals("");
         return this.setQueryParameter("device_id", device_id);
      }

      public StartResumeUsersPlaybackRequest.Builder context_uri(String context_uri) {
         assert context_uri != null;
         assert !context_uri.equals("");
         return this.setBodyParameter("context_uri", context_uri);
      }

      public StartResumeUsersPlaybackRequest.Builder uris(JsonArray uris) {
         assert uris != null;
         assert !uris.isJsonNull();
         return this.setBodyParameter("uris", uris);
      }

      public StartResumeUsersPlaybackRequest.Builder offset(JsonObject offset) {
         assert offset != null;
         assert !offset.isJsonNull();
         return this.setBodyParameter("offset", offset);
      }

      public StartResumeUsersPlaybackRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/me/player/play");
         return new StartResumeUsersPlaybackRequest(this);
      }
   }
}
