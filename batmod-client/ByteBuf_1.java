import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP extends ByteBuf {
   private final ByteBuf BatModClient;

   public kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP(ByteBuf var1) {
      this.BatModClient = var1;
   }

   public static int BatModClient(int var0) {
      for (int var1 = 1; var1 < 5; var1++) {
         if ((var0 & -1 << var1 * 7) == 0) {
            return var1;
         }
      }

      return 5;
   }

   public void BatModClient(byte[] var1) {
      this.Button(var1.length);
      this.writeBytes(var1);
   }

   public byte[] BatModClient() {
      byte[] var1 = new byte[this.Button()];
      this.readBytes(var1);
      return var1;
   }

   public Enum BatModClient(Class var1) {
      return ((Enum[])var1.getEnumConstants())[this.Button()];
   }

   public void BatModClient(Enum var1) {
      this.Button(var1.ordinal());
   }

   public int Button() {
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

   public long CustomSpinner() {
      long var1 = 0L;
      int var3 = 0;

      byte var4;
      do {
         var4 = this.readByte();
         var1 |= (long)(var4 & 127) << var3++ * 7;
         if (var3 > 10) {
            throw new RuntimeException("VarLong too big");
         }
      } while ((var4 & 128) == 128);

      return var1;
   }

   public void BatModClient(UUID var1) {
      this.writeLong(var1.getMostSignificantBits());
      this.writeLong(var1.getLeastSignificantBits());
   }

   public UUID ButtonAction() {
      return new UUID(this.readLong(), this.readLong());
   }

   public void Button(int var1) {
      while ((var1 & -128) != 0) {
         this.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.writeByte(var1);
   }

   public void BatModClient(long var1) {
      while ((var1 & -128L) != 0L) {
         this.writeByte((int)(var1 & 127L) | 128);
         var1 >>>= 7;
      }

      this.writeByte((int)var1);
   }

   public String CustomSpinner(int var1) {
      int var2 = this.Button();
      if (var2 > var1 * 4) {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + var2 + " > " + var1 * 4 + ")");
      } else if (var2 < 0) {
         throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
      } else {
         String var3 = this.readBytes(var2).toString(StandardCharsets.UTF_8);
         if (var3.length() > var1) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + var2 + " > " + var1 + ")");
         } else {
            return var3;
         }
      }
   }

   public kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP BatModClient(
      String var1
   ) {
      byte[] var2 = var1.getBytes(StandardCharsets.UTF_8);
      if (var2.length > 32767) {
         throw new EncoderException("String too big (was " + var1.length() + " bytes encoded, max " + 32767 + ")");
      }

      this.Button(var2.length);
      this.writeBytes(var2);
      return this;
   }

   public int capacity() {
      return this.BatModClient.capacity();
   }

   public ByteBuf capacity(int var1) {
      return this.BatModClient.capacity(var1);
   }

   public int maxCapacity() {
      return this.BatModClient.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.BatModClient.alloc();
   }

   public ByteOrder order() {
      return this.BatModClient.order();
   }

   public ByteBuf order(ByteOrder var1) {
      return this.BatModClient.order(var1);
   }

   public ByteBuf unwrap() {
      return this.BatModClient.unwrap();
   }

   public boolean isDirect() {
      return this.BatModClient.isDirect();
   }

   public int readerIndex() {
      return this.BatModClient.readerIndex();
   }

   public ByteBuf readerIndex(int var1) {
      return this.BatModClient.readerIndex(var1);
   }

   public int writerIndex() {
      return this.BatModClient.writerIndex();
   }

   public ByteBuf writerIndex(int var1) {
      return this.BatModClient.writerIndex(var1);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.BatModClient.setIndex(var1, var2);
   }

   public int readableBytes() {
      return this.BatModClient.readableBytes();
   }

   public int writableBytes() {
      return this.BatModClient.writableBytes();
   }

   public int maxWritableBytes() {
      return this.BatModClient.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.BatModClient.isReadable();
   }

   public boolean isReadable(int var1) {
      return this.BatModClient.isReadable(var1);
   }

   public boolean isWritable() {
      return this.BatModClient.isWritable();
   }

   public boolean isWritable(int var1) {
      return this.BatModClient.isWritable(var1);
   }

   public ByteBuf clear() {
      return this.BatModClient.clear();
   }

   public ByteBuf markReaderIndex() {
      return this.BatModClient.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.BatModClient.resetReaderIndex();
   }

   public ByteBuf markWriterIndex() {
      return this.BatModClient.markWriterIndex();
   }

   public ByteBuf resetWriterIndex() {
      return this.BatModClient.resetWriterIndex();
   }

   public ByteBuf discardReadBytes() {
      return this.BatModClient.discardReadBytes();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.BatModClient.discardSomeReadBytes();
   }

   public ByteBuf ensureWritable(int var1) {
      return this.BatModClient.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.BatModClient.ensureWritable(var1, var2);
   }

   public boolean getBoolean(int var1) {
      return this.BatModClient.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.BatModClient.getByte(var1);
   }

   public short getUnsignedByte(int var1) {
      return this.BatModClient.getUnsignedByte(var1);
   }

   public short getShort(int var1) {
      return this.BatModClient.getShort(var1);
   }

   public int getUnsignedShort(int var1) {
      return this.BatModClient.getUnsignedShort(var1);
   }

   public int getMedium(int var1) {
      return this.BatModClient.getMedium(var1);
   }

   public int getUnsignedMedium(int var1) {
      return this.BatModClient.getUnsignedMedium(var1);
   }

   public int getInt(int var1) {
      return this.BatModClient.getInt(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.BatModClient.getUnsignedInt(var1);
   }

   public long getLong(int var1) {
      return this.BatModClient.getLong(var1);
   }

   public char getChar(int var1) {
      return this.BatModClient.getChar(var1);
   }

   public float getFloat(int var1) {
      return this.BatModClient.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.BatModClient.getDouble(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.BatModClient.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.BatModClient.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.BatModClient.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.BatModClient.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.BatModClient.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.BatModClient.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) {
      return this.BatModClient.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) {
      return this.BatModClient.getBytes(var1, var2, var3);
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.BatModClient.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.BatModClient.setByte(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.BatModClient.setShort(var1, var2);
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.BatModClient.setMedium(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.BatModClient.setInt(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.BatModClient.setLong(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.BatModClient.setChar(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.BatModClient.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.BatModClient.setDouble(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.BatModClient.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.BatModClient.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.BatModClient.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.BatModClient.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.BatModClient.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.BatModClient.setBytes(var1, var2);
   }

   public int setBytes(int var1, InputStream var2, int var3) {
      return this.BatModClient.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) {
      return this.BatModClient.setBytes(var1, var2, var3);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.BatModClient.setZero(var1, var2);
   }

   public boolean readBoolean() {
      return this.BatModClient.readBoolean();
   }

   public byte readByte() {
      return this.BatModClient.readByte();
   }

   public short readUnsignedByte() {
      return this.BatModClient.readUnsignedByte();
   }

   public short readShort() {
      return this.BatModClient.readShort();
   }

   public int readUnsignedShort() {
      return this.BatModClient.readUnsignedShort();
   }

   public int readMedium() {
      return this.BatModClient.readMedium();
   }

   public int readUnsignedMedium() {
      return this.BatModClient.readUnsignedMedium();
   }

   public int readInt() {
      return this.BatModClient.readInt();
   }

   public long readUnsignedInt() {
      return this.BatModClient.readUnsignedInt();
   }

   public long readLong() {
      return this.BatModClient.readLong();
   }

   public char readChar() {
      return this.BatModClient.readChar();
   }

   public float readFloat() {
      return this.BatModClient.readFloat();
   }

   public double readDouble() {
      return this.BatModClient.readDouble();
   }

   public ByteBuf readBytes(int var1) {
      return this.BatModClient.readBytes(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.BatModClient.readSlice(var1);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.BatModClient.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.BatModClient.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.BatModClient.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.BatModClient.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.BatModClient.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.BatModClient.readBytes(var1);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) {
      return this.BatModClient.readBytes(var1, var2);
   }

   public int readBytes(GatheringByteChannel var1, int var2) {
      return this.BatModClient.readBytes(var1, var2);
   }

   public ByteBuf skipBytes(int var1) {
      return this.BatModClient.skipBytes(var1);
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.BatModClient.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.BatModClient.writeByte(var1);
   }

   public ByteBuf writeShort(int var1) {
      return this.BatModClient.writeShort(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.BatModClient.writeMedium(var1);
   }

   public ByteBuf writeInt(int var1) {
      return this.BatModClient.writeInt(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.BatModClient.writeLong(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.BatModClient.writeChar(var1);
   }

   public ByteBuf writeFloat(float var1) {
      return this.BatModClient.writeFloat(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.BatModClient.writeDouble(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.BatModClient.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.BatModClient.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.BatModClient.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.BatModClient.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.BatModClient.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.BatModClient.writeBytes(var1);
   }

   public int writeBytes(InputStream var1, int var2) {
      return this.BatModClient.writeBytes(var1, var2);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) {
      return this.BatModClient.writeBytes(var1, var2);
   }

   public ByteBuf writeZero(int var1) {
      return this.BatModClient.writeZero(var1);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.BatModClient.indexOf(var1, var2, var3);
   }

   public int bytesBefore(byte var1) {
      return this.BatModClient.bytesBefore(var1);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.BatModClient.bytesBefore(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.BatModClient.bytesBefore(var1, var2, var3);
   }

   public int forEachByte(ByteBufProcessor var1) {
      return this.BatModClient.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteBufProcessor var3) {
      return this.BatModClient.forEachByte(var1, var2, var3);
   }

   public int forEachByteDesc(ByteBufProcessor var1) {
      return this.BatModClient.forEachByteDesc(var1);
   }

   public int forEachByteDesc(int var1, int var2, ByteBufProcessor var3) {
      return this.BatModClient.forEachByteDesc(var1, var2, var3);
   }

   public ByteBuf copy() {
      return this.BatModClient.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.BatModClient.copy(var1, var2);
   }

   public ByteBuf slice() {
      return this.BatModClient.slice();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.BatModClient.slice(var1, var2);
   }

   public ByteBuf duplicate() {
      return this.BatModClient.duplicate();
   }

   public int nioBufferCount() {
      return this.BatModClient.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.BatModClient.nioBuffer();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.BatModClient.nioBuffer(var1, var2);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.BatModClient.internalNioBuffer(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.BatModClient.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.BatModClient.nioBuffers(var1, var2);
   }

   public boolean hasArray() {
      return this.BatModClient.hasArray();
   }

   public byte[] array() {
      return this.BatModClient.array();
   }

   public int arrayOffset() {
      return this.BatModClient.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.BatModClient.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.BatModClient.memoryAddress();
   }

   public String toString(Charset var1) {
      return this.BatModClient.toString(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.BatModClient.toString(var1, var2, var3);
   }

   public int hashCode() {
      return this.BatModClient.hashCode();
   }

   public boolean equals(Object var1) {
      return this.BatModClient.equals(var1);
   }

   public int compareTo(ByteBuf var1) {
      return this.BatModClient.compareTo(var1);
   }

   public String toString() {
      return this.BatModClient.toString();
   }

   public ByteBuf retain(int var1) {
      return this.BatModClient.retain(var1);
   }

   public ByteBuf retain() {
      return this.BatModClient.retain();
   }

   public int refCnt() {
      return this.BatModClient.refCnt();
   }

   public boolean release() {
      return this.BatModClient.release();
   }

   public boolean release(int var1) {
      return this.BatModClient.release(var1);
   }
}
