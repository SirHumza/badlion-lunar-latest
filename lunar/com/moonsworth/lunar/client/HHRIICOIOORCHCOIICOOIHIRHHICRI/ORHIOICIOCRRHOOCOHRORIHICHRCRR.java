package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Keyable;
import com.moonsworth.lunar.client.util.CIHCOICOOICHOCCHICIHRCOCIHRIOC;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;

public interface ORHIOICIOCRRHOOCOHRORIHICHRCRR
   extends com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   String toString();

   String id();

   default com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH icon() {
      return null;
   }

   default String description() {
      return "";
   }

   @Override
   default String getLanguagePath() {
      return "settings";
   }

   @Override
   default JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", this.id());
      var1.addProperty("name", this.toString());
      var1.addProperty("description", this.description());
      if (this.icon() != null) {
         var1.addProperty("icon", this.icon().ordinal());
      }

      return var1;
   }

   static <E extends Enum<E> & ORHIOICIOCRRHOOCOHRORIHICHRCRR> ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(
      Supplier<E[]> var0
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var0x -> var0x);
   }

   static <E extends Enum<E> & ORHIOICIOCRRHOOCOHRORIHICHRCRR> ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Supplier<E[]> var0, Function<String, String> var1
   ) {
      Enum[] var2 = (Enum[])var0.get();
      return new ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>((E[])var2, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E[])var2, var1));
   }

   static <T extends ORHIOICIOCRRHOOCOHRORIHICHRCRR> Codec<T> HRRHRCCOOIOIIIRORIOOORORHOORIH(Supplier<T[]> var0) {
      ORHIOICIOCRRHOOCOHRORIHICHRCRR[] var1 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR[])var0.get();
      return new ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(
         (T[])var1, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((T[])var1, var0x -> var0x), CIHCOICOOICHOCCHICIHRCOCIHRIOC.CORCOCICIRIOHROHROIIOOHICCHCRR((T[])var1)
      );
   }

   static <T extends ORHIOICIOCRRHOOCOHRORIHICHRCRR> Function<String, T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T[] var0, Function<String, String> var1) {
      if (var0.length > 16) {
         Map var2 = Arrays.stream(var0).collect(Collectors.toMap(var1x -> (String)var1.apply(var1x.id()), var0x -> (ORHIOICIOCRRHOOCOHRORIHICHRCRR)var0x));
         return var1x -> (T)(var1x == null ? null : var2.get(var1x));
      } else {
         return var2x -> {
            for (ORHIOICIOCRRHOOCOHRORIHICHRCRR var6 : var0) {
               if (((String)var1.apply(var6.id())).equals(var2x)) {
                  return (T)var6;
               }
            }

            return null;
         };
      }
   }

   static Keyable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final ORHIOICIOCRRHOOCOHRORIHICHRCRR[] var0) {
      return new Keyable() {
         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1) {
            return Arrays.stream(var0).map(ORHIOICIOCRRHOOCOHRORIHICHRCRR::id).map(var1::createString);
         }
      };
   }

   class IRCIIHHICIHRCOCRROCOICRIHHCCHH<E extends ORHIOICIOCRRHOOCOHRORIHICHRCRR> implements Codec<E> {
      private final Codec<E> HOCHHCROHOHCCOIOOHIIIHCHIIOCRI;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(E[] var1, Function<String, E> var2, ToIntFunction<E> var3) {
         this.HOCHHCROHOHCCOIOOHIIIHCHIIOCRI = com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            Codec.stringResolver(ORHIOICIOCRRHOOCOHRORIHICHRCRR::id, var2),
            com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var3, var1x -> (E)(var1x >= 0 && var1x < var1.length ? var1[var1x] : null), -1
            )
         );
      }

      @Override
      public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> var1, T var2) {
         return this.HOCHHCROHOHCCOIOOHIIIHCHIIOCRI.decode(var1, (T)var2);
      }

      public <T> DataResult<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var1, DynamicOps<T> var2, T var3) {
         return this.HOCHHCROHOHCCOIOOHIIIHCHIIOCRI.encode((E)var1, var2, (T)var3);
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E extends Enum<E> & ORHIOICIOCRRHOOCOHRORIHICHRCRR>
      extends ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> {
      private final Function<String, E> RRRCRHROIOHCHCRCOIIHOOCRIRCIHC;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E[] var1, Function<String, E> var2) {
         super((E[])var1, var2, var0 -> var0.ordinal());
         this.RRRCRHROIOHCHCRCOIIHOOCRIRCIHC = var2;
      }

      @Nullable
      public E RHRHCCIHCOCHHOCOIOHRCHOIICRIOR(@Nullable String var1) {
         return this.RRRCRHROIOHCHCRCOIIHOOCRIRCIHC.apply(var1);
      }

      public E RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable String var1, E var2) {
         return Objects.requireNonNullElse(this.RHRHCCIHCOCHHOCOIOHRCHOIICRIOR(var1), (E)var2);
      }
   }
}
