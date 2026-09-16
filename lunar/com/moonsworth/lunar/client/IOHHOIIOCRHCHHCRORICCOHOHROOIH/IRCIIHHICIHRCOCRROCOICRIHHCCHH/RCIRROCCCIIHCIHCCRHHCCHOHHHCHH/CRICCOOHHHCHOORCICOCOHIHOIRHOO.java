package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHRIICOIOORCHCOIICOOIHIRHHICRI;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   protected static Optional<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var0, String var1, String var2) {
      HHRIICOIOORCHCOIICOOIHIRHHICRI var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH();

      Set var4 = switch (var0) {
         case GENERAL -> var3.OHOHCHORHIIHCCOIHOHCCICRHHICIR().OHHRCRIOOCIORORHIOHRICRHHORCIH();
         case PERFORMANCE -> var3.OCROCOHRIHRIRHRROHRRCHCORRCCHH().OHHRCRIOOCIORORHIOHRICRHHORCIH();
         case CONTROLS -> var3.IICHHHOHHCOHRCHHRICRHRHCCCIHCR().OHHRCRIOOCIORORHIOHRICRHHORCIH();
         case FEATURE -> {
            Optional var5 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .OHHRCRIOOCIORORHIOHRICRHHORCIH()
               .stream()
               .filter(var1x -> var1x.getId().equals(var2))
               .findFirst();
            if (var5.isPresent()) {
               IHHCHHHCRIHOOCOIOOCRIIICIOROIR var6 = ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var5.get())
                  .IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC);
               if (var6 == null) {
                  throw new IllegalArgumentException("Feature does not have options: " + var2);
               }

               yield var6.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO();
            } else {
               for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 : com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
                  if (var7.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR)) {
                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var8 = var7.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                        HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
                     );
                     if (var8 != null) {
                        for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 : var8.getChildren()) {
                           if (var10.getId().equals(var2)) {
                              IHHCHHHCRIHOOCOIOOCRIIICIOROIR var11 = var10.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                                 HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC
                              );
                              if (var11 == null) {
                                 throw new IllegalArgumentException("Feature does not have options: " + var2);
                              }

                              yield var11.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO();
                           }
                        }
                     }
                  }
               }

               throw new IllegalArgumentException("Feature not found: " + var2);
            }
         }
         case REWIND -> com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HIROIHOHCHRCCRRCROCIIHOCHICCOO()
            .OHHRCRIOOCIORORHIOHRICRHHORCIH();
      };
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4, var1);
   }

   private static Optional<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> HHCCIRHCCCIIRHCROHIORHIRHHIORH(Collection<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> var0, String var1) {
      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var3 : var0) {
         if (!(var3 instanceof ROOCOCCCIRHHHIRIOIHHHHRHIICHHR)) {
            if (var3.getId().equals(var1)) {
               return Optional.of(var3);
            }

            List var4 = var3.getChildren();
            if (var4 != null && !var4.isEmpty()) {
               HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4, var1);
            }
         }
      }

      return Optional.empty();
   }
}
