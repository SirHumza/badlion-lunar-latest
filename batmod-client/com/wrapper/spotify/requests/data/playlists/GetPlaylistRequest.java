package com.wrapper.spotify.requests.data.playlists;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Playlist;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetPlaylistRequest extends AbstractDataRequest {
   private GetPlaylistRequest(GetPlaylistRequest.Builder builder) {
      super(builder);
   }

   public Playlist execute() throws IOException, SpotifyWebApiException {
      return new Playlist.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetPlaylistRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetPlaylistRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public GetPlaylistRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public GetPlaylistRequest.Builder fields(String fields) {
         assert fields != null;
         assert !fields.equals("");
         return this.setQueryParameter("fields", fields);
      }

      public GetPlaylistRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetPlaylistRequest build() {
         this.setPath("/v1/users/{user_id}/playlists/{playlist_id}");
         return new GetPlaylistRequest(this);
      }
   }
}
