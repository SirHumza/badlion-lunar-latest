package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.HashSet;
import java.util.Set;
import lombok.Generated;

public enum HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   ADD("+", 1) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 + var3;
      }
   },
   SUB("-", 1) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 - var3;
      }
   },
   MUL("*", 2) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 * var3;
      }
   },
   DIV("/", 2) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 / (var3 == 0.0 ? 1.0 : var3);
      }
   },
   MOD("%", 2) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 % var3;
      }
   },
   POW("^", 3) {
      @Override
      public double calculate(double var1, double var3) {
         return Math.pow(var1, var3);
      }
   },
   AND("&&", 5) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 != 0.0 && var3 != 0.0 ? 1.0 : 0.0;
      }
   },
   OR("||", 5) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 == 0.0 && var3 == 0.0 ? 0.0 : 1.0;
      }
   },
   LESS("<", 5) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 < var3 ? 1.0 : 0.0;
      }
   },
   LESS_THAN("<=", 5) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 <= var3 ? 1.0 : 0.0;
      }
   },
   GREATER_THAN(">=", 5) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 >= var3 ? 1.0 : 0.0;
      }
   },
   GREATER(">", 5) {
      @Override
      public double calculate(double var1, double var3) {
         return var1 > var3 ? 1.0 : 0.0;
      }
   },
   EQUALS("==", 5) {
      @Override
      public double calculate(double var1, double var3) {
         return equals(var1, var3) ? 1.0 : 0.0;
      }
   },
   NOT_EQUALS("!=", 5) {
      @Override
      public double calculate(double var1, double var3) {
         return !equals(var1, var3) ? 1.0 : 0.0;
      }
   };

   public static final Set<String> OPERATORS = new HashSet<>();
   public final String sign;
   public final int value;

   public static boolean equals(double var0, double var2) {
      return Math.abs(var0 - var2) < 1.0E-5;
   }

   public static boolean isTrue(double var0) {
      return !equals(var0, 0.0);
   }

   public abstract double calculate(double var1, double var3);

   @Generated
   HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var3, int var4) {
      this.sign = var3;
      this.value = var4;
   }

   static {
      for (HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 : values()) {
         OPERATORS.add(var3.sign);
      }
   }
}
