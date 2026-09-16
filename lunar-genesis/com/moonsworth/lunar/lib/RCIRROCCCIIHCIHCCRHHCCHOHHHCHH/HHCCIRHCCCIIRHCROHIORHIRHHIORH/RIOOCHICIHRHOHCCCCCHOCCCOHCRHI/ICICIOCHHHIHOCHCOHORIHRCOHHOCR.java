package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Objects;

final class ICICIOCHHHIHOCHCOHORIHRCOHHOCR {
   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Method var0,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, var1, var3
      );
      return var4 == null ? var3 : new RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4);
   }

   static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Method var0,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2
   ) {
      TypeVariable[] var3 = var0.getTypeParameters();
      if (var3.length != 0 && !var1.HOHCHIIHCCCCHCOORROOHHOIIRIHRH().isEmpty()) {
         Type var4 = var0.getGenericReturnType();
         if (!(var4 instanceof ParameterizedType)) {
            return null;
         }

         ParameterizedType var5 = (ParameterizedType)var4;
         if (!Objects.equals(var1.RRICIOOORRIORHHICIRCIOCHRHRCHH(), var5.getRawType())) {
            return null;
         }

         Type[] var6 = var5.getActualTypeArguments();
         ArrayList var7 = new ArrayList(var3.length);
         ArrayList var8 = new ArrayList(var3.length);

         for (int var9 = 0; var9 < var6.length; var9++) {
            Type var10 = var6[var9];
            TypeVariable var11 = IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var10);
            if (var11 != null) {
               String var12 = var11.getName();
               if (var12 == null) {
                  return null;
               }

               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var13 = var1.HOHCHIIHCCCCHCOORROOHHOIIRIHRH()
                  .IIHOCOIHHIROCHIHHCCCORRCOHCHRC(var9);
               if (var13 == null) {
                  return null;
               }

               TypeVariable var14 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var12);
               if (var14 == null) {
                  return null;
               }

               if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var13, var14.getBounds())) {
                  int var15 = var7.indexOf(var12);
                  if (var15 != -1) {
                     com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var16 = (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI)var8.get(
                        var15
                     );
                     if (!var13.equals(var16)) {
                        boolean var17 = var16.IROCHOHCORHCOCCCOCHORCICRORIIC(var13.RRICIOOORRIORHHICIRCIOCHRHRCHH());
                        boolean var18 = var13.IROCHOHCORHCOCCCOCHORCICRORIIC(var16.RRICIOOORRIORHHICIRCIOCHRHRCHH());
                        if (!var17 && !var18) {
                           return null;
                        }

                        if (var17 ^ var18 && var18) {
                           var8.set(var15, var13);
                        }
                     }
                  } else {
                     var7.add(var12);
                     var8.add(var13);
                  }
               }
            }
         }

         return var7.isEmpty()
            ? null
            : com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
               var7, var8
            );
      } else {
         return null;
      }
   }

   private static TypeVariable<?> IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Type var0) {
      if (var0 instanceof TypeVariable) {
         return (TypeVariable<?>)var0;
      }

      if (var0 instanceof WildcardType) {
         WildcardType var1 = (WildcardType)var0;
         if (var1.getLowerBounds().length != 0) {
            return null;
         }

         Type[] var2 = var1.getUpperBounds();
         if (var2.length == 1) {
            return IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var2[0]);
         }
      }

      return null;
   }

   private static ParameterizedType IIRHCHHOICHRICOOCRORCCIOOIHOIR(Type var0) {
      if (var0 instanceof ParameterizedType) {
         return (ParameterizedType)var0;
      }

      if (var0 instanceof WildcardType) {
         WildcardType var1 = (WildcardType)var0;
         if (var1.getLowerBounds().length != 0) {
            return null;
         }

         Type[] var2 = var1.getUpperBounds();
         if (var2.length == 1) {
            return IIRHCHHOICHRICOOCRORCCIOOIHOIR(var2[0]);
         }
      }

      return null;
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var0,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Type[] var2
   ) {
      for (Type var6 : var2) {
         if (!RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var6)) {
            return false;
         }
      }

      return true;
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var0,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Type var2
   ) {
      if (!var1.IROCHOHCORHCOCCCOCHORCICRORIIC(var0.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2).RRICIOOORRIORHHICIRCIOCHRHRCHH())) {
         return false;
      }

      ParameterizedType var3 = IIRHCHHOICHRICOOCRORCCIOOIHOIR(var2);
      if (var3 != null && Objects.equals(var1.RRICIOOORRIORHHICIRCIOCHRHRCHH(), var3.getRawType())) {
         Type[] var4 = var3.getActualTypeArguments();
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var5 = var1.HOHCHIIHCCCCHCOORROOHHOIIRIHRH();
         if (var5.size() != var4.length) {
            return false;
         }

         for (int var6 = 0; var6 < var5.size(); var6++) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var7 = var5.IIHOCOIHHIROCHIHHCCCORRCOHCHRC(
               var6
            );
            Type var8 = var4[var6];
            if (!RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var7, var8)) {
               return false;
            }
         }
      }

      return true;
   }

   private static TypeVariable<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TypeVariable<?>[] var0, String var1) {
      if (var0 != null && var1 != null) {
         for (TypeVariable var5 : var0) {
            if (var1.equals(var5.getName())) {
               return var5;
            }
         }

         return null;
      } else {
         return null;
      }
   }
}
