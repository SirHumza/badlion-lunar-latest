package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.Set;

public interface CRRRICCRROCOHHOHIICIHORCOORRRH {
   void bridge$playSound(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, boolean var2, float var3);

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      this.bridge$playSound(var1, false, "lunar".equals(var1.bridge$getDomain()) ? 1.0F : 0.25F);
   }

   void bridge$play(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1,
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      float var3,
      float var4,
      boolean var5,
      int var6,
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7,
      double var8,
      double var10,
      double var12
   );

   void bridge$playLunarMusic(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1);

   void bridge$stopPlayingLunarMusic();

   void bridge$setLunarMusicVolume(float var1);

   default Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, float var2, boolean var3) {
      return this.bridge$playMp3FromURL(var1, var2, var3, true);
   }

   Object bridge$playMp3FromURL(String var1, float var2, boolean var3, boolean var4);

   boolean bridge$isSoundPlaying(Object var1);

   void bridge$destroySound(Object var1);

   void bridge$setVolume(Object var1, float var2);

   void bridge$setSoundLocation(Object var1, double var2, double var4, double var6);

   Set<RCIROOOOICRHCCRRCIORHHIRCOIIIC> bridge$getAllRegisteredSounds();

   HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getSoundEngine();

   void bridge$reload();

   boolean bridge$shouldIgnoreVolumeSettings();

   int bridge$getPlayingSoundCount();

   String bridge$getDebugString();
}
