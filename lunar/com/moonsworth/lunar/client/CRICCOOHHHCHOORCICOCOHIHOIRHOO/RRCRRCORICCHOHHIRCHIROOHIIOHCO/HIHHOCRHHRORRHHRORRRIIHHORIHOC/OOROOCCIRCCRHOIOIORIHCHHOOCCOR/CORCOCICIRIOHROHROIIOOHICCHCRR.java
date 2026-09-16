package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CORCOCICIRIOHROHROIIOOHICCHCRR extends ByteBuf {
   private final ByteBuf HCHRCICCRHIORHIIRHCCCOIRHORHIH;
   private static final int RIOHRIHIRRCHIRIROCRHHOICOHRROC = 32767;
   private static final ClassValue<Enum<?>[]> HIRCROOCHRCIICIRIRIHROICCIRCIH = new ClassValue<Enum<?>[]>() {
      protected Enum<?>[] RICRIRRCOHRCOCRRHHCRHRROOIOHHR(Class<?> var1) {
         return (Enum<?>[])var1.getEnumConstants();
      }
   };

   public CORCOCICIRIOHROHROIIOOHICCHCRR(ByteBuf var1) {
      this.HCHRCICCRHIORHIIRHCCCOIRHORHIH = var1;
   }

   public String readString() {
      int var1 = this.readVarInt();
      if (var1 > 32767) {
         throw new DecoderException("String length is longer than maximum allowed (" + var1 + " > 32767)");
      }

      if (var1 < 0) {
         throw new DecoderException("String length is less than zero");
      }

      byte[] var2 = new byte[var1];
      this.readBytes(var2);
      return new String(var2, Charsets.UTF_8);
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR RCRICHOCHHHCRCORROOIHCROOIICOC(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      byte[] var2 = var1.getBytes(Charsets.UTF_8);
      this.IIOORRCRHCRIORIOCOHHIROOIIHROC(var2.length);
      this.writeBytes(var2);
      return this;
   }

   public byte[] readByteArray() {
      int var1 = this.readVarInt();
      if (var1 > Math.min(this.readableBytes(), 327670000)) {
         throw new DecoderException("ByteArray with size " + var1 + " is bigger than allowed, " + this.readableBytes() + " bytes available");
      }

      byte[] var2 = new byte[var1];
      this.readBytes(var2);
      return var2;
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR RRCRRCORICCHOHHIRCHIROOHIIOHCO(byte[] var1) {
      this.IIOORRCRHCRIORIOCOHHIROOIIHROC(var1.length);
      this.writeBytes(var1);
      return this;
   }

   public List<Integer> IHHCOOCOCHIOOIICORIIIOHOIHOOCH() {
      int var1 = this.readVarInt();
      if (var1 > Math.min(this.readableBytes(), 32767)) {
         throw new DecoderException("VarIntList with size " + var1 + " is bigger than buffer than allowed");
      }

      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(this.readVarInt());
      }

      return var2;
   }

   public int[] HHRCRCROOIRHICRCCOCOCCICIICIHO() {
      int var1 = this.readVarInt();
      if (var1 > Math.min(this.readableBytes(), 32767)) {
         throw new DecoderException("VarIntArray with size " + var1 + " is bigger than buffer than allowed");
      }

      int[] var2 = new int[var1];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = this.readVarInt();
      }

      return var2;
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(List<Integer> var1) {
      this.IIOORRCRHCRIORIOCOHHIROOIIHROC(var1.size());

      for (int var3 : var1) {
         this.IIOORRCRHCRIORIOCOHHIROOIIHROC(var3);
      }

      return this;
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR CRICCOOHHHCHOORCICOCOHIHOIRHOO(int[] var1) {
      this.IIOORRCRHCRIORIOCOHHIROOIIHROC(var1.length);

      for (int var5 : var1) {
         this.IIOORRCRHCRIORIOCOHHIROOIIHROC(var5);
      }

      return this;
   }

   public long[] ROORHIOCOHHRIOHHOOCCOHCIOOCIRO() {
      int var1 = this.readVarInt();
      if (var1 > Math.min(this.readableBytes() / 8, 32767)) {
         throw new DecoderException("LongArray with size " + var1 + " is bigger than allowed");
      }

      long[] var2 = new long[var1];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = this.readLong();
      }

      return var2;
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long[] var1) {
      this.IIOORRCRHCRIORIOCOHHIROOIIHROC(var1.length);

      for (long var5 : var1) {
         this.writeLong(var5);
      }

      return this;
   }

   public <T extends Enum<T>> T IRRCCOICORICIHCHRHIHIHROIRHOCR(Class<T> var1) {
      return (T)HIRCROOCHRCIICIRIRIHROICCIRCIH.get(var1)[this.readVarInt()];
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Enum<?> var1) {
      this.IIOORRCRHCRIORIOCOHHIROOIIHROC(var1.ordinal());
      return this;
   }

   public int readVarInt() {
      int var1 = 0;
      int var2 = 0;

      byte var3;
      do {
         var3 = this.readByte();
         var1 |= (var3 & 127) << var2++ * 7;
         if (var2 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while ((var3 & 128) == 128);

      return var1;
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR IIOORRCRHCRIORIOCOHHIROOIIHROC(int var1) {
      while ((var1 & -128) != 0) {
         this.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.writeByte(var1);
      return this;
   }

   public static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(DataInputStream var0) {
      int var1 = 0;
      int var2 = 0;

      byte var3;
      do {
         var3 = var0.readByte();
         var1 |= (var3 & 127) << var2++ * 7;
         if (var2 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while ((var3 & 128) == 128);

      return var1;
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DataOutputStream var0, int var1) {
      while ((var1 & -128) != 0) {
         var0.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      var0.writeByte(var1);
   }

   public UUID OIHRCCIHORCHIRHOIHRCCOOOIOROCI() {
      return new UUID(this.readLong(), this.readLong());
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR OHRRHHOCROROCCIRROIHOCCHCIHCIR(UUID var1) {
      this.writeLong(var1.getMostSignificantBits());
      this.writeLong(var1.getLeastSignificantBits());
      return this;
   }

   public int capacity() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.capacity();
   }

   public ByteBuf capacity(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.capacity(var1);
   }

   public int maxCapacity() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.alloc();
   }

   public ByteOrder order() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.order();
   }

   public ByteBuf order(ByteOrder var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.order(var1);
   }

   public ByteBuf unwrap() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.unwrap();
   }

   public boolean isDirect() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.isDirect();
   }

   public int readerIndex() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readerIndex();
   }

   public ByteBuf readerIndex(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readerIndex(var1);
   }

   public int writerIndex() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writerIndex();
   }

   public ByteBuf writerIndex(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writerIndex(var1);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setIndex(var1, var2);
   }

   public int readableBytes() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readableBytes();
   }

   public int writableBytes() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writableBytes();
   }

   public int maxWritableBytes() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.isReadable();
   }

   public boolean isReadable(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.isReadable(var1);
   }

   public boolean isWritable() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.isWritable();
   }

   public boolean isWritable(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.isWritable(var1);
   }

   public ByteBuf clear() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.clear();
   }

   public ByteBuf markReaderIndex() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.resetReaderIndex();
   }

   public ByteBuf markWriterIndex() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.markWriterIndex();
   }

   public ByteBuf resetWriterIndex() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.resetWriterIndex();
   }

   public ByteBuf discardReadBytes() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.discardReadBytes();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.discardSomeReadBytes();
   }

   public ByteBuf ensureWritable(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.ensureWritable(var1, var2);
   }

   public boolean getBoolean(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getByte(var1);
   }

   public short getUnsignedByte(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getUnsignedByte(var1);
   }

   public short getShort(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getShort(var1);
   }

   public int getUnsignedShort(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getUnsignedShort(var1);
   }

   public int getMedium(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getMedium(var1);
   }

   public int getUnsignedMedium(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getUnsignedMedium(var1);
   }

   public int getInt(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getInt(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getUnsignedInt(var1);
   }

   public long getLong(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getLong(var1);
   }

   public char getChar(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getChar(var1);
   }

   public float getFloat(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getDouble(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.getBytes(var1, var2, var3);
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setByte(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setShort(var1, var2);
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setMedium(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setInt(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setLong(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setChar(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setDouble(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setBytes(var1, var2);
   }

   public int setBytes(int var1, InputStream var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setBytes(var1, var2, var3);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.setZero(var1, var2);
   }

   public boolean readBoolean() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBoolean();
   }

   public byte readByte() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readByte();
   }

   public short readUnsignedByte() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readUnsignedByte();
   }

   public short readShort() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readShort();
   }

   public int readUnsignedShort() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readUnsignedShort();
   }

   public int readMedium() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readMedium();
   }

   public int readUnsignedMedium() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readUnsignedMedium();
   }

   public int readInt() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readInt();
   }

   public long readUnsignedInt() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readUnsignedInt();
   }

   public long readLong() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readLong();
   }

   public char readChar() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readChar();
   }

   public float readFloat() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readFloat();
   }

   public double readDouble() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readDouble();
   }

   public ByteBuf readBytes(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBytes(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readSlice(var1);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBytes(var1);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBytes(var1, var2);
   }

   public int readBytes(GatheringByteChannel var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.readBytes(var1, var2);
   }

   public ByteBuf skipBytes(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.skipBytes(var1);
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeByte(var1);
   }

   public ByteBuf writeShort(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeShort(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeMedium(var1);
   }

   public ByteBuf writeInt(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeInt(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeLong(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeChar(var1);
   }

   public ByteBuf writeFloat(float var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeFloat(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeDouble(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeBytes(var1);
   }

   public int writeBytes(InputStream var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeBytes(var1, var2);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeBytes(var1, var2);
   }

   public ByteBuf writeZero(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.writeZero(var1);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.indexOf(var1, var2, var3);
   }

   public int bytesBefore(byte var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.bytesBefore(var1);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.bytesBefore(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.bytesBefore(var1, var2, var3);
   }

   public int forEachByte(ByteBufProcessor var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteBufProcessor var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.forEachByte(var1, var2, var3);
   }

   public int forEachByteDesc(ByteBufProcessor var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.forEachByteDesc(var1);
   }

   public int forEachByteDesc(int var1, int var2, ByteBufProcessor var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.forEachByteDesc(var1, var2, var3);
   }

   public ByteBuf copy() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.copy(var1, var2);
   }

   public ByteBuf slice() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.slice();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.slice(var1, var2);
   }

   public ByteBuf duplicate() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.duplicate();
   }

   public int nioBufferCount() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.nioBuffer();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.nioBuffer(var1, var2);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.internalNioBuffer(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.nioBuffers(var1, var2);
   }

   public boolean hasArray() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.hasArray();
   }

   public byte[] array() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.array();
   }

   public int arrayOffset() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.memoryAddress();
   }

   public String toString(Charset var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.toString(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.toString(var1, var2, var3);
   }

   public int hashCode() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.hashCode();
   }

   public boolean equals(Object var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.equals(var1);
   }

   public int compareTo(ByteBuf var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.compareTo(var1);
   }

   public String toString() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.toString();
   }

   public ByteBuf retain(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.retain(var1);
   }

   public boolean release() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.release();
   }

   public boolean release(int var1) {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.release(var1);
   }

   public int refCnt() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.refCnt();
   }

   public ByteBuf retain() {
      return this.HCHRCICCRHIORHIIRHCCCOIRHORHIH.retain();
   }
}
