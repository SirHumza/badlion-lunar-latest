package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Collection;
import java.util.Optional;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityLivingBase.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   extends Entity
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR,
   IRRCCOICORICIHCHRHIHIHROIRHOCR {
   @Shadow
   public int lastAttackedEntityTime;
   @Shadow
   public EntityLivingBase lastAttackedEntity;
   @Shadow
   public int hurtTime;
   @Shadow
   public int deathTime;
   @Shadow
   public float renderYawOffset;
   @Shadow
   public float rotationYawHead;
   @Shadow
   public float prevRotationYawHead;
   @Shadow
   public float prevRenderYawOffset;
   @Unique
   public Component lunar$displayNameCache;
   @Shadow
   public float moveForward$v1_12;
   @Shadow
   public float moveVertical;
   @Shadow
   public float prevLimbSwingAmount;
   @Shadow
   public float limbSwingAmount;
   @Shadow
   public float limbSwing;
   @Shadow
   public int maxHurtTime;
   @Unique
   private float lunar$scale = 1.0F;

   @Shadow
   public abstract boolean isPotionActive(Potion var1);

   @Shadow
   public abstract Collection<PotionEffect> getActivePotionEffects();

   @Shadow
   public abstract float getHealth();

   @Shadow
   public abstract int getTotalArmorValue();

   @Shadow
   public abstract float getMaxHealth();

   @Shadow
   public abstract boolean isPlayerSleeping();

   @Shadow
   public abstract PotionEffect getActivePotionEffect(Potion var1);

   @Shadow
   public abstract int getArmSwingAnimationEnd();

   @Shadow
   public abstract ItemStack getEquipmentInSlot$v1_7(int var1);

   @Shadow
   public abstract ItemStack getHeldItem$v1_12(EnumHand var1);

   @Shadow
   public abstract ItemStack getHeldItem$v1_7();

   @Shadow
   public abstract boolean isElytraFlying$v1_12();

   @Shadow
   public abstract boolean isChild();

   @Shadow
   public abstract Team getTeam$v1_7();

   public CRRRICCRROCOHHOHIICIHORCOORRRH(World var1) {
      super(var1);
   }

   public int bridge$getLastAttackerTime() {
      return this.lastAttackedEntityTime;
   }

   public int bridge$getHurtTime() {
      return this.hurtTime;
   }

   public int bridge$getCurrentHurtTime() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? this.hurtTime + 1 : this.hurtTime;
   }

   public int bridge$getMaxHurtTime() {
      return this.maxHurtTime;
   }

   public boolean bridge$wasJustHurt() {
      int var1 = this.bridge$getCurrentHurtTime();
      return var1 > 0 && var1 == this.bridge$getMaxHurtTime();
   }

   public float bridge$getDeathTime() {
      return this.deathTime;
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR> bridge$getLastAttacker() {
      return Optional.ofNullable(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR)this.lastAttackedEntity
      );
   }

   @Inject(method = {"swingArm$v1_12", "swingItem$v1_7"}, at = @At("HEAD"))
   private void lunar$swingItem(CallbackInfo var1) {
      if (this instanceof EntityPlayer) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this,
               false
            );
      }
   }

   @Overwrite
   public boolean getAlwaysRenderNameTagForRender() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getAlwaysRenderNameTag$v1_8()
         : this.getDataWatcher$v1_7().getWatchableObjectByte$v1_7(3) == 1;
   }

   public boolean bridge$isPotionActive(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return this.isPotionActive((Potion)var1);
   }

   public Collection<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$getActivePotionEffects() {
      return this.getActivePotionEffects();
   }

   public boolean bridge$isInLava() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.isInLava$v1_8() : this.handleLavaMovement$v1_7();
   }

   public int bridge$getArmSwingAnimationEnd() {
      return this.getArmSwingAnimationEnd();
   }

   public float bridge$getBodyRot() {
      return this.renderYawOffset;
   }

   public void bridge$setBodyYRot(float var1) {
      this.renderYawOffset = var1;
   }

   public float bridge$getRotationYawHead() {
      return this.rotationYawHead;
   }

   public void bridge$setRotationYawHead(float var1) {
      this.rotationYawHead = var1;
   }

   public float bridge$getPrevRotationYawHead() {
      return this.prevRotationYawHead;
   }

   public void bridge$setPrevRotationYawHead(float var1) {
      this.prevRotationYawHead = var1;
   }

   public float bridge$getPreviousRotationYawOffset() {
      return this.prevRenderYawOffset;
   }

   public int bridge$getTotalArmorValue() {
      return this.getTotalArmorValue();
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getEquipmentInSlot(IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         byte var6 = switch (var1) {
            case MAINHAND -> 0;
            case OFFHAND -> 1;
            case FEET -> 2;
            case LEGS -> 3;
            case CHEST -> 4;
            case HEAD -> 5;
            default -> throw new IncompatibleClassChangeError();
         };
         int var3 = 0;

         for (ItemStack var5 : this.getEquipmentAndArmor$v1_12()) {
            if (var6 == var3) {
               return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var5;
            }

            var3++;
         }

         return null;
      } else {
         byte var2 = switch (var1) {
            case MAINHAND -> 0;
            case OFFHAND -> throw new UnsupportedOperationException("Cannot get offhand in legacy!");
            case FEET -> 1;
            case LEGS -> 2;
            case CHEST -> 3;
            case HEAD -> 4;
            default -> throw new IncompatibleClassChangeError();
         };
         return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.getEquipmentInSlot$v1_7(var2);
      }
   }

   public float bridge$getHealth() {
      return this.getHealth();
   }

   public float bridge$getMaxHealth() {
      return this.getMaxHealth();
   }

   public boolean bridge$isSleeping() {
      return this.isPlayerSleeping();
   }

   public float bridge$getMoveForward() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.moveForward$v1_12 : this.moveVertical;
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getHeldItem() {
      return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getHeldItem$v1_12(EnumHand.MAIN_HAND) : this.getHeldItem$v1_7()
      );
   }

   public float bridge$getPrevRenderYawOffset() {
      return this.prevRenderYawOffset;
   }

   public String bridge$getDisplayName() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getDisplayName$v1_8().getFormattedText()
         : this.getFormattedCommandSenderName$v1_7().getFormattedText();
   }

   public Component bridge$getDisplayNameComponent() {
      if (this.lunar$displayNameCache != null) {
         return this.lunar$displayNameCache;
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         TextComponentString var2 = new TextComponentString(ScorePlayerTeam.formatPlayerName(this.getTeam$v1_12(), this.getName$v1_8()));
         return this.lunar$displayNameCache = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2
         );
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         TextComponentString var1 = new TextComponentString(ScorePlayerTeam.formatPlayerName(this.getTeam$v1_7(), this.getName$v1_8()));
         return this.lunar$displayNameCache = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1
         );
      } else {
         return this.lunar$displayNameCache = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getFormattedCommandSenderName$v1_7()
         );
      }
   }

   public void lunar$onNameTagUpdate() {
      this.lunar$displayNameCache = null;
   }

   public Component bridge$getDisplayNameComponentWithHover() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getDisplayName$v1_8()
         )
         : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getFormattedCommandSenderName$v1_7()
         );
   }

   @Inject(method = "onDeath", at = @At("HEAD"), cancellable = true)
   private void lunar$livingEntityDeathEvent(DamageSource var1, CallbackInfo var2) {
      if (this.world.isRemote) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var3 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                  this
               )
            );
         if (var3 != null && var3.isCancelled()) {
            var2.cancel();
         }
      }
   }

   @Inject(method = "onUpdate", at = @At("TAIL"))
   private void lunar$livingEntityUpdateEvent(CallbackInfo var1) {
      if (this.world.isRemote) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  this
               )
            );
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getActivePotionEffect(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getActivePotionEffect(
         (Potion)var1
      );
   }

   public boolean bridge$isElytraFlying() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 2 && this.isElytraFlying$v1_12();
   }

   public long bridge$getLastAttackedMillis() {
      return com.moonsworth.lunar.client.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOCIIROIRCOHIRHHHROHCOOHIICIHI(this)
         .RROHIORIHHHORHOOHCIOIRCROHRIOR();
   }

   public long bridge$getLastHurtMillis() {
      return com.moonsworth.lunar.client.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOCIIROIRCOHIRHHHROHCOOHIICIHI(this)
         .CIICOHOOIOCICHHCCRRHIRIHOOCHRH();
   }

   public long bridge$getLastDamagedMillis() {
      return com.moonsworth.lunar.client.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOCIIROIRCOHIRHHHROHCOOHIICIHI(this)
         .HIROORIIOCOHRHORHHIHCIOHOIOOII();
   }

   @Inject(method = "attackEntityFrom", at = @At("HEAD"))
   private void lunar$setLastHurtTime(DamageSource var1, float var2, CallbackInfoReturnable<Boolean> var3) {
      if (var1 instanceof EntityDamageSource
         && this instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         com.moonsworth.lunar.client.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOCIIROIRCOHIRHHHROHCOOHIICIHI(this)
            .HRHIHIRHRCHHRORRRCORHOCIRHRIOR(IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI());
      }
   }

   public void bridge$calculateEntityAnimation() {
      this.prevLimbSwingAmount = this.limbSwingAmount;
      double var1 = this.posX - this.prevPosX;
      double var3 = this.posZ - this.prevPosZ;
      float var5 = (float)Math.min(Math.sqrt(var1 * var1 + var3 * var3) * 4.0, 1.0);
      this.limbSwingAmount = this.limbSwingAmount + (var5 - this.limbSwingAmount) * 0.4F;
      this.limbSwing = this.limbSwing + this.limbSwingAmount;
   }

   public boolean bridge$isInvisibleToPlayer() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() != null
         && this.isInvisibleToPlayer((EntityPlayer)IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
   }

   public boolean bridge$isBaby() {
      return this.isChild();
   }

   public boolean bridge$canShieldBeAttacked(double var1, double var3, double var5) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         return false;
      } else {
         EntityLivingBase var8 = (EntityLivingBase)this;
         if (var8 instanceof EntityPlayer var7 && var7.isActiveItemStackBlocking$v1_12()) {
            Vec3d var10 = this.getVectorForRotation$v1_8(this.rotationPitch, this.rotationYaw);
            Vec3d var9 = this.getPositionVector$v1_8().subtract(new Vec3d(var1, var3, var5));
            var9 = var9.normalize();
            return new Vec3d(var9.x, 0.0, var9.z).dotProduct(var10) < 0.0;
         } else {
            return false;
         }
      }
   }

   public void bridge$setLunarScale(float var1) {
      this.lunar$scale = var1;
   }

   public float bridge$getLunarScale() {
      return this.lunar$scale;
   }

   public boolean bridge$isHostile() {
      CRRRICCRROCOHHOHIICIHORCOORRRH var1 = this;
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 && var1 instanceof EntityShulker || var1 instanceof EntityGhast || var1 instanceof EntitySlime;
   }
}
