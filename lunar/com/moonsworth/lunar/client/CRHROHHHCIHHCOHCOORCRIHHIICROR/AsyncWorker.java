package com.moonsworth.lunar.client.CRHROHHHCIHHCOHCOORCRIHHIICROR;

import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import java.lang.management.ManagementFactory;
import java.lang.management.MonitorInfo;
import java.lang.management.ThreadInfo;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends Thread implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   public static final long IIIOIOHHOHOOROHIRIOHIIRICCOCIR = 10000L;
   public static final int HOOOCCIRCIHRCRHIRCROOORORHCHHO = 87;
   private long CHRRRRRHIRIHORHIOOOOCICRCIOIOH = 0L;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      this.handle(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, var1 -> this.CHRRRRRHIRIHORHIOOOOCICRCIOIOH = System.currentTimeMillis());
   }

   @Override
   public void run() {
      while (this.CHRRRRRHIRIHORHIOOOOCICRCIOIOH == 0L || System.currentTimeMillis() <= this.CHRRRRRHIRIHORHIOOOOCICRCIOIOH + 10000L) {
         try {
            Thread.sleep(10000L);
         } catch (InterruptedException var6) {
         }
      }

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "DEADLOCK", "Forcefully crashed Minecraft."
      );
      ThreadInfo[] var1 = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);

      for (ThreadInfo var5 : var1) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
      }

      System.exit(87);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ThreadInfo var1) {
      System.out.println("---------------------------------");
      System.out.println("\tName: " + var1.getThreadName());
      System.out.println("\tID: " + var1.getThreadId());
      System.out.println("\tSuspended: " + var1.isSuspended());
      System.out.println("\tNative: " + var1.isInNative());
      System.out.println("\tState: " + var1.getThreadState());
      System.out.println("\tBlocked Time: " + var1.getBlockedTime());
      System.out.println("\tBlocked Count: " + var1.getBlockedCount());
      if (var1.getLockedMonitors().length != 0) {
         System.out.println("\tLocked monitors:");

         for (MonitorInfo var5 : var1.getLockedMonitors()) {
            System.out.println("\t\tMonitor: " + var5.getLockedStackFrame());
         }
      }

      if (var1.getLockOwnerId() != -1L) {
         System.out.println("\tLock Owner Id: " + var1.getLockOwnerId());
      }

      System.out.println("\tStack Trace:");

      for (StackTraceElement var9 : var1.getStackTrace()) {
         System.out.println("\t\t" + var9);
      }

      System.out.println("---------------------------------");
   }
}
