package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import lombok.Generated;

public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   byte bridge$getX();

   byte bridge$getY();

   byte bridge$getRot();

   void bridge$setX(byte var1);

   void bridge$setY(byte var1);

   void bridge$setRot(byte var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getDecorationType();

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      GREEN(1),
      BLUE(3);

      private final int legacyId;

      public static IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH fromLegacyId(int var0) {
         for (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
            if (var4.legacyId == var0) {
               return var4;
            }
         }

         return null;
      }

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var3) {
         this.legacyId = var3;
      }
   }
}
