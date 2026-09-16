package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
final class IHHRRRRCOCHIIOIOHORHCIRRRCHCCR {
   private static final Logger HCCICRHHRICCIICIRRHIRIHIHOCRRH = Logger.getLogger(IHHRRRRCOCHIIOIOHORHCIRRRCHCCR.class.getName());

   static <K, V> Map<K, V> newHashMapWithExpectedSize(int var0) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.newHashMapWithExpectedSize(var0);
   }

   static <K, V> Map<K, V> newLinkedHashMapWithExpectedSize(int var0) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.newLinkedHashMapWithExpectedSize(var0);
   }

   static <E> Set<E> newHashSetWithExpectedSize(int var0) {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.newHashSetWithExpectedSize(var0);
   }

   static <E> Set<E> newLinkedHashSetWithExpectedSize(int var0) {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.newLinkedHashSetWithExpectedSize(var0);
   }

   static <K, V> Map<K, V> preservesInsertionOrderOnPutsMap() {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.newLinkedHashMap();
   }

   static <E> Set<E> preservesInsertionOrderOnAddsSet() {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.newLinkedHashSet();
   }

   static <T> T[] newArray(T[] var0, int var1) {
      Class var2 = var0.getClass().getComponentType();
      return (T[])((Object[])Array.newInstance(var2, var1));
   }

   static <T> T[] copy(Object[] var0, int var1, int var2, T[] var3) {
      return (T[])Arrays.copyOfRange(var0, var1, var2, (Class<? extends T[]>)var3.getClass());
   }

   static HCHOOCHIOICRRHHIHHHICIRCIOICRI HHCCIRHCCCIIRHCROHIORHIRHHIORH(HCHOOCHIOICRRHHIHHHICIRCIOICRI var0) {
      return var0.OHHCHCORRRCOHCHIIOIOHRHIRICHOH();
   }

   static int reduceIterationsIfGwt(int var0) {
      return var0;
   }

   static int reduceExponentIfGwt(int var0) {
      return var0;
   }

   static void checkGwtRpcEnabled() {
      String var0 = "guava.gwt.emergency_reenable_rpc";
      if (!Boolean.parseBoolean(System.getProperty(var0, "false"))) {
         throw new UnsupportedOperationException(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHICORCROOROHCIHIHCOIHRRHICICO.lenientFormat(
               "We are removing GWT-RPC support for Guava types. You can temporarily reenable support by setting the system property %s to true. For more about system properties, see %s. For more about Guava's GWT-RPC support, see %s.",
               var0,
               "https://stackoverflow.com/q/5189914/28465",
               "https://groups.google.com/d/msg/guava-announce/zHZTFg7YF3o/rQNnwdHeEwAJ"
            )
         );
      }

      HCCICRHHRICCIICIRRHIRIHIHOCRRH.log(
         Level.WARNING,
         "Later in 2020, we will remove GWT-RPC support for Guava types. You are seeing this warning because you are sending a Guava type over GWT-RPC, which will break. You can identify which type by looking at the class name in the attached stack trace.",
         new Throwable()
      );
   }

   private IHHRRRRCOCHIIOIOHORHCIRRRCHCCR() {
   }
}
