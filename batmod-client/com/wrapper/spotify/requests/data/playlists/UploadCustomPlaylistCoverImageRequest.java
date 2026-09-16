package com.wrapper.spotify.requests.data.playlists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.AbstractRequest;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class UploadCustomPlaylistCoverImageRequest extends AbstractDataRequest {
   private UploadCustomPlaylistCoverImageRequest(UploadCustomPlaylistCoverImageRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<UploadCustomPlaylistCoverImageRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public UploadCustomPlaylistCoverImageRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public UploadCustomPlaylistCoverImageRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      @Override
      public AbstractRequest build() {
         return null;
      }
   }
}
