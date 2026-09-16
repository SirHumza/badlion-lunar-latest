package org.spongepowered.include.com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.common.base.Throwables;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class Closer implements Closeable {
   private static final Closer.Suppressor SUPPRESSOR = Closer.SuppressingSuppressor.isAvailable()
      ? Closer.SuppressingSuppressor.INSTANCE
      : Closer.LoggingSuppressor.INSTANCE;
   final Closer.Suppressor suppressor;
   private final Deque<Closeable> stack = new ArrayDeque<>(4);
   private Throwable thrown;

   public static Closer create() {
      return new Closer(SUPPRESSOR);
   }

   Closer(Closer.Suppressor var1) {
      this.suppressor = Preconditions.checkNotNull(var1);
   }

   @CanIgnoreReturnValue
   public <C extends Closeable> C register(@Nullable C var1) {
      if (var1 != null) {
         this.stack.addFirst(var1);
      }

      return (C)var1;
   }

   public RuntimeException rethrow(Throwable var1) {
      Preconditions.checkNotNull(var1);
      this.thrown = var1;
      Throwables.propagateIfPossible(var1, IOException.class);
      throw new RuntimeException(var1);
   }

   @Override
   public void close() {
      Throwable var1 = this.thrown;

      while (!this.stack.isEmpty()) {
         Closeable var2 = this.stack.removeFirst();

         try {
            var2.close();
         } catch (Throwable var4) {
            if (var1 == null) {
               var1 = var4;
            } else {
               this.suppressor.suppress(var2, var1, var4);
            }
         }
      }

      if (this.thrown == null && var1 != null) {
         Throwables.propagateIfPossible(var1, IOException.class);
         throw new AssertionError(var1);
      }
   }

   static final class LoggingSuppressor implements Closer.Suppressor {
      static final Closer.LoggingSuppressor INSTANCE = new Closer.LoggingSuppressor();

      @Override
      public void suppress(Closeable var1, Throwable var2, Throwable var3) {
         Closeables.logger.log(Level.WARNING, "Suppressing exception thrown when closing " + var1, var3);
      }
   }

   static final class SuppressingSuppressor implements Closer.Suppressor {
      static final Closer.SuppressingSuppressor INSTANCE = new Closer.SuppressingSuppressor();
      static final Method addSuppressed = getAddSuppressed();

      static boolean isAvailable() {
         return addSuppressed != null;
      }

      private static Method getAddSuppressed() {
         try {
            return Throwable.class.getMethod("addSuppressed", Throwable.class);
         } catch (Throwable var1) {
            return null;
         }
      }

      @Override
      public void suppress(Closeable var1, Throwable var2, Throwable var3) {
         if (var2 != var3) {
            try {
               addSuppressed.invoke(var2, var3);
            } catch (Throwable var5) {
               Closer.LoggingSuppressor.INSTANCE.suppress(var1, var2, var3);
            }
         }
      }
   }

   interface Suppressor {
      void suppress(Closeable var1, Throwable var2, Throwable var3);
   }
}
