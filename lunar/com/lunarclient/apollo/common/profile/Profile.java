package com.lunarclient.apollo.common.profile;

import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class Profile {
   @Nullable
   UUID id;
   String texture;
   String signature;

   @Generated
   Profile(@Nullable UUID var1, String var2, String var3) {
      this.id = var1;
      this.texture = var2;
      this.signature = var3;
   }

   @Generated
   public static Profile.ProfileBuilder builder() {
      return new Profile.ProfileBuilder();
   }

   @Nullable
   @Generated
   public UUID getId() {
      return this.id;
   }

   @Generated
   public String getTexture() {
      return this.texture;
   }

   @Generated
   public String getSignature() {
      return this.signature;
   }

   @Generated
   public static class ProfileBuilder {
      @Generated
      private UUID id;
      @Generated
      private String texture;
      @Generated
      private String signature;

      @Generated
      ProfileBuilder() {
      }

      @Generated
      public Profile.ProfileBuilder id(@Nullable UUID var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public Profile.ProfileBuilder texture(String var1) {
         this.texture = var1;
         return this;
      }

      @Generated
      public Profile.ProfileBuilder signature(String var1) {
         this.signature = var1;
         return this;
      }

      @Generated
      public Profile build() {
         return new Profile(this.id, this.texture, this.signature);
      }

      @Generated
      @Override
      public String toString() {
         return "Profile.ProfileBuilder(id=" + this.id + ", texture=" + this.texture + ", signature=" + this.signature + ")";
      }
   }
}
