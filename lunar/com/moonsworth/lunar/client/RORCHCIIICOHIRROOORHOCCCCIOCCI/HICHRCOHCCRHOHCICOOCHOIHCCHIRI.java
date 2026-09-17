package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   public static final IIRHCHHOICHRICOOCRORCCIOOIHOIR RIIIICHORROCHIHCCRICRCCOCIIRIO = new IIRHCHHOICHRICOOCRORCCIOOIHOIR(Reference2ObjectMaps.emptyMap());
   final Reference2ObjectMap<OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>, Optional<?>> OOOCHCHORHHROOHIRCCCCIIRCCHRRC;

   IIRHCHHOICHRICOOCRORCCIOOIHOIR(Reference2ObjectMap<OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>, Optional<?>> var1) {
      this.OOOCHCHORHHROOHIRCCCCIIRCCHRRC = var1;
   }

   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HCCHCCCCIRIOCOHIOOORCRORHIOCRR() {
      return new IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Nullable
   public <T> Optional<T> RCIROOOOICRHCCRRCIORHHIRCOIIIC(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1) {
      return (Optional<T>)this.OOOCHCHORHHROOHIRCCCCIIRCCHRRC.get(var1);
   }

   public Set<Entry<OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>, Optional<?>>> entrySet() {
      return this.OOOCHCHORHHROOHIRCCCCIIRCCHRRC.entrySet();
   }

   public int size() {
      return this.OOOCHCHORHHROOHIRCCCCIIRCCHRRC.size();
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR HICHRCOHCCRHOHCICOOCHOIHCCHIRI(Predicate<OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>> var1) {
      if (this.isEmpty()) {
         return RIIIICHORROCHIHCCRICRCCOCIIRIO;
      }

      Reference2ObjectArrayMap var2 = new Reference2ObjectArrayMap(this.OOOCHCHORHHROOHIRCCCCIIRCCHRRC);
      var2.keySet().removeIf(var1);
      return var2.isEmpty() ? RIIIICHORROCHIHCCRICRCCOCIIRIO : new IIRHCHHOICHRICOOCRORCCIOOIHOIR(var2);
   }

   public boolean isEmpty() {
      return this.OOOCHCHORHHROOHIRCCCCIIRCCHRRC.isEmpty();
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 && this.OOOCHCHORHHROOHIRCCCCIIRCCHRRC.equals(var2.OOOCHCHORHHROOHIRCCCCIIRCCHRRC);
   }

   @Override
   public int hashCode() {
      return this.OOOCHCHORHHROOHIRCCCCIIRCCHRRC.hashCode();
   }

   @Override
   public String toString() {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OOOCHCHORHHROOHIRCCCCIIRCCHRRC);
   }

   static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Reference2ObjectMap<OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>, Optional<?>> var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append('{');
      boolean var2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable(var0).iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (var2) {
            var2 = false;
         } else {
            var1.append(", ");
         }

         Optional var5 = (Optional)var4.getValue();
         if (var5.isPresent()) {
            var1.append(var4.getKey());
            var1.append(">");
            var1.append(var5.get());
         } else {
            var1.append("!");
            var1.append(var4.getKey());
         }
      }

      var1.append('}');
      return var1.toString();
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Reference2ObjectMap<OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>, Optional<?>> HRRIRCHOHORROIRCIOORROORRROIIH = new Reference2ObjectArrayMap();

      public <T> IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, T var2) {
         this.HRRIRCHOHORROIRCIOORROORRROIIH.put(var1, Optional.of(var2));
         return this;
      }

      public <T> IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOCCRCRCOHIIORCCORCRCIRRROIOOR(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1) {
         this.HRRIRCHOHORROIRCIOORROORRROIIH.put(var1, Optional.empty());
         return this;
      }

      public IIRHCHHOICHRICOOCRORCCIOOIHOIR OIHORRHHOIOCCRCHIHIORCCOCOICCC() {
         return this.HRRIRCHOHORROIRCIOORROORRROIIH.isEmpty()
            ? IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIIIICHORROCHIHCCRICRCCOCIIRIO
            : new IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.HRRIRCHOHORROIRCIOORROORRROIIH);
      }
   }
}
