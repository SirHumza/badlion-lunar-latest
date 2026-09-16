package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO HHOCCOHOOIOIORCIRHOCOHHOORRCCR() {
      return CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHOCCOHOOIOIORCIRHOCOHHOORRCCR();
   }

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO RHOORRIIOCHIRRHOHOOHIROHCRICRO(Object var1, Object var2);

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO ORCOCORROHIROCCIORORRRRCHIOOCH(Map<?, ?> var1);

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO COHHIICIHHROCRHIROHOHHIRRHCROC(Object var1);

   public abstract Object RHCHRCCRRHORIOCIOHHCRHCHICRIHH(Object var1);

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO CCHHCIRHICHHHHRRIHIORCCORCCIHR(Object var1, Object var2);

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRICCOOHHHCHOORCICOCOHIHOIRHOO implements Serializable {
      private static final long HOROHCRHORCOHCROCICIHCIOORHCRH = 1L;
      protected static final CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OORIRHRRRRHHICCORCHCHHORHCOCIR = new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Collections.emptyMap()
      );
      protected static final Object CCRHHRIRIHHRHRORHHICIORIOHIRCC = new Object();
      protected final Map<?, ?> RRIOHCROHIRORHIIIIHRICIIRICCIH;
      protected transient Map<Object, Object> RICCRCHCROOCIHICRHRCRHIIHHCIOR;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<?, ?> var1) {
         this.RRIOHCROHIRORHIIIIHRICIIRICCIH = var1;
         this.RICCRCHCROOCIHICRHRCRHIIHHCIOR = null;
      }

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<?, ?> var1, Map<Object, Object> var2) {
         this.RRIOHCROHIRORHIIIIHRICIIRICCIH = var1;
         this.RICCRCHCROOCIHICRHRCRHIIHHCIOR = var2;
      }

      public static CRICCOOHHHCHOORCICOCOHIHOIRHOO HHOCCOHOOIOIORCIRHOCOHHOORRCCR() {
         return OORIRHRRRRHHICCORCHCHHORHCOCIR;
      }

      @Override
      public CRICCOOHHHCHOORCICOCOHIHOIRHOO RHOORRIIOCHIRRHOHOOHIROHCRICRO(Object var1, Object var2) {
         Map var3;
         if (this == OORIRHRRRRHHICCORCHCHHORHCOCIR) {
            var3 = new HashMap(8);
         } else {
            var3 = this.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(this.RRIOHCROHIRORHIIIIHRICIIRICCIH);
         }

         var3.put(var1, var2);
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
      }

      @Override
      public CRICCOOHHHCHOORCICOCOHIHOIRHOO ORCOCORROHIROCCIORORRRRCHIOOCH(Map<?, ?> var1) {
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      }

      @Override
      public CRICCOOHHHCHOORCICOCOHIHOIRHOO COHHIICIHHROCRHIROHOHHIRRHCROC(Object var1) {
         if (this.RRIOHCROHIRORHIIIIHRICIIRICCIH.isEmpty()) {
            return this;
         }

         if (this.RRIOHCROHIRORHIIIIHRICIIRICCIH.containsKey(var1)) {
            if (this.RRIOHCROHIRORHIIIIHRICIIRICCIH.size() == 1) {
               return OORIRHRRRRHHICCORCHCHHORHCOCIR;
            }

            Map var2 = this.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(this.RRIOHCROHIRORHIIIIHRICIIRICCIH);
            var2.remove(var1);
            return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
         } else {
            return this;
         }
      }

      @Override
      public Object RHCHRCCRRHORIOCIOHHCRHCHICRIHH(Object var1) {
         if (this.RICCRCHCROOCIHICRHRCRHIIHHCIOR != null) {
            Object var2 = this.RICCRCHCROOCIHICRHRCRHIIHHCIOR.get(var1);
            if (var2 != null) {
               if (var2 == CCRHHRIRIHHRHRORHHICIORIOHIRCC) {
                  return null;
               }

               return var2;
            }
         }

         return this.RRIOHCROHIRORHIIIIHRICIIRICCIH.get(var1);
      }

      @Override
      public CRICCOOHHHCHOORCICOCOHIHOIRHOO CCHHCIRHICHHHHRRIHIORCCORCCIHR(Object var1, Object var2) {
         if (var2 == null) {
            if (!this.RRIOHCROHIRORHIIIIHRICIIRICCIH.containsKey(var1)) {
               if (this.RICCRCHCROOCIHICRHRCRHIIHHCIOR != null && this.RICCRCHCROOCIHICRHRCRHIIHHCIOR.containsKey(var1)) {
                  this.RICCRCHCROOCIHICRHRCRHIIHHCIOR.remove(var1);
                  return this;
               }

               return this;
            }

            var2 = CCRHHRIRIHHRHRORHHICIORIOHIRCC;
         }

         if (this.RICCRCHCROOCIHICRHRCRHIIHHCIOR == null) {
            return this.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var1, var2);
         }

         this.RICCRCHCROOCIHICRHRCRHIIHHCIOR.put(var1, var2);
         return this;
      }

      protected CRICCOOHHHCHOORCICOCOHIHOIRHOO COIHORRCHRRCHOCIRHHRRIOIHRIHCC(Object var1, Object var2) {
         HashMap var3 = new HashMap();
         if (var2 == null) {
            var2 = CCRHHRIRIHHRHRORHHICIORIOHIRCC;
         }

         var3.put(var1, var2);
         return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RRIOHCROHIRORHIIIIHRICIIRICCIH, var3);
      }

      private Map<Object, Object> HOIHOROOIOOCOIHCRIRIRIRRICIIHC(Map<?, ?> var1) {
         return new HashMap<>(var1);
      }
   }
}
