package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class CORCOCICIRIOHROHROIIOOHICCHCRR implements Serializable {
   private static final long OIOHHHORICOORHROHIRCIOIIROOCIO = 1L;
   private static final CORCOCICIRIOHROHROIIOOHICCHCRR COOCHOHCCROCRRIRRIOCHICIRIIIHR = new CORCOCICIRIOHROHROIIOOHICCHCRR(1, 0, new Object[4]);
   private final int HCRCOOOHRIOHRRCHHIIORHCCORRIHO;
   private final int OOOHCCOOHIIRHOCHHCOHHCOIOROIOI;
   private final Object[] IRICIHCOCHOOHICRIROHIORCCIOIIH;

   private CORCOCICIRIOHROHROIIOOHICCHCRR(int var1, int var2, Object[] var3) {
      this.HCRCOOOHRIOHRRCHHIIORHCCORRIHO = var1;
      this.OOOHCCOOHIIRHOCHHCOHHCOIOROIOI = var2;
      this.IRICIHCOCHOOHICRIROHIORCCIOIIH = var3;
   }

   public static <T> CORCOCICIRIOHROHROIIOOHICCHCRR IOCIIROIRCOHIRHHHROHCOOHIICIHI(Map<String, T> var0) {
      if (var0.isEmpty()) {
         return COOCHOHCCROCRRIRRIOCHICIRIIIHR;
      }

      int var1 = ICROHCCHHORIIOIRIIICCCCOHRIRCH(var0.size());
      int var2 = var1 - 1;
      int var3 = (var1 + (var1 >> 1)) * 2;
      Object[] var4 = new Object[var3];
      byte var5 = 0;

      for (Entry var7 : var0.entrySet()) {
         String var8 = (String)var7.getKey();
         if (var8 != null) {
            int var9 = var8.hashCode() & var2;
            int var10 = var9 + var9;
            if (var4[var10] != null) {
               var10 = var1 + (var9 >> 1) << 1;
               if (var4[var10] != null) {
                  var10 = (var1 + (var1 >> 1) << 1) + var5;
                  var5 += 2;
                  if (var10 >= var4.length) {
                     var4 = Arrays.copyOf(var4, var4.length + 4);
                  }
               }
            }

            var4[var10] = var8;
            var4[var10 + 1] = var7.getValue();
         }
      }

      return new CORCOCICIRIOHROHROIIOOHICCHCRR(var2, var5, var4);
   }

   private static final int ICROHCCHHORIIOIRIIICCCCOHRIRCH(int var0) {
      if (var0 <= 5) {
         return 8;
      }

      if (var0 <= 12) {
         return 16;
      }

      int var1 = var0 + (var0 >> 2);
      byte var2 = 32;

      while (var2 < var1) {
         var2 += var2;
      }

      return var2;
   }

   public Object HIOCCRHOROOHCHHHICHOCRCIHHOHOR(String var1) {
      int var2 = var1.hashCode() & this.HCRCOOOHRIOHRRCHHIIORHCCORRIHO;
      int var3 = var2 << 1;
      Object var4 = this.IRICIHCOCHOOHICRIROHIORCCIOIIH[var3];
      return var4 != var1 && !var1.equals(var4) ? this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var4) : this.IRICIHCOCHOOHICRIROHIORCCIOIIH[var3 + 1];
   }

   private final Object HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, int var2, Object var3) {
      if (var3 == null) {
         return null;
      }

      int var4 = this.HCRCOOOHRIOHRRCHHIIORHCCORRIHO + 1;
      int var5 = var4 + (var2 >> 1) << 1;
      var3 = this.IRICIHCOCHOOHICRIROHIORCCIOIIH[var5];
      if (var1.equals(var3)) {
         return this.IRICIHCOCHOOHICRIROHIORCCIOIIH[var5 + 1];
      }

      if (var3 != null) {
         int var6 = var4 + (var4 >> 1) << 1;

         for (int var7 = var6 + this.OOOHCCOOHIIRHOCHHCOHHCOIOROIOI; var6 < var7; var6 += 2) {
            var3 = this.IRICIHCOCHOOHICRIROHIORCCIOIIH[var6];
            if (var3 == var1 || var1.equals(var3)) {
               return this.IRICIHCOCHOOHICRIROHIORCCIOIIH[var6 + 1];
            }
         }
      }

      return null;
   }

   public Object HRHIOHRHORHOCIICRCHICCOIROORHC(String var1) {
      byte var2 = 0;

      for (int var3 = this.IRICIHCOCHOOHICRIROHIORCCIOIIH.length; var2 < var3; var2 += 2) {
         Object var4 = this.IRICIHCOCHOOHICRIROHIORCCIOIIH[var2];
         if (var4 != null) {
            String var5 = (String)var4;
            if (var5.equalsIgnoreCase(var1)) {
               return this.IRICIHCOCHOOHICRIROHIORCCIOIIH[var2 + 1];
            }
         }
      }

      return null;
   }

   public List<String> IIOHOHOHCRRRORCROOIOCHCRCOHHHR() {
      int var1 = this.IRICIHCOCHOOHICRIROHIORCCIOIIH.length;
      ArrayList var2 = new ArrayList(var1 >> 2);

      for (byte var3 = 0; var3 < var1; var3 += 2) {
         Object var4 = this.IRICIHCOCHOOHICRIROHIORCCIOIIH[var3];
         if (var4 != null) {
            var2.add((String)var4);
         }
      }

      return var2;
   }
}
