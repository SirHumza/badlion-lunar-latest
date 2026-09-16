package com.lunarclient.apollo.client.mod;

import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class LunarClientMod {
   String id;
   @Nullable
   String displayName;
   @Nullable
   String version;
   LunarClientModType type;

   @Generated
   LunarClientMod(String var1, @Nullable String var2, @Nullable String var3, LunarClientModType var4) {
      this.id = var1;
      this.displayName = var2;
      this.version = var3;
      this.type = var4;
   }

   @Generated
   public static LunarClientMod.LunarClientModBuilder builder() {
      return new LunarClientMod.LunarClientModBuilder();
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Nullable
   @Generated
   public String getDisplayName() {
      return this.displayName;
   }

   @Nullable
   @Generated
   public String getVersion() {
      return this.version;
   }

   @Generated
   public LunarClientModType getType() {
      return this.type;
   }

   @Generated
   public static class LunarClientModBuilder {
      @Generated
      private String id;
      @Generated
      private String displayName;
      @Generated
      private String version;
      @Generated
      private LunarClientModType type;

      @Generated
      LunarClientModBuilder() {
      }

      @Generated
      public LunarClientMod.LunarClientModBuilder id(String var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public LunarClientMod.LunarClientModBuilder displayName(@Nullable String var1) {
         this.displayName = var1;
         return this;
      }

      @Generated
      public LunarClientMod.LunarClientModBuilder version(@Nullable String var1) {
         this.version = var1;
         return this;
      }

      @Generated
      public LunarClientMod.LunarClientModBuilder type(LunarClientModType var1) {
         this.type = var1;
         return this;
      }

      @Generated
      public LunarClientMod build() {
         return new LunarClientMod(this.id, this.displayName, this.version, this.type);
      }

      @Generated
      @Override
      public String toString() {
         return "LunarClientMod.LunarClientModBuilder(id="
            + this.id
            + ", displayName="
            + this.displayName
            + ", version="
            + this.version
            + ", type="
            + this.type
            + ")";
      }
   }
}
