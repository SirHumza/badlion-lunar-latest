package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public enum IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   EXPLICIT {
      @Override
      boolean wasEvicted() {
         return false;
      }
   },
   REPLACED {
      @Override
      boolean wasEvicted() {
         return false;
      }
   },
   COLLECTED {
      @Override
      boolean wasEvicted() {
         return true;
      }
   },
   EXPIRED {
      @Override
      boolean wasEvicted() {
         return true;
      }
   },
   SIZE {
      @Override
      boolean wasEvicted() {
         return true;
      }
   };

   IIRHCHHOICHRICOOCRORCCIOOIHOIR() {
   }

   abstract boolean wasEvicted();
}
