package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.io.EOFException;
import java.io.InputStream;

public interface HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   boolean HCHCICORCOOIIOCOHICHIROROHCCCO();

   byte nextByte();

   void reset();

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      protected final InputStream OIHIIRHOROCCRCORRHRCIRRRCCRCRO;
      protected final byte[] ORCOHCCOIHCOOIRIRHRRCORCCOHOOR;
      protected final int COIRORIHRIHCIROOICORHOCORHRHOI;
      protected int IHHROCIHCRIIHOOCOIORHIRCHOCORC;
      protected int OOROCRRIOCOCICHICIHIHHICOHCCHR;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InputStream var1, byte[] var2) {
         this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO = var1;
         this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR = var2;
         this.COIRORIHRIHCIROOICORHOCORHRHOI = 0;
         this.OOROCRRIOCOCICHICIHIHHICOHCCHR = 0;
         this.IHHROCIHCRIIHOOCOIORHIRCHOCORC = 0;
      }

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1) {
         this(var1, 0, var1.length);
      }

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, int var2, int var3) {
         this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO = null;
         this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR = var1;
         this.OOROCRRIOCOCICHICIHIHHICOHCCHR = var2;
         this.COIRORIHRIHCIROOICORHOCORHRHOI = var2;
         this.IHHROCIHCRIIHOOCOIORHIRCHOCORC = var2 + var3;
      }

      @Override
      public boolean HCHCICORCOOIIOCOHICHIROROHCCCO() {
         if (this.OOROCRRIOCOCICHICIHIHHICOHCCHR < this.IHHROCIHCRIIHOOCOIORHIRCHOCORC) {
            return true;
         }

         if (this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO == null) {
            return false;
         }

         int var1 = this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR.length - this.OOROCRRIOCOCICHICIHIHHICOHCCHR;
         if (var1 < 1) {
            return false;
         }

         int var2 = this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO.read(this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR, this.OOROCRRIOCOCICHICIHIHHICOHCCHR, var1);
         if (var2 <= 0) {
            return false;
         }

         this.IHHROCIHCRIIHOOCOIORHIRCHOCORC += var2;
         return true;
      }

      @Override
      public byte nextByte() {
         if (this.OOROCRRIOCOCICHICIHIHHICOHCCHR >= this.IHHROCIHCRIIHOOCOIORHIRCHOCORC && !this.HCHCICORCOOIIOCOHICHIROROHCCCO()) {
            throw new EOFException(
               "Failed auto-detect: could not read more than "
                  + this.OOROCRRIOCOCICHICIHIHHICOHCCHR
                  + " bytes (max buffer size: "
                  + this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR.length
                  + ")"
            );
         } else {
            return this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR[this.OOROCRRIOCOCICHICIHIHHICOHCCHR++];
         }
      }

      @Override
      public void reset() {
         this.OOROCRRIOCOCICHICIHIHHICOHCCHR = this.COIRORIHRIHCIROOICORHOCORHRHOI;
      }

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, CRRRICCRROCOHHOHIICIHORCOORRRH var2) {
         return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.OIHIIRHOROCCRCORRHRCIRRRCCRCRO,
            this.ORCOHCCOIHCOOIRIRHRRCORCCOHOOR,
            this.COIRORIHRIHCIROOICORHOCORHRHOI,
            this.IHHROCIHCRIIHOOCOIORHIRCHOCORC - this.COIRORIHRIHCIROOICORHOCORHRHOI,
            var1,
            var2
         );
      }
   }
}
