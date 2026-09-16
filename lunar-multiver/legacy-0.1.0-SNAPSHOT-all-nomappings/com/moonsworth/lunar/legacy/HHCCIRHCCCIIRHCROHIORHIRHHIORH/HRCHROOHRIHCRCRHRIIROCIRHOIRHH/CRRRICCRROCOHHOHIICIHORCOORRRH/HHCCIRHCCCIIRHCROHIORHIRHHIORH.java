package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import mchorse.emoticons.capabilities.cosmetic.EmoteController;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.FoodStats;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityPlayer.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends EntityLivingBase
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH,
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public GameProfile gameProfile;
   @Shadow
   public PlayerCapabilities capabilities;
   @Shadow
   public InventoryPlayer inventory;
   @Shadow
   public int flyToggleTimer;
   @Shadow
   public ItemStack itemInUse$v1_7;

   @Shadow
   public abstract FoodStats getFoodStats();

   @Shadow
   public abstract float getBedOrientationInDegrees();

   @Shadow
   public abstract boolean canEat(boolean var1);

   @Shadow
   public abstract boolean isSpectator$v1_8();

   @Shadow
   public abstract ItemStack getHeldItem$v1_7();

   @Shadow
   public abstract boolean isBlocking$v1_7();

   @Shadow
   public abstract ItemStack getCurrentEquippedItem$v1_7();

   @Shadow
   public abstract ItemStack getCurrentArmor$v1_7(int var1);

   @Shadow
   public abstract int getItemInUseCount$v1_7();

   @Shadow
   public abstract boolean isUsingItem$v1_7();

   @Shadow
   public abstract ItemStack getItemInUse$v1_7();

   @Shadow
   public abstract int getItemInUseDuration$v1_7();

   @Shadow
   public abstract void addChatComponentMessage$v1_7(IChatComponent var1);

   @Shadow
   public abstract EnumHandSide getPrimaryHand$v1_12();

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(World var1) {
      super(var1);
   }

   public GameProfile bridge$getGameProfile() {
      return this.gameProfile;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getPlayerCapabilities() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH)this.capabilities;
   }

   public boolean bridge$isSpectator() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && this.isSpectator$v1_8();
   }

   public void bridge$addChatMessage(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      if (!var2.isEnabled() || !(Boolean)var2.IIOHRCOOHHOHICIIRCRROIORIHCCCR().get()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.sendMessage$v1_12((ITextComponent)var1);
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            this.addChatMessage$v1_8((ITextComponent)var1);
         } else {
            this.addChatComponentMessage$v1_7((IChatComponent)var1);
         }
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getInventory() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.inventory;
   }

   public void bridge$openInventory() {
      Minecraft.getMinecraft().displayGuiScreen(new GuiInventory((EntityPlayer)this));
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getCurrentEquippedItem() {
      return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getHeldItem$v1_12(EnumHand.MAIN_HAND) : this.getCurrentEquippedItem$v1_7()
      );
   }

   public int bridge$getCurrentEquippedItemIndex() {
      return this.inventory.currentItem;
   }

   public void bridge$setCurrentEquippedItemIndex(int var1) {
      this.inventory.currentItem = var1;
   }

   public boolean bridge$isSprinting() {
      return this.isSprinting();
   }

   public String bridge$getName() {
      return this.gameProfile.getName();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getFoodStats() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getFoodStats();
   }

   public boolean bridge$isBlocking() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.isActiveItemStackBlocking$v1_12() : this.isBlocking$v1_7();
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getMainHandItemRenderState() {
      return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getHeldItem$v1_12(EnumHand.MAIN_HAND) : this.getHeldItem$v1_7()
      );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getOffHandItemRenderState() {
      return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getHeldItem$v1_12(EnumHand.OFF_HAND) : this.getHeldItem$v1_7()
      );
   }

   public void bridge$preparePlayerToSpawn() {
      super.preparePlayerToSpawn();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getArmor(
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1
   ) {
      byte var2 = switch (var1) {
         case MAINHAND, OFFHAND -> throw new UnsupportedOperationException("Mainhand/Offhand is invalid slot for method getArmor!");
         case FEET -> 0;
         case LEGS -> 1;
         case CHEST -> 2;
         case HEAD -> 3;
         default -> throw new IncompatibleClassChangeError();
      };
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         ItemStack var3 = this.inventory.armorItemInSlot(var2);
         return !var3.equals(ItemStack.EMPTY$v1_12) && var3.getItem() != Items.AIR$v1_12 ? (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var3 : null;
      } else {
         return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.getCurrentArmor$v1_7(var2);
      }
   }

   public float bridge$getItemProgress() {
      ItemStack var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getActiveItemStack$v1_12() : this.itemInUse$v1_7;
      if (var1 != null && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 || !var1.isEmpty$v1_12())) {
         float var2 = var1.item == Items.BOW ? 20.0F : var1.getMaxItemUseDuration();
         return var2 == 0.0F ? 0.0F : Math.min(1.0F, this.bridge$getItemInUseDuration() / var2);
      } else {
         return 0.0F;
      }
   }

   public int bridge$getItemInUseCount() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getItemInUseCount$v1_12() : this.getItemInUseCount$v1_7();
   }

   public int bridge$getTicksUsingItem() {
      return this.bridge$getItemInUseCount();
   }

   public float bridge$getBedOrientationInDegrees() {
      return this.getBedOrientationInDegrees();
   }

   @Inject(method = "onUpdate", at = @At("TAIL"))
   private void lunar$cosmeticPostUpdate(CallbackInfo var1) {
      if (this.world.isRemote) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(
                  this
               )
            );
      }
   }

   @Inject(method = "onDeath", at = @At("HEAD"), cancellable = true)
   private void lunar$livingEntityDeathEvent(DamageSource var1, CallbackInfo var2) {
      if (this.world.isRemote) {
         CRICCOOHHHCHOORCICOCOHIHOIRHOO var3 = (CRICCOOHHHCHOORCICOCOHIHOIRHOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.class, () -> new CRICCOOHHHCHOORCICOCOHIHOIRHOO(this));
         if (var3 != null && var3.isCancelled()) {
            var2.cancel();
         }
      }
   }

   public boolean bridge$isUsingItem() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.isHandActive$v1_12() : this.isUsingItem$v1_7();
   }

   public void bridge$setFlyToggleTimer(int var1) {
      this.flyToggleTimer = var1;
   }

   public double bridge$getMovementSpeedAttribute() {
      return this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
   }

   public double bridge$getAttackDamageAttribute() {
      return this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue();
   }

   public Optional<IIRHCHHOICHRICOOCRORCCIOOIHOIR> bridge$getItemInUse() {
      return Optional.ofNullable(
         (IIRHCHHOICHRICOOCRORCCIOOIHOIR)(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getActiveItemStack$v1_12() : this.getItemInUse$v1_7())
      );
   }

   public int bridge$getItemInUseDuration() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getItemInUseMaxCount$v1_12() : this.getItemInUseDuration$v1_7();
   }

   public boolean bridge$canEat(boolean var1) {
      return this.canEat(var1);
   }

   public boolean bridge$isFlying() {
      return this.capabilities.isFlying;
   }

   public boolean bridge$isJumping() {
      return this.isJumping;
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getPickResult() {
      return null;
   }

   @Nullable
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getServerSkinTexture() {
      Minecraft var1 = Minecraft.getMinecraft();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         AbstractClientPlayer var5 = (AbstractClientPlayer)var1.world.getPlayerEntityByUUID(this.getUniqueID());
         return var5 == null ? null : (RCIROOOOICRHCCRRCIORHHIRCOIIIC)var5.getLocationSkin();
      }

      NetHandlerPlayClient var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? var1.getConnection$v1_12() : var1.getNetHandler$v1_7();
      if (var2 == null) {
         return null;
      }

      Map var3 = var2.playerInfoMap$v1_8;
      if (var3 == null) {
         return null;
      }

      NetworkPlayerInfo var4 = (NetworkPlayerInfo)var3.get(this.getUniqueID());
      return var4 == null ? null : (RCIROOOOICRHCCRRCIORHHIRCOIIIC)var4.getLocationSkin();
   }

   public double bridge$blockInteractionRange() {
      PlayerControllerMP var1 = ((Minecraft)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()).playerController;
      return var1.extendedReach() ? 6.0 : var1.getBlockReachDistance();
   }

   public double bridge$entityInteractionRange() {
      PlayerControllerMP var1 = ((Minecraft)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()).playerController;
      return var1.extendedReach() ? 6.0 : 3.0;
   }

   public boolean bridge$isEmoting() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(this);
   }

   @Nullable
   public <C> C bridge$getEmoteController() {
      return (C)EmoteController.get(this);
   }

   public <C> List<C> bridge$getWornCosmetics() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HCCICHCRRIICICCHCIRCRRIIRROHHC()
         .HRHIHIRHRCHHRORRRCORHOCIRHRIOR(this.bridge$getUniqueID());
   }

   public boolean bridge$isDummySelf() {
      return this instanceof IHIRRIIORRHORHRORIHOROIRCORCOO var1
         && var1.getDummyPlayerType() == com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SELF;
   }

   public boolean bridge$isDummyMannequin() {
      return this instanceof IHIRRIIORRHORHRORIHOROIRCORCOO var1
         && var1.getDummyPlayerType() == com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MANNEQUIN;
   }

   public boolean bridge$isSelf() {
      return this == IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPlayer();
   }

   public boolean bridge$isSkinTextureUploaded() {
      return false;
   }

   public void bridge$setUseItem(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         this.activeItemStack$v1_12 = (ItemStack)var1;
      }
   }

   public void bridge$setUseItemRemaining(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         this.activeItemStackUseCount$v1_12 = var1;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public boolean bridge$isMainHandSwapped() {
      return this.getPrimaryHand$v1_12() == EnumHandSide.LEFT;
   }
}
