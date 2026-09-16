package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.enums.ProductType;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class User extends AbstractModelObject {
   private final String birthdate;
   private final CountryCode country;
   private final String displayName;
   private final String email;
   private final ExternalUrl externalUrls;
   private final Followers followers;
   private final String href;
   private final String id;
   private final Image[] images;
   private final ProductType product;
   private final ModelObjectType type;
   private final String uri;

   private User(User.Builder builder) {
      super(builder);
      this.birthdate = builder.birthdate;
      this.country = builder.country;
      this.displayName = builder.displayName;
      this.email = builder.email;
      this.externalUrls = builder.externalUrls;
      this.followers = builder.followers;
      this.href = builder.href;
      this.id = builder.id;
      this.images = builder.images;
      this.product = builder.product;
      this.type = builder.type;
      this.uri = builder.uri;
   }

   public String getBirthdate() {
      return this.birthdate;
   }

   public CountryCode getCountry() {
      return this.country;
   }

   public String getDisplayName() {
      return this.displayName;
   }

   public String getEmail() {
      return this.email;
   }

   public ExternalUrl getExternalUrls() {
      return this.externalUrls;
   }

   public Followers getFollowers() {
      return this.followers;
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

   public ProductType getProduct() {
      return this.product;
   }

   public ModelObjectType getType() {
      return this.type;
   }

   public String getUri() {
      return this.uri;
   }

   public User.Builder builder() {
      return new User.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String birthdate;
      private CountryCode country;
      private String displayName;
      private String email;
      private ExternalUrl externalUrls;
      private Followers followers;
      private String href;
      private String id;
      private Image[] images;
      private ProductType product;
      private ModelObjectType type;
      private String uri;

      public User.Builder setBirthdate(String birthdate) {
         this.birthdate = birthdate;
         return this;
      }

      public User.Builder setCountry(CountryCode country) {
         this.country = country;
         return this;
      }

      public User.Builder setDisplayName(String displayName) {
         this.displayName = displayName;
         return this;
      }

      public User.Builder setEmail(String email) {
         this.email = email;
         return this;
      }

      public User.Builder setExternalUrls(ExternalUrl externalUrls) {
         this.externalUrls = externalUrls;
         return this;
      }

      public User.Builder setFollowers(Followers followers) {
         this.followers = followers;
         return this;
      }

      public User.Builder setHref(String href) {
         this.href = href;
         return this;
      }

      public User.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public User.Builder setImages(Image... images) {
         this.images = images;
         return this;
      }

      public User.Builder setProduct(ProductType product) {
         this.product = product;
         return this;
      }

      public User.Builder setType(ModelObjectType type) {
         this.type = type;
         return this;
      }

      public User.Builder setUri(String uri) {
         this.uri = uri;
         return this;
      }

      public User build() {
         return new User(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<User> {
      public User createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new User.Builder()
               .setBirthdate(this.hasAndNotNull(jsonObject, "birthdate") ? jsonObject.get("birthdate").getAsString() : null)
               .setCountry(this.hasAndNotNull(jsonObject, "country") ? CountryCode.getByCode(jsonObject.get("country").getAsString()) : null)
               .setDisplayName(this.hasAndNotNull(jsonObject, "display_name") ? jsonObject.get("display_name").getAsString() : null)
               .setEmail(this.hasAndNotNull(jsonObject, "email") ? jsonObject.get("email").getAsString() : null)
               .setExternalUrls(
                  this.hasAndNotNull(jsonObject, "external_urls")
                     ? new ExternalUrl.JsonUtil().createModelObject(jsonObject.getAsJsonObject("external_urls"))
                     : null
               )
               .setFollowers(
                  this.hasAndNotNull(jsonObject, "followers") ? new Followers.JsonUtil().createModelObject(jsonObject.getAsJsonObject("followers")) : null
               )
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setImages(this.hasAndNotNull(jsonObject, "images") ? new Image.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("images")) : null)
               .setProduct(this.hasAndNotNull(jsonObject, "product") ? ProductType.keyOf(jsonObject.get("product").getAsString().toLowerCase()) : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? ModelObjectType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .setUri(this.hasAndNotNull(jsonObject, "uri") ? jsonObject.get("uri").getAsString() : null)
               .build()
            : null;
      }
   }
}
