package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR implements Serializable {
   private static final long CCHRICORRIRRCOOHCRHRROICHIIORR = 1L;
   private static final String[] ROCICHROIHIHCRRRRIIIHRRCCRROHH = new String[0];
   private static final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] CIRROOCIOHOHHHOOROROOHRIRCRCOC = new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[0];
   private static final IHHCHHHCRIHOOCOIOOCRIIICIOROIR ORIRRRRHIHCICHROIIORHCHIIRIOCR = new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      ROCICHROIHIHCRRRRIIIHRRCCRROHH, CIRROOCIOHOHHHOOROROOHRIRCRCOC, null
   );
   private final String[] OOROHIIROOOOCOOHCHCOOHRCORORCH;
   private final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] CIOCRICHOHCIIOROOIORHIRIIRRIOI;
   private final String[] OHORIICIHIRCRORROCRCHIIHCICHCO;
   private final int RCHIRHOORCIOCHOORHCICCCRHCIRRC;

   private IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      String[] var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var2,
      String[] var3
   ) {
      this.OOROHIIROOOOCOOHCHCOOHRCORORCH = var1 == null ? ROCICHROIHIHCRRRRIIIHRRCCRROHH : var1;
      this.CIOCRICHOHCIIOROOIORHIRIIRRIOI = var2 == null ? CIRROOCIOHOHHHOOROROOHRIRCRCOC : var2;
      if (this.OOROHIIROOOOCOOHCHCOOHRCORORCH.length != this.CIOCRICHOHCIIOROOIORHIRIIRRIOI.length) {
         throw new IllegalArgumentException(
            "Mismatching names (" + this.OOROHIIROOOOCOOHCHCOOHRCORORCH.length + "), types (" + this.CIOCRICHOHCIIOROOIORHIRIIRRIOI.length + ")"
         );
      }

      this.OHORIICIHIRCRORROCRCHIIHCICHCO = var3;
      this.RCHIRHOORCIOCHOORHCICCCRHCIRRC = Arrays.hashCode(this.CIOCRICHOHCIIOROOIORHIRIIRRIOI);
   }

   public static IHHCHHHCRIHOOCOIOOCRIIICIOROIR OIRRROOOHCOOCIOIRICHIHCHRCHHIR() {
      return ORIRRRRHIHCICHROIIORHCHIIRIOCR;
   }

   protected Object readResolve() {
      return this.OOROHIIROOOOCOOHCHCOOHRCORORCH != null && this.OOROHIIROOOOCOOHCHCOOHRCORORCH.length != 0 ? this : ORIRRRRHIHCICHROIIORHCHIIRIOCR;
   }

   public static IHHCHHHCRIHOOCOIOOCRIIICIOROIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<?> var0, List<com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI> var1
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var2 = var1 != null
            && !var1.isEmpty()
         ? var1.toArray(CIRROOCIOHOHHHOOROROOHRIRCRCOC)
         : CIRROOCIOHOHHHOOROROOHRIRCRCOC;
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var2);
   }

   public static IHHCHHHCRIHOOCOIOOCRIIICIOROIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<?> var0, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var1
   ) {
      if (var1 == null) {
         var1 = CIRROOCIOHOHHHOOROROOHRIRCRCOC;
      } else {
         switch (var1.length) {
            case 1:
               return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1[0]);
            case 2:
               return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1[0], var1[1]);
         }
      }

      TypeVariable[] var2 = var0.getTypeParameters();
      String[] var3;
      if (var2 != null && var2.length != 0) {
         int var4 = var2.length;
         var3 = new String[var4];

         for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = var2[var5].getName();
         }
      } else {
         var3 = ROCICHROIHIHCRRRRIIIHRRCCRROHH;
      }

      if (var3.length != var1.length) {
         throw new IllegalArgumentException(
            "Cannot create TypeBindings for class "
               + var0.getName()
               + " with "
               + var1.length
               + " type parameter"
               + (var1.length == 1 ? "" : "s")
               + ": class expects "
               + var3.length
         );
      } else {
         return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var3, var1, null);
      }
   }

   public static IHHCHHHCRIHOOCOIOOCRIIICIOROIR RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      Class<?> var0, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1
   ) {
      TypeVariable[] var2 = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHCIOCCCOHCCHHOCCHOIHRHOHCICOR(var0);
      int var3 = var2 == null ? 0 : var2.length;
      if (var3 != 1) {
         throw new IllegalArgumentException("Cannot create TypeBindings for class " + var0.getName() + " with 1 type parameter: class expects " + var3);
      } else {
         return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            new String[]{var2[0].getName()},
            new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[]{var1},
            null
         );
      }
   }

   public static IHHCHHHCRIHOOCOIOOCRIIICIOROIR HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      Class<?> var0,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      TypeVariable[] var3 = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCCCIIHICHIROIHHIIHCIIICCORCCR(var0);
      int var4 = var3 == null ? 0 : var3.length;
      if (var4 != 2) {
         throw new IllegalArgumentException("Cannot create TypeBindings for class " + var0.getName() + " with 2 type parameters: class expects " + var4);
      } else {
         return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            new String[]{var3[0].getName(), var3[1].getName()},
            new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[]{var1, var2},
            null
         );
      }
   }

   public static IHHCHHHCRIHOOCOIOOCRIIICIOROIR HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      List<String> var0, List<com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI> var1
   ) {
      return var0 != null && !var0.isEmpty() && var1 != null && !var1.isEmpty()
         ? new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var0.toArray(ROCICHROIHIHCRRRRIIIHRRCCRROHH), var1.toArray(CIRROOCIOHOHHHOOROROOHRIRCRCOC), null)
         : ORIRRRRHIHCICHROIIORHCHIIRIOCR;
   }

   public static IHHCHHHCRIHOOCOIOOCRIIICIOROIR RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      Class<?> var0, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1
   ) {
      TypeVariable[] var2 = var0.getTypeParameters();
      int var3 = var2 == null ? 0 : var2.length;
      if (var3 == 0) {
         return ORIRRRRHIHCICHROIIORHCHIIRIOCR;
      } else if (var3 != 1) {
         throw new IllegalArgumentException("Cannot create TypeBindings for class " + var0.getName() + " with 1 type parameter: class expects " + var3);
      } else {
         return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            new String[]{var2[0].getName()},
            new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[]{var1},
            null
         );
      }
   }

   public static IHHCHHHCRIHOOCOIOOCRIIICIOROIR IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Class<?> var0, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var1
   ) {
      TypeVariable[] var2 = var0.getTypeParameters();
      if (var2 != null && var2.length != 0) {
         if (var1 == null) {
            var1 = CIRROOCIOHOHHHOOROROOHRIRCRCOC;
         }

         int var3 = var2.length;
         String[] var4 = new String[var3];

         for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2[var5].getName();
         }

         if (var4.length != var1.length) {
            throw new IllegalArgumentException(
               "Cannot create TypeBindings for class "
                  + var0.getName()
                  + " with "
                  + var1.length
                  + " type parameter"
                  + (var1.length == 1 ? "" : "s")
                  + ": class expects "
                  + var4.length
            );
         } else {
            return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var4, var1, null);
         }
      } else {
         return ORIRRRRHIHCICHROIIORHCHIIRIOCR;
      }
   }

   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR COOCHHRROHRCCIOIOHRRIIOHCIRCCH(String var1) {
      int var2 = this.OHORIICIHIRCRORROCRCHIIHCICHCO == null ? 0 : this.OHORIICIHIRCRORROCRCHIIHCICHCO.length;
      String[] var3 = var2 == 0 ? new String[1] : Arrays.copyOf(this.OHORIICIHIRCRORROCRCHIIHCICHCO, var2 + 1);
      var3[var2] = var1;
      return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(this.OOROHIIROOOOCOOHCHCOOHRCORORCH, this.CIOCRICHOHCIIOROOIORHIRIIRRIOI, var3);
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI CRICRCIOOOHIIHROORIRCCORIHICCO(
      String var1
   ) {
      int var2 = 0;

      for (int var3 = this.OOROHIIROOOOCOOHCHCOOHRCORORCH.length; var2 < var3; var2++) {
         if (var1.equals(this.OOROHIIROOOOCOOHCHCOOHRCORORCH[var2])) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var4 = this.CIOCRICHOHCIIOROOIORHIRIIRRIOI[var2];
            if (var4 instanceof IIHRRHORCRCROCHHOHORCHCROCIHRO) {
               IIHRRHORCRCROCHHOHORCHCROCIHRO var5 = (IIHRRHORCRCROCHHOHORCHCROCIHRO)var4;
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var6 = var5.HRCIOOIICIIRCOHRIIIOHIRRHHIOHH();
               if (var6 != null) {
                  var4 = var6;
               }
            }

            return var4;
         }
      }

      return null;
   }

   private boolean RHHCHICHCIHCCOOHHOIICOOCHHORIC() {
      for (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var4 : this.CIOCRICHOHCIIOROOIORHIRIIRRIOI) {
         if (var4 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI) {
            return true;
         }
      }

      return false;
   }

   public boolean isEmpty() {
      return this.CIOCRICHOHCIIOROOIORHIRIIRRIOI.length == 0;
   }

   public int size() {
      return this.CIOCRICHOHCIIOROOIORHIRIIRRIOI.length;
   }

   public String IHRIHCICOCCIIIRRIIIROHHIROCOOO(int var1) {
      return var1 >= 0 && var1 < this.OOROHIIROOOOCOOHCHCOOHRCORORCH.length ? this.OOROHIIROOOOCOOHCHCOOHRCORORCH[var1] : null;
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI IIHOCOIHHIROCHIHHCCCORRCOHCHRC(
      int var1
   ) {
      return var1 >= 0 && var1 < this.CIOCRICHOHCIIOROOIORHIRIIRRIOI.length ? this.CIOCRICHOHCIIOROOIORHIRIIRRIOI[var1] : null;
   }

   public List<com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI> getTypeParameters() {
      return this.CIOCRICHOHCIIOROOIORHIRIIRRIOI.length == 0 ? Collections.emptyList() : Arrays.asList(this.CIOCRICHOHCIIOROOIORHIRIIRRIOI);
   }

   public boolean CRIRRICIRRIOHRHCOORIOHIIHIIOIC(String var1) {
      if (this.OHORIICIHIRCRORROCRCHIIHCICHCO != null) {
         int var2 = this.OHORIICIHIRCRORROCRCHIIHCICHCO.length;

         while (--var2 >= 0) {
            if (var1.equals(this.OHORIICIHIRCRORROCRCHIIHCICHCO[var2])) {
               return true;
            }
         }
      }

      return false;
   }

   public Object ROCIOHOCOCCOOOCHHHOHHHIIRIRHHH(Class<?> var1) {
      return this.RHHCHICHCIHCCOOHHOIICOOCHHORIC()
         ? null
         : new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.CIOCRICHOHCIIOROOIORHIRIIRRIOI, this.RCHIRHOORCIOCHOORHCICCCRHCIRRC);
   }

   @Override
   public String toString() {
      if (this.CIOCRICHOHCIIOROOIORHIRIIRRIOI.length == 0) {
         return "<>";
      }

      StringBuilder var1 = new StringBuilder();
      var1.append('<');
      int var2 = 0;

      for (int var3 = this.CIOCRICHOHCIIOROOIORHIRIIRRIOI.length; var2 < var3; var2++) {
         if (var2 > 0) {
            var1.append(',');
         }

         String var4 = this.CIOCRICHOHCIIOROOIORHIRIIRRIOI[var2].getGenericSignature();
         var1.append(var4);
      }

      var1.append('>');
      return var1.toString();
   }

   @Override
   public int hashCode() {
      return this.RCHIRHOORCIOCHOORHCICCCRHCIRRC;
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

      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2 = (IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var1;
      return this.RCHIRHOORCIOCHOORHCICCCRHCIRRC == var2.RCHIRHOORCIOCHOORHCICCCRHCIRRC
         && Arrays.equals(this.CIOCRICHOHCIIOROOIORHIRIIRRIOI, var2.CIOCRICHOHCIIOROOIORHIRIIRRIOI);
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] OOIHRRIORRRHIOCCCCHHOICRHOOORH() {
      return this.CIOCRICHOHCIIOROOIORHIRIIRRIOI;
   }

   static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private static final TypeVariable<?>[] RIOIRRRHICRHCIRCHRHICIRHIHICOH = AbstractList.class.getTypeParameters();
      private static final TypeVariable<?>[] IHICHHRCRHOOCRRHROCROOCOOOHCCC = Collection.class.getTypeParameters();
      private static final TypeVariable<?>[] RRIIIHCHHRRIHCROIORRHOOIHRCCRI = Iterable.class.getTypeParameters();
      private static final TypeVariable<?>[] OOOCHRHOHRIHHHROHORORRCROOIOHC = List.class.getTypeParameters();
      private static final TypeVariable<?>[] ROIHOHCHIRRHRRIIHICIRHCRRICOOO = ArrayList.class.getTypeParameters();
      private static final TypeVariable<?>[] CHIRRRHOOIRCHRICHRIOORRHCOOOHR = Map.class.getTypeParameters();
      private static final TypeVariable<?>[] CRHHCORHCRORCHRIIRCIHIOIIORHHR = HashMap.class.getTypeParameters();
      private static final TypeVariable<?>[] HOIIHCRCIRCHIOORCOIROIOCIORHOC = LinkedHashMap.class.getTypeParameters();

      public static TypeVariable<?>[] OHCIOCCCOHCCHHOCCHOIHRHOHCICOR(Class<?> var0) {
         if (var0 == Collection.class) {
            return IHICHHRCRHOOCRRHROCROOCOOOHCCC;
         } else if (var0 == List.class) {
            return OOOCHRHOHRIHHHROHORORRCROOIOHC;
         } else if (var0 == ArrayList.class) {
            return ROIHOHCHIRRHRRIIHICIRHCRRICOOO;
         } else if (var0 == AbstractList.class) {
            return RIOIRRRHICRHCIRCHRHICIRHIHICOH;
         } else {
            return var0 == Iterable.class ? RRIIIHCHHRRIHCROIORRHOOIHRCCRI : var0.getTypeParameters();
         }
      }

      public static TypeVariable<?>[] HCCCIIHICHIROIHHIIHCIIICCORCCR(Class<?> var0) {
         if (var0 == Map.class) {
            return CHIRRRHOOIRCHRICHRIOORRHCOOOHR;
         } else if (var0 == HashMap.class) {
            return CRHHCORHCRORCHRIIRCIHIOIIORHHR;
         } else {
            return var0 == LinkedHashMap.class ? HOIIHCRCIRCHIOORCOIROIOCIORHOC : var0.getTypeParameters();
         }
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Class<?> OHOCIIOCORIHRCOOCHRRCRCIHICHRH;
      private final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] CCRHIHRHIOCRIOHHIIIHCOCIRRIICI;
      private final int OIRROCCCRCIOIHOHHRCORHCRCOIRRH;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Class<?> var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var2, int var3
      ) {
         this.OHOCIIOCORIHRCOOCHRRCRCIHICHRH = var1;
         this.CCRHIHRHIOCRIOHHIIIHCOCIRRIICI = var2;
         this.OIRROCCCRCIOIHOHHRCORHCRCOIRRH = 31 * var1.hashCode() + var3;
      }

      @Override
      public int hashCode() {
         return this.OIRROCCCRCIOIHOHHRCORHCRCOIRRH;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 == null) {
            return false;
         }

         if (var1.getClass() != this.getClass()) {
            return false;
         }

         IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         if (this.OIRROCCCRCIOIHOHHRCORHCRCOIRRH == var2.OIRROCCCRCIOIHOHHRCORHCRCOIRRH
            && this.OHOCIIOCORIHRCOOCHRRCRCIHICHRH == var2.OHOCIIOCORIHRCOOCHRRCRCIHICHRH) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var3 = var2.CCRHIHRHIOCRIOHHIIIHCOCIRRIICI;
            int var4 = this.CCRHIHRHIOCRIOHHIIIHCOCIRRIICI.length;
            if (var4 == var3.length) {
               for (int var5 = 0; var5 < var4; var5++) {
                  if (!this.CCRHIHRHIOCRIOHHIIIHCOCIRRIICI[var5].equals(var3[var5])) {
                     return false;
                  }
               }

               return true;
            }
         }

         return false;
      }

      @Override
      public String toString() {
         return this.OHOCIIOCORIHRCOOCHRRCRCIHICHRH.getName() + "<>";
      }
   }
}
