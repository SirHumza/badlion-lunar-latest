package org.spongepowered.asm.util;

public final class Quantifier {
   public static Quantifier DEFAULT = new Quantifier(0, -1);
   public static Quantifier NONE = new Quantifier(0, 0);
   public static Quantifier SINGLE = new Quantifier(0, 1);
   public static Quantifier ANY = new Quantifier(0, Integer.MAX_VALUE);
   public static Quantifier PLUS = new Quantifier(1, Integer.MAX_VALUE);
   private final int min;
   private final int max;

   public Quantifier(int var1, int var2) {
      this.min = var1;
      this.max = var2;
   }

   public boolean isDefault() {
      return this.min == 0 && this.max < 0;
   }

   public int getMin() {
      return this.min;
   }

   public int getMax() {
      return this.max;
   }

   public int getClampedMin() {
      return Math.max(0, this.min);
   }

   public int getClampedMax() {
      return this.max < 0 ? 1 : Math.max(this.min, this.max);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("{");
      if (this.min == this.max) {
         var1.append(this.min);
      } else {
         if (this.max < this.min) {
            return "";
         }

         if (this.min == 0) {
            if (this.max == 1) {
               return "";
            }

            if (this.max == Integer.MAX_VALUE) {
               return "*";
            }
         }

         if (this.min == 1 && this.max == Integer.MAX_VALUE) {
            return "+";
         }

         if (this.min > 0) {
            var1.append(this.min);
         }

         if (this.min >= 0) {
            var1.append(',');
         }

         if (this.max < Integer.MAX_VALUE) {
            var1.append(this.max);
         }
      }

      return var1.append('}').toString();
   }

   public static Quantifier parse(String var0) {
      if (var0 == null || (var0 = var0.trim()).length() == 0) {
         return DEFAULT;
      }

      if ("*".equals(var0)) {
         return ANY;
      }

      if ("+".equals(var0)) {
         return PLUS;
      }

      if (var0.startsWith("{") && var0.endsWith("}") && var0.length() >= 3) {
         String var1 = var0.substring(1, var0.length() - 1).trim();
         if (var1.isEmpty()) {
            return NONE;
         }

         String var2 = var1;
         String var3 = var1;
         int var4 = var1.indexOf(44);
         if (var4 > -1) {
            var2 = var1.substring(0, var4).trim();
            var3 = var1.substring(var4 + 1).trim();
         }

         try {
            int var5 = var2.length() > 0 ? Integer.parseInt(var2) : 0;
            int var6 = var3.length() > 0 ? Integer.parseInt(var3) : Integer.MAX_VALUE;
            return new Quantifier(var5, var6);
         } catch (NumberFormatException var7) {
            return NONE;
         }
      } else {
         return NONE;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof Quantifier) {
         Quantifier var3 = (Quantifier)var1;
         return var3.min == this.min && var3.max == this.max;
      }

      if (!(var1 instanceof Number)) {
         return false;
      }

      int var2 = ((Number)var1).intValue();
      return var2 == this.min && var2 == this.max;
   }

   @Override
   public int hashCode() {
      return 31 * this.min * this.max;
   }
}
