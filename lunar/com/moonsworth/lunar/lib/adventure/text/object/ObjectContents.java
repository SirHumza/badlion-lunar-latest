package com.moonsworth.lunar.lib.adventure.text.object;

import com.moonsworth.lunar.lib.adventure.key.Key;
import java.util.Collections;
import java.util.Objects;
import java.util.UUID;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface ObjectContents extends Examinable {
   @Contract(value = "_, _ -> new", pure = true)
   @NotNull
   static SpriteObjectContents sprite(@NotNull Key var0, @NotNull Key var1) {
      return new SpriteObjectContentsImpl(Objects.requireNonNull(var0, "atlas"), Objects.requireNonNull(var1, "sprite"));
   }

   @Contract(value = "_ -> new", pure = true)
   @NotNull
   static SpriteObjectContents sprite(@NotNull Key var0) {
      return new SpriteObjectContentsImpl(SpriteObjectContents.DEFAULT_ATLAS, Objects.requireNonNull(var0, "sprite"));
   }

   @Contract(value = "-> new", pure = true)
   static PlayerHeadObjectContents.@NotNull Builder playerHead() {
      return new PlayerHeadObjectContentsImpl.BuilderImpl();
   }

   @Contract(value = "_ -> new", pure = true)
   @NotNull
   static PlayerHeadObjectContents playerHead(@NotNull String var0) {
      return new PlayerHeadObjectContentsImpl(var0, null, Collections.emptyList(), true, null);
   }

   @Contract(value = "_ -> new", pure = true)
   @NotNull
   static PlayerHeadObjectContents playerHead(@NotNull UUID var0) {
      return new PlayerHeadObjectContentsImpl(null, var0, Collections.emptyList(), true, null);
   }

   @Contract(value = "_ -> new", pure = true)
   @NotNull
   static PlayerHeadObjectContents playerHead(PlayerHeadObjectContents.@NotNull SkinSource var0) {
      return playerHead().skin(var0).build();
   }
}
