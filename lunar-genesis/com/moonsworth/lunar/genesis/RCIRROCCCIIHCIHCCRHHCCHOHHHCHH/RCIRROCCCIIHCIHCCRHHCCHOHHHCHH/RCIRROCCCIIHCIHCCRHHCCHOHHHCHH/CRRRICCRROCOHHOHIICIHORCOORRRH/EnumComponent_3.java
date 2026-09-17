package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class RICRIHOOHROHICCHHIIHRHCORHIOHR<K extends Enum<K>, V>
   extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
   private transient Class<K> keyType;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final long OCIRRRCORHHIHCHCHHRCORCROHOOIO = 0L;

   public static <K extends Enum<K>, V> RICRIHOOHROHICCHHIIHRHCORHIOHR<K, V> RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(Class<K> var0) {
      return new RICRIHOOHROHICCHHIIHRHCORHIOHR<>(var0);
   }

   public static <K extends Enum<K>, V> RICRIHOOHROHICCHHIIHRHCORHIOHR<K, V> HCHRIROHHHCORIOCROOCHRCIOROOCI(Map<K, ? extends V> var0) {
      RICRIHOOHROHICCHHIIHRHCORHIOHR var1 = RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(IIOCHOIICCIORCOROIROHICCHIOHIC.inferKeyType(var0));
      var1.putAll(var0);
      return var1;
   }

   private RICRIHOOHROHICCHHIIHRHCORHIOHR(Class<K> var1) {
      super(new EnumMap<>(var1), ROCHRRCORRCOOOOOCOICOCROIIHIHH.newHashMapWithExpectedSize(((Enum[])var1.getEnumConstants()).length));
      this.keyType = var1;
   }

   K checkKey(K var1) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         (K)var1
      );
   }

   @CanIgnoreReturnValue
   public V put(K var1, @Nullable V var2) {
      return super.put((K)var1, (V)var2);
   }

   @CanIgnoreReturnValue
   public V forcePut(K var1, @Nullable V var2) {
      return super.forcePut((K)var1, (V)var2);
   }

   public Class<K> keyType() {
      return this.keyType;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeObject(this.keyType);
      COOROCRCCHCIHRCCIROCICCIIIRHHC.writeMap(this, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      this.keyType = (Class<K>)var1.readObject();
      this.setDelegates(new EnumMap<>(this.keyType), new HashMap<>(((Enum[])this.keyType.getEnumConstants()).length * 3 / 2));
      COOROCRCCHCIHRCCIROCICCIIIRHHC.populateMap(this, var1);
   }
}
