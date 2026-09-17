package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
final class IHIIIRHOOCHRCCCCIORIROCOIRRHCC implements Executor {
   private static final Logger IRCORRHHICRHHHHROOHOIIHHHOORHO = Logger.getLogger(IHIIIRHOOCHRCCCCIORIROCOIRRHCC.class.getName());
   private final Executor OROCROCCHOICRCRICHOROCHIRCHHRI;
   @GuardedBy("queue")
   private final Deque<Runnable> RHIOHORCCRIHRHHCHIHIRCOCICIOCH = new ArrayDeque<>();
   @GuardedBy("queue")
   private IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH ORRIHCHHHOHCOHIICICCOCIORORROH = IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IDLE;
   @GuardedBy("queue")
   private long workerRunCount = 0L;
   private final IHIIIRHOOCHRCCCCIORIROCOIRRHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIHCORCCCRRRICIHCIRHRROCIICHRC = new IHIIIRHOOCHRCCCCIORIROCOIRRHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      
   );

   IHIIIRHOOCHRCCCCIORIROCOIRRHCC(Executor var1) {
      this.OROCROCCHOICRCRICHOROCHIRCHHRI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   @Override
   public void execute(final Runnable var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Runnable var2;
      long var3;
      synchronized (this.RHIOHORCCRIHRHHCHIHIRCOCICIOCH) {
         if (this.ORRIHCHHHOHCOHIICICCOCIORORROH == IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RUNNING
            || this.ORRIHCHHHOHCOHIICICCOCIORORROH == IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.QUEUED) {
            this.RHIOHORCCRIHRHHCHIHIRCOCICIOCH.add(var1);
            return;
         }

         var3 = this.workerRunCount;
         var2 = new Runnable() {
            @Override
            public void run() {
               var1.run();
            }
         };
         this.RHIOHORCCRIHRHHCHIHIRCOCICIOCH.add(var2);
         this.ORRIHCHHHOHCOHIICICCOCIORORROH = IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.QUEUING;
      }

      try {
         this.OROCROCCHOICRCRICHOROCHIRCHHRI.execute(this.HIHCORCCCRRRICIHCIRHRROCIICHRC);
      } catch (RuntimeException | Error var12) {
         RuntimeException var14 = var12;
         synchronized (this.RHIOHORCCRIHRHHCHIHIRCOCICIOCH) {
            boolean var7 = (
                  this.ORRIHCHHHOHCOHIICICCOCIORORROH == IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IDLE
                     || this.ORRIHCHHHOHCOHIICICCOCIORORROH == IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.QUEUING
               )
               && this.RHIOHORCCRIHRHHCHIHIRCOCICIOCH.removeLastOccurrence(var2);
            if (var14 instanceof RejectedExecutionException && !var7) {
               return;
            }

            throw var14;
         }
      }

      boolean var15 = this.ORRIHCHHHOHCOHIICICCOCIORORROH != IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.QUEUING;
      if (!var15) {
         synchronized (this.RHIOHORCCRIHRHHCHIHIRCOCICIOCH) {
            if (this.workerRunCount == var3 && this.ORRIHCHHHOHCOHIICICCOCIORORROH == IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.QUEUING) {
               this.ORRIHCHHHOHCOHIICICCOCIORORROH = IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.QUEUED;
            }
         }
      }
   }

   @Override
   public String toString() {
      return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.OROCROCCHOICRCRICHOROCHIRCHHRI + "}";
   }

   enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      IDLE,
      QUEUING,
      QUEUED,
      RUNNING;
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Runnable {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      public void run() {
         try {
            this.workOnQueue();
         } catch (Error var5) {
            synchronized (IHIIIRHOOCHRCCCCIORIROCOIRRHCC.this.RHIOHORCCRIHRHHCHIHIRCOCICIOCH) {
               IHIIIRHOOCHRCCCCIORIROCOIRRHCC.this.ORRIHCHHHOHCOHIICICCOCIORORROH = IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IDLE;
            }

            throw var5;
         }
      }

      private void workOnQueue() {
         boolean var1 = false;
         boolean var2 = false;

         while (true) {
            try {
               Runnable var3;
               synchronized (IHIIIRHOOCHRCCCCIORIROCOIRRHCC.this.RHIOHORCCRIHRHHCHIHIRCOCICIOCH) {
                  if (!var2) {
                     if (IHIIIRHOOCHRCCCCIORIROCOIRRHCC.this.ORRIHCHHHOHCOHIICICCOCIORORROH
                        == IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RUNNING) {
                        return;
                     }

                     IHIIIRHOOCHRCCCCIORIROCOIRRHCC.this.workerRunCount++;
                     IHIIIRHOOCHRCCCCIORIROCOIRRHCC.this.ORRIHCHHHOHCOHIICICCOCIORORROH = IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RUNNING;
                     var2 = true;
                  }

                  var3 = IHIIIRHOOCHRCCCCIORIROCOIRRHCC.this.RHIOHORCCRIHRHHCHIHIRCOCICIOCH.poll();
                  if (var3 == null) {
                     IHIIIRHOOCHRCCCCIORIROCOIRRHCC.this.ORRIHCHHHOHCOHIICICCOCIORORROH = IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IDLE;
                     return;
                  }
               }

               var1 |= Thread.interrupted();

               try {
                  var3.run();
               } catch (RuntimeException var10) {
                  IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCORRHHICRHHHHROOHOIIHHHOORHO.log(Level.SEVERE, "Exception while executing runnable " + var3, var10);
               }
            } finally {
               if (var1) {
                  Thread.currentThread().interrupt();
               }
            }
         }
      }
   }
}
