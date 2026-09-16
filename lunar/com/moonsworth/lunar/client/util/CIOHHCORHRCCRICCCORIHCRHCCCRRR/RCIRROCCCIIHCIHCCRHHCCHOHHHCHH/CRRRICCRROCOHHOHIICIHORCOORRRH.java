package com.moonsworth.lunar.client.util.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.io.LittleEndianDataInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final LittleEndianDataInputStream RRRRRROCHRIIHOHRHICIOIICCRIHCC;

   private CRRRICCRROCOHHOHIICIHORCOORRRH(InputStream var1) {
      this.RRRRRROCHRIIHOHRHICIOIICCRIHCC = new LittleEndianDataInputStream(var1);
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH HCOHROCRRIIHOORRCCROCROICRICIC(String var0) {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH(new BufferedInputStream(new FileInputStream(var0)));
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH OOROOCCIRCCRHOIOIORIHCHHOOCCOR(InputStream var0) {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH OIHRIOOCCCCCRHICRRRRCOOHHICCHI() {
      return this.ORCHCCCCCHCIOOCCICCOCCOHHIHCCC() ? this.CRHHRIICIIIOHHHCHRHIORHIOOHCCO() : null;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH RCOCOHHCOOICCICCRCCORORROHRCCC(long var1) {
      while (this.ORCHCCCCCHCIOOCCICCOCCOHHIHCCC()) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.CRHHRIICIIIOHHHCHRHIORHIOOHCCO();
         if (var3.OOCIHIHCCOROOHCCIHRRRICRCCCIII() == var1) {
            return var3;
         }
      }

      return null;
   }

   private boolean ORCHCCCCCHCIOOCCICCOCCOHHIHCCC() {
      int var1 = 0;

      while (var1 < HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHHCOCICRCHRCHHCHHHCHCIHRRCCR.length) {
         int var2 = this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.read();
         if (var2 == -1) {
            return false;
         }

         if (var2 == HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHHCOCICRCHRCHHCHHHCHCIHRRCCR[var1]) {
            var1++;
         } else {
            var1 = var2 == HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHHCOCICRCHRCHHCHHHCHCIHRRCCR[0] ? 1 : 0;
         }
      }

      return true;
   }

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH CRHHRIICIIIOHHHCHRHIORHIOOHCCO() {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RROHOICHRIHROCIRCCICRHCOIICIIH();
      int var2 = this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readUnsignedByte();
      if (var2 != 0) {
         throw new IRCIIHHICIHRCOCRROCOICRIHHCCHH("Unsupported Ogg page version: " + var2);
      }

      var1.RICHHCCRROROHHOIOIHCICROHIOIHI(this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readUnsignedByte());
      var1.IRRCHICCRHCHRRCHIOHIIRIORIRHRI(this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readLong());
      var1.ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(Integer.toUnsignedLong(this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readInt()));
      var1.ICOHIIIRCIORCORHRRROOOOCOOROIC(Integer.toUnsignedLong(this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readInt()));
      var1.IIIHOCORRHCCRORIOOHRHIIICROHHH(this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readInt());
      int var3 = this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readUnsignedByte();
      byte[] var4 = this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readNBytes(var3);
      int var5 = 0;

      for (byte var9 : var4) {
         int var10 = Byte.toUnsignedInt(var9);
         var5 += var10;
         if (var10 < 255) {
            byte[] var11 = this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readNBytes(var5);
            var1.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var11);
            var5 = 0;
         }
      }

      if (var5 != 0) {
         byte[] var12 = this.RRRRRROCHRIIHOHRHICIOIICCRIHCC.readNBytes(var5);
         var1.IIHRRHORCRCROCHHOHORCHCROCIHRO(var12);
      }

      return var1;
   }
}
