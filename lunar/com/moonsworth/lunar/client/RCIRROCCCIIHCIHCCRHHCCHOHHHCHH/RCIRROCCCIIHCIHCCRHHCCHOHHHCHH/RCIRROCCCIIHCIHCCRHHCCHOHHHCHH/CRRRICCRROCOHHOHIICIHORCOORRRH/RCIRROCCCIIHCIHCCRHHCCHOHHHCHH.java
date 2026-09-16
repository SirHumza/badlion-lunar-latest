package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.spi.NamingManager;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final String IOORHRIIORRCCCCHCCHORIHHRIIOIR = "mc_transfer_accept_from";

   public static boolean CORCOCICIRIOHROHROIIOOHICCHCRR(String var0, String var1) {
      String[] var2 = CCHCOROOHHCIHOHOCHIHRHOHOCROII(var0).split("\\.");
      String[] var3 = CCHCOROOHHCIHOHOCHIHRHOHOCROII(var1).split("\\.");
      if (var3.length == 0) {
         return false;
      }

      int var4 = Math.max(var3.length, var2.length);
      int var5 = Math.abs(var3.length - var2.length);

      for (int var6 = 0; var6 < var4; var6++) {
         String var7 = var3[Math.min(var6, var3.length - 1)];
         String var8 = var2[Math.min(var6, var2.length - 1)];
         if (var6 > var3.length - 1) {
            return var8.equalsIgnoreCase("*") && var5 <= 1;
         }

         if (!var8.equalsIgnoreCase(var7) && !var8.equals("*")) {
            return false;
         }
      }

      return true;
   }

   private static String CCHCOROOHHCIHOHOCHIHRHOHOCROII(String var0) {
      return new StringBuffer(var0).reverse().toString();
   }

   private static String RCICHHOCCHOROIORCOHOHIRRHCIIOR(String var0) {
      if (var0 != null
         && !var0.isEmpty()
         && com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CHIHCHORCIRIROHIRIICIHCRCCHHRH(var0)) {
         String var1 = com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCROOOORIRIHOORHRHCIHICIIRROO(var0).getHost();
         if (var1 != null && !var1.isEmpty()) {
            for (int var2 = 0; var2 < var1.length(); var2++) {
               char var3 = var1.charAt(var2);
               if (var3 == ':' || var3 == '/' || var3 == '\\' || var3 == '?' || var3 == '#' || var3 == '@') {
                  return null;
               }
            }

            return var1;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static void CRRRICCRROCOHHOHIICIHORCOORRRH(String var0, Consumer<Set<String>> var1) {
      new Thread(
            () -> {
               try {
                  Class.forName("com.sun.jndi.dns.DnsContextFactory");
                  String var2 = RCICHHOCCHOROIORCOHOHIRRHCIIOR(var0);
                  if (var2 == null || var2.isEmpty()) {
                     var1.accept(null);
                     return;
                  }

                  Hashtable var3 = new Hashtable();
                  var3.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
                  var3.put("java.naming.provider.url", "dns:");
                  var3.put("com.sun.jndi.dns.timeout.retries", "1");
                  DirContext var4 = (DirContext)NamingManager.getInitialContext(var3);

                  try {
                     String var5 = var2;

                     HashSet var6;
                     for (var6 = new HashSet(); var5.indexOf(".") < var5.lastIndexOf(".") && var6.isEmpty(); var5 = var5.substring(var5.indexOf(".") + 1)) {
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var6, var4);
                     }

                     if (var6.isEmpty()) {
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var6, var4);
                     }

                     var1.accept(var6);
                  } catch (Throwable var7) {
                     var1.accept(null);
                  }
               } catch (Throwable var8) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error(
                     "Failed to initialize SRV redirect resolved, some servers might not work", var8
                  );
               }
            }
         )
         .start();
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, Set<String> var1, DirContext var2) {
      try {
         Attributes var3 = var2.getAttributes(var0, new String[]{"TXT"});
         Attribute var4 = var3.get("TXT");
         if (var4 != null) {
            Iterator var5 = var4.getAll().asIterator();

            while (var5.hasNext()) {
               Object var6 = var5.next();
               if (var6 != null) {
                  String[] var7 = var6.toString().split("=");
                  if (var7.length == 2 && var7[0].equalsIgnoreCase("mc_transfer_accept_from")) {
                     String[] var8 = var7[1].split(",");
                     var1.addAll(Arrays.stream(var8).collect(Collectors.toSet()));
                  }
               }
            }
         }
      } catch (NamingException var9) {
      }
   }
}
