package com.wrapper.spotify.requests.data.browse;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.LanguageCode;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.special.FeaturedPlaylists;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;
import java.util.Date;

public class GetListOfFeaturedPlaylistsRequest extends AbstractDataRequest {
   private GetListOfFeaturedPlaylistsRequest(GetListOfFeaturedPlaylistsRequest.Builder builder) {
      super(builder);
   }

   public FeaturedPlaylists execute() throws IOException, SpotifyWebApiException {
      return new FeaturedPlaylists.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetListOfFeaturedPlaylistsRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetListOfFeaturedPlaylistsRequest.Builder locale(String locale) {
         assert locale != null;
         assert locale.contains("_");
         String[] localeParts = locale.split("_");
         assert localeParts.length == 2;
         assert LanguageCode.getByCode(localeParts[0]) != null;
         assert CountryCode.getByCode(localeParts[1]) != null;
         return this.setQueryParameter("locale", locale);
      }

      public GetListOfFeaturedPlaylistsRequest.Builder country(CountryCode country) {
         assert country != null;
         return this.setQueryParameter("country", country);
      }

      public GetListOfFeaturedPlaylistsRequest.Builder timestamp(Date timestamp) {
         assert timestamp != null;
         return this.setQueryParameter("timestamp", SpotifyApi.formatDefaultDate(timestamp));
      }

      public GetListOfFeaturedPlaylistsRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetListOfFeaturedPlaylistsRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetListOfFeaturedPlaylistsRequest build() {
         this.setPath("/v1/browse/featured-playlists");
         return new GetListOfFeaturedPlaylistsRequest(this);
      }
   }
}
