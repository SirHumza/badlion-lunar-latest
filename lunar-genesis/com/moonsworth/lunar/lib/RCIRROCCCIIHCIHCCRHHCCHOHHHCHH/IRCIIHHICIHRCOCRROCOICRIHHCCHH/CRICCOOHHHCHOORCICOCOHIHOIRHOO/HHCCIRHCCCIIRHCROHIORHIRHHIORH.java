package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.io.OutputStream;
import java.util.LinkedList;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends OutputStream {
   public static final byte[] IICHRIHOHIOOIHROCCCCCOIHOOCRHR = new byte[0];
   private static final int HCICOROHHOIHHIHOOOCIOOOIHHROII = 500;
   private static final int HRRRIIIHRROCOOCRCRHCRRRICICHIH = 131072;
   static final int IORIHOHCRHCHCCICIIOCCHROIORORO = 40;
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRCRRRROHCCCCHRICIHOHHRRHIHOIR;
   private final LinkedList<byte[]> IOORHCIRIHRHCHRHIRHOOCRRROHOII = new LinkedList<>();
   private int OHCOOIIRRHORRIHRCRCIROCRHOHHOC;
   private byte[] CRHIOIOHOOCCRCRCCHRCCHOCCICRHR;
   private int OCRHCHCHRRCOCCHIHRHIOORIOHHOHR;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      this(null);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this(var1, 500);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1) {
      this(null, var1);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2) {
      this.RRCRRRROHCCCCHRICIHOHHRRHIHOIR = var1;
      if (var2 > 131072) {
         var2 = 131072;
      }

      this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR = var1 == null ? new byte[var2] : var1.CHOIOICOCCRCOIHIRRHCRCIOHCHRHI(2);
   }

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, byte[] var2, int var3) {
      this.RRCRRRROHCCCCHRICIHOHHRRHIHOIR = null;
      this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR = var2;
      this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR = var3;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH IHIRRIIORRHORHRORIHOROIRCORCOO(byte[] var0, int var1) {
      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(null, var0, var1);
   }

   public void reset() {
      this.OHCOOIIRRHORRIHRCRCIROCRHOHHOC = 0;
      this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR = 0;
      if (!this.IOORHCIRIHRHCHRHIRHOOCRRROHOII.isEmpty()) {
         this.IOORHCIRIHRHCHRHIRHOOCRRROHOII.clear();
      }
   }

   public int size() {
      return this.OHCOOIIRRHORRIHRCRCIROCRHOHHOC + this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR;
   }

   public void release() {
      this.reset();
      if (this.RRCRRRROHCCCCHRICIHOHHRRHIHOIR != null && this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR != null) {
         this.RRCRRRROHCCCCHRICIHOHHRRHIHOIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(2, this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR);
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR = null;
      }
   }

   public void RIRRCRCICIHOHCOCRICHIROHRRHIRO(int var1) {
      if (this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR >= this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR.length) {
         this.RHOHHOIHICRHRIIHCHIRRHCRCHCRRC();
      }

      this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)var1;
   }

   public void RROICHHOCHOHCHCOOHRHCICCHOHOIH(int var1) {
      if (this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR + 1 < this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR.length) {
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)(var1 >> 8);
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)var1;
      } else {
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1 >> 8);
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1);
      }
   }

   public void HCOOCIHCHIRCCOHROIRHIROHRIHIOC(int var1) {
      if (this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR + 2 < this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR.length) {
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)(var1 >> 16);
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)(var1 >> 8);
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)var1;
      } else {
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1 >> 16);
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1 >> 8);
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1);
      }
   }

   public void HCCIRRHRCHICIICOIRCRRIOHCCRROI(int var1) {
      if (this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR + 3 < this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR.length) {
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)(var1 >> 24);
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)(var1 >> 16);
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)(var1 >> 8);
         this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR[this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR++] = (byte)var1;
      } else {
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1 >> 24);
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1 >> 16);
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1 >> 8);
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1);
      }
   }

   public byte[] toByteArray() {
      int var1 = this.OHCOOIIRRHORRIHRCRCIROCRHOHHOC + this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR;
      if (var1 == 0) {
         return IICHRIHOHIOOIHROCCCCCOIHOOCRHR;
      }

      byte[] var2 = new byte[var1];
      int var3 = 0;

      for (byte[] var5 : this.IOORHCIRIHRHCHRHIRHOOCRRROHOII) {
         int var6 = var5.length;
         System.arraycopy(var5, 0, var2, var3, var6);
         var3 += var6;
      }

      System.arraycopy(this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR, 0, var2, var3, this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR);
      var3 += this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR;
      if (var3 != var1) {
         throw new RuntimeException("Internal error: total len assumed to be " + var1 + ", copied " + var3 + " bytes");
      }

      if (!this.IOORHCIRIHRHCHRHIRHOOCRRROHOII.isEmpty()) {
         this.reset();
      }

      return var2;
   }

   public byte[] RCRCRHCROIIIHOOIHOHCIHOOHOOHOO() {
      this.reset();
      return this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR;
   }

   public byte[] OIIIHIIHHRIRICIIOCCCCRRRRHROCR() {
      this.RHOHHOIHICRHRIIHCHIRRHCRCHCRRC();
      return this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR;
   }

   public byte[] OIOICHRCCHCCICORRCCRCHRORIRHRI(int var1) {
      this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR = var1;
      return this.toByteArray();
   }

   public byte[] OHHOIOIIICHIOHOROHOROOIORHIRCC() {
      return this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR;
   }

   public void OHOIIICHHOHCOOIOOCCHOCRHOCCIRI(int var1) {
      this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR = var1;
   }

   public int IIRIHOICOHCHHCRRHRROCIRROROCRR() {
      return this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR;
   }

   @Override
   public void write(byte[] var1) {
      this.write(var1, 0, var1.length);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      while (true) {
         int var4 = this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR.length - this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR;
         int var5 = Math.min(var4, var3);
         if (var5 > 0) {
            System.arraycopy(var1, var2, this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR, this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR, var5);
            var2 += var5;
            this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR += var5;
            var3 -= var5;
         }

         if (var3 <= 0) {
            return;
         }

         this.RHOHHOIHICRHRIIHCHIRRHCRCHCRRC();
      }
   }

   @Override
   public void write(int var1) {
      this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(var1);
   }

   @Override
   public void close() {
   }

   @Override
   public void flush() {
   }

   private void RHOHHOIHICRHRIIHCHIRRHCRCHCRRC() {
      int var1 = this.OHCOOIIRRHORRIHRCRCIROCRHOHHOC + this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR.length;
      if (var1 < 0) {
         throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
      }

      this.OHCOOIIRRHORRIHRCRCIROCRHOHHOC = var1;
      int var2 = Math.max(this.OHCOOIIRRHORRIHRCRCIROCRHOHHOC >> 1, 1000);
      if (var2 > 131072) {
         var2 = 131072;
      }

      this.IOORHCIRIHRHCHRHIRHOOCRRROHOII.add(this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR);
      this.CRHIOIOHOOCCRCRCCHRCCHOCCICRHR = new byte[var2];
      this.OCRHCHCHRRCOCCHIHRHIOORIOHHOHR = 0;
   }
}
