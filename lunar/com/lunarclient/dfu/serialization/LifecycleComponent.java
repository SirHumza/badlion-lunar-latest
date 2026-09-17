package com.lunarclient.dfu.serialization;

public class Lifecycle {
   private static final Lifecycle STABLE = new Lifecycle() {
      @Override
      public String toString() {
         return "Stable";
      }
   };
   private static final Lifecycle EXPERIMENTAL = new Lifecycle() {
      @Override
      public String toString() {
         return "Experimental";
      }
   };

   private Lifecycle() {
   }

   public static Lifecycle experimental() {
      return EXPERIMENTAL;
   }

   public static Lifecycle stable() {
      return STABLE;
   }

   public static Lifecycle deprecated(int var0) {
      return new Lifecycle.Deprecated(var0);
   }

   public Lifecycle add(Lifecycle var1) {
      if (this == EXPERIMENTAL || var1 == EXPERIMENTAL) {
         return EXPERIMENTAL;
      } else if (this instanceof Lifecycle.Deprecated) {
         return var1 instanceof Lifecycle.Deprecated && ((Lifecycle.Deprecated)var1).since < ((Lifecycle.Deprecated)this).since ? var1 : this;
      } else {
         return var1 instanceof Lifecycle.Deprecated ? var1 : STABLE;
      }
   }

   public static final class Deprecated extends Lifecycle {
      private final int since;

      public Deprecated(int var1) {
         this.since = var1;
      }

      public int since() {
         return this.since;
      }
   }
}
