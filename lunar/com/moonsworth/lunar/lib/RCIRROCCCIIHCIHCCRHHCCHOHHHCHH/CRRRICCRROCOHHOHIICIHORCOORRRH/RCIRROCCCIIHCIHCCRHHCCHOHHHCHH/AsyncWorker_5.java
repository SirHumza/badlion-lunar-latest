package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.ref.SoftReference;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH extends Writer {
   static final int HORCICCRIIROCOHHCROHHRCHCHRCRC = 55296;
   static final int CCCIHRIOOCRORIOORHOIIRORORCIII = 56319;
   static final int CHIHOIHCHRRRCIHORROHIRCHRRRORR = 56320;
   static final int OOOOIRORCICIRIORRHRHROCIOCCORH = 57343;
   private static final int RCRIROIOIHIRHRIOCOIRIIOOHIOCIR = 8000;
   protected static final ThreadLocal<SoftReference<byte[][]>> HIOCHIOHIOIORORCOROIRIHCIIORII = new ThreadLocal<>();
   protected final byte[][] CRROIICHRRCROICROICRICICIHOCRR;
   private OutputStream OOOHCORIICIICOROOCCCHICIIHCRRC;
   private byte[] HICHRIICOIIRCRCROHOHIRIIORHCHR;
   private final int RCHCHRIHIROCIIHRHCHCROOCCOOOCC;
   private int HRHHOCHOOIHORRIICOOIIOHHHHRCRI;
   int RRHROOIRHIRCHIIHHOICRORRRIIHHI = 0;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(OutputStream var1) {
      this.OOOHCORIICIICOROOCCCHICIIHCRRC = var1;
      this.CRROIICHRRCROICROICRICICIHOCRR = RHRICOROIRIHROCCCROHIHICCRHRHH();
      byte[] var2 = this.CRROIICHRRCROICROICRICICIHOCRR[0];
      if (var2 == null) {
         var2 = new byte[8000];
      } else {
         this.CRROIICHRRCROICROICRICICIHOCRR[0] = null;
      }

      this.HICHRIICOIIRCRCROHOHIRIIORHCHR = var2;
      this.RCHCHRIHIROCIIHRHCHCROOCCOOOCC = this.HICHRIICOIIRCRCROHOHIRIIORHCHR.length - 4;
      this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = 0;
   }

   private static byte[][] RHRICOROIRIHROCCCROHIHICCRHRHH() {
      byte[][] var0 = (byte[][])null;
      SoftReference var1 = HIOCHIOHIOIORORCOROIRIHCIIORII.get();
      if (var1 != null) {
         var0 = (byte[][])var1.get();
      }

      if (var0 == null) {
         var0 = new byte[1][];
         HIOCHIOHIOIORORCOROIRIHCIIORII.set(new SoftReference<>(var0));
      }

      return var0;
   }

   @Override
   public Writer append(char var1) {
      this.write(var1);
      return this;
   }

   @Override
   public void close() {
      if (this.OOOHCORIICIICOROOCCCHICIIHCRRC != null) {
         if (this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI > 0) {
            this.OOOHCORIICIICOROOCCCHICIIHCRRC.write(this.HICHRIICOIIRCRCROHOHIRIIORHCHR, 0, this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI);
            this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = 0;
         }

         OutputStream var1 = this.OOOHCORIICIICOROOCCCHICIIHCRRC;
         this.OOOHCORIICIICOROOCCCHICIIHCRRC = null;
         if (this.CRROIICHRRCROICROICRICICIHOCRR != null) {
            byte[] var2 = this.HICHRIICOIIRCRCROHOHIRIIORHCHR;
            if (var2 != null) {
               this.HICHRIICOIIRCRCROHOHIRIIORHCHR = null;
               this.CRROIICHRRCROICROICRICICIHOCRR[0] = var2;
            }
         }

         var1.close();
         int var3 = this.RRHROOIRHIRCHIIHHOICRORRRIIHHI;
         this.RRHROOIRHIRCHIIHHOICRORRRIIHHI = 0;
         if (var3 > 0) {
            this.OIORCRHRRRICRROHHOCOIOIOCCIOOR(var3);
         }
      }
   }

   @Override
   public void flush() {
      if (this.OOOHCORIICIICOROOCCCHICIIHCRRC != null) {
         if (this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI > 0) {
            this.OOOHCORIICIICOROOCCCHICIIHCRRC.write(this.HICHRIICOIIRCRCROHOHIRIIORHCHR, 0, this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI);
            this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = 0;
         }

         this.OOOHCORIICIICOROOCCCHICIIHCRRC.flush();
      }
   }

   @Override
   public void write(char[] var1) {
      this.write(var1, 0, var1.length);
   }

   @Override
   public void write(char[] var1, int var2, int var3) {
      if (var3 < 2) {
         if (var3 == 1) {
            this.write(var1[var2]);
         }
      } else {
         if (this.RRHROOIRHIRCHIIHHOICRORRRIIHHI > 0) {
            char var4 = var1[var2++];
            var3--;
            this.write(this.OHOCHRIIIROICHICOHIOCHHOCOROHO(var4));
         }

         int var11 = this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI;
         byte[] var5 = this.HICHRIICOIIRCRCROHOHIRIIORHCHR;
         int var6 = this.RCHCHRIHIROCIIHRHCHCROOCCOOOCC;
         var3 += var2;

         while (var2 < var3) {
            if (var11 >= var6) {
               this.OOOHCORIICIICOROOCCCHICIIHCRRC.write(var5, 0, var11);
               var11 = 0;
            }

            char var7;
            var7 = var1[var2++];
            label67:
            if (var7 < 128) {
               var5[var11++] = (byte)var7;
               int var8 = var3 - var2;
               int var9 = var6 - var11;
               if (var8 > var9) {
                  var8 = var9;
               }

               for (int var19 = var8 + var2; var2 < var19; var5[var11++] = (byte)var7) {
                  var7 = var1[var2++];
                  if (var7 >= 128) {
                     break label67;
                  }
               }
               continue;
            }

            if (var7 < 2048) {
               var5[var11++] = (byte)(192 | var7 >> 6);
               var5[var11++] = (byte)(128 | var7 & 63);
            } else if (var7 >= 55296 && var7 <= 57343) {
               if (var7 > 56319) {
                  this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = var11;
                  this.OIORCRHRRRICRROHHOCOIOIOCCIOOR(var7);
               }

               this.RRHROOIRHIRCHIIHHOICRORRRIIHHI = var7;
               if (var2 >= var3) {
                  break;
               }

               var7 = this.OHOCHRIIIROICHICOHIOCHHOCOROHO(var1[var2++]);
               if (var7 > 1114111) {
                  this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = var11;
                  this.OIORCRHRRRICRROHHOCOIOIOCCIOOR(var7);
               }

               var5[var11++] = (byte)(240 | var7 >> 18);
               var5[var11++] = (byte)(128 | var7 >> 12 & 63);
               var5[var11++] = (byte)(128 | var7 >> 6 & 63);
               var5[var11++] = (byte)(128 | var7 & 63);
            } else {
               var5[var11++] = (byte)(224 | var7 >> 12);
               var5[var11++] = (byte)(128 | var7 >> 6 & 63);
               var5[var11++] = (byte)(128 | var7 & 63);
            }
         }

         this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = var11;
      }
   }

   @Override
   public void write(int var1) {
      if (this.RRHROOIRHIRCHIIHHOICRORRRIIHHI > 0) {
         var1 = this.OHOCHRIIIROICHICOHIOCHHOCOROHO(var1);
      } else if (var1 >= 55296 && var1 <= 57343) {
         if (var1 > 56319) {
            this.OIORCRHRRRICRROHHOCOIOIOCCIOOR(var1);
         }

         this.RRHROOIRHIRCHIIHHOICRORRRIIHHI = var1;
         return;
      }

      if (this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI >= this.RCHCHRIHIROCIIHRHCHCROOCCOOOCC) {
         this.OOOHCORIICIICOROOCCCHICIIHCRRC.write(this.HICHRIICOIIRCRCROHOHIRIIORHCHR, 0, this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI);
         this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = 0;
      }

      if (var1 < 128) {
         this.HICHRIICOIIRCRCROHOHIRIIORHCHR[this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI++] = (byte)var1;
      } else {
         int var2 = this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI;
         if (var1 < 2048) {
            this.HICHRIICOIIRCRCROHOHIRIIORHCHR[var2++] = (byte)(192 | var1 >> 6);
            this.HICHRIICOIIRCRCROHOHIRIIORHCHR[var2++] = (byte)(128 | var1 & 63);
         } else if (var1 <= 65535) {
            this.HICHRIICOIIRCRCROHOHIRIIORHCHR[var2++] = (byte)(224 | var1 >> 12);
            this.HICHRIICOIIRCRCROHOHIRIIORHCHR[var2++] = (byte)(128 | var1 >> 6 & 63);
            this.HICHRIICOIIRCRCROHOHIRIIORHCHR[var2++] = (byte)(128 | var1 & 63);
         } else {
            if (var1 > 1114111) {
               this.OIORCRHRRRICRROHHOCOIOIOCCIOOR(var1);
            }

            this.HICHRIICOIIRCRCROHOHIRIIORHCHR[var2++] = (byte)(240 | var1 >> 18);
            this.HICHRIICOIIRCRCROHOHIRIIORHCHR[var2++] = (byte)(128 | var1 >> 12 & 63);
            this.HICHRIICOIIRCRCROHOHIRIIORHCHR[var2++] = (byte)(128 | var1 >> 6 & 63);
            this.HICHRIICOIIRCRCROHOHIRIIORHCHR[var2++] = (byte)(128 | var1 & 63);
         }

         this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = var2;
      }
   }

   @Override
   public void write(String var1) {
      this.write(var1, 0, var1.length());
   }

   @Override
   public void write(String var1, int var2, int var3) {
      if (var3 < 2) {
         if (var3 == 1) {
            this.write(var1.charAt(var2));
         }
      } else {
         if (this.RRHROOIRHIRCHIIHHOICRORRRIIHHI > 0) {
            char var4 = var1.charAt(var2++);
            var3--;
            this.write(this.OHOCHRIIIROICHICOHIOCHHOCOROHO(var4));
         }

         int var11 = this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI;
         byte[] var5 = this.HICHRIICOIIRCRCROHOHIRIIORHCHR;
         int var6 = this.RCHCHRIHIROCIIHRHCHCROOCCOOOCC;
         var3 += var2;

         while (var2 < var3) {
            if (var11 >= var6) {
               this.OOOHCORIICIICOROOCCCHICIIHCRRC.write(var5, 0, var11);
               var11 = 0;
            }

            char var7;
            var7 = var1.charAt(var2++);
            label67:
            if (var7 < 128) {
               var5[var11++] = (byte)var7;
               int var8 = var3 - var2;
               int var9 = var6 - var11;
               if (var8 > var9) {
                  var8 = var9;
               }

               for (int var19 = var8 + var2; var2 < var19; var5[var11++] = (byte)var7) {
                  var7 = var1.charAt(var2++);
                  if (var7 >= 128) {
                     break label67;
                  }
               }
               continue;
            }

            if (var7 < 2048) {
               var5[var11++] = (byte)(192 | var7 >> 6);
               var5[var11++] = (byte)(128 | var7 & 63);
            } else if (var7 >= 55296 && var7 <= 57343) {
               if (var7 > 56319) {
                  this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = var11;
                  this.OIORCRHRRRICRROHHOCOIOIOCCIOOR(var7);
               }

               this.RRHROOIRHIRCHIIHHOICRORRRIIHHI = var7;
               if (var2 >= var3) {
                  break;
               }

               var7 = this.OHOCHRIIIROICHICOHIOCHHOCOROHO(var1.charAt(var2++));
               if (var7 > 1114111) {
                  this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = var11;
                  this.OIORCRHRRRICRROHHOCOIOIOCCIOOR(var7);
               }

               var5[var11++] = (byte)(240 | var7 >> 18);
               var5[var11++] = (byte)(128 | var7 >> 12 & 63);
               var5[var11++] = (byte)(128 | var7 >> 6 & 63);
               var5[var11++] = (byte)(128 | var7 & 63);
            } else {
               var5[var11++] = (byte)(224 | var7 >> 12);
               var5[var11++] = (byte)(128 | var7 >> 6 & 63);
               var5[var11++] = (byte)(128 | var7 & 63);
            }
         }

         this.HRHHOCHOOIHORRIICOOIIOHHHHRCRI = var11;
      }
   }

   private int OHOCHRIIIROICHICOHIOCHHOCOROHO(int var1) {
      int var2 = this.RRHROOIRHIRCHIIHHOICRORRRIIHHI;
      this.RRHROOIRHIRCHIIHHOICRORRRIIHHI = 0;
      if (var1 >= 56320 && var1 <= 57343) {
         return 65536 + (var2 - 55296 << 10) + (var1 - 56320);
      } else {
         throw new IOException(
            "Broken surrogate pair: first char 0x" + Integer.toHexString(var2) + ", second 0x" + Integer.toHexString(var1) + "; illegal combination"
         );
      }
   }

   private void OIORCRHRRRICRROHHOCOIOIOCCIOOR(int var1) {
      if (var1 > 1114111) {
         throw new IOException("Illegal character point (0x" + Integer.toHexString(var1) + ") to output; max is 0x10FFFF as per RFC 4627");
      }

      if (var1 >= 55296) {
         if (var1 <= 56319) {
            throw new IOException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(var1) + ")");
         } else {
            throw new IOException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(var1) + ")");
         }
      } else {
         throw new IOException("Illegal character point (0x" + Integer.toHexString(var1) + ") to output");
      }
   }
}
