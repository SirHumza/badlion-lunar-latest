package com.wrapper.spotify.model_objects.miscellaneous;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class Device extends AbstractModelObject {
   private final String id;
   private final Boolean is_active;
   private final Boolean is_restricted;
   private final String name;
   private final String type;
   private final Integer volume_percent;

   private Device(Device.Builder builder) {
      super(builder);
      this.id = builder.id;
      this.is_active = builder.is_active;
      this.is_restricted = builder.is_restricted;
      this.name = builder.name;
      this.type = builder.type;
      this.volume_percent = builder.volume_percent;
   }

   public String getId() {
      return this.id;
   }

   public Boolean getIs_active() {
      return this.is_active;
   }

   public Boolean getIs_restricted() {
      return this.is_restricted;
   }

   public String getName() {
      return this.name;
   }

   public String getType() {
      return this.type;
   }

   public Integer getVolume_percent() {
      return this.volume_percent;
   }

   public Device.Builder builder() {
      return new Device.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      private String id;
      private Boolean is_active;
      private Boolean is_restricted;
      private String name;
      private String type;
      private Integer volume_percent;

      public Device.Builder setId(String id) {
         this.id = id;
         return this;
      }

      public Device.Builder setIs_active(Boolean is_active) {
         this.is_active = is_active;
         return this;
      }

      public Device.Builder setIs_restricted(Boolean is_restricted) {
         this.is_restricted = is_restricted;
         return this;
      }

      public Device.Builder setName(String name) {
         this.name = name;
         return this;
      }

      public Device.Builder setType(String type) {
         this.type = type;
         return this;
      }

      public Device.Builder setVolume_percent(Integer volume_percent) {
         this.volume_percent = volume_percent;
         return this;
      }

      public Device build() {
         return new Device(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<Device> {
      public Device createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new Device.Builder()
               .setId(this.hasAndNotNull(jsonObject, "id") ? jsonObject.get("id").getAsString() : null)
               .setIs_active(this.hasAndNotNull(jsonObject, "is_active") ? jsonObject.get("is_active").getAsBoolean() : null)
               .setIs_restricted(this.hasAndNotNull(jsonObject, "is_restricted") ? jsonObject.get("is_restricted").getAsBoolean() : null)
               .setName(this.hasAndNotNull(jsonObject, "name") ? jsonObject.get("name").getAsString() : null)
               .setType(this.hasAndNotNull(jsonObject, "type") ? jsonObject.get("type").getAsString() : null)
               .setVolume_percent(this.hasAndNotNull(jsonObject, "volume_percent") ? jsonObject.get("volume_percent").getAsInt() : null)
               .build()
            : null;
      }
   }
}
