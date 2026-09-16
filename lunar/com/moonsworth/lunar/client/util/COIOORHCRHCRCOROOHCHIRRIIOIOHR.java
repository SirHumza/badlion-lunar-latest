package com.moonsworth.lunar.client.util;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import lombok.Generated;

public final class COIOORHCRHCRCOROOHCHIRRIIOIOHR {
   public static Runnable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIOORHCRHCRCOROOHCHIRRIIOIOHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0) {
      return () -> {
         try {
            var0.run();
         } catch (Throwable var2) {
            throw new RuntimeException(var2);
         }
      };
   }

   public static <T> Supplier<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIOORHCRHCRCOROOHCHIRRIIOIOHR.CRRRICCRROCOHHOHIICIHORCOORRRH<T> var0) {
      return () -> {
         try {
            return (T)var0.get();
         } catch (Throwable var2) {
            throw new RuntimeException(var2);
         }
      };
   }

   public static <T> Consumer<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIOORHCRHCRCOROOHCHIRRIIOIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> var0) {
      return var1 -> {
         try {
            var0.IHORRHOROHHHIORCCHRCRIRRHHCCCO(var1);
         } catch (Throwable var3) {
            throw new RuntimeException(var3);
         }
      };
   }

   public static <T, U> Function<T, U> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIOORHCRHCRCOROOHCHIRRIIOIOHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T, U> var0) {
      return var1 -> {
         try {
            return (U)var0.apply(var1);
         } catch (Throwable var3) {
            throw new RuntimeException(var3);
         }
      };
   }

   @Generated
   private COIOORHCRHCRCOROOHCHIRRIIOIOHR() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public interface CRRRICCRROCOHHOHIICIHORCOORRRH<T> {
      T get();
   }

   public interface HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      void run();
   }

   public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH<T, U> {
      U apply(T var1);
   }

   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> {
      void IHORRHOROHHHIORCCHRCRIRRHHCCCO(T var1);
   }
}
