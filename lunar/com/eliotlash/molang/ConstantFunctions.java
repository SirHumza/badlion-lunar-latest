package com.eliotlash.molang;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.FunctionDefinition;
import java.util.ArrayList;
import java.util.List;

public class ConstantFunctions {
   private static final List<FunctionDefinition> CONSTANT_FUNCTIONS = new ArrayList<>();

   public static boolean isConstant(Expr.Call var0) {
      FunctionDefinition var1 = new FunctionDefinition(var0.target(), var0.member());
      return isFunctionDefinitionConstant(var1) && areArgumentsConstant(var0.arguments());
   }

   public static boolean isFunctionDefinitionConstant(FunctionDefinition var0) {
      return CONSTANT_FUNCTIONS.contains(var0);
   }

   public static boolean areArgumentsConstant(List<Expr> var0) {
      for (Expr var2 : var0) {
         if (!(var2 instanceof Expr.Constant)) {
            return false;
         }
      }

      return true;
   }

   public static void addConstantFunction(FunctionDefinition var0) {
      if (!CONSTANT_FUNCTIONS.contains(var0)) {
         CONSTANT_FUNCTIONS.add(var0);
      }
   }
}
