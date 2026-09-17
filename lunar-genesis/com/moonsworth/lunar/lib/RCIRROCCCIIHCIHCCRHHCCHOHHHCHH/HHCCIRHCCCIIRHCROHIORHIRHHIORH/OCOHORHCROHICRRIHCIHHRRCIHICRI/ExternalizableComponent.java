package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

class RHOCHHIRRCHHHOHOIRROIROHHHIHIO implements Externalizable, Serializable {
   protected static final int CORRHRRCRRHCCIOOCROHCIOOOHHCCO = 100000;
   private static final long HORCOHIOHROOIROHCHHCIRCCICOCOO = 1L;
   public byte[] HCHHIHHROHCHHCIOOIHHRCOHHROCCC;

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO() {
   }

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO(byte[] var1) {
      this.HCHHIHHROHCHHCIOOIHHRCOHHROCCC = var1;
   }

   protected Object readResolve() {
      try {
         return HICHRCOHCCRHOHCICOOCHOIHCCHIRI.ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(this.HCHHIHHROHCHHCIOOIHHRCOHHROCCC);
      } catch (IOException var2) {
         throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + var2.getMessage(), var2);
      }
   }

   public static RHOCHHIRRCHHHOHOIRROIROHHHIHIO OCRRIOHCHCCRRHRCCOHCIORRRORCRH(Object var0) {
      try {
         return new RHOCHHIRRCHHHOHOIRROIROHHHIHIO(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRIOOIOROCIRHRORIRHIRHIHOCHICH(var0));
      } catch (IOException var2) {
         throw new IllegalArgumentException("Failed to JDK serialize `" + var0.getClass().getSimpleName() + "` value: " + var2.getMessage(), var2);
      }
   }

   @Override
   public void writeExternal(ObjectOutput var1) {
      var1.writeInt(this.HCHHIHHROHCHHCIOOIHHRCOHHROCCC.length);
      var1.write(this.HCHHIHHROHCHHCIOOIHHRCOHHROCCC);
   }

   @Override
   public void readExternal(ObjectInput var1) {
      int var2 = var1.readInt();
      this.HCHHIHHROHCHHCIOOIHHRCOHHROCCC = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   private byte[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ObjectInput var1, int var2) {
      if (var2 <= 100000) {
         byte[] var19 = new byte[var2];
         var1.readFully(var19, 0, var2);
         return var19;
      }

      try (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            100000
         )) {
         byte[] var5 = var3.RCRCRHCROIIIHOOIHOHCIHOOHOOHOO();
         int var6 = 0;

         while (true) {
            int var7 = Math.min(var5.length - var6, var2);
            var1.readFully(var5, 0, var7);
            var2 -= var7;
            var6 += var7;
            if (var2 == 0) {
               return var3.OIOICHRCCHCCICORRCCRCHRORIRHRI(var6);
            }

            if (var6 == var5.length) {
               var5 = var3.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var6 = 0;
            }
         }
      }
   }
}
