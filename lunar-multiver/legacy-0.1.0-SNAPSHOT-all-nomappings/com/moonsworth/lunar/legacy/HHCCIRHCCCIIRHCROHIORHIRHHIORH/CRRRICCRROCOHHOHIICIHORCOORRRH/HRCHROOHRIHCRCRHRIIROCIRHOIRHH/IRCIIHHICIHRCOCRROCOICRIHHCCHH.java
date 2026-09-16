package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import lombok.Generated;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(NetworkPlayerInfo.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH,
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Shadow
   public Map<Type, ResourceLocation> playerTextures$v1_12;
   @Shadow
   public ResourceLocation locationCape$v1_8;
   @Final
   @Shadow
   public GameProfile gameProfile;
   @Shadow
   public ITextComponent displayName;
   @Unique
   private final AtomicReference<Object> lunar$profileTextureUuid = new AtomicReference<>();

   @Shadow
   public abstract GameProfile getGameProfile();

   @Shadow
   public abstract String getSkinType();

   @Shadow
   public abstract int getResponseTime();

   @Shadow
   public abstract ResourceLocation getLocationSkin();

   @Shadow
   public abstract ITextComponent getDisplayName();

   @Shadow
   public abstract ScorePlayerTeam getPlayerTeam();

   public Component bridge$getDisplayName() {
      return (Component)(this.displayName == null
         ? Component.empty()
         : RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.displayName
         ));
   }

   public void bridge$setCapeLocation(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.playerTextures$v1_12.put(Type.CAPE, (ResourceLocation)var1);
      } else {
         this.locationCape$v1_8 = (ResourceLocation)var1;
      }
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getCapeLocation() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.playerTextures$v1_12.get(Type.CAPE)
         : (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.locationCape$v1_8;
   }

   @ModifyReturnValue(method = "getLocationSkin", at = @At("RETURN"))
   private ResourceLocation lunar$getLocationSkin(ResourceLocation var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().IOHCCHIIRCOHRROCRRRRHCIIHRRORC() != null
         && !((NetworkPlayerInfo)this instanceof com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)) {
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOHCCHIIRCOHRROCRRRRHCIIHRRORC()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getGameProfile().getId(), this.getSkinType(), (RCIROOOOICRHCCRRCIORHHIRCOIIIC)var1);
         return (ResourceLocation)var2;
      } else {
         return var1;
      }
   }

   @ModifyReturnValue(method = "getSkinType", at = @At("RETURN"))
   private String lunar$getSkinType(String var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.COIHORRCHRRCHOCIRHHRRIOIHRIHCC.CRRRICCRROCOHHOHIICIHORCOORRRH var2;
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
            && !((NetworkPlayerInfo)this instanceof com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)
            && (var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().IOHCCHIIRCOHRROCRRRRHCIIHRRORC())
               != null
         ? var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getGameProfile().getId(), var1)
         : var1;
   }

   public GameProfile bridge$getGameProfile() {
      return this.gameProfile;
   }

   public UUID bridge$getProfileTextureId() {
      return this.getLunar$profileTextureUuid();
   }

   public boolean bridge$hasMismatchedId() {
      return this.gameProfile.getId() == null ? false : !this.gameProfile.getId().equals(this.getLunar$profileTextureUuid());
   }

   public int bridge$getLatency() {
      return this.getResponseTime();
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getLocationSkin() {
      return (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.getLocationSkin();
   }

   public UUID bridge$getUniqueId() {
      return this.getGameProfile().getId();
   }

   public Component bridge$formatName() {
      return (Component)(this.getDisplayName() != null
         ? RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getDisplayName()
         )
         : RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(ScorePlayerTeam.formatPlayerName(this.getPlayerTeam(), this.getGameProfile().getName())));
   }

   @Generated
   public UUID getLunar$profileTextureUuid() {
      Object var1 = this.lunar$profileTextureUuid.get();
      if (var1 == null) {
         synchronized (this.lunar$profileTextureUuid) {
            var1 = this.lunar$profileTextureUuid.get();
            if (var1 == null) {
               UUID var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .HCCICHCRRIICICCHCIRCRRIIRROHHC()
                  .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.gameProfile);
               var1 = var3 == null ? this.lunar$profileTextureUuid : var3;
               this.lunar$profileTextureUuid.set(var1);
            }
         }
      }

      return (UUID)(var1 == this.lunar$profileTextureUuid ? null : var1);
   }
}
