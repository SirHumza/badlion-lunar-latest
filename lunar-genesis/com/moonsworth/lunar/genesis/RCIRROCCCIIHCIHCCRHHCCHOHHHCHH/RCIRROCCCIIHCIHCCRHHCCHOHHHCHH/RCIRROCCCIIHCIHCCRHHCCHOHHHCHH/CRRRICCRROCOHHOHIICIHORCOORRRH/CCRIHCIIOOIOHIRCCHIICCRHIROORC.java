package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class CCRIHCIIOOIOHIRCCHIICCRHIROORC {
   private CCRIHCIIOOIOHIRCCHIICCRHIROORC() {
   }

   public static <T, E, M extends CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E>> Collector<T, ?, M> toMultiset(
      Function<? super T, E> var0, ToIntFunction<? super T> var1, Supplier<M> var2
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      return (Collector<T, ?, M>)Collector.of(var2, (var2x, var3) -> var2x.add(var0.apply(var3), var1.applyAsInt(var3)), (var0x, var1x) -> {
         var0x.addAll(var1x);
         return var0x;
      });
   }

   public static <E> CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<? extends E> var0) {
      return !(var0 instanceof CCRIHCIIOOIOHIRCCHIICCRHIROORC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR) && !(var0 instanceof HOCCCIICRCIIIIRHHICOCOOIICHIOR)
         ? new CCRIHCIIOOIOHIRCCHIICCRHIROORC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<>(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            )
         )
         : var0;
   }

   @Deprecated
   public static <E> CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HOCCCIICRCIIIIRHHICOCOOIICHIOR<E> var0) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> IHRCROHROHOCCHIHOHRROHOCOIRHIO<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(IHRCROHROHOCCHIHOHRROHOCOIRHIO<E> var0) {
      return new ORICICIICROCRICRHRHHRCHHRCRHOR<>(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var0
         )
      );
   }

   public static <E> CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> CIOHHCORHRCCRICCCORIHCRHCCCRRR(@Nullable E var0, int var1) {
      return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>((E)var0, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var1
   ) {
      if (var0 instanceof CCRIHCIIOOIOHIRCCHIICCRHIROORC.RRCRRCORICCHOHHIRCHIROOHIIOHCO) {
         CCRIHCIIOOIOHIRCCHIICCRHIROORC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = (CCRIHCIIOOIOHIRCCHIICCRHIROORC.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var0;
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2.RCCRHCOROHCOOIOOIHCORHHOOOCHHH, var1
         );
         return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.RRCRRCORICCHOHHIRCHIROOHIIOHCO<>(var2.IORRCCHHHRCCRRIRCHRORRORHIIIOC, var3);
      } else {
         return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.RRCRRCORICCHOHHIRCHIROOHIIOHCO<>(var0, var1);
      }
   }

   static int inferDistinctElements(Iterable<?> var0) {
      return var0 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI ? ((CRIIOOIHIOHHRRRHIOROOCHCHHCCCI)var0).elementSet().size() : 11;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<? extends E> var0, final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<? extends E> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.CORCOCICIRIOHROHROIIOOHICCHCRR<E>() {
         @Override
         public boolean contains(@Nullable Object var1x) {
            return var0.contains(var1x) || var1.contains(var1x);
         }

         @Override
         public boolean isEmpty() {
            return var0.isEmpty() && var1.isEmpty();
         }

         @Override
         public int count(Object var1x) {
            return Math.max(var0.count(var1x), var1.count(var1x));
         }

         @Override
         Set<E> createElementSet() {
            return ICRHCCCCOIICOCHHCRCOOIHICROIHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0.elementSet(), var1.elementSet());
         }

         @Override
         Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
         }

         @Override
         Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entryIterator() {
            final Iterator var1x = var0.entrySet().iterator();
            final Iterator var2 = var1.entrySet().iterator();
            return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>(
               
            ) {
               protected CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> ORRORCCHHRCHIOOCCRORRRRCCCOOHR() {
                  if (var1x.hasNext()) {
                     CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1x.next();
                     Object var5 = var4.getElement();
                     int var3 = Math.max(var4.getCount(), var1.count(var5));
                     return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR((E)var5, var3);
                  }

                  while (var2.hasNext()) {
                     CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1xx = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.next();
                     Object var2x = var1xx.getElement();
                     if (!var0.contains(var2x)) {
                        return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR((E)var2x, var1xx.getCount());
                     }
                  }

                  return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }
            };
         }
      };
   }

   public static <E> CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> CRRRICCRROCOHHOHIICIHORCOORRRH(
      final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.CORCOCICIRIOHROHROIIOOHICCHCRR<E>() {
         @Override
         public int count(Object var1x) {
            int var2 = var0.count(var1x);
            return var2 == 0 ? 0 : Math.min(var2, var1.count(var1x));
         }

         @Override
         Set<E> createElementSet() {
            return ICRHCCCCOIICOCHHCRCOOIHICROIHI.CRRRICCRROCOHHOHIICIHORCOORRRH(var0.elementSet(), var1.elementSet());
         }

         @Override
         Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
         }

         @Override
         Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entryIterator() {
            final Iterator var1x = var0.entrySet().iterator();
            return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>(
               
            ) {
               protected CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> ORRORCCHHRCHIOOCCRORRRRCCCOOHR() {
                  while (var1x.hasNext()) {
                     CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1xx = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1x.next();
                     Object var2 = var1xx.getElement();
                     int var3 = Math.min(var1xx.getCount(), var1.count(var2));
                     if (var3 > 0) {
                        return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR((E)var2, var3);
                     }
                  }

                  return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }
            };
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<? extends E> var0, final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<? extends E> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.CORCOCICIRIOHROHROIIOOHICCHCRR<E>() {
         @Override
         public boolean contains(@Nullable Object var1x) {
            return var0.contains(var1x) || var1.contains(var1x);
         }

         @Override
         public boolean isEmpty() {
            return var0.isEmpty() && var1.isEmpty();
         }

         @Override
         public int size() {
            return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.saturatedAdd(
               var0.size(), var1.size()
            );
         }

         @Override
         public int count(Object var1x) {
            return var0.count(var1x) + var1.count(var1x);
         }

         @Override
         Set<E> createElementSet() {
            return ICRHCCCCOIICOCHHCRCOOIHICROIHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0.elementSet(), var1.elementSet());
         }

         @Override
         Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
         }

         @Override
         Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entryIterator() {
            final Iterator var1x = var0.entrySet().iterator();
            final Iterator var2 = var1.entrySet().iterator();
            return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>(
               
            ) {
               protected CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> ORRORCCHHRCHIOOCCRORRRRCCCOOHR() {
                  if (var1x.hasNext()) {
                     CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1x.next();
                     Object var5 = var4.getElement();
                     int var3 = var4.getCount() + var1.count(var5);
                     return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR((E)var5, var3);
                  }

                  while (var2.hasNext()) {
                     CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1xx = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.next();
                     Object var2x = var1xx.getElement();
                     if (!var0.contains(var2x)) {
                        return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR((E)var2x, var1xx.getCount());
                     }
                  }

                  return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }
            };
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.CORCOCICIRIOHROHROIIOOHICCHCRR<E>() {
         @Override
         public int count(@Nullable Object var1x) {
            int var2 = var0.count(var1x);
            return var2 == 0 ? 0 : Math.max(0, var2 - var1.count(var1x));
         }

         @Override
         public void clear() {
            throw new UnsupportedOperationException();
         }

         @Override
         Iterator<E> elementIterator() {
            final Iterator var1x = var0.entrySet().iterator();
            return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E>(
               
            ) {
               @Override
               protected E computeNext() {
                  while (var1x.hasNext()) {
                     CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1xx = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1x.next();
                     Object var2 = var1xx.getElement();
                     if (var1xx.getCount() > var1.count(var2)) {
                        return (E)var2;
                     }
                  }

                  return (E)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }
            };
         }

         @Override
         Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entryIterator() {
            final Iterator var1x = var0.entrySet().iterator();
            return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>(
               
            ) {
               protected CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> ORRORCCHHRCHIOOCCRORRRRCCCOOHR() {
                  while (var1x.hasNext()) {
                     CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1xx = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1x.next();
                     Object var2 = var1xx.getElement();
                     int var3 = var1xx.getCount() - var1.count(var2);
                     if (var3 > 0) {
                        return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR((E)var2, var3);
                     }
                  }

                  return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }
            };
         }

         @Override
         int distinctElements() {
            return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.size(this.entryIterator());
         }
      };
   }

   @CanIgnoreReturnValue
   public static boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var0, CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );

      for (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : var1.entrySet()) {
         int var4 = var0.count(var3.getElement());
         if (var4 < var3.getCount()) {
            return false;
         }
      }

      return true;
   }

   @CanIgnoreReturnValue
   public static boolean OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var0, CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var1) {
      return CORCOCICIRIOHROHROIIOOHICCHCRR(var0, var1);
   }

   private static <E> boolean CORCOCICIRIOHROHROIIOOHICCHCRR(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Iterator var2 = var0.entrySet().iterator();
      boolean var3 = false;

      while (var2.hasNext()) {
         CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.next();
         int var5 = var1.count(var4.getElement());
         if (var5 == 0) {
            var2.remove();
            var3 = true;
         } else if (var5 < var4.getCount()) {
            var0.setCount(var4.getElement(), var5);
            var3 = true;
         }
      }

      return var3;
   }

   @CanIgnoreReturnValue
   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var0, Iterable<?> var1) {
      if (var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI) {
         return CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0, (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?>)var1);
      }

      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = false;

      for (Object var4 : var1) {
         var2 |= var0.remove(var4);
      }

      return var2;
   }

   @CanIgnoreReturnValue
   public static boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var0, CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = false;
      Iterator var3 = var0.entrySet().iterator();

      while (var3.hasNext()) {
         CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.next();
         int var5 = var1.count(var4.getElement());
         if (var5 >= var4.getCount()) {
            var3.remove();
            var2 = true;
         } else if (var5 > 0) {
            var0.remove(var4.getElement(), var5);
            var2 = true;
         }
      }

      return var2;
   }

   static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var0, @Nullable Object var1) {
      if (var1 == var0) {
         return true;
      }

      if (var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI) {
         CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var2 = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI)var1;
         if (var0.size() == var2.size() && var0.entrySet().size() == var2.entrySet().size()) {
            for (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var2.entrySet()) {
               if (var0.count(var4.getElement()) != var4.getCount()) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static <E> boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, Collection<? extends E> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI) {
         return HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var0, RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(var1));
      } else {
         return var1.isEmpty() ? false : HRCROCOHHHICRHIHHOOCIIRRRCCIRR.addAll(var0, var1.iterator());
      }
   }

   private static <E> boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<? extends E> var1) {
      if (var1.isEmpty()) {
         return false;
      }

      var1.forEachEntry(var0::add);
      return true;
   }

   static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var0, Collection<?> var1) {
      Collection var2 = var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI ? ((CRIIOOIHIOHHRRRHIOROOCHCHHCCCI)var1).elementSet() : var1;
      return var0.elementSet().removeAll(var2);
   }

   static boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var0, Collection<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Collection var2 = var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI ? ((CRIIOOIHIOHHRRRHIOROOCHCHHCCCI)var1).elementSet() : var1;
      return var0.elementSet().retainAll(var2);
   }

   static <E> int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, E var1, int var2) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "count");
      int var3 = var0.count(var1);
      int var4 = var2 - var3;
      if (var4 > 0) {
         var0.add(var1, var4);
      } else if (var4 < 0) {
         var0.remove(var1, -var4);
      }

      return var3;
   }

   static <E> boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, E var1, int var2, int var3) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "oldCount");
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var3, "newCount");
      if (var0.count(var1) == var2) {
         var0.setCount(var1, var3);
         return true;
      } else {
         return false;
      }
   }

   static <E> Iterator<E> elementIterator(Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> var0) {
      return new HOIRRRIRHICOHCCORHIHCOHIIIHCCO<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>, E>(var0) {
         E IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> var1) {
            return (E)var1.getElement();
         }
      };
   }

   static <E> Iterator<E> HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0) {
      return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<>(var0, var0.entrySet().iterator());
   }

   static <E> Spliterator<E> CRRRICCRROCOHHOHIICIHORCOORRRH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0) {
      Spliterator var1 = var0.entrySet().spliterator();
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.flatMap(
         var1,
         var0x -> (Spliterator<E>)Collections.nCopies(var0x.getCount(), var0x.getElement()).spliterator(),
         64 | var1.characteristics() & 1296,
         var0.size()
      );
   }

   static int RRCRRCORICCHOHHIRCHIROOHIIOHCO(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<?> var0) {
      long var1 = 0L;

      for (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var0.entrySet()) {
         var1 += var4.getCount();
      }

      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(
         var1
      );
   }

   static <T> CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<T> RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(Iterable<T> var0) {
      return (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<T>)var0;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> HOCCCIICRCIIIIRHHICOCOOIICHIOR<E> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0) {
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var1 = var0.entrySet()
         .toArray(new CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[0]);
      Arrays.sort(var1, CCRIHCIIOOIOHIRCCHIICCRHIROORC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIICIHORHRHOHRRCOROCRORIOHCCHO);
      return HOCCCIICRCIIIIRHHICOCOOIICHIOR.IHIRRIIORRHORHRORIHOROIRCORCOO(Arrays.asList(var1));
   }

   private abstract static class CORCOCICIRIOHROHROIIOOHICCHCRR<E>
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR<E> {
      private CORCOCICIRIOHROHROIIOOHICCHCRR() {
      }

      @Override
      public int size() {
         return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
      }

      @Override
      public void clear() {
         this.elementSet().clear();
      }

      @Override
      public Iterator<E> iterator() {
         return CCRIHCIIOOIOHIRCCHIICCRHIROORC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
      }

      @Override
      int distinctElements() {
         return this.elementSet().size();
      }
   }

   abstract static class CRRRICCRROCOHHOHIICIHORCOORRRH<E>
      extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> {
      abstract CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> OOIORIRHCHIIOOIRCRIRHRHIOIRROO();

      @Override
      public boolean contains(@Nullable Object var1) {
         if (var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            if (var2.getCount() <= 0) {
               return false;
            }

            int var3 = this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO().count(var2.getElement());
            return var3 == var2.getCount();
         } else {
            return false;
         }
      }

      @Override
      public boolean remove(Object var1) {
         if (var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            Object var3 = var2.getElement();
            int var4 = var2.getCount();
            if (var4 != 0) {
               CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var5 = this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO();
               return var5.setCount(var3, var4, 0);
            }
         }

         return false;
      }

      @Override
      public void clear() {
         this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO().clear();
      }
   }

   abstract static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<E> {
      abstract CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> OOIORIRHCHIIOOIRCRIRHRHIOIRROO();

      @Override
      public void clear() {
         this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO().clear();
      }

      @Override
      public boolean contains(Object var1) {
         return this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO().contains(var1);
      }

      @Override
      public boolean containsAll(Collection<?> var1) {
         return this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO().containsAll(var1);
      }

      @Override
      public boolean isEmpty() {
         return this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO().isEmpty();
      }

      @Override
      public abstract Iterator<E> iterator();

      @Override
      public boolean remove(Object var1) {
         return this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO().remove(var1, Integer.MAX_VALUE) > 0;
      }

      @Override
      public int size() {
         return this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO().entrySet().size();
      }
   }

   static final class HRCHROOHRIHCRCRHRIIROCIRHOIRHH<E> implements Iterator<E> {
      private final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> HHICIHIRHRIOIRIHIIROROHOROOHOO;
      private final Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> HRCOCIHCIIIHIHRHORORHROCHRCRRH;
      private CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> ICCHCCCOOIIOIOIHHOROROIIOIRHCO;
      private int laterCount;
      private int totalCount;
      private boolean canRemove;

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var1, Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> var2) {
         this.HHICIHIRHRIOIRIHIIROROHOROOHOO = var1;
         this.HRCOCIHCIIIHIHRHORORHROCHRCRRH = var2;
      }

      @Override
      public boolean hasNext() {
         return this.laterCount > 0 || this.HRCOCIHCIIIHIHRHORORHROCHRCRRH.hasNext();
      }

      @Override
      public E next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         if (this.laterCount == 0) {
            this.ICCHCCCOOIIOIOIHHOROROIIOIRHCO = this.HRCOCIHCIIIHIHRHORORHROCHRCRRH.next();
            this.totalCount = this.laterCount = this.ICCHCCCOOIIOIOIHHOROROIIOIRHCO.getCount();
         }

         this.laterCount--;
         this.canRemove = true;
         return this.ICCHCCCOOIIOIOIHHOROROIIOIRHCO.getElement();
      }

      @Override
      public void remove() {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.canRemove);
         if (this.totalCount == 1) {
            this.HRCOCIHCIIIHIHRHORORHROCHRCRRH.remove();
         } else {
            this.HHICIHIRHRIOIRIHIIROROHOROOHOO.remove(this.ICCHCCCOOIIOIOIHHOROROIIOIRHCO.getElement());
         }

         this.totalCount--;
         this.canRemove = false;
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Comparator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>> {
      static final CCRIHCIIOOIOHIRCCHIICCRHIROORC.IRCIIHHICIHRCOCRROCOICRIHHCCHH OIICIHORHRHOHRRCOROCRORIOHCCHO = new CCRIHCIIOOIOHIRCCHIICCRHIROORC.IRCIIHHICIHRCOCRROCOICRIHHCCHH();

      public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> var1, CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> var2
      ) {
         return var2.getCount() - var1.getCount();
      }
   }

   static class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<E> extends CCRHOICIRORRHOOOCIHHHHCHCICHOH<E> implements Serializable {
      final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<? extends E> CRCIHHHOHCHHOICHOORIHIHICRCCHC;
      transient @Nullable Set<E> elementSet;
      transient @Nullable Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entrySet;
      private static final long RHROORHCOOCIHIOOOIROIOOHICOORR = 0L;

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<? extends E> var1) {
         this.CRCIHHHOHCHHOICHOORIHIHICRCCHC = var1;
      }

      @Override
      protected CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> CIHHORHICHHIRCRRIIROCIOCICIRCI() {
         return (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E>)this.CRCIHHHOHCHHOICHOORIHIHICRCCHC;
      }

      Set<E> createElementSet() {
         return Collections.unmodifiableSet(this.CRCIHHHOHCHHOICHOORIHIHICRCCHC.elementSet());
      }

      @Override
      public Set<E> elementSet() {
         Set var1 = this.elementSet;
         return var1 == null ? (this.elementSet = this.createElementSet()) : var1;
      }

      @Override
      public Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entrySet() {
         Set var1 = this.entrySet;
         return var1 == null ? (this.entrySet = Collections.unmodifiableSet(this.CRCIHHHOHCHHOICHOORIHIHICRCCHC.entrySet())) : var1;
      }

      @Override
      public Iterator<E> iterator() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.CRCIHHHOHCHHOICHOORIHIHICRCCHC.iterator());
      }

      @Override
      public boolean add(E var1) {
         throw new UnsupportedOperationException();
      }

      @Override
      public int add(E var1, int var2) {
         throw new UnsupportedOperationException();
      }

      @Override
      public boolean addAll(Collection<? extends E> var1) {
         throw new UnsupportedOperationException();
      }

      @Override
      public boolean remove(Object var1) {
         throw new UnsupportedOperationException();
      }

      @Override
      public int remove(Object var1, int var2) {
         throw new UnsupportedOperationException();
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         throw new UnsupportedOperationException();
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         throw new UnsupportedOperationException();
      }

      @Override
      public void clear() {
         throw new UnsupportedOperationException();
      }

      @Override
      public int setCount(E var1, int var2) {
         throw new UnsupportedOperationException();
      }

      @Override
      public boolean setCount(E var1, int var2, int var3) {
         throw new UnsupportedOperationException();
      }
   }

   abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> implements CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> {
      @Override
      public boolean equals(@Nullable Object var1) {
         if (!(var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)) {
            return false;
         }

         CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         return this.getCount() == var2.getCount()
            && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               this.getElement(), var2.getElement()
            );
      }

      @Override
      public int hashCode() {
         Object var1 = this.getElement();
         return (var1 == null ? 0 : var1.hashCode()) ^ this.getCount();
      }

      @Override
      public String toString() {
         String var1 = String.valueOf(this.getElement());
         int var2 = this.getCount();
         return var2 == 1 ? var1 : var1 + " x " + var2;
      }
   }

   static class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> extends CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> implements Serializable {
      private final @Nullable E IRIRHIIRHIIOHOHHIRIHORRHHOOOCR;
      private final int OHHRIIOIHIRHIIHHHHIRICOHRHOOCH;
      private static final long COHROIOOCHCIOIRIRRIRRHRRCHCICH = 0L;

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(@Nullable E var1, int var2) {
         this.IRIRHIIRHIIOHOHHIRIHORRHHOOOCR = (E)var1;
         this.OHHRIIOIHIRHIIHHHHIRICOHRHOOCH = var2;
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "count");
      }

      @Override
      public final @Nullable E getElement() {
         return this.IRIRHIIRHIIOHOHHIRIHORRHHOOOCR;
      }

      @Override
      public final int getCount() {
         return this.OHHRIIOIHIRHIIHHHHIRICOHRHOOCH;
      }

      public CCRIHCIIOOIOHIRCCHIICCRHIROORC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> OORRCCIOCICHIHHRHRRIHCICOORHIC() {
         return null;
      }
   }

   private static final class RRCRRCORICCHOHHIRCHIROOHIIOHCO<E> extends CCRIHCIIOOIOHIRCCHIICCRHIROORC.CORCOCICIRIOHROHROIIOOHICCHCRR<E> {
      final CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> IORRCCHHHRCCRRIRCHRORRORHIIIOC;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> RCCRHCOROHCOOIOOIHCORHHOOOCHHH;

      RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var2
      ) {
         this.IORRCCHHHRCCRRIRCHRORRORHIIIOC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.RCCRHCOROHCOOIOOIHCORHHOOOCHHH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.IORRCCHHHRCCRRIRCHRORRORHIIIOC.iterator(), this.RCCRHCOROHCOOIOOIHCORHHOOOCHHH
         );
      }

      @Override
      Set<E> createElementSet() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.IORRCCHHHRCCRRIRCHRORRORHIIIOC.elementSet(), this.RCCRHCOROHCOOIOOIHCORHHOOOCHHH
         );
      }

      @Override
      Iterator<E> elementIterator() {
         throw new AssertionError("should never be called");
      }

      @Override
      Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> createEntrySet() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.IORRCCHHHRCCRRIRCHRORRORHIIIOC.entrySet(),
            new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>(
               
            ) {
               public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> var1) {
                  return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.RCCRHCOROHCOOIOOIHCORHHOOOCHHH.apply((E)var1.getElement());
               }
            }
         );
      }

      @Override
      Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entryIterator() {
         throw new AssertionError("should never be called");
      }

      @Override
      public int count(@Nullable Object var1) {
         int var2 = this.IORRCCHHHRCCRRIRCHRORRORHIIIOC.count(var1);
         if (var2 > 0) {
            Object var3 = var1;
            return this.RCCRHCOROHCOOIOOIHCORHHOOOCHHH.apply((E)var3) ? var2 : 0;
         } else {
            return 0;
         }
      }

      @Override
      public int add(@Nullable E var1, int var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.RCCRHCOROHCOOIOOIHCORHHOOOCHHH.apply((E)var1), "Element %s does not match predicate %s", var1, this.RCCRHCOROHCOOIOOIHCORHHOOOCHHH
         );
         return this.IORRCCHHHRCCRRIRCHRORRORHIIIOC.add((E)var1, var2);
      }

      @Override
      public int remove(@Nullable Object var1, int var2) {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "occurrences");
         if (var2 == 0) {
            return this.count(var1);
         } else {
            return this.contains(var1) ? this.IORRCCHHHRCCRRIRCHRORRORHIIIOC.remove(var1, var2) : 0;
         }
      }
   }
}
