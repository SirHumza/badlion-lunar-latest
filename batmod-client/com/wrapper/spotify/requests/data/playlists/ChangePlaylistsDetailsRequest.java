package com.wrapper.spotify.requests.data.playlists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class ChangePlaylistsDetailsRequest extends AbstractDataRequest {
   private ChangePlaylistsDetailsRequest(ChangePlaylistsDetailsRequest.Builder builder) {
      super(builder);
   }

   public String execute() throws IOException, SpotifyWebApiException {
      return this.putJson();
   }

   public static final class Builder extends AbstractDataRequest.Builder<ChangePlaylistsDetailsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public ChangePlaylistsDetailsRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public ChangePlaylistsDetailsRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public ChangePlaylistsDetailsRequest.Builder name(String name) {
         assert name != null;
         assert !name.equals("");
         return this.setBodyParameter("name", name);
      }

      public ChangePlaylistsDetailsRequest.Builder public_(Boolean public_) {
         return this.setBodyParameter("public", public_);
      }

      public ChangePlaylistsDetailsRequest.Builder collaborative(Boolean collaborative) {
         return this.setBodyParameter("collaborative", collaborative);
      }

      public ChangePlaylistsDetailsRequest.Builder description(String description) {
         assert description != null;
         assert !description.equals("");
         return this.setBodyParameter("description", description);
      }

      public ChangePlaylistsDetailsRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/users/{user_id}/playlists/{playlist_id}");
         return new ChangePlaylistsDetailsRequest(this);
      }
   }
}
