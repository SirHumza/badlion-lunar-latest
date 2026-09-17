package com.moonsworth.lunar.client.util;

import java.util.function.Supplier;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface RIIHIHHCRHCHRCICHOROHCHIIHCICH<T> extends Supplier<T> {
   static <T> RIIHIHHCRHCHRCICHOROHCHIIHCICH<T> OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(@Nonnull Supplier<T> var0) {
      return new RIIHIHHCRHCHRCICHOROHCHIIHCICH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0);
   }

   static <T> RIIHIHHCRHCHRCICHOROHCHIIHCICH<T> RRORCOIRRIICOOICOIOCORHORCHCOC(@Nonnull Supplier<T> var0) {
      return new RIIHIHHCRHCHRCICHOROHCHIIHCICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   boolean initialized();

   final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> implements RIIHIHHCRHCHRCICHOROHCHIIHCICH<T> {
      private Supplier<T> supplier;
      private T instance;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(Supplier<T> var1) {
         this.supplier = var1;
      }

      @Nullable
      @Override
      public final T get() {
         if (this.supplier != null) {
            this.instance = this.supplier.get();
            this.supplier = null;
         }

         return this.instance;
      }

      @Override
      public boolean initialized() {
         return this.supplier == null;
      }
   }

   final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> implements RIIHIHHCRHCHRCICHOROHCHIIHCICH<T> {
      private volatile Object lock = new Object();
      private volatile Supplier<T> supplier;
      private volatile T instance;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Supplier<T> var1) {
         this.supplier = var1;
      }

      @Nullable
      @Override
      public final T get() {
         Object var1 = this.lock;
         if (this.supplier != null) {
            synchronized (var1) {
               if (this.supplier != null) {
                  this.instance = this.supplier.get();
                  this.supplier = null;
                  this.lock = null;
               }
            }
         }

         return this.instance;
      }

      @Override
      public boolean initialized() {
         return this.supplier == null;
      }
   }
}
