package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.stats.StatisticsManagerServer;
import net.minecraft.util.TupleIntJsonSerializable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(StatisticsManagerServer.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends StatisticsManager
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Final
   @Shadow
   public MinecraftServer server;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(
      method = "unlockAchievement$v1_8",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/stats/StatisticsManager;unlockAchievement$v1_8(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/stats/StatBase;I)V"
      )
   )
   private void lunar$dontUseLocalManager$v1_8(StatisticsManager var1, EntityPlayer var2, StatBase var3, int var4) {
      this.lunar$unlockAchievement(var2, var3, var4);
   }

   @Unique
   private void lunar$unlockAchievement(EntityPlayer var1, StatBase var2, int var3) {
      Map var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? super.statsData$v1_8 : this.field_150875_a$v1_7;
      if (var4 != null) {
         TupleIntJsonSerializable var5 = var4.computeIfAbsent(var2, var0 -> new TupleIntJsonSerializable());
         if (this.server.isSinglePlayer()
            && var1.gameProfile
               .getName()
               .equals(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getProfile().getName())) {
            int var6 = var5.getIntegerValue();
            this.bridge$recordStat(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2, var3 - var6
            );
         }

         var5.setIntegerValue(var3);
      }
   }
}
