package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Serializable {
   private static final long IIIOROIOIIIROOOCHCHORIIOIIICCI = 1L;
   private static final Set<String> OCHHCORICCOOOCRCHIHRHRHIHRIRIO = new HashSet<>(
      Arrays.asList(
         "false",
         "False",
         "FALSE",
         "n",
         "N",
         "no",
         "No",
         "NO",
         "null",
         "Null",
         "NULL",
         "on",
         "On",
         "ON",
         "off",
         "Off",
         "OFF",
         "true",
         "True",
         "TRUE",
         "y",
         "Y",
         "yes",
         "Yes",
         "YES"
      )
   );

   public abstract boolean HIHHHCRRHCORRCHCHHIRRIRROCIOCC(String var1);

   public abstract boolean IICCHHIIHICHICHRICCIICCROIRRCR(String var1);

   protected boolean HHIHCCIIHOIRCHIIIRCHHRCCCOIRCC(String var1) {
      return var1.length() == 0 ? true : this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1.charAt(0), var1);
   }

   protected boolean RHOCHHIRRCHHHOHOIRROIROHHHIHIO(int var1, String var2) {
      switch (var1) {
         case 70:
         case 78:
         case 79:
         case 84:
         case 89:
         case 102:
         case 110:
         case 111:
         case 116:
         case 121:
            return OCHHCORICCOOOCRCHIHRHRHIHRIRIO.contains(var2);
         case 126:
            return true;
         default:
            return false;
      }
   }

   protected boolean COIOIIOOCIRCCHIRHHCOROOHHCOIIC(String var1) {
      return var1.length() > 0 ? this.IRRCCOICORICIHCHRHIHIHROIRHOCR(var1.charAt(0), var1) : false;
   }

   protected boolean IRRCCOICORICIHCHRHIHIHROIRHOCR(int var1, String var2) {
      switch (var1) {
         case 43:
         case 45:
         case 46:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            return true;
         case 44:
         case 47:
         default:
            return false;
      }
   }

   protected boolean OHHHRIHRRHICHCCOHCRCIHOICCRIRO(String var1) {
      int var2 = var1.length();

      for (int var3 = 0; var3 < var2; var3++) {
         switch (var1.charAt(var3)) {
            case '#':
               if (var3 > 0) {
                  char var5 = var1.charAt(var3 - 1);
                  if (' ' == var5 || '\t' == var5) {
                     return true;
                  }
               }
               break;
            case ',':
            case '[':
            case ']':
            case '{':
            case '}':
               return true;
            case ':':
               if (var3 < var2 - 1) {
                  char var4 = var1.charAt(var3 + 1);
                  if (' ' == var4 || '\t' == var4) {
                     return true;
                  }
               }
         }
      }

      return false;
   }

   protected boolean OOCIHORCCHOIHHRCHRICHOCIHHRCOI(String var1) {
      int var2 = var1.length();

      for (int var3 = 0; var3 < var2; var3++) {
         char var4 = var1.charAt(var3);
         if (var4 < ' ') {
            return true;
         }
      }

      return false;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements Serializable {
      private static final long IRRCORHROIHICCIOIIIHHRHRRHCCRC = 1L;
      private static final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICCOOORHRICCORHRRRIOIROIRCHRRO = new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

      public static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CICICCHORIHCORHCICIOOCCORCRIHC() {
         return ICCOOORHRICCORHRRRIOIROIRCHRRO;
      }

      @Override
      public boolean HIHHHCRRHCORRCHCHHIRRIRROCIOCC(String var1) {
         return this.HHIHCCIIHOIRCHIIIRCHHRCCCOIRCC(var1) || this.COIOIIOOCIRCCHIRHHCOROOHHCOIIC(var1) || this.OOCIHORCCHOIHHRCHRICHOCIHHRCOI(var1);
      }

      @Override
      public boolean IICCHHIIHICHICHRICCIICCROIRRCR(String var1) {
         return this.HHIHCCIIHOIRCHIIIRCHHRCCCOIRCC(var1) || this.OHHHRIHRRHICHCCOHCRCIHOICCRIRO(var1);
      }
   }
}
