package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class HHRIICOIOORCHCOIICOOIHIRHHICRI extends FilterInputStream implements DataInput {
   public HHRIICOIOORCHCOIICOOIHIRHHICRI(InputStream var1) {
      super(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         )
      );
   }

   @CanIgnoreReturnValue
   @Override
   public String readLine() {
      throw new UnsupportedOperationException("readLine is not supported");
   }

   @Override
   public void readFully(byte[] var1) {
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR.readFully(this, var1);
   }

   @Override
   public void readFully(byte[] var1, int var2, int var3) {
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR.readFully(this, var1, var2, var3);
   }

   @Override
   public int skipBytes(int var1) {
      return (int)this.in.skip(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public int readUnsignedByte() {
      int var1 = this.in.read();
      if (0 > var1) {
         throw new EOFException();
      } else {
         return var1;
      }
   }

   @CanIgnoreReturnValue
   @Override
   public int readUnsignedShort() {
      byte var1 = this.readAndCheckByte();
      byte var2 = this.readAndCheckByte();
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.fromBytes(
         (byte)0, (byte)0, var2, var1
      );
   }

   @CanIgnoreReturnValue
   @Override
   public int readInt() {
      byte var1 = this.readAndCheckByte();
      byte var2 = this.readAndCheckByte();
      byte var3 = this.readAndCheckByte();
      byte var4 = this.readAndCheckByte();
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.fromBytes(
         var4, var3, var2, var1
      );
   }

   @CanIgnoreReturnValue
   @Override
   public long readLong() {
      byte var1 = this.readAndCheckByte();
      byte var2 = this.readAndCheckByte();
      byte var3 = this.readAndCheckByte();
      byte var4 = this.readAndCheckByte();
      byte var5 = this.readAndCheckByte();
      byte var6 = this.readAndCheckByte();
      byte var7 = this.readAndCheckByte();
      byte var8 = this.readAndCheckByte();
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.OCOHORHCROHICRRIHCIHHRRCIHICRI.fromBytes(
         var8, var7, var6, var5, var4, var3, var2, var1
      );
   }

   @CanIgnoreReturnValue
   @Override
   public float readFloat() {
      return Float.intBitsToFloat(this.readInt());
   }

   @CanIgnoreReturnValue
   @Override
   public double readDouble() {
      return Double.longBitsToDouble(this.readLong());
   }

   @CanIgnoreReturnValue
   @Override
   public String readUTF() {
      return new DataInputStream(this.in).readUTF();
   }

   @CanIgnoreReturnValue
   @Override
   public short readShort() {
      return (short)this.readUnsignedShort();
   }

   @CanIgnoreReturnValue
   @Override
   public char readChar() {
      return (char)this.readUnsignedShort();
   }

   @CanIgnoreReturnValue
   @Override
   public byte readByte() {
      return (byte)this.readUnsignedByte();
   }

   @CanIgnoreReturnValue
   @Override
   public boolean readBoolean() {
      return this.readUnsignedByte() != 0;
   }

   private byte readAndCheckByte() {
      int var1 = this.in.read();
      if (-1 == var1) {
         throw new EOFException();
      } else {
         return (byte)var1;
      }
   }
}
