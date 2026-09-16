package com.wrapper.spotify.requests.data.playlists;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Playlist;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class CreatePlaylistRequest extends AbstractDataRequest {
   private CreatePlaylistRequest(CreatePlaylistRequest.Builder builder) {
      super(builder);
   }

   public Playlist execute() throws IOException, SpotifyWebApiException {
      return new Playlist.JsonUtil().createModelObject(this.postJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<CreatePlaylistRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public CreatePlaylistRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public CreatePlaylistRequest.Builder name(String name) {
         assert name != null;
         assert !name.equals("");
         return this.setBodyParameter("name", name);
      }

      public CreatePlaylistRequest.Builder public_(Boolean public_) {
         return this.setBodyParameter("public", public_);
      }

      public CreatePlaylistRequest.Builder collaborative(Boolean collaborative) {
         return this.setBodyParameter("collaborative", collaborative);
      }

      public CreatePlaylistRequest.Builder description(String description) {
         assert description != null;
         assert !description.equals("");
         return this.setBodyParameter("description", description);
      }

      public CreatePlaylistRequest build() {
         this.setContentType(ContentType.APPLICATION_JSON);
         this.setPath("/v1/users/{user_id}/playlists");
         return new CreatePlaylistRequest(this);
      }
   }
}
