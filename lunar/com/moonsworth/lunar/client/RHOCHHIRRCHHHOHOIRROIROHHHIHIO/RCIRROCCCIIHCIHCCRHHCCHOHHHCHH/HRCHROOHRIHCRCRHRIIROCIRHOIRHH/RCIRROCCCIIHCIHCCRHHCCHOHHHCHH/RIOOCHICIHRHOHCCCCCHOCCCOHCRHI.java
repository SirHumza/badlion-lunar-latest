package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.eliotlash.molang.ast.Evaluatable;
import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleOpenHashMap;
import java.util.List;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends Function {
   private final Evaluatable OIIICHOHHIIRHHOOHRICHRCIRICCOR;
   private final List<Expr.Access> args;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(String var1, Evaluatable var2, List<Expr.Access> var3) {
      super(var1);
      this.OIIICHOHHIIRHHOOHRICHRCIRICCOR = var2;
      this.args = var3;
   }

   @Override
   public int getRequiredArguments() {
      return this.args.size();
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      Object2DoubleMap var3 = var2.functionScopedArguments;
      Object2DoubleOpenHashMap var4 = new Object2DoubleOpenHashMap();

      for (int var5 = 0; var5 < this.args.size(); var5++) {
         Expr.Access var6 = this.args.get(var5);
         double var7 = this.evaluateArgument(var1, var2, var5);
         var4.put(var6, var7);
      }

      var2.functionScopedArguments = var4;
      double var9 = this.OIIICHOHHIIRHHOOHRICHRCIRICCOR.evaluate(var2.getEvaluator());
      var2.functionScopedArguments = var3;
      return var9;
   }

   @Override
   public boolean isConstant() {
      return false;
   }
}
