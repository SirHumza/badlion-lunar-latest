package com.moonsworth.lunar.client.util;

import java.util.Map;
import java.util.function.Predicate;
import lombok.Generated;

public final class RRORCOIRRIICOOICOIOCORHORCHCOC {
   public static <K, V> void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Map<K, V> var0, Predicate<K> var1) {
      var0.entrySet().removeIf(var1x -> var1.test(var1x.getKey()));
   }

   public static <K, V> void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Map<K, V> var0, Predicate<V> var1) {
      var0.entrySet().removeIf(var1x -> var1.test(var1x.getValue()));
   }

   public static <K, V> void CRRRICCRROCOHHOHIICIHORCOORRRH(Map<K, V> var0, Predicate<K> var1) {
      var0.entrySet().removeIf(var1x -> !var1.test(var1x.getKey()));
   }

   public static <K, V> void RRCRRCORICCHOHHIRCHIROOHIIOHCO(Map<K, V> var0, Predicate<V> var1) {
      var0.entrySet().removeIf(var1x -> !var1.test(var1x.getValue()));
   }

   @Generated
   private RRORCOIRRIICOOICOIOCORHORCHCOC() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
