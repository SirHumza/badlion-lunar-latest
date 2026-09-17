package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.net.InetAddress;
import java.text.ParseException;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final String HCHHHIRRRIROOOIOOIOCICOCIICOOR;

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1) {
      this.HCHHHIRRRIROOOIOOIOCICOCIICOOR = var1;
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH CRORHROCOIHRIIHROHHOOHORIICCOI(String var0) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHOIRRRCOROHCRRRCOHHIOORRCRRRI(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(!var1.hasPort());
      String var2 = var1.getHost();
      InetAddress var3 = null;

      try {
         var3 = CRRRICCRROCOHHOHIICIHORCOORRRH.forString(var2);
      } catch (IllegalArgumentException var5) {
      }

      if (var3 != null) {
         return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.toUriString(var3));
      } else {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCCHIHOIIIRIHHIHHIIOICCCCIRIIH(var2);
         if (var4.hasPublicSuffix()) {
            return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4.toString());
         } else {
            throw new IllegalArgumentException("Domain name does not have a recognized public suffix: " + var2);
         }
      }
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH OOHIRRROHORCHOORIOHRICROORHCOO(String var0) {
      try {
         return CRORHROCOIHRIIHROHHOOHORIICCOI(var0);
      } catch (IllegalArgumentException var3) {
         ParseException var2 = new ParseException("Invalid host specifier: " + var0, 0);
         var2.initCause(var3);
         throw var2;
      }
   }

   public static boolean isValid(String var0) {
      try {
         CRORHROCOIHRIIHROHHOOHORIICCOI(var0);
         return true;
      } catch (IllegalArgumentException var2) {
         return false;
      }
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1;
         return this.HCHHHIRRRIROOOIOOIOCICOCIICOOR.equals(var2.HCHHHIRRRIROOOIOOIOCICOCIICOOR);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.HCHHHIRRRIROOOIOOIOCICOCIICOOR.hashCode();
   }

   @Override
   public String toString() {
      return this.HCHHHIRRRIROOOIOOIOCICOCIICOOR;
   }
}
