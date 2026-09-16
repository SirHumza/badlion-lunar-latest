package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@CanIgnoreReturnValue
abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final ByteBuffer COCHCHICORRHCCORHCOORCRIRCCRHI;
   private final int ORIIRROHHOICHOIIORCCCRIRHROHHC;
   private final int CICCRHRORHOCRIRCOIHOOCIOIIIOCR;

   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1) {
      this(var1, var1);
   }

   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1, int var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2 % var1 == 0
      );
      this.COCHCHICORRHCCORHCOORCRIRCCRHI = ByteBuffer.allocate(var2 + 7).order(ByteOrder.LITTLE_ENDIAN);
      this.ORIIRROHHOICHOIIORCCCRIRHROHHC = var2;
      this.CICCRHRORHOCRIRCOIHOOCIOIIIOCR = var1;
   }

   protected abstract void process(ByteBuffer var1);

   protected void processRemaining(ByteBuffer var1) {
      ((Buffer)var1).position(var1.limit());
      ((Buffer)var1).limit(this.CICCRHRORHOCRIRCOIHOOCIOIIIOCR + 7);

      while (var1.position() < this.CICCRHRORHOCRIRCOIHOOCIOIIIOCR) {
         var1.putLong(0L);
      }

      ((Buffer)var1).limit(this.CICCRHRORHOCRIRCOIHOOCIOIIIOCR);
      ((Buffer)var1).flip();
      this.process(var1);
   }

   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR IHCRORHRORIICHRHRCHRRIRRHHOCOO(byte[] var1, int var2, int var3) {
      return this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(ByteBuffer.wrap(var1, var2, var3).order(ByteOrder.LITTLE_ENDIAN));
   }

   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR CIOHHCORHRCCRICCCORIHCRHCCCRRR(ByteBuffer var1) {
      ByteOrder var2 = var1.order();

      try {
         var1.order(ByteOrder.LITTLE_ENDIAN);
         return this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1);
      } finally {
         var1.order(var2);
      }
   }

   private IIRHCHHOICHRICOOCRORCCIOOIHOIR OHHRIOHROOIHOROCIRHCHORIHRRRRI(ByteBuffer var1) {
      if (var1.remaining() <= this.COCHCHICORRHCCORHCOORCRIRCCRHI.remaining()) {
         this.COCHCHICORRHCCORHCOORCRIRCCRHI.put(var1);
         this.munchIfFull();
         return this;
      }

      int var2 = this.ORIIRROHHOICHOIIORCCCRIRHROHHC - this.COCHCHICORRHCCORHCOORCRIRCCRHI.position();

      for (int var3 = 0; var3 < var2; var3++) {
         this.COCHCHICORRHCCORHCOORCRIRCCRHI.put(var1.get());
      }

      this.munch();

      while (var1.remaining() >= this.CICCRHRORHOCRIRCOIHOOCIOIIIOCR) {
         this.process(var1);
      }

      this.COCHCHICORRHCCORHCOORCRIRCCRHI.put(var1);
      return this;
   }

   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR HRCHROOHRIHCRCRHRIIROCIRHOIRHH(byte var1) {
      this.COCHCHICORRHCCORHCOORCRIRCCRHI.put(var1);
      this.munchIfFull();
      return this;
   }

   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR CRRRICCRROCOHHOHIICIHORCOORRRH(short var1) {
      this.COCHCHICORRHCCORHCOORCRIRCCRHI.putShort(var1);
      this.munchIfFull();
      return this;
   }

   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR HICRRICCHCCROOHHCHOCOCCHOIHHOC(char var1) {
      this.COCHCHICORRHCCORHCOORCRIRCCRHI.putChar(var1);
      this.munchIfFull();
      return this;
   }

   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR IRCIRRIICRHCRHOCCRCRRCRORIHHHO(int var1) {
      this.COCHCHICORRHCCORHCOORCRIRCCRHI.putInt(var1);
      this.munchIfFull();
      return this;
   }

   @Override
   public final IIRHCHHOICHRICOOCRORCCIOOIHOIR CIROHHHIOIHIROHCHICORCCCRROHCC(long var1) {
      this.COCHCHICORRHCCORHCOORCRIRCCRHI.putLong(var1);
      this.munchIfFull();
      return this;
   }

   @Override
   public final CIOHHCORHRCCRICCCORIHCRHCCCRRR CIRIIOORHHIHICORIOIIRIIHHCOCCI() {
      this.munch();
      ((Buffer)this.COCHCHICORRHCCORHCOORCRIRCCRHI).flip();
      if (this.COCHCHICORRHCCORHCOORCRIRCCRHI.remaining() > 0) {
         this.processRemaining(this.COCHCHICORRHCCORHCOORCRIRCCRHI);
         ((Buffer)this.COCHCHICORRHCCORHCOORCRIRCCRHI).position(this.COCHCHICORRHCCORHCOORCRIRCCRHI.limit());
      }

      return this.RICOORIHCRORRORHICRROHIHROORHO();
   }

   protected abstract CIOHHCORHRCCRICCCORIHCRHCCCRRR RICOORIHCRORRORHICRROHIHROORHO();

   private void munchIfFull() {
      if (this.COCHCHICORRHCCORHCOORCRIRCCRHI.remaining() < 8) {
         this.munch();
      }
   }

   private void munch() {
      ((Buffer)this.COCHCHICORRHCCORHCOORCRIRCCRHI).flip();

      while (this.COCHCHICORRHCCORHCOORCRIRCCRHI.remaining() >= this.CICCRHRORHOCRIRCOIHOOCIOIIIOCR) {
         this.process(this.COCHCHICORRHCCORHCOORCRIRCCRHI);
      }

      this.COCHCHICORRHCCORHCOORCRIRCCRHI.compact();
   }
}
