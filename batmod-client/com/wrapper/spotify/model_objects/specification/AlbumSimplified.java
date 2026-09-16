package com.wrapper.spotify.model_objects.specification;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.enums.AlbumType;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import com.wrapper.spotify.requests.data.search.interfaces.ISearchModelObject;

public class AlbumSimplified extends AbstractModelObject implements ISearchModelObject {
   private final AlbumType albumType;
   private final ArtistSimplified[] artists;
   private final CountryCode[] availableMarkets;
   private final ExternalUrl externalUrls;
   private final String href;
   private final String id;
   private final Image[] images;
   private final String name;
   private final ModelObjectType type;
   private final String uri;

   private AlbumSimplified(AlbumSimplified.Builder builder) {
      super(builder);
      this.albumType = builder.albumType;
      this.artists = builder.artists;
      this.availableMarkets = builder.availableMarkets;
      this.externalUrls = builder.externalUrls;
      this.href = builder.href;
      this.id = builder.id;
      this.images = builder.images;
      this.name = builder.name;
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

   public ExternalUrl getExternalUrls() {
      return this.externalUrls;
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

   public String getName() {
      return this.name;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public AlbumSimplified.Builder builder() {
      return new AlbumSimplified.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private AlbumType albumType;
      private ArtistSimplified[] artists;
      private CountryCode[] availableMarkets;
      private ExternalUrl externalUrls;
      private String href;
      private String id;
      private Image[] images;
      private String name;
      private ModelObjectType type;
      private String uri;

      public AlbumSimplified.Builder setAlbumType(AlbumType albumType) {
         this.albumType = albumType;
         return this;
      }

      public AlbumSimplified.Builder setArtists(ArtistSimplified... artists) {
         this.artists = artists;
         return this;
      }

      public AlbumSimplified.Builder setAvailableMarkets(CountryCode... availableMarkets) {
         this.availableMarkets = availableMarkets;
         return this;
      }

      public AlbumSimplified.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public AlbumSimplified.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public AlbumSimplified.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public AlbumSimplified.Builder setImages(Image... images) {
         this.images = images;
         return this;
      }

      public AlbumSimplified.Builder setName(String name) {
         this.name = name;
         return this;
      }

      public AlbumSimplified.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public AlbumSimplified.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public AlbumSimplified build() {
         return new AlbumSimplified(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AlbumSimplified> {
      public AlbumSimplified createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AlbumSimplified.Builder()
               .setAlbumType(this.hasAndNotNull(jsonObject, "album_type") ? AlbumType.keyOf(jsonObject.get("album_type").getAsString().toLowerCase()) : null)
               .setArtists(
                  this.hasAndNotNull(jsonObject, "artists")
                     ? new ArtistSimplified.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("artists"))
                     : null
               )
               .setAvailableMarkets(
                  this.hasAndNotNull(jsonObject, "available_markets")
                     ? (CountryCode[])new Gson().fromJson(jsonObject.get("available_markets"), CountryCode[].class)
                     : null
               )
               .setExternalUrls(
                  this.hasAndNotNull(jsonObject, "external_urls")
                     ? new ExternalUrl.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_urls"))
                     : null
               )
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setImages(this.hasAndNotNull(jsonObject, "images") ? new Image.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("images")) : null)
               .setName(this.hasAndNotNull(jsonObject, "name") ? jsonObject.get("name").getAsString() : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
