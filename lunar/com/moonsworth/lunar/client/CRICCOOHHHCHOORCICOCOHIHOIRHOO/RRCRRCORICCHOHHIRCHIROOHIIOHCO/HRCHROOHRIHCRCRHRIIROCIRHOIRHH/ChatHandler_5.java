package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RRORCOIRRIICOOICOIOCORHORCHCOC;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.HashMap;
import java.util.Map;

class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final Map<Component, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHHROHOOOHOOCRIOIORIIICOORCCIH = new HashMap<>();
   private Component RORIOHRHOOOOHOHRRRRIIOHORICCII;
   private int ORHOHCRHIRCHCHROHIHCHHRIRCCORC;

   public void clear() {
      this.RORIOHRHOOOOHOHRRRRIIOHORICCII = null;
      this.ORHOHCRHIRCHCHROHIHCHHRIRCCORC = 0;
      this.OHHROHOOOHOOCRIOIORIIICOORCCIH.clear();
   }

   protected void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      Component var3 = var1.OIOORCCOCHRRIRRORRICOCOCROICII();
      int var4 = var1.COIHCRRRROOOIOOIHRHHIOIHOHOROO();
      long var5 = var2.HHHCRIHOCOOOOIRCRROOCICCCHHCRR().get() * 1000;
      RRORCOIRRIICOOICOIOCORHORCHCOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.OHHROHOOOHOOCRIOIORIIICOORCCIH, var2x -> var2x.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var5));
      if (var2.HIIOOHIHHHRCICIHRIRORRRIIICHIH().get() || var2.HIRCCCOHCCRIIIHRHRRIHCIRCOHCRO().get()) {
         String var7 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var3);
         if (var2.HIIOOHIHHHRCICIHRIRORRRIIICHIH().get() && var7.isEmpty()) {
            return;
         }

         if (var2.HIRCCCOHCCRIIIHRHRRIHCIRCOHCRO().get() && this.ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(var7)) {
            return;
         }
      }

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = this.OHHROHOOOHOOCRIOIORIIICOORCCIH.get(var3);
      if (var3.equals(this.RORIOHRHOOOOHOHRRRRIIOHORICCII)) {
         int var11;
         if (var10 != null) {
            this.ORHOHCRHIRCHCHROHIHCHHRIRCCORC = var11 = var10.CCHORHIOORICCIRIHRIIHIICORIORO(var4);
         } else {
            var11 = ++this.ORHOHCRHIRCHCHROHIHCHHRIRCCORC;
         }

         Component var12 = var3.append(Component.text(" [x" + var11 + "]").style(Style.empty().color(NamedTextColor.GRAY)));
         var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var12);
         var1.RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(true);
      } else {
         this.RORIOHRHOOOOHOHRRRRIIOHORICCII = var3;
         this.ORHOHCRHIRCHCHROHIHCHHRIRCCORC = 1;
         if (var2.COIHORICOIRRORROOHOHRCIORRRRII().get()) {
            if (var10 != null) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getGuiIngame()
                  .bridge$getChatGUI()
                  .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var10.RICIHRHIOIHIORCHCHOROOHHRIOIHC);
               int var8 = var10.CCHORHIOORICCIRIHRIIHIICORIORO(var4) + (this.ORHOHCRHIRCHCHROHIHCHHRIRCCORC - 1);
               Component var9 = var3.append(Component.text(" [x" + var8 + "]").style(Style.empty().color(NamedTextColor.GRAY)));
               var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var9);
               this.OHHROHOOOHOOCRIOIORIIICOORCCIH.put(var3, var10);
            } else {
               this.OHHROHOOOHOOCRIOIORIIICOORCCIH.put(var3, new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4));
            }
         }
      }
   }

   private boolean ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(String var1) {
      char var2 = ' ';

      for (char var6 : var1.toCharArray()) {
         if (var2 == ' ') {
            if (var6 != '-' && var6 != 9644) {
               return false;
            }

            var2 = var6;
         }

         if (var6 != var2) {
            return false;
         }
      }

      return true;
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private int stackSize;
      private long timestamp = System.currentTimeMillis();
      private int RICIHRHIOIHIORCHCHOROOHHRIOIHC;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
         this.RICIHRHIOIHIORCHCHOROOHHRIOIHC = var1;
         this.stackSize = 1;
      }

      public int CCHORHIOORICCIRIHRIIHIICORIORO(int var1) {
         this.timestamp = System.currentTimeMillis();
         this.RICIHRHIOIHIORCHCHOROOHHRIOIHC = var1;
         return ++this.stackSize;
      }

      public boolean OHHRIOHROOIHOROCIRHCHORIHRRRRI(long var1) {
         return System.currentTimeMillis() > this.timestamp + var1;
      }
   }
}
