package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.Collector.Characteristics;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class ICRHCCCCOIICOCHHCRCOOIHICROIHI {
   private ICRHCCCCOIICOCHHCRCOOIHICROIHI() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E extends Enum<E>> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var0, E... var1) {
      return CIIHHCHIRCRRIHOIOCCCROHOIOCCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EnumSet.of((E)var0, (E[])var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E extends Enum<E>> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> COIHORRCHRRCHOCIRHHRRIOIHRIHCC(Iterable<E> var0) {
      if (var0 instanceof CIIHHCHIRCRRIHOIOCCCROHOIOCCII) {
         return (CIIHHCHIRCRRIHOIOCCCROHOIOCCII)var0;
      } else if (var0 instanceof Collection) {
         Collection var3 = (Collection)var0;
         return var3.isEmpty()
            ? CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI()
            : CIIHHCHIRCRRIHOIOCCCROHOIOCCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EnumSet.copyOf(var3));
      } else {
         Iterator var1 = var0.iterator();
         if (var1.hasNext()) {
            EnumSet var2 = EnumSet.of((E)var1.next());
            HRCROCOHHHICRHIHHOOCIIRRRCCIRR.addAll(var2, var1);
            return CIIHHCHIRCRRIHOIOCCCROHOIOCCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
         } else {
            return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
         }
      }
   }

   public static <E extends Enum<E>> Collector<E, ?, CICOIHIRIIHHCIOICHRHICRIRCIOHC<E>> toImmutableEnumSet() {
      return (Collector<E, ?, CICOIHIRIIHHCIOICHRHICRIRCIOHC<E>>)ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRRCRRHCCIHICOCIRIOOROIIIRC;
   }

   public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> var0, Class<E> var1) {
      EnumSet var2 = EnumSet.noneOf(var1);
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var2, var0);
      return var2;
   }

   public static <E> HashSet<E> newHashSet() {
      return new HashSet<>();
   }

   public static <E> HashSet<E> newHashSet(E... var0) {
      HashSet var1 = newHashSetWithExpectedSize(var0.length);
      Collections.addAll(var1, (E[])var0);
      return var1;
   }

   public static <E> HashSet<E> newHashSet(Iterable<? extends E> var0) {
      return var0 instanceof Collection ? new HashSet<>(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0)) : newHashSet(var0.iterator());
   }

   public static <E> HashSet<E> newHashSet(Iterator<? extends E> var0) {
      HashSet var1 = newHashSet();
      HRCROCOHHHICRHIHHOOCIIRRRCCIRR.addAll(var1, var0);
      return var1;
   }

   public static <E> HashSet<E> newHashSetWithExpectedSize(int var0) {
      return new HashSet<>(ROCHRRCORRCOOOOOCOICOCROIIHIHH.capacity(var0));
   }

   public static <E> Set<E> newConcurrentHashSet() {
      return Collections.newSetFromMap(new ConcurrentHashMap<>());
   }

   public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> var0) {
      Set var1 = newConcurrentHashSet();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   public static <E> LinkedHashSet<E> newLinkedHashSet() {
      return new LinkedHashSet<>();
   }

   public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> var0) {
      if (var0 instanceof Collection) {
         return new LinkedHashSet<>(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0));
      }

      LinkedHashSet var1 = newLinkedHashSet();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int var0) {
      return new LinkedHashSet<>(ROCHRRCORRCOOOOOCOICOCROIIHIHH.capacity(var0));
   }

   public static <E extends Comparable> TreeSet<E> newTreeSet() {
      return new TreeSet<>();
   }

   public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> var0) {
      TreeSet var1 = newTreeSet();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   public static <E> TreeSet<E> newTreeSet(Comparator<? super E> var0) {
      return new TreeSet<>(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var0
         )
      );
   }

   public static <E> Set<E> newIdentityHashSet() {
      return Collections.newSetFromMap(ROCHRRCORRCOOOOOCOICOCROIIHIHH.newIdentityHashMap());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
      return new CopyOnWriteArraySet<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> var0) {
      Collection var1 = var0 instanceof Collection ? RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0) : RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(var0);
      return new CopyOnWriteArraySet<>(var1);
   }

   public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> var0) {
      if (var0 instanceof EnumSet) {
         return EnumSet.complementOf((EnumSet<E>)var0);
      }

      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         !var0.isEmpty(), "collection is empty; use the other version of this method"
      );
      Class var1 = ((Enum)var0.iterator().next()).getDeclaringClass();
      return makeComplementByHand(var0, var1);
   }

   public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> var0, Class<E> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return var0 instanceof EnumSet ? EnumSet.complementOf((EnumSet<E>)var0) : makeComplementByHand(var0, var1);
   }

   private static <E extends Enum<E>> EnumSet<E> makeComplementByHand(Collection<E> var0, Class<E> var1) {
      EnumSet var2 = EnumSet.allOf(var1);
      var2.removeAll(var0);
      return var2;
   }

   @Deprecated
   public static <E> Set<E> newSetFromMap(Map<E, Boolean> var0) {
      return Collections.newSetFromMap(var0);
   }

   public static <E> ICRHCCCCOIICOCHHCRCOOIHICROIHI.CORCOCICIRIOHROHROIIOOHICCHCRR<E> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      final Set<? extends E> var0, final Set<? extends E> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0, "set1"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "set2"
      );
      return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.CORCOCICIRIOHROHROIIOOHICCHCRR<E>() {
         @Override
         public int size() {
            int var1x = var0.size();

            for (Object var3 : var1) {
               if (!var0.contains(var3)) {
                  var1x++;
               }
            }

            return var1x;
         }

         @Override
         public boolean isEmpty() {
            return var0.isEmpty() && var1.isEmpty();
         }

         @Override
         public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
            return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E>(
               
            ) {
               final Iterator<? extends E> OCHOHHOCOOOOCOOOCOCHHHOHHOOOIC = var0.iterator();
               final Iterator<? extends E> HCIIROHOOHROOHHIICHHRORRHORCOC = var1.iterator();

               @Override
               protected E computeNext() {
                  if (this.OCHOHHOCOOOOCOOOCOCHHHOHHOOOIC.hasNext()) {
                     return (E)this.OCHOHHOCOOOOCOOOCOCHHHOHHOOOIC.next();
                  }

                  while (this.HCIIROHOOHROOHHIICHHRORRHORCOC.hasNext()) {
                     Object var1x = this.HCIIROHOOHROOHHIICHHRORRHORCOC.next();
                     if (!var0.contains(var1x)) {
                        return (E)var1x;
                     }
                  }

                  return (E)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }
            };
         }

         @Override
         public Stream<E> stream() {
            return Stream.concat(var0.stream(), var1.stream().filter(var1xx -> !var0.contains(var1xx)));
         }

         @Override
         public Stream<E> parallelStream() {
            return (Stream<E>)this.stream().parallel();
         }

         @Override
         public boolean contains(Object var1x) {
            return var0.contains(var1x) || var1.contains(var1x);
         }

         @Override
         public <S extends Set<E>> S copyInto(S var1x) {
            var1x.addAll(var0);
            var1x.addAll(var1);
            return (S)var1x;
         }

         @Override
         public CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> OCRRIICRCRCIIHCRICRIRCOIHRCHRI() {
            return new CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>()
               .RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0)
               .RCIROOOOICRHCCRRCIORHHIRCOIIIC(var1)
               .HCCCCRHROOROHRHCCIOIOIROIOOCIH();
         }
      };
   }

   public static <E> ICRHCCCCOIICOCHHCRCOOIHICROIHI.CORCOCICIRIOHROHROIIOOHICCHCRR<E> CRRRICCRROCOHHOHIICIHORCOORRRH(final Set<E> var0, final Set<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0, "set1"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "set2"
      );
      return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.CORCOCICIRIOHROHROIIOOHICCHCRR<E>() {
         @Override
         public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
            return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E>(
               
            ) {
               final Iterator<E> RCHROOOOIIIHRRHCOHIRHICIHCCOHO = var0.iterator();

               @Override
               protected E computeNext() {
                  while (this.RCHROOOOIIIHRRHCOHIRHICIHCCOHO.hasNext()) {
                     Object var1x = this.RCHROOOOIIIHRRHCOHIRHICIHCCOHO.next();
                     if (var1.contains(var1x)) {
                        return (E)var1x;
                     }
                  }

                  return (E)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }
            };
         }

         @Override
         public Stream<E> stream() {
            return var0.stream().filter(var1::contains);
         }

         @Override
         public Stream<E> parallelStream() {
            return var0.parallelStream().filter(var1::contains);
         }

         @Override
         public int size() {
            int var1x = 0;

            for (Object var3 : var0) {
               if (var1.contains(var3)) {
                  var1x++;
               }
            }

            return var1x;
         }

         @Override
         public boolean isEmpty() {
            return Collections.disjoint(var1, var0);
         }

         @Override
         public boolean contains(Object var1x) {
            return var0.contains(var1x) && var1.contains(var1x);
         }

         @Override
         public boolean containsAll(Collection<?> var1x) {
            return var0.containsAll(var1x) && var1.containsAll(var1x);
         }
      };
   }

   public static <E> ICRHCCCCOIICOCHHCRCOOIHICROIHI.CORCOCICIRIOHROHROIIOOHICCHCRR<E> RRCRRCORICCHOHHIRCHIROOHIIOHCO(final Set<E> var0, final Set<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0, "set1"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "set2"
      );
      return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.CORCOCICIRIOHROHROIIOOHICCHCRR<E>() {
         @Override
         public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
            return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E>(
               
            ) {
               final Iterator<E> HHOIIIHHIRCHHHHCOIRIROIOIRROOH = var0.iterator();

               @Override
               protected E computeNext() {
                  while (this.HHOIIIHHIRCHHHHCOIRIROIOIRROOH.hasNext()) {
                     Object var1x = this.HHOIIIHHIRCHHHHCOIRIROIOIRROOH.next();
                     if (!var1.contains(var1x)) {
                        return (E)var1x;
                     }
                  }

                  return (E)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }
            };
         }

         @Override
         public Stream<E> stream() {
            return var0.stream().filter(var1xx -> !var1.contains(var1xx));
         }

         @Override
         public Stream<E> parallelStream() {
            return var0.parallelStream().filter(var1xx -> !var1.contains(var1xx));
         }

         @Override
         public int size() {
            int var1x = 0;

            for (Object var3 : var0) {
               if (!var1.contains(var3)) {
                  var1x++;
               }
            }

            return var1x;
         }

         @Override
         public boolean isEmpty() {
            return var1.containsAll(var0);
         }

         @Override
         public boolean contains(Object var1x) {
            return var0.contains(var1x) && !var1.contains(var1x);
         }
      };
   }

   public static <E> ICRHCCCCOIICOCHHCRCOOIHICROIHI.CORCOCICIRIOHROHROIIOOHICCHCRR<E> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      final Set<? extends E> var0, final Set<? extends E> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0, "set1"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "set2"
      );
      return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.CORCOCICIRIOHROHROIIOOHICCHCRR<E>() {
         @Override
         public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
            final Iterator var1x = var0.iterator();
            final Iterator var2 = var1.iterator();
            return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E>(
               
            ) {
               @Override
               public E computeNext() {
                  while (var1x.hasNext()) {
                     Object var2x = var1x.next();
                     if (!var1.contains(var2x)) {
                        return (E)var2x;
                     }
                  }

                  while (var2.hasNext()) {
                     Object var1xx = var2.next();
                     if (!var0.contains(var1xx)) {
                        return (E)var1xx;
                     }
                  }

                  return (E)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }
            };
         }

         @Override
         public int size() {
            int var1x = 0;

            for (Object var3 : var0) {
               if (!var1.contains(var3)) {
                  var1x++;
               }
            }

            for (Object var5 : var1) {
               if (!var0.contains(var5)) {
                  var1x++;
               }
            }

            return var1x;
         }

         @Override
         public boolean isEmpty() {
            return var0.equals(var1);
         }

         @Override
         public boolean contains(Object var1x) {
            return var0.contains(var1x) ^ var1.contains(var1x);
         }
      };
   }

   public static <E> Set<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Set<E> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var1
   ) {
      if (var0 instanceof SortedSet) {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((SortedSet<E>)var0, var1);
      } else if (var0 instanceof ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO) {
         ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = (ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var0;
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2.IRCIHIHHROCHORIOICOHOCHRCCHICR, var1
         );
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO<>((Set<E>)var2.ICRCRCIHHIHCRIRCIRRIORORCHOIHR, var3);
      } else {
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO<>(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ),
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            )
         );
      }
   }

   public static <E> SortedSet<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      SortedSet<E> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var1
   ) {
      if (var0 instanceof ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO) {
         ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = (ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var0;
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2.IRCIHIHHROCHORIOICOHOCHRCCHICR, var1
         );
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>((SortedSet<E>)var2.ICRCRCIHHIHCRIRCIRRIORORCHOIHR, var3);
      } else {
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ),
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            )
         );
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> NavigableSet<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      NavigableSet<E> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var1
   ) {
      if (var0 instanceof ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO) {
         ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = (ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var0;
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2.IRCIHIHHROCHORIOICOHOCHRCCHICR, var1
         );
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.CRRRICCRROCOHHOHIICIHORCOORRRH<>((NavigableSet<E>)var2.ICRCRCIHHIHCRIRCIRRIORORCHOIHR, var3);
      } else {
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.CRRRICCRROCOHHOHIICIHORCOORRRH<>(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ),
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            )
         );
      }
   }

   public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> var0) {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.create(var0);
   }

   @SafeVarargs
   public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... var0) {
      return cartesianProduct(Arrays.asList(var0));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = false
   )
   public static <E> Set<Set<E>> powerSet(Set<E> var0) {
      return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<>(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> Set<Set<E>> combinations(Set<E> var0, final int var1) {
      final OOHRIIOOHROIOHCIRIHRHRRICRRHOI var2 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var0);
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var1, "size");
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 <= var2.size(), "size (%s) must be <= set.size() (%s)", var1, var2.size()
      );
      if (var1 == 0) {
         return CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH(CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI());
      } else {
         return var1 == var2.size()
            ? CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH(var2.RORCHHOHICRHCCIRRORIHCCOCRHOCO())
            : new AbstractSet<Set<E>>() {
               @Override
               public boolean contains(@Nullable Object var1x) {
                  if (!(var1x instanceof Set)) {
                     return false;
                  }

                  Set var2x = (Set)var1x;
                  return var2x.size() == var1 && var2.RORCHHOHICRHCCIRRORIHCCOCRHOCO().containsAll(var2x);
               }

               @Override
               public Iterator<Set<E>> iterator() {
                  return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<Set<E>>(
                     
                  ) {
                     final BitSet OCOIHCHRCHOOCHHROCHHOCRHOIRRIR = new BitSet(var2.size());

                     protected Set<E> computeNext() {
                        if (this.OCOIHCHRCHOOCHHROCHHOCRHOIRRIR.isEmpty()) {
                           this.OCOIHCHRCHOOCHHROCHHOCRHOIRRIR.set(0, var1);
                        } else {
                           int var1x = this.OCOIHCHRCHOOCHHROCHHOCRHOIRRIR.nextSetBit(0);
                           int var2x = this.OCOIHCHRCHOOCHHROCHHOCRHOIRRIR.nextClearBit(var1x);
                           if (var2x == var2.size()) {
                              return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
                           }

                           this.OCOIHCHRCHOOCHHROCHHOCRHOIRRIR.set(0, var2x - var1x - 1);
                           this.OCOIHCHRCHOOCHHROCHHOCRHOIRRIR.clear(var2x - var1x - 1, var2x);
                           this.OCOIHCHRCHOOCHHROCHHOCRHOIRRIR.set(var2x);
                        }

                        final BitSet var3 = (BitSet)this.OCOIHCHRCHOOCHHROCHHOCRHOIRRIR.clone();
                        return new AbstractSet<E>() {
                           @Override
                           public boolean contains(@Nullable Object var1x) {
                              Integer var2x = (Integer)var2.get(var1x);
                              return var2x != null && var3.get(var2x);
                           }

                           @Override
                           public Iterator<E> iterator() {
                              return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E>(
                                 
                              ) {
                                 int i = -1;

                                 @Override
                                 protected E computeNext() {
                                    this.i = var3.nextSetBit(this.i + 1);
                                    return (E)(this.i == -1
                                       ? this.ROCOROCOICRHOICORCIIRRRROCOHOC()
                                       : var2.RORCHHOHICRHCCIRRORIHCCOCRHOCO().OHOOIHCOHHORHICHIOROIRIHCOOCRR().get(this.i));
                                 }
                              };
                           }

                           @Override
                           public int size() {
                              return var1;
                           }
                        };
                     }
                  };
               }

               @Override
               public int size() {
                  return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.binomial(
                     var2.size(), var1
                  );
               }

               @Override
               public String toString() {
                  return "Sets.combinations(" + var2.RORCHHOHICRHCCIRRORIHCCOCRHOCO() + ", " + var1 + ")";
               }
            };
      }
   }

   static int hashCodeImpl(Set<?> var0) {
      int var1 = 0;

      for (Object var3 : var0) {
         var1 += var3 != null ? var3.hashCode() : 0;
         var1 = ~(~var1);
      }

      return var1;
   }

   static boolean equalsImpl(Set<?> var0, @Nullable Object var1) {
      if (var0 == var1) {
         return true;
      }

      if (var1 instanceof Set) {
         Set var2 = (Set)var1;

         try {
            return var0.size() == var2.size() && var0.containsAll(var2);
         } catch (NullPointerException | ClassCastException var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> var0) {
      return !(var0 instanceof OIICIRRCOOCIHRHOIOIOOROCRHCHIC) && !(var0 instanceof ICRHCCCCOIICOCHHCRCOOIHICROIHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)
         ? new ICRHCCCCOIICOCHHCRCOOIHICROIHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI<>(var0)
         : var0;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> var0) {
      return OOOOCHIHOOCHCCIHHRRICIRIOHOCRO.navigableSet(var0);
   }

   static boolean removeAllImpl(Set<?> var0, Iterator<?> var1) {
      boolean var2 = false;

      while (var1.hasNext()) {
         var2 |= var0.remove(var1.next());
      }

      return var2;
   }

   static boolean removeAllImpl(Set<?> var0, Collection<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI) {
         var1 = ((CRIIOOIHIOHHRRRHIOROOCHCHHCCCI)var1).elementSet();
      }

      return var1 instanceof Set && var1.size() > var0.size()
         ? HRCROCOHHHICRHIHHOOCIIRRRCCIRR.removeAll(var0.iterator(), var1)
         : removeAllImpl(var0, var1.iterator());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K extends Comparable<? super K>> NavigableSet<K> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(NavigableSet<K> var0, IIHROHOIOHICCRRHRICHCIHRCROOIO<K> var1) {
      if (var0.comparator() != null
         && var0.comparator() != IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC()
         && var1.hasLowerBound()
         && var1.hasUpperBound()) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var0.comparator().compare(var1.lowerEndpoint(), var1.upperEndpoint()) <= 0,
            "set is using a custom comparator which is inconsistent with the natural ordering."
         );
      }

      if (var1.hasLowerBound() && var1.hasUpperBound()) {
         return (NavigableSet<K>)var0.subSet(
            var1.lowerEndpoint(),
            var1.HHRHCHOCIRCHOIOIRCICHOCOIIOOHR() == IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED,
            var1.upperEndpoint(),
            var1.CCCORHHHOCOICHHCIHOIRHHCOROROO() == IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED
         );
      } else if (var1.hasLowerBound()) {
         return (NavigableSet<K>)var0.tailSet(var1.lowerEndpoint(), var1.HHRHCHOCIRCHOIOIRCICHOCOIIOOHR() == IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED);
      } else {
         return (NavigableSet<K>)(var1.hasUpperBound()
            ? var0.headSet(var1.upperEndpoint(), var1.CCCORHHHOCOICHHCIHOIRHHCOROROO() == IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED)
            : com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ));
      }
   }

   public abstract static class CORCOCICIRIOHROHROIIOOHICCHCRR<E> extends AbstractSet<E> {
      private CORCOCICIRIOHROHROIIOOHICCHCRR() {
      }

      public CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> OCRRIICRCRCIIHCRICRIRCOIHRCHRI() {
         return CICOIHIRIIHHCIOICHRHICRIRCIOHC.IOIICIRIICICIIOORHCIIIIRRIHRHI(this);
      }

      @CanIgnoreReturnValue
      public <S extends Set<E>> S copyInto(S var1) {
         var1.addAll(this);
         return (S)var1;
      }

      @Deprecated
      @CanIgnoreReturnValue
      @Override
      public final boolean add(E var1) {
         throw new UnsupportedOperationException();
      }

      @Deprecated
      @CanIgnoreReturnValue
      @Override
      public final boolean remove(Object var1) {
         throw new UnsupportedOperationException();
      }

      @Deprecated
      @CanIgnoreReturnValue
      @Override
      public final boolean addAll(Collection<? extends E> var1) {
         throw new UnsupportedOperationException();
      }

      @Deprecated
      @CanIgnoreReturnValue
      @Override
      public final boolean removeAll(Collection<?> var1) {
         throw new UnsupportedOperationException();
      }

      @Deprecated
      @CanIgnoreReturnValue
      @Override
      public final boolean removeIf(Predicate<? super E> var1) {
         throw new UnsupportedOperationException();
      }

      @Deprecated
      @CanIgnoreReturnValue
      @Override
      public final boolean retainAll(Collection<?> var1) {
         throw new UnsupportedOperationException();
      }

      @Deprecated
      @Override
      public final void clear() {
         throw new UnsupportedOperationException();
      }

      public abstract IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
   }

   private static final class CRICCOOHHHCHOORCICOCOHIHOIRHOO<E> extends AbstractSet<E> {
      private final OOHRIIOOHROIOHCIRIHRHRRICRRHOI<E, Integer> COIICOHRHIOOOORRCCRRCHOOHCOOOI;
      private final int RHOIHHOCIOIROIRRRHIORCICCIOCRI;

      CRICCOOHHHCHOORCICOCOHIHOIRHOO(OOHRIIOOHROIOHCIRIHRHRRICRRHOI<E, Integer> var1, int var2) {
         this.COIICOHRHIOOOORRCCRRCHOOHCOOOI = var1;
         this.RHOIHHOCIOIROIRRRHIORCICCIOCRI = var2;
      }

      @Override
      public Iterator<E> iterator() {
         return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E>() {
            final COIRRRCIORROCHIROCHROCHICCICIC<E> OROIHHCORCOIOCCCCIRIHOIRCOICRH = CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.COIICOHRHIOOOORRCCRRCHOOHCOOOI
               .RORCHHOHICRHCCIRRORIHCCOCRHOCO()
               .OHOOIHCOHHORHICHIOROIRIHCOOCRR();
            int remainingSetBits = CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.RHOIHHOCIOIROIRRRHIORCICCIOCRI;

            @Override
            public boolean hasNext() {
               return this.remainingSetBits != 0;
            }

            @Override
            public E next() {
               int var1 = Integer.numberOfTrailingZeros(this.remainingSetBits);
               if (var1 == 32) {
                  throw new NoSuchElementException();
               }

               this.remainingSetBits &= ~(1 << var1);
               return this.OROIHHCORCOIOCCCCIRIHOIRCOICRH.get(var1);
            }
         };
      }

      @Override
      public int size() {
         return Integer.bitCount(this.RHOIHHOCIOIROIRRRHIORCICCIOCRI);
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         Integer var2 = this.COIICOHRHIOOOORRCCRRCHOOHCOOOI.get(var1);
         return var2 != null && (this.RHOIHHOCIOIROIRRRHIORCICCIOCRI & 1 << var2) != 0;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static class CRRRICCRROCOHHOHIICIHORCOORRRH<E> extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> implements NavigableSet<E> {
      CRRRICCRROCOHHOHIICIHORCOORRRH(
         NavigableSet<E> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var2
      ) {
         super(var1, var2);
      }

      NavigableSet<E> unfiltered() {
         return (NavigableSet<E>)this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR;
      }

      @Override
      public @Nullable E lower(E var1) {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.unfiltered().headSet((E)var1, false).descendingIterator(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR, null
         );
      }

      @Override
      public @Nullable E floor(E var1) {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.unfiltered().headSet((E)var1, true).descendingIterator(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR, null
         );
      }

      @Override
      public E ceiling(E var1) {
         return IRIHOIRCHIRRCRIOORCOICORHHORHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.unfiltered().tailSet((E)var1, true), this.IRCIHIHHROCHORIOICOHOCHRCCHICR, null
         );
      }

      @Override
      public E higher(E var1) {
         return IRIHOIRCHIRRCRIOORCOICORHHORHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.unfiltered().tailSet((E)var1, false), this.IRCIHIHHROCHORIOICOHOCHRCCHICR, null
         );
      }

      @Override
      public E pollFirst() {
         return IRIHOIRCHIRRCRIOORCOICORHHORHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.unfiltered(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }

      @Override
      public E pollLast() {
         return IRIHOIRCHIRRCRIOORCOICORHHORHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.unfiltered().descendingSet(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }

      @Override
      public NavigableSet<E> descendingSet() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.unfiltered().descendingSet(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }

      @Override
      public Iterator<E> descendingIterator() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.unfiltered().descendingIterator(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }

      @Override
      public E last() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.unfiltered().descendingIterator(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }

      @Override
      public NavigableSet<E> subSet(E var1, boolean var2, E var3, boolean var4) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.unfiltered().subSet((E)var1, var2, (E)var3, var4), this.IRCIHIHHROCHORIOICOHOCHRCCHICR
         );
      }

      @Override
      public NavigableSet<E> headSet(E var1, boolean var2) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.unfiltered().headSet((E)var1, var2), this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }

      @Override
      public NavigableSet<E> tailSet(E var1, boolean var2) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.unfiltered().tailSet((E)var1, var2), this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> extends OCIIROIOORRIOIIIRHIRRCCIIRRROH<E> {
      private final NavigableSet<E> ICHCROIHCCHROHOCIHOORRRHIOOCRH;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(NavigableSet<E> var1) {
         this.ICHCROIHCCHROHOCIHOORRRHIOOCRH = var1;
      }

      @Override
      protected NavigableSet<E> delegate() {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH;
      }

      @Override
      public E lower(E var1) {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.higher((E)var1);
      }

      @Override
      public E floor(E var1) {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.ceiling((E)var1);
      }

      @Override
      public E ceiling(E var1) {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.floor((E)var1);
      }

      @Override
      public E higher(E var1) {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.lower((E)var1);
      }

      @Override
      public E pollFirst() {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.pollLast();
      }

      @Override
      public E pollLast() {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.pollFirst();
      }

      @Override
      public NavigableSet<E> descendingSet() {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH;
      }

      @Override
      public Iterator<E> descendingIterator() {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.iterator();
      }

      @Override
      public NavigableSet<E> subSet(E var1, boolean var2, E var3, boolean var4) {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.subSet((E)var3, var4, (E)var1, var2).descendingSet();
      }

      @Override
      public SortedSet<E> subSet(E var1, E var2) {
         return this.standardSubSet((E)var1, (E)var2);
      }

      @Override
      public NavigableSet<E> headSet(E var1, boolean var2) {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.tailSet((E)var1, var2).descendingSet();
      }

      @Override
      public SortedSet<E> headSet(E var1) {
         return this.standardHeadSet((E)var1);
      }

      @Override
      public NavigableSet<E> tailSet(E var1, boolean var2) {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.headSet((E)var1, var2).descendingSet();
      }

      @Override
      public SortedSet<E> tailSet(E var1) {
         return this.standardTailSet((E)var1);
      }

      @Override
      public Comparator<? super E> comparator() {
         Comparator var1 = this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.comparator();
         return var1 == null
            ? IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC().HCHORRRCIORCRHCRIIHROIRRRHCCOR()
            : ORHIOICIOCRRHOOCOHRORIHICHRCRR(var1);
      }

      private static <T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> ORHIOICIOCRRHOOCOHRORIHICHRCRR(Comparator<T> var0) {
         return IOIHHIORCICCHIIHOIOIOHHRICRHIO.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var0).HCHORRRCIORCRHCRIIHROIRRRHCCOR();
      }

      @Override
      public E first() {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.last();
      }

      @Override
      public E last() {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.first();
      }

      @Override
      public Iterator<E> iterator() {
         return this.ICHCROIHCCHROHOCIHOORRRHIOOCRH.descendingIterator();
      }

      @Override
      public Object[] toArray() {
         return this.standardToArray();
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         return (T[])this.standardToArray(var1);
      }

      @Override
      public String toString() {
         return this.standardToString();
      }
   }

   static final class HICHRCOHCCRHOHCICOOCHOIHCCHIRI<E> extends IHROCRRIRIROCCCRCRRROCRRCRIIHH<E> implements Serializable, NavigableSet<E> {
      private final NavigableSet<E> CRCOIIOIORCHHCCOIOCIOCCIRROHCI;
      private final SortedSet<E> CRCIHRRHOOCHHRORRCHRHRCRIIHICH;
      private transient ICRHCCCCOIICOCHHCRCOOIHICROIHI.@Nullable HICHRCOHCCRHOHCICOOCHOIHCCHIRI<E> CIRRCICICIRHOORCHCHICOHOOHIOCI;
      private static final long CORHIRHRHHOHRICCICHCOICCHOHCRH = 0L;

      HICHRCOHCCRHOHCICOOCHOIHCCHIRI(NavigableSet<E> var1) {
         this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.CRCIHRRHOOCHHRORRCHRHRCRIIHICH = Collections.unmodifiableSortedSet(var1);
      }

      @Override
      protected SortedSet<E> delegate() {
         return this.CRCIHRRHOOCHHRORRCHRHRCRIIHICH;
      }

      @Override
      public boolean removeIf(Predicate<? super E> var1) {
         throw new UnsupportedOperationException();
      }

      @Override
      public Stream<E> stream() {
         return this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.stream();
      }

      @Override
      public Stream<E> parallelStream() {
         return this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.parallelStream();
      }

      @Override
      public void forEach(Consumer<? super E> var1) {
         this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.forEach(var1);
      }

      @Override
      public E lower(E var1) {
         return this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.lower((E)var1);
      }

      @Override
      public E floor(E var1) {
         return this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.floor((E)var1);
      }

      @Override
      public E ceiling(E var1) {
         return this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.ceiling((E)var1);
      }

      @Override
      public E higher(E var1) {
         return this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.higher((E)var1);
      }

      @Override
      public E pollFirst() {
         throw new UnsupportedOperationException();
      }

      @Override
      public E pollLast() {
         throw new UnsupportedOperationException();
      }

      @Override
      public NavigableSet<E> descendingSet() {
         ICRHCCCCOIICOCHHCRCOOIHICROIHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1 = this.CIRRCICICIRHOORCHCHICOHOOHIOCI;
         if (var1 == null) {
            var1 = this.CIRRCICICIRHOORCHCHICOHOOHIOCI = new ICRHCCCCOIICOCHHCRCOOIHICROIHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI<>(
               this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.descendingSet()
            );
            var1.CIRRCICICIRHOORCHCHICOHOOHIOCI = this;
         }

         return var1;
      }

      @Override
      public Iterator<E> descendingIterator() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.descendingIterator());
      }

      @Override
      public NavigableSet<E> subSet(E var1, boolean var2, E var3, boolean var4) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.unmodifiableNavigableSet(this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.subSet((E)var1, var2, (E)var3, var4));
      }

      @Override
      public NavigableSet<E> headSet(E var1, boolean var2) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.unmodifiableNavigableSet(this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.headSet((E)var1, var2));
      }

      @Override
      public NavigableSet<E> tailSet(E var1, boolean var2) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.unmodifiableNavigableSet(this.CRCOIIOIORCHHCCOIOCIOCCIRROHCI.tailSet((E)var1, var2));
      }
   }

   abstract static class HRCHROOHRIHCRCRHRIIROCIRHOIRHH<E> extends AbstractSet<E> {
      @Override
      public boolean removeAll(Collection<?> var1) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.removeAllImpl(this, var1);
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         return super.retainAll(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            )
         );
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> extends OOCHRIIIRIHRRCRIORHCROIIHCRRIC<List<E>> implements Set<List<E>> {
      private final transient COIRRRCIORROCHIROCHROCHICCICIC<CICOIHIRIIHHCIOICHRHICRIRCIOHC<E>> ROOCOIHRRIHIOCROOORRROCOCHRHCI;
      private final transient ORHIOICIOCRRHOOCOHRORIHICHRCRR<E> CRHCRRHCCHIOIHCIIHHOCIOCORHRCH;

      static <E> Set<List<E>> create(List<? extends Set<? extends E>> var0) {
         COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = new COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.size());

         for (Set var3 : var0) {
            CICOIHIRIIHHCIOICHRHICRIRCIOHC var4 = CICOIHIRIIHHCIOICHRHICRIRCIOHC.IOIICIRIICICIIOORHCIIIIRRIHRHI(var3);
            if (var4.isEmpty()) {
               return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
            }

            var1.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(var4);
         }

         final COIRRRCIORROCHIROCHROCHICCICIC var5 = var1.IORRHROIIRHIIOOHCOOIRHOIHRHRHI();
         COIRRRCIORROCHIROCHROCHICCICIC var6 = new COIRRRCIORROCHIROCHROCHICCICIC<List<E>>() {
            @Override
            public int size() {
               return var5.size();
            }

            public List<E> get(int var1) {
               return ((CICOIHIRIIHHCIOICHRHICRIRCIOHC)var5.get(var1)).OHOOIHCOHHORHICHIOROIRIHCOOCRR();
            }

            @Override
            boolean isPartialView() {
               return true;
            }
         };
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var5, new ORHIOICIOCRRHOOCOHRORIHICHRCRR<>(var6));
      }

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(COIRRRCIORROCHIROCHROCHICCICIC<CICOIHIRIIHHCIOICHRHICRIRCIOHC<E>> var1, ORHIOICIOCRRHOOCOHRORIHICHRCRR<E> var2) {
         this.ROOCOIHRRIHIOCROOORRROCOCHRHCI = var1;
         this.CRHCRRHCCHIOIHCIIHHOCIOCORHRCH = var2;
      }

      @Override
      protected Collection<List<E>> delegate() {
         return this.CRHCRRHCCHIOIHCIIHHOCIOCORHRCH;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof ICRHCCCCOIICOCHHCRCOOIHICROIHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH) {
            ICRHCCCCOIICOCHHCRCOOIHICROIHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = (ICRHCCCCOIICOCHHCRCOOIHICROIHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1;
            return this.ROOCOIHRRIHIOCROOORRROCOCHRHCI.equals(var2.ROOCOIHRRIHIOCROOORRROCOCHRHCI);
         } else {
            return super.equals(var1);
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.size() - 1;

         for (int var2 = 0; var2 < this.ROOCOIHRRIHIOCROOORRROCOCHRHCI.size(); var2++) {
            var1 *= 31;
            var1 = ~(~var1);
         }

         int var6 = 1;
         IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var3 = this.ROOCOIHRRIHIOCROOORRROCOCHRHCI.IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

         while (var3.hasNext()) {
            Set var4 = (Set)var3.next();
            var6 = 31 * var6 + this.size() / var4.size() * var4.hashCode();
            var6 = ~(~var6);
         }

         var6 += var1;
         return ~(~var6);
      }
   }

   private static final class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<E> extends AbstractSet<Set<E>> {
      final OOHRIIOOHROIOHCIRIHRHRRICRRHOI<E, Integer> CCHCHRCRHCRORCIIOCRRIHOORIHCOR;

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Set<E> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var1.size() <= 30, "Too many elements to create power set: %s > 30", var1.size()
         );
         this.CCHCHRCRHCRORCIIOCRRIHOORIHCOR = ROCHRRCORRCOOOOOCOICOCROIIHIHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var1);
      }

      @Override
      public int size() {
         return 1 << this.CCHCHRCRHCRORCIIOCRRIHOORIHCOR.size();
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      @Override
      public Iterator<Set<E>> iterator() {
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Set<E>>(
            this.size()
         ) {
            protected Set<E> get(int var1) {
               return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.CRICCOOHHHCHOORCICOCOHIHOIRHOO<>(
                  OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this.CCHCHRCRHCRORCIIOCRRIHOORIHCOR, var1
               );
            }
         };
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         if (var1 instanceof Set) {
            Set var2 = (Set)var1;
            return this.CCHCHRCRHCRORCIIOCRRIHOORIHCOR.RORCHHOHICRHCCIRRORIHCCOCRHOCO().containsAll(var2);
         } else {
            return false;
         }
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof ICRHCCCCOIICOCHHCRCOOIHICROIHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR) {
            ICRHCCCCOIICOCHHCRCOOIHICROIHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = (ICRHCCCCOIICOCHHCRCOOIHICROIHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var1;
            return this.CCHCHRCRHCRORCIIOCRRIHOORIHCOR.equals(var2.CCHCHRCRHCRORCIIOCRRIHOORIHCOR);
         } else {
            return super.equals(var1);
         }
      }

      @Override
      public int hashCode() {
         return this.CCHCHRCRHCRORCIIOCRRIHOORIHCOR.RORCHHOHICRHCCIRRORIHCCOCRHOCO().hashCode() << this.CCHCHRCRHCRORCIIOCRRIHOORIHCOR.size() - 1;
      }

      @Override
      public String toString() {
         return "powerSet(" + this.CCHCHRCRHCRORCIIOCRRIHOORIHCOR + ")";
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E extends Enum<E>> {
      static final Collector<Enum<?>, ?, CICOIHIRIIHHCIOICHRHICRIRCIOHC<? extends Enum<?>>> IHIRRRCRRHCCIHICOCIRIOOROIIIRC = Collector.of(
         ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::new,
         ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::add,
         ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
         ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::OIROCCHIRCCCOIRHIOHCCHHOHORRCI,
         Characteristics.UNORDERED
      );
      private @Nullable EnumSet<E> set;

      void add(E var1) {
         if (this.set == null) {
            this.set = EnumSet.of((E)var1);
         } else {
            this.set.add((E)var1);
         }
      }

      ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> var1
      ) {
         if (this.set == null) {
            return var1;
         }

         if (var1.set == null) {
            return this;
         }

         this.set.addAll(var1.set);
         return this;
      }

      CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> OIROCCHIRCCCOIRHIOHCCHHOHORRCI() {
         return this.set == null
            ? CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI()
            : CIIHHCHIRCRRIHOIOCCCROHOIOCCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.set);
      }
   }

   private static class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO<E> implements SortedSet<E> {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         SortedSet<E> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var2
      ) {
         super(var1, var2);
      }

      @Override
      public Comparator<? super E> comparator() {
         return ((SortedSet)this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR).comparator();
      }

      @Override
      public SortedSet<E> subSet(E var1, E var2) {
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(
            ((SortedSet)this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR).subSet((E)var1, (E)var2), this.IRCIHIHHROCHORIOICOHOCHRCCHICR
         );
      }

      @Override
      public SortedSet<E> headSet(E var1) {
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(
            ((SortedSet)this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR).headSet((E)var1), this.IRCIHIHHROCHORIOICOHOCHRCCHICR
         );
      }

      @Override
      public SortedSet<E> tailSet(E var1) {
         return new ICRHCCCCOIICOCHHCRCOOIHICROIHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(
            ((SortedSet)this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR).tailSet((E)var1), this.IRCIHIHHROCHORIOICOHOCHRCCHICR
         );
      }

      @Override
      public E first() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR.iterator(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR
         );
      }

      @Override
      public E last() {
         SortedSet var1 = (SortedSet)this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR;

         while (true) {
            Object var2 = var1.last();
            if (this.IRCIHIHHROCHORIOICOHOCHRCCHICR.apply((E)var2)) {
               return (E)var2;
            }

            var1 = var1.headSet(var2);
         }
      }
   }

   private static class RRCRRCORICCHOHHIRCHIROOHIIOHCO<E> extends RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> implements Set<E> {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         Set<E> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var2
      ) {
         super(var1, var2);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.equalsImpl(this, var1);
      }

      @Override
      public int hashCode() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.hashCodeImpl(this);
      }
   }
}
