package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   TOP_LEFT("topLeft", (var0, var1, var2, var3) -> var3, (var0, var1, var2, var3) -> var3 + var2),
   BOTTOM_LEFT("bottomLeft", (var0, var1, var2, var3) -> var3, (var0, var1, var2, var3) -> var0 - var3 - var2 - var1),
   TOP_RIGHT("topRight", (var0, var1, var2, var3) -> var0 - var3 - var1, (var0, var1, var2, var3) -> var3 + var2),
   BOTTOM_RIGHT("bottomRight", (var0, var1, var2, var3) -> var0 - 5.0F - var1, (var0, var1, var2, var3) -> var0 - var3 - var2 - var1);

   private final String id;
   private final com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH horizontalPosition;
   private final com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH verticalPosition;

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id());
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var3,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5
   ) {
      this.id = var3;
      this.horizontalPosition = var4;
      this.verticalPosition = var5;
   }

   @Generated
   public com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH getHorizontalPosition() {
      return this.horizontalPosition;
   }

   @Generated
   public com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH getVerticalPosition() {
      return this.verticalPosition;
   }
}
