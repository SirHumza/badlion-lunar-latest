package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO;

import com.eliotlash.molang.ast.Accessible;
import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.FunctionDefinition;
import java.util.ArrayList;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Expr.Access var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.target(), var0.member());
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Expr.Call var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.target(), var0.member());
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FunctionDefinition var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.target(), var0.member());
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Expr.Variable var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null);
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Accessible var0, String var1) {
      if (var0 instanceof Expr.Variable var2) {
         ArrayList var3 = new ArrayList();
         if (var2.flavor() != null) {
            var3.add(var2.flavor().name);
         }

         if (var2.name() != null) {
            var3.add(var2.name().toLowerCase());
         }

         if (var1 != null) {
            var3.add(var1.toLowerCase());
         }

         return String.join(".", var3);
      } else {
         throw new IllegalArgumentException("Not a variable access");
      }
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public static boolean epsilonEquals(double var0, double var2) {
      return epsilonEquals(var0, var2, 1.0E-5);
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public static boolean epsilonEquals(double var0, double var2, double var4) {
      return Math.abs(var0 - var2) < var4;
   }
}
