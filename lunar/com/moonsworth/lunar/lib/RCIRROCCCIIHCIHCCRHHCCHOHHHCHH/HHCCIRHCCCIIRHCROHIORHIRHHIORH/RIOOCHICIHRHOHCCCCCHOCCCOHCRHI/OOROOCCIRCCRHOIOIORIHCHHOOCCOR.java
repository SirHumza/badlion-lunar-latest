package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public final class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends CRICCOOHHHCHOORCICOCOHIHOIRHOO implements Serializable {
   private static final long RIHIIOOHIRCRCRIROHHOICORRRORHH = 1L;
   protected final transient Field IIRIHICHCRHIIOCCHOOCHHORIOROII;
   protected OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRICIOIORRORIHICIOIIIRORCOCRCR;

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, Field var2, RHOCHHIRRCHHHOHOIRROIROHHHIHIO var3) {
      super(var1, var3);
      this.IIRIHICHCRHIIOCCHOOCHHORIOROII = var2;
   }

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR HHCCIRHCCCIIRHCROHIORHIRHHIORH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.IRIOIRIROIIOCRCIRHICCOCIOOHICO, this.IIRIHICHCRHIIOCCHOOCHHORIOROII, var1);
   }

   protected OOROOCCIRCCRHOIOIORIHCHHOOCCOR(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      super(null, null);
      this.IIRIHICHCRHIIOCCHOOCHHORIOROII = null;
      this.RRICIOIORRORIHICIOIIIRORCOCRCR = var1;
   }

   public Field COIICOCCOORIIRICIHCRIRIIICCORI() {
      return this.IIRIHICHCRHIIOCCHOOCHHORIOROII;
   }

   @Override
   public int getModifiers() {
      return this.IIRIHICHCRHIIOCCHOOCHHORIOROII.getModifiers();
   }

   @Override
   public String getName() {
      return this.IIRIHICHCRHIIOCCHOOCHHORIOROII.getName();
   }

   @Override
   public Class<?> getRawType() {
      return this.IIRIHICHCRHIIOCCHOOCHHORIOROII.getType();
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI getType() {
      return this.IRIOIRIROIIOCRCIRHICCOCIOOHICO.IIHRRHORCRCROCHHOHORCHCROCIHRO(this.IIRIHICHCRHIIOCCHOOCHHORIOROII.getGenericType());
   }

   @Override
   public Class<?> getDeclaringClass() {
      return this.IIRIHICHCRHIIOCCHOOCHHORIOROII.getDeclaringClass();
   }

   @Override
   public Member getMember() {
      return this.IIRIHICHCRHIIOCCHOOCHHORIOROII;
   }

   @Override
   public void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(Object var1, Object var2) {
      try {
         this.IIRIHICHCRHIIOCCHOOCHHORIOROII.set(var1, var2);
      } catch (IllegalAccessException var4) {
         throw new IllegalArgumentException("Failed to setValue() for field " + this.getFullName() + ": " + var4.getMessage(), var4);
      }
   }

   @Override
   public Object getValue(Object var1) {
      try {
         return this.IIRIHICHCRHIIOCCHOOCHHORIOROII.get(var1);
      } catch (IllegalAccessException var3) {
         throw new IllegalArgumentException("Failed to getValue() for field " + this.getFullName() + ": " + var3.getMessage(), var3);
      }
   }

   public int getAnnotationCount() {
      return this.IOCOHHCOHOCOIHOCHIIRORCIRCCCIC.size();
   }

   public boolean isTransient() {
      return Modifier.isTransient(this.getModifiers());
   }

   @Override
   public int hashCode() {
      return this.IIRIHICHCRHIIOCCHOOCHHORIOROII.getName().hashCode();
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

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var1;
      return var2.IIRIHICHCRHIIOCCHOOCHHORIOROII == null
         ? this.IIRIHICHCRHIIOCCHOOCHHORIOROII == null
         : var2.IIRIHICHCRHIIOCCHOOCHHORIOROII.equals(this.IIRIHICHCRHIIOCCHOOCHHORIOROII);
   }

   @Override
   public String toString() {
      return "[field " + this.getFullName() + "]";
   }

   Object writeReplace() {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IIRIHICHCRHIIOCCHOOCHHORIOROII));
   }

   Object readResolve() {
      Class var1 = this.RRICIOIORRORIHICIOIIIRORCOCRCR.clazz;

      try {
         Field var2 = var1.getDeclaredField(this.RRICIOIORRORIHICIOIIIRORCOCRCR.name);
         if (!var2.isAccessible()) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2, false
            );
         }

         return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(null, var2, null);
      } catch (Exception var3) {
         throw new IllegalArgumentException("Could not find method '" + this.RRICIOIORRORIHICIOIIIRORCOCRCR.name + "' from Class '" + var1.getName());
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Serializable {
      private static final long OHHCORCRCOIOHROCHHRHOHRICOCCOR = 1L;
      protected Class<?> clazz;
      protected String name;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Field var1) {
         this.clazz = var1.getDeclaringClass();
         this.name = var1.getName();
      }
   }
}
