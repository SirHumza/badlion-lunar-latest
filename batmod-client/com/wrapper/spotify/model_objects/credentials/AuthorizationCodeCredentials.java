package com.wrapper.spotify.model_objects.credentials;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class AuthorizationCodeCredentials extends AbstractModelObject {
   private final String accessToken;
   private final String tokenType;
   private final String scope;
   private final Integer expiresIn;
   private final String refreshToken;

   private AuthorizationCodeCredentials(AuthorizationCodeCredentials.Builder builder) {
      super(builder);
      this.accessToken = builder.accessToken;
      this.tokenType = builder.tokenType;
      this.scope = builder.scope;
      this.expiresIn = builder.expiresIn;
      this.refreshToken = builder.refreshToken;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public String getTokenType() {
      return this.tokenType;
   }

   public String getScope() {
      return this.scope;
   }

   public Integer getExpiresIn() {
      return this.expiresIn;
   }

   public String getRefreshToken() {
      return this.refreshToken;
   }

   public AuthorizationCodeCredentials.Builder builder() {
      return new AuthorizationCodeCredentials.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String accessToken;
      private String tokenType;
      private String scope;
      private Integer expiresIn;
      private String refreshToken;

      public AuthorizationCodeCredentials.Builder setAccessToken(String accessToken) {
         this.accessToken = accessToken;
         return this;
      }

      public AuthorizationCodeCredentials.Builder setTokenType(String tokenType) {
         this.tokenType = tokenType;
         return this;
      }

      public AuthorizationCodeCredentials.Builder setScope(String scope) {
         this.scope = scope;
         return this;
      }

      public AuthorizationCodeCredentials.Builder setExpiresIn(Integer expiresIn) {
         this.expiresIn = expiresIn;
         return this;
      }

      public AuthorizationCodeCredentials.Builder setRefreshToken(String refreshToken) {
         this.refreshToken = refreshToken;
         return this;
      }

      public AuthorizationCodeCredentials build() {
         return new AuthorizationCodeCredentials(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AuthorizationCodeCredentials> {
      public AuthorizationCodeCredentials createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AuthorizationCodeCredentials.Builder()
               .setAccessToken(this.hasAndNotNull(jsonObject, "access_token") ? jsonObject.get("access_token").getAsString() : null)
               .setTokenType(this.hasAndNotNull(jsonObject, "token_type") ? jsonObject.get("token_type").getAsString() : null)
               .setScope(this.hasAndNotNull(jsonObject, "scope") ? jsonObject.get("scope").getAsString() : null)
               .setExpiresIn(this.hasAndNotNull(jsonObject, "expires_in") ? jsonObject.get("expires_in").getAsInt() : null)
               .setRefreshToken(this.hasAndNotNull(jsonObject, "refresh_token") ? jsonObject.get("refresh_token").getAsString() : null)
               .build()
            : null;
      }
   }
}
