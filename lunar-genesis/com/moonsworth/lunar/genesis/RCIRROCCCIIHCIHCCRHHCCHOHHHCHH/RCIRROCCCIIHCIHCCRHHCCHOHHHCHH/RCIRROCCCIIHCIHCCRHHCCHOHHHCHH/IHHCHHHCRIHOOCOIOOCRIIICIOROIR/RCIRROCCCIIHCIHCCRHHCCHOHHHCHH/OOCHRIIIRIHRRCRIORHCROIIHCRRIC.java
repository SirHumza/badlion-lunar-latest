package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class OOCHRIIIRIHRRCRIORHCROIIHCRRIC {
   private OOCHRIIIRIHRRCRIORHCROIIHCRRIC() {
   }

   public static UncaughtExceptionHandler systemExit() {
      return new OOCHRIIIRIHRRCRIORHCROIIHCRRIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runtime.getRuntime());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements UncaughtExceptionHandler {
      private static final Logger HHCIOCCRIOHHOOOHOROCICIIIRICIO = Logger.getLogger(
         OOCHRIIIRIHRRCRIORHCROIIHCRRIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getName()
      );
      private final Runtime CIOHROHICRHHHROICIOOCCRHHCCCCH;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runtime var1) {
         this.CIOHROHICRHHHROICIOOCCRHHCCCCH = var1;
      }

      @Override
      public void uncaughtException(Thread var1, Throwable var2) {
         try {
            HHCIOCCRIOHHOOOHOROCICIIIRICIO.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", var1), var2);
         } catch (Throwable var7) {
            System.err.println(var2.getMessage());
            System.err.println(var7.getMessage());
         } finally {
            this.CIOHROHICRHHHROICIOOCCRHHCCCCH.exit(1);
         }
      }
   }
}
