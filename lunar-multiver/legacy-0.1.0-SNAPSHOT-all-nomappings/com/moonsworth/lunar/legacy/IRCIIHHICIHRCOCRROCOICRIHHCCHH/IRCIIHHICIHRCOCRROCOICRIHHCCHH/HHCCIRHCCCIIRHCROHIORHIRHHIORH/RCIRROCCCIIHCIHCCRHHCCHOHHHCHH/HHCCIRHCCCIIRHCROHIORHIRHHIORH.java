package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import paulscode.sound.FilenameURL;
import paulscode.sound.SoundBuffer;
import paulscode.sound.Source;
import paulscode.sound.libraries.ChannelLWJGLOpenAL;
import paulscode.sound.libraries.SourceLWJGLOpenAL;

@Mixin(SourceLWJGLOpenAL.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends Source {
   @Shadow
   private ChannelLWJGLOpenAL channelOpenAL;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      boolean var1,
      boolean var2,
      boolean var3,
      String var4,
      FilenameURL var5,
      SoundBuffer var6,
      float var7,
      float var8,
      float var9,
      int var10,
      float var11,
      boolean var12
   ) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @Inject(method = "preLoad", at = @At(value = "INVOKE", target = "Lpaulscode/sound/ICodec;read()Lpaulscode/sound/SoundBuffer;"), cancellable = true)
   private void lunar$fixJamsNpe$codec(CallbackInfoReturnable<Boolean> var1) {
      if (this.codec == null) {
         this.preLoad = false;
         var1.setReturnValue(false);
      }
   }

   @Inject(method = "calculateDistance", at = @At("HEAD"), cancellable = true)
   private void lunar$fixJamsNpe$position(CallbackInfo var1) {
      if (this.position == null) {
         var1.cancel();
      }
   }

   @Inject(method = "play", at = @At(value = "INVOKE", target = "Lpaulscode/sound/ICodec;initialize(Ljava/net/URL;)Z"))
   private void lunar$provideChannel(CallbackInfo var1) {
      if (this.codec instanceof com.moonsworth.lunar.legacy.wrapper.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.channelOpenAL);
      }
   }
}
