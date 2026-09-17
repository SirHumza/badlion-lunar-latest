package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.sun.management.GarbageCollectionNotificationInfo;
import java.io.DataOutputStream;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import javax.management.ListenerNotFoundException;
import javax.management.NotificationEmitter;
import javax.management.NotificationListener;
import javax.management.openmbean.CompositeData;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final long IHOCOCCHHICHHOOIHOCOCOOORCIOIR = 50L;
   private static final long IHRHCHCHIRCHIIIIOIHOHHHHRROCRO = 20L;
   private static final long RHHOCIRRCRIHOCIORRCCIORRCRRCOR = 50L;
   private static final long CRIHCRHCICHOIICRRRCCCHORROIHRC = 100L;
   private static boolean IHRHRHCCHIOHOIHIHROOOHIHHHRIHR = false;
   private static long HRIICOIOIIIIRIHHOICRHOIIRCIRIC = 0L;
   private static final AtomicLong CIRRCCCORCOOIIOCICRHCIRIRHCIHO = new AtomicLong();
   private static final AtomicLong HIRRICHIHCIIHICIRICRHICOROOIHI = new AtomicLong();
   private static final NotificationListener CCHCIIRCIICOORIOROCOIOOCCROCOH = (var0, var1) -> {
      if (IHRHRHCCHIOHOIHIHROOOHIHHHRIHR) {
         if (var0.getType().equals("com.sun.management.gc.notification")) {
            GarbageCollectionNotificationInfo var2 = GarbageCollectionNotificationInfo.from((CompositeData)var0.getUserData());
            long var3 = var2.getGcInfo().getDuration();
            String var5 = var2.getGcAction();
            if ("end of minor GC".equals(var5)) {
               var5 = "Young Gen GC";
            } else if ("end of major GC".equals(var5)) {
               var5 = "Old Gen GC";
            } else if ("end of GC cycle".equals(var5)) {
               return;
            }

            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.GC,
               var3,
               var5
            );
         }
      }
   };
   private static Consumer<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CCCORRRRHRICHRICICHHOHOIIHCCHO;

   public static void IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      Consumer<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var0
   ) {
      IHRHRHCCHIOHOIHIHROOOHIHHHRIHR = true;
      HRIICOIOIIIIRIHHOICRHOIIRCIRIC = 0L;
      CCCORRRRHRICHRICICHHOHOIIHCCHO = var0;

      for (GarbageCollectorMXBean var3 : ManagementFactory.getGarbageCollectorMXBeans()) {
         NotificationEmitter var4 = (NotificationEmitter)var3;
         var4.addNotificationListener(CCHCIIRCIICOORIOROCOIOOCCROCOH, null, null);
      }
   }

   public static void stop() {
      IHRHRHCCHIOHOIHIHROOOHIHHHRIHR = false;

      for (GarbageCollectorMXBean var2 : ManagementFactory.getGarbageCollectorMXBeans()) {
         try {
            NotificationEmitter var3 = (NotificationEmitter)var2;
            var3.removeNotificationListener(CCHCIIRCIICOORIOROCOIOOCCROCOH, null, null);
         } catch (ListenerNotFoundException var4) {
            var4.printStackTrace();
         }
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      long var1,
      String var3
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRHCOOHHRHIRCRHHROCRHCHIOIROHH()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isWindowFocused()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
         && IHRHRHCCHIOHOIHIHROOOHIHHHRIHR) {
         if (var1 >= 20L) {
            System.out.println("Pause - " + var0.getName() + " - " + var1 + "ms" + (var3 != null ? " - " + var3 : ""));
         }

         if (var1 > 2L) {
            CCCORRRRHRICHRICICHHOHOIIHCCHO.accept(
               new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var0, var1, var3
               )
            );
         }

         CIRRCCCORCOOIIOCICRHCIRIRHCIHO.addAndGet(var1);
      }
   }

   public static void nextFrame() {
      long var0 = System.nanoTime();
      long var2 = (var0 - HRIICOIOIIIIRIHHOICRHOIIRCIRIC) / 1000000L;
      long var4 = CIRRCCCORCOOIIOCICRHCIRIRHCIHO.get();
      if (var2 >= 50L + var4 && HRIICOIOIIIIRIHHOICRHOIIRCIRIC != 0L) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.UNKNOWN,
            var2 - var4,
            null
         );
      }

      CIRRCCCORCOOIIOCICRHCIRIRHCIHO.set(0L);
      HRIICOIOIIIIRIHHOICRHOIIRCIRIC = var0;
      HIRRICHIHCIIHICIRICRHICOROOIHI.set(0L);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Thread var0) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRHCOOHHRHIRCRHHROCRHCHIOIROHH()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$isWindowFocused()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
         && IHRHRHCCHIOHOIHIHROOOHIHHHRIHR) {
         long var1 = System.nanoTime();
         if (HIRRICHIHCIIHICIRICRHICOROOIHI.get() / 1000000L + 100L <= var1 / 1000000L) {
            long var3 = (var1 - HRIICOIOIIIIRIHHOICRHOIIRCIRIC) / 1000000L;
            if (var3 >= 50L) {
               StackTraceElement[] var5 = var0.getStackTrace();
               System.out.println("Game Pause Detected!, Dumping Stack!");
               if (var5.length > 2 && var5[1].getMethodName().equals("glfwPollEvents")) {
                  System.out.println("\tat pollevents");
               } else {
                  for (StackTraceElement var9 : var5) {
                     System.out.println("\tat " + var9);
                  }
               }

               HIRRICHIHCIIHICIRICRHICOROOIHI.set(var1);
            }
         }
      }
   }

   public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      UNKNOWN("Unknown"),
      GC("GC"),
      POLL_EVENTS("pollEvents");

      private final String name;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3) {
         this.name = var3;
      }

      public String getName() {
         return this.name;
      }
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH COCHHIRRCCHRROIIHRCCIHHCHRHROO;
      private final long ICCOCCHHICOICORIHORRROOOROCIIO;
      private final String OIRRIOOICIHCIOHHCHIRIHCIOICRCC;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
         long var2,
         String var4
      ) {
         this.COCHHIRRCCHRROIIHRCCIHHCHRHROO = var1;
         this.ICCOCCHHICOICORIHORRROOOROCIIO = var2;
         this.OIRRIOOICIHCIOHHCHIRIHCIOICRCC = var4;
      }

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
      ) {
         var1.IRCHOHHOOROOHIIHHROOOOIIHHOIIH(this.COCHHIRRCCHRROIIHRCCIHHCHRHROO.name);
         var1.IRCHOHHOOROOHIIHHROOOOIIHHOIIH(this.OIRRIOOICIHCIOHHCHIRIHCIOICRCC);
      }

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DataOutputStream var1,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
      ) {
         var2.writeString(this.COCHHIRRCCHRROIIHRCCIHHCHRHROO.name);
         var1.writeLong(this.ICCOCCHHICOICORIHORRROOOROCIIO);
         var2.writeString(this.OIRRIOOICIHCIOHHCHIRIHCIOICRCC);
      }

      public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOOCHOCORHIHHOIHIRHCOIOCOIOOII() {
         return this.COCHHIRRCCHRROIIHRCCIHHCHRHROO;
      }

      public long HHHOHHORHCOIRHCICRCIRIHOHRCHIH() {
         return this.ICCOCCHHICOICORIHORRROOOROCIIO;
      }

      public String CHRIROOICCRRHHIHHIOOIIRHIHICHC() {
         return this.OIRRIOOICIHCIOHHCHIRIHCIOICRCC;
      }
   }
}
