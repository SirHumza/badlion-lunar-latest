package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.client.audio.SoundManager.SoundSystemStarterThread;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Group;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import paulscode.sound.SoundSystemConfig;

@Mixin(SoundManager.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public SoundSystemStarterThread sndSystem;
   @Shadow
   public boolean loaded;

   @Inject(method = "reloadSoundSystem", at = @At("HEAD"), cancellable = true)
   private void lunar$cancelReload(CallbackInfo var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR().ifPresent(var1x -> {
         if (var1x.isReloading()) {
            var1.cancel();
         }
      });
   }

   @Inject(method = "unloadSoundSystem", at = @At("HEAD"))
   private void lunar$reloadRewindSoundEngine(CallbackInfo var1) {
      if (this.loaded
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
         if (var2 != null && var2.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = var2.HOROHROIORRIRIIIOOCCIROCRCROHI();
            var3.COIIRRRCCRRRIRICICOCHRCCCRRICH().cleanup();
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var3.OIRIRIIORHRCHRCHROORRROIRROIRI();
            if (var4.CHCHOIHOHOCICIHCHRHIOHIRCIIRCO()) {
               var4.RIOHIIOHRICOOCIOROHCCIHIIIRROO().destroy();
            }
         }
      }
   }

   @WrapOperation(method = "loadSoundSystem", at = @At(value = "INVOKE", target = "Ljava/lang/Thread;start()V"))
   private void lunar$waitReload(Thread var1, Operation<Void> var2) {
      var2.call(new Object[]{var1});
      boolean var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC();
      if (((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this)
            .bridge$isReloadingBlocking()
         || var3) {
         try {
            var1.join();
         } catch (InterruptedException var5) {
            throw new RuntimeException(var5);
         }
      }
   }

   @Inject(method = "playSound", at = @At("HEAD"), cancellable = true)
   private void lunar$rewindPreventPlayUselessSounds(ISound var1, CallbackInfo var2) {
      if (!var1.canRepeat()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> var0.HRCHICHIOHOROOHHHOHROHCICCROIO().RHHIIIHORICCOCHHORHHOCCHCCIICC() / 50L > 20L)) {
         var2.cancel();
      }
   }

   @Inject(method = "unloadSoundSystem", at = @At("HEAD"))
   private void lunar$onUnloadSoundSystem(CallbackInfo var1) {
      com.moonsworth.lunar.legacy.wrapper.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHCHCRCIIOCOICCCCIRICCROIIOHCI();
   }

   @Inject(method = "<init>(Lnet/minecraft/client/audio/SoundHandler;Lnet/minecraft/client/settings/GameSettings;)V", at = @At("TAIL"))
   private void lunar$setMP3Codec(SoundHandler var1, GameSettings var2, CallbackInfo var3) {
      SoundSystemConfig.setCodec("staticmp3", com.moonsworth.lunar.legacy.wrapper.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class);
      SoundSystemConfig.setCodec("mp3", com.moonsworth.lunar.legacy.wrapper.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class);
   }

   @Inject(method = "pauseAllSounds", at = @At("TAIL"))
   private void lunar$pauseAllLunarPlayingAudios(CallbackInfo var1) {
      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
         .IIHOOICIOCRRCHOIRRHCCRHIOCRICC()
         .values()) {
         this.sndSystem.pause((String)var3.getSource());
      }
   }

   @Inject(method = "resumeAllSounds", at = @At("TAIL"))
   private void lunar$resumeAllLunarPlayingAudios(CallbackInfo var1) {
      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
         .IIHOOICIOCRRCHOIRRHCCRHIOCRICC()
         .values()) {
         this.sndSystem.play((String)var3.getSource());
      }
   }

   @Unique
   private Entity lunar$getRenderViewEntity() {
      Minecraft var1 = Minecraft.getMinecraft();
      Object var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? var1.renderViewEntity$v1_7 : var1.renderViewEntity$v1_8;
      if (var2 == null) {
         var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? var1.thePlayer$v1_7 : var1.player$v1_8;
      }

      return (Entity)var2;
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;prevRotationPitch:F"))
   @Dynamic
   @Group(name = "listenerPrevRotationPitch", min = 1)
   private float lunar$rewindListenerPrevRotationPitch$Player(EntityPlayer var1, Operation<Float> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevRotationPitch
         : (Float)var2.call(new Object[]{var1});
   }

   @WrapOperation(
      method = "setListener(Lnet/minecraft/entity/Entity;F)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;prevRotationPitch:F")
   )
   @Dynamic
   @Group(name = "listenerPrevRotationPitch", min = 1)
   private float lunar$rewindListenerPrevRotationPitch$Entity(Entity var1, Operation<Float> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevRotationPitch
         : (Float)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;rotationPitch:F"))
   @Dynamic
   @Group(name = "listenerRotationPitch", min = 1)
   private float lunar$rewindListenerRotationPitch$Player(EntityPlayer var1, Operation<Float> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().rotationPitch
         : (Float)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener(Lnet/minecraft/entity/Entity;F)V", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;rotationPitch:F"))
   @Dynamic
   @Group(name = "listenerRotationPitch", min = 1)
   private float lunar$rewindListenerRotationPitch$Entity(Entity var1, Operation<Float> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().rotationPitch
         : (Float)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;prevRotationYaw:F"))
   @Dynamic
   @Group(name = "listenerPrevRotationYaw", min = 1)
   private float lunar$rewindListenerPrevRotationYaw$Player(EntityPlayer var1, Operation<Float> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevRotationYaw
         : (Float)var2.call(new Object[]{var1});
   }

   @WrapOperation(
      method = "setListener(Lnet/minecraft/entity/Entity;F)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;prevRotationYaw:F")
   )
   @Dynamic
   @Group(name = "listenerPrevRotationYaw", min = 1)
   private float lunar$rewindListenerPrevRotationYaw$Entity(Entity var1, Operation<Float> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevRotationYaw
         : (Float)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;rotationYaw:F"))
   @Dynamic
   @Group(name = "listenerRotationYaw", min = 1)
   private float lunar$rewindListenerRotationYaw$Player(EntityPlayer var1, Operation<Float> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().rotationYaw
         : (Float)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener(Lnet/minecraft/entity/Entity;F)V", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;rotationYaw:F"))
   @Dynamic
   @Group(name = "listenerRotationYaw", min = 1)
   private float lunar$rewindListenerRotationYaw$Entity(Entity var1, Operation<Float> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().rotationYaw
         : (Float)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;prevPosX:D"))
   @Dynamic
   @Group(name = "listenerPrevPosX", min = 1)
   private double lunar$rewindListenerPrevPosX$Player(EntityPlayer var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevPosX
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener(Lnet/minecraft/entity/Entity;F)V", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;prevPosX:D"))
   @Dynamic
   @Group(name = "listenerPrevPosX", min = 1)
   private double lunar$rewindListenerPrevPosX$Entity(Entity var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevPosX
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;posX:D"))
   @Dynamic
   @Group(name = "listenerPosX", min = 1)
   private double lunar$rewindListenerPosX$Player(EntityPlayer var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().posX
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener(Lnet/minecraft/entity/Entity;F)V", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;posX:D"))
   @Dynamic
   @Group(name = "listenerPosX", min = 1)
   private double lunar$rewindListenerPosX$Entity(Entity var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().posX
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;prevPosY:D"))
   @Dynamic
   @Group(name = "listenerPrevPosY", min = 1)
   private double lunar$rewindListenerPrevPosY$Player(EntityPlayer var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevPosY
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener(Lnet/minecraft/entity/Entity;F)V", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;prevPosY:D"))
   @Dynamic
   @Group(name = "listenerPrevPosY", min = 1)
   private double lunar$rewindListenerPrevPosY$Entity(Entity var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevPosY
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;posY:D"))
   @Dynamic
   @Group(name = "listenerPosY", min = 1)
   private double lunar$rewindListenerPosY$Player(EntityPlayer var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().posY
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener(Lnet/minecraft/entity/Entity;F)V", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;posY:D"))
   @Dynamic
   @Group(name = "listenerPosY", min = 1)
   private double lunar$rewindListenerPosY$Entity(Entity var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().posY
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;prevPosZ:D"))
   @Dynamic
   @Group(name = "listenerPrevPosZ", min = 1)
   private double lunar$rewindListenerPrevPosZ$Player(EntityPlayer var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevPosZ
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener(Lnet/minecraft/entity/Entity;F)V", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;prevPosZ:D"))
   @Dynamic
   @Group(name = "listenerPrevPosZ", min = 1)
   private double lunar$rewindListenerPrevPosZ$Entity(Entity var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().prevPosZ
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;posZ:D"))
   @Dynamic
   @Group(name = "listenerPosZ", min = 1)
   private double lunar$rewindListenerPosZ$Player(EntityPlayer var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().posZ
         : (Double)var2.call(new Object[]{var1});
   }

   @WrapOperation(method = "setListener(Lnet/minecraft/entity/Entity;F)V", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;posZ:D"))
   @Dynamic
   @Group(name = "listenerPosZ", min = 1)
   private double lunar$rewindListenerPosZ$Entity(Entity var1, Operation<Double> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? this.lunar$getRenderViewEntity().posZ
         : (Double)var2.call(new Object[]{var1});
   }
}
