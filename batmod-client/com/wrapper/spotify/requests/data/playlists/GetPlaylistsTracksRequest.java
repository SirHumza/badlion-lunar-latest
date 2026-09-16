package com.wrapper.spotify.requests.data.playlists;

import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PlaylistTrack;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetPlaylistsTracksRequest extends AbstractDataRequest {
   private GetPlaylistsTracksRequest(GetPlaylistsTracksRequest.Builder builder) {
      super(builder);
   }

   public Paging<PlaylistTrack> execute() throws IOException, SpotifyWebApiException {
      return new PlaylistTrack.JsonUtil().createModelObjectPaging(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetPlaylistsTracksRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetPlaylistsTracksRequest.Builder user_id(String user_id) {
         assert user_id != null;
         assert !user_id.equals("");
         return this.setPathParameter("user_id", user_id);
      }

      public GetPlaylistsTracksRequest.Builder playlist_id(String playlist_id) {
         assert playlist_id != null;
         assert !playlist_id.equals("");
         return this.setPathParameter("playlist_id", playlist_id);
      }

      public GetPlaylistsTracksRequest.Builder fields(String fields) {
         assert fields != null;
         assert !fields.equals("");
         return this.setQueryParameter("fields", fields);
      }

      public GetPlaylistsTracksRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 100;
         return this.setQueryParameter("limit", limit);
      }

      public GetPlaylistsTracksRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetPlaylistsTracksRequest.Builder market(CountryCode market) {
         assert market != null;
         return this.setQueryParameter("market", market);
      }

      public GetPlaylistsTracksRequest build() {
         this.setPath("/v1/users/{user_id}/playlists/{playlist_id}/tracks");
         return new GetPlaylistsTracksRequest(this);
      }
   }
}
