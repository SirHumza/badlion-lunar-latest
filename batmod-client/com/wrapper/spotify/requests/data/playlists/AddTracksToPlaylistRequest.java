package com.wrapper.spotify.requests.data.playlists;

import com.google.gson.JsonArray;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.special.SnapshotResult;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class AddTracksToPlaylistRequest extends AbstractDataRequest {
   private AddTracksToPlaylistRequest(AddTracksToPlaylistRequest.Builder builder) {
      super(builder);
   }

   public SnapshotResult execute() throws IOException, SpotifyWebApiException {
      return new SnapshotResult.JsonUtil().createModelObject(this.postJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<AddTracksToPlaylistRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public AddTracksToPlaylistRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public AddTracksToPlaylistRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public AddTracksToPlaylistRequest.Builder uris(String uris) {
         assert uris != null;
         assert !uris.equals("");
         assert uris.split(",").length <= 100;
         return this.setQueryParameter("uris", uris);
      }

      public AddTracksToPlaylistRequest.Builder position(Integer position) {
         return this.position(position, false);
      }

      public AddTracksToPlaylistRequest.Builder uris(JsonArray uris) {
         assert uris != null;
         assert !uris.isJsonNull();
         assert uris.size() <= 100;
         return this.setBodyParameter("uris", uris);
      }

      public AddTracksToPlaylistRequest.Builder position(Integer position, Boolean use_body) {
         assert position >= 0;
         return use_body ? this.setBodyParameter("position", position) : this.setQueryParameter("position", position);
      }

      public AddTracksToPlaylistRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/users/{user_id}/playlists/{playlist_id}/tracks");
         return new AddTracksToPlaylistRequest(this);
      }
   }
}
