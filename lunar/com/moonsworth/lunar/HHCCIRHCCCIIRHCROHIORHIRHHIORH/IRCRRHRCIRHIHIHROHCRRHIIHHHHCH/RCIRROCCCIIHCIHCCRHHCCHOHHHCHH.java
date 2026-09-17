package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;

public interface IRRCCOICORICIHCHRHIHIHROIRHOCR {
   default GameProfile RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(GameProfile var1, PropertyMap var2) {
      var1.getProperties().putAll(var2);
      return var1;
   }

   static IRRCCOICORICIHCHRHIHIHROIRHOCR RCIHIOICIIICOHIORIRCIIHRRROCIC() {
      return new IRRCCOICORICIHCHRHIHIHROIRHOCR() {
         @Override
         public GameProfile RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(GameProfile var1, PropertyMap var2) {
            return IRRCCOICORICIHCHRHIHIHROIRHOCR.super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
         }
      };
   }
}
