package com.wrapper.spotify.requests.data.follow;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class FollowPlaylistRequest extends AbstractDataRequest {
   private FollowPlaylistRequest(FollowPlaylistRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<FollowPlaylistRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public FollowPlaylistRequest.Builder owner_id(String owner_id) {
         assert owner_id != null;
         assert !owner_id.equals("");
         return this.setPathParameter("owner_id", owner_id);
      }

      public FollowPlaylistRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public FollowPlaylistRequest.Builder public_(Boolean public_) {
         assert public_ != null;
         return this.setBodyParameter("public", public_);
      }

      public FollowPlaylistRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/users/{owner_id}/playlists/{playlist_id}/followers");
         return new FollowPlaylistRequest(this);
      }
   }
}
