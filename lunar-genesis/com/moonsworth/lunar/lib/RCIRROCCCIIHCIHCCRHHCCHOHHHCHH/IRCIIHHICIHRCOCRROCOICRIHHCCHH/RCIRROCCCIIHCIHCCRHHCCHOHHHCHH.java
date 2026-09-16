package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.util.Arrays;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Serializable {
   private static final int HHRRRCIRHHIIROHCRICCCRCIRHIHII = 32;
   private static final long HIHIICOHRCROOICHOHRRROCCRROCCR = 1L;
   protected static final char CICOICHCIRHIRCRHOIRHHRHHHHOICH = '\u0000';
   public static final int RCCCOOIHIHROCCIHHCCIICOCIOOOCO = -1;
   public static final int HRRIIHCIRHOICIIRHHCIRORRCOORHR = -2;
   private final transient int[] CHRIOHOCIHRHHOIRIHHHRIOCCICHHO = new int[128];
   private final transient char[] RCOOOCHCRIHRHHOOHCCICOHHIHIHII = new char[64];
   private final transient byte[] RICCRICOHHCCHIOCIOOHRCOHIHHOIC = new byte[64];
   final String CCHHRCCROCROHIORROHORORICIHIII;
   private final char HOIHCRROOIIHCOOCRHHRHOHIRICCRC;
   private final int OOCOIOORHHHCRCRCRCIOHROOHOHHOO;
   private final boolean RCIIHOIHCCRCHIRHICROOIOROHIOHI;
   private final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCHRROCIHCRIIIOIHHIORHCICOHCHC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, boolean var3, char var4, int var5) {
      this.CCHHRCCROCROHIORROHORORICIHIII = var1;
      this.RCIIHOIHCCRCHIRHICROOIOROHIOHI = var3;
      this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC = var4;
      this.OOCOIOORHHHCRCRCRCIOHROOHOHHOO = var5;
      int var6 = var2.length();
      if (var6 != 64) {
         throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + var6 + ")");
      }

      var2.getChars(0, var6, this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII, 0);
      Arrays.fill(this.CHRIOHOCIHRHHOIRIHHHRIOCCICHHO, -1);
      int var7 = 0;

      while (var7 < var6) {
         char var8 = this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var7];
         this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var7] = (byte)var8;
         this.CHRIOHOCIHRHHOIRIHHHRIOCCICHHO[var8] = var7++;
      }

      if (var3) {
         this.CHRIOHOCIHRHHOIRIHHHRIOCCICHHO[var4] = -2;
      }

      this.CCHRROCIHCRIIIOIHHIORHCICOHCHC = var3
         ? com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PADDING_REQUIRED
         : com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PADDING_FORBIDDEN;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, String var2, int var3
   ) {
      this(var1, var2, var1.RCIIHOIHCCRCHIRHICROOIOROHIOHI, var1.HOIHCRROOIIHCOOCRHHRHOHIRICCRC, var3);
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      String var2,
      boolean var3,
      char var4,
      int var5
   ) {
      this(var1, var2, var3, var4, var1.CCHRROCIHCRIIIOIHHIORHCICOHCHC, var5);
   }

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      String var2,
      boolean var3,
      char var4,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5,
      int var6
   ) {
      this.CCHHRCCROCROHIORROHORORICIHIII = var2;
      byte[] var7 = var1.RICCRICOHHCCHIOCIOOHRCOHIHHOIC;
      System.arraycopy(var7, 0, this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC, 0, var7.length);
      char[] var8 = var1.RCOOOCHCRIHRHHOOHCCICOHHIHIHII;
      System.arraycopy(var8, 0, this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII, 0, var8.length);
      int[] var9 = var1.CHRIOHOCIHRHHOIRIHHHRIOCCICHHO;
      System.arraycopy(var9, 0, this.CHRIOHOCIHRHHOIRIHHHRIOCCICHHO, 0, var9.length);
      this.RCIIHOIHCCRCHIRHICROOIOROHIOHI = var3;
      this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC = var4;
      this.OOCOIOORHHHCRCRCRCIOHROOHOHHOO = var6;
      this.CCHRROCIHCRIIIOIHHIORHCICOHCHC = var5;
   }

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      this(
         var1,
         var1.CCHHRCCROCROHIORROHORORICIHIII,
         var1.RCIIHOIHCCRCHIRHICROOIOROHIOHI,
         var1.HOIHCRROOIIHCOOCRHHRHOHIRICCRC,
         var2,
         var1.OOCOIOORHHHCRCRCRCIOHROOHOHHOO
      );
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICROOORIROCOIIRHIHIROHICIIRRHC() {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PADDING_ALLOWED
      );
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIIROORIICIROHOOOIIOCORIORICRC() {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PADDING_REQUIRED
      );
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHIOOCHOCRRCCCORCOHIHCIIOORIHR() {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PADDING_FORBIDDEN
      );
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      return var1 == this.CCHRROCIHCRIIIOIHHIORHCICOHCHC
         ? this
         : new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCHHCROIOCRIIRICHRRIIHCHCOHHOI(
      boolean var1
   ) {
      return var1 == this.RCIIHOIHCCRCHIRHICROOIOROHIOHI
         ? this
         : new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this, this.CCHHRCCROCROHIORROHORORICIHIII, var1, this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC, this.OOCOIOORHHHCRCRCRCIOHROOHOHHOO
         );
   }

   protected Object readResolve() {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCRIHICRIIROCHHHHCROCRCHHRIIOI(
         this.CCHHRCCROCROHIORROHORORICIHIII
      );
      return this.RCIIHOIHCCRCHIRHICROOIOROHIOHI == var1.RCIIHOIHCCRCHIRHICROOIOROHIOHI
            && this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC == var1.HOIHCRROOIIHCOOCRHHRHOHIRICCRC
            && this.CCHRROCIHCRIIIOIHHIORHCICOHCHC == var1.CCHRROCIHCRIIIOIHHIORHCICOHCHC
            && this.OOCOIOORHHHCRCRCRCIOHROOHOHHOO == var1.OOCOIOORHHHCRCRCRCIOHROOHOHHOO
            && this.RCIIHOIHCCRCHIRHICROOIOROHIOHI == var1.RCIIHOIHCCRCHIRHICROOIOROHIOHI
         ? var1
         : new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1,
            this.CCHHRCCROCROHIORROHORORICIHIII,
            this.RCIIHOIHCCRCHIRHICROOIOROHIOHI,
            this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC,
            this.CCHRROCIHCRIIIOIHHIORHCICOHCHC,
            this.OOCOIOORHHHCRCRCRCIOHROOHOHHOO
         );
   }

   public String getName() {
      return this.CCHHRCCROCROHIORROHORORICIHIII;
   }

   public boolean OICHHICOOCOCORCORCIOCICIHOIHIC() {
      return this.RCIIHOIHCCRCHIRHICROOIOROHIOHI;
   }

   public boolean ICICHRIRCHHCRCIRHIOCOCCIRCHRRI() {
      return this.CCHRROCIHCRIIIOIHHIORHCICOHCHC
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PADDING_REQUIRED;
   }

   public boolean OORICOOHRHICCRCRHOIHHHICORCRCH() {
      return this.CCHRROCIHCRIIIOIHHIORHCICOHCHC
         != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PADDING_FORBIDDEN;
   }

   public boolean HHRIICOIOORCHCOIICOOIHIRHHICRI(char var1) {
      return var1 == this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC;
   }

   public boolean RROHIRRCRIICIHCRCHROHCHCOIHRHC(int var1) {
      return var1 == this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC;
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHHCRICROCIHROHOORICCCOOROIOOO() {
      return this.CCHRROCIHCRIIIOIHHIORHCICOHCHC;
   }

   public char OIRIOIHRORCHOIORICRCRRICHHCOCR() {
      return this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC;
   }

   public byte IIRRRCHORHRHOCROCOOORHHORRHIHO() {
      return (byte)this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC;
   }

   public int RCCOCICOHIRHOHHIOIROOHOCHIIOHC() {
      return this.OOCOIOORHHHCRCRCRCIOHROOHOHHOO;
   }

   public int ORHIOICIOCRRHOOCOHRORIHICHRCRR(char var1) {
      char var2 = var1;
      return var2 <= 127 ? this.CHRIOHOCIHRHHOIRIHHHRIOCCICHHO[var2] : -1;
   }

   public int RORIRHOCHROROOOOICOICHOCCRCCOH(int var1) {
      return var1 <= 127 ? this.CHRIOHOCIHRHHOIRIHHHRIOCCICHHO[var1] : -1;
   }

   public int CORCOCICIRIOHROHROIIOOHICCHCRR(byte var1) {
      byte var2 = var1;
      return var2 < 0 ? -1 : this.CHRIOHOCIHRHHOIRIHHHRIOCCICHHO[var2];
   }

   public char ORHOHHHCOOCCOHIHIHOIOOOOOHOORI(int var1) {
      return this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var1];
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, char[] var2, int var3) {
      var2[var3++] = this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var1 >> 18 & 63];
      var2[var3++] = this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var1 >> 12 & 63];
      var2[var3++] = this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var1 >> 6 & 63];
      var2[var3++] = this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var1 & 63];
      return var3;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(StringBuilder var1, int var2) {
      var1.append(this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var2 >> 18 & 63]);
      var1.append(this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var2 >> 12 & 63]);
      var1.append(this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var2 >> 6 & 63]);
      var1.append(this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var2 & 63]);
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, char[] var3, int var4) {
      var3[var4++] = this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var1 >> 18 & 63];
      var3[var4++] = this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var1 >> 12 & 63];
      if (this.OICHHICOOCOCORCORCIOCICIHOIHIC()) {
         var3[var4++] = var2 == 2 ? this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var1 >> 6 & 63] : this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC;
         var3[var4++] = this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC;
      } else if (var2 == 2) {
         var3[var4++] = this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var1 >> 6 & 63];
      }

      return var4;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StringBuilder var1, int var2, int var3) {
      var1.append(this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var2 >> 18 & 63]);
      var1.append(this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var2 >> 12 & 63]);
      if (this.OICHHICOOCOCORCORCIOCICIHOIHIC()) {
         var1.append(var3 == 2 ? this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var2 >> 6 & 63] : this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC);
         var1.append(this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC);
      } else if (var3 == 2) {
         var1.append(this.RCOOOCHCRIHRHHOOHCCICOHHIHIHII[var2 >> 6 & 63]);
      }
   }

   public byte CRCOHRCICRHCOOCIOHOOICCRHHICRC(int var1) {
      return this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var1];
   }

   public int IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, byte[] var2, int var3) {
      var2[var3++] = this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var1 >> 18 & 63];
      var2[var3++] = this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var1 >> 12 & 63];
      var2[var3++] = this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var1 >> 6 & 63];
      var2[var3++] = this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var1 & 63];
      return var3;
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, byte[] var3, int var4) {
      var3[var4++] = this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var1 >> 18 & 63];
      var3[var4++] = this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var1 >> 12 & 63];
      if (this.OICHHICOOCOCORCORCIOCICIHOIHIC()) {
         byte var5 = (byte)this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC;
         var3[var4++] = var2 == 2 ? this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var1 >> 6 & 63] : var5;
         var3[var4++] = var5;
      } else if (var2 == 2) {
         var3[var4++] = this.RICCRICOHHCCHIOCIOOHRCOHIHHOIC[var1 >> 6 & 63];
      }

      return var4;
   }

   public String encode(byte[] var1) {
      return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, false);
   }

   public String HHCCIRHCCCIIRHCROHIORHIRHHIORH(byte[] var1, boolean var2) {
      int var3 = var1.length;
      StringBuilder var4 = new StringBuilder(var3 + (var3 >> 2) + (var3 >> 3));
      if (var2) {
         var4.append('"');
      }

      int var5 = this.RCCOCICOHIRHOHHIOIROOHOCHIIOHC() >> 2;
      int var6 = 0;
      int var7 = var3 - 3;

      while (var6 <= var7) {
         int var8 = var1[var6++] << 8;
         var8 |= var1[var6++] & 255;
         var8 = var8 << 8 | var1[var6++] & 255;
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4, var8);
         if (--var5 <= 0) {
            var4.append('\\');
            var4.append('n');
            var5 = this.RCCOCICOHIRHOHHIOIROOHOCHIIOHC() >> 2;
         }
      }

      int var16 = var3 - var6;
      if (var16 > 0) {
         int var9 = var1[var6++] << 16;
         if (var16 == 2) {
            var9 |= (var1[var6++] & 255) << 8;
         }

         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var9, var16);
      }

      if (var2) {
         var4.append('"');
      }

      return var4.toString();
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, boolean var2, String var3) {
      int var4 = var1.length;
      StringBuilder var5 = new StringBuilder(var4 + (var4 >> 2) + (var4 >> 3));
      if (var2) {
         var5.append('"');
      }

      int var6 = this.RCCOCICOHIRHOHHIOIROOHOCHIIOHC() >> 2;
      int var7 = 0;
      int var8 = var4 - 3;

      while (var7 <= var8) {
         int var9 = var1[var7++] << 8;
         var9 |= var1[var7++] & 255;
         var9 = var9 << 8 | var1[var7++] & 255;
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, var9);
         if (--var6 <= 0) {
            var5.append(var3);
            var6 = this.RCCOCICOHIRHOHHIOIROOHOCHIIOHC() >> 2;
         }
      }

      int var17 = var4 - var7;
      if (var17 > 0) {
         int var10 = var1[var7++] << 16;
         if (var17 == 2) {
            var10 |= (var1[var7++] & 255) << 8;
         }

         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var10, var17);
      }

      if (var2) {
         var5.append('"');
      }

      return var5.toString();
   }

   public byte[] decode(String var1) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      return var2.toByteArray();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      int var3 = 0;
      int var4 = var1.length();

      while (var3 < var4) {
         char var5 = var1.charAt(var3++);
         if (var5 > ' ') {
            int var6 = this.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var5);
            if (var6 < 0) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, 0, null);
            }

            int var7 = var6;
            if (var3 >= var4) {
               this.HORHCIHICIRRCOHRHRIRCICCIHCRIR();
            }

            var5 = var1.charAt(var3++);
            var6 = this.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var5);
            if (var6 < 0) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, 1, null);
            }

            var7 = var7 << 6 | var6;
            if (var3 >= var4) {
               if (!this.ICICHRIRCHHCRCIRHIOCOCCIRCHRRI()) {
                  var7 >>= 4;
                  var2.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var7);
                  break;
               }

               this.HORHCIHICIRRCOHRHRIRCICCIHCRIR();
            }

            var5 = var1.charAt(var3++);
            var6 = this.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var5);
            if (var6 < 0) {
               if (var6 != -2) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, 2, null);
               }

               if (!this.OORICOOHRHICCRCRHOIHHHICORCRCH()) {
                  this.HCHHIIIOHHOCICCOOIHCOORIOOHRHH();
               }

               if (var3 >= var4) {
                  this.HORHCIHICIRRCOHRHRIRCICCIHCRIR();
               }

               var5 = var1.charAt(var3++);
               if (!this.HHRIICOIOORCHCOIICOOIHIRHHICRI(var5)) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, 3, "expected padding character '" + this.OIRIOIHRORCHOIORICRCRRICHHCOCR() + "'");
               }

               var7 >>= 4;
               var2.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var7);
            } else {
               var7 = var7 << 6 | var6;
               if (var3 >= var4) {
                  if (!this.ICICHRIRCHHCRCIRHIOCOCCIRCHRRI()) {
                     var7 >>= 2;
                     var2.RROICHHOCHOHCHCOOHRHCICCHOHOIH(var7);
                     break;
                  }

                  this.HORHCIHICIRRCOHRHRIRCICCIHCRIR();
               }

               var5 = var1.charAt(var3++);
               var6 = this.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var5);
               if (var6 < 0) {
                  if (var6 != -2) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, 3, null);
                  }

                  if (!this.OORICOOHRHICCRCRHOIHHHICORCRCH()) {
                     this.HCHHIIIOHHOCICCOOIHCOORIOOHRHH();
                  }

                  var7 >>= 2;
                  var2.RROICHHOCHOHCHCOOHRHCICCHOHOIH(var7);
               } else {
                  var7 = var7 << 6 | var6;
                  var2.HCOOCIHCHIRCCOHROIRHIROHRIHIOC(var7);
               }
            }
         }
      }
   }

   @Override
   public String toString() {
      return this.CCHHRCCROCROHIORROHORORICIHIII;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 != null && var1.getClass() == this.getClass()) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         return var2.HOIHCRROOIIHCOOCRHHRHOHIRICCRC == this.HOIHCRROOIIHCOOCRHHRHOHIRICCRC
            && var2.OOCOIOORHHHCRCRCRCIOHROOHOHHOO == this.OOCOIOORHHHCRCRCRCIOHROOHOHHOO
            && var2.RCIIHOIHCCRCHIRHICROOIOROHIOHI == this.RCIIHOIHCCRCHIRHICROOIOROHIOHI
            && var2.CCHRROCIHCRIIIOIHHIORHCICOHCHC == this.CCHRROCIHCRIIIOIHHIORHCICOHCHC
            && this.CCHHRCCROCROHIORROHORORICIHIII.equals(var2.CCHHRCCROCROHIORROHORORICIHIII);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.CCHHRCCROCROHIORROHORORICIHIII.hashCode();
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char var1, int var2, String var3) {
      String var4;
      if (var1 <= ' ') {
         var4 = "Illegal white space character (code 0x"
            + Integer.toHexString(var1)
            + ") as character #"
            + (var2 + 1)
            + " of 4-char base64 unit: can only used between units";
      } else if (this.HHRIICOIOORCHCOIICOOIHIRHHICRI(var1)) {
         var4 = "Unexpected padding character ('"
            + this.OIRIOIHRORCHOIORICRCRRICHHCOCR()
            + "') as character #"
            + (var2 + 1)
            + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
      } else if (Character.isDefined(var1) && !Character.isISOControl(var1)) {
         var4 = "Illegal character '" + var1 + "' (code 0x" + Integer.toHexString(var1) + ") in base64 content";
      } else {
         var4 = "Illegal character (code 0x" + Integer.toHexString(var1) + ") in base64 content";
      }

      if (var3 != null) {
         var4 = var4 + ": " + var3;
      }

      throw new IllegalArgumentException(var4);
   }

   protected void HORHCIHICIRRCOHRHRIRCICCIHCRIR() {
      throw new IllegalArgumentException(this.IHOHHCCHHCIORCOCHHRROCRIIIHRII());
   }

   protected void HCHHIIIOHHOCICCOOIHCOORIOOHRHH() {
      throw new IllegalArgumentException(this.IOHOOCHIORHIHOIIRROHHOHHCOOOOH());
   }

   protected String IOHOOCHIORHIHOIIRROHHOHHCOOOOH() {
      return String.format(
         "Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured",
         this.getName()
      );
   }

   public String IHOHHCCHHCIORCOCHHRROCRIIIHRII() {
      return String.format(
         "Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured",
         this.getName(),
         this.OIRIOIHRORCHOIORICRCRRICHHCOCR()
      );
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      PADDING_FORBIDDEN,
      PADDING_REQUIRED,
      PADDING_ALLOWED;
   }
}
