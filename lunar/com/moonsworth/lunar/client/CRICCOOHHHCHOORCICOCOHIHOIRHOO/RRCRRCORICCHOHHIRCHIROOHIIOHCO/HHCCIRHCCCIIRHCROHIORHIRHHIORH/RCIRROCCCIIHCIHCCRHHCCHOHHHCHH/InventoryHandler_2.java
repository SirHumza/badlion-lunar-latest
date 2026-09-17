package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class IIHRRHORCRCROCHHOHORCHCROCIHRO extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Override
   protected boolean IIHRRHORCRCROCHHOHORCHCROCIHRO(@NotNull IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return var1.bridge$getContainerItems() != null
         || var1.bridge$getItem() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2
            && var2.bridge$getBlockFromItem().orElse(null) instanceof OHHRIOHROOIHOROCIRHCHORIHRRRRI
         || var1.bridge$getItem().bridge$isBundle();
   }

   @Override
   public int OCIOOOOHCHCRHCICCCIHOOOORHIRHR() {
      return 0;
   }

   @Override
   public float HRCHROOHRIHCRCRHRIIROCIRHOIRHH(@NotNull HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      List var2 = this.HIROCOCHORRCHIOIIIOIIRHOIROOCH().bridge$getContainerItems();
      if (var2 == null) {
         return 0.0F;
      }

      boolean var3 = this.HIROCOCHORRCHIOIIIOIIRHOIROOCH().bridge$getItem().bridge$isBundle();
      float var4 = var3 ? 64.0F : 27.0F;
      float var5 = 0.0F;

      for (int var6 = 0; var6 < var2.size(); var6++) {
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var7 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var2.get(var6);
         if (var7 != null && !var7.bridge$isEmpty()) {
            int var8 = var7.bridge$getMaxStackSize();
            if (var8 <= 0) {
               var8 = 64;
            }

            var5 += var3 ? var7.bridge$getStackSize() * (64.0F / var8) : (float)var7.bridge$getStackSize() / var8;
         }
      }

      return Math.min(1.0F, var5 / var4);
   }

   @Override
   public boolean CORCOCICIRIOHROHROIIOOHICCHCRR(@NotNull HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return this.HIROCOCHORRCHIOIIIOIIRHOIROOCH() != null;
   }

   @Nullable
   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR OOROOCCIRCCRHOIOIORIHCHHOOCCOR(@NotNull HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return this.HIROCOCHORRCHIOIIIOIIRHOIROOCH();
   }
}
