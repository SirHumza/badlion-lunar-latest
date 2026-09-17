package com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.Proxy;
import java.util.UUID;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   private static final Constructor<YggdrasilAuthenticationService> CRIRICHHRCIORIOHOHHICHROIHOCRR;

   public static YggdrasilAuthenticationService COCOCCIORORHIIROHIOIOHIHCRIOOO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19) {
         return new YggdrasilAuthenticationService(Proxy.NO_PROXY);
      }

      try {
         return CRIRICHHRCIORIOHOHHICHROIHOCRR.newInstance(Proxy.NO_PROXY, UUID.randomUUID().toString());
      } catch (InstantiationException | InvocationTargetException | IllegalAccessException var1) {
         throw new RuntimeException("Failed to create profile repository through reflection.", var1);
      }
   }

   static {
      try {
         CRIRICHHRCIORIOHOHHICHROIHOCRR = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19
            ? null
            : YggdrasilAuthenticationService.class.getDeclaredConstructor(Proxy.class, String.class);
      } catch (NoSuchMethodException var1) {
         throw new RuntimeException(var1);
      }
   }
}
