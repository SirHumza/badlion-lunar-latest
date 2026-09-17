package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class OOCCRCRCOHIIORCCORCRCIRRROIOOR extends CRICCOOHHHCHOORCICOCOHIHOIRHOO implements Serializable {
   private static final long HRRIOROHROOCOIHIIIIIIHOOCCOHHC = 1L;
   protected final Class<?> RIRHHCHIRORHCOHRIHIOHRRCCCHICR;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI COIIRRRHCORIHRIRIOHCHHORIIHORH;
   protected final String OHHORHCHRHIRCHIOOIOCCICOORCROC;

   public OOCCRCRCOHIIORCCORCRCIRRROIOOR(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1,
      Class<?> var2,
      String var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var4
   ) {
      super(var1, null);
      this.RIRHHCHIRORHCOHRIHIOHRRCCCHICR = var2;
      this.COIIRRRHCORIHRIRIOHCHHORIIHORH = var4;
      this.OHHORHCHRHIRCHIOOIOCCICOORCROC = var3;
   }

   @Override
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
      return this;
   }

   public Field COIICOCCOORIIRICIHCRIRIIICCORI() {
      return null;
   }

   @Override
   public int getModifiers() {
      return 0;
   }

   @Override
   public String getName() {
      return this.OHHORHCHRHIRCHIOOIOCCICOORCROC;
   }

   @Override
   public Class<?> getRawType() {
      return this.COIIRRRHCORIHRIRIOHCHHORIIHORH.RRICIOOORRIORHHICIRCIOCHRHRCHH();
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI getType() {
      return this.COIIRRRHCORIHRIRIOHCHHORIIHORH;
   }

   @Override
   public Class<?> getDeclaringClass() {
      return this.RIRHHCHIRORHCOHRIHIOHRRCCCHICR;
   }

   @Override
   public Member getMember() {
      return null;
   }

   @Override
   public void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(Object var1, Object var2) {
      throw new IllegalArgumentException("Cannot set virtual property '" + this.OHHORHCHRHIRCHIOOIOCCICOORCROC + "'");
   }

   @Override
   public Object getValue(Object var1) {
      throw new IllegalArgumentException("Cannot get virtual property '" + this.OHHORHCHRHIRCHIOOIOCCICOORCROC + "'");
   }

   public int getAnnotationCount() {
      return 0;
   }

   @Override
   public int hashCode() {
      return this.OHHORHCHRHIRCHIOOIOCCICOORCROC.hashCode();
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

      OOCCRCRCOHIIORCCORCRCIRRROIOOR var2 = (OOCCRCRCOHIIORCCORCRCIRRROIOOR)var1;
      return var2.RIRHHCHIRORHCOHRIHIOHRRCCCHICR == this.RIRHHCHIRORHCOHRIHIOHRRCCCHICR
         && var2.OHHORHCHRHIRCHIOOIOCCICOORCROC.equals(this.OHHORHCHRHIRCHIOOIOCCICOORCROC);
   }

   @Override
   public String toString() {
      return "[virtual " + this.getFullName() + "]";
   }
}
