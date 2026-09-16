package com.wrapper.spotify.model_objects.specification;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import com.wrapper.spotify.requests.data.personalization.interfaces.IArtistTrackModelObject;
import com.wrapper.spotify.requests.data.search.interfaces.ISearchModelObject;

public class Artist extends AbstractModelObject implements IArtistTrackModelObject, ISearchModelObject {
   private final ExternalUrl externalUrls;
   private final Followers followers;
   private final String[] genres;
   private final String href;
   private final String id;
   private final Image[] images;
   private final String name;
   private final Integer popularity;
   private final ModelObjectType type;
   private final String uri;

   private Artist(Artist.Builder builder) {
      super(builder);
      this.externalUrls = builder.externalUrls;
      this.followers = builder.followers;
      this.genres = builder.genres;
      this.href = builder.href;
      this.id = builder.id;
      this.images = builder.images;
      this.name = builder.name;
      this.popularity = builder.popularity;
      this.type = builder.type;
      this.uri = builder.uri;
   }

   public ExternalUrl getExternalUrls() {
      return this.externalUrls;
   }

   public Followers getFollowers() {
      return this.followers;
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

   public String getName() {
      return this.name;
   }

   public Integer getPopularity() {
      return this.popularity;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public Artist.Builder builder() {
      return new Artist.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private ExternalUrl externalUrls;
      private Followers followers;
      private String[] genres;
      private String href;
      private String id;
      private Image[] images;
      private String name;
      private Integer popularity;
      private ModelObjectType type;
      private String uri;

      public Artist.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public Artist.Builder setFollowers(Followers followers) {
         this.followers = followers;
         return this;
      }

      public Artist.Builder setGenres(String... genres) {
         this.genres = genres;
         return this;
      }

      public Artist.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public Artist.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public Artist.Builder setImages(Image... images) {
         this.images = images;
         return this;
      }

      public Artist.Builder setName(String name) {
         this.name = name;
         return this;
      }

      public Artist.Builder setPopularity(Integer popularity) {
         this.popularity = popularity;
         return this;
      }

      public Artist.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public Artist.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public Artist build() {
         return new Artist(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Artist> {
      public Artist createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Artist.Builder()
               .setExternalUrls(
                  this.hasAndNotNull(jsonObject, "external_urls")
                     ? new ExternalUrl.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_urls"))
                     : null
               )
               .setFollowers(
                  this.hasAndNotNull(jsonObject, "followers") ? new Followers.JsonUtil().createModelObject(jsonObject.getAsJsonObject("followers")) : null
               )
               .setGenres(this.hasAndNotNull(jsonObject, "genres") ? (String[])new Gson().fromJson(jsonObject.getAsJsonArray("genres"), String[].class) : null)
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setImages(this.hasAndNotNull(jsonObject, "images") ? new Image.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("images")) : null)
               .setName(this.hasAndNotNull(jsonObject, "name") ? jsonObject.get("name").getAsString() : null)
               .setPopularity(this.hasAndNotNull(jsonObject, "popularity") ? jsonObject.get("popularity").getAsInt() : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
