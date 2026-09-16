package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final int RHIOHRCCCHOCCIRRIOIOOHRCRORIRI = 3;
   private final OCOHORHCROHICRRIHCIHHRRCIHICRI OOICOIRHOOCOORHHRICCCRHCIICIHR;
   private final Int2ObjectMap<Object> RIOOIRCCRRIIOHCHOICCHOHIOCRCOR;
   private Int2ObjectMap<List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI<?>>> IHOROICORHORRHOOCRORHCROHHRRIR;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      this.OOICOIRHOOCOORHHRICCCRHCIICIHR = var1;
      this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR = new Int2ObjectOpenHashMap(3, 0.75F);
   }

   CRRRICCRROCOHHOHIICIHORCOORRRH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, Int2ObjectMap<Object> var2) {
      this.OOICOIRHOOCOORHHRICCCRHCIICIHR = var1;
      this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR = var2;
   }

   private CRRRICCRROCOHHOHIICIHORCOORRRH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1, Int2ObjectMap<Object> var2, Int2ObjectMap<List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI<?>>> var3
   ) {
      this.OOICOIRHOOCOORHHRICCCRHCIICIHR = var1;
      this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR = var2;
      this.IHOROICORHORRHOOCRORHCROHHRRIR = var3;
   }

   private CRRRICCRROCOHHOHIICIHORCOORRRH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1, HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2, Int2ObjectMap<List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI<?>>> var3
   ) {
      this.OOICOIRHOOCOORHHRICCCRHCIICIHR = var1;
      this.IHOROICORHORRHOOCRORHCROHHRRIR = var3;
      int var4 = var2.size();
      this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR = (Int2ObjectMap<Object>)(var4 < 8 ? new Int2ObjectArrayMap(var4) : new Int2ObjectOpenHashMap(var4));
      IntIterator var5 = var2.OOHOCHHOOIHICOOICOIIOHOHHICHCH().iterator();

      while (var5.hasNext()) {
         int var6 = (Integer)var5.next();
         this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.put(var6, var2.get(var6));
      }
   }

   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI ORORICHHRHHRRORHHIOCORRIROIOHO() {
      return this.OOICOIRHOOCOORHHRICCCRHCIICIHR;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1, OHHRIOHROOIHOROCIRHCHORIHRRRRI<?> var2) {
      try {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2 == null ? -1 : var2.getId());
      } catch (Throwable var4) {
         throw var4;
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var1, int var2) {
      try {
         IntIterator var3 = new IntArraySet(this.OOHOCHHOOIHICOOICOIIOHOHHICHCH()).iterator();

         while (var3.hasNext()) {
            int var4 = var3.nextInt();
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.OOICOIRHOOCOORHHRICCCRHCIICIHR,
               var4,
               var1x -> this.get(var1x) != null,
               var2x -> {
                  Object var3x = this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.remove(var2x);
                  if (var3x != null) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var4, var3x, null, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAIT_REMOVED_CONDITIONALLY
                     );
                  }
               },
               false,
               var1,
               var2
            );
         }
      } catch (Throwable var5) {
         throw var5;
      }
   }

   @Nullable
   @Override
   public <T> T get(int var1) {
      return (T)this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.get(var1);
   }

   @Nullable
   @Override
   public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, @Nullable T var2) {
      Object var3 = this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.put(var1.getId(), var2);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getId(), var3, var2);
      if (var3 == null == (var2 != null)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3 == null, var1);
      }

      return (T)var3;
   }

   @Nullable
   @Override
   public <T> T set(int var1, @Nullable T var2) {
      Object var3 = this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.put(var1, var2);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var2);
      if (var3 == null == (var2 != null)) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3 == null, var1);
      }

      return (T)var3;
   }

   @Nullable
   @Override
   public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, Function<OHHRIOHROOIHOROCIRHCHORIHRRRRI<T>, ? extends @NotNull T> var2) {
      Object var3 = this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.get(var1.getId());
      return (T)this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.computeIfPresent(var1.getId(), (var4, var5) -> {
         Object var6 = var2.apply(var1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getId(), var3, var6, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAIT_SET);
         return var6;
      });
   }

   @Override
   public <T> T IRCIIHHICIHRCOCRROCOICRIHHCCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, Function<OHHRIOHROOIHOROCIRHCHORIHRRRRI<T>, ? extends @NotNull T> var2) {
      Object var3 = this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.computeIfAbsent(var1.getId(), var3x -> {
         Object var4 = var2.apply(var1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getId(), null, var4, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAIT_SET);
         return var4;
      });
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(true, var1);
      return (T)var3;
   }

   @Nullable
   @Override
   public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, BiFunction<OHHRIOHROOIHOROCIRHCHORIHRRRRI<T>, ? super @Nullable T, ? extends @Nullable T> var2
   ) {
      Object var3 = this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.compute(var1.getId(), (var2x, var3x) -> var2.apply(var1, var3x));
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3 != null, var1);
      return (T)var3;
   }

   @Nullable
   @Override
   public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<? extends T> var1) {
      Object var2 = this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.remove(var1.getId());
      if (var2 != null) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getId(), var2, null, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAIT_REMOVED);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(false, var1);
      }

      return (T)var2;
   }

   @Override
   public boolean isEmpty() {
      return this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.isEmpty();
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable(var1.OOOCHCHORHHROOHIRCCCCIIRCCHRRC).iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         Object var4 = ((Optional)var3.getValue()).orElse(null);
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var5 = (OHHRIOHROOIHOROCIRHCHORIHRRRRI)var3.getKey();
         if (var4 == null) {
            Object var6 = this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.remove(var5.getId());
            if (var6 != null) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.getId(), var6, null, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAIT_REMOVED);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(false, var5);
            }
         } else if (this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.put(var5.getId(), var4) == null) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.getId(), null, var4, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAIT_SET);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(true, var5);
         }
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 : var1) {
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
      }
   }

   @Override
   public <T> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI<T> var2) {
      if (this.IHOROICORHORRHOOCRORHCROHHRRIR == null) {
         this.IHOROICORHORRHOOCRORHCROHHRRIR = new Int2ObjectOpenHashMap(3, 0.75F);
      }

      ((List)this.IHOROICORHORRHOOCRORHCROHHRRIR.computeIfAbsent(var1.getId(), var0 -> new ArrayList())).add(var2);
   }

   @Override
   public <T> void IRCIIHHICIHRCOCRROCOICRIHHCCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI<T> var2) {
      if (this.IHOROICORHORRHOOCRORHCROHHRRIR != null) {
         List var3 = (List)this.IHOROICORHORRHOOCRORHCROHHRRIR.get(var1.getId());
         if (var3 != null) {
            var3.remove(var2);
         }
      }
   }

   private <T> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, T var2, T var3) {
      if (this.IHOROICORHORRHOOCRORHCROHHRRIR != null) {
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = var2 == null && var3 != null
            ? HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAIT_SET
            : (
               var2 != null && var3 != null
                  ? HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAIT_SET
                  : (var2 != null && var3 == null ? HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAIT_REMOVED : null)
            );
         if (var4 != null) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4);
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, Object var2, Object var3, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4) {
      if (this.IHOROICORHORRHOOCRORHCROHHRRIR != null) {
         List var5 = (List)this.IHOROICORHORRHOOCRORHCROHHRRIR.get(var1);
         if (var5 != null) {
            for (int var6 = var5.size() - 1; var6 >= 0; var6--) {
               ((HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var5.get(var6)).invoke(var4, var2, var3);
            }
         }
      }
   }

   public <T> int IOHIHIIHCCCCCIHRORIOIOORCIOHII(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1) {
      if (this.IHOROICORHORRHOOCRORHCROHHRRIR == null) {
         return 0;
      }

      List var2 = (List)this.IHOROICORHORRHOOCRORHCROHHRRIR.get(var1.getId());
      return var2 == null ? 0 : var2.size();
   }

   @Override
   public IntSet OOHOCHHOOIHICOOICOIIOHOHHICHCH() {
      return this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.keySet();
   }

   @Override
   public Collection<?> values() {
      return this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.values();
   }

   @NotNull
   @Override
   public Iterator<RRCRRCORICCHOHHIRCHIROOHIIOHCO<?>> iterator() {
      ArrayList var1 = new ArrayList(this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.size());
      ObjectIterator var2 = Int2ObjectMaps.fastIterable(this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR).iterator();

      while (var2.hasNext()) {
         it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry var3 = (it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry)var2.next();
         var1.add(RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3.getIntKey(), var3.getValue()));
      }

      return var1.iterator();
   }

   @Override
   public int size() {
      return this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.size();
   }

   @Override
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH OCRHRHHOCIIRRIICIRRCIOCCHIHRIR() {
      Object var1 = this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.size() < 8
         ? new Int2ObjectArrayMap(this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR)
         : new Int2ObjectOpenHashMap(this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR);
      Object var2 = this.IHOROICORHORRHOOCRORHCROHHRRIR == null
         ? null
         : (
            this.IHOROICORHORRHOOCRORHCROHHRRIR.size() < 8
               ? new Int2ObjectArrayMap(this.IHOROICORHORRHOOCRORHCROHHRRIR)
               : new Int2ObjectOpenHashMap(this.IHOROICORHORRHOOCRORHCROHHRRIR)
         );
      return new CRRRICCRROCOHHOHIICIHORCOORRRH(
         this.OOICOIRHOOCOORHHRICCCRHCIICIHR, (Int2ObjectMap<Object>)var1, (Int2ObjectMap<List<HICHRCOHCCRHOHCICOOCHOIHCCHIRI<?>>>)var2
      );
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH var2 && this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.equals(var2.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR);
   }

   @Override
   public int hashCode() {
      return this.RIOOIRCCRRIIOHCHOICCHOHIOCRCOR.hashCode();
   }

   @Override
   public String toString() {
      return "{" + this.stream().map(RRCRRCORICCHOHHIRCHIROOHIIOHCO::toString).collect(Collectors.joining(", ")) + "}";
   }
}
