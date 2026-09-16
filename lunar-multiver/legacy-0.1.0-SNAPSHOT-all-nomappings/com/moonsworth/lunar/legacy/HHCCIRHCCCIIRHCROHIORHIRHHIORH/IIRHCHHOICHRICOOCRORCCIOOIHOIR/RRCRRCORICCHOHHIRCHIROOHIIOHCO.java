package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Scoreboard.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Shadow
   public Map<String, ScorePlayerTeam> teamMemberships$v1_8;
   @Shadow
   public Map teamMemberships$v1_7;

   @Shadow
   public abstract ScorePlayerTeam getPlayersTeam(String var1);

   @Shadow
   public abstract ScoreObjective getObjectiveInDisplaySlot(int var1);

   @Shadow
   public abstract Score getOrCreateScore$v1_12(String var1, ScoreObjective var2);

   @Shadow
   public abstract Score getValueFromObjective$v1_7(String var1, ScoreObjective var2);

   @Shadow
   public abstract Collection<Score> getSortedScores$v1_8(ScoreObjective var1);

   @Shadow
   public abstract Collection getSortedScores$v1_7(ScoreObjective var1);

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getPlayersTeam(String var1) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.getPlayersTeam(var1);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getObjectiveInDisplaySlot(
      int var1
   ) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getObjectiveInDisplaySlot(
         var1
      );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getValueFromObjective(
      String var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getOrCreateScore$v1_12(
            var1, (ScoreObjective)var2
         )
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getValueFromObjective$v1_7(
            var1, (ScoreObjective)var2
         );
   }

   public Collection<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getSortedScores(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      Collection var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getSortedScores$v1_8((ScoreObjective)var1)
         : this.getSortedScores$v1_7((ScoreObjective)var1);
      ArrayList var3 = new ArrayList(var2.size());

      for (Score var5 : var2) {
         if (var5 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6) {
            var3.add(var6);
         }
      }

      return var3;
   }

   @Inject(method = "removeTeam", at = @At("HEAD"), cancellable = true)
   public void impl$removeTeam(ScorePlayerTeam var1, CallbackInfo var2) {
      if (var1 == null) {
         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "removeObjective$v1_8", at = @At("HEAD"), cancellable = true)
   public void impl$removeObjective$v1_8(ScoreObjective var1, CallbackInfo var2) {
      if (var1 == null) {
         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "func_96519_k$v1_7", at = @At("HEAD"), cancellable = true)
   public void impl$removeObjective$v1_7(ScoreObjective var1, CallbackInfo var2) {
      if (var1 == null) {
         var2.cancel();
      }
   }

   @Overwrite
   public void removePlayerFromTeam(String var1, ScorePlayerTeam var2) {
      if (this.getPlayersTeam(var1) == var2) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            this.teamMemberships$v1_8.remove(var1);
            var2.getMembershipCollection$v1_8().remove(var1);
         } else {
            this.teamMemberships$v1_7.remove(var1);
            var2.getMembershipCollection$v1_7().remove(var1);
         }

         WorldClient var3 = Minecraft.getMinecraft().world;
         if (var3 != null) {
            for (EntityPlayer var6 : IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var3.playerEntities$v1_8 : var3.playerEntities$v1_7) {
               if (var1.equals(var6.getGameProfile().getName()) && var6 instanceof IRRCCOICORICIHCHRHIHIHROIRHOCR var7) {
                  var7.lunar$onNameTagUpdate();
               }
            }
         }
      }
   }
}
