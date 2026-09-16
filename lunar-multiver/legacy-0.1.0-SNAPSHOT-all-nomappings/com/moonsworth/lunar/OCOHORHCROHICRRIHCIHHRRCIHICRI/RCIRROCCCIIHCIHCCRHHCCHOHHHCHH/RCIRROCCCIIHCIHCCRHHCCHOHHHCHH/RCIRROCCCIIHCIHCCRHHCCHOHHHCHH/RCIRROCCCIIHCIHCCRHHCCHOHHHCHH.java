package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.util.MovementInput;
import net.minecraft.util.Session;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntityClientPlayerMP.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends EntityPlayerSP implements HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public NetHandlerPlayClient sendQueue;

   @Shadow
   public abstract void sendPlayerAbilities();

   @Shadow
   public abstract void sendHorseJump();

   @Shadow
   public abstract String getClientBrand();

   @Shadow
   public abstract void sendChatMessage(String var1);

   @Shadow
   public abstract StatFileWriter getStatFileWriter();

   @Shadow
   public abstract void swingItem();

   @Shadow
   public abstract EntityItem dropOneItem(boolean var1);

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Minecraft var1, World var2, Session var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public Optional<String> bridge$getClientBrand() {
      return Optional.ofNullable(this.getClientBrand());
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getSendQueue() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.sendQueue;
   }

   public void bridge$sendChatMessage(String var1) {
      this.sendChatMessage(var1);
   }

   public void bridge$sendCommand(String var1) {
      this.sendChatMessage(var1);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getMovementInput() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.movementInput;
   }

   public void bridge$onCriticalHit(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.onCriticalHit((Entity)var1);
   }

   public void bridge$setMovementInput(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.movementInput = (MovementInput)var1;
   }

   public boolean bridge$isSprinting() {
      return this.isSprinting();
   }

   public void bridge$setSprinting(boolean var1) {
      this.setSprinting(var1);
   }

   public void bridge$pushOutOfBlocks(double var1, double var3, double var5) {
      this.pushOutOfBlocks(var1, var3, var5);
   }

   public void bridge$sendPlayerAbilities() {
      this.sendPlayerAbilities();
   }

   public boolean bridge$isRidingHorse() {
      return this.isRidingHorse();
   }

   public void bridge$sendRidingJumpPacket() {
      this.sendHorseJump();
   }

   public int bridge$getSprintToggleTimer() {
      return this.sprintToggleTimer;
   }

   public void bridge$setSprintToggleTimer(int var1) {
      this.sprintToggleTimer = var1;
   }

   public void bridge$setHorseJumpPowerCounter(int var1) {
      this.horseJumpPowerCounter = var1;
   }

   public void bridge$setHorseJumpPower(float var1) {
      this.horseJumpPower = var1;
   }

   public float bridge$getHorseJumpPower() {
      return this.horseJumpPower;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getOpenContainer() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.openContainer;
   }

   public int bridge$getHorseJumpPowerCounter() {
      return this.horseJumpPowerCounter;
   }

   public float bridge$getYSize() {
      return this.yOffset;
   }

   public void bridge$setYSize(float var1) {
      this.yOffset = var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getStatsCounter() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getStatFileWriter();
   }

   public int bridge$getSwingProgress() {
      return this.swingProgressInt;
   }

   public boolean bridge$isSwingInProgress() {
      return this.isSwingInProgress;
   }

   public int bridge$getSwingingArm() {
      return 0;
   }

   public void bridge$swingHand(int var1) {
      this.swingItem();
   }

   public void bridge$swingHandVisually(int var1) {
      if (!this.isSwingInProgress || this.swingProgressInt >= this.getArmSwingAnimationEnd() / 2 || this.swingProgressInt < 0) {
         this.swingProgressInt = -1;
         this.isSwingInProgress = true;
      }
   }

   public int bridge$getUsedItemHand() {
      return 0;
   }

   public void bridge$startUsingItem(int var1) {
      ItemStack var2 = this.getHeldItem();
      this.setItemInUse(var2, var2.getItem().getMaxItemUseDuration(var2));
   }

   public void bridge$stopUsingItem() {
      this.clearItemInUse();
   }

   public void bridge$drop(boolean var1) {
      this.dropOneItem(var1);
   }

   public boolean bridge$hasHealth() {
      return !this.capabilities.isCreativeMode && !this.bridge$isSpectator();
   }

   public int bridge$getExperienceLevel() {
      return this.experienceLevel;
   }

   public void bridge$closeScreen() {
      this.closeScreen();
   }

   public boolean bridge$canSeeName(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      return !var1.bridge$isInvisibleTo(this);
   }

   public boolean bridge$isPlayerSleeping() {
      return this.isPlayerSleeping();
   }

   public float bridge$getSleepProgress() {
      return this.getSleepTimer();
   }

   public float bridge$getCooldown(@NotNull IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return -1.0F;
   }

   public float bridge$getCurrentMood() {
      return 0.0F;
   }

   public float bridge$getAttackStrengthScale() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public float bridge$getCurrentItemAttackStrengthDelay() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }
}
