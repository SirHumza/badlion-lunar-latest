package com.wrapper.spotify.requests.data.follow;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class UnfollowPlaylistRequest extends AbstractDataRequest {
   private UnfollowPlaylistRequest(UnfollowPlaylistRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.deleteJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<UnfollowPlaylistRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public UnfollowPlaylistRequest.Builder owner_id(String owner_id) {
         assert owner_id != null;
         assert !owner_id.equals("");
         return this.setPathParameter("owner_id", owner_id);
      }

      public UnfollowPlaylistRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public UnfollowPlaylistRequest build() {
         this.setPath("/v1/users/{owner_id}/playlists/{playlist_id}/followers");
         return new UnfollowPlaylistRequest(this);
      }
   }
}
