package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
final class RHIHRRICIHORIHHIHHOIIOHHRCIIIH<T> extends IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> implements Serializable {
   final IOIHHIORCICCHIIHOIOIOHHRICRHIO<? super T> HHICIRHHHCOIHICRCOHCCHIHCRHIOO;
   private static final long HIORCCHOCIOCHHHCOHIRHHCIOIRICH = 0L;

   RHIHRRICIHORIHHIHHOIIOHHRCIIIH(IOIHHIORCICCHIIHOIOIOHHRICRHIO<? super T> var1) {
      this.HHICIRHHHCOIHICRCOHCCHIHCRHIOO = var1;
   }

   @Override
   public int compare(@Nullable T var1, @Nullable T var2) {
      if (var1 == var2) {
         return 0;
      } else if (var1 == null) {
         return -1;
      } else {
         return var2 == null ? 1 : this.HHICIRHHHCOIHICRCOHCCHIHCRHIOO.compare((T)var1, (T)var2);
      }
   }

   @Override
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> HCHORRRCIORCRHCRIIHROIRRRHCCOR() {
      return this.HHICIRHHHCOIHICRCOHCCHIHCRHIOO.HCHORRRCIORCRHCRIIHROIRRRHCCOR().OCRORRCHHHCHOIHHCIOHIIIIRCHHCI();
   }

   @Override
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> ICIRICOORRRIHCOHHOHIHRHIRRCHII() {
      return this;
   }

   @Override
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> OCRORRCHHHCHOIHHCIOHIIIIRCHHCI() {
      return this.HHICIRHHHCOIHICRCOHCCHIHCRHIOO.OCRORRCHHHCHOIHHCIOHIIIIRCHHCI();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof RHIHRRICIHORIHHIHHOIIOHHRCIIIH) {
         RHIHRRICIHORIHHIHHOIIOHHRCIIIH var2 = (RHIHRRICIHORIHHIHHOIIOHHRCIIIH)var1;
         return this.HHICIRHHHCOIHICRCOHCCHIHCRHIOO.equals(var2.HHICIRHHHCOIHICRCOHCCHIHCRHIOO);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.HHICIRHHHCOIHICRCOHCCHIHCRHIOO.hashCode() ^ 957692532;
   }

   @Override
   public String toString() {
      return this.HHICIRHHHCOIHICRCOHCCHIHCRHIOO + ".nullsFirst()";
   }
}
