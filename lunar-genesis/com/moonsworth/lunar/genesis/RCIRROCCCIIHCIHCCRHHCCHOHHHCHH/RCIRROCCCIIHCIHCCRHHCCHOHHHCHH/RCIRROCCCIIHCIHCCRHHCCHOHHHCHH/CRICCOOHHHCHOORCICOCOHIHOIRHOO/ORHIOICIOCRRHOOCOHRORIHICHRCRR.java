package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class ORHIOICIOCRRHOOCOHRORIHICHRCRR extends FilterOutputStream implements DataOutput {
   public ORHIOICIOCRRHOOCOHRORIHICHRCRR(OutputStream var1) {
      super(
         new DataOutputStream(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            )
         )
      );
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      this.out.write(var1, var2, var3);
   }

   @Override
   public void writeBoolean(boolean var1) {
      ((DataOutputStream)this.out).writeBoolean(var1);
   }

   @Override
   public void writeByte(int var1) {
      ((DataOutputStream)this.out).writeByte(var1);
   }

   @Deprecated
   @Override
   public void writeBytes(String var1) {
      ((DataOutputStream)this.out).writeBytes(var1);
   }

   @Override
   public void writeChar(int var1) {
      this.writeShort(var1);
   }

   @Override
   public void writeChars(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         this.writeChar(var1.charAt(var2));
      }
   }

   @Override
   public void writeDouble(double var1) {
      this.writeLong(Double.doubleToLongBits(var1));
   }

   @Override
   public void writeFloat(float var1) {
      this.writeInt(Float.floatToIntBits(var1));
   }

   @Override
   public void writeInt(int var1) {
      this.out.write(0xFF & var1);
      this.out.write(0xFF & var1 >> 8);
      this.out.write(0xFF & var1 >> 16);
      this.out.write(0xFF & var1 >> 24);
   }

   @Override
   public void writeLong(long var1) {
      byte[] var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.OCOHORHCROHICRRIHCIHHRRCIHICRI.toByteArray(
         Long.reverseBytes(var1)
      );
      this.write(var3, 0, var3.length);
   }

   @Override
   public void writeShort(int var1) {
      this.out.write(0xFF & var1);
      this.out.write(0xFF & var1 >> 8);
   }

   @Override
   public void writeUTF(String var1) {
      ((DataOutputStream)this.out).writeUTF(var1);
   }

   @Override
   public void close() {
      this.out.close();
   }
}
