package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Iterator;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Override
   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonElement var1) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1.getAsJsonObject(), null);
   }

   protected void IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var1, Predicate<@Nullable String> var2) {
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this, var1
      );
      Iterator var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OHHRCRIOOCIORORHIOHRICRHHORCIH()
         .iterator();

      while (true) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4;
         com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var5;
         JsonObject var8;
         while (true) {
            if (!var3.hasNext()) {
               return;
            }

            var4 = (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3.next();
            var5 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IOCHHHIIRIHOIRHHICHICCRIHOIOHC);
            if (var5 != null) {
               String var6 = var4.getId();
               String var7 = com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(
                  var4
               );
               if (var1.has(var7)) {
                  var8 = var1.getAsJsonObject(var7);
                  break;
               }

               if (var1.has(var6)) {
                  var8 = var1.getAsJsonObject(var6);
                  break;
               }
            }
         }

         if (var8 != null) {
            if (var8.has("enabled")) {
               if (var2 == null) {
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var4,
                     com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CLIENT_REMOTE,
                     var8.get("enabled").getAsBoolean()
                  );
               } else {
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var8.get("enabled").getAsBoolean());
                  var4.updateEnabled();
               }
            }

            JsonObject var9 = !var8.has("properties") ? null : var8.getAsJsonObject("properties");
            if (var9 != null) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var10 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                  HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
               );
               if (var10 != null) {
                  var10.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                     var4x -> {
                        com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var5x = var4x.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.IOCHHHIIRIHOIRHHICHICCRIHOIOHC
                        );
                        if (var5x == null) {
                           return false;
                        }

                        String var6x = var4x.getId();
                        com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7x = var5x.CCHHHHIHIRHHICOIORIIIOIICHHICH();
                        if (var7x
                              == com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CLIENT_REMOTE
                           || (var6x = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6x, var4x, var9)) != null) {
                           HCHRIROHHHCORIOCROOCHRCIOROOCI var8x = var4x.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
                                 HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                              )
                              .flatMap(
                                 com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR::OCIOICIOHHHIRIOCIHCHHCCHRRRIHI
                              )
                              .orElse(null);
                           if (var8x != null) {
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                 .RCRRCCORORHORHOOIOIRCROCIROOCR()
                                 .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, var6x, var4x, var8x, var5x, var2);
                           }

                           var4.updateEnabled();
                        }

                        return true;
                     }
                  );
               }

               IHHCHHHCRIHOOCOIOOCRIIICIOROIR var11 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC);
               if (var11 != null) {
                  for (HCHRIROHHHCORIOCROOCHRCIOROOCI var13 : var11.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO()) {
                     String var14 = var13.getId();
                     com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var15 = var13.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                        com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR
                     );
                     if (var15 != null
                        && !var13.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
                           com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRROHCRHORRICIOHCIIHHHORHHHHHH
                        )) {
                        com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var16 = var15.CCHHHHIHIRHHICOIORIIIOIICHHICH();
                        if (var16
                              == com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CLIENT_REMOTE
                           || (var14 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14, var13, var9)) != null) {
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .RCRRCCORORHORHOOIOIRCROCIROOCR()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, var14, var13, var13, var15, var2);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Nullable
   private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, JsonObject var3
   ) {
      if (var3.has(var1)) {
         return var1;
      }

      String var4 = com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2, var3::has
      );
      return !var1.equals(var4) && var3.has(var4) ? var4 : null;
   }

   @Nullable
   private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2, JsonObject var3) {
      if (var3.has(var1)) {
         return var1;
      }

      String var4 = com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var2, var3::has
      );
      return !var1.equals(var4) && var3.has(var4) ? var4 : null;
   }
}
