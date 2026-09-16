package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(targets = "javazoom.spi.mpeg.sampled.file.MpegAudioFileReader", remap = false)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @ModifyArg(
      method = "getAudioFileFormat(Ljava/io/InputStream;J)Ljavax/sound/sampled/AudioFileFormat;",
      at = @At(value = "INVOKE", target = "Ljava/io/BufferedInputStream;<init>(Ljava/io/InputStream;I)V"),
      index = 1
   )
   private int lunar$clampId3v1LookupBuffer(int var1) {
      return Math.max(1, var1);
   }
}
