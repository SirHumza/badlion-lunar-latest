package net.kyori.examination;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ExaminableProperty {
   private ExaminableProperty() {
   }

   @NotNull
   public abstract String name();

   @NotNull
   public abstract <R> R examine(@NotNull Examiner<? extends R> var1);

   @Override
   public String toString() {
      return "ExaminableProperty{" + this.name() + "}";
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, @Nullable final Object var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, @Nullable final String var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final boolean var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final boolean[] var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final byte var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final byte[] var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final char var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final char[] var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final double var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final double[] var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final float var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final float[] var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final int var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final int[] var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final long var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final long[] var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final short var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }

   @NotNull
   public static ExaminableProperty of(@NotNull final String var0, final short[] var1) {
      return new ExaminableProperty() {
         @NotNull
         @Override
         public String name() {
            return var0;
         }

         @NotNull
         @Override
         public <R> R examine(@NotNull Examiner<? extends R> var1x) {
            return (R)var1x.examine(var1);
         }
      };
   }
}
