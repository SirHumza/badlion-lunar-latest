package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayer.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends EntityPlayer
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Unique
   private ResourceLocation lunar$skinLocationOverride;
   @Unique
   private boolean lunar$cancelSkinOverride;
   @Unique
   private String lunar$skinTypeOverride;
   @Shadow
   public ResourceLocation locationCape$v1_7;
   @Shadow
   public ResourceLocation locationSkin$v1_7;
   @Unique
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   private String skinType;

   @Shadow
   public abstract boolean isSpectator$v1_8();

   @Shadow
   public abstract String getSkinType$v1_8();

   @Shadow
   public abstract ResourceLocation getLocationSkin();

   @Shadow
   @Nullable
   public abstract NetworkPlayerInfo getPlayerInfo$v1_8();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(World var1, GameProfile var2) {
      super(var1, var2);
   }

   public boolean bridge$isSpectator() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && this.isSpectator$v1_8();
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getCapeLocation() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         NetworkPlayerInfo var1 = this.getPlayerInfo$v1_8();
         return var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
            ? ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1)
               .bridge$getCapeLocation()
            : null;
      } else {
         return (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.locationCape$v1_7;
      }
   }

   public void bridge$setCapeLocation(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR.class, () -> new IIRHCHHOICHRICOOCRORCCIOOIHOIR(this));
      if (var2 == null || !var2.isCancelled()) {
         this.bridge$setCapeLocationOverride(var1);
      }
   }

   public void bridge$setCapeLocationOverride(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         try {
            NetworkPlayerInfo var2 = this.getPlayerInfo$v1_8();
            if (var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
               )
             {
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2)
                  .bridge$setCapeLocation(var1);
            }
         } catch (NullPointerException var3) {
         }
      } else {
         this.locationCape$v1_7 = (ResourceLocation)var1;
      }
   }

   @Inject(method = "<init>", at = @At("RETURN"))
   private void lunar$createPlayer(World var1, GameProfile var2, CallbackInfo var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this
            )
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "hasSkin", at = @At("HEAD"), cancellable = true)
   private void lunar$hasSkin(CallbackInfoReturnable<Boolean> var1) {
      var1.setReturnValue(this.getLocationSkin() != null);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "getLocationSkin", at = @At("RETURN"), cancellable = true)
   public void lunar$getLocationSkin$v1_7(CallbackInfoReturnable<ResourceLocation> var1) {
      ResourceLocation var2 = (ResourceLocation)var1.getReturnValue();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().IOHCCHIIRCOHRROCRRRRHCIIHRRORC() != null
         && !((AbstractClientPlayer)this instanceof CRRRICCRROCOHHOHIICIHORCOORRRH)) {
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOHCCHIIRCOHRROCRRRRHCIIHRRORC()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getGameProfile().getId(), "default", (RCIROOOOICRHCCRRCIORHHIRCOIIIC)var2);
         var1.setReturnValue((ResourceLocation)var3);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "getFovModifier$v1_8", at = @At("TAIL"), cancellable = true)
   private void lunar$getFovModifier(CallbackInfoReturnable<Float> var1) {
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class, () -> new OOROOCCIRCCRHOIOIORIHCHHOOCCOR((Float)var1.getReturnValue()));
      if (var2 != null) {
         if (var2.isCancelled()) {
            var1.setReturnValue(1.0F);
         } else {
            var1.setReturnValue(var2.RHHHRIIROORRIHCHRHCOCOCIHRCCIC());
         }
      }
   }

   public String bridge$getSkinType() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return this.getSkinType$v1_8();
      }

      if (!this.lunar$cancelSkinOverride && this.lunar$skinTypeOverride != null) {
         return this.lunar$skinTypeOverride;
      }

      if (this.skinType == null) {
         Map var1 = Minecraft.getMinecraft().sessionService.getTextures(this.gameProfile, false);
         if (this.gameProfile.getProperties().isEmpty()) {
            Minecraft.getMinecraft().getSessionService().fillProfileProperties(this.gameProfile, true);
            var1 = Minecraft.getMinecraft().getSessionService().getTextures(this.gameProfile, false);
         }

         if (var1.containsKey(Type.SKIN) && ((MinecraftProfileTexture)var1.get(Type.SKIN)).getMetadata("model") != null) {
            this.skinType = "slim";
         } else {
            this.skinType = "default";
         }
      }

      return this.skinType;
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getLocationSkin() {
      return (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.getLocationSkin();
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getLocationSkinNoOverride() {
      this.lunar$cancelSkinOverride = true;
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1 = (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.getLocationSkin();
      this.lunar$cancelSkinOverride = false;
      return var1;
   }

   public float bridge$getSwingProgress(float var1) {
      return this.getSwingProgress(var1);
   }

   public Optional<String> bridge$loadAndGetRealSkinType() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         NetworkPlayerInfo var1 = this.getPlayerInfo$v1_8();
         if (var1 != null) {
            var1.loadPlayerTextures();
            return Optional.ofNullable(var1.skinType);
         } else {
            return Optional.empty();
         }
      } else {
         return Optional.ofNullable(this.bridge$getSkinType());
      }
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getLocationSkinDefault() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (RCIROOOOICRHCCRRCIORHHIRCOIIIC)DefaultPlayerSkin.getDefaultSkin(this.getUniqueID())
         : (RCIROOOOICRHCCRRCIORHHIRCOIIIC)AbstractClientPlayer.locationStevePng$v1_7;
   }

   public boolean bridge$isSkinTextureUploaded() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         if (!this.lunar$cancelSkinOverride && this.lunar$skinLocationOverride != null) {
            return true;
         } else {
            NetworkPlayerInfo var1 = ((AbstractClientPlayer)this).getPlayerInfo$v1_8();
            if (var1 == null) {
               return false;
            } else {
               return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var1.playerTextures$v1_12.get(Type.SKIN) != null : var1.locationSkin$v1_8 != null;
            }
         }
      } else {
         return !this.lunar$cancelSkinOverride && this.lunar$skinLocationOverride != null || ((AbstractClientPlayer)this).locationSkin$v1_7 != null;
      }
   }

   public boolean bridge$isModelPartShown(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? ((AbstractClientPlayer)this).isWearing$v1_8((EnumPlayerModelParts)var1) : true;
   }

   @Inject(method = "getLocationSkin", at = @At("HEAD"), cancellable = true)
   private void lunar$getLocationSkin(CallbackInfoReturnable<ResourceLocation> var1) {
      if (!this.lunar$cancelSkinOverride && this.lunar$skinLocationOverride != null) {
         var1.setReturnValue(this.lunar$skinLocationOverride);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "getSkinType$v1_8", at = @At("HEAD"), cancellable = true)
   private void lunar$getSkinType$v1_8(CallbackInfoReturnable<String> var1) {
      if (!this.lunar$cancelSkinOverride && this.lunar$skinTypeOverride != null) {
         var1.setReturnValue(this.lunar$skinTypeOverride);
      }
   }

   public void bridge$setSkinLocationOverride(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, String var2) {
      this.lunar$skinLocationOverride = (ResourceLocation)var1;
      this.lunar$skinTypeOverride = var2;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getMainHandItemRenderState() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getHeldItem$v1_12(EnumHand.MAIN_HAND) : this.getHeldItem$v1_7()
      );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getOffHandItemRenderState() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getHeldItem$v1_12(EnumHand.OFF_HAND) : this.getHeldItem$v1_7()
      );
   }

   public void bridge$setSkinLocation(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, String var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         NetworkPlayerInfo var3 = this.getPlayerInfo$v1_8();
         if (var3 != null) {
            var3.skinType = var2;
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
               var3.playerTextures$v1_12.put(Type.SKIN, (ResourceLocation)var1);
            } else {
               var3.locationSkin$v1_8 = (ResourceLocation)var1;
            }
         }
      } else {
         this.locationSkin$v1_7 = (ResourceLocation)var1;
      }
   }
}
