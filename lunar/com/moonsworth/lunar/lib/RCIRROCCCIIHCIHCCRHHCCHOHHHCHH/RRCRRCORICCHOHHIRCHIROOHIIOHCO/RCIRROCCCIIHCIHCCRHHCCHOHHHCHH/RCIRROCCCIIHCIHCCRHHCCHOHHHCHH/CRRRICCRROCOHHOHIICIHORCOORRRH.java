package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.Arrays;

abstract class CRRRICCRROCOHHOHIICIHORCOORRRH<T> extends ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<T> {
   private static final long RORHIIOOHIHCICIOHOIIRICHHORIII = 1L;
   protected final boolean CIOHRIHCRHRCCCIIIIIRICRIORCIRI;

   protected CRRRICCRROCOHHOHIICIHORCOORRRH(Class<T> var1) {
      super(var1);
      this.CIOHRIHCRHRCCCIIIIIRICRIORCIRI = true;
   }

   protected CRRRICCRROCOHHOHIICIHORCOORRRH(Class<T> var1, Boolean var2) {
      super(var1);
      this.CIOHRIHCRHRCCCIIIIIRICRIORCIRI = !Boolean.FALSE.equals(var2);
   }

   protected CRRRICCRROCOHHOHIICIHORCOORRRH(CRRRICCRROCOHHOHIICIHORCOORRRH<T> var1) {
      super(var1);
      this.CIOHRIHCRHRCCCIIIIIRICRIORCIRI = var1.CIOHRIHCRHRCCCIIIIIRICRIORCIRI;
   }

   protected CRRRICCRROCOHHOHIICIHORCOORRRH(CRRRICCRROCOHHOHIICIHORCOORRRH<T> var1, Boolean var2) {
      super(var1);
      this.CIOHRIHCRHRCCCIIIIIRICRIORCIRI = !Boolean.FALSE.equals(var2);
   }

   protected abstract CRRRICCRROCOHHOHIICIHORCOORRRH<T> RCOCOHHCOOICCICCRCCORORROHRCCC(Boolean var1);

   protected boolean isLenient() {
      return this.CIOHRIHCRHRCCCIIIIIRICRIORCIRI;
   }

   protected T RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      String var3
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this._checkFromStringCoercion(
         var2, var3
      );
      switch (var4) {
         case AsEmpty:
            return (T)this.getEmptyValue(var2);
         case TryConvert:
         case AsNull:
         default:
            return !this.CIOHRIHCRHRCCCIIIIIRICRIORCIRI ? this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2, OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING) : null;
      }
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH logicalType() {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.DateTime;
   }

   @Override
   public Object deserializeWithType(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3
   ) {
      return var3.IORRORCRRHRRORHIRHRROHCRRIHRII(var1, var2);
   }

   protected boolean RIROOHCHCHIHCOHOICHOCRHCHHOIIC(String var1) {
      return this._isIntNumber(var1)
         && com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.IOHHOIIOCRHCHHCRORICCOHOHROOIH(
            var1, var1.charAt(0) == '-'
         );
   }

   protected <BOGUS> BOGUS RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var2,
      String var3
   ) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var2, "Expected %s for '%s' of %s value", var2.name(), var3, this.handledType().getName());
      return null;
   }

   protected <BOGUS> BOGUS RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      OHHRIOHROOIHOROCIRHCHORIHRRRRI... var3
   ) {
      return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.handledType(),
         "Unexpected token (%s), expected one of %s for %s value",
         var1.RCICCOICCHHORCCIROCIIRHHIIICOH(),
         Arrays.asList(var3).toString(),
         this.handledType().getName()
      );
   }

   protected <R> R RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      DateTimeException var2,
      String var3
   ) {
      try {
         return (R)var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.handledType(), var3, "Failed to deserialize %s: (%s) %s", this.handledType().getName(), var2.getClass().getName(), var2.getMessage()
         );
      } catch (IHHCHHHCRIHOOCOIOOCRIIICIOROIR var5) {
         var5.initCause(var2);
         throw var5;
      } catch (IOException var6) {
         if (null == var6.getCause()) {
            var6.initCause(var2);
         }

         throw IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
      }
   }

   protected <R> R RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      String var3,
      Object... var4
   ) {
      try {
         return (R)var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.handledType(), var2.RCICCOICCHHORCCIROCIIRHHIIICOH(), var2, var3, var4);
      } catch (IHHCHHHCRIHOOCOIOOCRIIICIOROIR var6) {
         throw var6;
      } catch (IOException var7) {
         throw IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7);
      }
   }

   protected <R> R RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      OHHRIOHROOIHOROCIRHCHORIHRRRRI... var3
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1,
         var2,
         "Unexpected token (%s), expected one of %s for %s value",
         var2.COCHOCOHRICCHIIIHIOORCIIRROOHI(),
         Arrays.asList(var3),
         this.handledType().getName()
      );
   }

   protected T RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var3
   ) {
      return (T)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.handledType(),
         var3,
         var1,
         "Cannot deserialize instance of %s out of %s token: not allowed because 'strict' mode set for property or type (enable 'lenient' handling to allow)",
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.ROIHROCROORRCCOIRRIHHORCROOORO(
            this.handledType()
         ),
         var1.COCHOCOHRICCHIIIHIOORCIIRROOHI()
      );
   }

   protected DateTimeException RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DateTimeException var1) {
      while (true) {
         Throwable var2 = var1.getCause();
         if (var2 == null || !(var2 instanceof DateTimeException)) {
            return var1;
         }

         var1 = (DateTimeException)var2;
      }
   }
}
