package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
final class COOROCRCCHCIHRCCIROCICCIIIRHHC {
   private COOROCRCCHCIHRCCIROCICCIIIRHHC() {
   }

   static int readCount(ObjectInputStream var0) {
      return var0.readInt();
   }

   static <K, V> void writeMap(Map<K, V> var0, ObjectOutputStream var1) {
      var1.writeInt(var0.size());

      for (Entry var3 : var0.entrySet()) {
         var1.writeObject(var3.getKey());
         var1.writeObject(var3.getValue());
      }
   }

   static <K, V> void populateMap(Map<K, V> var0, ObjectInputStream var1) {
      int var2 = var1.readInt();
      populateMap(var0, var1, var2);
   }

   static <K, V> void populateMap(Map<K, V> var0, ObjectInputStream var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         Object var4 = var1.readObject();
         Object var5 = var1.readObject();
         var0.put(var4, var5);
      }
   }

   static <E> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, ObjectOutputStream var1) {
      int var2 = var0.entrySet().size();
      var1.writeInt(var2);

      for (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var0.entrySet()) {
         var1.writeObject(var4.getElement());
         var1.writeInt(var4.getCount());
      }
   }

   static <E> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, ObjectInputStream var1) {
      int var2 = var1.readInt();
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
   }

   static <E> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> var0, ObjectInputStream var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         Object var4 = var1.readObject();
         int var5 = var1.readInt();
         var0.add(var4, var5);
      }
   }

   static <K, V> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> var0, ObjectOutputStream var1) {
      var1.writeInt(var0.asMap().size());

      for (Entry var3 : var0.asMap().entrySet()) {
         var1.writeObject(var3.getKey());
         var1.writeInt(((Collection)var3.getValue()).size());

         for (Object var5 : (Collection)var3.getValue()) {
            var1.writeObject(var5);
         }
      }
   }

   static <K, V> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> var0, ObjectInputStream var1) {
      int var2 = var1.readInt();
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
   }

   static <K, V> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> var0, ObjectInputStream var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         Object var4 = var1.readObject();
         Collection var5 = var0.get(var4);
         int var6 = var1.readInt();

         for (int var7 = 0; var7 < var6; var7++) {
            Object var8 = var1.readObject();
            var5.add(var8);
         }
      }
   }

   static <T> COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> RRCRRCORICCHOHHIRCHIROOHIIOHCO(Class<T> var0, String var1) {
      try {
         Field var2 = var0.getDeclaredField(var1);
         return new COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var2);
      } catch (NoSuchFieldException var3) {
         throw new AssertionError(var3);
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> {
      private final Field CICCHIROHIRHHRROHIIHOCCOOORIOR;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Field var1) {
         this.CICCHIROHIRHHRROHIIHOCCOOORIOR = var1;
         var1.setAccessible(true);
      }

      void set(T var1, Object var2) {
         try {
            this.CICCHIROHIRHHRROHIIHOCCOOORIOR.set(var1, var2);
         } catch (IllegalAccessException var4) {
            throw new AssertionError(var4);
         }
      }

      void set(T var1, int var2) {
         try {
            this.CICCHIROHIRHHRROHIIHOCCOOORIOR.set(var1, var2);
         } catch (IllegalAccessException var4) {
            throw new AssertionError(var4);
         }
      }
   }
}
