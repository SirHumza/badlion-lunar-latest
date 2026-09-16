package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
final class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH extends InputStream {
   private final Reader CICHHIIORORHOOIOHHCOHICICIRIOH;
   private final CharsetEncoder OIRHHCICIIRIRROHHCCHOHRCORHCOR;
   private final byte[] ROCHCIHCROHOIHHCHCHICCICIIIIRH = new byte[1];
   private CharBuffer charBuffer;
   private ByteBuffer byteBuffer;
   private boolean endOfInput;
   private boolean draining;
   private boolean doneFlushing;

   RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(Reader var1, Charset var2, int var3) {
      this(var1, var2.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), var3);
   }

   RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(Reader var1, CharsetEncoder var2, int var3) {
      this.CICHHIIORORHOOIOHHCOHICICIRIOH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.OIRHHCICIIRIRROHHCCHOHRCORHCOR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var3 > 0, "bufferSize must be positive: %s", var3
      );
      var2.reset();
      this.charBuffer = CharBuffer.allocate(var3);
      ((Buffer)this.charBuffer).flip();
      this.byteBuffer = ByteBuffer.allocate(var3);
   }

   @Override
   public void close() {
      this.CICHHIIORORHOOIOHHCOHICICIRIOH.close();
   }

   @Override
   public int read() {
      return this.read(this.ROCHCIHCROHOIHHCHCHICCICIIIIRH) == 1
         ? com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.toInt(
            this.ROCHCIHCROHOIHHCHCHICCICIIIIRH[0]
         )
         : -1;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
         var2, var2 + var3, var1.length
      );
      if (var3 == 0) {
         return 0;
      }

      int var4 = 0;
      boolean var5 = this.endOfInput;

      while (true) {
         if (this.draining) {
            var4 += this.drain(var1, var2 + var4, var3 - var4);
            if (var4 == var3 || this.doneFlushing) {
               return var4 > 0 ? var4 : -1;
            }

            this.draining = false;
            ((Buffer)this.byteBuffer).clear();
         }

         while (true) {
            CoderResult var6;
            if (this.doneFlushing) {
               var6 = CoderResult.UNDERFLOW;
            } else if (var5) {
               var6 = this.OIRHHCICIIRIRROHHCCHOHRCORHCOR.flush(this.byteBuffer);
            } else {
               var6 = this.OIRHHCICIIRIRROHHCCHOHRCORHCOR.encode(this.charBuffer, this.byteBuffer, this.endOfInput);
            }

            if (var6.isOverflow()) {
               this.startDraining(true);
               break;
            }

            if (var6.isUnderflow()) {
               if (var5) {
                  this.doneFlushing = true;
                  this.startDraining(false);
                  break;
               }

               if (this.endOfInput) {
                  var5 = true;
               } else {
                  this.readMoreChars();
               }
            } else if (var6.isError()) {
               var6.throwException();
               return 0;
            }
         }
      }
   }

   private static CharBuffer grow(CharBuffer var0) {
      char[] var1 = Arrays.copyOf(var0.array(), var0.capacity() * 2);
      CharBuffer var2 = CharBuffer.wrap(var1);
      ((Buffer)var2).position(var0.position());
      ((Buffer)var2).limit(var0.limit());
      return var2;
   }

   private void readMoreChars() {
      if (availableCapacity(this.charBuffer) == 0) {
         if (this.charBuffer.position() > 0) {
            ((Buffer)this.charBuffer.compact()).flip();
         } else {
            this.charBuffer = grow(this.charBuffer);
         }
      }

      int var1 = this.charBuffer.limit();
      int var2 = this.CICHHIIORORHOOIOHHCOHICICIRIOH.read(this.charBuffer.array(), var1, availableCapacity(this.charBuffer));
      if (var2 == -1) {
         this.endOfInput = true;
      } else {
         ((Buffer)this.charBuffer).limit(var1 + var2);
      }
   }

   private static int availableCapacity(Buffer var0) {
      return var0.capacity() - var0.limit();
   }

   private void startDraining(boolean var1) {
      ((Buffer)this.byteBuffer).flip();
      if (var1 && this.byteBuffer.remaining() == 0) {
         this.byteBuffer = ByteBuffer.allocate(this.byteBuffer.capacity() * 2);
      } else {
         this.draining = true;
      }
   }

   private int drain(byte[] var1, int var2, int var3) {
      int var4 = Math.min(var3, this.byteBuffer.remaining());
      this.byteBuffer.get(var1, var2, var4);
      return var4;
   }
}
