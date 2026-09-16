package com.moonsworth.lunar.lib.adventure.bossbar;

import com.moonsworth.lunar.lib.adventure.audience.Audience;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import com.moonsworth.lunar.lib.adventure.util.Index;
import java.util.Set;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

@ApiStatus.NonExtendable
public interface BossBar extends Examinable {
   float MIN_PROGRESS = 0.0F;
   float MAX_PROGRESS = 1.0F;
   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   float MIN_PERCENT = 0.0F;
   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   float MAX_PERCENT = 1.0F;

   @NotNull
   static BossBar bossBar(@NotNull ComponentLike var0, float var1, @NotNull BossBar.Color var2, @NotNull BossBar.Overlay var3) {
      BossBarImpl.checkProgress(var1);
      return bossBar(var0.asComponent(), var1, var2, var3);
   }

   @NotNull
   static BossBar bossBar(@NotNull Component var0, float var1, @NotNull BossBar.Color var2, @NotNull BossBar.Overlay var3) {
      BossBarImpl.checkProgress(var1);
      return new BossBarImpl(var0, var1, var2, var3);
   }

   @NotNull
   static BossBar bossBar(@NotNull ComponentLike var0, float var1, @NotNull BossBar.Color var2, @NotNull BossBar.Overlay var3, @NotNull Set<BossBar.Flag> var4) {
      BossBarImpl.checkProgress(var1);
      return bossBar(var0.asComponent(), var1, var2, var3, var4);
   }

   @NotNull
   static BossBar bossBar(@NotNull Component var0, float var1, @NotNull BossBar.Color var2, @NotNull BossBar.Overlay var3, @NotNull Set<BossBar.Flag> var4) {
      BossBarImpl.checkProgress(var1);
      return new BossBarImpl(var0, var1, var2, var3, var4);
   }

   @NotNull
   Component name();

   @Contract("_ -> this")
   @NotNull
   default BossBar name(@NotNull ComponentLike var1) {
      return this.name(var1.asComponent());
   }

   @Contract("_ -> this")
   @NotNull
   BossBar name(@NotNull Component var1);

   float progress();

   @Contract("_ -> this")
   @NotNull
   BossBar progress(float var1);

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   default float percent() {
      return this.progress();
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   @Contract("_ -> this")
   @NotNull
   default BossBar percent(float var1) {
      return this.progress(var1);
   }

   @NotNull
   BossBar.Color color();

   @Contract("_ -> this")
   @NotNull
   BossBar color(@NotNull BossBar.Color var1);

   @NotNull
   BossBar.Overlay overlay();

   @Contract("_ -> this")
   @NotNull
   BossBar overlay(@NotNull BossBar.Overlay var1);

   @NotNull
   @UnmodifiableView Set<BossBar.Flag> flags();

   @Contract("_ -> this")
   @NotNull
   BossBar flags(@NotNull Set<BossBar.Flag> var1);

   boolean hasFlag(@NotNull BossBar.Flag var1);

   @Contract("_ -> this")
   @NotNull
   BossBar addFlag(@NotNull BossBar.Flag var1);

   @Contract("_ -> this")
   @NotNull
   BossBar removeFlag(@NotNull BossBar.Flag var1);

   @Contract("_ -> this")
   @NotNull
   BossBar addFlags(@NotNull BossBar.Flag... var1);

   @Contract("_ -> this")
   @NotNull
   BossBar removeFlags(@NotNull BossBar.Flag... var1);

   @Contract("_ -> this")
   @NotNull
   BossBar addFlags(@NotNull Iterable<BossBar.Flag> var1);

   @Contract("_ -> this")
   @NotNull
   BossBar removeFlags(@NotNull Iterable<BossBar.Flag> var1);

   @Contract("_ -> this")
   @NotNull
   BossBar addListener(@NotNull BossBar.Listener var1);

   @Contract("_ -> this")
   @NotNull
   BossBar removeListener(@NotNull BossBar.Listener var1);

   @NotNull
   @UnmodifiableView Iterable<? extends BossBarViewer> viewers();

   @NotNull
   default BossBar addViewer(@NotNull Audience var1) {
      var1.showBossBar(this);
      return this;
   }

   @NotNull
   default BossBar removeViewer(@NotNull Audience var1) {
      var1.hideBossBar(this);
      return this;
   }

   enum Color {
      PINK("pink"),
      BLUE("blue"),
      RED("red"),
      GREEN("green"),
      YELLOW("yellow"),
      PURPLE("purple"),
      WHITE("white");

      public static final Index<String, BossBar.Color> NAMES = Index.create(BossBar.Color.class, var0 -> var0.name);
      private final String name;

      Color(String var3) {
         this.name = var3;
      }
   }

   enum Flag {
      DARKEN_SCREEN("darken_screen"),
      PLAY_BOSS_MUSIC("play_boss_music"),
      CREATE_WORLD_FOG("create_world_fog");

      public static final Index<String, BossBar.Flag> NAMES = Index.create(BossBar.Flag.class, var0 -> var0.name);
      private final String name;

      Flag(String var3) {
         this.name = var3;
      }
   }

   @ApiStatus.OverrideOnly
   interface Listener {
      default void bossBarNameChanged(@NotNull BossBar var1, @NotNull Component var2, @NotNull Component var3) {
      }

      default void bossBarProgressChanged(@NotNull BossBar var1, float var2, float var3) {
         this.bossBarPercentChanged(var1, var2, var3);
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      default void bossBarPercentChanged(@NotNull BossBar var1, float var2, float var3) {
      }

      default void bossBarColorChanged(@NotNull BossBar var1, @NotNull BossBar.Color var2, @NotNull BossBar.Color var3) {
      }

      default void bossBarOverlayChanged(@NotNull BossBar var1, @NotNull BossBar.Overlay var2, @NotNull BossBar.Overlay var3) {
      }

      default void bossBarFlagsChanged(@NotNull BossBar var1, @NotNull Set<BossBar.Flag> var2, @NotNull Set<BossBar.Flag> var3) {
      }
   }

   enum Overlay {
      PROGRESS("progress"),
      NOTCHED_6("notched_6"),
      NOTCHED_10("notched_10"),
      NOTCHED_12("notched_12"),
      NOTCHED_20("notched_20");

      public static final Index<String, BossBar.Overlay> NAMES = Index.create(BossBar.Overlay.class, var0 -> var0.name);
      private final String name;

      Overlay(String var3) {
         this.name = var3;
      }
   }
}
