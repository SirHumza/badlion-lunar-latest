package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public class IIRHCHHOICHRICOOCRORCCIOOIHOIR implements Closeable {
   private static final Logger ORHCICIOHIRRCHCRHRIRRORICCORHR = Logger.getLogger(IIRHCHHOICHRICOOCRORCCIOOIHOIR.class.getName());
   private static final String CIHHHRROOORCROIRIIRIRRHHRRIROO = "com.moonsworth.lunar.genesis.lib.google.common.base.internal.Finalizer";
   private static final Method IOHHIIHRCHRRRRCCRRHOCIOIRRHOIO;
   final ReferenceQueue<Object> ROCHICCCOIHOIRCIRRROOOROIIICRC = new ReferenceQueue<>();
   final PhantomReference<Object> RRRIHRIRCOHHHHCCCRRHOOOOCOORIO = new PhantomReference<>(this, this.ROCHICCCOIHOIRCIRRROOOROIIICRC);
   final boolean CORRHIRHHCIHHOIRIIHCHIIROHHRIO;

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR() {
      boolean var1 = false;

      try {
         IOHHIIHRCHRRRRCCRRHOCIOIRRHOIO.invoke(
            null, IHHCHHHCRIHOOCOIOOCRIIICIOROIR.class, this.ROCHICCCOIHOIRCIRRROOOROIIICRC, this.RRRIHRIRCOHHHHCCCRRHOOOOCOORIO
         );
         var1 = true;
      } catch (IllegalAccessException var3) {
         throw new AssertionError(var3);
      } catch (Throwable var4) {
         ORHCICIOHIRRCHCRHRIRRORICCORHR.log(
            Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", var4
         );
      }

      this.CORRHIRHHCIHHOIRIIHCHIIROHHRIO = var1;
   }

   @Override
   public void close() {
      this.RRRIHRIRCOHHHHCCCRRHOOOOCOORIO.enqueue();
      this.cleanUp();
   }

   void cleanUp() {
      if (!this.CORRHIRHHCIHHOIRIIHCHIIROHHRIO) {
         Reference var1;
         while ((var1 = this.ROCHICCCOIHOIRCIRRROOOROIIICRC.poll()) != null) {
            var1.clear();

            try {
               ((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var1).finalizeReferent();
            } catch (Throwable var3) {
               ORHCICIOHIRRCHCRHRIRRORICCORHR.log(Level.SEVERE, "Error cleaning up after reference.", var3);
            }
         }
      }
   }

   private static Class<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH... var0) {
      for (IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : var0) {
         Class var5 = var4.loadFinalizer();
         if (var5 != null) {
            return var5;
         }
      }

      throw new AssertionError();
   }

   static Method getStartFinalizer(Class<?> var0) {
      try {
         return var0.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
      } catch (NoSuchMethodException var2) {
         throw new AssertionError(var2);
      }
   }

   static {
      Class var0 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         new IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRRRICCRROCOHHOHIICIHORCOORRRH(),
         new IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(),
         new IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH()
      );
      IOHHIIHRCHRRRRCCRRHOCIOIRRHOIO = getStartFinalizer(var0);
   }

   static class CRRRICCRROCOHHOHIICIHORCOORRRH implements IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
      static boolean disabled;

      @Override
      public @Nullable Class<?> loadFinalizer() {
         if (disabled) {
            return null;
         }

         ClassLoader var1;
         try {
            var1 = ClassLoader.getSystemClassLoader();
         } catch (SecurityException var4) {
            IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHCICIOHIRRCHCRHRIRRORICCORHR.info("Not allowed to access system class loader.");
            return null;
         }

         if (var1 != null) {
            try {
               return var1.loadClass("com.moonsworth.lunar.genesis.lib.google.common.base.internal.Finalizer");
            } catch (ClassNotFoundException var3) {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   interface HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      @Nullable Class<?> loadFinalizer();
   }

   static class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      @Override
      public Class<?> loadFinalizer() {
         try {
            return Class.forName(
               "com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH"
            );
         } catch (ClassNotFoundException var2) {
            throw new AssertionError(var2);
         }
      }
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private static final String COCHHCOCOCORRHICIRRHHIRROOCIRR = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

      @Override
      public @Nullable Class<?> loadFinalizer() {
         try {
            URLClassLoader var1 = this.newLoader(this.getBaseUrl());
            return var1.loadClass("com.moonsworth.lunar.genesis.lib.google.common.base.internal.Finalizer");
         } catch (Exception var2) {
            IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHCICIOHIRRCHCRHRIRRORICCORHR
               .log(
                  Level.WARNING,
                  "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.",
                  var2
               );
            return null;
         }
      }

      URL getBaseUrl() {
         String var1 = "com.moonsworth.lunar.genesis.lib.google.common.base.internal.Finalizer".replace('.', '/') + ".class";
         URL var2 = this.getClass().getClassLoader().getResource(var1);
         if (var2 == null) {
            throw new FileNotFoundException(var1);
         }

         String var3 = var2.toString();
         if (!var3.endsWith(var1)) {
            throw new IOException("Unsupported path style: " + var3);
         }

         var3 = var3.substring(0, var3.length() - var1.length());
         return new URL(var2, var3);
      }

      URLClassLoader newLoader(URL var1) {
         return new URLClassLoader(new URL[]{var1}, null);
      }
   }
}
