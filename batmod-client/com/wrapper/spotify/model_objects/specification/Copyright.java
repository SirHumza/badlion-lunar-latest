package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.enums.CopyrightType;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Copyright extends AbstractModelObject {
   private final String text;
   private final CopyrightType type;

   private Copyright(Copyright.Builder builder) {
      super(builder);
      this.text = builder.text;
      this.type = builder.type;
   }

   public String getText() {
      return this.text;
   }

   public CopyrightType getType() {
      return this.type;
   }

   public Copyright.Builder builder() {
      return new Copyright.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String text;
      private CopyrightType type;

      public Copyright.Builder setText(String text) {
         this.text = text;
         return this;
      }

      public Copyright.Builder setType(CopyrightType type) {
         this.type = type;
         return this;
      }

      public Copyright build() {
         return new Copyright(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Copyright> {
      public Copyright createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Copyright.Builder()
               .setText(this.hasAndNotNull(jsonObject, "text") ? jsonObject.get("text").getAsString() : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? CopyrightType.keyOf(jsonObject.get("type").getAsString().toLowerCase()) : null)
               .build()
            : null;
      }
   }
}
