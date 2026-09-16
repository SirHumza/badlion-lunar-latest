package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static final Logger OHHIOCHOOOCHRCHRIRCCIIHICHRIRO = Logger.getLogger(OCOHORHCROHICRRIHCIHHRRCIHICRI.class.getName());

   private OCOHORHCROHICRRIHCIHHRRCIHICRI() {
   }

   public static void close(@Nullable Closeable var0, boolean var1) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (IOException var3) {
            if (!var1) {
               throw var3;
            }

            OHHIOCHOOOCHRCHRIRCCIIHICHRIRO.log(Level.WARNING, "IOException thrown while closing Closeable.", var3);
         }
      }
   }

   public static void closeQuietly(@Nullable InputStream var0) {
      try {
         close(var0, true);
      } catch (IOException var2) {
         throw new AssertionError(var2);
      }
   }

   public static void closeQuietly(@Nullable Reader var0) {
      try {
         close(var0, true);
      } catch (IOException var2) {
         throw new AssertionError(var2);
      }
   }
}
