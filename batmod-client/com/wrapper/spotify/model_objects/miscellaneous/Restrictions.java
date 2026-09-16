package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Restrictions extends AbstractModelObject {
   private final String reason;

   private Restrictions(Restrictions.Builder builder) {
      super(builder);
      this.reason = builder.reason;
   }

   public String getReason() {
      return this.reason;
   }

   public Restrictions.Builder builder() {
      return new Restrictions.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String reason;

      public Restrictions.Builder setReason(String reason) {
         this.reason = reason;
         return this;
      }

      public Restrictions build() {
         return new Restrictions(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Restrictions> {
      public Restrictions createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Restrictions.Builder().setReason(this.hasAndNotNull(jsonObject, "reason") ? jsonObject.get("reason").getAsString() : null).build()
            : null;
      }
   }
}
