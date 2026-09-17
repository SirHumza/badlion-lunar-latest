package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.RCOCOHHCOOICCICCRCCORORROHRCCC;
import org.jetbrains.annotations.Nullable;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<String> {
   public static final HRCHROOHRIHCRCRHRIIROCIRHOIRHH CICHOCRIRRRRIHOIHRHIIRHHHHRCRH = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();

   @Nullable
   public String HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCOCOHHCOOICCICCRCCORORROHRCCC var1) {
      if (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && var1.peek() != ' ') {
         int var2 = var1.getCursor();

         while (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && var1.peek() != ' ') {
            var1.skip();
         }

         return var1.getString().substring(var2, var1.getCursor());
      } else {
         return null;
      }
   }
}
