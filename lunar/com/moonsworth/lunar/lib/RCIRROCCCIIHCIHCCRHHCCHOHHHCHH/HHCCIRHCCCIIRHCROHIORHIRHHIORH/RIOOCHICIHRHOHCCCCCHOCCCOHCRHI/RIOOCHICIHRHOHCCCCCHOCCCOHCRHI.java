package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends IHHCHHHCRIHOOCOIOOCRIIICIOROIR {
   private static final long OORCOCOOOCHRRRHOHOOCCCOCOCRHCO = 1L;
   protected final Constructor<?> HRIHOHHIHCCCRRROOHRHCROIRRIORR;
   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHHOCOCRRCHRORCCIRHHOOHRRCHIHI;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, Constructor<?> var2, RHOCHHIRRCHHHOHOIRROIROHHHIHIO var3, RHOCHHIRRCHHHOHOIRROIROHHHIHIO[] var4
   ) {
      super(var1, var3, var4);
      if (var2 == null) {
         throw new IllegalArgumentException("Null constructor not allowed");
      }

      this.HRIHOHHIHCCCRRROOHRHCROIRRIORR = var2;
   }

   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      super(null, null, null);
      this.HRIHOHHIHCCCRRROOHRHCROIRRIORR = null;
      this.OHHOCOCRRCHRORCCIRHHOOHRRCHIHI = var1;
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         this.IRIOIRIROIIOCRCIRHICCOCIOOHICO, this.HRIHOHHIHCCCRRROOHRHCROIRRIORR, var1, this.ORIRIOIRORIHCRCCRRCCOHIHROORCR
      );
   }

   public Constructor<?> CRRRHCCRCHIHOIIHIOCROOHCIIOIHO() {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR;
   }

   @Override
   public int getModifiers() {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getModifiers();
   }

   @Override
   public String getName() {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getName();
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI getType() {
      return this.IRIOIRIROIIOCRCIRHICCOCIOOHICO.IIHRRHORCRCROCHHOHORCHCROCIHRO(this.getRawType());
   }

   @Override
   public Class<?> getRawType() {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getDeclaringClass();
   }

   @Override
   public int CICHIHICOCHIIOCICRICIRRRIOCROO() {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getParameterCount();
   }

   @Override
   public Class<?> OICOOCHOORCCCIIIORHCRIRHOIIORI(int var1) {
      Class[] var2 = this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getParameterTypes();
      return var1 >= var2.length ? null : var2[var1];
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI RCICCRIHIORCCCRCCORIROCOIIORHC(
      int var1
   ) {
      Type[] var2 = this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getGenericParameterTypes();
      return var1 >= var2.length ? null : this.IRIOIRIROIIOCRCIRHICCOCIOOHICO.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2[var1]);
   }

   @Deprecated
   @Override
   public Type CCHICRHRHOIHHRORCROCHHROIHOCHO(int var1) {
      Type[] var2 = this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getGenericParameterTypes();
      return var1 >= var2.length ? null : var2[var1];
   }

   @Override
   public final Object call() {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.newInstance((Object[])null);
   }

   @Override
   public final Object call(Object[] var1) {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.newInstance(var1);
   }

   @Override
   public final Object OHRCIORHOCHOORCRHHOHRRRCCOICCO(Object var1) {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.newInstance(var1);
   }

   @Override
   public Class<?> getDeclaringClass() {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getDeclaringClass();
   }

   @Override
   public Member getMember() {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR;
   }

   @Override
   public void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(Object var1, Object var2) {
      throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + this.getDeclaringClass().getName());
   }

   @Override
   public Object getValue(Object var1) {
      throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + this.getDeclaringClass().getName());
   }

   @Override
   public String toString() {
      int var1 = this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getParameterCount();
      return String.format(
         "[constructor for %s (%d arg%s), annotations: %s",
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.ROIHROCROORRCCOIRRIHHORCROOORO(
            this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getDeclaringClass()
         ),
         var1,
         var1 == 1 ? "" : "s",
         this.IOCOHHCOHOCOIHOCHIIRORCIRCCCIC
      );
   }

   @Override
   public int hashCode() {
      return this.HRIHOHHIHCCCRRROOHRHCROIRRIORR.getName().hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
         var1, this.getClass()
      )) {
         return false;
      }

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1;
      return var2.HRIHOHHIHCCCRRROOHRHCROIRRIORR == null
         ? this.HRIHOHHIHCCCRRROOHRHCROIRRIORR == null
         : var2.HRIHOHHIHCCCRRROOHRHCROIRRIORR.equals(this.HRIHOHHIHCCCRRROOHRHCROIRRIORR);
   }

   Object writeReplace() {
      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRIHOHHIHCCCRRROOHRHCROIRRIORR));
   }

   Object readResolve() {
      Class var1 = this.OHHOCOCRRCHRORCCIRHHOOHRRCHIHI.clazz;

      try {
         Constructor var2 = var1.getDeclaredConstructor(this.OHHOCOCRRCHRORCCIRHHOOHRRCHIHI.HORIICIRCIHOCHHOHRIHCHOHOIRCOC);
         if (!var2.isAccessible()) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2, false
            );
         }

         return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(null, var2, null, null);
      } catch (Exception var3) {
         throw new IllegalArgumentException(
            "Could not find constructor with "
               + this.OHHOCOCRRCHRORCCIRHHOOHRRCHIHI.HORIICIRCIHOCHHOHRIHCHOHOIRCOC.length
               + " args from Class '"
               + var1.getName()
         );
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Serializable {
      private static final long CCOOHRHCOCCORHIHICHIIRIIRIICOH = 1L;
      protected Class<?> clazz;
      protected Class<?>[] HORIICIRCIHOCHHOHRIHCHOHOIRCOC;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Constructor<?> var1) {
         this.clazz = var1.getDeclaringClass();
         this.HORIICIRCIHOCHHOHRIHCHOHOIRCOC = var1.getParameterTypes();
      }
   }
}
