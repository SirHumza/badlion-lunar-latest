package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class RICRIRRCOHRCOCRRHHCRHRROOIOHHR {
   private static final Logger RCRORRROHHRRIHCRCCHROOROCIOCOC = Logger.getLogger(RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class.getName());

   private RICRIRRCOHRCOCRRHHCRHRROOIOHHR() {
   }

   public static void flush(Flushable var0, boolean var1) {
      try {
         var0.flush();
      } catch (IOException var3) {
         if (!var1) {
            throw var3;
         }

         RCRORRROHHRRIHCRCCHROOROCIOCOC.log(Level.WARNING, "IOException thrown while flushing Flushable.", var3);
      }
   }

   public static void flushQuietly(Flushable var0) {
      try {
         flush(var0, true);
      } catch (IOException var2) {
         RCRORRROHHRRIHCRCCHROOROCIOCOC.log(Level.SEVERE, "IOException should not have been thrown.", var2);
      }
   }
}
