package com.wrapper.spotify.requests.data.personalization;

import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import com.wrapper.spotify.requests.data.personalization.interfaces.IArtistTrackModelObject;
import java.io.IOException;

public class GetUsersTopArtistsAndTracksRequest<T extends IArtistTrackModelObject> extends AbstractDataRequest {
   private final AbstractModelObject.JsonUtil<T> tClass;

   private GetUsersTopArtistsAndTracksRequest(GetUsersTopArtistsAndTracksRequest.Builder builder, AbstractModelObject.JsonUtil<T> tClass) {
      super(builder);
      this.tClass = tClass;
   }

   public Paging<T> execute() throws IOException, SpotifyWebApiException {
      return this.tClass.createModelObjectPaging(this.getJson());
   }

   public static final class Builder<T extends IArtistTrackModelObject> extends AbstractDataRequest.Builder<GetUsersTopArtistsAndTracksRequest.Builder<T>> {
      private AbstractModelObject.JsonUtil<T> tClass;

      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetUsersTopArtistsAndTracksRequest.Builder type(ModelObjectType type) {
         assert type != null;
         assert type.getType().equals("artists") || type.getType().equals("tracks");
         switch (type.getType()) {
            case "artists":
               this.tClass = new Artist.JsonUtil();
               break;
            case "tracks":
               this.tClass = new Track.JsonUtil();
         }

         return this.setPathParameter("type", type.getType());
      }

      public GetUsersTopArtistsAndTracksRequest.Builder limit(Integer limit) {
         assert limit != null;
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetUsersTopArtistsAndTracksRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetUsersTopArtistsAndTracksRequest.Builder time_range(String time_range) {
         assert time_range != null;
         assert time_range.equals("long_term") || time_range.equals("medium_term") || time_range.equals("short_term");
         return this.setQueryParameter("time_range", time_range);
      }

      public GetUsersTopArtistsAndTracksRequest<T> build() {
         this.setPath("/v1/me/top/{type}");
         return new GetUsersTopArtistsAndTracksRequest<>(this, this.tClass);
      }
   }
}
