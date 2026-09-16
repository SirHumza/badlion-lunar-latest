package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static final byte HCHIOIIRHHIHIIOIOOICHIOOCOOOHC = 0;
   public static final byte HHIRROIORRORICOROCIIRCROHOCHOC = 1;
   public static final byte OIRCOCOORHOHIHHCOIRCCHHHOCCOII = 2;
   public static final byte OICRROIHCROHORCIROHOOOHOOOHOCC = 3;
   public static final byte IOHOCRRRHIHCCOHOORCRHRCIICHOIH = 4;
   public static final byte CIOCIIOIHRCOIRIHHHRCCRHRIRIIHI = 5;
   public static final byte OROOCRHCOIHRCHHRRRCHOOIHOIOOIC = 6;
   public static final byte RCHROCIOOIRHRROOOOOHRRICHHCOIO = 7;
   public static final byte OOHCOHHRCICOHOICHHOOOCHOCHIRCO = 8;
   public static final byte HICOIRORCCHOHORICRRHHOCIRORIOR = 9;
   public static final byte IIOIHIHRHIRHHRIOROCRCIICICRRRO = 10;
   public static final byte CRIIROIHOOHIROOOOCIHRCORIRORRI = 10;
   public static final byte HRHORORIIIHICHOIROCROHIOOCCHOO = 11;
   public static final byte ROCRHHHCHIHCHHOIOHHROHCIOOORRC = 12;
   public static final byte CRICHHHIOHORIRRRRCOCCIOHOCHOOI = 13;
   public static final byte IOCCCROHOOHCOHIHRCCIROOHCIRHCR = 14;
   public static final byte OORHOIICCCHIRIHHCOOCROHRCHRHRI = 15;
   public static final byte HHHIOHIHHIRCIOHHOOIROHIOCCIRIO = 16;
   public static final byte RRRRCIRRHIRRHIHOCIIRCCCORCOIHI = 17;
   public static final byte COCCICIRRICCRIOICCRICIIOIOIIIR = 17;
   public static final byte CIHICHRHIROICHRRRCCORIICOICHIH = 18;
   public static final byte RCCOCOCHIHOIRRHRICOCOIRIIRCHIR = 19;
   public static final byte RHOHRIRIOHRRRHOHORIRIHORRCHRRR = 19;
   public static final byte CHCRRICICHOOOCRIOHOCCOOCOICCOI = 20;
   public static final byte HHHOIHRCCRRCCRCIOHIHRCHCOOOHIH = 21;
   public static final byte ORORORRICRHHOOIHHOCOOCIIOHOOII = 22;
   public static final byte OCOOOROIOIHRRHCRIHCIRCHROCHIRH = 23;
   public static final byte RHIIHHRICCOOCORRCOHHHCCRCICCRR = 24;
   public static final byte OHCOORCHHOHHRHHCICRCCIICICRHRH = 25;
   public static final byte RIHICHIOCRRIHCHHIIIHRRHOICCCIR = 26;
   public static final byte IRRIIRHRHCOOHRCOCHIICHICHIIOIR = 27;
   public static final byte ROIIIRIOCCIRRRRROIHIHHHHOHIIIR = 28;
   public static final byte RIOCOCICIHRCHIOHHHIHCRCIIHCHRI = 29;
   public static final byte RRCCOCOORCICHROOICHCROIHRCIOCR = 30;
   public static final byte ORRCOCCRIHHCCCIRIRRHCOCIHIRHHR = 31;
   public static final byte RICORCCCRCHHHRIRCIRRCOHOOHICRH = 32;
   public static final byte RRIHIHHICICOIHCROOORCIRIOICOHI = 32;
   public static final byte CHIHROHOHIICCIRCCIIHOOOIHOIRHI = 127;
   public static final char HROCORRICCRHHOOOIOHHRCCIOHHRCR = '\u0000';
   public static final char ICCCCCORICROOCRCRCOICIRIOICOOH = '\u007f';
   private static final char CCHRHRIOOORCOCHIIORRICHOOOHRHI = ' ';

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   }

   public static String toLowerCase(String var0) {
      int var1 = var0.length();

      for (int var2 = 0; var2 < var1; var2++) {
         if (isUpperCase(var0.charAt(var2))) {
            char[] var3 = var0.toCharArray();

            while (var2 < var1) {
               char var4 = var3[var2];
               if (isUpperCase(var4)) {
                  var3[var2] = (char)(var4 ^ 32);
               }

               var2++;
            }

            return String.valueOf(var3);
         }
      }

      return var0;
   }

   public static String toLowerCase(CharSequence var0) {
      if (var0 instanceof String) {
         return toLowerCase((String)var0);
      }

      char[] var1 = new char[var0.length()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = toLowerCase(var0.charAt(var2));
      }

      return String.valueOf(var1);
   }

   public static char toLowerCase(char var0) {
      return isUpperCase(var0) ? (char)(var0 ^ 32) : var0;
   }

   public static String toUpperCase(String var0) {
      int var1 = var0.length();

      for (int var2 = 0; var2 < var1; var2++) {
         if (isLowerCase(var0.charAt(var2))) {
            char[] var3 = var0.toCharArray();

            while (var2 < var1) {
               char var4 = var3[var2];
               if (isLowerCase(var4)) {
                  var3[var2] = (char)(var4 ^ 32);
               }

               var2++;
            }

            return String.valueOf(var3);
         }
      }

      return var0;
   }

   public static String toUpperCase(CharSequence var0) {
      if (var0 instanceof String) {
         return toUpperCase((String)var0);
      }

      char[] var1 = new char[var0.length()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = toUpperCase(var0.charAt(var2));
      }

      return String.valueOf(var1);
   }

   public static char toUpperCase(char var0) {
      return isLowerCase(var0) ? (char)(var0 ^ 32) : var0;
   }

   public static boolean isLowerCase(char var0) {
      return var0 >= 'a' && var0 <= 'z';
   }

   public static boolean isUpperCase(char var0) {
      return var0 >= 'A' && var0 <= 'Z';
   }

   public static String truncate(CharSequence var0, int var1, String var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      int var3 = var1 - var2.length();
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var3 >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", var1, var2.length());
      if (var0.length() <= var1) {
         String var4 = var0.toString();
         if (var4.length() <= var1) {
            return var4;
         }

         var0 = var4;
      }

      return new StringBuilder(var1).append(var0, 0, var3).append(var2).toString();
   }

   public static boolean equalsIgnoreCase(CharSequence var0, CharSequence var1) {
      int var2 = var0.length();
      if (var0 == var1) {
         return true;
      }

      if (var2 != var1.length()) {
         return false;
      }

      for (int var3 = 0; var3 < var2; var3++) {
         char var4 = var0.charAt(var3);
         char var5 = var1.charAt(var3);
         if (var4 != var5) {
            int var6 = getAlphaIndex(var4);
            if (var6 >= 26 || var6 != getAlphaIndex(var5)) {
               return false;
            }
         }
      }

      return true;
   }

   private static int getAlphaIndex(char var0) {
      return (char)((var0 | 32) - 97);
   }
}
