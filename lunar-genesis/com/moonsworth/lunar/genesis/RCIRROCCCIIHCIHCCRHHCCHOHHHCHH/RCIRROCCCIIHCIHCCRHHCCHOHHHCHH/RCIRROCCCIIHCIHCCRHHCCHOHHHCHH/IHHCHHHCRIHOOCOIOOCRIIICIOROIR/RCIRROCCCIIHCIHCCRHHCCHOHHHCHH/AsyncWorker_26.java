package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH implements HHIRHRHHRHIHRHOHCHRHIORRHIIHOR {
   private final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<String> HOCIIIIORRHRHIRCORHRHROOHCORIO = new CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      
   );
   private final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR RHCRORRIRIOOCIICRHORIIRCRIRRCC = new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

   protected CRRRICCRROCOHHOHIICIHORCOORRRH() {
   }

   protected abstract void startUp();

   protected abstract void shutDown();

   protected Executor executor() {
      return new Executor() {
         @Override
         public void execute(Runnable var1) {
            OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.newThread(CRRRICCRROCOHHOHIICIHORCOORRRH.this.HOCIIIIORRHRHIRCORHRHROOHCORIO.get(), var1).start();
         }
      };
   }

   @Override
   public String toString() {
      return this.serviceName() + " [" + this.RIHCCCHRCCROICHCHIIHORRRIHIROH() + "]";
   }

   @Override
   public final boolean isRunning() {
      return this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.isRunning();
   }

   @Override
   public final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIHCCCHRCCROICHCHIIHORRRIHIROH() {
      return this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.RIHCCCHRCCROICHCHIIHORRRIHIROH();
   }

   @Override
   public final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Executor var2) {
      this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   @Override
   public final Throwable failureCause() {
      return this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.failureCause();
   }

   @CanIgnoreReturnValue
   @Override
   public final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR IHICOCICHIRICHIHOHCHCOCOCCCROI() {
      this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.IHICOCICHIRICHIHOHCHCOCOCCCROI();
      return this;
   }

   @CanIgnoreReturnValue
   @Override
   public final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR RHCOHHORRIOCRHOCRCRHRHRCRCCROO() {
      this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.RHCOHHORRIOCRHOCRCRHRHRCRCCROO();
      return this;
   }

   @Override
   public final void awaitRunning() {
      this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.awaitRunning();
   }

   @Override
   public final void awaitRunning(Duration var1) {
      HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.super.awaitRunning(var1);
   }

   @Override
   public final void awaitRunning(long var1, TimeUnit var3) {
      this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.awaitRunning(var1, var3);
   }

   @Override
   public final void awaitTerminated() {
      this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.awaitTerminated();
   }

   @Override
   public final void awaitTerminated(Duration var1) {
      HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.super.awaitTerminated(var1);
   }

   @Override
   public final void awaitTerminated(long var1, TimeUnit var3) {
      this.RHCRORRIRIOOCIICRHORIIRCRIRRCC.awaitTerminated(var1, var3);
   }

   protected String serviceName() {
      return this.getClass().getSimpleName();
   }

   private final class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      implements com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<String> {
      private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      }

      public String get() {
         return CRRRICCRROCOHHOHIICIHORCOORRRH.this.serviceName() + " " + CRRRICCRROCOHHOHIICIHORCOORRRH.this.RIHCCCHRCCROICHCHIIHORRRIHIROH();
      }
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      protected final void doStart() {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               CRRRICCRROCOHHOHIICIHORCOORRRH.this.executor(), CRRRICCRROCOHHOHIICIHORCOORRRH.this.HOCIIIIORRHRHIRCORHRHROOHCORIO
            )
            .execute(new Runnable() {
               @Override
               public void run() {
                  try {
                     CRRRICCRROCOHHOHIICIHORCOORRRH.this.startUp();
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RHIRCICCRRRRHCRCHCCRCOCCCRHHIH();
                  } catch (Throwable var2) {
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var2);
                  }
               }
            });
      }

      @Override
      protected final void doStop() {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               CRRRICCRROCOHHOHIICIHORCOORRRH.this.executor(), CRRRICCRROCOHHOHIICIHORCOORRRH.this.HOCIIIIORRHRHIRCORHRHROOHCORIO
            )
            .execute(new Runnable() {
               @Override
               public void run() {
                  try {
                     CRRRICCRROCOHHOHIICIHORCOORRRH.this.shutDown();
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IHIHRCCORROHICRHCRCCICOIROCIIO();
                  } catch (Throwable var2) {
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var2);
                  }
               }
            });
      }

      @Override
      public String toString() {
         return CRRRICCRROCOHHOHIICIHORCOORRRH.this.toString();
      }
   }
}
