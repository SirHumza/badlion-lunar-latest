package com.wrapper.spotify.model_objects.credentials;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class ClientCredentials extends AbstractModelObject {
   private final String accessToken;
   private final String tokenType;
   private final Integer expiresIn;

   private ClientCredentials(ClientCredentials.Builder builder) {
      super(builder);
      this.accessToken = builder.accessToken;
      this.tokenType = builder.tokenType;
      this.expiresIn = builder.expiresIn;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public String getTokenType() {
      return this.tokenType;
   }

   public Integer getExpiresIn() {
      return this.expiresIn;
   }

   public ClientCredentials.Builder builder() {
      return new ClientCredentials.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String accessToken;
      private String tokenType;
      private Integer expiresIn;

      public ClientCredentials.Builder setAccessToken(String accessToken) {
         this.accessToken = accessToken;
         return this;
      }

      public ClientCredentials.Builder setTokenType(String tokenType) {
         this.tokenType = tokenType;
         return this;
      }

      public ClientCredentials.Builder setExpiresIn(Integer expiresIn) {
         this.expiresIn = expiresIn;
         return this;
      }

      public ClientCredentials build() {
         return new ClientCredentials(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<ClientCredentials> {
      public ClientCredentials createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new ClientCredentials.Builder()
               .setAccessToken(this.hasAndNotNull(jsonObject, "access_token") ? jsonObject.get("access_token").getAsString() : null)
               .setTokenType(this.hasAndNotNull(jsonObject, "token_type") ? jsonObject.get("token_type").getAsString() : null)
               .setExpiresIn(this.hasAndNotNull(jsonObject, "expires_in") ? jsonObject.get("expires_in").getAsInt() : null)
               .build()
            : null;
      }
   }
}
