package com.wrapper.spotify.requests.data.playlists;

import com.google.gson.JsonArray;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class ReplacePlaylistsTracksRequest extends AbstractDataRequest {
   private ReplacePlaylistsTracksRequest(ReplacePlaylistsTracksRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<ReplacePlaylistsTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public ReplacePlaylistsTracksRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public ReplacePlaylistsTracksRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public ReplacePlaylistsTracksRequest.Builder uris(String uris) {
         assert uris != null;
         assert !uris.equals("");
         assert uris.split(",").length <= 100;
         return this.setQueryParameter("uris", uris);
      }

      public ReplacePlaylistsTracksRequest.Builder uris(JsonArray uris) {
         assert uris != null;
         assert !uris.isJsonNull();
         assert uris.size() <= 100;
         return this.setBodyParameter("uris", uris);
      }

      public ReplacePlaylistsTracksRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/users/{user_id}/playlists/{playlist_id}/tracks");
         return new ReplacePlaylistsTracksRequest(this);
      }
   }
}
