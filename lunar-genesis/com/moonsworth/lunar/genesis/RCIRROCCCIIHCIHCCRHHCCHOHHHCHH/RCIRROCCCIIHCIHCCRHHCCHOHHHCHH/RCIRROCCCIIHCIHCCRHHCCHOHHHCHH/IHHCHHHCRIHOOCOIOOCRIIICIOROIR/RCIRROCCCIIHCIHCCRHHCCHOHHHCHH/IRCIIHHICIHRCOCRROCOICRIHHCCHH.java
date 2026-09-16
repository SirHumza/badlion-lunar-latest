package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements HHIRHRHHRHIHRHOHCHRHIORRHIIHOR {
   private static final Logger HOIRCRROIICCCHCRIICCCOCHOOCOIO = Logger.getLogger(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         .getName()
   );
   private final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR COROCRICCICOOHHHICOOORIIRRRCRR = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
      @Override
      protected final void doStart() {
         Executor var1 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.executor(),
            new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<String>(
               
            ) {
               public String get() {
                  return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.serviceName();
               }
            }
         );
         var1.execute(
            new Runnable() {
               @Override
               public void run() {
                  try {
                     IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.startUp();
                     RHIRCICCRRRRHCRCHCCRCOCCCRHHIH();
                     if (isRunning()) {
                        try {
                           IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.run();
                        } catch (Throwable var4) {
                           try {
                              IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.shutDown();
                           } catch (Exception var3) {
                              com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOIRCRROIICCCHCRIICCCOCHOOCOIO
                                 .log(Level.WARNING, "Error while attempting to shut down the service after failure.", var3);
                           }

                           HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var4);
                           return;
                        }
                     }

                     IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.shutDown();
                     IHIHRCCORROHICRHCRCCICOIROCIIO();
                  } catch (Throwable var5) {
                     HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var5);
                  }
               }
            }
         );
      }

      @Override
      protected void doStop() {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.triggerShutdown();
      }

      @Override
      public String toString() {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.toString();
      }
   };

   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   protected void startUp() {
   }

   protected abstract void run();

   protected void shutDown() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected void triggerShutdown() {
   }

   protected Executor executor() {
      return new Executor() {
         @Override
         public void execute(Runnable var1) {
            OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.newThread(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.serviceName(), var1).start();
         }
      };
   }

   @Override
   public String toString() {
      return this.serviceName() + " [" + this.RIHCCCHRCCROICHCHIIHORRRIHIROH() + "]";
   }

   @Override
   public final boolean isRunning() {
      return this.COROCRICCICOOHHHICOOORIIRRRCRR.isRunning();
   }

   @Override
   public final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIHCCCHRCCROICHCHIIHORRRIHIROH() {
      return this.COROCRICCICOOHHHICOOORIIRRRCRR.RIHCCCHRCCROICHCHIIHORRRIHIROH();
   }

   @Override
   public final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Executor var2) {
      this.COROCRICCICOOHHHICOOORIIRRRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   @Override
   public final Throwable failureCause() {
      return this.COROCRICCICOOHHHICOOORIIRRRCRR.failureCause();
   }

   @CanIgnoreReturnValue
   @Override
   public final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR IHICOCICHIRICHIHOHCHCOCOCCCROI() {
      this.COROCRICCICOOHHHICOOORIIRRRCRR.IHICOCICHIRICHIHOHCHCOCOCCCROI();
      return this;
   }

   @CanIgnoreReturnValue
   @Override
   public final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR RHCOHHORRIOCRHOCRCRHRHRCRCCROO() {
      this.COROCRICCICOOHHHICOOORIIRRRCRR.RHCOHHORRIOCRHOCRCRHRHRCRCCROO();
      return this;
   }

   @Override
   public final void awaitRunning() {
      this.COROCRICCICOOHHHICOOORIIRRRCRR.awaitRunning();
   }

   @Override
   public final void awaitRunning(Duration var1) {
      HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.super.awaitRunning(var1);
   }

   @Override
   public final void awaitRunning(long var1, TimeUnit var3) {
      this.COROCRICCICOOHHHICOOORIIRRRCRR.awaitRunning(var1, var3);
   }

   @Override
   public final void awaitTerminated() {
      this.COROCRICCICOOHHHICOOORIIRRRCRR.awaitTerminated();
   }

   @Override
   public final void awaitTerminated(Duration var1) {
      HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.super.awaitTerminated(var1);
   }

   @Override
   public final void awaitTerminated(long var1, TimeUnit var3) {
      this.COROCRICCICOOHHHICOOORIIRRRCRR.awaitTerminated(var1, var3);
   }

   protected String serviceName() {
      return this.getClass().getSimpleName();
   }
}
