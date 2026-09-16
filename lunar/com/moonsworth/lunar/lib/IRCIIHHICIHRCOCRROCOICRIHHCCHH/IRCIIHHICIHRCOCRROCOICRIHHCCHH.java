package com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<V> implements RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> {
   private final String ROOOHOCOHIRIORROIRHRHROCICOCHI;
   private final com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<V> CHRIOHHHRIHCOIOCCCRIOROHICOHRH;
   private final @Nullable V RICIOHIOHHOOHHRIHCOIOCICHHOHIC;

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1,
      com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<V> var2,
      @Nullable V var3
   ) {
      this.ROOOHOCOHIRIORROIRHRHROCICOCHI = var1;
      this.CHRIOHHHRIHCOIOCCCRIOROHICOHRH = var2;
      this.RICIOHIOHHOOHHRIHCOIOCICHHOHIC = (V)var3;
   }

   @Override
   public String id() {
      return this.ROOOHOCOHIRIORROIRHRHROCICOCHI;
   }

   @Override
   public com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<V> IRRCRIOHOHIROOCOROHCCORIROCIHI() {
      return this.CHRIOHHHRIHCOIOCCCRIOROHICOHRH;
   }

   @Override
   public @Nullable V ROIOHIIHHHOOOHHIOOIIRIHCOCCIIH() {
      return this.RICIOHIOHHOOHHRIHCOIOCICHHOHIC;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1;
         return Objects.equals(this.ROOOHOCOHIRIORROIRHRHROCICOCHI, var2.ROOOHOCOHIRIORROIRHRHROCICOCHI)
            && Objects.equals(this.CHRIOHHHRIHCOIOCCCRIOROHICOHRH, var2.CHRIOHHHRIHCOIOCCCRIOROHICOHRH);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.ROOOHOCOHIRIORROIRHRHROCICOCHI, this.CHRIOHHHRIHCOIOCCCRIOROHICOHRH);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + "{id="
         + this.ROOOHOCOHIRIORROIRHRHROCICOCHI
         + ",type="
         + this.CHRIOHHHRIHCOIOCCCRIOROHICOHRH
         + ",defaultValue="
         + this.RICIOHIOHHOOHHRIHCOIOCICHHOHIC
         + '}';
   }
}
