package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.client.audio.SoundRegistry_v1_12;
import net.minecraft.client.audio.SoundRegistry_v1_7;
import net.minecraft.client.audio.SoundRegistry_v1_8;
import net.minecraft.client.audio.ISound.AttenuationType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import paulscode.sound.SoundSystemConfig;

@Mixin(SoundHandler.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Final
   @Shadow
   public SoundManager sndManager;
   @Final
   @Shadow
   public SoundRegistry_v1_12 soundRegistry$v1_12;
   @Final
   @Shadow
   public SoundRegistry_v1_7 sndRegistry$v1_7;
   @Final
   @Shadow
   public SoundRegistry_v1_8 sndRegistry$v1_8;
   @Unique
   private String lunar$currentLunarSong = null;
   @Unique
   private boolean lunar$ignoreVolumeSettings;

   @Shadow
   public abstract void playSound(ISound var1);

   @Inject(method = "playSound", at = @At("HEAD"), cancellable = true)
   private void lunar$playSound(ISound var1, CallbackInfo var2) {
      this.lunar$fireSoundEvent(var1, var2);
   }

   @Inject(method = "playDelayedSound", at = @At("HEAD"), cancellable = true)
   private void lunar$playDelayedSound(ISound var1, int var2, CallbackInfo var3) {
      this.lunar$fireSoundEvent(var1, var3);
   }

   @Unique
   private void lunar$fireSoundEvent(ISound var1, CallbackInfo var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 || var1 != null) {
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IIRHCHHOICHRICOOCRORCCIOOIHOIR.class,
               () -> {
                  String var2x = "";
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
                     if (var1.getCategory$v1_12() != null) {
                        var2x = var1.getCategory$v1_12().getName$v1_12();
                     }
                  } else {
                     SoundEventAccessorComposite var3x = this.sndManager.sndHandler.getSound$v1_7(var1.getSoundLocation());
                     if (var3x != null && var3x.getSoundCategory() != null) {
                        var2x = var3x.getSoundCategory().getCategoryName$v1_7();
                     }
                  }

                  return new IIRHCHHOICHRICOOCRORCCIOOIHOIR(
                     (RCIROOOOICRHCCRRCIORHHIRCOIIIC)var1.getSoundLocation(),
                     var2x,
                     var1 instanceof PositionedSoundRecord,
                     var1.getVolume(),
                     var1.getPitch(),
                     var1.getXPosF(),
                     var1.getYPosF(),
                     var1.getZPosF()
                  );
               }
            );
         if (var3 != null && var3.isCancelled()) {
            var2.cancel();
         }
      }
   }

   public void bridge$playSound(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, boolean var2, float var3) {
      Minecraft var4 = Minecraft.getMinecraft();
      if (!var4.isCallingFromMinecraftThread()) {
         ((RRCRRCORICCHOHHIRCHIROOHIIOHCO)var4).bridge$submit(() -> this.bridge$playSound(var1, var2, var3));
      } else if (var1.bridge$getDomain().equals("lunar")) {
         String var5 = UUID.randomUUID().toString();
         ResourceLocation var6 = (ResourceLocation)var1;
         String var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var6.getNamespace$v1_12() : var6.getResourcePath$v1_7();
         this.sndManager
            .sndSystem
            .newStreamingSource(
               false,
               var5,
               SoundManager.getURLForSoundResource(var6),
               var7,
               false,
               this.sndManager.sndSystem.getListenerData().position.x,
               this.sndManager.sndSystem.getListenerData().position.y,
               this.sndManager.sndSystem.getListenerData().position.z,
               0,
               SoundSystemConfig.getDefaultRolloff()
            );
         this.sndManager.sndSystem.setPitch(var5, 1.0F);
         this.sndManager.sndSystem.setVolume(var5, var3);
         this.sndManager.sndSystem.play(var5);
      } else {
         this.lunar$ignoreVolumeSettings = var2;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            if (SoundEvent.REGISTRY.getObject((ResourceLocation)var1) == null) {
               this.lunar$ignoreVolumeSettings = false;
               throw new IllegalStateException("Sound is null");
            }

            this.playSound(
               new PositionedSoundRecord((ResourceLocation)var1, SoundCategory.MASTER, var3, 1.0F, false, 0, AttenuationType.NONE, 0.0F, 0.0F, 0.0F)
            );
         } else {
            this.playSound(new PositionedSoundRecord((ResourceLocation)var1, var3, 1.0F, false, 0, AttenuationType.NONE, 0.0F, 0.0F, 0.0F));
         }

         this.lunar$ignoreVolumeSettings = false;
      }
   }

   public void bridge$play(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      float var3,
      float var4,
      boolean var5,
      int var6,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7,
      double var8,
      double var10,
      double var12
   ) {
      Minecraft var14 = Minecraft.getMinecraft();
      if (!var14.isCallingFromMinecraftThread()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            var14.addScheduledTask$v1_8(() -> this.bridge$play(var1, var2, var3, var4, var5, var6, var7, var8, var10, var12));
         } else {
            var14.addScheduledTask$v1_7(() -> this.bridge$play(var1, var2, var3, var4, var5, var6, var7, var8, var10, var12));
         }
      } else if (var1.bridge$getDomain().equals("lunar")) {
         String var19 = UUID.randomUUID().toString();
         ResourceLocation var16 = (ResourceLocation)var1;
         String var17 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var16.getNamespace$v1_12() : var16.getResourcePath$v1_7();

         byte var18 = switch (var7) {
            case NONE -> 0;
            case LINEAR -> 2;
            default -> throw new IncompatibleClassChangeError();
         };
         this.sndManager
            .sndSystem
            .newStreamingSource(
               false,
               var19,
               SoundManager.getURLForSoundResource(var16),
               var17,
               var5,
               (float)var8,
               (float)var10,
               (float)var12,
               var18,
               SoundSystemConfig.getDefaultRolloff()
            );
         if (var6 != 0) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Delay is unsupported with lunar sounds! - " + var1, new Object[0]
            );
         }

         this.sndManager.sndSystem.setPitch(var19, var4);
         this.sndManager.sndSystem.setVolume(var19, var3);
         this.sndManager.sndSystem.play(var19);
      } else {
         PositionedSoundRecord var15;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            var15 = new PositionedSoundRecord(
               (ResourceLocation)var1,
               this.lunar$soundSourceToCategory(var2),
               var3,
               var4,
               var5,
               var6,
               AttenuationType.values()[var7.ordinal()],
               (float)var8,
               (float)var10,
               (float)var12
            );
         } else {
            var15 = new PositionedSoundRecord(
               (ResourceLocation)var1, var3, var4, var5, var6, AttenuationType.values()[var7.ordinal()], (float)var8, (float)var10, (float)var12
            );
         }

         this.playSound(var15);
      }
   }

   @Unique
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   private SoundCategory lunar$soundSourceToCategory(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
   ) {
      return switch (var1) {
         case MASTER -> SoundCategory.MASTER;
         case MUSIC -> SoundCategory.MUSIC;
         case RECORDS -> SoundCategory.RECORDS;
         case WEATHER -> SoundCategory.WEATHER;
         case BLOCKS -> SoundCategory.BLOCKS;
         case HOSTILE -> SoundCategory.HOSTILE$v1_12;
         case NEUTRAL -> SoundCategory.NEUTRAL$v1_12;
         case PLAYERS -> SoundCategory.PLAYERS;
         case AMBIENT -> SoundCategory.AMBIENT;
         case VOICE -> SoundCategory.VOICE$v1_12;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   public void bridge$playLunarMusic(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      if (this.sndManager.sndSystem != null) {
         String var2 = UUID.randomUUID().toString();
         this.sndManager.stopAllSounds();
         this.sndManager
            .sndSystem
            .newStreamingSource(
               true,
               var2,
               SoundManager.getURLForSoundResource((ResourceLocation)var1),
               IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? ((ResourceLocation)var1).getPath$v1_12() : ((ResourceLocation)var1).getResourcePath$v1_7(),
               false,
               0.0F,
               0.0F,
               0.0F,
               0,
               SoundSystemConfig.getDefaultRolloff()
            );
         this.sndManager.sndSystem.setPitch(var2, 1.0F);
         this.sndManager.sndSystem.setVolume(var2, 0.1F);
         this.sndManager.sndSystem.play(var2);
         this.lunar$currentLunarSong = var2;
      }
   }

   public void bridge$stopPlayingLunarMusic() {
      if (this.lunar$currentLunarSong != null && this.sndManager.sndSystem != null) {
         this.sndManager.sndSystem.stop(this.lunar$currentLunarSong);
      }
   }

   public void bridge$setLunarMusicVolume(float var1) {
      if (this.sndManager.sndSystem != null) {
         this.sndManager.sndSystem.setVolume(this.lunar$currentLunarSong, var1 * 0.1F);
      }
   }

   public Set<RCIROOOOICRHCCRRCIORHHIRCOIIIC> bridge$getAllRegisteredSounds() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.soundRegistry$v1_12.registryObjects.keySet();
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? this.sndRegistry$v1_8.registryObjects.keySet()
            : this.sndRegistry$v1_7.registryObjects.keySet();
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getSoundEngine() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.sndManager;
   }

   public void bridge$reload() {
      this.bridge$getSoundEngine().bridge$setReloadingBlocking(true);
      this.sndManager.reloadSoundSystem();
      this.bridge$getSoundEngine().bridge$setReloadingBlocking(false);
   }

   public Object bridge$playMp3FromURL(String var1, float var2, boolean var3, boolean var4) {
      Minecraft var5 = Minecraft.getMinecraft();
      if (!var5.isCallingFromMinecraftThread()) {
         throw new RuntimeException("Need to be on the main thread to play sounds");
      }

      String var6 = UUID.randomUUID().toString();
      int var7 = var3 ? AttenuationType.LINEAR.getTypeInt() : AttenuationType.NONE.getTypeInt();

      try {
         URL var8 = new URL(var1);
         if (var4) {
            this.sndManager.sndSystem.newStreamingSource(false, var6, var8, var1 + ".mp3", false, 0.0F, 0.0F, 0.0F, var7, 16.0F);
            this.sndManager.sndSystem.setPitch(var6, 1.0F);
            this.sndManager.sndSystem.setVolume(var6, var2);
            this.sndManager.sndSystem.play(var6);
         } else {
            com.moonsworth.lunar.legacy.wrapper.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, () -> {
               String var6x = var1 + ".staticmp3";
               this.sndManager.sndSystem.newSource(false, var6, var8, var6x, false, 0.0F, 0.0F, 0.0F, var7, 16.0F);
               this.sndManager.sndSystem.setPitch(var6, 1.0F);
               this.sndManager.sndSystem.setVolume(var6, var2);
               this.sndManager.sndSystem.play(var6);
            });
         }
      } catch (MalformedURLException var9) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, "SoundManager");
      }

      return var6;
   }

   public boolean bridge$isSoundPlaying(Object var1) {
      return this.sndManager.sndSystem.playing((String)var1);
   }

   public void bridge$destroySound(Object var1) {
      this.sndManager.sndSystem.stop((String)var1);
      this.sndManager.sndSystem.removeSource((String)var1);
   }

   public void bridge$setVolume(Object var1, float var2) {
      this.sndManager.sndSystem.setVolume((String)var1, var2);
   }

   public void bridge$setSoundLocation(Object var1, double var2, double var4, double var6) {
      this.sndManager.sndSystem.setPosition((String)var1, (float)var2, (float)var4, (float)var6);
   }

   public boolean bridge$shouldIgnoreVolumeSettings() {
      return this.lunar$ignoreVolumeSettings;
   }

   public int bridge$getPlayingSoundCount() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0 ? this.sndManager.playingSounds$v1_7.size() : this.sndManager.playingSounds$v1_8.size();
   }

   public String bridge$getDebugString() {
      return this.bridge$getPlayingSoundCount() + "";
   }
}
