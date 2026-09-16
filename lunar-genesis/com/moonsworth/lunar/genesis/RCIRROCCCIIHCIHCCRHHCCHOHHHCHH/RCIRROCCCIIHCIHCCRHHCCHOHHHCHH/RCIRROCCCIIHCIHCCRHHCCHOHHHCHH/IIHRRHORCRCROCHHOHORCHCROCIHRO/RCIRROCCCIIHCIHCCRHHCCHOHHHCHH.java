package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.google.errorprone.annotations.Immutable;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHICORCROOROHCIHIHCOIHRRHICICO;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.io.Serializable;
import org.checkerframework.checker.nullness.qual.Nullable;

@Immutable
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Serializable {
   private static final int HRHHOOROOOIHOCROCORCROHOOOICHH = -1;
   private final String RHCHOIRRIHIICOCCRIRRRIICORICRR;
   private final int HCCCHHCORCOCCROIHORRHOORHIRIRO;
   private final boolean OOHIRCCCICRHCOICRHCHOCRIRRCRHH;
   private static final long RIIORIIOOHORIRRRHRICCRHIHOOHII = 0L;

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2, boolean var3) {
      this.RHCHOIRRIHIICOCCRIRRRIICORICRR = var1;
      this.HCCCHHCORCOCCROIHORRHOORHIRIRO = var2;
      this.OOHIRCCCICRHCOICRHCHOCRIRRCRHH = var3;
   }

   public String getHost() {
      return this.RHCHOIRRIHIICOCCRIRRRIICORICRR;
   }

   public boolean hasPort() {
      return this.HCCCHHCORCOCCROIHORRHOORHIRIRO >= 0;
   }

   public int getPort() {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(this.hasPort());
      return this.HCCCHHCORCOCCROIHORRHOORHIRIRO;
   }

   public int getPortOrDefault(int var1) {
      return this.hasPort() ? this.HCCCHHCORCOCCROIHORRHOORHIRIRO : var1;
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(String var0, int var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(isValidPort(var1), "Port out of range: %s", var1);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = OHOIRRRCOROHCRRRCOHHIOORRCRRRI(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(!var2.hasPort(), "Host has a port: %s", var0);
      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.RHCHOIRRIHIICOCCRIRRRIICORICRR, var1, var2.OOHIRCCCICRHCOICRHCHOCRIRRCRHH);
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCHIRHOIRORORCRRCCIHCRCCOHHOHC(String var0) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = OHOIRRRCOROHCRRRCOHHIOORRCRRRI(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(!var1.hasPort(), "Host has a port: %s", var0);
      return var1;
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHOIRRRCOROHCRRRCOHHIOORRCRRRI(String var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      String var2 = null;
      boolean var3 = false;
      String var1;
      if (var0.startsWith("[")) {
         String[] var4 = getHostAndPortFromBracketedHost(var0);
         var1 = var4[0];
         var2 = var4[1];
      } else {
         int var7 = var0.indexOf(58);
         if (var7 >= 0 && var0.indexOf(58, var7 + 1) == -1) {
            var1 = var0.substring(0, var7);
            var2 = var0.substring(var7 + 1);
         } else {
            var1 = var0;
            var3 = var7 >= 0;
         }
      }

      int var8 = -1;
      if (!IHICORCROOROHCIHIHCOIHRRHICICO.isNullOrEmpty(var2)) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(!var2.startsWith("+"), "Unparseable port number: %s", var0);

         try {
            var8 = Integer.parseInt(var2);
         } catch (NumberFormatException var6) {
            throw new IllegalArgumentException("Unparseable port number: " + var0);
         }

         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(isValidPort(var8), "Port number out of range: %s", var0);
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var8, var3);
   }

   private static String[] getHostAndPortFromBracketedHost(String var0) {
      int var1 = 0;
      int var2 = 0;
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", var0);
      var1 = var0.indexOf(58);
      var2 = var0.lastIndexOf(93);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 > -1 && var2 > var1, "Invalid bracketed host/port: %s", var0);
      String var3 = var0.substring(1, var2);
      if (var2 + 1 == var0.length()) {
         return new String[]{var3, ""};
      }

      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.charAt(var2 + 1) == ':', "Only a colon may follow a close bracket: %s", var0);

      for (int var4 = var2 + 2; var4 < var0.length(); var4++) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(Character.isDigit(var0.charAt(var4)), "Port must be numeric: %s", var0);
      }

      return new String[]{var3, var0.substring(var2 + 2)};
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHCOOIOIOIOOHORROCORRHCHICIOCI(int var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(isValidPort(var1));
      return this.hasPort() ? this : new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RHCHOIRRIHIICOCCRIRRRIICORICRR, var1, this.OOHIRCCCICRHCOICRHCHOCRIRRCRHH);
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCOOOCIHOORRIHROOCOHIRRROIHCH() {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         !this.OOHIRCCCICRHCOICRHCHOCRIRRCRHH, "Possible bracketless IPv6 literal: %s", this.RHCHOIRRIHIICOCCRIRRRIICORICRR
      );
      return this;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)) {
         return false;
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
      return HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(this.RHCHOIRRIHIICOCCRIRRRIICORICRR, var2.RHCHOIRRIHIICOCCRIRRRIICORICRR)
         && this.HCCCHHCORCOCCROIHORRHOORHIRIRO == var2.HCCCHHCORCOCCROIHORRHOORHIRIRO;
   }

   @Override
   public int hashCode() {
      return HHRIICOIOORCHCOIICOOIHIRHHICRI.hashCode(this.RHCHOIRRIHIICOCCRIRRRIICORICRR, this.HCCCHHCORCOCCROIHORRHOORHIRIRO);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(this.RHCHOIRRIHIICOCCRIRRRIICORICRR.length() + 8);
      if (this.RHCHOIRRIHIICOCCRIRRRIICORICRR.indexOf(58) >= 0) {
         var1.append('[').append(this.RHCHOIRRIHIICOCCRIRRRIICORICRR).append(']');
      } else {
         var1.append(this.RHCHOIRRIHIICOCCRIRRRIICORICRR);
      }

      if (this.hasPort()) {
         var1.append(':').append(this.HCCCHHCORCOCCROIHORRHOORHIRIRO);
      }

      return var1.toString();
   }

   private static boolean isValidPort(int var0) {
      return var0 >= 0 && var0 <= 65535;
   }
}
