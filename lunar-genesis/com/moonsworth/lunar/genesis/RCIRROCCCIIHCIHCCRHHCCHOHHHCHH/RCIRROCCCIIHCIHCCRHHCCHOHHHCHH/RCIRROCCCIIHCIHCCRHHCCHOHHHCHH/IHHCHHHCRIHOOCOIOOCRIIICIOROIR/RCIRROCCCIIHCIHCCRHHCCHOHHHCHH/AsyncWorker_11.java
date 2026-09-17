package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class IHIRRIIORRHORHRORIHOROIRCORCOO {
   private static final Logger HHIOHICRIOIHIOHCIIIOOHCOIRHROI = Logger.getLogger(IHIRRIIORRHORHRORIHOROIRCORCOO.class.getName());
   @GuardedBy("this")
   private IHIRRIIORRHORHRORIHOROIRCORCOO.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CORCOCIRHIHCIOOCRRCICHHIOOIOCO;
   @GuardedBy("this")
   private boolean executed;

   public void add(Runnable var1, Executor var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "Runnable was null."
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2, "Executor was null."
      );
      synchronized (this) {
         if (!this.executed) {
            this.CORCOCIRHIHCIOOCRRCICHHIOOIOCO = new IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, var2, this.CORCOCIRHIHCIOOCRRCICHHIOOIOCO
            );
            return;
         }
      }

      executeListener(var1, var2);
   }

   public void execute() {
      IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1;
      synchronized (this) {
         if (this.executed) {
            return;
         }

         this.executed = true;
         var1 = this.CORCOCIRHIHCIOOCRRCICHHIOOIOCO;
         this.CORCOCIRHIHCIOOCRRCICHHIOOIOCO = null;
      }

      IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = null;

      while (var1 != null) {
         IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = var1;
         var1 = var1.RCCRHHIRCRCOOCHOHICROCIIHCCRIH;
         var3.RCCRHHIRCRCOOCHOHICROCIIHCCRIH = var2;
         var2 = var3;
      }

      while (var2 != null) {
         executeListener(var2.HRRHRIOCCHORCHHIIIOOCCCHIRROHR, var2.RHOOOCCRRORRRRCIIHHICOOICCHIIC);
         var2 = var2.RCCRHHIRCRCOOCHOHICROCIIHCCRIH;
      }
   }

   private static void executeListener(Runnable var0, Executor var1) {
      try {
         var1.execute(var0);
      } catch (RuntimeException var3) {
         HHIOHICRIOIHIOHCIIIOOHCOIRHROI.log(Level.SEVERE, "RuntimeException while executing runnable " + var0 + " with executor " + var1, var3);
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      final Runnable HRRHRIOCCHORCHHIIIOOCCCHIRROHR;
      final Executor RHOOOCCRRORRRRCIIHHICOOICCHIIC;
      IHIRRIIORRHORHRORIHOROIRCORCOO.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCCRHHIRCRCOOCHOHICROCIIHCCRIH;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runnable var1, Executor var2, IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3) {
         this.HRRHRIOCCHORCHHIIIOOCCCHIRROHR = var1;
         this.RHOOOCCRRORRRRCIIHHICOOICCHIIC = var2;
         this.RCCRHHIRCRCOOCHOHICROCIIHCCRIH = var3;
      }
   }
}
