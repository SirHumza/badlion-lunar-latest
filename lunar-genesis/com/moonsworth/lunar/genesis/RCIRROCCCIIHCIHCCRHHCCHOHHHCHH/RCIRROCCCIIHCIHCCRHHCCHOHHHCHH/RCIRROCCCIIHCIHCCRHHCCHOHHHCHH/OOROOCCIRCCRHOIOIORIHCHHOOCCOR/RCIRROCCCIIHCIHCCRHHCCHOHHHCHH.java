package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@CanIgnoreReturnValue
abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final ByteBuffer HOCHCOOHIORRCHIHIHRHCOOHIHOHCH = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

   protected abstract void update(byte var1);

   protected void update(byte[] var1) {
      this.update(var1, 0, var1.length);
   }

   protected void update(byte[] var1, int var2, int var3) {
      for (int var4 = var2; var4 < var2 + var3; var4++) {
         this.update(var1[var4]);
      }
   }

   protected void update(ByteBuffer var1) {
      if (var1.hasArray()) {
         this.update(var1.array(), var1.arrayOffset() + var1.position(), var1.remaining());
         ((Buffer)var1).position(var1.limit());
      } else {
         for (int var2 = var1.remaining(); var2 > 0; var2--) {
            this.update(var1.get());
         }
      }
   }

   private IIRHCHHOICHRICOOCRORCCIOOIHOIR CCHOOOHOCOIIICICIROHRHIRHHRCCC(int var1) {
      try {
         this.update(this.HOCHCOOHIORRCHIHIHRHCOOHIHOHCH.array(), 0, var1);
      } finally {
         ((Buffer)this.HOCHCOOHIORRCHIHIHRHCOOHIHOHCH).clear();
      }

      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR HRCHROOHRIHCRCRHRIIROCIRHOIRHH(byte var1) {
      this.update(var1);
      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR HCHRIROHHHCORIOCROOCHRCIOROOCI(byte[] var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.update(var1);
      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR IHCRORHRORIICHRHRCHRRIRRHHOCOO(byte[] var1, int var2, int var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
         var2, var2 + var3, var1.length
      );
      this.update(var1, var2, var3);
      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR CIOHHCORHRCCRICCCORIHCRHCCCRRR(ByteBuffer var1) {
      this.update(var1);
      return this;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR CRRRICCRROCOHHOHIICIHORCOORRRH(short var1) {
      this.HOCHCOOHIORRCHIHIHRHCOOHIHOHCH.putShort(var1);
      return this.CCHOOOHOCOIIICICIROHRHIRHHRCCC(2);
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR IRCIRRIICRHCRHOCCRCRRCRORIHHHO(int var1) {
      this.HOCHCOOHIORRCHIHIHRHCOOHIHOHCH.putInt(var1);
      return this.CCHOOOHOCOIIICICIROHRHIRHHRCCC(4);
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR CIROHHHIOIHIROHCHICORCCCRROHCC(long var1) {
      this.HOCHCOOHIORRCHIHIHRHCOOHIHOHCH.putLong(var1);
      return this.CCHOOOHOCOIIICICIROHRHIRHHRCCC(8);
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR HICRRICCHCCROOHHCHOCOCCHOIHHOC(char var1) {
      this.HOCHCOOHIORRCHIHIHRHCOOHIHOHCH.putChar(var1);
      return this.CCHOOOHOCOIIICICIROHRHIRHHRCCC(2);
   }
}
