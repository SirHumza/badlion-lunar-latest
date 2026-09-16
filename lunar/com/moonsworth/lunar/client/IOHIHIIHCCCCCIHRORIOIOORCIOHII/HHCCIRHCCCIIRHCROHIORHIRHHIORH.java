package com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII;

import com.google.common.net.HostAndPort;
import java.net.IDN;
import lombok.Generated;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final HostAndPort OCOCRHHOHCROIHHIICIHOCOCCHOCHR;
   private static final HHCCIRHCCCIIRHCROHIORHIRHHIORH OCHOCHIOCCIRCCHCCORHIRICRRCIIH = new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      HostAndPort.fromParts("server.invalid", 25565)
   );

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, int var2) {
      this(HostAndPort.fromParts(var1, var2));
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(HostAndPort var1) {
      this.OCOCRHHOHCROIHHIICIHOCOCCHOCHR = var1;
   }

   public String getHost() {
      try {
         return IDN.toASCII(this.OCOCRHHOHCROIHHIICIHOCOCCHOCHR.getHostText());
      } catch (IllegalArgumentException var2) {
         return "";
      }
   }

   public int getPort() {
      return this.OCOCRHHOHCROIHHIICIHOCOCCHOCHR.getPort();
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH IRCROOOORIRIHOORHRHCIHICIIRROO(String var0) {
      if (var0 == null) {
         return OCHOCHIOCCIRCCHCCORHIRICRRCIIH;
      }

      try {
         HostAndPort var1 = HostAndPort.fromString(var0).withDefaultPort(25565);
         return var1.getHostText().isEmpty() ? OCHOCHIOCCIRCCHCCORHIRICRRCIIH : new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      } catch (IllegalArgumentException var2) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Failed to parse URL {}", var0, var2
         );
         return OCHOCHIOCCIRCCHCCORHIRICRRCIIH;
      }
   }

   public static boolean CHIHCHORCIRIROHIRIICIHCRCCHHRH(String var0) {
      try {
         HostAndPort var1 = HostAndPort.fromString(var0);
         String var2 = var1.getHostText();
         if (!var2.isEmpty()) {
            IDN.toASCII(var2);
            return true;
         }
      } catch (IllegalArgumentException var3) {
      }

      return false;
   }

   static int IOORHRRIIHRCORHOOHOOOHCOOROCHO(String var0) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var2) {
         return 25565;
      }
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH var2)) {
         return false;
      } else {
         HostAndPort var3 = this.OCOCRHHOHCROIHHIICIHOCOCCHOCHR;
         HostAndPort var4 = var2.OCOCRHHOHCROIHHIICIHOCOCCHOCHR;
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      HostAndPort var3 = this.OCOCRHHOHCROIHHIICIHOCOCCHOCHR;
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ServerAddress(hostAndPort=" + this.OCOCRHHOHCROIHHIICIHOCOCCHOCHR + ")";
   }
}
