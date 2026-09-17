package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.Map;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class IIOCHOIICCIORCOROIROHICCHIOHIC<K extends Enum<K>, V extends Enum<V>>
   extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
   private transient Class<K> keyType;
   private transient Class<V> valueType;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final long IOHHRHRHIOHICHHHIRIHCCCCIIROHO = 0L;

   public static <K extends Enum<K>, V extends Enum<V>> IIOCHOIICCIORCOROIROHICCHIOHIC<K, V> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Class<K> var0, Class<V> var1) {
      return new IIOCHOIICCIORCOROIROHICCHIOHIC<>(var0, var1);
   }

   public static <K extends Enum<K>, V extends Enum<V>> IIOCHOIICCIORCOROIROHICCHIOHIC<K, V> IHICORCROOROHCIHIHCOIHRRHICICO(Map<K, V> var0) {
      IIOCHOIICCIORCOROIROHICCHIOHIC var1 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR(inferKeyType(var0), inferValueType(var0));
      var1.putAll(var0);
      return var1;
   }

   private IIOCHOIICCIORCOROIROHICCHIOHIC(Class<K> var1, Class<V> var2) {
      super(new EnumMap<>(var1), new EnumMap<>(var2));
      this.keyType = var1;
      this.valueType = var2;
   }

   static <K extends Enum<K>> Class<K> inferKeyType(Map<K, ?> var0) {
      if (var0 instanceof IIOCHOIICCIORCOROIROHICCHIOHIC) {
         return ((IIOCHOIICCIORCOROIROHICCHIOHIC)var0).keyType();
      }

      if (var0 instanceof RICRIHOOHROHICCHHIIHRHCORHIOHR) {
         return ((RICRIHOOHROHICCHHIIHRHCORHIOHR)var0).keyType();
      }

      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         !var0.isEmpty()
      );
      return ((Enum)var0.keySet().iterator().next()).getDeclaringClass();
   }

   private static <V extends Enum<V>> Class<V> inferValueType(Map<?, V> var0) {
      if (var0 instanceof IIOCHOIICCIORCOROIROHICCHIOHIC) {
         return ((IIOCHOIICCIORCOROIROHICCHIOHIC)var0).valueType;
      }

      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         !var0.isEmpty()
      );
      return ((Enum)var0.values().iterator().next()).getDeclaringClass();
   }

   public Class<K> keyType() {
      return this.keyType;
   }

   public Class<V> valueType() {
      return this.valueType;
   }

   K checkKey(K var1) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         (K)var1
      );
   }

   V checkValue(V var1) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         (V)var1
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeObject(this.keyType);
      var1.writeObject(this.valueType);
      COOROCRCCHCIHRCCIROCICCIIIRHHC.writeMap(this, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      this.keyType = (Class<K>)var1.readObject();
      this.valueType = (Class<V>)var1.readObject();
      this.setDelegates(new EnumMap<>(this.keyType), new EnumMap<>(this.valueType));
      COOROCRCCHCIHRCCIROCICCIIIRHHC.populateMap(this, var1);
   }
}
