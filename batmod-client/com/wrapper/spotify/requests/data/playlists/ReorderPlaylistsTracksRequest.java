package com.wrapper.spotify.requests.data.playlists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.special.SnapshotResult;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class ReorderPlaylistsTracksRequest extends AbstractDataRequest {
   private ReorderPlaylistsTracksRequest(ReorderPlaylistsTracksRequest.Builder builder) {
      super(builder);
   }

   public SnapshotResult execute() throws IOException, SpotifyWebApiException {
      return new SnapshotResult.JsonUtil().createModelObject(this.putJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<ReorderPlaylistsTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public ReorderPlaylistsTracksRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public ReorderPlaylistsTracksRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public ReorderPlaylistsTracksRequest.Builder range_start(Integer range_start) {
         assert range_start != null;
         assert range_start >= 0;
         return this.setBodyParameter("range_start", range_start);
      }

      public ReorderPlaylistsTracksRequest.Builder range_length(Integer range_length) {
         assert range_length != null;
         assert range_length >= 1;
         return this.setBodyParameter("range_length", range_length);
      }

      public ReorderPlaylistsTracksRequest.Builder insert_before(Integer insert_before) {
         assert insert_before != null;
         assert insert_before >= 0;
         return this.setBodyParameter("insert_before", insert_before);
      }

      public ReorderPlaylistsTracksRequest.Builder snapshot_id(String snapshot_id) {
         assert snapshot_id != null;
         assert !snapshot_id.equals("");
         return this.setBodyParameter("snapshot_id", snapshot_id);
      }

      public ReorderPlaylistsTracksRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/users/{user_id}/playlists/{playlist_id}/tracks");
         return new ReorderPlaylistsTracksRequest(this);
      }
   }
}
