package com.eliotlash.molang.ast;

import com.eliotlash.molang.lexer.Token;
import com.eliotlash.molang.utils.MathUtils;
import java.util.function.DoubleSupplier;

public enum Operator {
   ADD("+"),
   SUB("-"),
   MUL("*"),
   DIV("/"),
   MOD("%"),
   POW("^"),
   AND("&&"),
   OR("||"),
   LT("<"),
   LEQ("<="),
   GEQ(">="),
   GT(">"),
   EQ("=="),
   NEQ("!=");

   public final String sign;

   Operator(String var3) {
      this.sign = var3;
   }

   public static Operator from(Token var0) {
      return switch (var0.tokenType()) {
         case PLUS -> ADD;
         case MINUS -> SUB;
         case STAR -> MUL;
         case SLASH -> DIV;
         case PERCENT -> MOD;
         case CARET -> POW;
         case AND -> AND;
         case OR -> OR;
         case LESS_THAN -> LT;
         case LESS_EQUAL -> LEQ;
         case GREATER_THAN -> GT;
         case GREATER_EQUAL -> GEQ;
         case EQUAL_EQUAL -> EQ;
         case BANG_EQUAL -> NEQ;
         default -> null;
      };
   }

   public double apply(DoubleSupplier var1, DoubleSupplier var2) {
      return switch (this) {
         case ADD -> var1.getAsDouble() + var2.getAsDouble();
         case SUB -> var1.getAsDouble() - var2.getAsDouble();
         case MUL -> var1.getAsDouble() * var2.getAsDouble();
         case DIV -> var1.getAsDouble() / (var2.getAsDouble() == 0.0 ? 1.0 : var2.getAsDouble());
         case MOD -> var1.getAsDouble() % var2.getAsDouble();
         case POW -> Math.pow(var1.getAsDouble(), var2.getAsDouble());
         case LT -> bool(var1.getAsDouble() < var2.getAsDouble());
         case LEQ -> bool(var1.getAsDouble() <= var2.getAsDouble());
         case GEQ -> bool(var1.getAsDouble() >= var2.getAsDouble());
         case GT -> bool(var1.getAsDouble() > var2.getAsDouble());
         case EQ -> bool(MathUtils.epsilonEquals(var1.getAsDouble(), var2.getAsDouble()));
         case NEQ -> bool(!MathUtils.epsilonEquals(var1.getAsDouble(), var2.getAsDouble()));
         case AND -> bool(var1.getAsDouble() != 0.0 && var2.getAsDouble() != 0.0);
         case OR -> bool(var1.getAsDouble() != 0.0 || var2.getAsDouble() != 0.0);
      };
   }

   public double applyString(String var1, String var2) {
      switch (this) {
         case EQ:
            return bool(var1.equals(var2));
         case NEQ:
            return bool(!var1.equals(var2));
         default:
            return 0.0;
      }
   }

   private static double bool(boolean var0) {
      return var0 ? 1.0 : 0.0;
   }

   public String format(String var1, String var2) {
      return var1 + " " + this.sign + " " + var2;
   }

   @Override
   public String toString() {
      return this.sign;
   }
}
