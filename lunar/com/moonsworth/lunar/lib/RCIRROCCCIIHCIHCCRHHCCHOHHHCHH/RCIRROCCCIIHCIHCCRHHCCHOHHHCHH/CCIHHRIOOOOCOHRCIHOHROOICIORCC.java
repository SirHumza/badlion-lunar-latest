package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.Serializable;

public abstract class CCIHHRIOOOOCOHRCIHOHROOICIORCC<T> implements Serializable {
   public abstract Class<?> RRCOCIICOIRHOCRCHOHIOCCRICHOIH();

   public abstract boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCIHHRIOOOOCOHRCIHOHROOICIORCC<?> var1);

   public boolean HRCIORRCROHRORIIIICRCCCRICIOCI() {
      return false;
   }

   public boolean HICRRICCHCCROOHHCHOCOCCHOIHHOC(String var1, Object var2) {
      return false;
   }

   public abstract CCIHHRIOOOOCOHRCIHOHROOICIORCC<T> RRRHHIRORHCHHCOOCIHOICORHHCHHO(Class<?> var1);

   public abstract CCIHHRIOOOOCOHRCIHOHROOICIORCC<T> HOIRIRROOCICRHIRIHCIRCOHCIHHHO(Object var1);

   public abstract CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRCROCCRIOIROHCCRCCIORICOCIOHC(Object var1);

   public abstract T COOROCRCCHCIHRCCIROCICCIIIRHHC(Object var1);

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Serializable {
      private static final long ICCCHRHRRIIHRRCOCORRIOIRCCHOOC = 1L;
      public final Class<?> CHROCCHRRORORHHOIIRCHOOIHHHHCH;
      public final Class<?> IORHIIOOOORORRCRCHIOORIHHCCRHC;
      public final Object CIHIOICICHIHOCHIIHOIOCRCRIHCCC;
      private final int HHCIRHIIROCRIHCOOHRRHIOROCRCCI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var1, Class<?> var2, Object var3) {
         if (var3 == null) {
            throw new IllegalArgumentException("Can not construct IdKey for null key");
         }

         this.CHROCCHRRORORHHOIIRCHOOIHHHHCH = var1;
         this.IORHIIOOOORORRCRCHIOORIHHCCRHC = var2;
         this.CIHIOICICHIHOCHIIHOIOCRCRIHCCC = var3;
         int var4 = var3.hashCode() + var1.getName().hashCode();
         if (var2 != null) {
            var4 ^= var2.getName().hashCode();
         }

         this.HHCIRHIIROCRIHCOOHRRHIOROCRCCI = var4;
      }

      @Override
      public int hashCode() {
         return this.HHCIRHIIROCRIHCOOHRRHIOROCRCCI;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 == null) {
            return false;
         }

         if (var1.getClass() != this.getClass()) {
            return false;
         }

         CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         return var2.CIHIOICICHIHOCHIIHOIOCRCRIHCCC.equals(this.CIHIOICICHIHOCHIIHOIOCRCRIHCCC)
            && var2.CHROCCHRRORORHHOIIRCHOOIHHHHCH == this.CHROCCHRRORORHHOIIRCHOOIHHHHCH
            && var2.IORHIIOOOORORRCRCHIOORIHHCCRHC == this.IORHIIOOOORORRCRCHIOORIHHCCRHC;
      }

      @Override
      public String toString() {
         return String.format(
            "[ObjectId: key=%s, type=%s, scope=%s]",
            this.CIHIOICICHIHOCHIIHOIOCRCRIHCCC,
            this.CHROCCHRRORORHHOIIRCHOOIHHHHCH == null ? "NONE" : this.CHROCCHRRORORHHOIIRCHOOIHHHHCH.getName(),
            this.IORHIIOOOORORRCRCHIOORIHHCCRHC == null ? "NONE" : this.IORHIIOOOORORRCRCHIOORIHHCCRHC.getName()
         );
      }
   }
}
