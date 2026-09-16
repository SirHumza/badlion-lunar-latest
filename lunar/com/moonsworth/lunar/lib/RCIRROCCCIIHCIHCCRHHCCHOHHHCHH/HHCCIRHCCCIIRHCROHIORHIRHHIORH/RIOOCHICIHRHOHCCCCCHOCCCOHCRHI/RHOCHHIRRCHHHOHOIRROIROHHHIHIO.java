package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

public final class RHOCHHIRRCHHHOHOIRROIROHHHIHIO
   implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   protected HashMap<Class<?>, Annotation> OHIOOCHCRRRHHHHIHOOHRIORCRIOHC;

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO() {
   }

   public static RHOCHHIRRCHHHOHOIRROIROHHHIHIO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var0, Annotation var1) {
      HashMap var2 = new HashMap(4);
      var2.put(var0, var1);
      return new RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var2);
   }

   RHOCHHIRRCHHHOHOIRROIROHHHIHIO(HashMap<Class<?>, Annotation> var1) {
      this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC = var1;
   }

   @Override
   public <A extends Annotation> A RORRCRCHIRCHHOOIHCCHRCHORHCICI(Class<A> var1) {
      return (A)(this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC == null ? null : this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.get(var1));
   }

   @Override
   public boolean ROCHRRCORRCOOOOOCOICOCROIIHIHH(Class<?> var1) {
      return this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC == null ? false : this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.containsKey(var1);
   }

   @Override
   public boolean RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Class<? extends Annotation>[] var1) {
      if (this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC != null) {
         int var2 = 0;

         for (int var3 = var1.length; var2 < var3; var2++) {
            if (this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.containsKey(var1[var2])) {
               return true;
            }
         }
      }

      return false;
   }

   public Iterable<Annotation> OIIOOORRHCOOHOORIOCIHOOCCHHROI() {
      return this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC != null && this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.size() != 0
         ? this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.values()
         : Collections.emptyList();
   }

   public static RHOCHHIRRCHHHOHOIRROIROHHHIHIO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var0, RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
      if (var0 == null || var0.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC == null || var0.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.isEmpty()) {
         return var1;
      }

      if (var1 != null && var1.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC != null && !var1.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.isEmpty()) {
         HashMap var2 = new HashMap();

         for (Annotation var4 : var1.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.values()) {
            var2.put(var4.annotationType(), var4);
         }

         for (Annotation var6 : var0.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.values()) {
            var2.put(var6.annotationType(), var6);
         }

         return new RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var2);
      } else {
         return var0;
      }
   }

   @Override
   public int size() {
      return this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC == null ? 0 : this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.size();
   }

   public boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(Annotation var1) {
      if (this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC != null && this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.containsKey(var1.annotationType())) {
         return false;
      }

      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
      return true;
   }

   public boolean RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Annotation var1) {
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
   }

   @Override
   public String toString() {
      return this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC == null ? "[null]" : this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.toString();
   }

   protected final boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Annotation var1) {
      if (this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC == null) {
         this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC = new HashMap<>();
      }

      Annotation var2 = this.OHIOOCHCRRRHHHHIHOOHRIORCRIOHC.put(var1.annotationType(), var1);
      return var2 == null || !var2.equals(var1);
   }
}
