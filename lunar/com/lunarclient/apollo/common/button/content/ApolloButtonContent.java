package com.lunarclient.apollo.common.button.content;

import com.lunarclient.apollo.common.icon.Icon;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import lombok.Generated;
import lombok.NonNull;

public final class ApolloButtonContent {
   public static final int MAX_PARTS = 30;
   public static final float MIN_SCALE = 0.25F;
   public static final float MAX_SCALE = 4.0F;
   private final List<ApolloButtonContentPart> parts;
   private final float scale;
   private final boolean live;

   public static ApolloButtonContent.Builder builder() {
      return new ApolloButtonContent.Builder();
   }

   private ApolloButtonContent(List<ApolloButtonContentPart> var1, float var2, boolean var3) {
      this.parts = Collections.unmodifiableList(var1);
      this.scale = var2;
      this.live = var3;
   }

   @Generated
   public List<ApolloButtonContentPart> getParts() {
      return this.parts;
   }

   @Generated
   public float getScale() {
      return this.scale;
   }

   @Generated
   public boolean isLive() {
      return this.live;
   }

   public static final class Builder {
      private final List<ApolloButtonContentPart> parts = new ArrayList<>();
      private float scale = 1.0F;
      private boolean live;

      private Builder() {
      }

      public ApolloButtonContent.Builder append(@NonNull Component var1) {
         if (var1 == null) {
            throw new NullPointerException("component is marked non-null but is null");
         } else {
            return this.append(ApolloButtonContentPart.component(var1));
         }
      }

      public ApolloButtonContent.Builder append(@NonNull Icon var1) {
         if (var1 == null) {
            throw new NullPointerException("icon is marked non-null but is null");
         } else {
            return this.append(ApolloButtonContentPart.icon(var1));
         }
      }

      public ApolloButtonContent.Builder append(@NonNull Function<ApolloPlayer, Component> var1, @NonNull Duration var2) {
         if (var1 == null) {
            throw new NullPointerException("liveComponent is marked non-null but is null");
         } else if (var2 == null) {
            throw new NullPointerException("updateInterval is marked non-null but is null");
         } else {
            return this.append(ApolloButtonContentPart.live(var1, var2));
         }
      }

      public ApolloButtonContent.Builder append(@NonNull ApolloButtonContentPart var1) {
         if (var1 == null) {
            throw new NullPointerException("part is marked non-null but is null");
         }

         this.parts.add(var1);
         this.live = this.live | var1.isLive();
         return this;
      }

      public ApolloButtonContent.Builder scale(float var1) {
         if (var1 >= 0.25F && var1 <= 4.0F) {
            this.scale = var1;
            return this;
         } else {
            throw new IllegalArgumentException("ApolloButtonContent#scale must be between 0.25 and 4.0");
         }
      }

      public ApolloButtonContent build() {
         if (this.parts.isEmpty()) {
            throw new IllegalArgumentException("ApolloButtonContent requires at least one part");
         } else if (this.parts.size() > 30) {
            throw new IllegalArgumentException("ApolloButtonContent supports at most 30 parts");
         } else {
            return new ApolloButtonContent(new ArrayList<>(this.parts), this.scale, this.live);
         }
      }
   }
}
