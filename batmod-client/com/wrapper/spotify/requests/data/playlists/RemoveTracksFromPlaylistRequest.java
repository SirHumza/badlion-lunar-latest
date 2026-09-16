package com.wrapper.spotify.requests.data.playlists;

import com.google.gson.JsonArray;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.special.SnapshotResult;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class RemoveTracksFromPlaylistRequest extends AbstractDataRequest {
   private RemoveTracksFromPlaylistRequest(RemoveTracksFromPlaylistRequest.Builder builder) {
      super(builder);
   }

   public SnapshotResult execute() throws IOException, SpotifyWebApiException {
      return new SnapshotResult.JsonUtil().createModelObject(this.deleteJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<RemoveTracksFromPlaylistRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public RemoveTracksFromPlaylistRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public RemoveTracksFromPlaylistRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public RemoveTracksFromPlaylistRequest.Builder tracks(JsonArray tracks) {
         assert tracks != null;
         assert !tracks.isJsonNull();
         assert tracks.size() <= 100;
         return this.setBodyParameter("tracks", tracks);
      }

      public RemoveTracksFromPlaylistRequest.Builder snapshotId(String snapshotId) {
         assert snapshotId != null;
         assert !snapshotId.equals("");
         return this.setBodyParameter("snapshot_id", snapshotId);
      }

      public RemoveTracksFromPlaylistRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/users/{user_id}/playlists/{playlist_id}/tracks");
         return new RemoveTracksFromPlaylistRequest(this);
      }
   }
}
