package com.eliotlash.molang.variables;

import com.eliotlash.molang.ConstantFunctions;
import com.eliotlash.molang.ast.Assignable;
import com.eliotlash.molang.ast.Evaluator;
import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.functions.FunctionDefinition;
import com.eliotlash.molang.functions.classic.Abs;
import com.eliotlash.molang.functions.classic.Acos;
import com.eliotlash.molang.functions.classic.Asin;
import com.eliotlash.molang.functions.classic.Atan;
import com.eliotlash.molang.functions.classic.Atan2;
import com.eliotlash.molang.functions.classic.Cos;
import com.eliotlash.molang.functions.classic.CosDegrees;
import com.eliotlash.molang.functions.classic.Exp;
import com.eliotlash.molang.functions.classic.Ln;
import com.eliotlash.molang.functions.classic.Mod;
import com.eliotlash.molang.functions.classic.Pow;
import com.eliotlash.molang.functions.classic.Sign;
import com.eliotlash.molang.functions.classic.Sin;
import com.eliotlash.molang.functions.classic.SinDegrees;
import com.eliotlash.molang.functions.classic.Sqrt;
import com.eliotlash.molang.functions.limit.Clamp;
import com.eliotlash.molang.functions.limit.Max;
import com.eliotlash.molang.functions.limit.Min;
import com.eliotlash.molang.functions.rounding.Ceil;
import com.eliotlash.molang.functions.rounding.Floor;
import com.eliotlash.molang.functions.rounding.Round;
import com.eliotlash.molang.functions.rounding.Trunc;
import com.eliotlash.molang.functions.strings.Length;
import com.eliotlash.molang.functions.strings.Print;
import com.eliotlash.molang.functions.strings.StrEquals;
import com.eliotlash.molang.functions.strings.StrEqualsIgnoreCase;
import com.eliotlash.molang.functions.utility.DiceRoll;
import com.eliotlash.molang.functions.utility.DiceRollInteger;
import com.eliotlash.molang.functions.utility.Lerp;
import com.eliotlash.molang.functions.utility.LerpRotate;
import com.eliotlash.molang.functions.utility.MinAngle;
import com.eliotlash.molang.functions.utility.Random;
import com.eliotlash.molang.functions.utility.RandomInteger;
import com.eliotlash.molang.utils.MolangUtils;
import com.eliotlash.molang.utils.ParserUtils;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExecutionContext {
   private static final Map<FunctionDefinition, Function> BUILTIN_FUNCTIONS;
   private final Evaluator evaluator;
   public final Stack<Expr.Access> contextStack = new Stack<>();
   public final Map<VariableFlavor, Map<RuntimeVariable, Expr.Access>> flavorCache = new HashMap<>();
   public final Object2DoubleMap<Assignable> assignableMap = new Object2DoubleOpenHashMap();
   public Object2DoubleMap<Assignable> functionScopedArguments = new Object2DoubleOpenHashMap();
   private final Map<FunctionDefinition, Function> functionMap = new HashMap<>();
   private final Object2DoubleMap<RuntimeVariable> variableMap = new Object2DoubleOpenHashMap();
   private final Map<String, RuntimeVariable> variableCache = new HashMap<>();
   private final Object2DoubleMap<Expr.Struct> structMap = new Object2DoubleOpenHashMap();

   public ExecutionContext(Evaluator var1) {
      this.evaluator = var1;
      this.registerFunctions(BUILTIN_FUNCTIONS);
   }

   public Evaluator getEvaluator() {
      return this.evaluator;
   }

   public Object2DoubleMap<RuntimeVariable> getVariableMap() {
      return this.variableMap;
   }

   public Object2DoubleMap<Expr.Struct> getStructMap() {
      return this.structMap;
   }

   public RuntimeVariable getCachedVariable(VariableFlavor var1, String var2) {
      return this.variableCache.computeIfAbsent(var2, var2x -> this.parseRuntimeVariable(var1, var2x, null));
   }

   public RuntimeVariable parseRuntimeVariable(VariableFlavor var1, String var2, Expr.Access var3) {
      RuntimeVariable var4;
      if (var1 != null && var2 != null) {
         var4 = new RuntimeVariable(var1, var2);
      } else if (var1 != null) {
         var4 = new RuntimeVariable(var1, var3.member());
      } else {
         var4 = new RuntimeVariable(null, var2);
      }

      if (var3 != null) {
         if (!this.flavorCache.containsKey(var1)) {
            this.flavorCache.put(var1, new HashMap<>());
         }

         Map var5 = this.flavorCache.get(var1);
         if (!var5.containsKey(var4)) {
            var5.put(var4, var3);
         }
      }

      return var4;
   }

   public void setVariable(VariableFlavor var1, String var2, double var3) {
      RuntimeVariable var5 = this.getCachedVariable(var1, var2);
      this.variableMap.put(var5, var3);
   }

   public void setVariable(VariableFlavor var1, String var2, boolean var3) {
      this.setVariable(var1, var2, MolangUtils.booleanToFloat(var3));
   }

   public void registerFunction(String var1, Function var2) {
      this.registerFunction(asFunctionDefinition(var1, var2), var2);
   }

   public void registerFunction(FunctionDefinition var1, Function var2) {
      this.functionMap.putIfAbsent(var1, var2);
      if (var2.isConstant()) {
         ConstantFunctions.addConstantFunction(var1);
      }
   }

   public void registerFunctions(Map<FunctionDefinition, Function> var1) {
      var1.forEach(this::registerFunction);
   }

   public Function getFunction(FunctionDefinition var1) {
      return this.functionMap.get(var1);
   }

   private static FunctionDefinition asFunctionDefinition(String var0, Function var1) {
      return new FunctionDefinition(ParserUtils.createVariableFromString(var0), var1.getName());
   }

   private static void addFunction(Map<FunctionDefinition, Function> var0, String var1, Function var2) {
      var0.put(asFunctionDefinition(var1, var2), var2);
   }

   static {
      HashMap var0 = new HashMap();
      addFunction(var0, "math", new Abs("abs"));
      addFunction(var0, "math", new CosDegrees("cos"));
      addFunction(var0, "math", new Cos("cosradians"));
      addFunction(var0, "math", new SinDegrees("sin"));
      addFunction(var0, "math", new Sin("sinradians"));
      addFunction(var0, "math", new Sign("sign"));
      addFunction(var0, "math", new Asin("asin"));
      addFunction(var0, "math", new Acos("acos"));
      addFunction(var0, "math", new Atan("atan"));
      addFunction(var0, "math", new Atan2("atan2"));
      addFunction(var0, "math", new Exp("exp"));
      addFunction(var0, "math", new Ln("ln"));
      addFunction(var0, "math", new Mod("mod"));
      addFunction(var0, "math", new Pow("pow"));
      addFunction(var0, "math", new Sqrt("sqrt"));
      addFunction(var0, "math", new Clamp("clamp"));
      addFunction(var0, "math", new Max("max"));
      addFunction(var0, "math", new Min("min"));
      addFunction(var0, "math", new Ceil("ceil"));
      addFunction(var0, "math", new Floor("floor"));
      addFunction(var0, "math", new Round("round"));
      addFunction(var0, "math", new Trunc("trunc"));
      addFunction(var0, "math", new Lerp("lerp"));
      addFunction(var0, "math", new LerpRotate("lerprotate"));
      addFunction(var0, "math", new MinAngle("min_angle"));
      addFunction(var0, "math", new Random("random"));
      addFunction(var0, "math", new RandomInteger("random_integer"));
      addFunction(var0, "math", new DiceRoll("dice_roll"));
      addFunction(var0, "math", new DiceRollInteger("dice_roll_integer"));
      addFunction(var0, "system", new Print("print"));
      addFunction(var0, "string", new StrEquals("equals"));
      addFunction(var0, "string", new StrEqualsIgnoreCase("equalsIgnoreCase"));
      addFunction(var0, "string", new Length("length"));
      BUILTIN_FUNCTIONS = Map.copyOf(var0);
   }
}
