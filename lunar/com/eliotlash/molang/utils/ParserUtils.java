package com.eliotlash.molang.utils;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.variables.VariableFlavor;

public class ParserUtils {
   public static Expr.Variable createVariableFromString(String var0) {
      return VariableFlavor.parse(var0) == null ? new Expr.Variable(null, var0) : new Expr.Variable(VariableFlavor.parse(var0), null);
   }
}
