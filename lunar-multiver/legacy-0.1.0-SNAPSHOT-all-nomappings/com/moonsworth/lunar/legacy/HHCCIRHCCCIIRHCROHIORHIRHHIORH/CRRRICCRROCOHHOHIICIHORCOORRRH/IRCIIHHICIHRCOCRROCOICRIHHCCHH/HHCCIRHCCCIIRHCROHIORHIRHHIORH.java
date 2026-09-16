package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet_v1_8;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.Team.EnumVisible;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.util.CooldownTracker;
import net.minecraft.util.EnumHand;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(EntityPlayerSP.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends AbstractClientPlayer
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public NetHandlerPlayClient connection$v1_8;
   @Shadow
   public int sprintToggleTimer;
   @Shadow
   public int horseJumpPowerCounter;
   @Shadow
   public float horseJumpPower;
   @Shadow
   public MovementInput movementInput;
   @Shadow
   public Minecraft mc;
   @Final
   @Shadow
   public StatisticsManager statWriter$v1_8;
   @Shadow
   public float prevRenderArmYaw;
   @Shadow
   public float renderArmYaw;
   @Shadow
   public float renderArmPitch;
   @Shadow
   public float prevRenderArmPitch;
   @Shadow
   public float lastReportedPitch$v1_8;
   @Shadow
   public float lastReportedYaw$v1_8;
   @Shadow
   public double lastReportedPosX$v1_8;
   @Shadow
   public double lastReportedPosY$v1_8;
   @Shadow
   public double lastReportedPosZ$v1_8;

   @Shadow
   public abstract void onCriticalHit(Entity var1);

   @Shadow
   public abstract void setSprinting(boolean var1);

   @Shadow
   public abstract boolean pushOutOfBlocks(double var1, double var3, double var5);

   @Shadow
   public abstract boolean isRidingHorse();

   @Shadow
   public abstract float getHorseJumpPower();

   @Shadow
   public abstract String getClientBrand$v1_8();

   @Shadow
   public abstract String getServerBrand$v1_12();

   @Shadow
   public abstract void sendHorseJump();

   @Shadow
   public abstract void sendChatMessage$v1_8(String var1);

   @Shadow
   public abstract void swingArm$v1_12(EnumHand var1);

   @Shadow
   public abstract void swingItem$v1_8();

   @Shadow
   public abstract void setActiveHand$v1_12(EnumHand var1);

   @Shadow
   public abstract void resetActiveHand$v1_12();

   @Shadow
   public abstract EntityItem dropOneItem$v1_8(boolean var1);

   @Shadow
   public abstract EntityItem dropItem$v1_12(boolean var1);

   @Shadow
   public abstract void closeScreen();

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(World var1, GameProfile var2) {
      super(var1, var2);
   }

   public Optional<String> bridge$getClientBrand() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? Optional.ofNullable(this.getServerBrand$v1_12())
         : Optional.ofNullable(this.getClientBrand$v1_8());
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getSendQueue() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.connection$v1_8;
   }

   public void bridge$sendChatMessage(String var1) {
      this.sendChatMessage$v1_8(var1);
   }

   public void bridge$sendCommand(String var1) {
      this.sendChatMessage$v1_8(var1);
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
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.connection$v1_8
            .sendPacket$v1_12(
               (Packet_v1_8)(new CPacketEntityAction(this, Action.START_RIDING_JUMP$v1_12, MathHelper.floor$v1_12(this.getHorseJumpPower() * 100.0F)))
            );
      } else {
         this.sendHorseJump();
      }
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

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getStatsCounter() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.statWriter$v1_8;
   }

   public int bridge$getSwingProgress() {
      return this.swingProgressInt;
   }

   public boolean bridge$isSwingInProgress() {
      return this.isSwingInProgress;
   }

   public int bridge$getSwingingArm() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         return this.swingingHand$v1_12 != null ? this.swingingHand$v1_12.ordinal() : 0;
      } else {
         return 0;
      }
   }

   public void bridge$swingHand(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         this.swingArm$v1_12(EnumHand.values()[var1]);
      } else {
         this.swingItem$v1_8();
      }
   }

   public void bridge$swingHandVisually(int var1) {
      if (!this.isSwingInProgress || this.swingProgressInt >= this.getArmSwingAnimationEnd() / 2 || this.swingProgressInt < 0) {
         this.swingProgressInt = -1;
         this.isSwingInProgress = true;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.swingingHand$v1_12 = EnumHand.values()[var1];
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public void bridge$setAttackStrengthTicker(int var1) {
      this.ticksSinceLastSwing$v1_12 = var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public int bridge$getAttackStrengthTicker() {
      return this.ticksSinceLastSwing$v1_12;
   }

   public float bridge$getAttackStrengthScale() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.getCooledAttackStrength$v1_12(0.0F);
      } else {
         throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
      }
   }

   public float bridge$getCurrentItemAttackStrengthDelay() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.getCooldownPeriod$v1_12();
      } else {
         throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
      }
   }

   public int bridge$getUsedItemHand() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1 ? 0 : this.getActiveHand$v1_12().ordinal();
   }

   public void bridge$startUsingItem(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         ItemStack var2 = this.getHeldItem$v1_7();
         this.setItemInUse$v1_7(var2, var2.getItem().getMaxItemUseDuration(var2));
      } else {
         this.setActiveHand$v1_12(EnumHand.values()[var1]);
      }
   }

   public void bridge$stopUsingItem() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         this.clearItemInUse$v1_7();
      } else {
         this.resetActiveHand$v1_12();
      }
   }

   public void bridge$drop(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         this.dropOneItem$v1_8(var1);
      } else {
         this.dropItem$v1_12(var1);
      }
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

   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getLastReportedLookAngle() {
      return (CRHROHHHCIHHCOHCOORCRIHHIICROR)this.getVectorForRotation$v1_8(this.lastReportedPitch$v1_8, this.lastReportedYaw$v1_8);
   }

   public Vector3d bridge$getLastReportedPos() {
      return new Vector3d(this.lastReportedPosX$v1_8, this.lastReportedPosY$v1_8, this.lastReportedPosZ$v1_8);
   }

   public boolean bridge$canSeeName(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1 == this) {
         return true;
      }

      Team var2;
      Team var3;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         var2 = ((EntityPlayer)var1).getTeam$v1_7();
         var3 = this.getTeam$v1_7();
      } else {
         var2 = ((EntityPlayer)var1).getTeam$v1_12();
         var3 = this.getTeam$v1_12();
      }

      if (var2 == null) {
         return !var1.bridge$isInvisibleTo(this);
      }

      EnumVisible var4 = var2.getNameTagVisibility$v1_8();

      return switch (var4) {
         case ALWAYS -> true;
         case NEVER -> false;
         case HIDE_FOR_OTHER_TEAMS -> var3 == null || var2.isSameTeam(var3);
         case HIDE_FOR_OWN_TEAM -> var3 == null || !var2.isSameTeam(var3);
         default -> throw new IncompatibleClassChangeError();
      };
   }

   public boolean bridge$isPlayerSleeping() {
      return this.isPlayerSleeping();
   }

   public float bridge$getSleepProgress() {
      return this.getSleepTimer();
   }

   public float bridge$getCooldown(@NotNull IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         CooldownTracker var2 = this.getCooldownTracker$v1_12();
         if (var2.hasCooldown((Item)var1.bridge$getItem())) {
            return var2.getCooldown((Item)var1.bridge$getItem(), 0.0F);
         }
      }

      return -1.0F;
   }

   public float bridge$getCurrentMood() {
      return 0.0F;
   }
}
