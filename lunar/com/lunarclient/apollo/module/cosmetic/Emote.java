package com.lunarclient.apollo.module.cosmetic;

import lombok.Generated;
import org.jetbrains.annotations.Range;

public final class Emote {
   @Range(from = 1L, to = 2147483647L) int id;
   int metadata;

   @Generated
   Emote(int var1, int var2) {
      this.id = var1;
      this.metadata = var2;
   }

   @Generated
   public static Emote.EmoteBuilder builder() {
      return new Emote.EmoteBuilder();
   }

   @Generated
   public int getId() {
      return this.id;
   }

   @Generated
   public int getMetadata() {
      return this.metadata;
   }

   @Generated
   public static class EmoteBuilder {
      @Generated
      private int id;
      @Generated
      private int metadata;

      @Generated
      EmoteBuilder() {
      }

      @Generated
      public Emote.EmoteBuilder id(int var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public Emote.EmoteBuilder metadata(int var1) {
         this.metadata = var1;
         return this;
      }

      @Generated
      public Emote build() {
         return new Emote(this.id, this.metadata);
      }

      @Generated
      @Override
      public String toString() {
         return "Emote.EmoteBuilder(id=" + this.id + ", metadata=" + this.metadata + ")";
      }
   }
}
