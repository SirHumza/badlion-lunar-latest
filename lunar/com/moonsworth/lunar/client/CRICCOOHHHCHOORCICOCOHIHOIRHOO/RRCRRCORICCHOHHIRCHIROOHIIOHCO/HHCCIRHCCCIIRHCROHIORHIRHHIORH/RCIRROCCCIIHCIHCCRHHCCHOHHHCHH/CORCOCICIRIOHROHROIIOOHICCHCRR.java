package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class CORCOCICIRIOHROHROIIOOHICCHCRR implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Override
   public boolean isVanilla() {
      return true;
   }

   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(@NotNull HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 = var1.bridge$getHeldItem();
      return var2 == null
         || var2.bridge$isEmpty()
         || !var2.bridge$getItem().bridge$isItemSword()
            && !var2.bridge$getItem().bridge$isAxe()
            && !var2.bridge$getItem().bridge$isItemPickaxe()
            && !var2.bridge$getItem().bridge$isItemShovel()
            && !var2.bridge$getItem().bridge$isTrident()
            && !var2.bridge$getItem().bridge$isSpear();
   }

   @Override
   public float HRCHROOHRIHCRCRHRIIROCIRHOIRHH(@NotNull HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return var1.bridge$getAttackStrengthScale();
   }

   @Nullable
   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR OOROOCCIRCCRHOIOIORIHCHHOOCCOR(@NotNull HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return null;
   }
}
