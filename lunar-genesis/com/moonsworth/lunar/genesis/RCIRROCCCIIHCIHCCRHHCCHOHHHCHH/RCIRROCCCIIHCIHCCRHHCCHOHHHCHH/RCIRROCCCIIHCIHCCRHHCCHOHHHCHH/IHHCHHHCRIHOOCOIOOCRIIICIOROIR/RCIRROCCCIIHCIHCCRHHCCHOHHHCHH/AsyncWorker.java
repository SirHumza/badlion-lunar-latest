package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@DoNotMock("Create an AbstractIdleService")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public interface HHIRHRHHRHIHRHOHCHRHIORRHIIHOR {
   @CanIgnoreReturnValue
   HHIRHRHHRHIHRHOHCHRHIORRHIIHOR IHICOCICHIRICHIHOHCHCOCOCCCROI();

   boolean isRunning();

   HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIHCCCHRCCROICHCHIIHORRRIHIROH();

   @CanIgnoreReturnValue
   HHIRHRHHRHIHRHOHCHRHIORRHIIHOR RHCOHHORRIOCRHOCRCRHRHRCRCCROO();

   void awaitRunning();

   default void awaitRunning(Duration var1) {
      this.awaitRunning(IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS);
   }

   void awaitRunning(long var1, TimeUnit var3);

   void awaitTerminated();

   default void awaitTerminated(Duration var1) {
      this.awaitTerminated(IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS);
   }

   void awaitTerminated(long var1, TimeUnit var3);

   Throwable failureCause();

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Executor var2);

   enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      NEW {
         @Override
         boolean isTerminal() {
            return false;
         }
      },
      STARTING {
         @Override
         boolean isTerminal() {
            return false;
         }
      },
      RUNNING {
         @Override
         boolean isTerminal() {
            return false;
         }
      },
      STOPPING {
         @Override
         boolean isTerminal() {
            return false;
         }
      },
      TERMINATED {
         @Override
         boolean isTerminal() {
            return true;
         }
      },
      FAILED {
         @Override
         boolean isTerminal() {
            return true;
         }
      };

      IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      }

      abstract boolean isTerminal();
   }

   abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public void starting() {
      }

      public void running() {
      }

      public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      }

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      }

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, Throwable var2) {
      }
   }
}
