package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.j2objc.annotations.Weak;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.Nullable;

class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Weak
   private RRCRRCORICCHOHHIRCHIROOHIIOHCO COORCIICHIIICRIOIORCIHIOOHHHIR;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   final Object OHHICRRHOHHRICIORIOHROHCROIHRR;
   private final Method HIORRIIRCIRHCHRRROIOOCRHCOCRRR;
   private final Executor ROHCRCIRIOIROHRRIORHICIHOOIOHR;

   static HRCHROOHRIHCRCRHRIIROCIRHOIRHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, Object var1, Method var2) {
      return isDeclaredThreadSafe(var2)
         ? new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, var1, var2)
         : new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
   }

   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, Object var2, Method var3) {
      this.COORCIICHIIICRIOIORCIHIOOHHHIR = var1;
      this.OHHICRRHOHHRICIORIOHROHCROIHRR = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      this.HIORRIIRCIRHCHRRROIOOCRHCOCRRR = var3;
      var3.setAccessible(true);
      this.ROHCRCIRIOIROHRRIORHICIHOOIOHR = var1.ICOOHCHIHIHORHCOIHORORCRCORCCH();
   }

   final void RORRCRCHIRCHHOOIHCCHRCHORHCICI(final Object var1) {
      this.ROHCRCIRIOIROHRRIORHICIHOOIOHR
         .execute(
            new Runnable() {
               @Override
               public void run() {
                  try {
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.invokeSubscriberMethod(var1);
                  } catch (InvocationTargetException var2) {
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.COORCIICHIIICRIOIORCIHIOOHHHIR
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getCause(), HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.ROCHRRCORRCOOOOOCOICOCROIIHIHH(var1));
                  }
               }
            }
         );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   void invokeSubscriberMethod(Object var1) {
      try {
         this.HIORRIIRCIRHCHRRROIOOCRHCOCRRR.invoke(this.OHHICRRHOHHRICIORIOHROHCROIHRR, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1));
      } catch (IllegalArgumentException var3) {
         throw new Error("Method rejected target/argument: " + var1, var3);
      } catch (IllegalAccessException var4) {
         throw new Error("Method became inaccessible: " + var1, var4);
      } catch (InvocationTargetException var5) {
         if (var5.getCause() instanceof Error) {
            throw (Error)var5.getCause();
         } else {
            throw var5;
         }
      }
   }

   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR ROCHRRCORRCOOOOOCOICOCROIIHIHH(Object var1) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         this.COORCIICHIIICRIOIORCIHIOOHHHIR, var1, this.OHHICRRHOHHRICIORIOHROHCROIHRR, this.HIORRIIRCIRHCHRRROIOOCRHCOCRRR
      );
   }

   @Override
   public final int hashCode() {
      return (31 + this.HIORRIIRCIRHCHRRROIOOCRHCOCRRR.hashCode()) * 31 + System.identityHashCode(this.OHHICRRHOHHRICIORIOHROHCROIHRR);
   }

   @Override
   public final boolean equals(@Nullable Object var1) {
      if (!(var1 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH)) {
         return false;
      }

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = (HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1;
      return this.OHHICRRHOHHRICIORIOHROHCROIHRR == var2.OHHICRRHOHHRICIORIOHROHCROIHRR
         && this.HIORRIIRCIRHCHRRROIOOCRHCOCRRR.equals(var2.HIORRIIRCIRHCHRRROIOOCRHCOCRRR);
   }

   private static boolean isDeclaredThreadSafe(Method var0) {
      return var0.getAnnotation(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         )
         != null;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, Object var2, Method var3) {
         super(var1, var2, var3);
      }

      @Override
      void invokeSubscriberMethod(Object var1) {
         synchronized (this) {
            super.invokeSubscriberMethod(var1);
         }
      }
   }
}
