package com.lunarclient.apollo.module.team;

import com.lunarclient.apollo.common.location.ApolloLocation;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.awt.Color;
import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class TeamMember {
   UUID playerUuid;
   @Nullable
   Component displayName;
   @Nullable
   Color markerColor;
   @Nullable
   ApolloLocation location;

   @Generated
   TeamMember(UUID var1, @Nullable Component var2, @Nullable Color var3, @Nullable ApolloLocation var4) {
      this.playerUuid = var1;
      this.displayName = var2;
      this.markerColor = var3;
      this.location = var4;
   }

   @Generated
   public static TeamMember.TeamMemberBuilder builder() {
      return new TeamMember.TeamMemberBuilder();
   }

   @Generated
   public UUID getPlayerUuid() {
      return this.playerUuid;
   }

   @Nullable
   @Generated
   public Component getDisplayName() {
      return this.displayName;
   }

   @Nullable
   @Generated
   public Color getMarkerColor() {
      return this.markerColor;
   }

   @Nullable
   @Generated
   public ApolloLocation getLocation() {
      return this.location;
   }

   @Generated
   public static class TeamMemberBuilder {
      @Generated
      private UUID playerUuid;
      @Generated
      private Component displayName;
      @Generated
      private Color markerColor;
      @Generated
      private ApolloLocation location;

      @Generated
      TeamMemberBuilder() {
      }

      @Generated
      public TeamMember.TeamMemberBuilder playerUuid(UUID var1) {
         this.playerUuid = var1;
         return this;
      }

      @Generated
      public TeamMember.TeamMemberBuilder displayName(@Nullable Component var1) {
         this.displayName = var1;
         return this;
      }

      @Generated
      public TeamMember.TeamMemberBuilder markerColor(@Nullable Color var1) {
         this.markerColor = var1;
         return this;
      }

      @Generated
      public TeamMember.TeamMemberBuilder location(@Nullable ApolloLocation var1) {
         this.location = var1;
         return this;
      }

      @Generated
      public TeamMember build() {
         return new TeamMember(this.playerUuid, this.displayName, this.markerColor, this.location);
      }

      @Generated
      @Override
      public String toString() {
         return "TeamMember.TeamMemberBuilder(playerUuid="
            + this.playerUuid
            + ", displayName="
            + this.displayName
            + ", markerColor="
            + this.markerColor
            + ", location="
            + this.location
            + ")";
      }
   }
}
