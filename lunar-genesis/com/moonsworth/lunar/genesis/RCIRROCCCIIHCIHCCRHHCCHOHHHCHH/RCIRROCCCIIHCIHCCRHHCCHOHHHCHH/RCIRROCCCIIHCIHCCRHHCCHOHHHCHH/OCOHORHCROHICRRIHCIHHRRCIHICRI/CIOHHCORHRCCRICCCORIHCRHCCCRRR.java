package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class CIOHHCORHRCCRICCCORIHCRHCCCRRR {
   final String CCICCICIRCRRICCIIORORCOROOIIOH;
   final int IOOCIRRRROCCICHCHIOORRHHROIIRI;

   private CIOHHCORHRCCRICCCORIHCRHCCCRRR(String var1, int var2) {
      this.CCICCICIRCRRICCIIORORCOROOIIOH = var1;
      this.IOOCIRRRROCCICHCHIOORRHHROIIRI = var2;
   }

   static CIOHHCORHRCCRICCCORIHCRHCCCRRR ORRIOOIROHHROIRCIIHIOOCIOOIIOO(String var0) {
      if (var0.length() == 0) {
         throw new NumberFormatException("empty string");
      }

      char var3 = var0.charAt(0);
      String var1;
      byte var2;
      if (var0.startsWith("0x") || var0.startsWith("0X")) {
         var1 = var0.substring(2);
         var2 = 16;
      } else if (var3 == '#') {
         var1 = var0.substring(1);
         var2 = 16;
      } else if (var3 == '0' && var0.length() > 1) {
         var1 = var0.substring(1);
         var2 = 8;
      } else {
         var1 = var0;
         var2 = 10;
      }

      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1, var2);
   }
}
