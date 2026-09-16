package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public final class RHOCHHIRRCHHHOHOIRROIROHHHIHIO extends FilterInputStream {
   private final IIRHCHHOICHRICOOCRORCCIOOIHOIR RCCORRHOICRIRHHCIIOCIOHIOHOHIO;

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO(IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1, InputStream var2) {
      super(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         )
      );
      this.RCCORRHOICRIRHHCIIOCIOHIOHOHIO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1.OHRIHRCROOCROOIIOHROROHCCHHOCR()
      );
   }

   @CanIgnoreReturnValue
   @Override
   public int read() {
      int var1 = this.in.read();
      if (var1 != -1) {
         this.RCCORRHOICRIRHHCIIOCIOHIOHOHIO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((byte)var1);
      }

      return var1;
   }

   @CanIgnoreReturnValue
   @Override
   public int read(byte[] var1, int var2, int var3) {
      int var4 = this.in.read(var1, var2, var3);
      if (var4 != -1) {
         this.RCCORRHOICRIRHHCIIOCIOHIOHOHIO.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1, var2, var4);
      }

      return var4;
   }

   @Override
   public boolean markSupported() {
      return false;
   }

   @Override
   public void mark(int var1) {
   }

   @Override
   public void reset() {
      throw new IOException("reset not supported");
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR CIRIIOORHHIHICORIOIIRIIHHCOCCI() {
      return this.RCCORRHOICRIRHHCIIOCIOHIOHOHIO.CIRIIOORHHIHICORIOIIRIIHHCOCCI();
   }
}
