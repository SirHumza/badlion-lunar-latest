package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3i;

public interface HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getSendQueue();

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, float var2, float var3) {
      this.bridge$getWorld().bridge$playSound(this.bridge$getPosX(), this.bridge$getPosY(), this.bridge$getPosZ(), var1, var2, var3, false);
   }

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.bridge$getWorld().bridge$playSound(var2, var4, var6, var1, var8, var9, false);
   }

   Optional<String> bridge$getClientBrand();

   void bridge$sendChatMessage(String var1);

   void bridge$sendCommand(String var1);

   IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getMovementInput();

   void bridge$onCriticalHit(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1);

   void bridge$setMovementInput(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1);

   @Override
   boolean bridge$isSprinting();

   void bridge$setSprinting(boolean var1);

   boolean bridge$isRidingHorse();

   void bridge$sendRidingJumpPacket();

   int bridge$getSprintToggleTimer();

   void bridge$setSprintToggleTimer(int var1);

   void bridge$pushOutOfBlocks(double var1, double var3, double var5);

   void bridge$sendPlayerAbilities();

   void bridge$setHorseJumpPowerCounter(int var1);

   int bridge$getHorseJumpPowerCounter();

   void bridge$setHorseJumpPower(float var1);

   float bridge$getHorseJumpPower();

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getOpenContainer();

   default float bridge$getYSize() {
      return 0.0F;
   }

   default void bridge$setYSize(float var1) {
   }

   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RRIOHRHHRHORRROIIRHRHROICRHCRO() {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1 = this.bridge$getWorld();
      Vector3i var2 = new Vector3i(this.bridge$getBlockX(), this.bridge$getBlockY(), this.bridge$getBlockZ());
      return var1.bridge$getChunkFromBlockCoords(var2).bridge$getBiome(var2, var1.bridge$getWorldChunkManager());
   }

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getStatsCounter();

   int bridge$getSwingProgress();

   boolean bridge$isSwingInProgress();

   int bridge$getSwingingArm();

   void bridge$swingHand(int var1);

   void bridge$swingHandVisually(int var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   void bridge$setAttackStrengthTicker(int var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   int bridge$getAttackStrengthTicker();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 35)
   void bridge$setItemSwapTicker(int var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 35)
   int bridge$getItemSwapTicker();

   float bridge$getAttackStrengthScale();

   float bridge$getCurrentItemAttackStrengthDelay();

   int bridge$getUsedItemHand();

   void bridge$startUsingItem(int var1);

   void bridge$stopUsingItem();

   void bridge$drop(boolean var1);

   boolean bridge$hasHealth();

   int bridge$getExperienceLevel();

   boolean bridge$canSeeName(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   );

   void bridge$closeScreen();

   boolean bridge$isPlayerSleeping();

   float bridge$getSleepProgress();

   float bridge$getCooldown(@NotNull IIRHCHHOICHRICOOCRORCCIOOIHOIR var1);

   float bridge$getCurrentMood();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   boolean bridge$canEnterStandingPose();
}
