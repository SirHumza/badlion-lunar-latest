package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.RCOCOHHCOOICCICCRCCORORROHRCCC;
import org.jetbrains.annotations.Nullable;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Integer> {
   public static final CRRRICCRROCOHHOHIICIHORCOORRRH CRICOHCIOHIOOCRIHHORCOIHOROCII = new CRRRICCRROCOHHOHIICIHORCOORRRH();

   @Nullable
   public Integer CRRRICCRROCOHHOHIICIHORCOORRRH(RCOCOHHCOOICCICCRCCORORROHRCCC var1) {
      if (!var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC()) {
         return null;
      }

      int var2 = var1.getCursor();
      if (var1.peek() == '-') {
         var1.skip();
      }

      if (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && Character.isDigit(var1.peek())) {
         while (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && Character.isDigit(var1.peek())) {
            var1.skip();
         }

         if (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && var1.peek() != ' ') {
            var1.RIRCCRRRCOROICICCOORORHCHICRCC(var2);
            return null;
         }

         try {
            return Integer.parseInt(var1.getString().substring(var2, var1.getCursor()));
         } catch (NumberFormatException var4) {
            var1.RIRCCRRRCOROICICCOORORHCHICRCC(var2);
            return null;
         }
      } else {
         var1.RIRCCRRRCOROICICCOORORHCHICRCC(var2);
         return null;
      }
   }
}
