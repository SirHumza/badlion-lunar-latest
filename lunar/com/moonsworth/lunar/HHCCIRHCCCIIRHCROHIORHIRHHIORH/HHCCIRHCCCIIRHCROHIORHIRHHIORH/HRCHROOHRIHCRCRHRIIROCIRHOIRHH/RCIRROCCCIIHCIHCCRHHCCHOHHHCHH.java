package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import org.jetbrains.annotations.Range;

@com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
   OROORIICIOOOOIHIRHRHOIOCIHRRIO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      version = 6,
      RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         "com/mojang/blaze3d/vertex/BufferBuilder"
      )
   )
)
@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   long bridge$getCapacity();

   long bridge$getBufferAllocatedSize();

   void bridge$resize(@Range(from = 1L, to = Long.MAX_VALUE) long var1);

   void bridge$close();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 24)
   HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$buildOrThrow();

   default boolean OOHCHIOCOOORHOHOCRCOOIICCICIHI() {
      long var1 = this.bridge$getBufferAllocatedSize();
      if (var1 <= 0L) {
         this.bridge$close();
         return false;
      } else {
         this.bridge$resize(var1);
         if (this.bridge$getCapacity() <= 0L) {
            this.bridge$close();
            return false;
         } else {
            return true;
         }
      }
   }
}
