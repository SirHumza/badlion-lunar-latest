package com.wrapper.spotify.model_objects.specification;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.enums.AlbumType;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.enums.ReleaseDatePrecision;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Album extends AbstractModelObject {
   private final AlbumType albumType;
   private final ArtistSimplified[] artists;
   private final CountryCode[] availableMarkets;
   private final Copyright[] copyrights;
   private final ExternalId externalIds;
   private final ExternalUrl externalUrls;
   private final String[] genres;
   private final String href;
   private final String id;
   private final Image[] images;
   private final String label;
   private final String name;
   private final Integer popularity;
   private final String releaseDate;
   private final ReleaseDatePrecision releaseDatePrecision;
   private final Paging<TrackSimplified> tracks;
   private final ModelObjectType type;
   private final String uri;

   private Album(Album.Builder builder) {
      super(builder);
      this.albumType = builder.albumType;
      this.artists = builder.artists;
      this.availableMarkets = builder.availableMarkets;
      this.copyrights = builder.copyrights;
      this.externalIds = builder.externalIds;
      this.externalUrls = builder.externalUrls;
      this.genres = builder.genres;
      this.href = builder.href;
      this.id = builder.id;
      this.images = builder.images;
      this.label = builder.label;
      this.name = builder.name;
      this.popularity = builder.popularity;
      this.releaseDate = builder.releaseDate;
      this.releaseDatePrecision = builder.releaseDatePrecision;
      this.tracks = builder.tracks;
      this.type = builder.type;
      this.uri = builder.uri;
   }

   public AlbumType getAlbumType() {
      return this.albumType;
   }

   public ArtistSimplified[] getArtists() {
      return this.artists;
   }

   public CountryCode[] getAvailableMarkets() {
      return this.availableMarkets;
   }

   public Copyright[] getCopyrights() {
      return this.copyrights;
   }

   public ExternalId getExternalIds() {
      return this.externalIds;
   }

   public ExternalUrl getExternalUrls() {
      return this.externalUrls;
   }

   public String[] getGenres() {
      return this.genres;
   }

   public String getHref() {
      return this.href;
   }

   public String getId() {
      return this.id;
   }

   public Image[] getImages() {
      return this.images;
   }

   public String getLabel() {
      return this.label;
   }

   public String getName() {
      return this.name;
   }

   public Integer getPopularity() {
      return this.popularity;
   }

   public String getReleaseDate() {
      return this.releaseDate;
   }

   public ReleaseDatePrecision getReleaseDatePrecision() {
      return this.releaseDatePrecision;
   }

   public Paging<TrackSimplified> getTracks() {
      return this.tracks;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public Album.Builder builder() {
      return new Album.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private AlbumType albumType;
      private ArtistSimplified[] artists;
      private CountryCode[] availableMarkets;
      private Copyright[] copyrights;
      private ExternalId externalIds;
      private ExternalUrl externalUrls;
      private String[] genres;
      private String href;
      private String id;
      private Image[] images;
      private String label;
      private String name;
      private Integer popularity;
      private String releaseDate;
      private ReleaseDatePrecision releaseDatePrecision;
      private Paging<TrackSimplified> tracks;
      private ModelObjectType type;
      private String uri;

      public Album.Builder setAlbumType(AlbumType albumType) {
         this.albumType = albumType;
         return this;
      }

      public Album.Builder setArtists(ArtistSimplified... artists) {
         this.artists = artists;
         return this;
      }

      public Album.Builder setAvailableMarkets(CountryCode... availableMarkets) {
         this.availableMarkets = availableMarkets;
         return this;
      }

      public Album.Builder setCopyrights(Copyright... copyrights) {
         this.copyrights = copyrights;
         return this;
      }

      public Album.Builder setExternalIds(ExternalId externalIds) {
         this.externalIds = externalIds;
         return this;
      }

      public Album.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public Album.Builder setGenres(String... genres) {
         this.genres = genres;
         return this;
      }

      public Album.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public Album.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public Album.Builder setImages(Image... images) {
         this.images = images;
         return this;
      }

      public Album.Builder setLabel(String label) {
         this.label = label;
         return this;
      }

      public Album.Builder setName(String name) {
         this.name = name;
         return this;
      }

      public Album.Builder setPopularity(Integer popularity) {
         this.popularity = popularity;
         return this;
      }

      public Album.Builder setReleaseDate(String releaseDate) {
         this.releaseDate = releaseDate;
         return this;
      }

      public Album.Builder setReleaseDatePrecision(ReleaseDatePrecision releaseDatePrecision) {
         this.releaseDatePrecision = releaseDatePrecision;
         return this;
      }

      public Album.Builder setTracks(Paging<TrackSimplified> tracks) {
         this.tracks = tracks;
         return this;
      }

      public Album.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public Album.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public Album build() {
         return new Album(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Album> {
      public Album createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Album.Builder()
               .setAlbumType(this.hasAndNotNull(jsonObject, "album_type") ? AlbumType.keyOf(jsonObject.get("album_type").getAsString().toLowerCase()) : null)
               .setArtists(
                  this.hasAndNotNull(jsonObject, "artists")
                     ? new ArtistSimplified.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("artists"))
                     : null
               )
               .setAvailableMarkets(
                  this.hasAndNotNull(jsonObject, "available_markets")
                     ? (CountryCode[])new Gson().fromJson(jsonObject.getAsJsonArray("available_markets"), CountryCode[].class)
                     : null
               )
               .setCopyrights(
                  this.hasAndNotNull(jsonObject, "copyrights")
                     ? new Copyright.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("copyrights"))
                     : null
               )
               .setExternalIds(
                  this.hasAndNotNull(jsonObject, "external_ids")
                     ? new ExternalId.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_ids"))
                     : null
               )
               .setExternalUrls(
                  this.hasAndNotNull(jsonObject, "external_urls")
                     ? new ExternalUrl.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_urls"))
                     : null
               )
               .setGenres(this.hasAndNotNull(jsonObject, "genres") ? (String[])new Gson().fromJson(jsonObject.getAsJsonArray("genres"), String[].class) : null)
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setImages(this.hasAndNotNull(jsonObject, "images") ? new Image.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("images")) : null)
               .setLabel(this.hasAndNotNull(jsonObject, "label") ? jsonObject.get("label").getAsString() : null)
               .setName(this.hasAndNotNull(jsonObject, "name") ? jsonObject.get("name").getAsString() : null)
               .setPopularity(this.hasAndNotNull(jsonObject, "popularity") ? jsonObject.get("popularity").getAsInt() : null)
               .setReleaseDate(this.hasAndNotNull(jsonObject, "release_date") ? jsonObject.get("release_date").getAsString() : null)
               .setReleaseDatePrecision(
                  this.hasAndNotNull(jsonObject, "release_date_precision")
                     ? ReleaseDatePrecision.keyOf(jsonObject.get("release_date_precision").getAsString().toLowerCase())
                     : null
               )
               .setTracks(
                  this.hasAndNotNull(jsonObject, "tracks")
                     ? new TrackSimplified.JsonUtil().createModelObjectPaging(jsonObject.getAsJsonObject("tracks"))
                     : null
               )
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
