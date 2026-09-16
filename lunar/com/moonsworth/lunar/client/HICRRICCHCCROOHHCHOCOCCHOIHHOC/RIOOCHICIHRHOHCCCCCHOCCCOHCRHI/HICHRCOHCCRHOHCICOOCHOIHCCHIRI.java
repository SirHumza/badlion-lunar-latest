package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.OptionalInt;
import lombok.Generated;

public final class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   public static OptionalInt RHHOHHIICORCIHHICIICCCHIROIOHH = OptionalInt.empty();
   private static boolean HRCRHROCOORCOICHHOIHRIROICRCOH;
   private static boolean HOCHOIIRRRHIICROHICRRRCOIHIOOH;

   public static void OIOOCRIOHRHHIHICRICHHICHOCRCII() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRHCOOHHRHIRCRHHROCRHCHIOIROHH()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isWindowFocused()
            || !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
               .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
               .CIROCOOIIIOOHIHRIRRRCOCOIRICCR()
               .get()) {
            HRCRHROCOORCOICHHOIHRIROICRCOH = false;
            if (!HOCHOIIRRRHIICROHICRRRCOIHIOOH && RHHOHHIICORCIHHICIICCCHIROIOHH.isPresent()) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getGameSettings()
                  .bridge$setFrameRateLimit(RHHOHHIICORCIHHICIICCCHIROIOHH.getAsInt());
               RHHOHHIICORCIHHICIICCCHIROIOHH = OptionalInt.empty();
               HOCHOIIRRRHIICROHICRRRCOIHIOOH = true;
               HRCRHROCOORCOICHHOIHRIROICRCOH = false;
            }
         } else if (!HRCRHROCOORCOICHHOIHRIROICRCOH) {
            RHHOHHIICORCIHHICIICCCHIROIOHH = OptionalInt.of(
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$getFrameRateLimit()
            );
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getGameSettings()
               .bridge$setFrameRateLimit(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                     .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
                     .OCIHRIICOORCRIHROHHCIHHIHHIICR()
                     .get()
               );
            HRCRHROCOORCOICHHOIHRIROICRCOH = true;
            HOCHOIIRRRHIICROHICRRRCOIHIOOH = false;
         }
      }
   }

   @Generated
   private HICHRCOHCCRHOHCICOOCHOIHCCHIRI() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   @Generated
   public static OptionalInt IOCICCRHICIIROIOICRCHOCHIHHOOH() {
      return RHHOHHIICORCIHHICIICCCHIROIOHH;
   }

   @Generated
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OptionalInt var0) {
      RHHOHHIICORCIHHICIICCCHIROIOHH = var0;
   }

   @Generated
   public static boolean IRRIHCHHIOHRIHCOHHHRHROOHOIRRH() {
      return HOCHOIIRRRHIICROHICRRRCOIHIOOH;
   }

   @Generated
   public static void HCIIICCOOORRIIRROCIIHIOHRRHIOI(boolean var0) {
      HOCHOIIRRRHIICROHICRRRCOIHIOOH = var0;
   }
}
