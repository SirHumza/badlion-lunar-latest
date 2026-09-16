package com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.vecmath.Matrix4f;
import mchorse.emoticons.morph.MorphConfiguration;

public class CORCOCICIRIOHROHROIIOOHICCHCRR {
   private final Map<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, HHCCIRHCCCIIRHCROHIORHIRHHIORH> CCRCHROOOOORRICRHRRCHRHHHICHRR = new HashMap<>();
   private final MorphConfiguration HIRICCCORICRRIRHRORRHCRRHHIIOO;

   public CORCOCICIRIOHROHROIIOOHICCHCRR(MorphConfiguration var1) {
      this.HIRICCCORICRRIRHRORRHCRRHHIIOO = var1;
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(Consumer<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var1) {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 : this.CCRCHROOOOORRICRHRRCHRHHHICHRR.values()) {
         var3.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
      }
   }

   public boolean OIRCHHRRCCROHIOROCRCCIIIHHOCHC() {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 : this.CCRCHROOOOORRICRHRRCHRHHHICHRR.values()) {
         if (var2.OIRCHHRRCCROHIOROCRCCIIIHHOCHC()) {
            return true;
         }
      }

      return false;
   }

   public void update(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .IHHROCIRCIHRHIIRCCRIHCORCCIROC()
         .get()) {
         this.CCRCHROOOOORRICRHRRCHRHHHICHRR.clear();
      } else {
         List var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HCCICHCRRIICICCHCIRCRRIIRROHHC()
            .HRHIHIRHRCHHRORRRCORHOCIRHRIOR(var1.bridge$getUniqueID());
         if (var2 != null && !var2.isEmpty()) {
            List var3 = var2.stream()
               .map(
                  com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO::OOICHRIOOOOIOHOIHOIRIRROCHRIOO
               )
               .toList();
            List var4 = var2.stream()
               .map(
                  com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO::OOICHRIOOOOIOHOIHOIRIRROCHRIOO
               )
               .toList();
            this.CCRCHROOOOORRICRHRRCHRHHHICHRR.entrySet().removeIf(var1x -> {
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2x = var1x.getKey();
               if (!var2x.RCIIIRRHHHHRHRIRHHROIRICHIHROC().canShowCosmetic()) {
                  return true;
               }

               for (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4x : var3) {
                  if (var4x == var2x) {
                     return false;
                  }
               }

               return true;
            });

            for (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var4) {
               if (var6.RCIIIRRHHHHRHRIRHHROIRICHIHROC().canShowCosmetic()) {
                  int var7 = var6.ROICHIIIIOCIOCHRCHOIRORIHCCIRI().getId();
                  CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = (CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HCCICHCRRIICICCHCIRCRRIIRROHHC()
                     .HROIIROOCOIICCOIHCRORCHOIHHCIH()
                     .get(var7);
                  if (var8 != null) {
                     this.CCRCHROOOOORRICRHRRCHRHHHICHRR
                        .computeIfAbsent(
                           var6,
                           var2x -> new HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.HIRICCCORICRRIRHRORRHCRRHHIIOO, var8.morph, var8.HOCOIHORROICCCRORICHCRCCOOCOOO)
                        )
                        .update(var1);
                  }
               }
            }
         } else {
            this.CCRCHROOOOORRICRHRRCHRHHHICHRR.clear();
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      Matrix4f var2,
      com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      float var4
   ) {
      this.CORCOCICIRIOHROHROIIOOHICCHCRR(
         var4x -> {
            Matrix4f var5 = new Matrix4f(var2);
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .RCRHICHHOOHCRHHCCCHCHIIRRHHRRH()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1, var3, var4x, var4);
         }
      );
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String morph;
      private final int HOCOIHORROICCCRORICHCRCCOOCOOO;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2) {
         this.morph = var1;
         this.HOCOIHORROICCCRORICHCRCCOOCOOO = var2;
      }

      public String OORRIHOOCIIOHROHCIIRCROOHIIRCH() {
         return this.morph;
      }

      public int COCHRHOIROOOHHROCCIICHCOCOCCHH() {
         return this.HOCOIHORROICCCRORICHCRCCOOCOOO;
      }
   }
}
