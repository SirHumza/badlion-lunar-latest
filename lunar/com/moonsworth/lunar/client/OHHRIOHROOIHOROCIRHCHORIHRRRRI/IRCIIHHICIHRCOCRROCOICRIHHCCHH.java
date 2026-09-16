package com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   DUTCH("nl_NL", "nl"),
   FRENCH("fr_FR", "fr"),
   GERMAN("de_DE", "de"),
   ENGLISH("en_US", "en"),
   ITALIAN("it_IT", "it"),
   POLISH("pl_PL", "pl"),
   SPANISH("es_ES", "es"),
   SWEDISH("sv_SE", "sv"),
   LITHUANIAN("lt_LT", "lt"),
   PORTUGUESE("pt_PT", "pt"),
   PORTUGUESE_BR("pt_BR", "pt"),
   TURKISH("tr_TR", "tr");

   final String fileName;
   final String base;

   public static boolean isSupported(String var0) {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
         if (var4.fileName.equals(var0)) {
            return true;
         }
      }

      return false;
   }

   @Generated
   public String getFileName() {
      return this.fileName;
   }

   @Generated
   public String getBase() {
      return this.base;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, String var4) {
      this.fileName = var3;
      this.base = var4;
   }
}
