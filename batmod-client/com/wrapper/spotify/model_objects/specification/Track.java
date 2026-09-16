package com.wrapper.spotify.model_objects.specification;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import com.wrapper.spotify.model_objects.miscellaneous.Restrictions;
import com.wrapper.spotify.requests.data.personalization.interfaces.IArtistTrackModelObject;
import com.wrapper.spotify.requests.data.search.interfaces.ISearchModelObject;

public class Track extends AbstractModelObject implements IArtistTrackModelObject, ISearchModelObject {
   private final AlbumSimplified album;
   private final ArtistSimplified[] artists;
   private final CountryCode[] availableMarkets;
   private final Integer discNumber;
   private final Integer durationMs;
   private final Boolean explicit;
   private final ExternalId externalIds;
   private final ExternalUrl externalUrls;
   private final String href;
   private final String id;
   private final Boolean isPlayable;
   private final TrackLink linkedFrom;
   private final Restrictions restrictions;
   private final String name;
   private final Integer popularity;
   private final String previewUrl;
   private final Integer trackNumber;
   private final ModelObjectType type;
   private final String uri;

   private Track(Track.Builder builder) {
      super(builder);
      this.album = builder.album;
      this.artists = builder.artists;
      this.availableMarkets = builder.availableMarkets;
      this.discNumber = builder.discNumber;
      this.durationMs = builder.durationMs;
      this.explicit = builder.explicit;
      this.externalIds = builder.externalIds;
      this.externalUrls = builder.externalUrls;
      this.href = builder.href;
      this.id = builder.id;
      this.isPlayable = builder.isPlayable;
      this.linkedFrom = builder.linkedFrom;
      this.restrictions = builder.restrictions;
      this.name = builder.name;
      this.popularity = builder.popularity;
      this.previewUrl = builder.previewUrl;
      this.trackNumber = builder.trackNumber;
      this.type = builder.type;
      this.uri = builder.uri;
   }

   public AlbumSimplified getAlbum() {
      return this.album;
   }

   public ArtistSimplified[] getArtists() {
      return this.artists;
   }

   public CountryCode[] getAvailableMarkets() {
      return this.availableMarkets;
   }

   public Integer getDiscNumber() {
      return this.discNumber;
   }

   public Integer getDurationMs() {
      return this.durationMs;
   }

   public Boolean getIsExplicit() {
      return this.explicit;
   }

   public ExternalId getExternalIds() {
      return this.externalIds;
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

   public Boolean getIsPlayable() {
      return this.isPlayable;
   }

   public TrackLink getLinkedFrom() {
      return this.linkedFrom;
   }

   public Restrictions getRestrictions() {
      return this.restrictions;
   }

   public String getName() {
      return this.name;
   }

   public Integer getPopularity() {
      return this.popularity;
   }

   public String getPreviewUrl() {
      return this.previewUrl;
   }

   public Integer getTrackNumber() {
      return this.trackNumber;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public Track.Builder builder() {
      return new Track.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private AlbumSimplified album;
      private ArtistSimplified[] artists;
      private CountryCode[] availableMarkets;
      private Integer discNumber;
      private Integer durationMs;
      private Boolean explicit;
      private ExternalId externalIds;
      private ExternalUrl externalUrls;
      private String href;
      private String id;
      private Boolean isPlayable;
      private TrackLink linkedFrom;
      private Restrictions restrictions;
      private String name;
      private Integer popularity;
      private String previewUrl;
      private Integer trackNumber;
      private ModelObjectType type;
      private String uri;

      public Track.Builder setAlbum(AlbumSimplified album) {
         this.album = album;
         return this;
      }

      public Track.Builder setArtists(ArtistSimplified... artists) {
         this.artists = artists;
         return this;
      }

      public Track.Builder setAvailableMarkets(CountryCode... availableMarkets) {
         this.availableMarkets = availableMarkets;
         return this;
      }

      public Track.Builder setDiscNumber(Integer discNumber) {
         this.discNumber = discNumber;
         return this;
      }

      public Track.Builder setDurationMs(Integer durationMs) {
         this.durationMs = durationMs;
         return this;
      }

      public Track.Builder setExplicit(Boolean explicit) {
         this.explicit = explicit;
         return this;
      }

      public Track.Builder setExternalIds(ExternalId externalIds) {
         this.externalIds = externalIds;
         return this;
      }

      public Track.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public Track.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public Track.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public Track.Builder setIsPlayable(Boolean isPlayable) {
         this.isPlayable = isPlayable;
         return this;
      }

      public Track.Builder setLinkedFrom(TrackLink linkedFrom) {
         this.linkedFrom = linkedFrom;
         return this;
      }

      public Track.Builder setRestrictions(Restrictions restrictions) {
         this.restrictions = restrictions;
         return this;
      }

      public Track.Builder setName(String name) {
         this.name = name;
         return this;
      }

      public Track.Builder setPopularity(Integer popularity) {
         this.popularity = popularity;
         return this;
      }

      public Track.Builder setPreviewUrl(String previewUrl) {
         this.previewUrl = previewUrl;
         return this;
      }

      public Track.Builder setTrackNumber(Integer trackNumber) {
         this.trackNumber = trackNumber;
         return this;
      }

      public Track.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public Track.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public Track build() {
         return new Track(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Track> {
      public Track createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Track.Builder()
               .setAlbum(this.hasAndNotNull(jsonObject, "album") ? new AlbumSimplified.JsonUtil().createModelObject(jsonObject.getAsJsonObject("album")) : null)
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
               .setDiscNumber(this.hasAndNotNull(jsonObject, "disc_number") ? jsonObject.get("disc_number").getAsInt() : null)
               .setDurationMs(this.hasAndNotNull(jsonObject, "duration_ms") ? jsonObject.get("duration_ms").getAsInt() : null)
               .setExplicit(this.hasAndNotNull(jsonObject, "explicit") ? jsonObject.get("explicit").getAsBoolean() : null)
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
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setIsPlayable(this.hasAndNotNull(jsonObject, "is_playable") ? jsonObject.get("is_playable").getAsBoolean() : null)
               .setLinkedFrom(
                  this.hasAndNotNull(jsonObject, "linked_from")
                     ? new TrackLink.JsonUtil().createModelObject(jsonObject.get("linked_from").getAsJsonObject())
                     : null
               )
               .setRestrictions(
                  this.hasAndNotNull(jsonObject, "restrictions")
                     ? new Restrictions.JsonUtil().createModelObject(jsonObject.get("restrictions").getAsJsonObject())
                     : null
               )
               .setName(this.hasAndNotNull(jsonObject, "name") ? jsonObject.get("name").getAsString() : null)
               .setPopularity(this.hasAndNotNull(jsonObject, "popularity") ? jsonObject.get("popularity").getAsInt() : null)
               .setPreviewUrl(this.hasAndNotNull(jsonObject, "preview_url") ? jsonObject.get("preview_url").getAsString() : null)
               .setTrackNumber(this.hasAndNotNull(jsonObject, "track_number") ? jsonObject.get("track_number").getAsInt() : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
