package org.spongepowered.include.com.google.common.base;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public class Joiner {
   private final String separator;

   public static Joiner on(String var0) {
      return new Joiner(var0);
   }

   public static Joiner on(char var0) {
      return new Joiner(String.valueOf(var0));
   }

   private Joiner(String var1) {
      this.separator = Preconditions.checkNotNull(var1);
   }

   private Joiner(Joiner var1) {
      this.separator = var1.separator;
   }

   @CanIgnoreReturnValue
   public <A extends Appendable> A appendTo(A var1, Iterator<?> var2) {
      Preconditions.checkNotNull(var1);
      if (var2.hasNext()) {
         var1.append(this.toString(var2.next()));

         while (var2.hasNext()) {
            var1.append(this.separator);
            var1.append(this.toString(var2.next()));
         }
      }

      return (A)var1;
   }

   @CanIgnoreReturnValue
   public final StringBuilder appendTo(StringBuilder var1, Iterator<?> var2) {
      try {
         this.appendTo((StringBuilder)var1, var2);
         return var1;
      } catch (IOException var4) {
         throw new AssertionError(var4);
      }
   }

   public final String join(Iterable<?> var1) {
      return this.join(var1.iterator());
   }

   public final String join(Iterator<?> var1) {
      return this.appendTo(new StringBuilder(), var1).toString();
   }

   public final String join(Object[] var1) {
      return this.join(Arrays.asList(var1));
   }

   public Joiner useForNull(final String var1) {
      Preconditions.checkNotNull(var1);
      return new Joiner(this) {
         @Override
         CharSequence toString(@Nullable Object var1x) {
            return var1x == null ? var1 : Joiner.this.toString(var1x);
         }

         @Override
         public Joiner useForNull(String var1x) {
            throw new UnsupportedOperationException("already specified useForNull");
         }
      };
   }

   public Joiner.MapJoiner withKeyValueSeparator(String var1) {
      return new Joiner.MapJoiner(this, var1);
   }

   CharSequence toString(Object var1) {
      Preconditions.checkNotNull(var1);
      return var1 instanceof CharSequence ? (CharSequence)var1 : var1.toString();
   }

   public static final class MapJoiner {
      private final Joiner joiner;
      private final String keyValueSeparator;

      private MapJoiner(Joiner var1, String var2) {
         this.joiner = var1;
         this.keyValueSeparator = Preconditions.checkNotNull(var2);
      }

      @CanIgnoreReturnValue
      public StringBuilder appendTo(StringBuilder var1, Map<?, ?> var2) {
         return this.appendTo(var1, var2.entrySet());
      }

      @CanIgnoreReturnValue
      public <A extends Appendable> A appendTo(A var1, Iterator<? extends Entry<?, ?>> var2) {
         Preconditions.checkNotNull(var1);
         if (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            var1.append(this.joiner.toString(var3.getKey()));
            var1.append(this.keyValueSeparator);
            var1.append(this.joiner.toString(var3.getValue()));

            while (var2.hasNext()) {
               var1.append(this.joiner.separator);
               Entry var4 = (Entry)var2.next();
               var1.append(this.joiner.toString(var4.getKey()));
               var1.append(this.keyValueSeparator);
               var1.append(this.joiner.toString(var4.getValue()));
            }
         }

         return (A)var1;
      }

      @CanIgnoreReturnValue
      public StringBuilder appendTo(StringBuilder var1, Iterable<? extends Entry<?, ?>> var2) {
         return this.appendTo(var1, var2.iterator());
      }

      @CanIgnoreReturnValue
      public StringBuilder appendTo(StringBuilder var1, Iterator<? extends Entry<?, ?>> var2) {
         try {
            this.appendTo((StringBuilder)var1, var2);
            return var1;
         } catch (IOException var4) {
            throw new AssertionError(var4);
         }
      }
   }
}
