package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.Arrays;
import java.util.UUID;

public class CCIHHRIOOOOCOHRCIHOHROOICIORCC extends IIRHCHHOICHRICOOCRORCCIOOIHOIR<UUID> {
   private static final long ORRCHICHHROICIHCRHRCOCORORORCI = 1L;
   static final int[] RHCHRIIRICIRIIHCOORCOCHRROOOCR = new int[127];

   public CCIHHRIOOOOCOHRCIHOHROOICIORCC() {
      super(UUID.class);
   }

   @Override
   public Object getEmptyValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      return new UUID(0L, 0L);
   }

   protected UUID RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (var1.length() != 36) {
         if (var1.length() == 24) {
            byte[] var15 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCIIRCCOCICRIOOHOOORHRCRRIIIOR()
               .decode(var1);
            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15, var2);
         } else {
            return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, var2);
         }
      } else {
         if (var1.charAt(8) != '-' || var1.charAt(13) != '-' || var1.charAt(18) != '-' || var1.charAt(23) != '-') {
            this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, var2);
         }

         long var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 0, var2);
         var3 <<= 32;
         long var5 = (long)this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, 9, var2) << 16;
         var5 |= this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, 14, var2);
         long var7 = var3 + var5;
         int var9 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, 19, var2) << 16 | this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, 24, var2);
         var3 = var9;
         var3 <<= 32;
         var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 28, var2);
         var5 = var5 << 32 >>> 32;
         long var10 = var3 | var5;
         return new UUID(var7, var10);
      }
   }

   protected UUID IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Object var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      return var1 instanceof byte[] ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((byte[])var1, var2) : (UUID)super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   private UUID RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      return (UUID)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.handledType(), var1, "UUID has to be represented by standard 36-char representation");
   }

   int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, int var2, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3
   ) {
      return (this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var3) << 24)
         + (this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2 + 2, var3) << 16)
         + (this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2 + 4, var3) << 8)
         + this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2 + 6, var3);
   }

   int IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1, int var2, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3
   ) {
      return (this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var3) << 8) + this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2 + 2, var3);
   }

   int HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      String var1, int var2, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3
   ) {
      char var4 = var1.charAt(var2);
      char var5 = var1.charAt(var2 + 1);
      if (var4 <= 127 && var5 <= 127) {
         int var6 = RHCHRIIRICIRIIHCOORCOCHRROOOCR[var4] << 4 | RHCHRIIRICIRIIHCOORCOCHRROOOCR[var5];
         if (var6 >= 0) {
            return var6;
         }
      }

      return var4 <= 127 && RHCHRIIRICIRIIHCOORCOCHRROOOCR[var4] >= 0
         ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2 + 1, var3, var5)
         : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4);
   }

   int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1,
      int var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3,
      char var4
   ) {
      throw var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, this.handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", var4, Integer.toHexString(var4))
      );
   }

   private UUID RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      byte[] var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (var1.length != 16) {
         throw com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2.IHICOOIOCRHRCHIIOHRHICRIOHHIOR(), "Can only construct UUIDs from byte[16]; got " + var1.length + " bytes", var1, this.handledType()
         );
      } else {
         return new UUID(IOIICIRIICICIIOORHCIIIIRRIHRHI(var1, 0), IOIICIRIICICIIOORHCIIIIRRIHRHI(var1, 8));
      }
   }

   private static long IOIICIRIICICIIOORHCIIIIRRIHRHI(byte[] var0, int var1) {
      long var2 = (long)HHRIICOIOORCHCOIICOOIHIRHHICRI(var0, var1) << 32;
      long var4 = HHRIICOIOORCHCOIICOOIHIRHHICRI(var0, var1 + 4);
      var4 = var4 << 32 >>> 32;
      return var2 | var4;
   }

   private static int HHRIICOIOORCHCOIICOOIHIRHHICRI(byte[] var0, int var1) {
      return var0[var1] << 24 | (var0[var1 + 1] & 0xFF) << 16 | (var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF;
   }

   static {
      Arrays.fill(RHCHRIIRICIRIIHCOORCOCHRROOOCR, -1);
      int var0 = 0;

      while (var0 < 10) {
         RHCHRIIRICIRIIHCOORCOCHRROOOCR[48 + var0] = var0++;
      }

      for (int var1 = 0; var1 < 6; var1++) {
         RHCHRIIRICIRIIHCOORCOCHRROOOCR[97 + var1] = 10 + var1;
         RHCHRIIRICIRIIHCOORCOCHRROOOCR[65 + var1] = 10 + var1;
      }
   }
}
