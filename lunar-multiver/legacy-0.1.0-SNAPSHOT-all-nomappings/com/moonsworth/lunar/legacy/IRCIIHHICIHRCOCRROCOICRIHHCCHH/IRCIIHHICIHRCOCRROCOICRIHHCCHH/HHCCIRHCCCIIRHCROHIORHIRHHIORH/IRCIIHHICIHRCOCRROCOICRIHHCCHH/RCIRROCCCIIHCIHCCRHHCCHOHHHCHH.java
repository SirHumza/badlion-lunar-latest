package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GameType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(AbstractClientPlayer.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public NetworkPlayerInfo playerInfo$v1_8;

   @Shadow
   public abstract ResourceLocation getLocationSkin();

   @Shadow
   public abstract NetworkPlayerInfo getPlayerInfo$v1_8();

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

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "onSkinAvailable$v1_7", at = @At("TAIL"))
   private void lunar$onSkinAvailable(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IRRCCOICORICIHCHRHIHIHROIRHOCR.class, () -> new IRRCCOICORICIHCHRHIHIHROIRHOCR((RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.getLocationSkin())
         );
   }

   @Overwrite
   public boolean isSpectator$v1_8() {
      NetworkPlayerInfo var1 = this.playerInfo$v1_8;
      if (var1 == null) {
         var1 = this.getPlayerInfo$v1_8();
      }

      if (this.playerInfo$v1_8 != null) {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
            ? var1.getGameType$v1_12() == GameType.SPECTATOR
            : var1.getGameType$v1_8() == net.minecraft.world.WorldSettings.GameType.SPECTATOR$v1_8;
      } else {
         return false;
      }
   }
}
