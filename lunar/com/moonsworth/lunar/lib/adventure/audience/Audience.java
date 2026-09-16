package com.moonsworth.lunar.lib.adventure.audience;

import com.moonsworth.lunar.lib.adventure.bossbar.BossBar;
import com.moonsworth.lunar.lib.adventure.chat.ChatType;
import com.moonsworth.lunar.lib.adventure.chat.SignedMessage;
import com.moonsworth.lunar.lib.adventure.dialog.DialogLike;
import com.moonsworth.lunar.lib.adventure.identity.Identified;
import com.moonsworth.lunar.lib.adventure.identity.Identity;
import com.moonsworth.lunar.lib.adventure.inventory.Book;
import com.moonsworth.lunar.lib.adventure.pointer.Pointered;
import com.moonsworth.lunar.lib.adventure.resource.ResourcePackInfo;
import com.moonsworth.lunar.lib.adventure.resource.ResourcePackInfoLike;
import com.moonsworth.lunar.lib.adventure.resource.ResourcePackRequest;
import com.moonsworth.lunar.lib.adventure.resource.ResourcePackRequestLike;
import com.moonsworth.lunar.lib.adventure.sound.Sound;
import com.moonsworth.lunar.lib.adventure.sound.SoundStop;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import com.moonsworth.lunar.lib.adventure.title.Title;
import com.moonsworth.lunar.lib.adventure.title.TitlePart;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public interface Audience extends Pointered {
   @NotNull
   static Audience empty() {
      return EmptyAudience.INSTANCE;
   }

   @NotNull
   static Audience audience(@NotNull Audience... var0) {
      int var1 = var0.length;
      if (var1 == 0) {
         return empty();
      } else {
         return var1 == 1 ? var0[0] : audience(Arrays.asList(var0));
      }
   }

   @NotNull
   static ForwardingAudience audience(@NotNull Iterable<? extends Audience> var0) {
      return () -> var0;
   }

   @NotNull
   static Collector<? super Audience, ?, ForwardingAudience> toAudience() {
      return Audiences.COLLECTOR;
   }

   @NotNull
   default Audience filterAudience(@NotNull Predicate<? super Audience> var1) {
      return var1.test(this) ? this : empty();
   }

   default void forEachAudience(@NotNull Consumer<? super Audience> var1) {
      var1.accept(this);
   }

   @ForwardingAudienceOverrideNotRequired
   default void sendMessage(@NotNull ComponentLike var1) {
      this.sendMessage(var1.asComponent());
   }

   default void sendMessage(@NotNull Component var1) {
      this.sendMessage(var1, MessageType.SYSTEM);
   }

   @Deprecated
   @ForwardingAudienceOverrideNotRequired
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   default void sendMessage(@NotNull ComponentLike var1, @NotNull MessageType var2) {
      this.sendMessage(var1.asComponent(), var2);
   }

   @Deprecated
   @ForwardingAudienceOverrideNotRequired
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   default void sendMessage(@NotNull Component var1, @NotNull MessageType var2) {
      this.sendMessage(Identity.nil(), var1, var2);
   }

   @Deprecated
   @ForwardingAudienceOverrideNotRequired
   default void sendMessage(@NotNull Identified var1, @NotNull ComponentLike var2) {
      this.sendMessage(var1, var2.asComponent());
   }

   @Deprecated
   @ForwardingAudienceOverrideNotRequired
   default void sendMessage(@NotNull Identity var1, @NotNull ComponentLike var2) {
      this.sendMessage(var1, var2.asComponent());
   }

   @Deprecated
   @ForwardingAudienceOverrideNotRequired
   default void sendMessage(@NotNull Identified var1, @NotNull Component var2) {
      this.sendMessage(var1, var2, MessageType.CHAT);
   }

   @Deprecated
   @ForwardingAudienceOverrideNotRequired
   default void sendMessage(@NotNull Identity var1, @NotNull Component var2) {
      this.sendMessage(var1, var2, MessageType.CHAT);
   }

   @Deprecated
   @ForwardingAudienceOverrideNotRequired
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   default void sendMessage(@NotNull Identified var1, @NotNull ComponentLike var2, @NotNull MessageType var3) {
      this.sendMessage(var1, var2.asComponent(), var3);
   }

   @Deprecated
   @ForwardingAudienceOverrideNotRequired
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   default void sendMessage(@NotNull Identity var1, @NotNull ComponentLike var2, @NotNull MessageType var3) {
      this.sendMessage(var1, var2.asComponent(), var3);
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   default void sendMessage(@NotNull Identified var1, @NotNull Component var2, @NotNull MessageType var3) {
      this.sendMessage(var1.identity(), var2, var3);
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   default void sendMessage(@NotNull Identity var1, @NotNull Component var2, @NotNull MessageType var3) {
   }

   default void sendMessage(@NotNull Component var1, ChatType.@NotNull Bound var2) {
      this.sendMessage(var1, MessageType.CHAT);
   }

   @ForwardingAudienceOverrideNotRequired
   default void sendMessage(@NotNull ComponentLike var1, ChatType.@NotNull Bound var2) {
      this.sendMessage(var1.asComponent(), var2);
   }

   default void sendMessage(@NotNull SignedMessage var1, ChatType.@NotNull Bound var2) {
      Component var3 = var1.unsignedContent() != null ? var1.unsignedContent() : Component.text(var1.message());
      if (var1.isSystem()) {
         this.sendMessage(var3);
      } else {
         this.sendMessage(var1.identity(), var3, MessageType.CHAT);
      }
   }

   @ForwardingAudienceOverrideNotRequired
   default void deleteMessage(@NotNull SignedMessage var1) {
      if (var1.canDelete()) {
         this.deleteMessage(Objects.requireNonNull(var1.signature()));
      }
   }

   default void deleteMessage(SignedMessage.@NotNull Signature var1) {
   }

   @ForwardingAudienceOverrideNotRequired
   default void sendActionBar(@NotNull ComponentLike var1) {
      this.sendActionBar(var1.asComponent());
   }

   default void sendActionBar(@NotNull Component var1) {
   }

   @ForwardingAudienceOverrideNotRequired
   default void sendPlayerListHeader(@NotNull ComponentLike var1) {
      this.sendPlayerListHeader(var1.asComponent());
   }

   default void sendPlayerListHeader(@NotNull Component var1) {
      this.sendPlayerListHeaderAndFooter(var1, Component.empty());
   }

   @ForwardingAudienceOverrideNotRequired
   default void sendPlayerListFooter(@NotNull ComponentLike var1) {
      this.sendPlayerListFooter(var1.asComponent());
   }

   default void sendPlayerListFooter(@NotNull Component var1) {
      this.sendPlayerListHeaderAndFooter(Component.empty(), var1);
   }

   @ForwardingAudienceOverrideNotRequired
   default void sendPlayerListHeaderAndFooter(@NotNull ComponentLike var1, @NotNull ComponentLike var2) {
      this.sendPlayerListHeaderAndFooter(var1.asComponent(), var2.asComponent());
   }

   default void sendPlayerListHeaderAndFooter(@NotNull Component var1, @NotNull Component var2) {
   }

   @ForwardingAudienceOverrideNotRequired
   default void showTitle(@NotNull Title var1) {
      Title.Times var2 = var1.times();
      if (var2 != null) {
         this.sendTitlePart(TitlePart.TIMES, var2);
      }

      this.sendTitlePart(TitlePart.SUBTITLE, var1.subtitle());
      this.sendTitlePart(TitlePart.TITLE, var1.title());
   }

   default <T> void sendTitlePart(@NotNull TitlePart<T> var1, @NotNull T var2) {
   }

   default void clearTitle() {
   }

   default void resetTitle() {
   }

   default void showBossBar(@NotNull BossBar var1) {
   }

   default void hideBossBar(@NotNull BossBar var1) {
   }

   default void playSound(@NotNull Sound var1) {
   }

   default void playSound(@NotNull Sound var1, double var2, double var4, double var6) {
   }

   default void playSound(@NotNull Sound var1, Sound.@NotNull Emitter var2) {
   }

   @ForwardingAudienceOverrideNotRequired
   default void stopSound(@NotNull Sound var1) {
      this.stopSound(Objects.requireNonNull(var1, "sound").asStop());
   }

   default void stopSound(@NotNull SoundStop var1) {
   }

   @ForwardingAudienceOverrideNotRequired
   default void openBook(Book.@NotNull Builder var1) {
      this.openBook(var1.build());
   }

   default void openBook(@NotNull Book var1) {
   }

   @ForwardingAudienceOverrideNotRequired
   default void sendResourcePacks(@NotNull ResourcePackInfoLike var1, @NotNull ResourcePackInfoLike... var2) {
      this.sendResourcePacks(ResourcePackRequest.addingRequest(var1, var2));
   }

   @ForwardingAudienceOverrideNotRequired
   default void sendResourcePacks(@NotNull ResourcePackRequestLike var1) {
      this.sendResourcePacks(var1.asResourcePackRequest());
   }

   default void sendResourcePacks(@NotNull ResourcePackRequest var1) {
   }

   @ForwardingAudienceOverrideNotRequired
   default void removeResourcePacks(@NotNull ResourcePackRequestLike var1) {
      this.removeResourcePacks(var1.asResourcePackRequest());
   }

   @ForwardingAudienceOverrideNotRequired
   default void removeResourcePacks(@NotNull ResourcePackRequest var1) {
      List var2 = var1.packs();
      if (var2.size() == 1) {
         this.removeResourcePacks(((ResourcePackInfo)var2.get(0)).id());
      } else if (var2.isEmpty()) {
         return;
      }

      UUID[] var3 = new UUID[var2.size() - 1];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = ((ResourcePackInfo)var2.get(var4 + 1)).id();
      }

      this.removeResourcePacks(((ResourcePackInfo)var2.get(0)).id(), var3);
   }

   @ForwardingAudienceOverrideNotRequired
   default void removeResourcePacks(@NotNull ResourcePackInfoLike var1, @NotNull ResourcePackInfoLike... var2) {
      UUID[] var3 = new UUID[var2.length];

      for (int var4 = 0; var4 < var2.length; var4++) {
         var3[var4] = var2[var4].asResourcePackInfo().id();
      }

      this.removeResourcePacks(var1.asResourcePackInfo().id(), var3);
   }

   default void removeResourcePacks(@NotNull Iterable<UUID> var1) {
      Iterator var2 = var1.iterator();
      if (var2.hasNext()) {
         UUID var3 = (UUID)var2.next();
         UUID[] var4;
         if (!var2.hasNext()) {
            var4 = new UUID[0];
         } else if (var1 instanceof Collection) {
            var4 = new UUID[((Collection)var1).size() - 1];

            for (int var5 = 0; var5 < var4.length; var5++) {
               var4[var5] = (UUID)var2.next();
            }
         } else {
            ArrayList var6 = new ArrayList();

            while (var2.hasNext()) {
               var6.add((UUID)var2.next());
            }

            var4 = var6.toArray(new UUID[0]);
         }

         this.removeResourcePacks(var3, var4);
      }
   }

   default void removeResourcePacks(@NotNull UUID var1, @NotNull UUID... var2) {
   }

   default void clearResourcePacks() {
   }

   default void showDialog(@NotNull DialogLike var1) {
   }

   default void closeDialog() {
   }
}
