package com.moonsworth.lunar.client.util.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.io.LittleEndianDataOutputStream;
import com.google.common.primitives.Bytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static final byte[] OHHHCOCICRCHRCHHCHHHCHCIHRRCCR = new byte[]{79, 103, 103, 83};
   public static final int OIHCORCCIIORORHHIIOHHRIIROHRIH = 255;
   private int version = 0;
   private int HOICCIHIRICRRCHRRCICHHCRCRCHCI = 0;
   private long IHRCCRCRCIHRRHIROOCRHOCHOOOHIR;
   private long ICCICCHORHORRHROOOCIHIOIOCHOHI;
   private long HOIRRRROCOIRRIHHHIOHOCORHIOCRO;
   private int IHRICCCCIOHIHHIIROOOCHRCIOHORR;
   private byte[] HHHRIHCIIROOICRCRRRICHICORHRIO = new byte[0];
   private final List<byte[]> HOOHIROCHOOOCIIRHIIIIHOCCHOOCR = new LinkedList<>();

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH RROHOICHRIHROCIRCCICRHCOIICIIH() {
      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   }

   public void RICHHCCRROROHHOIOIHCICROHIOIHI(int var1) {
      this.HOICCIHIRICRRCHRRCICHHCRCRCHCI = var1 & 7;
   }

   public boolean OCHCHOORROROHICIIRORIHRORCCCHO() {
      return (this.HOICCIHIRICRRCHRRCICHHCRCRCHCI & 1) != 0;
   }

   public void ROHRIHCHIRROIIRROIRCCCORHHIHRH() {
      this.HOICCIHIRICRRCHRRCICHHCRCRCHCI |= 1;
   }

   public boolean OOCHRRRCHROCOIOCHORCHHOCIRRIRO() {
      return (this.HOICCIHIRICRRCHRRCICHHCRCRCHCI & 2) != 0;
   }

   public void OHOOCIOOHIHIRCCIRCRHHRHHIHCRIC() {
      this.HOICCIHIRICRRCHRRCICHHCRCRCHCI |= 2;
   }

   public boolean OIIIOCROOCIOHCICRIOCOOHRRRHOCH() {
      return (this.HOICCIHIRICRRCHRRCICHHCRCRCHCI & 4) != 0;
   }

   public void RHCHHOOHROOHHRIOHHOCCICIHRRHRR() {
      this.HOICCIHIRICRRCHRRCICHHCRCRCHCI |= 4;
   }

   public int ROHCIRHCICICOOHCOHOIOICICORHOO() {
      if (this.IHRICCCCIOHIHHIIROOOCHRCIOHORR == 0) {
         byte[] var1 = this.RHRRICCROCICOIHCCRRHRCICHCRIIR();
         this.IHRICCCCIOHIHHIIROOOCHRCIOHORR = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1);
      }

      return this.IHRICCCCIOHIHHIIROOOCHRCIOHORR;
   }

   void IIIHOCORRHCCRORIOOHRHIIICROHHH(int var1) {
      this.IHRICCCCIOHIHHIIROOOCHRCIOHORR = var1;
   }

   public int RCRHCRRIRHRCOOHRHOIOCHRCIRRHOC() {
      return this.HHHRIHCIIROOICRCRRRICHICORHRIO != null ? this.HHHRIHCIIROOICRCRRRICHICORHRIO.length : 0;
   }

   public boolean OROHIHCCRHRHOOHIOHHOICHIOHIOCO() {
      return Byte.toUnsignedInt(this.HHHRIHCIIROOICRCRRRICHICORHRIO[this.RCRHCRRIRHRCOOHRHOIOCHRCIRRHOC() - 1]) < 255;
   }

   public void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(byte[] var1) {
      this.HHHRIHCIIROOICRCRRRICHICORHRIO = Bytes.concat(
         new byte[][]{this.HHHRIHCIIROOICRCRRRICHICORHRIO, this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1.length, false)}
      );
      this.HOOHIROCHOOOCIIRHIIIIHOCCHOOCR.add(var1);
   }

   public void IIHRRHORCRCROCHHOHORCHCROCIHRO(byte[] var1) {
      if (var1.length % 255 != 0) {
         throw new IRCIIHHICIHRCOCRROCOICRIHHCCHH("Not a partial data packet");
      }

      this.HHHRIHCIIROOICRCRRRICHICORHRIO = Bytes.concat(
         new byte[][]{this.HHHRIHCIIROOICRCRRRICHICORHRIO, this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1.length, true)}
      );
      this.HOOHIROCHOOOCIIRHIIIIHOCCHOOCR.add(var1);
   }

   public byte[] HRIOIIRRORIOCRIOCORRRIHHCROOCI() {
      if (this.IHRICCCCIOHIHHIIROOOCHRCIOHORR == 0) {
         byte[] var1 = this.RHRRICCROCICOIHCCRRHRCICHCRIIR();
         this.IHRICCCCIOHIHHIIROOOCHRCIOHORR = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1);
      }

      return this.RHRRICCROCICOIHCCRRHRCICHCRIIR();
   }

   private byte[] RHRRICCROCICOIHCCRRHRCICHCRIIR() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      LittleEndianDataOutputStream var2 = new LittleEndianDataOutputStream(var1);

      try {
         var2.write(OHHHCOCICRCHRCHHCHHHCHCIHRRCCR);
         var2.write(this.version);
         var2.write(this.HOICCIHIRICRRCHRRCICHHCRCRCHCI);
         var2.writeLong(this.IHRCCRCRCIHRRHIROOCRHOCHOOOHIR);
         var2.writeInt((int)this.ICCICCHORHORRHROOOCIHIOIOCHOHI);
         var2.writeInt((int)this.HOIRRRROCOIRRIHHHIOHOCORHIOCRO);
         var2.writeInt(this.IHRICCCCIOHIHHIIROOOCHRCIOHORR);
         var2.write(this.RCRHCRRIRHRCOOHRHOIOCHRCIRRHOC());
         var2.write(this.HHHRIHCIIROOICRCRRRICHICORHRIO);

         for (byte[] var4 : this.HOOHIROCHOOOCIIRHIIIIHOCCHOOCR) {
            var2.write(var4);
         }
      } catch (IOException var5) {
         throw new RuntimeException("OggPage dump to byte array error", var5);
      }

      return var1.toByteArray();
   }

   private byte[] IIHRRHORCRCROCHHOHORCHCROCIHRO(int var1, boolean var2) {
      int var3 = var1 / 255;
      if (var2) {
         byte[] var6 = new byte[var3];
         Arrays.fill(var6, (byte)-1);
         return var6;
      } else {
         int var4 = var1 % 255;
         byte[] var5 = new byte[var3 + 1];
         Arrays.fill(var5, 0, var3, (byte)-1);
         var5[var3] = (byte)var4;
         return var5;
      }
   }

   @Generated
   public int getVersion() {
      return this.version;
   }

   @Generated
   public long OHCHCOROIHCHIIOOHRHIORCRORCICH() {
      return this.IHRCCRCRCIHRRHIROOCRHOCHOOOHIR;
   }

   @Generated
   public void IRRCHICCRHCHRRCHIOHIIRIORIRHRI(long var1) {
      this.IHRCCRCRCIHRRHIROOCRHOCHOOOHIR = var1;
   }

   @Generated
   public long OOCIHIHCCOROOHCCIHRRRICRCCCIII() {
      return this.ICCICCHORHORRHROOOCIHIOIOCHOHI;
   }

   @Generated
   public void ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(long var1) {
      this.ICCICCHORHORRHROOOCIHIOIOCHOHI = var1;
   }

   @Generated
   public long HROCHIRCIRHOCHCOIICOIOHOOHOOCO() {
      return this.HOIRRRROCOIRRIHHHIOHOCORHIOCRO;
   }

   @Generated
   public void ICOHIIIRCIORCORHRRROOOOCOOROIC(long var1) {
      this.HOIRRRROCOIRRIHHHIOHOCORHIOCRO = var1;
   }

   @Generated
   public byte[] CHCIIORRROOICCCCHHIOHIIHHHHOIC() {
      return this.HHHRIHCIIROOICRCRRRICHICORHRIO;
   }

   @Generated
   public List<byte[]> RHIROOCOIRIHIIOHHCOIHOCCIOHRHI() {
      return this.HOOHIROCHOOOCIIRHIIIIHOCCHOOCR;
   }
}
