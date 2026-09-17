package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.lib.adventure.text.Component;

public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Override
   RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$getBlockPos();

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBlockType();

   @Override
   default Component bridge$getTypeName() {
      return this.bridge$getBlockType().bridge$getName();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 8)
   default boolean bridge$canTurbo() {
      return true;
   }

   @Override
   default double bridge$getPosX() {
      return this.bridge$getBlockPos().bridge$getX() + 0.5;
   }

   @Override
   default double bridge$getPosY() {
      return this.bridge$getBlockPos().bridge$getY() + 0.5;
   }

   @Override
   default double bridge$getPosZ() {
      return this.bridge$getBlockPos().bridge$getZ() + 0.5;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 8)
   default void bridge$triggerRebuild(boolean var1) {
      throw new CRRRICCRROCOHHOHIICIHORCOORRRH();
   }
}
