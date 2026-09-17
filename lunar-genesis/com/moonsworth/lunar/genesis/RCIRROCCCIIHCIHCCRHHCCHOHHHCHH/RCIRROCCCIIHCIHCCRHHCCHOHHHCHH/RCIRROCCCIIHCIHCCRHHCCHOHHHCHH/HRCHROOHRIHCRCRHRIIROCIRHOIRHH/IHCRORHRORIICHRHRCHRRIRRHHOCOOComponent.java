package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

class ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V> extends IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> {
   private transient volatile ICICIOCHHHIHOCHCOHORIHRCOHHOCR.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> ROIHCRCCHHCIIHIIRHOHRIRIOOIHOI;
   private transient volatile ICICIOCHHHIHOCHCOHORIHRCOHHOCR.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> HRICRRROHCOROHHOROIRIORICORRIC;

   ICICIOCHHHIHOCHCOHORIHRCOHHOCR(Map<K, V> var1) {
      super(var1);
   }

   @Override
   public V get(@Nullable Object var1) {
      Object var2 = this.getIfCached(var1);
      if (var2 != null) {
         return (V)var2;
      }

      var2 = this.RRCRRIIRHHRCCICHOCOIHROROCICHC(var1);
      if (var2 != null) {
         this.addToCache((K)var1, (V)var2);
      }

      return (V)var2;
   }

   @Override
   protected V getIfCached(@Nullable Object var1) {
      Object var2 = super.getIfCached(var1);
      if (var2 != null) {
         return (V)var2;
      } else {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.ROIHCRCCHHCIIHIIRHOHRIRIOOIHOI;
         if (var3 != null && var3.ROOOIRRCIHCOOHCIIOIOCCCOROHCHI == var1) {
            return var3.OCIIRORCIIIOCRHRHORHIIOCIRCROI;
         } else {
            var3 = this.HRICRRROHCOROHHOROIRIORICORRIC;
            if (var3 != null && var3.ROOOIRRCIHCOOHCIIOIOCCCOROHCHI == var1) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
               return var3.OCIIRORCIIIOCRHRHORHIIOCIRCROI;
            } else {
               return null;
            }
         }
      }
   }

   @Override
   protected void clearCache() {
      super.clearCache();
      this.ROIHCRCCHHCIIHIIRHOHRIRIOOIHOI = null;
      this.HRICRRROHCOROHHOROIRIORICORRIC = null;
   }

   private void addToCache(K var1, V var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>((K)var1, (V)var2));
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> var1) {
      this.HRICRRROHCOROHHOROIRIORICORRIC = this.ROIHCRCCHHCIIHIIRHOHRIRIOOIHOI;
      this.ROIHCRCCHHCIIHIIRHOHRIRIOOIHOI = var1;
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
      final K ROOOIRRCIHCOOHCIIOIOCCCOROHCHI;
      final V OCIIRORCIIIOCRHRHORHIIOCIRCROI;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(K var1, V var2) {
         this.ROOOIRRCIHCOOHCIIOIOCCCOROHCHI = (K)var1;
         this.OCIIRORCIIIOCRHRHORHIIOCIRCROI = (V)var2;
      }
   }
}
