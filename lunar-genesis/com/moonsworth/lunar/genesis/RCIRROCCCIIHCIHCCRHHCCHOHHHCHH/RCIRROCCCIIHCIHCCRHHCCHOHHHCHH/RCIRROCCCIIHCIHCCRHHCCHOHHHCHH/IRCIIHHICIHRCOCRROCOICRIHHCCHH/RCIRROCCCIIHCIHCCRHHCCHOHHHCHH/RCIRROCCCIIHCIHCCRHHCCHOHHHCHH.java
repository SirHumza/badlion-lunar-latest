package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Runnable {
   private static final Logger RRIRCCRORHCRCCCROICICCIIIOOOHI = Logger.getLogger(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getName());
   private static final String HOHOHHORRRIRCRIRIIRHRROOHIHRHC = "com.moonsworth.lunar.genesis.lib.google.common.base.FinalizableReference";
   private final WeakReference<Class<?>> RHRCRCRIOHICORRCCCHIORRICRIOIH;
   private final PhantomReference<Object> HCHHCHIOCRRICCCOCOIOHRIOROHCOH;
   private final ReferenceQueue<Object> OCRHHHHRRCIRRCCRHROHIIORRIRROC;
   private static final @Nullable Constructor<Thread> ICCCHRHRROHRIOIRIOOROOHICHRIHC = getBigThreadConstructor();
   private static final @Nullable Field RHRIOROCHHCHIHIRRCORRHOHOOCOHR = ICCCHRHRROHRIOIRIOOROOHICHRIHC == null ? getInheritableThreadLocalsField() : null;

   public static void startFinalizer(Class<?> var0, ReferenceQueue<Object> var1, PhantomReference<Object> var2) {
      if (!var0.getName().equals("com.moonsworth.lunar.genesis.lib.google.common.base.FinalizableReference")) {
         throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
      String var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getName();
      Thread var5 = null;
      if (ICCCHRHRROHRIOIRIOOROOHICHRIHC != null) {
         try {
            boolean var6 = false;
            long var7 = 0L;
            var5 = ICCCHRHRROHRIOIRIOOROOHICHRIHC.newInstance((ThreadGroup)null, var3, var4, var7, var6);
         } catch (Throwable var10) {
            RRIRCCRORHCRCCCROICICCIIIOOOHI.log(Level.INFO, "Failed to create a thread without inherited thread-local values", var10);
         }
      }

      if (var5 == null) {
         var5 = new Thread((ThreadGroup)null, var3, var4);
      }

      var5.setDaemon(true);

      try {
         if (RHRIOROCHHCHIHIRRCORRHOHOOCOHR != null) {
            RHRIOROCHHCHIHIRRCORRHOHOOCOHR.set(var5, null);
         }
      } catch (Throwable var9) {
         RRIRCCRORHCRCCCROICICCIIIOOOHI.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", var9);
      }

      var5.start();
   }

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var1, ReferenceQueue<Object> var2, PhantomReference<Object> var3) {
      this.OCRHHHHRRCIRRCCRHROHIIORRIRROC = var2;
      this.RHRCRCRIOHICORRCCCHIORRICRIOIH = new WeakReference<>(var1);
      this.HCHHCHIOCRRICCCOCOIOHRIOROHCOH = var3;
   }

   @Override
   public void run() {
      while (true) {
         try {
            if (!this.cleanUp(this.OCRHHHHRRCIRRCCRHROHIIORRIRROC.remove())) {
               return;
            }
         } catch (InterruptedException var2) {
         }
      }
   }

   private boolean cleanUp(Reference<?> var1) {
      Method var2 = this.getFinalizeReferentMethod();
      if (var2 == null) {
         return false;
      }

      do {
         var1.clear();
         if (var1 == this.HCHHCHIOCRRICCCOCOIOHRIOROHCOH) {
            return false;
         }

         try {
            var2.invoke(var1);
         } catch (Throwable var4) {
            RRIRCCRORHCRCCCROICICCIIIOOOHI.log(Level.SEVERE, "Error cleaning up after reference.", var4);
         }
      } while ((var1 = this.OCRHHHHRRCIRRCCRHROHIIORRIRROC.poll()) != null);

      return true;
   }

   private @Nullable Method getFinalizeReferentMethod() {
      Class var1 = this.RHRCRCRIOHICORRCCCHIORRICRIOIH.get();
      if (var1 == null) {
         return null;
      }

      try {
         return var1.getMethod("finalizeReferent");
      } catch (NoSuchMethodException var3) {
         throw new AssertionError(var3);
      }
   }

   private static @Nullable Field getInheritableThreadLocalsField() {
      try {
         Field var0 = Thread.class.getDeclaredField("inheritableThreadLocals");
         var0.setAccessible(true);
         return var0;
      } catch (Throwable var1) {
         RRIRCCRORHCRCCCROICICCIIIOOOHI.log(
            Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values."
         );
         return null;
      }
   }

   private static @Nullable Constructor<Thread> getBigThreadConstructor() {
      try {
         return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, long.class, boolean.class);
      } catch (Throwable var1) {
         return null;
      }
   }
}
