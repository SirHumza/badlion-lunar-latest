package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends HHCCIRHCCCIIRHCROHIORHIRHHIORH<LocalDateTime> {
   private static final long HRRICCIHRRIOICOOROCROCRHCCCHOC = 1L;
   private static final DateTimeFormatter HHHHCRRHROHIIIRCCROCHHOORCOHIH = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
   public static final HRCHROOHRIHCRCRHRIIROCIRHOIRHH HHOCCHRIICOHHHIOIHICHCIROIRROH = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();

   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
      this(HHHHCRRHROHIIIRCCROCHHOORCOHIH);
   }

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(DateTimeFormatter var1) {
      super(LocalDateTime.class, var1);
   }

   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, Boolean var2) {
      super(var1, var2);
   }

   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH CRICCOOHHHCHOORCICOCOHIHOIRHOO(DateTimeFormatter var1) {
      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
   }

   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH CIIHHCHIRCRRIHOIOCCCROHOIOCCII(Boolean var1) {
      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(this, var1);
   }

   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return this;
   }

   public LocalDateTime RHHIOCHRCICCHOHCIHOOHOIHCCHRCO(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (var1.CRCCCCCIOOCRIIOHIHOORRCRHOCORR(6)) {
         return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1, var2, var1.getText());
      }

      if (var1.OCHOCCOIOCOHOHOOIOHOCOHRRRCRCI()) {
         return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1, var2, var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, this.handledType()));
      }

      if (var1.CHIOIROOIOCOCCORRHCIOOORHCRHHR()) {
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var3 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
         if (var3 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
            return null;
         }

         if ((var3 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING || var3 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_EMBEDDED_OBJECT)
            && var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
            )) {
            LocalDateTime var14 = this.RHHIOCHRCICCHOHCIHOOHOIHCCHRCO(var1, var2);
            if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC() != OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
               this.handleMissingEndArrayForSingle(var1, var2);
            }

            return var14;
         }

         if (var3 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT) {
            int var5 = var1.HHHRCIIIIHOCHICIORORCCOCHOIHIO();
            int var6 = var1.CCIHIRRIHCOICHHHIHCHHHHCHRIICR(-1);
            int var7 = var1.CCIHIRRIHCOICHHHIHCHHHHCHRIICR(-1);
            int var8 = var1.CCIHIRRIHCOICHHHIHCHHHHCHRIICR(-1);
            int var9 = var1.CCIHIRRIHCOICHHHIHCHHHHCHRIICR(-1);
            var3 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
            LocalDateTime var4;
            if (var3 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
               var4 = LocalDateTime.of(var5, var6, var7, var8, var9);
            } else {
               int var10 = var1.HHHRCIIIIHOCHICIORORCCOCHOIHIO();
               var3 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
               if (var3 == OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
                  var4 = LocalDateTime.of(var5, var6, var7, var8, var9, var10);
               } else {
                  int var11 = var1.HHHRCIIIIHOCHICIORORCCOCHOIHIO();
                  if (var11 < 1000
                     && !var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
                        com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.READ_DATE_TIMESTAMPS_AS_NANOSECONDS
                     )) {
                     var11 *= 1000000;
                  }

                  if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC() != OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
                     throw var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.handledType(), OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY, "Expected array to end");
                  }

                  var4 = LocalDateTime.of(var5, var6, var7, var8, var9, var10, var11);
               }
            }

            return var4;
         }

         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.handledType(), "Unexpected token (%s) within Array, expected VALUE_NUMBER_INT", new Object[]{var3});
      }

      if (var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_EMBEDDED_OBJECT)) {
         return (LocalDateTime)var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR();
      }

      if (var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NUMBER_INT)) {
         this.HIHCCHCCOCOHRICOICHRCOIHIIRIHO(var1, var2);
      }

      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1, "Expected array or string.");
   }

   protected LocalDateTime HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      String var3
   ) {
      String var4 = var3.trim();
      if (var4.length() == 0) {
         return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2, var4);
      }

      try {
         if (this.RORIIOOOOHCRRIHIRICCRIHHROHRRI != HHHHCRRHROHIIIRCCROCHHOORCOHIH || var4.length() <= 10 || var4.charAt(10) != 'T' || !var4.endsWith("Z")) {
            return LocalDateTime.parse(var4, this.RORIIOOOOHCRRIHIRICCRIHHROHRRI);
         }

         if (this.isLenient()) {
            return LocalDateTime.parse(var4.substring(0, var4.length() - 1), this.RORIIOOOOHCRRIHIRICCRIHHROHRRI);
         }

         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var5 = this.getValueType(var2);
         return (LocalDateTime)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var5.RRICIOOORRIORHHICIRCIOCHRHRCHH(),
            var4,
            "Should not contain offset when 'strict' mode set for property or type (enable 'lenient' handling to allow)"
         );
      } catch (DateTimeException var6) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var6, var4);
      }
   }
}
