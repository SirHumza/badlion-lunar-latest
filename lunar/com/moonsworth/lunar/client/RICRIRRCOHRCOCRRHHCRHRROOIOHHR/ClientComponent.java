package com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Logger HHHCCICHHRRIHCROHORIIIRRORRHHR = LogManager.getLogger("Lunar Client");

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var0, Object... var1) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.debug("[LC] " + String.format(var0.toString(), var1));
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, Object var1, Object... var2) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.debug("[LC " + var0 + "] " + String.format(var1.toString(), var2));
   }

   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Object var0, Object... var1) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.info("[LC] " + String.format(var0.toString(), var1));
   }

   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, Object var1, Object... var2) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.info("[LC " + var0 + "] " + String.format(var1.toString(), var2));
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Object var0, Object... var1) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.warn("[LC] " + String.format(var0.toString(), var1));
   }

   public static void warn(String var0, Throwable var1) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.warn("[LC] " + var0, var1);
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var0, Object var1, Object... var2) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.warn("[LC " + var0 + "] " + String.format(var1.toString(), var2));
   }

   public static void CRRRICCRROCOHHOHIICIHORCOORRRH(Object var0, Object... var1) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.error("[LC] " + String.format(var0.toString(), var1));
   }

   public static void CRRRICCRROCOHHOHIICIHORCOORRRH(String var0, Object var1, Object... var2) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.error("[LC " + var0 + "] " + String.format(var1.toString(), var2));
   }

   public static void error(String var0, Throwable var1) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.error("[LC Error] {}", new Object[]{var0, var1});
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Throwable var0, String var1, Object... var2) {
      HHHCCICHHRRIHCROHORIIIRRORRHHR.error(String.format(var1, var2), var0);
   }
}
