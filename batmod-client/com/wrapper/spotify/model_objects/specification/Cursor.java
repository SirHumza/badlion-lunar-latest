package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Cursor extends AbstractModelObject {
   private final String after;

   private Cursor(Cursor.Builder builder) {
      super(builder);
      this.after = builder.after;
   }

   public String getAfter() {
      return this.after;
   }

   public Cursor.Builder builder() {
      return new Cursor.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String after;

      public Cursor.Builder setAfter(String after) {
         this.after = after;
         return this;
      }

      public Cursor build() {
         return new Cursor(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Cursor> {
      public Cursor createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Cursor.Builder().setAfter(this.hasAndNotNull(jsonObject, "after") ? jsonObject.get("after").getAsString() : null).build()
            : null;
      }
   }
}
