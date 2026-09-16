package com.wrapper.spotify.model_objects.special;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import com.wrapper.spotify.model_objects.specification.AlbumSimplified;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PlaylistSimplified;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.personalization.interfaces.IArtistTrackModelObject;
import com.wrapper.spotify.requests.data.search.interfaces.ISearchModelObject;

public class SearchResult extends AbstractModelObject implements IArtistTrackModelObject, ISearchModelObject {
   private final Paging<AlbumSimplified> albums;
   private final Paging<Artist> artists;
   private final Paging<PlaylistSimplified> playlists;
   private final Paging<Track> tracks;

   private SearchResult(SearchResult.Builder builder) {
      super(builder);
      this.albums = builder.albums;
      this.artists = builder.artists;
      this.playlists = builder.playlists;
      this.tracks = builder.tracks;
   }

   public Paging<AlbumSimplified> getAlbums() {
      return this.albums;
   }

   public Paging<Artist> getArtists() {
      return this.artists;
   }

   public Paging<PlaylistSimplified> getPlaylists() {
      return this.playlists;
   }

   public Paging<Track> getTracks() {
      return this.tracks;
   }

   public SearchResult.Builder builder() {
      return new SearchResult.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Paging<AlbumSimplified> albums;
      private Paging<Artist> artists;
      private Paging<PlaylistSimplified> playlists;
      private Paging<Track> tracks;

      public SearchResult.Builder setAlbums(Paging<AlbumSimplified> albums) {
         this.albums = albums;
         return this;
      }

      public SearchResult.Builder setArtists(Paging<Artist> artists) {
         this.artists = artists;
         return this;
      }

      public SearchResult.Builder setPlaylists(Paging<PlaylistSimplified> playlists) {
         this.playlists = playlists;
         return this;
      }

      public SearchResult.Builder setTracks(Paging<Track> tracks) {
         this.tracks = tracks;
         return this;
      }

      public SearchResult build() {
         return new SearchResult(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<SearchResult> {
      public SearchResult createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new SearchResult.Builder()
               .setAlbums(
                  this.hasAndNotNull(jsonObject, "albums")
                     ? new AlbumSimplified.JsonUtil().createModelObjectPaging(jsonObject.getAsJsonObject("albums"))
                     : null
               )
               .setArtists(
                  this.hasAndNotNull(jsonObject, "artists") ? new Artist.JsonUtil().createModelObjectPaging(jsonObject.getAsJsonObject("artists")) : null
               )
               .setPlaylists(
                  this.hasAndNotNull(jsonObject, "playlists")
                     ? new PlaylistSimplified.JsonUtil().createModelObjectPaging(jsonObject.getAsJsonObject("playlists"))
                     : null
               )
               .setTracks(this.hasAndNotNull(jsonObject, "tracks") ? new Track.JsonUtil().createModelObjectPaging(jsonObject.getAsJsonObject("tracks")) : null)
               .build()
            : null;
      }
   }
}
