package com.moonsworth.lunar.lib.adventure.sound;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.key.Keyed;
import com.moonsworth.lunar.lib.adventure.util.Index;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

@ApiStatus.NonExtendable
public interface Sound extends Examinable {
   @NotNull
   static Sound.Builder sound() {
      return new SoundImpl.BuilderImpl();
   }

   @NotNull
   static Sound.Builder sound(@NotNull Sound var0) {
      return new SoundImpl.BuilderImpl(var0);
   }

   @NotNull
   static Sound sound(@NotNull Consumer<Sound.Builder> var0) {
      return AbstractBuilder.configureAndBuild(sound(), var0);
   }

   @NotNull
   static Sound sound(@NotNull Key var0, @NotNull Sound.Source var1, float var2, float var3) {
      return sound().type(var0).source(var1).volume(var2).pitch(var3).build();
   }

   @NotNull
   static Sound sound(@NotNull Sound.Type var0, @NotNull Sound.Source var1, float var2, float var3) {
      Objects.requireNonNull(var0, "type");
      return sound(var0.key(), var1, var2, var3);
   }

   @NotNull
   static Sound sound(@NotNull Supplier<? extends Sound.Type> var0, @NotNull Sound.Source var1, float var2, float var3) {
      return sound().type(var0).source(var1).volume(var2).pitch(var3).build();
   }

   @NotNull
   static Sound sound(@NotNull Key var0, Sound.Source.@NotNull Provider var1, float var2, float var3) {
      return sound(var0, var1.soundSource(), var2, var3);
   }

   @NotNull
   static Sound sound(@NotNull Sound.Type var0, Sound.Source.@NotNull Provider var1, float var2, float var3) {
      return sound(var0, var1.soundSource(), var2, var3);
   }

   @NotNull
   static Sound sound(@NotNull Supplier<? extends Sound.Type> var0, Sound.Source.@NotNull Provider var1, float var2, float var3) {
      return sound(var0, var1.soundSource(), var2, var3);
   }

   @NotNull
   Key name();

   @NotNull
   Sound.Source source();

   float volume();

   float pitch();

   @NotNull
   OptionalLong seed();

   @NotNull
   SoundStop asStop();

   interface Builder extends AbstractBuilder<Sound> {
      @NotNull
      Sound.Builder type(@NotNull Key var1);

      @NotNull
      Sound.Builder type(@NotNull Sound.Type var1);

      @NotNull
      Sound.Builder type(@NotNull Supplier<? extends Sound.Type> var1);

      @NotNull
      Sound.Builder source(@NotNull Sound.Source var1);

      @NotNull
      Sound.Builder source(Sound.Source.@NotNull Provider var1);

      @NotNull
      Sound.Builder volume(@Range(from = 0L, to = 2147483647L) float var1);

      @NotNull
      Sound.Builder pitch(@Range(from = -1L, to = 1L) float var1);

      @NotNull
      Sound.Builder seed(long var1);

      @NotNull
      Sound.Builder seed(@NotNull OptionalLong var1);
   }

   interface Emitter {
      @NotNull
      static Sound.Emitter self() {
         return SoundImpl.EMITTER_SELF;
      }
   }

   enum Source {
      MASTER("master"),
      MUSIC("music"),
      RECORD("record"),
      WEATHER("weather"),
      BLOCK("block"),
      HOSTILE("hostile"),
      NEUTRAL("neutral"),
      PLAYER("player"),
      AMBIENT("ambient"),
      VOICE("voice"),
      UI("ui");

      public static final Index<String, Sound.Source> NAMES = Index.create(Sound.Source.class, var0 -> var0.name);
      private final String name;

      Source(String var3) {
         this.name = var3;
      }

      public interface Provider {
         @NotNull
         Sound.Source soundSource();
      }
   }

   interface Type extends Keyed {
      @NotNull
      @Override
      Key key();
   }
}
