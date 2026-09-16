package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraft.network.play.server.SPacketPlayerListItem.Action;
import net.minecraft.network.play.server.SPacketPlayerListItem.AddPlayerData;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SPacketPlayerListItem.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public Action action$v1_8;
   @Final
   @Shadow
   public List<AddPlayerData> players$v1_8;
   @Shadow
   public String field_149126_a$v1_7;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "readPacketData", at = @At("TAIL"))
   private void lunar$addPlayerData$v1_8(PacketBuffer var1, CallbackInfo var2) {
      ArrayList var3 = Lists.newArrayList();

      for (AddPlayerData var5 : this.players$v1_8) {
         GameProfile var6 = var5.profile;
         if (this.action$v1_8 == Action.ADD_PLAYER) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$submit(
                  () -> HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
                        () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           var5.profile
                        )
                     )
               );
         } else if (this.action$v1_8 == Action.REMOVE_PLAYER) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$submit(
                  () -> HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
                        () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           var5.profile
                        )
                     )
               );
         } else {
            var6 = new GameProfile(var5.profile.getId(), null);
         }

         SPacketPlayerListItem var7 = (SPacketPlayerListItem)this;
         AddPlayerData var8;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            Objects.requireNonNull(var7);
            var8 = new AddPlayerData(var7, var6, var5.ping, var5.gamemode$v1_12, var5.displayName);
         } else {
            Objects.requireNonNull(var7);
            var8 = new AddPlayerData(var7, var6, var5.ping, var5.gamemode$v1_8, var5.displayName);
         }

         var3.add(var8);
      }

      this.players$v1_8.clear();
      this.players$v1_8.addAll(var3);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "readPacketData", at = @At("TAIL"))
   private void impl$addPlayerData$v1_7(PacketBuffer var1, CallbackInfo var2) {
      this.field_149126_a$v1_7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOHCCHIIRCOHRROCRRRRHCIIHRRORC()
         .ROORRRORCHHOOHIIORIHCORHCIOIHR(this.field_149126_a$v1_7);
   }
}
