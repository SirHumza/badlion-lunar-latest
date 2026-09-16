package com.wrapper.spotify.requests.data.playlists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Image;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetPlaylistCoverImageRequest extends AbstractDataRequest {
   private GetPlaylistCoverImageRequest(GetPlaylistCoverImageRequest.Builder builder) {
      super(builder);
   }

   public Image[] execute() throws IOException, SpotifyWebApiException {
      return new Image.JsonUtil().createModelObjectArray(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetPlaylistCoverImageRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetPlaylistCoverImageRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public GetPlaylistCoverImageRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public GetPlaylistCoverImageRequest build() {
         this.setPath("/v1/users/{user_id}/playlists/{playlist_id}/images");
         return new GetPlaylistCoverImageRequest(this);
      }
   }
}
