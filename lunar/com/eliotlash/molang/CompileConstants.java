package com.eliotlash.molang;

import com.eliotlash.molang.ast.Expr;
import java.util.HashMap;
import java.util.Map;

public class CompileConstants {
   public Map<String, Expr.Constant> constants = new HashMap<>();

   public CompileConstants() {
      this.registerConstant("math.pi", Math.PI);
   }

   public void registerConstant(String var1, double var2) {
      this.constants.put(var1, new Expr.Constant(var2));
   }

   public Expr get(String var1) {
      return this.constants.get(var1);
   }
}
