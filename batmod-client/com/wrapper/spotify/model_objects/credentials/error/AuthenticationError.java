package com.wrapper.spotify.model_objects.credentials.error;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class AuthenticationError extends AbstractModelObject {
   private final String error;
   private final String error_description;

   private AuthenticationError(AuthenticationError.Builder builder) {
      super(builder);
      this.error = builder.error;
      this.error_description = builder.error_description;
   }

   public String getError() {
      return this.error;
   }

   public String getError_description() {
      return this.error_description;
   }

   public AuthenticationError.Builder builder() {
      return new AuthenticationError.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String error;
      private String error_description;

      public AuthenticationError.Builder setError(String error) {
         this.error = error;
         return this;
      }

      public AuthenticationError.Builder setError_description(String error_description) {
         this.error_description = error_description;
         return this;
      }

      public AuthenticationError build() {
         return new AuthenticationError(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<AuthenticationError> {
      public AuthenticationError createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new AuthenticationError.Builder()
               .setError(this.hasAndNotNull(jsonObject, "error") ? jsonObject.get("error").getAsString() : null)
               .setError_description(this.hasAndNotNull(jsonObject, "error_description") ? jsonObject.get("error_description").getAsString() : null)
               .build()
            : null;
      }
   }
}
