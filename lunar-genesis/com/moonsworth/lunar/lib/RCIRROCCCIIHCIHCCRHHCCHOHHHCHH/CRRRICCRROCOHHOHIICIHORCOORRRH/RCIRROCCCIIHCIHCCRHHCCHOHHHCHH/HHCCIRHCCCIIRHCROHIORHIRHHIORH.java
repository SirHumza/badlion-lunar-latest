package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.ref.SoftReference;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends Reader {
   private static final int IHCCIHHICOCHHOCRCIHHRRHCHHOHHO = 8000;
   protected static final ThreadLocal<SoftReference<byte[][]>> HRIHCIROOCOHROHHRHRIHROIOIIIRC = new ThreadLocal<>();
   protected final byte[][] OOHICIORHHROHCHIORIRHHCHRRICOC;
   private InputStream ROIIOCRHRHHOOCRICROCIROCORIROC;
   private final boolean HRIOIRRRROOICICHCIOOIHICCICCHO;
   protected byte[] IHOICRRCHCCIHCHOHHRCRROHRCCIOC;
   protected int OOCCRCRROCIOCHHIHHCORIOHORRCCH;
   protected int HHOHOICCHOHCRCHIOOHHIRRCRCIIOC;
   protected int RRHROOIRHIRCHIIHHOICRORRRIIHHI = -1;
   int RRRIOOOOOCCIIOCRIIORRIOIIHCIOC = 0;
   int RORRRCRIHIHRRHRIOHOIHRCICHHROI = 0;
   private char[] OHIIRCRIRCIHCHHIOIHCCHICRRORHH = null;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(InputStream var1, boolean var2) {
      super(var1 == null ? new Object() : var1);
      this.ROIIOCRHRHHOOCRICROCIROCORIROC = var1;
      this.OOHICIORHHROHCHIORIRHHCHRRICOC = RHRICOROIRIHROCCCROHIHICCRHRHH();
      byte[] var3 = this.OOHICIORHHROHCHIORIRHHCHRRICOC[0];
      if (var3 == null) {
         var3 = new byte[8000];
      } else {
         this.OOHICIORHHROHCHIORIRHHCHRRICOC[0] = null;
      }

      this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC = var3;
      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = 0;
      this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC = 0;
      this.HRIOIRRRROOICICHCIOOIHICCICCHO = var2;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(byte[] var1, int var2, int var3, boolean var4) {
      super(new Object());
      this.ROIIOCRHRHHOOCRICROCIROCORIROC = null;
      this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC = var1;
      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var2;
      this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC = var2 + var3;
      this.HRIOIRRRROOICICHCIOOIHICCICCHO = var4;
      this.OOHICIORHHROHCHIORIRHHCHRRICOC = (byte[][])null;
   }

   private static byte[][] RHRICOROIRIHROCCCROHIHICCRHRHH() {
      byte[][] var0 = (byte[][])null;
      SoftReference var1 = HRIHCIROOCOHROHHRHRIHROIOIIIRC.get();
      if (var1 != null) {
         var0 = (byte[][])var1.get();
      }

      if (var0 == null) {
         var0 = new byte[1][];
         HRIHCIROOCOHROHHRHRIHROIOIIIRC.set(new SoftReference<>(var0));
      }

      return var0;
   }

   protected final boolean CRHRRRICHOCRCRCOIICOCRORCICHCH() {
      return this.OOHICIORHHROHCHIORIRHHCHRRICOC != null;
   }

   @Override
   public void close() {
      InputStream var1 = this.ROIIOCRHRHHOOCRICROCIROCORIROC;
      if (var1 != null) {
         this.ROIIOCRHRHHOOCRICROCIROCORIROC = null;
         if (this.HRIOIRRRROOICICHCIOOIHICCICCHO) {
            var1.close();
         }
      }

      this.HCROROCCCRCHOOHCHRHIROOROIIRIH();
   }

   @Override
   public int read() {
      if (this.OHIIRCRIRCIHCHHIOIHCCHICRRORHH == null) {
         this.OHIIRCRIRCIHCHHIOIHCCHICRRORHH = new char[1];
      }

      return this.read(this.OHIIRCRIRCIHCHHIOIHCCHICRRORHH, 0, 1) < 1 ? -1 : this.OHIIRCRIRCIHCHHIOIHCCHICRRORHH[0];
   }

   @Override
   public int read(char[] var1) {
      return this.read(var1, 0, var1.length);
   }

   @Override
   public int read(char[] var1, int var2, int var3) {
      if (this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC == null) {
         return -1;
      }

      var3 += var2;
      int var4 = var2;
      if (this.RRHROOIRHIRCHIIHHOICRORRRIIHHI >= 0) {
         var1[var4++] = (char)this.RRHROOIRHIRCHIIHHOICRORRRIIHHI;
         this.RRHROOIRHIRCHIIHHOICRORRRIIHHI = -1;
         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH >= this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
            this.RRRIOOOOOCCIIOCRIIORRIOIIHCIOC++;
            return 1;
         }
      } else {
         int var5 = this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC - this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
         if (var5 < 4
            && (var5 < 1 || this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC[this.OOCCRCRROCIOCHHIHHCORIOHORRCCH] < 0)
            && !this.OIHIRIHHROCIHCCOROROIRIOHHIHHR(var5)) {
            return -1;
         }
      }

      byte[] var13 = this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC;
      int var6 = this.OOCCRCRROCIOCHHIHHCORIOHORRCCH;
      int var7 = this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC;

      while (var4 < var3) {
         byte var8;
         var8 = var13[var6++];
         label80:
         if (var8 >= 0) {
            var1[var4++] = (char)var8;
            int var9 = var3 - var4;
            int var10 = var7 - var6;

            for (int var11 = var6 + (var10 < var9 ? var10 : var9); var6 < var11; var1[var4++] = (char)var8) {
               var8 = var13[var6++];
               if (var8 < 0) {
                  break label80;
               }
            }
            break;
         }

         byte var18;
         if ((var8 & 224) == 192) {
            var8 &= 31;
            var18 = 1;
         } else if ((var8 & 240) == 224) {
            var8 &= 15;
            var18 = 2;
         } else if ((var8 & 248) == 240) {
            var8 &= 15;
            var18 = 3;
         } else {
            this.OCCCCRRCROIRIHRROHCHCHORCOCICC(var8 & 0xFF, var4 - var2);
            var18 = 1;
         }

         if (var7 - var6 < var18) {
            var6--;
            break;
         }

         byte var19 = var13[var6++];
         if ((var19 & 192) != 128) {
            this.CIIIIIHIHRHCOOHOIORCHHCORHRCCO(var19 & 255, var4 - var2);
         }

         var8 = var8 << 6 | var19 & 63;
         if (var18 > 1) {
            var19 = var13[var6++];
            if ((var19 & 192) != 128) {
               this.CIIIIIHIHRHCOOHOIORCHHCORHRCCO(var19 & 255, var4 - var2);
            }

            var8 = var8 << 6 | var19 & 63;
            if (var18 > 2) {
               var19 = var13[var6++];
               if ((var19 & 192) != 128) {
                  this.CIIIIIHIHRHCOOHOIORCHHCORHRCCO(var19 & 255, var4 - var2);
               }

               var8 = var8 << 6 | var19 & 63;
               var8 -= 65536;
               var1[var4++] = (char)(55296 + (var8 >> 10));
               var8 = 56320 | var8 & 1023;
               if (var4 >= var3) {
                  this.RRHROOIRHIRCHIIHHOICRORRRIIHHI = var8;
                  break;
               }
            }
         }

         var1[var4++] = (char)var8;
         if (var6 >= var7) {
            break;
         }
      }

      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = var6;
      int var17 = var4 - var2;
      this.RRRIOOOOOCCIIOCRIIORRIOIIHCIOC += var17;
      return var17;
   }

   protected final InputStream ORRCCIRCHHOCROOCOOCCOCOORCCCCC() {
      return this.ROIIOCRHRHHOOCRICROCIROCORIROC;
   }

   protected final int HIOCHCHCHRIOOORHIHIRRCCHICOORO() {
      this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = 0;
      this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC = 0;
      if (this.ROIIOCRHRHHOOCRICROCIROCORIROC != null) {
         int var1 = this.ROIIOCRHRHHOOCRICROCIROCORIROC.read(this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC, 0, this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC.length);
         if (var1 > 0) {
            this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC = var1;
         }

         return var1;
      } else {
         return -1;
      }
   }

   protected final int RHROCOOCHCCCRCRRRRHOCRRHIHRROR(int var1) {
      if (this.ROIIOCRHRHHOOCRICROCIROCORIROC != null) {
         int var2 = this.ROIIOCRHRHHOOCRICROCIROCORIROC.read(this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC, var1, this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC.length - var1);
         if (var2 > 0) {
            this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC += var2;
         }

         return var2;
      } else {
         return -1;
      }
   }

   public final void HCROROCCCRCHOOHCHRHIROOROIIRIH() {
      if (this.OOHICIORHHROHCHIORIRHHCHRRICOC != null) {
         byte[] var1 = this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC;
         if (var1 != null) {
            this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC = null;
            this.OOHICIORHHROHCHIORIRHHCHRRICOC[0] = var1;
         }
      }
   }

   private void OCCCCRRCROIRIHRROHCHCHORCOCICC(int var1, int var2) {
      int var3 = this.RORRRCRIHIHRRHRIOHOIHRCICHHROI + this.OOCCRCRROCIOCHHIHHCORIOHORRCCH - 1;
      int var4 = this.RRRIOOOOOCCIIOCRIIORRIOIIHCIOC + var2 + 1;
      throw new CharConversionException("Invalid UTF-8 start byte 0x" + Integer.toHexString(var1) + " (at char #" + var4 + ", byte #" + var3 + ")");
   }

   private void CIIIIIHIHRHCOOHOIORCHHCORHRCCO(int var1, int var2) {
      int var3 = this.RORRRCRIHIHRRHRIOHOIHRCICHHROI + this.OOCCRCRROCIOCHHIHHCORIOHORRCCH - 1;
      int var4 = this.RRRIOOOOOCCIIOCRIIORRIOIIHCIOC + var2;
      throw new CharConversionException("Invalid UTF-8 middle byte 0x" + Integer.toHexString(var1) + " (at char #" + var4 + ", byte #" + var3 + ")");
   }

   private void IHHCCRIROCRCRROCCRIHCCHOOOOIRC(int var1, int var2) {
      int var3 = this.RORRRCRIHIHRRHRIOHOIHRCICHHROI + var1;
      int var4 = this.RRRIOOOOOCCIIOCRIIORRIOIIHCIOC;
      throw new CharConversionException(
         "Unexpected EOF in the middle of a multi-byte char: got " + var1 + ", needed " + var2 + ", at char #" + var4 + ", byte #" + var3 + ")"
      );
   }

   private boolean OIHIRIHHROCIHCCOROROIRIOHHIHHR(int var1) {
      this.RORRRCRIHIHRRHRIOHOIHRCICHHROI = this.RORRRCRIHIHRRHRIOHOIHRCICHHROI + (this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC - var1);
      if (var1 > 0) {
         if (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH > 0) {
            if (!this.CRHRRRICHOCRCRCOIICOCRORCICHCH() && this.ROIIOCRHRHHOOCRICROCIROCORIROC == null) {
               throw new IOException(String.format("End-of-input after first %d byte(s) of a UTF-8 character: needed at least one more", var1));
            }

            for (int var2 = 0; var2 < var1; var2++) {
               this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC[var2] = this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC[this.OOCCRCRROCIOCHHIHHCORIOHORRCCH + var2];
            }

            this.OOCCRCRROCIOCHHIHHCORIOHORRCCH = 0;
            this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC = var1;
         }
      } else {
         int var5 = this.HIOCHCHCHRIOOORHIHIRRCCHICOORO();
         if (var5 < 1) {
            this.HCROROCCCRCHOOHCHRHIROOROIIRIH();
            if (var5 < 0) {
               return false;
            }

            this.RRRROHOHHHCIHCCOCIOIIOHCCIRICC();
         }
      }

      byte var6 = this.IHOICRRCHCCIHCHOHHRCRROHRCCIOC[this.OOCCRCRROCIOCHHIHHCORIOHORRCCH];
      if (var6 >= 0) {
         return true;
      }

      byte var3;
      if ((var6 & 224) == 192) {
         var3 = 2;
      } else if ((var6 & 240) == 224) {
         var3 = 3;
      } else {
         if ((var6 & 248) != 240) {
            return true;
         }

         var3 = 4;
      }

      while (this.OOCCRCRROCIOCHHIHHCORIOHORRCCH + var3 > this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC) {
         int var4 = this.RHROCOOCHCCCRCRRRRHOCRRHIHRROR(this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC);
         if (var4 < 1) {
            if (var4 < 0) {
               this.HCROROCCCRCHOOHCHRHIROOROIIRIH();
               this.IHHCCRIROCRCRROCCRIHCCHOOOOIRC(this.HHOHOICCHOHCRCHIOOHHIRRCRCIIOC, var3);
            }

            this.RRRROHOHHHCIHCCOCIOIIOHCCIRICC();
         }
      }

      return true;
   }

   protected void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(char[] var1, int var2, int var3) {
      throw new ArrayIndexOutOfBoundsException("read(buf," + var2 + "," + var3 + "), cbuf[" + var1.length + "]");
   }

   protected void RRRROHOHHHCIHCCOCIOIIOHCCIRICC() {
      throw new IOException("Strange I/O stream, returned 0 bytes on read");
   }
}
