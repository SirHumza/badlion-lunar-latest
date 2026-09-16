package com.moonsworth.lunar.lib.adventure.text.object;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class PlayerHeadObjectContentsImpl implements PlayerHeadObjectContents {
   @Nullable
   private final String name;
   @Nullable
   private final UUID id;
   private final List<PlayerHeadObjectContents.ProfileProperty> properties;
   private final boolean hat;
   @Nullable
   private final Key texture;

   PlayerHeadObjectContentsImpl(
      @Nullable String var1, @Nullable UUID var2, @NotNull List<PlayerHeadObjectContents.ProfileProperty> var3, boolean var4, @Nullable Key var5
   ) {
      this.name = var1;
      this.id = var2;
      if (var3.isEmpty()) {
         this.properties = Collections.emptyList();
      } else {
         this.properties = Collections.unmodifiableList(new ArrayList<>(Objects.requireNonNull(var3, "properties")));
      }

      this.hat = var4;
      this.texture = var5;
   }

   @Nullable
   @Override
   public String name() {
      return this.name;
   }

   @Nullable
   @Override
   public UUID id() {
      return this.id;
   }

   @NotNull
   @Override
   public List<PlayerHeadObjectContents.ProfileProperty> profileProperties() {
      return this.properties;
   }

   @Override
   public boolean hat() {
      return this.hat;
   }

   @Nullable
   @Override
   public Key texture() {
      return this.texture;
   }

   @NotNull
   @Override
   public PlayerHeadObjectContents.Builder toBuilder() {
      return new PlayerHeadObjectContentsImpl.BuilderImpl(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof PlayerHeadObjectContents)) {
         return false;
      }

      PlayerHeadObjectContentsImpl var2 = (PlayerHeadObjectContentsImpl)var1;
      return Objects.equals(this.name, var2.name)
         && Objects.equals(this.id, var2.id)
         && Objects.equals(this.properties, var2.properties)
         && this.hat == var2.hat
         && Objects.equals(this.texture, var2.texture);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name, this.id, this.properties, this.hat, this.texture);
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   static final class BuilderImpl implements PlayerHeadObjectContents.Builder {
      @Nullable
      private String name;
      @Nullable
      private UUID id;
      private final List<PlayerHeadObjectContents.ProfileProperty> properties = new ArrayList<>();
      private boolean hat = true;
      @Nullable
      private Key texture;

      BuilderImpl() {
      }

      BuilderImpl(@NotNull PlayerHeadObjectContentsImpl var1) {
         this.name = var1.name;
         this.id = var1.id;
         this.properties.addAll(var1.properties);
         this.hat = var1.hat;
         this.texture = var1.texture;
      }

      @Override
      public PlayerHeadObjectContents.@NotNull Builder name(@Nullable String var1) {
         this.name = var1;
         return this;
      }

      @Override
      public PlayerHeadObjectContents.@NotNull Builder id(@Nullable UUID var1) {
         this.id = var1;
         return this;
      }

      @Override
      public PlayerHeadObjectContents.@NotNull Builder profileProperty(PlayerHeadObjectContents.@NotNull ProfileProperty var1) {
         this.properties.add(Objects.requireNonNull(var1, "property"));
         return this;
      }

      @Override
      public PlayerHeadObjectContents.@NotNull Builder profileProperties(@NotNull Collection<PlayerHeadObjectContents.ProfileProperty> var1) {
         for (PlayerHeadObjectContents.ProfileProperty var3 : Objects.requireNonNull(var1, "properties")) {
            this.profileProperty(var3);
         }

         return this;
      }

      private void clearProfile() {
         this.name = null;
         this.id = null;
         this.properties.clear();
         this.texture = null;
      }

      @Override
      public PlayerHeadObjectContents.@NotNull Builder skin(PlayerHeadObjectContents.@NotNull SkinSource var1) {
         this.clearProfile();
         Objects.requireNonNull(var1, "skinSource").applySkinToPlayerHeadContents(this);
         return this;
      }

      @Override
      public PlayerHeadObjectContents.@NotNull Builder hat(boolean var1) {
         this.hat = var1;
         return this;
      }

      @Override
      public PlayerHeadObjectContents.@NotNull Builder texture(@Nullable Key var1) {
         this.texture = var1;
         return this;
      }

      @NotNull
      @Override
      public PlayerHeadObjectContents build() {
         return new PlayerHeadObjectContentsImpl(this.name, this.id, this.properties, this.hat, this.texture);
      }
   }

   static final class ProfilePropertyImpl implements PlayerHeadObjectContents.ProfileProperty {
      private final String name;
      private final String value;
      @Nullable
      private final String signature;

      ProfilePropertyImpl(@NotNull String var1, @NotNull String var2, @Nullable String var3) {
         this.name = var1;
         this.value = var2;
         this.signature = var3;
      }

      @NotNull
      @Override
      public String name() {
         return this.name;
      }

      @NotNull
      @Override
      public String value() {
         return this.value;
      }

      @Nullable
      @Override
      public String signature() {
         return this.signature;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof PlayerHeadObjectContentsImpl.ProfilePropertyImpl)) {
            return false;
         }

         PlayerHeadObjectContentsImpl.ProfilePropertyImpl var2 = (PlayerHeadObjectContentsImpl.ProfilePropertyImpl)var1;
         return Objects.equals(this.name, var2.name) && Objects.equals(this.value, var2.value) && Objects.equals(this.signature, var2.signature);
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.name, this.value, this.signature);
      }

      @Override
      public String toString() {
         return Internals.toString(this);
      }
   }
}
