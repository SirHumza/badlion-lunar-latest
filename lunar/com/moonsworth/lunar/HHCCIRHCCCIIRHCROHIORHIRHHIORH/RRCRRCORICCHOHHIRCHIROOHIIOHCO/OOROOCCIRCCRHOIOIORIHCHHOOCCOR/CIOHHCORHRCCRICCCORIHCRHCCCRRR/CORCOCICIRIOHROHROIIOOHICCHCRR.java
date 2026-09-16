package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import java.io.File;
import java.nio.file.Path;
import org.jetbrains.annotations.Nullable;

public interface CORCOCICIRIOHROHROIIOOHICCHCRR extends IRRCCOICORICIHCHRHIHIHROIRHOCR {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getNativeImage();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, @Nullable Path var2) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.bridge$getNativeImage();
      if (var3 != null) {
         if (var2 != null) {
            var3.bridge$writeToFile(var2.resolve(var1 + ".png").toFile());
         } else {
            var3.bridge$writeToFile(new File(var1 + ".png"));
         }
      }
   }
}
