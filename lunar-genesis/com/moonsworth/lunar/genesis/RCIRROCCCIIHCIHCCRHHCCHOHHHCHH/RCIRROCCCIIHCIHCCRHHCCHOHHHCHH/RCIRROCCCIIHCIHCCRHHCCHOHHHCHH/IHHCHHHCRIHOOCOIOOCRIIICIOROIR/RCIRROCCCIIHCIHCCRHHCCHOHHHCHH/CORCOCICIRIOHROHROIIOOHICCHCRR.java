package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OIICIRRCOOCIHRHOIOIOOROCRHCHIC;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class CORCOCICIRIOHROHROIIOOHICCHCRR<InputT, OutputT>
   extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<OutputT> {
   private static final Logger OCOHCRHIHCRIHCRCIHCRIRCCRIICRC = Logger.getLogger(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.class
         .getName()
   );
   private @Nullable OIICIRRCOOCIHRHOIOIOOROCRHCHIC<? extends RCCCROCHCICCROHCOCCRRROCIIHCCH<? extends InputT>> RIIICIRRHRIOORRIOCHCOOHIHIOHIO;
   private final boolean IHCHCIHORROCOCIHHCIIOIIOOOCRHR;
   private final boolean OIRHHOIOOHCHHOOOHOHROIHICROHRH;

   CORCOCICIRIOHROHROIIOOHICCHCRR(OIICIRRCOOCIHRHOIOIOOROCRHCHIC<? extends RCCCROCHCICCROHCOCCRRROCIIHCCH<? extends InputT>> var1, boolean var2, boolean var3) {
      super(var1.size());
      this.RIIICIRRHRIOORRIOCHCOOHIHIOHIO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.IHCHCIHORROCOCIHHCIIOIIOOOCRHR = var2;
      this.OIRHHOIOOHCHHOOOHOHROIHICROHRH = var3;
   }

   @Override
   protected final void afterDone() {
      super.afterDone();
      OIICIRRCOOCIHRHOIOIOOROCRHCHIC var1 = this.RIIICIRRHRIOORRIOCHCOOHIHIOHIO;
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OUTPUT_FUTURE_DONE
      );
      if (this.isCancelled() & var1 != null) {
         boolean var2 = this.IHCRICIOHRROOIOORIRCCRHCHIOROO();
         IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var3 = var1.IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

         while (var3.hasNext()) {
            Future var4 = (Future)var3.next();
            var4.cancel(var2);
         }
      }
   }

   @Override
   protected final String pendingToString() {
      OIICIRRCOOCIHRHOIOIOOROCRHCHIC var1 = this.RIIICIRRHRIOORRIOCHCOOHIHIOHIO;
      return var1 != null ? "futures=" + var1 : super.pendingToString();
   }

   final void IIHCOOCOIIOCIHHOCRHHIICHIIRIOR() {
      if (this.RIIICIRRHRIOORRIOCHCOOHIHIOHIO.isEmpty()) {
         this.handleAllCompleted();
      } else {
         if (this.IHCHCIHORROCOCIHHCIIOIIOOOCRHR) {
            int var1 = 0;
            IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var2 = this.RIIICIRRHRIOORRIOCHCOOHIHIOHIO.IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

            while (var2.hasNext()) {
               final RCCCROCHCICCROHCOCCRRROCIIHCCH var3 = (RCCCROCHCICCROHCOCCRRROCIIHCCH)var2.next();
               final int var4 = var1++;
               var3.addListener(
                  new Runnable() {
                     @Override
                     public void run() {
                        try {
                           if (var3.isCancelled()) {
                              CORCOCICIRIOHROHROIIOOHICCHCRR.this.RIIICIRRHRIOORRIOCHCOOHIHIOHIO = null;
                              CORCOCICIRIOHROHROIIOOHICCHCRR.this.cancel(false);
                           } else {
                              CORCOCICIRIOHROHROIIOOHICCHCRR.this.collectValueFromNonCancelledFuture(var4, var3);
                           }
                        } finally {
                           CORCOCICIRIOHROHROIIOOHICCHCRR.this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                              (OIICIRRCOOCIHRHOIOIOOROCRHCHIC<? extends Future<? extends InputT>>)null
                           );
                        }
                     }
                  },
                  OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.directExecutor()
               );
            }
         } else {
            final OIICIRRCOOCIHRHOIOIOOROCRHCHIC var5 = this.OIRHHOIOOHCHHOOOHOHROIHICROHRH ? this.RIIICIRRHRIOORRIOCHCOOHIHIOHIO : null;
            Runnable var6 = new Runnable() {
               @Override
               public void run() {
                  CORCOCICIRIOHROHROIIOOHICCHCRR.this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5);
               }
            };
            IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var7 = this.RIIICIRRHRIOORRIOCHCOOHIHIOHIO.IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

            while (var7.hasNext()) {
               RCCCROCHCICCROHCOCCRRROCIIHCCH var8 = (RCCCROCHCICCROHCOCCRRROCIIHCCH)var7.next();
               var8.addListener(var6, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.directExecutor());
            }
         }
      }
   }

   private void handleException(Throwable var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (this.IHCHCIHORROCOCIHHCIIOIIOOOCRHR) {
         boolean var2 = this.setException(var1);
         if (!var2) {
            boolean var3 = addCausalChain(this.HRCOIOIRRIRRRIHIOOIRHCORIIHRHR(), var1);
            if (var3) {
               log(var1);
               return;
            }
         }
      }

      if (var1 instanceof Error) {
         log(var1);
      }
   }

   private static void log(Throwable var0) {
      String var1 = var0 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first";
      OCOHCRHIHCRIHCRCIHCRIRCCRIICRC.log(Level.SEVERE, var1, var0);
   }

   @Override
   final void addInitialException(Set<Throwable> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (!this.isCancelled()) {
         boolean var2 = addCausalChain(var1, this.tryInternalFastPathGetFailure());
      }
   }

   private void collectValueFromNonCancelledFuture(int var1, Future<? extends InputT> var2) {
      try {
         this.collectOneValue(var1, OHIIIOHIRIRCCRRIOIICCHHIORRHOH.getDone(var2));
      } catch (ExecutionException var4) {
         this.handleException(var4.getCause());
      } catch (Throwable var5) {
         this.handleException(var5);
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable OIICIRRCOOCIHRHOIOIOOROCRHCHIC<? extends Future<? extends InputT>> var1) {
      int var2 = this.RRCIOCRORCIRRRROOCOIIOHRCIHCOH();
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
         var2 >= 0, "Less than 0 remaining futures"
      );
      if (var2 == 0) {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(@Nullable OIICIRRCOOCIHRHOIOIOOROCRHCHIC<? extends Future<? extends InputT>> var1) {
      if (var1 != null) {
         int var2 = 0;

         for (IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var3 = var1.IOHOCICRRIRHHCCCRICOCOHOIIOCRH(); var3.hasNext(); var2++) {
            Future var4 = (Future)var3.next();
            if (!var4.isCancelled()) {
               this.collectValueFromNonCancelledFuture(var2, var4);
            }
         }
      }

      this.OCCOIICCRROHHORCORIHRROHOORCCR();
      this.handleAllCompleted();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALL_INPUT_FUTURES_PROCESSED
      );
   }

   @ForOverride
   @OverridingMethodsMustInvokeSuper
   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.RIIICIRRHRIOORRIOCHCOOHIHIOHIO = null;
   }

   abstract void collectOneValue(int var1, @Nullable InputT var2);

   abstract void handleAllCompleted();

   private static boolean addCausalChain(Set<Throwable> var0, Throwable var1) {
      while (var1 != null) {
         boolean var2 = var0.add(var1);
         if (!var2) {
            return false;
         }

         var1 = var1.getCause();
      }

      return true;
   }

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      OUTPUT_FUTURE_DONE,
      ALL_INPUT_FUTURES_PROCESSED;
   }
}
