package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI extends Reader {
   protected static final int ORROORRCIORORORCRCROHHRIHROCHH = 1114111;
   protected static final char RCIIRCIOHIROCCCHOICHIOHHRHHIRH = '\u0000';
   protected final HRCHROOHRIHCRCRHRIIROCIRHOIRHH IRRIIHRRCHRRHROCOOHCHOIRRRRRHO;
   protected InputStream OIHIIRHOROCCRCORRHRCIRRRCCRCRO;
   protected byte[] ORCOHCCOIHCOOIRIRHRRCORCCOHOOR;
   protected int OOROCRRIOCOCICHICIHIHHICOHCCHR;
   protected int COCORRIOCRHOCIOIHIHOROCHHHOOHC;
   protected final boolean CIRHIIIORHRIIOHOCRRIIHROOOROHO;
   protected char RICCHOOORHOHRHCRHOROHHOOCIIROI = 0;
   protected int RRRIOOOOOCCIIOCRIIORRIOIIHCIOC;
   protected int RORRRCRIHIHRRHRIOHOIHRCICHHROI;
   protected final boolean IOIRCHHCROHRCCHRIHIRHCRROORRRI;
   protected char[] HIHRORCRCICIOCROOICIOHOORHIHHI;

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, InputStream var2, byte[] var3, int var4, int var5, boolean var6) {
      this.IRRIIHRRCHRRHROCOOHCHOIRRRRRHO = var1;
      this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO = var2;
      this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR = var3;
      this.OOROCRRIOCOCICHICIHIHHICOHCCHR = var4;
      this.COCORRIOCRHOCIOIHIHOROCHHHOOHC = var5;
      this.CIRHIIIORHRIIOHOCRRIIHROOOROHO = var6;
      this.IOIRCHHCROHRCCHRIHIRHCRROORRRI = var2 != null;
   }

   @Override
   public void close() {
      InputStream var1 = this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO;
      if (var1 != null) {
         this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO = null;
         this.IHCROHHCCROIHOOCRCROOHRCHIOHCO();
         var1.close();
      }
   }

   @Override
   public int read() {
      if (this.HIHRORCRCICIOCROOICIOHOORHIHHI == null) {
         this.HIHRORCRCICIOCROOICIOHOORHIHHI = new char[1];
      }

      return this.read(this.HIHRORCRCICIOCROOICIOHOORHIHHI, 0, 1) < 1 ? -1 : this.HIHRORCRCICIOCROOICIOHOORHIHHI[0];
   }

   @Override
   public int read(char[] var1, int var2, int var3) {
      if (this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR == null) {
         return -1;
      }

      if (var3 < 1) {
         return var3;
      }

      if (var2 < 0 || var2 + var3 > var1.length) {
         this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1, var2, var3);
      }

      int var4 = var2;
      int var5 = var3 + var2;
      if (this.RICCHOOORHOHRHCRHOROHHOOCIIROI != 0) {
         var1[var4++] = this.RICCHOOORHOHRHCRHOROHHOOCIIROI;
         this.RICCHOOORHOHRHCRHOROHHOOCIIROI = 0;
      } else {
         int var6 = this.COCORRIOCRHOCIOIHIHOROCHHHOOHC - this.OOROCRRIOCOCICHICIHIHHICOHCCHR;
         if (var6 < 4 && !this.OIHIRIHHROCIHCCOROROIRIOHHIHHR(var6)) {
            if (var6 == 0) {
               return -1;
            }

            this.IHHCCRIROCRCRROCCRIHCCHOOOOIRC(this.COCORRIOCRHOCIOIHIHOROCHHHOOHC - this.OOROCRRIOCOCICHICIHIHHICOHCCHR, 4);
         }
      }

      int var11 = this.COCORRIOCRHOCIOIHIHOROCHHHOOHC - 4;

      while (var4 < var5 && this.OOROCRRIOCOCICHICIHIHHICOHCCHR <= var11) {
         int var7 = this.OOROCRRIOCOCICHICIHIHHICOHCCHR;
         int var8;
         int var9;
         if (this.CIRHIIIORHRIIOHOCRRIIHROOOROHO) {
            var8 = this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR[var7] << 8 | this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR[var7 + 1] & 255;
            var9 = (this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR[var7 + 2] & 255) << 8 | this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR[var7 + 3] & 255;
         } else {
            var9 = this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR[var7] & 255 | (this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR[var7 + 1] & 255) << 8;
            var8 = this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR[var7 + 2] & 255 | this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR[var7 + 3] << 8;
         }

         this.OOROCRRIOCOCICHICIHIHHICOHCCHR += 4;
         if (var8 != 0) {
            var8 &= 65535;
            int var10 = var8 - 1 << 16 | var9;
            if (var8 > 16) {
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var10, var4 - var2, String.format(" (above 0x%08x)", 1114111));
            }

            var1[var4++] = (char)(55296 + (var10 >> 10));
            var9 = 56320 | var10 & 1023;
            if (var4 >= var5) {
               this.RICCHOOORHOHRHCRHOROHHOOCIIROI = (char)var10;
               break;
            }
         }

         var1[var4++] = (char)var9;
      }

      int var12 = var4 - var2;
      this.RRRIOOOOOCCIIOCRIIORRIOIIHCIOC += var12;
      return var12;
   }

   private void IHHCCRIROCRCRROCCRIHCCHOOOOIRC(int var1, int var2) {
      int var3 = this.RORRRCRIHIHRRHRIOHOIHRCICHHROI + var1;
      int var4 = this.RRRIOOOOOCCIIOCRIIORRIOIIHCIOC;
      throw new CharConversionException(
         "Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + var1 + ", needed " + var2 + ", at char #" + var4 + ", byte #" + var3 + ")"
      );
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, int var2, String var3) {
      int var4 = this.RORRRCRIHIHRRHRIOHOIHRCICHHROI + this.OOROCRRIOCOCICHICIHIHHICOHCCHR - 1;
      int var5 = this.RRRIOOOOOCCIIOCRIIORRIOIIHCIOC + var2;
      throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(var1) + var3 + " at char #" + var5 + ", byte #" + var4 + ")");
   }

   private boolean OIHIRIHHROCIHCCOROROIRIOHHIHHR(int var1) {
      if (this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO != null && this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR != null) {
         this.RORRRCRIHIHRRHRIOHOIHRCICHHROI = this.RORRRCRIHIHRRHRIOHOIHRCICHHROI + (this.COCORRIOCRHOCIOIHIHOROCHHHOOHC - var1);
         if (var1 > 0) {
            if (this.OOROCRRIOCOCICHICIHIHHICOHCCHR > 0) {
               System.arraycopy(this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR, this.OOROCRRIOCOCICHICIHIHHICOHCCHR, this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR, 0, var1);
               this.OOROCRRIOCOCICHICIHIHHICOHCCHR = 0;
            }

            this.COCORRIOCRHOCIOIHIHOROCHHHOOHC = var1;
         } else {
            this.OOROCRRIOCOCICHICIHIHHICOHCCHR = 0;
            int var2 = this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO.read(this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR);
            if (var2 < 1) {
               this.COCORRIOCRHOCIOIHIHOROCHHHOOHC = 0;
               if (var2 < 0) {
                  if (this.IOIRCHHCROHRCCHRIHIRHCRROORRRI) {
                     this.IHCROHHCCROIHOOCRCROOHRCHIOHCO();
                  }

                  return false;
               }

               this.RRRROHOHHHCIHCCOCIOIIOHCCIRICC();
            }

            this.COCORRIOCRHOCIOIHIHOROCHHHOOHC = var2;
         }

         while (this.COCORRIOCRHOCIOIHIHOROCHHHOOHC < 4) {
            int var3 = this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO
               .read(
                  this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR,
                  this.COCORRIOCRHOCIOIHIHOROCHHHOOHC,
                  this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR.length - this.COCORRIOCRHOCIOIHIHOROCHHHOOHC
               );
            if (var3 < 1) {
               if (var3 < 0) {
                  if (this.IOIRCHHCROHRCCHRIHIRHCRROORRRI) {
                     this.IHCROHHCCROIHOOCRCROOHRCHIOHCO();
                  }

                  this.IHHCCRIROCRCRROCCRIHCCHOOOOIRC(this.COCORRIOCRHOCIOIHIHOROCHHHOOHC, 4);
               }

               this.RRRROHOHHHCIHCCOCIOIIOHCCIRICC();
            }

            this.COCORRIOCRHOCIOIHIHOROCHHHOOHC += var3;
         }

         return true;
      } else {
         return false;
      }
   }

   private void IHCROHHCCROIHOOCRCROOHRCHIOHCO() {
      byte[] var1 = this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR;
      if (var1 != null) {
         this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR = null;
         if (this.IRRIIHRRCHRRHROCOOHCHOIRRRRRHO != null) {
            this.IRRIIHRRCHRRHROCOOHCHOIRRRRRHO.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(var1);
         }
      }
   }

   private void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(char[] var1, int var2, int var3) {
      throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", var2, var3, var1.length));
   }

   private void RRRROHOHHHCIHCCOCIOIIOHCCIRICC() {
      throw new IOException("Strange I/O stream, returned 0 bytes on read");
   }
}
