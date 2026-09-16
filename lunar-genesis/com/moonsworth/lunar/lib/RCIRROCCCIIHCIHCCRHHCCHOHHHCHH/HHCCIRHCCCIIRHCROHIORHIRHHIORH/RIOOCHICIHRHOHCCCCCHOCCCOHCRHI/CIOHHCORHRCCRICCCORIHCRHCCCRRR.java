package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class CIOHHCORHRCCRICCCORIHCRHCCCRRR extends CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   private static final long ORCORCCROHHIIICIICRHCCRRICHIHI = 1L;
   protected final IHHCHHHCRIHOOCOIOOCRIIICIOROIR IHHIROIHIOORCCIRHRCICOIHRRRCRH;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI HHOORIOCCHHRRIIHIOHOROCOCOHOOR;
   protected final int CIHHHOORHRCHIHICIIIRIRHIORCORC;

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3,
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO var4,
      int var5
   ) {
      super(var3, var4);
      this.IHHIROIHIOORCCIRHRCICOIHRRRCRH = var1;
      this.HHOORIOCCHHRRIIHIOHOROCOCOHOOR = var2;
      this.CIHHHOORHRCHIHICIIIRIRHIORCORC = var5;
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR RRCRRCORICCHOHHIRCHIROOHIIOHCO(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
      return var1 == this.IOCOHHCOHOCOIHOCHIIRORCIRCCCIC
         ? this
         : this.IHHIROIHIOORCCIRHRCICOIHRRRCRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CIHHHOORHRCHIHICIIIRIRHIORCORC, var1);
   }

   @Override
   public AnnotatedElement RHCHIIHIHIRCRIRHRCIRIIOROOOHOC() {
      return null;
   }

   @Override
   public int getModifiers() {
      return this.IHHIROIHIOORCCIRHRCICOIHRRRCRH.getModifiers();
   }

   @Override
   public String getName() {
      return "";
   }

   @Override
   public Class<?> getRawType() {
      return this.HHOORIOCCHHRRIIHIOHOROCOCOHOOR.RRICIOOORRIORHHICIRCIOCHRHRCHH();
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI getType() {
      return this.HHOORIOCCHHRRIIHIOHOROCOCOHOOR;
   }

   @Override
   public Class<?> getDeclaringClass() {
      return this.IHHIROIHIOORCCIRHRCICOIHRRRCRH.getDeclaringClass();
   }

   @Override
   public Member getMember() {
      return this.IHHIROIHIOORCCIRHRCICOIHRRRCRH.getMember();
   }

   @Override
   public void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(Object var1, Object var2) {
      throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + this.getDeclaringClass().getName());
   }

   @Override
   public Object getValue(Object var1) {
      throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + this.getDeclaringClass().getName());
   }

   public Type HHHRHHOOHRRHOCHIHOIICIOOCCOOIH() {
      return this.HHOORIOCCHHRRIIHIOHOROCOCOHOOR;
   }

   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR CCOCCCRHOORCCROIOIRHRHRCOHHOCR() {
      return this.IHHIROIHIOORCCIRHRCICOIHRRRCRH;
   }

   public int getIndex() {
      return this.CIHHHOORHRCHIHICIIIRIRHIORCORC;
   }

   @Override
   public int hashCode() {
      return this.IHHIROIHIOORCCIRHRCICOIHRRRCRH.hashCode() + this.CIHHHOORHRCHIHICIIIRIRHIORCORC;
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

      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = (CIOHHCORHRCCRICCCORIHCRHCCCRRR)var1;
      return var2.IHHIROIHIOORCCIRHRCICOIHRRRCRH.equals(this.IHHIROIHIOORCCIRHRCICOIHRRRCRH)
         && var2.CIHHHOORHRCHIHICIIIRIRHIORCORC == this.CIHHHOORHRCHIHICIIIRIRHIORCORC;
   }

   @Override
   public String toString() {
      return "[parameter #" + this.getIndex() + ", annotations: " + this.IOCOHHCOHOCOIHOCHIIRORCIRCCCIC + "]";
   }
}
