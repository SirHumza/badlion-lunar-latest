package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI;

import it.unimi.dsi.fastutil.ints.IntList;
import lombok.Generated;

public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   default void bridge$setupBufferState() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   default IntList bridge$getTexture0Elements() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   default int bridge$getVertexSize() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   default int OIHRRRRICIHIHHHICRROIORRRCOOHC() {
      return this.bridge$getVertexSize() / 4;
   }

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      BYTE(1),
      SHORT(2),
      INT(4);

      private final int bytes;

      public static IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH least(int var0) {
         if ((var0 & -65536) != 0) {
            return INT;
         } else {
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion()
                  .ORHIOICIOCRRHOOCOHRORIHICHRCRR(
                     com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRRHHHCIRHIRIRHHOOIHOHRIIHRIHR
                  )
               ? SHORT
               : ((var0 & 0xFF00) != 0 ? SHORT : BYTE);
         }
      }

      @Generated
      public int getBytes() {
         return this.bytes;
      }

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var3) {
         this.bytes = var3;
      }
   }
}
