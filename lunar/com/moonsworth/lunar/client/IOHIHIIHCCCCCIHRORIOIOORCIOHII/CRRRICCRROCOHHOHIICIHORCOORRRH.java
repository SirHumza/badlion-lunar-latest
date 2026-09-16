package com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Optional;

@FunctionalInterface
public interface CRRRICCRROCOHHOHIICIHORCOORRRH {
   CRRRICCRROCOHHOHIICIHORCOORRRH SYSTEM = var0 -> {
      try {
         InetAddress var1 = InetAddress.getByName(var0.getHost());
         return Optional.of(IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new InetSocketAddress(var1, var0.getPort())));
      } catch (UnknownHostException var2) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            "Couldn't resolve server %s address", var0.getHost(), var2
         );
         return Optional.empty();
      }
   };

   Optional<IRCIIHHICIHRCOCRROCOICRIHHCCHH> resolve(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1);
}
