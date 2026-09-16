package com.wrapper.spotify.requests.data.follow;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class CheckUsersFollowPlaylistRequest extends AbstractDataRequest {
   private CheckUsersFollowPlaylistRequest(CheckUsersFollowPlaylistRequest.Builder builder) {
      super(builder);
   }

   public Boolean[] execute() throws IOException, SpotifyWebApiException {
      return (Boolean[])new Gson().fromJson(new JsonParser().parse(this.getJson()).getAsJsonArray(), Boolean[].class);
   }

   public static final class Builder extends AbstractDataRequest.Builder<CheckUsersFollowPlaylistRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public CheckUsersFollowPlaylistRequest.Builder owner_id(String owner_id) {
         assert owner_id != null;
         assert !owner_id.equals("");
         return this.setPathParameter("owner_id", owner_id);
      }

      public CheckUsersFollowPlaylistRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public CheckUsersFollowPlaylistRequest.Builder ids(String ids) {
         assert ids != null;
         assert ids.split(",").length <= 5;
         return this.setQueryParameter("ids", ids);
      }

      public CheckUsersFollowPlaylistRequest build() {
         this.setPath("/v1/users/{owner_id}/playlists/{playlist_id}/followers/contains");
         return new CheckUsersFollowPlaylistRequest(this);
      }
   }
}
