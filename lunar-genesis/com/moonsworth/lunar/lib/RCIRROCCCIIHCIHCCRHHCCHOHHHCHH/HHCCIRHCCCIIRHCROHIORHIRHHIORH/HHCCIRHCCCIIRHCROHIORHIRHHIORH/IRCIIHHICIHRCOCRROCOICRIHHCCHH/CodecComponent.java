package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   private static final HashSet<String> CICRCOCOCICIRICORHOROCCRIOORHI = new HashSet<>();

   @Deprecated
   public static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      Class<?> var0, String var1
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, var0, var1);
   }

   public static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0, Class<?> var1, String var2
   ) {
      if (CICRCOCOCICIRICORHOROCCRIOORHI.contains(var2)) {
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROIOROHRIHRRHIHRRRIHHHIICCHIOI(var1);
         if (var3 != null) {
            return var3;
         }

         if (var1 == UUID.class) {
            return new CCIHHRIOOOOCOHRCIHOHROOICIORCC();
         }

         if (var1 == StackTraceElement.class) {
            return RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0);
         }

         if (var1 == AtomicBoolean.class) {
            return new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
         }

         if (var1 == AtomicInteger.class) {
            return new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
         }

         if (var1 == AtomicLong.class) {
            return new CRRRICCRROCOHHOHIICIHORCOORRRH();
         }

         if (var1 == ByteBuffer.class) {
            return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
         }

         if (var1 == Void.class) {
            return RIROICHCRROROHCCROOCCCCOCHCCRI.IIOIOOCICHIRORICCIIRIHROHHOIIC;
         }
      }

      return null;
   }

   public static boolean IOROHHOIORHORCOHRHCCHCRHOCHCCI(Class<?> var0) {
      return CICRCOCOCICIRICORHOROCCRIOORHI.contains(var0.getName());
   }

   static {
      Class[] var0 = new Class[]{UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class};

      for (Class var4 : var0) {
         CICRCOCOCICIRICORHOROCCRIOORHI.add(var4.getName());
      }

      for (Class var8 : IIRHCHHOICHRICOOCRORCCIOOIHOIR.types()) {
         CICRCOCOCICIRICORHOROCCRIOORHI.add(var8.getName());
      }
   }
}
