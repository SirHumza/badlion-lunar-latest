package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.RCOCOHHCOOICCICCRCCORORROHRCCC;
import org.jetbrains.annotations.Nullable;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Double> {
   public static final IRCIIHHICIHRCOCRROCOICRIHHCCHH CRHCCIHHIIRIRRCCCCIHIRRCCOOIOI = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();

   @Nullable
   public Double IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCOCOHHCOOICCICCRCCORORROHRCCC var1) {
      if (!var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC()) {
         return null;
      }

      int var2 = var1.getCursor();
      if (var1.peek() == '-') {
         var1.skip();
      }

      boolean var3 = false;

      while (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && Character.isDigit(var1.peek())) {
         var3 = true;
         var1.skip();
      }

      if (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && var1.peek() == '.') {
         var1.skip();

         while (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && Character.isDigit(var1.peek())) {
            var3 = true;
            var1.skip();
         }
      }

      if (!var3) {
         var1.RIRCCRRRCOROICICCOORORHCHICRCC(var2);
         return null;
      }

      if (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && var1.peek() != ' ') {
         var1.RIRCCRRRCOROICICCOORORHCHICRCC(var2);
         return null;
      }

      try {
         return Double.parseDouble(var1.getString().substring(var2, var1.getCursor()));
      } catch (NumberFormatException var5) {
         var1.RIRCCRRRCOROICICCOORORHCHICRCC(var2);
         return null;
      }
   }
}
