package com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII;

import com.google.common.base.Predicate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import lombok.Generated;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1);

   boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1);

   static com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIORCIIRROHOOHORCHCHCCRCOHORIH() {
      try {
         final Predicate var0 = com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RICCRHHCRICOOHOIICHIHRIIHHROHH();
         return new com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
            @Override
            public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
               String var2 = var1.OCRRHORRCICOORROOOOOCCIOIHHOIH();
               String var3 = var1.CHCOIOCIIHHRIOIIRRCOHOHOCOCRII();
               return !var0.apply(var2) && !var0.apply(var3);
            }

            @Override
            public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
               String var2 = var1.getHost();
               return !var0.apply(var2);
            }
         };
      } catch (Throwable var1) {
         throw var1;
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private static Class<?> HHRCHCICHIHHIOICOHORORHIRRHORH;
      private static Constructor<?> IIRHIIORIHIRHICIIIRCCIRICORHHO;
      private static final AtomicReference<Object> RICIOCOIRCHHCRROROCROHHCCOHCHR = new AtomicReference<>();

      private static Predicate<String> IOIRCCHRRIHRIIRCHOORIORIHRHOHC() {
         try {
            Predicate var0 = var0x -> false;
            if (IIRHIIORIHIRHICIIIRCCIRICORHHO == null) {
               return var0;
            }

            try {
               URLConnection var1 = new URL("https://sessionserver.mojang.com/blockedservers").openConnection();

               try (BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream(), StandardCharsets.ISO_8859_1))) {
                  Collection var3 = var2.lines().collect(Collectors.toSet());
                  var0 = (Predicate)IIRHIIORIHIRHICIIIRCCIRICORHHO.newInstance(var3);
               } catch (Throwable var7) {
                  var7.printStackTrace();
               }
            } catch (IOException var8) {
               var8.printStackTrace();
            }

            return var0;
         } catch (Throwable var9) {
            throw var9;
         }
      }

      @Generated
      public static Predicate<String> RICCRHHCRICOOHOIICHIHRIIHHROHH() {
         Object var0 = RICIOCOIRCHHCRROROCROHHCCOHCHR.get();
         if (var0 == null) {
            synchronized (RICIOCOIRCHHCRROROCROHHCCOHCHR) {
               var0 = RICIOCOIRCHHCRROROCROHHCCOHCHR.get();
               if (var0 == null) {
                  Predicate var2 = IOIRCCHRRIHRIIRCHOORIORIHRHOHC();
                  var0 = var2 == null ? RICIOCOIRCHHCRROROCROHHCCOHCHR : var2;
                  RICIOCOIRCHHCRROROCROHHCCOHCHR.set(var0);
               }
            }
         }

         return (Predicate<String>)(var0 == RICIOCOIRCHHCRROROCROHHCCOHCHR ? null : var0);
      }

      static {
         try {
            HHRCHCICHIHHIOICOHORORHIRRHORH = Class.forName("com.mojang.patchy.BlockedServers");
            IIRHIIORIHIRHICIIIRCCIRICORHHO = HHRCHCICHIHHIOICOHORORHIRRHORH.getConstructor(Collection.class);
         } catch (ClassNotFoundException | NoSuchMethodException var1) {
            System.err.println("Failed to find BlockList using Reflection");
            var1.printStackTrace();
         }
      }
   }
}
