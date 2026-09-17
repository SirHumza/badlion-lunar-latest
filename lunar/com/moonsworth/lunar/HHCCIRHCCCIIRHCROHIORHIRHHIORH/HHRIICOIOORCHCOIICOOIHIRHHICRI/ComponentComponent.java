package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   String bridge$getPlayerName();

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getPlayerComponentBridge();

   Component bridge$getPlayerComponent();

   default Component bridge$getScoreComponent(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      return Component.text(this.bridge$getScorePoints()).color(NamedTextColor.RED);
   }

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getScoreComponentBridge(
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   );

   int bridge$getScorePoints();

   void bridge$setScorePoints(int var1);
}
