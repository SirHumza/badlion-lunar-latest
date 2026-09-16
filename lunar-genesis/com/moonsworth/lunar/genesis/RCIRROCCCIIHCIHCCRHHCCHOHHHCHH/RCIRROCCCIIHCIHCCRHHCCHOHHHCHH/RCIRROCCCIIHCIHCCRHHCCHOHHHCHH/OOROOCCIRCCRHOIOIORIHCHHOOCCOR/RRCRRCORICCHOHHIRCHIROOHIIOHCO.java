package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.Immutable;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

@Immutable
abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR OHRIHRCROOCROOIIOHROROHCCHHOCR() {
      return this.CCIRHRHCCCCIOCRORRRCIOHIHCCCOR(32);
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR CCIRHRHCCCCIOCRORRRCIOHIHCCCOR(int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0
      );
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @Override
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR HHIHOIIORRRIICHHHIOHRCIHIICHOI(int var1) {
      return this.CRHROHHHCIHHCOHCOORCRIHHIICROR(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(var1).array());
   }

   @Override
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR ROIOROHRIHRRHIHRRRIHHHIICCHIOI(long var1) {
      return this.CRHROHHHCIHHCOHCOORCRIHHIICROR(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(var1).array());
   }

   @Override
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CharSequence var1) {
      int var2 = var1.length();
      ByteBuffer var3 = ByteBuffer.allocate(var2 * 2).order(ByteOrder.LITTLE_ENDIAN);

      for (int var4 = 0; var4 < var2; var4++) {
         var3.putChar(var1.charAt(var4));
      }

      return this.CRHROHHHCIHHCOHCOORCRIHHIICROR(var3.array());
   }

   @Override
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR HHCCIRHCCCIIRHCROHIORHIRHHIORH(CharSequence var1, Charset var2) {
      return this.CRHROHHHCIHHCOHCOORCRIHHIICROR(var1.toString().getBytes(var2));
   }

   @Override
   public abstract CIOHHCORHRCCRICCCORIHCRHCCCRRR IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(byte[] var1, int var2, int var3);

   @Override
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR IIRHCHHOICHRICOOCRORCCIOOIHOIR(ByteBuffer var1) {
      return this.CCIRHRHCCCCIOCRORRRCIOHIHCCCOR(var1.remaining()).CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1).CIRIIOORHHIHICORIOIIRIIHHCOCCI();
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends ByteArrayOutputStream {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1) {
         super(var1);
      }

      void write(ByteBuffer var1) {
         int var2 = var1.remaining();
         if (this.count + var2 > this.buf.length) {
            this.buf = Arrays.copyOf(this.buf, this.count + var2);
         }

         var1.get(this.buf, this.count, var2);
         this.count += var2;
      }

      byte[] byteArray() {
         return this.buf;
      }

      int length() {
         return this.count;
      }
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
      final RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCCRCHIICIHHRHOIRIOCHOOORHHCHO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var2) {
         this.CCCRCHIICIHHRHOIRIOCHOOORHHCHO = new RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
      }

      @Override
      public IIRHCHHOICHRICOOCRORCCIOOIHOIR HRCHROOHRIHCRCRHRIIROCIRHOIRHH(byte var1) {
         this.CCCRCHIICIHHRHOIRIOCHOOORHHCHO.write(var1);
         return this;
      }

      @Override
      public IIRHCHHOICHRICOOCRORCCIOOIHOIR IHCRORHRORIICHRHRCHRRIRRHHOCOO(byte[] var1, int var2, int var3) {
         this.CCCRCHIICIHHRHOIRIOCHOOORHHCHO.write(var1, var2, var3);
         return this;
      }

      @Override
      public IIRHCHHOICHRICOOCRORCCIOOIHOIR CIOHHCORHRCCRICCCORIHCRHCCCRRR(ByteBuffer var1) {
         this.CCCRCHIICIHHRHOIRIOCHOOORHHCHO.write(var1);
         return this;
      }

      @Override
      public CIOHHCORHRCCRICCCORIHCRHCCCRRR CIRIIOORHHIHICORIOIIRIIHHCOCCI() {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
            this.CCCRCHIICIHHRHOIRIOCHOOORHHCHO.byteArray(), 0, this.CCCRCHIICIHHRHOIRIOCHOOORHHCHO.length()
         );
      }
   }
}
