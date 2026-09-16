package com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII;

import java.util.Hashtable;
import java.util.Optional;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

@FunctionalInterface
public interface RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI EMPTY = var0 -> Optional.empty();

   Optional<HHCCIRHCCCIIRHCROHIORHIRHHIORH> lookupRedirect(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1);

   static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI createDnsSrvRedirectHandler() {
      InitialDirContext var0;
      try {
         Class.forName("com.sun.jndi.dns.DnsContextFactory");
         Hashtable var1 = new Hashtable();
         var1.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
         var1.put("java.naming.provider.url", "dns:");
         var1.put("com.sun.jndi.dns.timeout.retries", "1");
         var0 = new InitialDirContext(var1);
      } catch (Throwable var2) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error(
            "Failed to initialize SRV redirect resolved, some servers might not work", var2
         );
         return EMPTY;
      }

      return var1x -> {
         if (var1x.getPort() == 25565) {
            try {
               InitialDirContext var2x = new InitialDirContext(var0.getEnvironment());
               Attributes var3 = var2x.getAttributes("_minecraft._tcp." + var1x.getHost(), new String[]{"SRV"});
               var2x.close();
               Attribute var4 = var3.get("srv");
               if (var4 != null) {
                  String[] var5 = var4.get().toString().split(" ", 4);
                  return Optional.of(new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5[3], HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOORHRRIIHRCORHOOHOOOHCOOROCHO(var5[2])));
               }
            } catch (Throwable var6) {
            }
         }

         return Optional.empty();
      };
   }
}
