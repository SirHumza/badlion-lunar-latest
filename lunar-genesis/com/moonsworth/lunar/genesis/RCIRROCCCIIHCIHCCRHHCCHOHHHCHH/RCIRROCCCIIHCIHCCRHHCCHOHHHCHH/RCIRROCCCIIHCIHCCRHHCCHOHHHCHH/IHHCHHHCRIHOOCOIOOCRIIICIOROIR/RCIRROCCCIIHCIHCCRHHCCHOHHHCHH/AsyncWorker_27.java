package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ICRHCCCCOIICOCHHCRCOOIHICROIHI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IOHCCIRCCICICHHHIOIOHCICICROIO;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class ORCOCORROHIROCCIORORRRRCHIOOCH implements RHRIIOOOCRHIIOORCOCRCHRCCRRCIH {
   private final ExecutorService CHCRCOHCRRHHOCHRIIIRRCICHRORIC;

   private ORCOCORROHIROCCIORORRRRCHIOOCH(ExecutorService var1) {
      this.CHCRCOHCRRHHOCHRIIIRRCICHRORIC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   public static ORCOCORROHIROCCIORORRRRCHIOOCH IRCIIHHICIHRCOCRROCOICRIHHCCHH(ExecutorService var0) {
      return new ORCOCORROHIROCCIORORRRRCHIOOCH(var0);
   }

   @Override
   public <T> T newProxy(final T var1, Class<T> var2, final long var3, final TimeUnit var5) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var5
      );
      checkPositiveTimeout(var3);
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2.isInterface(), "interfaceType must be an interface type"
      );
      final Set var6 = findInterruptibleMethods(var2);
      InvocationHandler var7 = new InvocationHandler() {
         @Override
         public Object invoke(Object var1x, final Method var2x, final Object[] var3x) {
            Callable var4 = new Callable<Object>() {
               @Override
               public Object call() {
                  try {
                     return var2.invoke(var1, var3x);
                  } catch (InvocationTargetException var2x) {
                     throw ORCOCORROHIROCCIORORRRRCHIOOCH.throwCause(var2x, false);
                  }
               }
            };
            return ORCOCORROHIROCCIORORRRRCHIOOCH.this.callWithTimeout(var4, var3, var5, var6.contains(var2x));
         }
      };
      return newProxy(var2, var7);
   }

   private static <T> T newProxy(Class<T> var0, InvocationHandler var1) {
      Object var2 = Proxy.newProxyInstance(var0.getClassLoader(), new Class[]{var0}, var1);
      return (T)var0.cast(var2);
   }

   private <T> T callWithTimeout(Callable<T> var1, long var2, TimeUnit var4, boolean var5) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var4
      );
      checkPositiveTimeout(var2);
      Future var6 = this.CHCRCOHCRRHHOCHRIIIRRCICHRORIC.submit(var1);

      try {
         if (var5) {
            try {
               return (T)var6.get(var2, var4);
            } catch (InterruptedException var8) {
               var6.cancel(true);
               throw var8;
            }
         } else {
            return IIHHICHCCCOHCHROIRIHICCHHOROCR.getUninterruptibly(var6, var2, var4);
         }
      } catch (ExecutionException var9) {
         throw throwCause(var9, true);
      } catch (TimeoutException var10) {
         var6.cancel(true);
         throw new HRCOCHHHCCIORCORCHIOOOCCCCHICH(var10);
      }
   }

   @CanIgnoreReturnValue
   @Override
   public <T> T callWithTimeout(Callable<T> var1, long var2, TimeUnit var4) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var4
      );
      checkPositiveTimeout(var2);
      Future var5 = this.CHCRCOHCRRHHOCHRIIIRRCICHRORIC.submit(var1);

      try {
         return (T)var5.get(var2, var4);
      } catch (InterruptedException | TimeoutException var7) {
         var5.cancel(true);
         throw var7;
      } catch (ExecutionException var8) {
         this.wrapAndThrowExecutionExceptionOrError(var8.getCause());
         throw new AssertionError();
      }
   }

   @CanIgnoreReturnValue
   @Override
   public <T> T callUninterruptiblyWithTimeout(Callable<T> var1, long var2, TimeUnit var4) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var4
      );
      checkPositiveTimeout(var2);
      Future var5 = this.CHCRCOHCRRHHOCHRIIIRRCICHRORIC.submit(var1);

      try {
         return IIHHICHCCCOHCHROIRIHICCHHOROCR.getUninterruptibly(var5, var2, var4);
      } catch (TimeoutException var7) {
         var5.cancel(true);
         throw var7;
      } catch (ExecutionException var8) {
         this.wrapAndThrowExecutionExceptionOrError(var8.getCause());
         throw new AssertionError();
      }
   }

   @Override
   public void runWithTimeout(Runnable var1, long var2, TimeUnit var4) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var4
      );
      checkPositiveTimeout(var2);
      Future var5 = this.CHCRCOHCRRHHOCHRIIIRRCICHRORIC.submit(var1);

      try {
         var5.get(var2, var4);
      } catch (InterruptedException | TimeoutException var7) {
         var5.cancel(true);
         throw var7;
      } catch (ExecutionException var8) {
         this.wrapAndThrowRuntimeExecutionExceptionOrError(var8.getCause());
         throw new AssertionError();
      }
   }

   @Override
   public void runUninterruptiblyWithTimeout(Runnable var1, long var2, TimeUnit var4) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var4
      );
      checkPositiveTimeout(var2);
      Future var5 = this.CHCRCOHCRRHHOCHRIIIRRCICHRORIC.submit(var1);

      try {
         IIHHICHCCCOHCHROIRIHICCHHOROCR.getUninterruptibly(var5, var2, var4);
      } catch (TimeoutException var7) {
         var5.cancel(true);
         throw var7;
      } catch (ExecutionException var8) {
         this.wrapAndThrowRuntimeExecutionExceptionOrError(var8.getCause());
         throw new AssertionError();
      }
   }

   private static Exception throwCause(Exception var0, boolean var1) {
      Throwable var2 = var0.getCause();
      if (var2 == null) {
         throw var0;
      }

      if (var1) {
         StackTraceElement[] var3 = IOHCCIRCCICICHHHIOIOHCICICROIO.concat(var2.getStackTrace(), var0.getStackTrace(), StackTraceElement.class);
         var2.setStackTrace(var3);
      }

      if (var2 instanceof Exception) {
         throw (Exception)var2;
      } else if (var2 instanceof Error) {
         throw (Error)var2;
      } else {
         throw var0;
      }
   }

   private static Set<Method> findInterruptibleMethods(Class<?> var0) {
      HashSet var1 = ICRHCCCCOIICOCHHCRCOOIHICROIHI.newHashSet();

      for (Method var5 : var0.getMethods()) {
         if (declaresInterruptedEx(var5)) {
            var1.add(var5);
         }
      }

      return var1;
   }

   private static boolean declaresInterruptedEx(Method var0) {
      for (Class var4 : var0.getExceptionTypes()) {
         if (var4 == InterruptedException.class) {
            return true;
         }
      }

      return false;
   }

   private void wrapAndThrowExecutionExceptionOrError(Throwable var1) {
      if (var1 instanceof Error) {
         throw new RIROICHCRROROHCCROOCCCCOCHCCRI((Error)var1);
      } else if (var1 instanceof RuntimeException) {
         throw new OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var1);
      } else {
         throw new ExecutionException(var1);
      }
   }

   private void wrapAndThrowRuntimeExecutionExceptionOrError(Throwable var1) {
      if (var1 instanceof Error) {
         throw new RIROICHCRROROHCCROOCCCCOCHCCRI((Error)var1);
      } else {
         throw new OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var1);
      }
   }

   private static void checkPositiveTimeout(long var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0 > 0L, "timeout must be positive: %s", var0
      );
   }
}
