package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

class IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> {
   private final Map<K, V> CCCORIRRCCHCOHHRRRHCHHHHOOHCRO;
   private transient volatile @Nullable Entry<K, V> cacheEntry;

   IHCRORHRORIICHRHRCHRRIRRHHOCOO(Map<K, V> var1) {
      this.CCCORIRRCCHCOHHRRRHCHHHHOOHCRO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   @CanIgnoreReturnValue
   public final V CRHROHHHCIHHCOHCOORCRIHHIICROR(@Nullable K var1, @Nullable V var2) {
      this.clearCache();
      return this.CCCORIRRCCHCOHHRRRHCHHHHOOHCRO.put((K)var1, (V)var2);
   }

   @CanIgnoreReturnValue
   public final V IHHCCRIROCRCRROCCRIHCCHOOOOIRC(@Nullable Object var1) {
      this.clearCache();
      return this.CCCORIRRCCHCOHHRRRHCHHHHOOHCRO.remove(var1);
   }

   public final void ROOHICCIHIHOHORIICHIRHIHIOIHRH() {
      this.clearCache();
      this.CCCORIRRCCHCOHHRRRHCHHHHOOHCRO.clear();
   }

   public V get(@Nullable Object var1) {
      Object var2 = this.getIfCached(var1);
      return (V)(var2 != null ? var2 : this.RRCRRIIRHHRCCICHOCOIHROROCICHC(var1));
   }

   public final V RRCRRIIRHHRCCICHOCOIHROROCICHC(@Nullable Object var1) {
      return this.CCCORIRRCCHCOHHRRRHCHHHHOOHCRO.get(var1);
   }

   public final boolean RHIHRRICIHORIHHIHHOIIOHHRCIIIH(@Nullable Object var1) {
      return this.getIfCached(var1) != null || this.CCCORIRRCCHCOHHRRRHCHHHHOOHCRO.containsKey(var1);
   }

   public final Set<K> CHHRHOOHCCIRORCCCICHOOIIIOHORC() {
      return new AbstractSet<K>() {
         public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<K> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
            final Iterator var1 = IHCRORHRORIICHRHRCHRRIRRHHOCOO.this.CCCORIRRCCHCOHHRRRHCHHHHOOHCRO.entrySet().iterator();
            return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<K>() {
               @Override
               public boolean hasNext() {
                  return var1.hasNext();
               }

               @Override
               public K next() {
                  Entry var1x = (Entry)var1.next();
                  IHCRORHRORIICHRHRCHRRIRRHHOCOO.this.cacheEntry = var1x;
                  return (K)var1x.getKey();
               }
            };
         }

         @Override
         public int size() {
            return IHCRORHRORIICHRHRCHRRIRRHHOCOO.this.CCCORIRRCCHCOHHRRRHCHHHHOOHCRO.size();
         }

         @Override
         public boolean contains(@Nullable Object var1) {
            return IHCRORHRORIICHRHRCHRRIRRHHOCOO.this.RHIHRRICIHORIHHIHHOIIOHHRCIIIH(var1);
         }
      };
   }

   protected V getIfCached(@Nullable Object var1) {
      Entry var2 = this.cacheEntry;
      return (V)(var2 != null && var2.getKey() == var1 ? var2.getValue() : null);
   }

   protected void clearCache() {
      this.cacheEntry = null;
   }
}
