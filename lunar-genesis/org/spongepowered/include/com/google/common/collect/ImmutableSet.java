package org.spongepowered.include.com.google.common.collect;

import java.util.Arrays;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.spongepowered.include.com.google.errorprone.annotations.concurrent.LazyInit;
import org.spongepowered.include.com.google.j2objc.annotations.RetainedWith;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
   @LazyInit
   @RetainedWith
   private transient ImmutableList<E> asList;

   public static <E> ImmutableSet<E> of() {
      return (ImmutableSet<E>)RegularImmutableSet.EMPTY;
   }

   public static <E> ImmutableSet<E> of(E var0) {
      return new SingletonImmutableSet<>((E)var0);
   }

   public static <E> ImmutableSet<E> of(E var0, E var1) {
      return construct(2, var0, var1);
   }

   public static <E> ImmutableSet<E> of(E var0, E var1, E var2, E var3) {
      return construct(4, var0, var1, var2, var3);
   }

   @SafeVarargs
   public static <E> ImmutableSet<E> of(E var0, E var1, E var2, E var3, E var4, E var5, E... var6) {
      byte var7 = 6;
      Object[] var8 = new Object[6 + var6.length];
      var8[0] = var0;
      var8[1] = var1;
      var8[2] = var2;
      var8[3] = var3;
      var8[4] = var4;
      var8[5] = var5;
      System.arraycopy(var6, 0, var8, 6, var6.length);
      return construct(var8.length, var8);
   }

   private static <E> ImmutableSet<E> construct(int var0, Object... var1) {
      switch (var0) {
         case 0:
            return of();
         case 1:
            Object var13 = var1[0];
            return of((E)var13);
         default:
            int var2 = chooseTableSize(var0);
            Object[] var3 = new Object[var2];
            int var4 = var2 - 1;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;

            for (; var7 < var0; var7++) {
               Object var8 = ObjectArrays.checkElementNotNull(var1[var7], var7);
               int var9 = var8.hashCode();
               int var10 = Hashing.smear(var9);

               while (true) {
                  int var11 = var10 & var4;
                  Object var12 = var3[var11];
                  if (var12 == null) {
                     var1[var6++] = var8;
                     var3[var11] = var8;
                     var5 += var9;
                     break;
                  }

                  if (var12.equals(var8)) {
                     break;
                  }

                  var10++;
               }
            }

            Arrays.fill(var1, var6, var0, null);
            if (var6 == 1) {
               Object var15 = var1[0];
               return new SingletonImmutableSet<>((E)var15, var5);
            } else if (var2 != chooseTableSize(var6)) {
               return construct(var6, var1);
            } else {
               Object[] var14 = var6 < var1.length ? Arrays.copyOf(var1, var6) : var1;
               return new RegularImmutableSet<>(var14, var5, var3, var4);
            }
      }
   }

   static int chooseTableSize(int var0) {
      if (var0 >= 751619276) {
         Preconditions.checkArgument(var0 < 1073741824, "collection too large");
         return 1073741824;
      }

      int var1 = Integer.highestOneBit(var0 - 1) << 1;

      while (var1 * 0.7 < var0) {
         var1 <<= 1;
      }

      return var1;
   }

   public static <E> ImmutableSet<E> copyOf(E[] var0) {
      switch (var0.length) {
         case 0:
            return of();
         case 1:
            return of((E)var0[0]);
         default:
            return construct(var0.length, (Object[])var0.clone());
      }
   }

   ImmutableSet() {
   }

   boolean isHashCodeFast() {
      return false;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return var1 instanceof ImmutableSet && this.isHashCodeFast() && ((ImmutableSet)var1).isHashCodeFast() && this.hashCode() != var1.hashCode()
            ? false
            : Sets.equalsImpl(this, var1);
      }
   }

   @Override
   public int hashCode() {
      return Sets.hashCodeImpl(this);
   }

   @Override
   public abstract UnmodifiableIterator<E> iterator();

   @Override
   public ImmutableList<E> asList() {
      ImmutableList var1 = this.asList;
      return var1 == null ? (this.asList = this.createAsList()) : var1;
   }

   ImmutableList<E> createAsList() {
      return new RegularImmutableAsList<>(this, this.toArray());
   }

   public static <E> ImmutableSet.Builder<E> builder() {
      return new ImmutableSet.Builder<>();
   }

   public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
      public Builder() {
         this(4);
      }

      Builder(int var1) {
         super(var1);
      }

      @CanIgnoreReturnValue
      public ImmutableSet.Builder<E> add(E var1) {
         super.add((E)var1);
         return this;
      }

      @CanIgnoreReturnValue
      public ImmutableSet.Builder<E> add(E... var1) {
         super.add((E[])var1);
         return this;
      }

      @CanIgnoreReturnValue
      public ImmutableSet.Builder<E> addAll(Iterable<? extends E> var1) {
         super.addAll(var1);
         return this;
      }

      public ImmutableSet<E> build() {
         ImmutableSet var1 = ImmutableSet.construct(this.size, this.contents);
         this.size = var1.size();
         return var1;
      }
   }

   abstract static class Indexed<E> extends ImmutableSet<E> {
      abstract E get(int var1);

      @Override
      public UnmodifiableIterator<E> iterator() {
         return this.asList().iterator();
      }

      @Override
      public Spliterator<E> spliterator() {
         return CollectSpliterators.indexed(this.size(), 1297, this::get);
      }

      @Override
      public void forEach(Consumer<? super E> var1) {
         Preconditions.checkNotNull(var1);
         int var2 = this.size();

         for (int var3 = 0; var3 < var2; var3++) {
            var1.accept(this.get(var3));
         }
      }

      @Override
      ImmutableList<E> createAsList() {
         return new ImmutableAsList<E>() {
            @Override
            public E get(int var1) {
               return (E)Indexed.this.get(var1);
            }

            ImmutableSet.Indexed<E> delegateCollection() {
               return Indexed.this;
            }
         };
      }
   }
}
