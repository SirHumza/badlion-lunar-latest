package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import com.google.common.collect.Iterators;
import com.moonsworth.lunar.client.util.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntConsumer;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntPredicate;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterators;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends CORCOCICIRIOHROHROIIOOHICCHCRR, Iterable<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> {
   OCOHORHCROHICRRIHCIHHRRCIHICRI ORORICHHRHHRRORHHIOCORRIROIOHO();

   IntSet OOHOCHHOOIHICOOICOIIOHOHHICHCH();

   Collection<?> values();

   @Override
   default boolean ICICIOCHHHIHOCHCOHORIHRCOHHOCR(OHHRIOHROOIHOROCIRHCHORIHRRRRI<?> var1) {
      return this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1) != null;
   }

   @Nullable
   <T> T get(int var1);

   @Nullable
   @Override
   default <T> T IHCRORHRORIICHRHRCHRRIRRHHOCOO(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1) {
      return this.get(var1.getId());
   }

   @Nullable
   default <T> RRCRRCORICCHOHHIRCHIROOHIIOHCO<T> RCCOIIHIHORORRRIRROICICOROOCCO(int var1) {
      Object var2 = this.get(var1);
      return var2 != null ? new RRCRRCORICCHOHHIRCHIROOHIIOHCO<>(var1, (T)var2) : null;
   }

   @NotNull
   @Override
   default <T> T RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1) {
      Object var2 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1);
      if (var2 == null) {
         throw new RuntimeException("Trait \"" + this.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var1.getId()) + "\" hasn't been set!");
      } else {
         return (T)var2;
      }
   }

   @NotNull
   @Override
   default Iterator<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> iterator() {
      return Iterators.transform(this.OOHOCHHOOIHICOOICOIIOHOHHICHCH().iterator(), var1 -> Objects.requireNonNull(this.RCCOIIHIHORORRRIRROICICOROOCCO(var1)));
   }

   default Stream<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> stream() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), this.size(), 1345), false);
   }

   default int size() {
      return this.OOHOCHHOOIHICOOICOIIOHOHHICHCH().size();
   }

   default boolean isEmpty() {
      return this.size() == 0;
   }

   default HRCHROOHRIHCRCRHRIIROCIRHOIRHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final IntPredicate var1) {
      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
         @Nullable
         @Override
         public <T> T get(int var1x) {
            return var1.test(var1x) ? HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.get(var1x) : null;
         }

         @Override
         public OCOHORHCROHICRRIHCIHHRRCIHICRI ORORICHHRHHRRORHHIOCORRIROIOHO() {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.ORORICHHRHHRRORHHIOCORRIROIOHO();
         }

         @Override
         public IntSet OOHOCHHOOIHICOOICOIIOHOHHICHCH() {
            IntArraySet var1x = new IntArraySet();
            IntIterator var2 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.OOHOCHHOOIHICOOICOIIOHOHHICHCH().iterator();

            while (var2.hasNext()) {
               int var3 = (Integer)var2.next();
               if (var1.test(var3)) {
                  var1x.add(var3);
               }
            }

            return var1x;
         }

         @Override
         public Collection<?> values() {
            ArrayList var1x = new ArrayList();
            Iterator var2 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.iterator();
            if (var2.hasNext()) {
               RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = (RRCRRCORICCHOHHIRCHIROOHIIOHCO)var2.next();
               if (var1.test(var3.type())) {
                  var1x.add(var3.value());
               }
            }

            return var1x;
         }
      };
   }

   static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var0, int var1, IntPredicate var2, IntConsumer var3, boolean var4, boolean var5, int var6
   ) {
      try {
         Map var7 = var0.RHIHOOOHCIRRIOCRRRHRIHIORICOHI(var1);
         if (var7 != null) {
            for (Entry var9 : var7.entrySet()) {
               switch ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var9.getKey()) {
                  case CONFLICTS:
                     for (int var22 : (int[])var9.getValue()) {
                        if (var2.test(var22)) {
                           throw new RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              var0.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var1), var0.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var22)
                           );
                        }
                     }
                     break;
                  case REQUIRES:
                     if (var4 || !var5 || var6 != -1 && var1 == var6) {
                        for (int var21 : (int[])var9.getValue()) {
                           if (!var2.test(var21)) {
                              throw new RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                                 var0.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var1), var0.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var21)
                              );
                           }
                        }
                     }
                     break;
                  case REMOVE:
                     if (var4 || var5) {
                        for (int var13 : (int[])var9.getValue()) {
                           var3.accept(var13);
                        }
                     }
               }
            }
         }
      } catch (Throwable var14) {
         throw var14;
      }
   }

   static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var0, Int2ObjectMap<?> var1) {
      try {
         IntIterator var2 = new IntArraySet(var1.keySet()).iterator();

         while (var2.hasNext()) {
            int var3 = (Integer)var2.next();
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var3, var1::containsKey, var1::remove, true, true, -1);
         }
      } catch (Throwable var4) {
         throw var4;
      }
   }

   static HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HROOCRRHCOIOORICRCOIHICCOIHCCC() {
      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Int2ObjectMap<Supplier<?>> CIOCHHRCHOORCCIOICCOHRRICHIIIO = new Int2ObjectOpenHashMap();

      public <T> HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, @Nullable Supplier<T> var2
      ) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
         return this;
      }

      public <T> HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, OOHRIIOOHROIOHCIRIHRHRRICRRHOI<T> var2
      ) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2::build);
         return this;
      }

      public <T, B extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI<T>> HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T, B> var1, Consumer<B> var2
      ) {
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI var3 = var1.ORIROCCHROOOORRICRCIHRCIRICROI();
         var2.accept(var3);
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var3::build);
         return this;
      }

      <T> void IRCIIHHICIHRCOCRROCOICRIHHCCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, @Nullable Supplier<?> var2) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getId(), var2);
      }

      <T> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, @Nullable Supplier<?> var2) {
         if (var2 != null) {
            this.CIOCHHRCHOORCCIOICCOHRRICHIIIO.put(var1, var2);
         } else {
            this.CIOCHHRCHOORCCIOICCOHRRICHIIIO.remove(var1);
         }
      }

      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 : var1) {
            this.CIOCHHRCHOORCCIOICCOHRRICHIIIO.put(var3.type(), var3::value);
         }

         return this;
      }

      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
         ObjectIterator var2 = Reference2ObjectMaps.fastIterable(var1.OOOCHCHORHHROOHIRCCCCIIRCCHRRC).iterator();

         while (var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry var3 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry)var2.next();
            ((Optional)var3.getValue())
               .ifPresent(var2x -> this.CIOCHHRCHOORCCIOICCOHRRICHIIIO.put(((OHHRIOHROOIHOROCIRHCHORIHRRRRI)var3.getKey()).getId(), (Supplier<>)() -> var2x));
         }

         return this;
      }

      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
         Int2ObjectMap var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         Object var3 = var2.isEmpty() ? Int2ObjectMaps.emptyMap() : (var2.size() < 8 ? new Int2ObjectArrayMap(var2) : new Int2ObjectOpenHashMap(var2));
         return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, (Int2ObjectMap<Object>)var3);
      }

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
         Int2ObjectMap var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         Object var3 = var2.isEmpty() ? new Int2ObjectArrayMap(2) : (var2.size() < 8 ? new Int2ObjectArrayMap(var2) : new Int2ObjectOpenHashMap(var2));
         return new CRRRICCRROCOHHOHIICIHORCOORRRH(var1, (Int2ObjectMap<Object>)var3);
      }

      private Int2ObjectMap<Object> HHCCIRHCCCIIRHCROHIORHIRHHIORH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.CIOCHHRCHOORCCIOICCOHRRICHIIIO);
         Int2ObjectArrayMap var2 = new Int2ObjectArrayMap(this.CIOCHHRCHOORCCIOICCOHRRICHIIIO.size());
         ObjectIterator var3 = this.CIOCHHRCHOORCCIOICCOHRRICHIIIO.int2ObjectEntrySet().iterator();

         while (var3.hasNext()) {
            it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry var4 = (it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry)var3.next();
            var2.put(var4.getIntKey(), ((Supplier)var4.getValue()).get());
         }

         return var2;
      }

      @Generated
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
         private final OCOHORHCROHICRRIHCIHHRRCIHICRI ICHCHORRCRHCRCIIHCCRRRICHRCRIR;
         private final Int2ObjectMap<Object> IHRCRROCOOCCIRCHOCCOIHHCIRHCCO;

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, Int2ObjectMap<Object> var2) {
            this.ICHCHORRCRHCRCIIHCCRRRICHRCRIR = var1;
            this.IHRCRROCOOCCIRCHOCCOIHHCIRHCCO = var2;
         }

         @Nullable
         @Override
         public <T> T get(int var1) {
            return (T)this.IHRCRROCOOCCIRCHOCCOIHHCIRHCCO.get(var1);
         }

         @Override
         public boolean ICICIOCHHHIHOCHCOHORIHRCOHHOCR(OHHRIOHROOIHOROCIRHCHORIHRRRRI<?> var1) {
            return this.IHRCRROCOOCCIRCHOCCOIHHCIRHCCO.containsKey(var1.getId());
         }

         @Override
         public IntSet OOHOCHHOOIHICOOICOIIOHOHHICHCH() {
            return this.IHRCRROCOOCCIRCHOCCOIHHCIRHCCO.keySet();
         }

         @Override
         public Collection<?> values() {
            return this.IHRCRROCOOCCIRCHOCCOIHHCIRHCCO.values();
         }

         @NotNull
         @Override
         public Iterator<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> iterator() {
            return Iterators.transform(
               Int2ObjectMaps.fastIterator(this.IHRCRROCOOCCIRCHOCCOIHHCIRHCCO), RRCRRCORICCHOHHIRCHIROOHIIOHCO::IRCIIHHICIHRCOCRROCOICRIHHCCHH
            );
         }

         @Override
         public int size() {
            return this.IHRCRROCOOCCIRCHOCCOIHHCIRHCCO.size();
         }

         @NotNull
         @Override
         public String toString() {
            return this.IHRCRROCOOCCIRCHOCCOIHHCIRHCCO.toString();
         }

         @Override
         public OCOHORHCROHICRRIHCIHHRRCIHICRI ORORICHHRHHRRORHHIOCORRIROIOHO() {
            return this.ICHCHORRCRHCRCIIHCCRRRICHRCRIR;
         }

         public Int2ObjectMap<Object> CHOCICOIROHOOOHRRRIOIIRHORHOHC() {
            return this.IHRCRROCOOCCIRCHOCCOIHHCIRHCCO;
         }
      }
   }
}
