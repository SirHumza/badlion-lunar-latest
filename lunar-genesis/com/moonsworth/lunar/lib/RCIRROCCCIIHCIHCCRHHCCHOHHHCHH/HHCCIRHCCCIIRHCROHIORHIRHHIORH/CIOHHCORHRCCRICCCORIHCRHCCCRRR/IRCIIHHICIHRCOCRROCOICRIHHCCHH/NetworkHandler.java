package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI extends IHICORCROOROHCIHIHCOIHRRHICICO<InetSocketAddress> {
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI() {
      super(InetSocketAddress.class);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      InetSocketAddress var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   ) {
      InetAddress var4 = var1.getAddress();
      String var5 = var4 == null ? var1.getHostName() : var4.toString().trim();
      int var6 = var5.indexOf(47);
      if (var6 >= 0) {
         if (var6 == 0) {
            var5 = var4 instanceof Inet6Address ? "[" + var5.substring(1) + "]" : var5.substring(1);
         } else {
            var5 = var5.substring(0, var6);
         }
      }

      var2.writeString(var5 + ":" + var1.getPort());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      InetSocketAddress var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR var4
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2,
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1,
            InetSocketAddress.class,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING
         )
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var5);
   }
}
