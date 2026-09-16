package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Error extends AbstractModelObject {
   private final Integer status;
   private final String message;

   private Error(Error.Builder builder) {
      super(builder);
      this.status = builder.status;
      this.message = builder.message;
   }

   public Integer getStatus() {
      return this.status;
   }

   public String getMessage() {
      return this.message;
   }

   public Error.Builder builder() {
      return new Error.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private Integer status;
      private String message;

      public Error.Builder setStatus(Integer status) {
         this.status = status;
         return this;
      }

      public Error.Builder setMessage(String message) {
         this.message = message;
         return this;
      }

      public Error build() {
         return new Error(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Error> {
      public Error createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Error.Builder()
               .setStatus(this.hasAndNotNull(jsonObject, "status") ? jsonObject.get("status").getAsInt() : null)
               .setMessage(this.hasAndNotNull(jsonObject, "message") ? jsonObject.get("message").getAsString() : null)
               .build()
            : null;
      }
   }
}
