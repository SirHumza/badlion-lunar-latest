package com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T, L extends List<T>>
   implements com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> {
   L CIICCOIIRHIRHORHICCHOIHIOIOOOH;

   @Override
   public <B> B IIRHCHHOICHRICOOCRORCCIOOIHOIR(Collection<T> var1) {
      this.CIICCOIIRHIRHORHICCHOIHIOIOOOH.removeAll(var1);
      return (B)this;
   }

   @Override
   public <B> B OHHRIOHROOIHOROCIRHCHORIHRRRRI(Collection<T> var1) {
      this.CIICCOIIRHIRHORHICCHOIHIOIOOOH.addAll(var1);
      return (B)this;
   }

   @Contract("_->this")
   public <B> B IIHRRHORCRCROCHHOHORCHCROCIHRO(Predicate<? super T> var1) {
      this.CIICCOIIRHIRHORHICCHOIHIOIOOOH.removeIf(var1);
      return (B)this;
   }

   public L build() {
      return this.CIICCOIIRHIRHORHICCHOIHIOIOOOH;
   }

   public List<T> RICROIRCIORIROIIOOIOCIOCICRCRR() {
      return Collections.unmodifiableList(this.CIICCOIIRHIRHORHICCHOIHIOIOOOH);
   }

   public static <T> IRCIIHHICIHRCOCRROCOICRIHHCCHH<T, List<T>> RRORHOHCOCRCIOIIHCCRIHCRRRRCIH() {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(new ArrayList<>());
   }

   public static <T, L extends List<T>> IRCIIHHICIHRCOCRROCOICRIHHCCHH<T, List<T>> HCHOOCHIOICRRHHIHHHICIRCIOICRI(L var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0);
   }

   public static <T, L extends List<T>> IRCIIHHICIHRCOCRROCOICRIHHCCHH<T, List<T>> IRCIIHHICIHRCOCRROCOICRIHHCCHH(L var0, Class<T> var1) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0);
   }

   public static <T> IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T, List<T>> ROCOHCRORCICHIIHIRICIROOHIIROI() {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(ArrayList::new);
   }

   public static <T, L extends List<T>> IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T, L> RRHOOOORORHHOOIHRCCHIIHHIIIIOH(Supplier<L> var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   public static <T, L extends List<T>> IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T, L> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Supplier<L> var0, Class<T> var1
   ) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   @Generated
   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(L var1) {
      this.CIICCOIIRHIRHORHICCHOIHIOIOOOH = (L)var1;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T, L extends List<T>> extends IRCIIHHICIHRCOCRROCOICRIHHCCHH<T, L> {
      private final Supplier<L> IIICHORHHIHCIOOIOHOHROIHOOOCRI;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Supplier<L> var1) {
         super(null);
         this.IIICHORHHIHCIOOIOHOHROIHOOOCRI = var1;
      }

      @Override
      public <B> B IIRHCHHOICHRICOOCRORCCIOOIHOIR(Collection<T> var1) {
         if (this.CIICCOIIRHIRHORHICCHOIHIOIOOOH != null) {
            this.CIICCOIIRHIRHORHICCHOIHIOIOOOH.removeAll(var1);
         }

         return (B)this;
      }

      @Override
      public <B> B OHHRIOHROOIHOROCIRHCHORIHRRRRI(Collection<T> var1) {
         if (this.CIICCOIIRHIRHORHICCHOIHIOIOOOH == null) {
            this.CIICCOIIRHIRHORHICCHOIHIOIOOOH = this.IIICHORHHIHCIOOIOHOHROIHOOOCRI.get();
         }

         this.CIICCOIIRHIRHORHICCHOIHIOIOOOH.addAll(var1);
         return (B)this;
      }

      @Override
      public <B> B IIHRRHORCRCROCHHOHORCHCROCIHRO(Predicate<? super T> var1) {
         if (this.CIICCOIIRHIRHORHICCHOIHIOIOOOH != null) {
            this.CIICCOIIRHIRHORHICCHOIHIOIOOOH.removeIf(var1);
         }

         return (B)this;
      }

      @Nullable
      @Override
      public L build() {
         return this.CIICCOIIRHIRHORHICCHOIHIOIOOOH;
      }

      @Nullable
      @Override
      public List<T> RICROIRCIORIROIIOOIOCIOCICRCRR() {
         return this.CIICCOIIRHIRHORHICCHOIHIOIOOOH == null ? null : super.RICROIRCIORIROIIOOIOCIOCICRCRR();
      }
   }
}
