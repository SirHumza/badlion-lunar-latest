package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Byte> {
   private final byte CRRRHOHCORIROROCCHIORHHRHICIRI;
   private final byte RHHRHHOOCHRRIRIIOIRHHOCCCIORII;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(byte var1, byte var2, boolean var3, boolean var4) {
      super(var3, var4);
      this.CRRRHOHCORIROROCCHIORHHRHICIRI = var1;
      this.RHHRHHOOCHRRIRIIOIRHHOCCCIORII = var2;
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte var0, byte var1, boolean var2, boolean var3) {
      int var4 = 0;
      var4 = 31 * var4 + Byte.hashCode(var0);
      var4 = 31 * var4 + Byte.hashCode(var1);
      var4 = 31 * var4 + Boolean.hashCode(var2);
      var4 = 31 * var4 + Boolean.hashCode(var3);
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4x -> new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2, var3));
   }

   public Byte CHHOCIRORIHCHOHRIICIHOIRCCCHRR() {
      return this.CRRRHOHCORIROROCCHIORHHRHICIRI;
   }

   public Byte ICICRCCHHCHORHCOCHCORHRORICRIH() {
      return this.RHHRHHOOCHRRIRIIOIRHHOCCCIORII;
   }

   @Override
   public String OCOCHIOCCCHOHOORHCCOIHICHRCRHO() {
      return "Byte";
   }

   public Byte RRHOOOORORHHOOIHRCCHIIHHIIIIOH(double var1) {
      return (byte)Math.round(var1);
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         Byte var3 = this.CHHOCIRORIHCHOHRIICIHOIRCCCHRR();
         Byte var4 = var2.CHHOCIRORIHCHOHRIICIHOIRCCCHRR();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Byte var5 = this.ICICRCCHHCHORHCOCHCORHRORICRIH();
            Byte var6 = var2.ICICRCCHHCHORHCOCHCORHRORICRIH();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = super.hashCode();
      Byte var3 = this.CHHOCIRORIHCHOHRIICIHOIRCCCHRR();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Byte var4 = this.ICICRCCHHCHORHCOCHCORHRORICRIH();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }
}
