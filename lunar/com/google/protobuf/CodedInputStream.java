package com.google.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class CodedInputStream {
   private static final int DEFAULT_BUFFER_SIZE = 4096;
   private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
   private static volatile int defaultRecursionLimit = 100;
   int recursionDepth;
   int recursionLimit = defaultRecursionLimit;
   int sizeLimit = Integer.MAX_VALUE;
   CodedInputStreamReader wrapper;
   private boolean shouldDiscardUnknownFields = false;

   public static CodedInputStream newInstance(InputStream var0) {
      return newInstance(var0, 4096);
   }

   public static CodedInputStream newInstance(InputStream var0, int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("bufferSize must be > 0");
      } else {
         return var0 == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new CodedInputStream.StreamDecoder(var0, var1);
      }
   }

   public static CodedInputStream newInstance(Iterable<ByteBuffer> var0) {
      return !CodedInputStream.UnsafeDirectNioDecoder.isSupported() ? newInstance(new IterableByteBufferInputStream(var0)) : newInstance(var0, false);
   }

   static CodedInputStream newInstance(Iterable<ByteBuffer> var0, boolean var1) {
      byte var2 = 0;
      int var3 = 0;

      for (ByteBuffer var5 : var0) {
         var3 += var5.remaining();
         if (var5.hasArray()) {
            var2 |= 1;
         } else if (var5.isDirect()) {
            var2 |= 2;
         } else {
            var2 |= 4;
         }
      }

      return var2 == 2 ? new CodedInputStream.IterableDirectByteBufferDecoder(var0, var3, var1) : newInstance(new IterableByteBufferInputStream(var0));
   }

   public static CodedInputStream newInstance(byte[] var0) {
      return newInstance(var0, 0, var0.length);
   }

   public static CodedInputStream newInstance(byte[] var0, int var1, int var2) {
      return newInstance(var0, var1, var2, false);
   }

   static CodedInputStream newInstance(byte[] var0, int var1, int var2, boolean var3) {
      CodedInputStream.ArrayDecoder var4 = new CodedInputStream.ArrayDecoder(var0, var1, var2, var3);

      try {
         var4.pushLimit(var2);
         return var4;
      } catch (InvalidProtocolBufferException var6) {
         throw new IllegalArgumentException(var6);
      }
   }

   public static CodedInputStream newInstance(ByteBuffer var0) {
      return newInstance(var0, false);
   }

   static CodedInputStream newInstance(ByteBuffer var0, boolean var1) {
      if (var0.hasArray()) {
         return newInstance(var0.array(), var0.arrayOffset() + var0.position(), var0.remaining(), var1);
      }

      if (var0.isDirect() && CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
         return new CodedInputStream.UnsafeDirectNioDecoder(var0, var1);
      }

      byte[] var2 = new byte[var0.remaining()];
      var0.duplicate().get(var2);
      return newInstance(var2, 0, var2.length, true);
   }

   public void checkRecursionLimit() {
      if (this.recursionDepth >= this.recursionLimit) {
         throw InvalidProtocolBufferException.recursionLimitExceeded();
      }
   }

   private CodedInputStream() {
   }

   public abstract int readTag();

   public abstract void checkLastTagWas(int var1);

   public abstract int getLastTag();

   public abstract boolean skipField(int var1);

   @Deprecated
   public abstract boolean skipField(int var1, CodedOutputStream var2);

   public abstract void skipMessage();

   public abstract void skipMessage(CodedOutputStream var1);

   public abstract double readDouble();

   public abstract float readFloat();

   public abstract long readUInt64();

   public abstract long readInt64();

   public abstract int readInt32();

   public abstract long readFixed64();

   public abstract int readFixed32();

   public abstract boolean readBool();

   public abstract String readString();

   public abstract String readStringRequireUtf8();

   public abstract void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3);

   public abstract <T extends MessageLite> T readGroup(int var1, Parser<T> var2, ExtensionRegistryLite var3);

   @Deprecated
   public abstract void readUnknownGroup(int var1, MessageLite.Builder var2);

   public abstract void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2);

   public abstract <T extends MessageLite> T readMessage(Parser<T> var1, ExtensionRegistryLite var2);

   public abstract ByteString readBytes();

   public abstract byte[] readByteArray();

   public abstract ByteBuffer readByteBuffer();

   public abstract int readUInt32();

   public abstract int readEnum();

   public abstract int readSFixed32();

   public abstract long readSFixed64();

   public abstract int readSInt32();

   public abstract long readSInt64();

   public abstract int readRawVarint32();

   public abstract long readRawVarint64();

   abstract long readRawVarint64SlowPath();

   public abstract int readRawLittleEndian32();

   public abstract long readRawLittleEndian64();

   public abstract void enableAliasing(boolean var1);

   public final int setRecursionLimit(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Recursion limit cannot be negative: " + var1);
      }

      int var2 = this.recursionLimit;
      this.recursionLimit = var1;
      return var2;
   }

   public final int setSizeLimit(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Size limit cannot be negative: " + var1);
      }

      int var2 = this.sizeLimit;
      this.sizeLimit = var1;
      return var2;
   }

   final void discardUnknownFields() {
      this.shouldDiscardUnknownFields = true;
   }

   final void unsetDiscardUnknownFields() {
      this.shouldDiscardUnknownFields = false;
   }

   final boolean shouldDiscardUnknownFields() {
      return this.shouldDiscardUnknownFields;
   }

   public abstract void resetSizeCounter();

   public abstract int pushLimit(int var1);

   public abstract void popLimit(int var1);

   public abstract int getBytesUntilLimit();

   public abstract boolean isAtEnd();

   public abstract int getTotalBytesRead();

   public abstract byte readRawByte();

   public abstract byte[] readRawBytes(int var1);

   public abstract void skipRawBytes(int var1);

   public static int decodeZigZag32(int var0) {
      return var0 >>> 1 ^ -(var0 & 1);
   }

   public static long decodeZigZag64(long var0) {
      return var0 >>> 1 ^ -(var0 & 1L);
   }

   public static int readRawVarint32(int var0, InputStream var1) {
      if ((var0 & 128) == 0) {
         return var0;
      }

      int var2 = var0 & 127;

      byte var3;
      for (var3 = 7; var3 < 32; var3 += 7) {
         int var4 = var1.read();
         if (var4 == -1) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         var2 |= (var4 & 127) << var3;
         if ((var4 & 128) == 0) {
            return var2;
         }
      }

      while (var3 < 64) {
         int var5 = var1.read();
         if (var5 == -1) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         if ((var5 & 128) == 0) {
            return var2;
         }

         var3 += 7;
      }

      throw InvalidProtocolBufferException.malformedVarint();
   }

   static int readRawVarint32(InputStream var0) {
      int var1 = var0.read();
      if (var1 == -1) {
         throw InvalidProtocolBufferException.truncatedMessage();
      } else {
         return readRawVarint32(var1, var0);
      }
   }

   private static final class ArrayDecoder extends CodedInputStream {
      private final byte[] buffer;
      private final boolean immutable;
      private int limit;
      private int bufferSizeAfterLimit;
      private int pos;
      private int startPos;
      private int lastTag;
      private boolean enableAliasing;
      private int currentLimit = Integer.MAX_VALUE;

      private ArrayDecoder(byte[] var1, int var2, int var3, boolean var4) {
         this.buffer = var1;
         this.limit = var2 + var3;
         this.pos = var2;
         this.startPos = this.pos;
         this.immutable = var4;
      }

      @Override
      public int readTag() {
         if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
         } else {
            this.lastTag = this.readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) == 0) {
               throw InvalidProtocolBufferException.invalidTag();
            } else {
               return this.lastTag;
            }
         }
      }

      @Override
      public void checkLastTagWas(int var1) {
         if (this.lastTag != var1) {
            throw InvalidProtocolBufferException.invalidEndTag();
         }
      }

      @Override
      public int getLastTag() {
         return this.lastTag;
      }

      @Override
      public boolean skipField(int var1) {
         switch (WireFormat.getTagWireType(var1)) {
            case 0:
               this.skipRawVarint();
               return true;
            case 1:
               this.skipRawBytes(8);
               return true;
            case 2:
               this.skipRawBytes(this.readRawVarint32());
               return true;
            case 3:
               this.skipMessage();
               this.checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4));
               return true;
            case 4:
               return false;
            case 5:
               this.skipRawBytes(4);
               return true;
            default:
               throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      @Override
      public boolean skipField(int var1, CodedOutputStream var2) {
         switch (WireFormat.getTagWireType(var1)) {
            case 0:
               long var8 = this.readInt64();
               var2.writeUInt32NoTag(var1);
               var2.writeUInt64NoTag(var8);
               return true;
            case 1:
               long var7 = this.readRawLittleEndian64();
               var2.writeUInt32NoTag(var1);
               var2.writeFixed64NoTag(var7);
               return true;
            case 2:
               ByteString var6 = this.readBytes();
               var2.writeUInt32NoTag(var1);
               var2.writeBytesNoTag(var6);
               return true;
            case 3:
               var2.writeUInt32NoTag(var1);
               this.skipMessage(var2);
               int var5 = WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4);
               this.checkLastTagWas(var5);
               var2.writeUInt32NoTag(var5);
               return true;
            case 4:
               return false;
            case 5:
               int var3 = this.readRawLittleEndian32();
               var2.writeUInt32NoTag(var1);
               var2.writeFixed32NoTag(var3);
               return true;
            default:
               throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      @Override
      public void skipMessage() {
         int var1;
         do {
            var1 = this.readTag();
         } while (var1 != 0 && this.skipField(var1));
      }

      @Override
      public void skipMessage(CodedOutputStream var1) {
         int var2;
         do {
            var2 = this.readTag();
         } while (var2 != 0 && this.skipField(var2, var1));
      }

      @Override
      public double readDouble() {
         return Double.longBitsToDouble(this.readRawLittleEndian64());
      }

      @Override
      public float readFloat() {
         return Float.intBitsToFloat(this.readRawLittleEndian32());
      }

      @Override
      public long readUInt64() {
         return this.readRawVarint64();
      }

      @Override
      public long readInt64() {
         return this.readRawVarint64();
      }

      @Override
      public int readInt32() {
         return this.readRawVarint32();
      }

      @Override
      public long readFixed64() {
         return this.readRawLittleEndian64();
      }

      @Override
      public int readFixed32() {
         return this.readRawLittleEndian32();
      }

      @Override
      public boolean readBool() {
         return this.readRawVarint64() != 0L;
      }

      @Override
      public String readString() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            String var2 = new String(this.buffer, this.pos, var1, Internal.UTF_8);
            this.pos += var1;
            return var2;
         } else if (var1 == 0) {
            return "";
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public String readStringRequireUtf8() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            String var2 = Utf8.decodeUtf8(this.buffer, this.pos, var1);
            this.pos += var1;
            return var2;
         } else if (var1 == 0) {
            return "";
         } else if (var1 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3) {
         this.checkRecursionLimit();
         this.recursionDepth++;
         var2.mergeFrom(this, var3);
         this.checkLastTagWas(WireFormat.makeTag(var1, 4));
         this.recursionDepth--;
      }

      @Override
      public <T extends MessageLite> T readGroup(int var1, Parser<T> var2, ExtensionRegistryLite var3) {
         this.checkRecursionLimit();
         this.recursionDepth++;
         MessageLite var4 = (MessageLite)var2.parsePartialFrom(this, var3);
         this.checkLastTagWas(WireFormat.makeTag(var1, 4));
         this.recursionDepth--;
         return (T)var4;
      }

      @Deprecated
      @Override
      public void readUnknownGroup(int var1, MessageLite.Builder var2) {
         this.readGroup(var1, var2, ExtensionRegistryLite.getEmptyRegistry());
      }

      @Override
      public void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2) {
         int var3 = this.readRawVarint32();
         this.checkRecursionLimit();
         int var4 = this.pushLimit(var3);
         this.recursionDepth++;
         var1.mergeFrom(this, var2);
         this.checkLastTagWas(0);
         this.recursionDepth--;
         if (this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.popLimit(var4);
      }

      @Override
      public <T extends MessageLite> T readMessage(Parser<T> var1, ExtensionRegistryLite var2) {
         int var3 = this.readRawVarint32();
         this.checkRecursionLimit();
         int var4 = this.pushLimit(var3);
         this.recursionDepth++;
         MessageLite var5 = (MessageLite)var1.parsePartialFrom(this, var2);
         this.checkLastTagWas(0);
         this.recursionDepth--;
         if (this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.popLimit(var4);
         return (T)var5;
      }

      @Override
      public ByteString readBytes() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            ByteString var2 = this.immutable && this.enableAliasing
               ? ByteString.wrap(this.buffer, this.pos, var1)
               : ByteString.copyFrom(this.buffer, this.pos, var1);
            this.pos += var1;
            return var2;
         } else {
            return var1 == 0 ? ByteString.EMPTY : ByteString.wrap(this.readRawBytes(var1));
         }
      }

      @Override
      public byte[] readByteArray() {
         int var1 = this.readRawVarint32();
         return this.readRawBytes(var1);
      }

      @Override
      public ByteBuffer readByteBuffer() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            ByteBuffer var2 = !this.immutable && this.enableAliasing
               ? ByteBuffer.wrap(this.buffer, this.pos, var1).slice()
               : ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, this.pos, this.pos + var1));
            this.pos += var1;
            return var2;
         } else if (var1 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public int readUInt32() {
         return this.readRawVarint32();
      }

      @Override
      public int readEnum() {
         return this.readRawVarint32();
      }

      @Override
      public int readSFixed32() {
         return this.readRawLittleEndian32();
      }

      @Override
      public long readSFixed64() {
         return this.readRawLittleEndian64();
      }

      @Override
      public int readSInt32() {
         return decodeZigZag32(this.readRawVarint32());
      }

      @Override
      public long readSInt64() {
         return decodeZigZag64(this.readRawVarint64());
      }

      @Override
      public int readRawVarint32() {
         int var1;
         int var11;
         label47: {
            var1 = this.pos;
            if (this.limit != var1) {
               byte[] var2 = this.buffer;
               byte var3;
               if ((var3 = var2[var1++]) >= 0) {
                  this.pos = var1;
                  return var3;
               }

               if (this.limit - var1 >= 9) {
                  if ((var3 = var3 ^ var2[var1++] << 7) < 0) {
                     var11 = var3 ^ -128;
                     break label47;
                  }

                  if ((var3 = var3 ^ var2[var1++] << 14) >= 0) {
                     var11 = var3 ^ 16256;
                     break label47;
                  }

                  if ((var3 = var3 ^ var2[var1++] << 21) < 0) {
                     var11 = var3 ^ -2080896;
                     break label47;
                  }

                  byte var4 = var2[var1++];
                  var3 ^= var4 << 28;
                  var11 = var3 ^ 266354560;
                  if (var4 >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0) {
                     break label47;
                  }
               }
            }

            return (int)this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var11;
      }

      private void skipRawVarint() {
         if (this.limit - this.pos >= 10) {
            this.skipRawVarintFastPath();
         } else {
            this.skipRawVarintSlowPath();
         }
      }

      private void skipRawVarintFastPath() {
         for (int var1 = 0; var1 < 10; var1++) {
            if (this.buffer[this.pos++] >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      private void skipRawVarintSlowPath() {
         for (int var1 = 0; var1 < 10; var1++) {
            if (this.readRawByte() >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      @Override
      public long readRawVarint64() {
         int var1;
         long var12;
         label51: {
            var1 = this.pos;
            if (this.limit != var1) {
               byte[] var2 = this.buffer;
               byte var5;
               if ((var5 = var2[var1++]) >= 0) {
                  this.pos = var1;
                  return var5;
               }

               if (this.limit - var1 >= 9) {
                  if ((var5 = var5 ^ var2[var1++] << 7) < 0) {
                     var12 = var5 ^ -128;
                     break label51;
                  }

                  if ((var5 = var5 ^ var2[var1++] << 14) >= 0) {
                     var12 = var5 ^ 16256;
                     break label51;
                  }

                  if ((var5 = var5 ^ var2[var1++] << 21) < 0) {
                     var12 = var5 ^ -2080896;
                     break label51;
                  }

                  if ((var12 = var5 ^ (long)var2[var1++] << 28) >= 0L) {
                     var12 ^= 266354560L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)var2[var1++] << 35) < 0L) {
                     var12 ^= -34093383808L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)var2[var1++] << 42) >= 0L) {
                     var12 ^= 4363953127296L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)var2[var1++] << 49) < 0L) {
                     var12 ^= -558586000294016L;
                     break label51;
                  }

                  var12 ^= (long)var2[var1++] << 56;
                  var12 ^= 71499008037633920L;
                  if (var12 >= 0L || var2[var1++] >= 0L) {
                     break label51;
                  }
               }
            }

            return this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var12;
      }

      @Override
      long readRawVarint64SlowPath() {
         long var1 = 0L;

         for (byte var3 = 0; var3 < 64; var3 += 7) {
            byte var4 = this.readRawByte();
            var1 |= (long)(var4 & 127) << var3;
            if ((var4 & 128) == 0) {
               return var1;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      @Override
      public int readRawLittleEndian32() {
         int var1 = this.pos;
         if (this.limit - var1 < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         byte[] var2 = this.buffer;
         this.pos = var1 + 4;
         return var2[var1] & 0xFF | (var2[var1 + 1] & 0xFF) << 8 | (var2[var1 + 2] & 0xFF) << 16 | (var2[var1 + 3] & 0xFF) << 24;
      }

      @Override
      public long readRawLittleEndian64() {
         int var1 = this.pos;
         if (this.limit - var1 < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         byte[] var2 = this.buffer;
         this.pos = var1 + 8;
         return var2[var1] & 255L
            | (var2[var1 + 1] & 255L) << 8
            | (var2[var1 + 2] & 255L) << 16
            | (var2[var1 + 3] & 255L) << 24
            | (var2[var1 + 4] & 255L) << 32
            | (var2[var1 + 5] & 255L) << 40
            | (var2[var1 + 6] & 255L) << 48
            | (var2[var1 + 7] & 255L) << 56;
      }

      @Override
      public void enableAliasing(boolean var1) {
         this.enableAliasing = var1;
      }

      @Override
      public void resetSizeCounter() {
         this.startPos = this.pos;
      }

      @Override
      public int pushLimit(int var1) {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         }

         var1 += this.getTotalBytesRead();
         if (var1 < 0) {
            throw InvalidProtocolBufferException.parseFailure();
         }

         int var2 = this.currentLimit;
         if (var1 > var2) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
         return var2;
      }

      private void recomputeBufferSizeAfterLimit() {
         this.limit = this.limit + this.bufferSizeAfterLimit;
         int var1 = this.limit - this.startPos;
         if (var1 > this.currentLimit) {
            this.bufferSizeAfterLimit = var1 - this.currentLimit;
            this.limit = this.limit - this.bufferSizeAfterLimit;
         } else {
            this.bufferSizeAfterLimit = 0;
         }
      }

      @Override
      public void popLimit(int var1) {
         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
      }

      @Override
      public int getBytesUntilLimit() {
         return this.currentLimit == Integer.MAX_VALUE ? -1 : this.currentLimit - this.getTotalBytesRead();
      }

      @Override
      public boolean isAtEnd() {
         return this.pos == this.limit;
      }

      @Override
      public int getTotalBytesRead() {
         return this.pos - this.startPos;
      }

      @Override
      public byte readRawByte() {
         if (this.pos == this.limit) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            return this.buffer[this.pos++];
         }
      }

      @Override
      public byte[] readRawBytes(int var1) {
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            int var2 = this.pos;
            this.pos += var1;
            return Arrays.copyOfRange(this.buffer, var2, this.pos);
         }

         if (var1 <= 0) {
            if (var1 == 0) {
               return Internal.EMPTY_BYTE_ARRAY;
            } else {
               throw InvalidProtocolBufferException.negativeSize();
            }
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public void skipRawBytes(int var1) {
         if (var1 >= 0 && var1 <= this.limit - this.pos) {
            this.pos += var1;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }
   }

   private static final class IterableDirectByteBufferDecoder extends CodedInputStream {
      private final Iterable<ByteBuffer> input;
      private final Iterator<ByteBuffer> iterator;
      private ByteBuffer currentByteBuffer;
      private final boolean immutable;
      private boolean enableAliasing;
      private int totalBufferSize;
      private int bufferSizeAfterCurrentLimit;
      private int currentLimit = Integer.MAX_VALUE;
      private int lastTag;
      private int totalBytesRead;
      private int startOffset;
      private long currentByteBufferPos;
      private long currentByteBufferStartPos;
      private long currentAddress;
      private long currentByteBufferLimit;

      private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> var1, int var2, boolean var3) {
         this.totalBufferSize = var2;
         this.input = var1;
         this.iterator = this.input.iterator();
         this.immutable = var3;
         this.startOffset = this.totalBytesRead = 0;
         if (var2 == 0) {
            this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
         } else {
            this.tryGetNextByteBuffer();
         }
      }

      private void getNextByteBuffer() {
         if (!this.iterator.hasNext()) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.tryGetNextByteBuffer();
      }

      private void tryGetNextByteBuffer() {
         this.currentByteBuffer = this.iterator.next();
         this.totalBytesRead = this.totalBytesRead + (int)(this.currentByteBufferPos - this.currentByteBufferStartPos);
         this.currentByteBufferPos = this.currentByteBuffer.position();
         this.currentByteBufferStartPos = this.currentByteBufferPos;
         this.currentByteBufferLimit = this.currentByteBuffer.limit();
         this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
         this.currentByteBufferPos = this.currentByteBufferPos + this.currentAddress;
         this.currentByteBufferStartPos = this.currentByteBufferStartPos + this.currentAddress;
         this.currentByteBufferLimit = this.currentByteBufferLimit + this.currentAddress;
      }

      @Override
      public int readTag() {
         if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
         } else {
            this.lastTag = this.readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) == 0) {
               throw InvalidProtocolBufferException.invalidTag();
            } else {
               return this.lastTag;
            }
         }
      }

      @Override
      public void checkLastTagWas(int var1) {
         if (this.lastTag != var1) {
            throw InvalidProtocolBufferException.invalidEndTag();
         }
      }

      @Override
      public int getLastTag() {
         return this.lastTag;
      }

      @Override
      public boolean skipField(int var1) {
         switch (WireFormat.getTagWireType(var1)) {
            case 0:
               this.skipRawVarint();
               return true;
            case 1:
               this.skipRawBytes(8);
               return true;
            case 2:
               this.skipRawBytes(this.readRawVarint32());
               return true;
            case 3:
               this.skipMessage();
               this.checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4));
               return true;
            case 4:
               return false;
            case 5:
               this.skipRawBytes(4);
               return true;
            default:
               throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      @Override
      public boolean skipField(int var1, CodedOutputStream var2) {
         switch (WireFormat.getTagWireType(var1)) {
            case 0:
               long var8 = this.readInt64();
               var2.writeUInt32NoTag(var1);
               var2.writeUInt64NoTag(var8);
               return true;
            case 1:
               long var7 = this.readRawLittleEndian64();
               var2.writeUInt32NoTag(var1);
               var2.writeFixed64NoTag(var7);
               return true;
            case 2:
               ByteString var6 = this.readBytes();
               var2.writeUInt32NoTag(var1);
               var2.writeBytesNoTag(var6);
               return true;
            case 3:
               var2.writeUInt32NoTag(var1);
               this.skipMessage(var2);
               int var5 = WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4);
               this.checkLastTagWas(var5);
               var2.writeUInt32NoTag(var5);
               return true;
            case 4:
               return false;
            case 5:
               int var3 = this.readRawLittleEndian32();
               var2.writeUInt32NoTag(var1);
               var2.writeFixed32NoTag(var3);
               return true;
            default:
               throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      @Override
      public void skipMessage() {
         int var1;
         do {
            var1 = this.readTag();
         } while (var1 != 0 && this.skipField(var1));
      }

      @Override
      public void skipMessage(CodedOutputStream var1) {
         int var2;
         do {
            var2 = this.readTag();
         } while (var2 != 0 && this.skipField(var2, var1));
      }

      @Override
      public double readDouble() {
         return Double.longBitsToDouble(this.readRawLittleEndian64());
      }

      @Override
      public float readFloat() {
         return Float.intBitsToFloat(this.readRawLittleEndian32());
      }

      @Override
      public long readUInt64() {
         return this.readRawVarint64();
      }

      @Override
      public long readInt64() {
         return this.readRawVarint64();
      }

      @Override
      public int readInt32() {
         return this.readRawVarint32();
      }

      @Override
      public long readFixed64() {
         return this.readRawLittleEndian64();
      }

      @Override
      public int readFixed32() {
         return this.readRawLittleEndian32();
      }

      @Override
      public boolean readBool() {
         return this.readRawVarint64() != 0L;
      }

      @Override
      public String readString() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.currentByteBufferLimit - this.currentByteBufferPos) {
            byte[] var4 = new byte[var1];
            UnsafeUtil.copyMemory(this.currentByteBufferPos, var4, 0L, var1);
            String var3 = new String(var4, Internal.UTF_8);
            this.currentByteBufferPos += var1;
            return var3;
         } else if (var1 > 0 && var1 <= this.remaining()) {
            byte[] var2 = new byte[var1];
            this.readRawBytesTo(var2, 0, var1);
            return new String(var2, Internal.UTF_8);
         } else if (var1 == 0) {
            return "";
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public String readStringRequireUtf8() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.currentByteBufferLimit - this.currentByteBufferPos) {
            int var4 = (int)(this.currentByteBufferPos - this.currentByteBufferStartPos);
            String var3 = Utf8.decodeUtf8(this.currentByteBuffer, var4, var1);
            this.currentByteBufferPos += var1;
            return var3;
         } else if (var1 >= 0 && var1 <= this.remaining()) {
            byte[] var2 = new byte[var1];
            this.readRawBytesTo(var2, 0, var1);
            return Utf8.decodeUtf8(var2, 0, var1);
         } else if (var1 == 0) {
            return "";
         } else if (var1 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3) {
         this.checkRecursionLimit();
         this.recursionDepth++;
         var2.mergeFrom(this, var3);
         this.checkLastTagWas(WireFormat.makeTag(var1, 4));
         this.recursionDepth--;
      }

      @Override
      public <T extends MessageLite> T readGroup(int var1, Parser<T> var2, ExtensionRegistryLite var3) {
         this.checkRecursionLimit();
         this.recursionDepth++;
         MessageLite var4 = (MessageLite)var2.parsePartialFrom(this, var3);
         this.checkLastTagWas(WireFormat.makeTag(var1, 4));
         this.recursionDepth--;
         return (T)var4;
      }

      @Deprecated
      @Override
      public void readUnknownGroup(int var1, MessageLite.Builder var2) {
         this.readGroup(var1, var2, ExtensionRegistryLite.getEmptyRegistry());
      }

      @Override
      public void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2) {
         int var3 = this.readRawVarint32();
         this.checkRecursionLimit();
         int var4 = this.pushLimit(var3);
         this.recursionDepth++;
         var1.mergeFrom(this, var2);
         this.checkLastTagWas(0);
         this.recursionDepth--;
         if (this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.popLimit(var4);
      }

      @Override
      public <T extends MessageLite> T readMessage(Parser<T> var1, ExtensionRegistryLite var2) {
         int var3 = this.readRawVarint32();
         this.checkRecursionLimit();
         int var4 = this.pushLimit(var3);
         this.recursionDepth++;
         MessageLite var5 = (MessageLite)var1.parsePartialFrom(this, var2);
         this.checkLastTagWas(0);
         this.recursionDepth--;
         if (this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.popLimit(var4);
         return (T)var5;
      }

      @Override
      public ByteString readBytes() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.currentByteBufferLimit - this.currentByteBufferPos) {
            if (this.immutable && this.enableAliasing) {
               int var8 = (int)(this.currentByteBufferPos - this.currentAddress);
               ByteString var9 = ByteString.wrap(this.slice(var8, var8 + var1));
               this.currentByteBufferPos += var1;
               return var9;
            } else {
               byte[] var7 = new byte[var1];
               UnsafeUtil.copyMemory(this.currentByteBufferPos, var7, 0L, var1);
               this.currentByteBufferPos += var1;
               return ByteString.wrap(var7);
            }
         } else if (var1 > 0 && var1 <= this.remaining()) {
            if (this.immutable && this.enableAliasing) {
               ArrayList var6 = new ArrayList();
               int var3 = var1;

               while (var3 > 0) {
                  if (this.currentRemaining() == 0L) {
                     this.getNextByteBuffer();
                  }

                  int var4 = Math.min(var3, (int)this.currentRemaining());
                  int var5 = (int)(this.currentByteBufferPos - this.currentAddress);
                  var6.add(ByteString.wrap(this.slice(var5, var5 + var4)));
                  var3 -= var4;
                  this.currentByteBufferPos += var4;
               }

               return ByteString.copyFrom(var6);
            } else {
               byte[] var2 = new byte[var1];
               this.readRawBytesTo(var2, 0, var1);
               return ByteString.wrap(var2);
            }
         } else if (var1 == 0) {
            return ByteString.EMPTY;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public byte[] readByteArray() {
         return this.readRawBytes(this.readRawVarint32());
      }

      @Override
      public ByteBuffer readByteBuffer() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.currentRemaining()) {
            if (!this.immutable && this.enableAliasing) {
               this.currentByteBufferPos += var1;
               return this.slice((int)(this.currentByteBufferPos - this.currentAddress - var1), (int)(this.currentByteBufferPos - this.currentAddress));
            } else {
               byte[] var3 = new byte[var1];
               UnsafeUtil.copyMemory(this.currentByteBufferPos, var3, 0L, var1);
               this.currentByteBufferPos += var1;
               return ByteBuffer.wrap(var3);
            }
         } else if (var1 > 0 && var1 <= this.remaining()) {
            byte[] var2 = new byte[var1];
            this.readRawBytesTo(var2, 0, var1);
            return ByteBuffer.wrap(var2);
         } else if (var1 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public int readUInt32() {
         return this.readRawVarint32();
      }

      @Override
      public int readEnum() {
         return this.readRawVarint32();
      }

      @Override
      public int readSFixed32() {
         return this.readRawLittleEndian32();
      }

      @Override
      public long readSFixed64() {
         return this.readRawLittleEndian64();
      }

      @Override
      public int readSInt32() {
         return decodeZigZag32(this.readRawVarint32());
      }

      @Override
      public long readSInt64() {
         return decodeZigZag64(this.readRawVarint64());
      }

      @Override
      public int readRawVarint32() {
         long var1;
         int var11;
         label47: {
            var1 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != this.currentByteBufferPos) {
               byte var3;
               if ((var3 = UnsafeUtil.getByte(var1++)) >= 0) {
                  this.currentByteBufferPos++;
                  return var3;
               }

               if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10L) {
                  if ((var3 = var3 ^ UnsafeUtil.getByte(var1++) << 7) < 0) {
                     var11 = var3 ^ -128;
                     break label47;
                  }

                  if ((var3 = var3 ^ UnsafeUtil.getByte(var1++) << 14) >= 0) {
                     var11 = var3 ^ 16256;
                     break label47;
                  }

                  if ((var3 = var3 ^ UnsafeUtil.getByte(var1++) << 21) < 0) {
                     var11 = var3 ^ -2080896;
                     break label47;
                  }

                  byte var4 = UnsafeUtil.getByte(var1++);
                  var3 ^= var4 << 28;
                  var11 = var3 ^ 266354560;
                  if (var4 >= 0
                     || UnsafeUtil.getByte(var1++) >= 0
                     || UnsafeUtil.getByte(var1++) >= 0
                     || UnsafeUtil.getByte(var1++) >= 0
                     || UnsafeUtil.getByte(var1++) >= 0
                     || UnsafeUtil.getByte(var1++) >= 0) {
                     break label47;
                  }
               }
            }

            return (int)this.readRawVarint64SlowPath();
         }

         this.currentByteBufferPos = var1;
         return var11;
      }

      @Override
      public long readRawVarint64() {
         long var1;
         long var12;
         label51: {
            var1 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != this.currentByteBufferPos) {
               byte var5;
               if ((var5 = UnsafeUtil.getByte(var1++)) >= 0) {
                  this.currentByteBufferPos++;
                  return var5;
               }

               if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10L) {
                  if ((var5 = var5 ^ UnsafeUtil.getByte(var1++) << 7) < 0) {
                     var12 = var5 ^ -128;
                     break label51;
                  }

                  if ((var5 = var5 ^ UnsafeUtil.getByte(var1++) << 14) >= 0) {
                     var12 = var5 ^ 16256;
                     break label51;
                  }

                  if ((var5 = var5 ^ UnsafeUtil.getByte(var1++) << 21) < 0) {
                     var12 = var5 ^ -2080896;
                     break label51;
                  }

                  if ((var12 = var5 ^ (long)UnsafeUtil.getByte(var1++) << 28) >= 0L) {
                     var12 ^= 266354560L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)UnsafeUtil.getByte(var1++) << 35) < 0L) {
                     var12 ^= -34093383808L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)UnsafeUtil.getByte(var1++) << 42) >= 0L) {
                     var12 ^= 4363953127296L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)UnsafeUtil.getByte(var1++) << 49) < 0L) {
                     var12 ^= -558586000294016L;
                     break label51;
                  }

                  var12 ^= (long)UnsafeUtil.getByte(var1++) << 56;
                  var12 ^= 71499008037633920L;
                  if (var12 >= 0L || UnsafeUtil.getByte(var1++) >= 0L) {
                     break label51;
                  }
               }
            }

            return this.readRawVarint64SlowPath();
         }

         this.currentByteBufferPos = var1;
         return var12;
      }

      @Override
      long readRawVarint64SlowPath() {
         long var1 = 0L;

         for (byte var3 = 0; var3 < 64; var3 += 7) {
            byte var4 = this.readRawByte();
            var1 |= (long)(var4 & 127) << var3;
            if ((var4 & 128) == 0) {
               return var1;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      @Override
      public int readRawLittleEndian32() {
         if (this.currentRemaining() >= 4L) {
            long var1 = this.currentByteBufferPos;
            this.currentByteBufferPos += 4L;
            return UnsafeUtil.getByte(var1) & 0xFF
               | (UnsafeUtil.getByte(var1 + 1L) & 0xFF) << 8
               | (UnsafeUtil.getByte(var1 + 2L) & 0xFF) << 16
               | (UnsafeUtil.getByte(var1 + 3L) & 0xFF) << 24;
         } else {
            return this.readRawByte() & 0xFF | (this.readRawByte() & 0xFF) << 8 | (this.readRawByte() & 0xFF) << 16 | (this.readRawByte() & 0xFF) << 24;
         }
      }

      @Override
      public long readRawLittleEndian64() {
         if (this.currentRemaining() >= 8L) {
            long var1 = this.currentByteBufferPos;
            this.currentByteBufferPos += 8L;
            return UnsafeUtil.getByte(var1) & 255L
               | (UnsafeUtil.getByte(var1 + 1L) & 255L) << 8
               | (UnsafeUtil.getByte(var1 + 2L) & 255L) << 16
               | (UnsafeUtil.getByte(var1 + 3L) & 255L) << 24
               | (UnsafeUtil.getByte(var1 + 4L) & 255L) << 32
               | (UnsafeUtil.getByte(var1 + 5L) & 255L) << 40
               | (UnsafeUtil.getByte(var1 + 6L) & 255L) << 48
               | (UnsafeUtil.getByte(var1 + 7L) & 255L) << 56;
         } else {
            return this.readRawByte() & 255L
               | (this.readRawByte() & 255L) << 8
               | (this.readRawByte() & 255L) << 16
               | (this.readRawByte() & 255L) << 24
               | (this.readRawByte() & 255L) << 32
               | (this.readRawByte() & 255L) << 40
               | (this.readRawByte() & 255L) << 48
               | (this.readRawByte() & 255L) << 56;
         }
      }

      @Override
      public void enableAliasing(boolean var1) {
         this.enableAliasing = var1;
      }

      @Override
      public void resetSizeCounter() {
         this.startOffset = (int)(this.totalBytesRead + this.currentByteBufferPos - this.currentByteBufferStartPos);
      }

      @Override
      public int pushLimit(int var1) {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         }

         var1 += this.getTotalBytesRead();
         int var2 = this.currentLimit;
         if (var1 > var2) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
         return var2;
      }

      private void recomputeBufferSizeAfterLimit() {
         this.totalBufferSize = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
         int var1 = this.totalBufferSize - this.startOffset;
         if (var1 > this.currentLimit) {
            this.bufferSizeAfterCurrentLimit = var1 - this.currentLimit;
            this.totalBufferSize = this.totalBufferSize - this.bufferSizeAfterCurrentLimit;
         } else {
            this.bufferSizeAfterCurrentLimit = 0;
         }
      }

      @Override
      public void popLimit(int var1) {
         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
      }

      @Override
      public int getBytesUntilLimit() {
         return this.currentLimit == Integer.MAX_VALUE ? -1 : this.currentLimit - this.getTotalBytesRead();
      }

      @Override
      public boolean isAtEnd() {
         return this.totalBytesRead + this.currentByteBufferPos - this.currentByteBufferStartPos == this.totalBufferSize;
      }

      @Override
      public int getTotalBytesRead() {
         return (int)(this.totalBytesRead - this.startOffset + this.currentByteBufferPos - this.currentByteBufferStartPos);
      }

      @Override
      public byte readRawByte() {
         if (this.currentRemaining() == 0L) {
            this.getNextByteBuffer();
         }

         return UnsafeUtil.getByte(this.currentByteBufferPos++);
      }

      @Override
      public byte[] readRawBytes(int var1) {
         if (var1 >= 0 && var1 <= this.currentRemaining()) {
            byte[] var3 = new byte[var1];
            UnsafeUtil.copyMemory(this.currentByteBufferPos, var3, 0L, var1);
            this.currentByteBufferPos += var1;
            return var3;
         }

         if (var1 >= 0 && var1 <= this.remaining()) {
            byte[] var2 = new byte[var1];
            this.readRawBytesTo(var2, 0, var1);
            return var2;
         }

         if (var1 <= 0) {
            if (var1 == 0) {
               return Internal.EMPTY_BYTE_ARRAY;
            } else {
               throw InvalidProtocolBufferException.negativeSize();
            }
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      private void readRawBytesTo(byte[] var1, int var2, int var3) {
         if (var3 >= 0 && var3 <= this.remaining()) {
            int var4 = var3;

            while (var4 > 0) {
               if (this.currentRemaining() == 0L) {
                  this.getNextByteBuffer();
               }

               int var5 = Math.min(var4, (int)this.currentRemaining());
               UnsafeUtil.copyMemory(this.currentByteBufferPos, var1, var3 - var4 + var2, var5);
               var4 -= var5;
               this.currentByteBufferPos += var5;
            }
         } else if (var3 <= 0) {
            if (var3 != 0) {
               throw InvalidProtocolBufferException.negativeSize();
            }
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public void skipRawBytes(int var1) {
         if (var1 >= 0 && var1 <= this.totalBufferSize - this.totalBytesRead - this.currentByteBufferPos + this.currentByteBufferStartPos) {
            int var2 = var1;

            while (var2 > 0) {
               if (this.currentRemaining() == 0L) {
                  this.getNextByteBuffer();
               }

               int var3 = Math.min(var2, (int)this.currentRemaining());
               var2 -= var3;
               this.currentByteBufferPos += var3;
            }
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      private void skipRawVarint() {
         for (int var1 = 0; var1 < 10; var1++) {
            if (this.readRawByte() >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      private int remaining() {
         return (int)(this.totalBufferSize - this.totalBytesRead - this.currentByteBufferPos + this.currentByteBufferStartPos);
      }

      private long currentRemaining() {
         return this.currentByteBufferLimit - this.currentByteBufferPos;
      }

      private ByteBuffer slice(int var1, int var2) {
         int var3 = this.currentByteBuffer.position();
         int var4 = this.currentByteBuffer.limit();
         ByteBuffer var5 = this.currentByteBuffer;

         try {
            ((Buffer)var5).position(var1);
            ((Buffer)var5).limit(var2);
            return this.currentByteBuffer.slice();
         } catch (IllegalArgumentException var10) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } finally {
            ((Buffer)var5).position(var3);
            ((Buffer)var5).limit(var4);
         }
      }
   }

   private static final class StreamDecoder extends CodedInputStream {
      private final InputStream input;
      private final byte[] buffer;
      private int bufferSize;
      private int bufferSizeAfterLimit;
      private int pos;
      private int lastTag;
      private int totalBytesRetired;
      private int currentLimit = Integer.MAX_VALUE;
      private CodedInputStream.StreamDecoder.RefillCallback refillCallback = null;

      private StreamDecoder(InputStream var1, int var2) {
         Internal.checkNotNull(var1, "input");
         this.input = var1;
         this.buffer = new byte[var2];
         this.bufferSize = 0;
         this.pos = 0;
         this.totalBytesRetired = 0;
      }

      private static int read(InputStream var0, byte[] var1, int var2, int var3) {
         try {
            return var0.read(var1, var2, var3);
         } catch (InvalidProtocolBufferException var5) {
            var5.setThrownFromInputStream();
            throw var5;
         }
      }

      private static long skip(InputStream var0, long var1) {
         try {
            return var0.skip(var1);
         } catch (InvalidProtocolBufferException var4) {
            var4.setThrownFromInputStream();
            throw var4;
         }
      }

      private static int available(InputStream var0) {
         try {
            return var0.available();
         } catch (InvalidProtocolBufferException var2) {
            var2.setThrownFromInputStream();
            throw var2;
         }
      }

      @Override
      public int readTag() {
         if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
         } else {
            this.lastTag = this.readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) == 0) {
               throw InvalidProtocolBufferException.invalidTag();
            } else {
               return this.lastTag;
            }
         }
      }

      @Override
      public void checkLastTagWas(int var1) {
         if (this.lastTag != var1) {
            throw InvalidProtocolBufferException.invalidEndTag();
         }
      }

      @Override
      public int getLastTag() {
         return this.lastTag;
      }

      @Override
      public boolean skipField(int var1) {
         switch (WireFormat.getTagWireType(var1)) {
            case 0:
               this.skipRawVarint();
               return true;
            case 1:
               this.skipRawBytes(8);
               return true;
            case 2:
               this.skipRawBytes(this.readRawVarint32());
               return true;
            case 3:
               this.skipMessage();
               this.checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4));
               return true;
            case 4:
               return false;
            case 5:
               this.skipRawBytes(4);
               return true;
            default:
               throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      @Override
      public boolean skipField(int var1, CodedOutputStream var2) {
         switch (WireFormat.getTagWireType(var1)) {
            case 0:
               long var8 = this.readInt64();
               var2.writeUInt32NoTag(var1);
               var2.writeUInt64NoTag(var8);
               return true;
            case 1:
               long var7 = this.readRawLittleEndian64();
               var2.writeUInt32NoTag(var1);
               var2.writeFixed64NoTag(var7);
               return true;
            case 2:
               ByteString var6 = this.readBytes();
               var2.writeUInt32NoTag(var1);
               var2.writeBytesNoTag(var6);
               return true;
            case 3:
               var2.writeUInt32NoTag(var1);
               this.skipMessage(var2);
               int var5 = WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4);
               this.checkLastTagWas(var5);
               var2.writeUInt32NoTag(var5);
               return true;
            case 4:
               return false;
            case 5:
               int var3 = this.readRawLittleEndian32();
               var2.writeUInt32NoTag(var1);
               var2.writeFixed32NoTag(var3);
               return true;
            default:
               throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      @Override
      public void skipMessage() {
         int var1;
         do {
            var1 = this.readTag();
         } while (var1 != 0 && this.skipField(var1));
      }

      @Override
      public void skipMessage(CodedOutputStream var1) {
         int var2;
         do {
            var2 = this.readTag();
         } while (var2 != 0 && this.skipField(var2, var1));
      }

      @Override
      public double readDouble() {
         return Double.longBitsToDouble(this.readRawLittleEndian64());
      }

      @Override
      public float readFloat() {
         return Float.intBitsToFloat(this.readRawLittleEndian32());
      }

      @Override
      public long readUInt64() {
         return this.readRawVarint64();
      }

      @Override
      public long readInt64() {
         return this.readRawVarint64();
      }

      @Override
      public int readInt32() {
         return this.readRawVarint32();
      }

      @Override
      public long readFixed64() {
         return this.readRawLittleEndian64();
      }

      @Override
      public int readFixed32() {
         return this.readRawLittleEndian32();
      }

      @Override
      public boolean readBool() {
         return this.readRawVarint64() != 0L;
      }

      @Override
      public String readString() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.bufferSize - this.pos) {
            String var3 = new String(this.buffer, this.pos, var1, Internal.UTF_8);
            this.pos += var1;
            return var3;
         } else if (var1 == 0) {
            return "";
         } else if (var1 <= this.bufferSize) {
            this.refillBuffer(var1);
            String var2 = new String(this.buffer, this.pos, var1, Internal.UTF_8);
            this.pos += var1;
            return var2;
         } else {
            return new String(this.readRawBytesSlowPath(var1, false), Internal.UTF_8);
         }
      }

      @Override
      public String readStringRequireUtf8() {
         int var1 = this.readRawVarint32();
         int var3 = this.pos;
         byte[] var2;
         int var4;
         if (var1 <= this.bufferSize - var3 && var1 > 0) {
            var2 = this.buffer;
            this.pos = var3 + var1;
            var4 = var3;
         } else {
            if (var1 == 0) {
               return "";
            }

            if (var1 <= this.bufferSize) {
               this.refillBuffer(var1);
               var2 = this.buffer;
               var4 = 0;
               this.pos = var4 + var1;
            } else {
               var2 = this.readRawBytesSlowPath(var1, false);
               var4 = 0;
            }
         }

         return Utf8.decodeUtf8(var2, var4, var1);
      }

      @Override
      public void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3) {
         this.checkRecursionLimit();
         this.recursionDepth++;
         var2.mergeFrom(this, var3);
         this.checkLastTagWas(WireFormat.makeTag(var1, 4));
         this.recursionDepth--;
      }

      @Override
      public <T extends MessageLite> T readGroup(int var1, Parser<T> var2, ExtensionRegistryLite var3) {
         this.checkRecursionLimit();
         this.recursionDepth++;
         MessageLite var4 = (MessageLite)var2.parsePartialFrom(this, var3);
         this.checkLastTagWas(WireFormat.makeTag(var1, 4));
         this.recursionDepth--;
         return (T)var4;
      }

      @Deprecated
      @Override
      public void readUnknownGroup(int var1, MessageLite.Builder var2) {
         this.readGroup(var1, var2, ExtensionRegistryLite.getEmptyRegistry());
      }

      @Override
      public void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2) {
         int var3 = this.readRawVarint32();
         this.checkRecursionLimit();
         int var4 = this.pushLimit(var3);
         this.recursionDepth++;
         var1.mergeFrom(this, var2);
         this.checkLastTagWas(0);
         this.recursionDepth--;
         if (this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.popLimit(var4);
      }

      @Override
      public <T extends MessageLite> T readMessage(Parser<T> var1, ExtensionRegistryLite var2) {
         int var3 = this.readRawVarint32();
         this.checkRecursionLimit();
         int var4 = this.pushLimit(var3);
         this.recursionDepth++;
         MessageLite var5 = (MessageLite)var1.parsePartialFrom(this, var2);
         this.checkLastTagWas(0);
         this.recursionDepth--;
         if (this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.popLimit(var4);
         return (T)var5;
      }

      @Override
      public ByteString readBytes() {
         int var1 = this.readRawVarint32();
         if (var1 <= this.bufferSize - this.pos && var1 > 0) {
            ByteString var2 = ByteString.copyFrom(this.buffer, this.pos, var1);
            this.pos += var1;
            return var2;
         } else {
            return var1 == 0 ? ByteString.EMPTY : this.readBytesSlowPath(var1);
         }
      }

      @Override
      public byte[] readByteArray() {
         int var1 = this.readRawVarint32();
         if (var1 <= this.bufferSize - this.pos && var1 > 0) {
            byte[] var2 = Arrays.copyOfRange(this.buffer, this.pos, this.pos + var1);
            this.pos += var1;
            return var2;
         } else {
            return this.readRawBytesSlowPath(var1, false);
         }
      }

      @Override
      public ByteBuffer readByteBuffer() {
         int var1 = this.readRawVarint32();
         if (var1 <= this.bufferSize - this.pos && var1 > 0) {
            ByteBuffer var2 = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, this.pos, this.pos + var1));
            this.pos += var1;
            return var2;
         } else {
            return var1 == 0 ? Internal.EMPTY_BYTE_BUFFER : ByteBuffer.wrap(this.readRawBytesSlowPath(var1, true));
         }
      }

      @Override
      public int readUInt32() {
         return this.readRawVarint32();
      }

      @Override
      public int readEnum() {
         return this.readRawVarint32();
      }

      @Override
      public int readSFixed32() {
         return this.readRawLittleEndian32();
      }

      @Override
      public long readSFixed64() {
         return this.readRawLittleEndian64();
      }

      @Override
      public int readSInt32() {
         return decodeZigZag32(this.readRawVarint32());
      }

      @Override
      public long readSInt64() {
         return decodeZigZag64(this.readRawVarint64());
      }

      @Override
      public int readRawVarint32() {
         int var1;
         int var11;
         label47: {
            var1 = this.pos;
            if (this.bufferSize != var1) {
               byte[] var2 = this.buffer;
               byte var3;
               if ((var3 = var2[var1++]) >= 0) {
                  this.pos = var1;
                  return var3;
               }

               if (this.bufferSize - var1 >= 9) {
                  if ((var3 = var3 ^ var2[var1++] << 7) < 0) {
                     var11 = var3 ^ -128;
                     break label47;
                  }

                  if ((var3 = var3 ^ var2[var1++] << 14) >= 0) {
                     var11 = var3 ^ 16256;
                     break label47;
                  }

                  if ((var3 = var3 ^ var2[var1++] << 21) < 0) {
                     var11 = var3 ^ -2080896;
                     break label47;
                  }

                  byte var4 = var2[var1++];
                  var3 ^= var4 << 28;
                  var11 = var3 ^ 266354560;
                  if (var4 >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0) {
                     break label47;
                  }
               }
            }

            return (int)this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var11;
      }

      private void skipRawVarint() {
         if (this.bufferSize - this.pos >= 10) {
            this.skipRawVarintFastPath();
         } else {
            this.skipRawVarintSlowPath();
         }
      }

      private void skipRawVarintFastPath() {
         for (int var1 = 0; var1 < 10; var1++) {
            if (this.buffer[this.pos++] >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      private void skipRawVarintSlowPath() {
         for (int var1 = 0; var1 < 10; var1++) {
            if (this.readRawByte() >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      @Override
      public long readRawVarint64() {
         int var1;
         long var12;
         label51: {
            var1 = this.pos;
            if (this.bufferSize != var1) {
               byte[] var2 = this.buffer;
               byte var5;
               if ((var5 = var2[var1++]) >= 0) {
                  this.pos = var1;
                  return var5;
               }

               if (this.bufferSize - var1 >= 9) {
                  if ((var5 = var5 ^ var2[var1++] << 7) < 0) {
                     var12 = var5 ^ -128;
                     break label51;
                  }

                  if ((var5 = var5 ^ var2[var1++] << 14) >= 0) {
                     var12 = var5 ^ 16256;
                     break label51;
                  }

                  if ((var5 = var5 ^ var2[var1++] << 21) < 0) {
                     var12 = var5 ^ -2080896;
                     break label51;
                  }

                  if ((var12 = var5 ^ (long)var2[var1++] << 28) >= 0L) {
                     var12 ^= 266354560L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)var2[var1++] << 35) < 0L) {
                     var12 ^= -34093383808L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)var2[var1++] << 42) >= 0L) {
                     var12 ^= 4363953127296L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)var2[var1++] << 49) < 0L) {
                     var12 ^= -558586000294016L;
                     break label51;
                  }

                  var12 ^= (long)var2[var1++] << 56;
                  var12 ^= 71499008037633920L;
                  if (var12 >= 0L || var2[var1++] >= 0L) {
                     break label51;
                  }
               }
            }

            return this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var12;
      }

      @Override
      long readRawVarint64SlowPath() {
         long var1 = 0L;

         for (byte var3 = 0; var3 < 64; var3 += 7) {
            byte var4 = this.readRawByte();
            var1 |= (long)(var4 & 127) << var3;
            if ((var4 & 128) == 0) {
               return var1;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      @Override
      public int readRawLittleEndian32() {
         int var1 = this.pos;
         if (this.bufferSize - var1 < 4) {
            this.refillBuffer(4);
            var1 = this.pos;
         }

         byte[] var2 = this.buffer;
         this.pos = var1 + 4;
         return var2[var1] & 0xFF | (var2[var1 + 1] & 0xFF) << 8 | (var2[var1 + 2] & 0xFF) << 16 | (var2[var1 + 3] & 0xFF) << 24;
      }

      @Override
      public long readRawLittleEndian64() {
         int var1 = this.pos;
         if (this.bufferSize - var1 < 8) {
            this.refillBuffer(8);
            var1 = this.pos;
         }

         byte[] var2 = this.buffer;
         this.pos = var1 + 8;
         return var2[var1] & 255L
            | (var2[var1 + 1] & 255L) << 8
            | (var2[var1 + 2] & 255L) << 16
            | (var2[var1 + 3] & 255L) << 24
            | (var2[var1 + 4] & 255L) << 32
            | (var2[var1 + 5] & 255L) << 40
            | (var2[var1 + 6] & 255L) << 48
            | (var2[var1 + 7] & 255L) << 56;
      }

      @Override
      public void enableAliasing(boolean var1) {
      }

      @Override
      public void resetSizeCounter() {
         this.totalBytesRetired = -this.pos;
      }

      @Override
      public int pushLimit(int var1) {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         }

         var1 += this.totalBytesRetired + this.pos;
         int var2 = this.currentLimit;
         if (var1 > var2) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
         return var2;
      }

      private void recomputeBufferSizeAfterLimit() {
         this.bufferSize = this.bufferSize + this.bufferSizeAfterLimit;
         int var1 = this.totalBytesRetired + this.bufferSize;
         if (var1 > this.currentLimit) {
            this.bufferSizeAfterLimit = var1 - this.currentLimit;
            this.bufferSize = this.bufferSize - this.bufferSizeAfterLimit;
         } else {
            this.bufferSizeAfterLimit = 0;
         }
      }

      @Override
      public void popLimit(int var1) {
         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
      }

      @Override
      public int getBytesUntilLimit() {
         if (this.currentLimit == Integer.MAX_VALUE) {
            return -1;
         }

         int var1 = this.totalBytesRetired + this.pos;
         return this.currentLimit - var1;
      }

      @Override
      public boolean isAtEnd() {
         return this.pos == this.bufferSize && !this.tryRefillBuffer(1);
      }

      @Override
      public int getTotalBytesRead() {
         return this.totalBytesRetired + this.pos;
      }

      private void refillBuffer(int var1) {
         if (!this.tryRefillBuffer(var1)) {
            if (var1 > this.sizeLimit - this.totalBytesRetired - this.pos) {
               throw InvalidProtocolBufferException.sizeLimitExceeded();
            } else {
               throw InvalidProtocolBufferException.truncatedMessage();
            }
         }
      }

      private boolean tryRefillBuffer(int var1) {
         if (this.pos + var1 <= this.bufferSize) {
            throw new IllegalStateException("refillBuffer() called when " + var1 + " bytes were already available in buffer");
         }

         if (var1 > this.sizeLimit - this.totalBytesRetired - this.pos) {
            return false;
         }

         if (this.totalBytesRetired + this.pos + var1 > this.currentLimit) {
            return false;
         }

         if (this.refillCallback != null) {
            this.refillCallback.onRefill();
         }

         int var2 = this.pos;
         if (var2 > 0) {
            if (this.bufferSize > var2) {
               System.arraycopy(this.buffer, var2, this.buffer, 0, this.bufferSize - var2);
            }

            this.totalBytesRetired += var2;
            this.bufferSize -= var2;
            this.pos = 0;
         }

         int var3 = read(
            this.input, this.buffer, this.bufferSize, Math.min(this.buffer.length - this.bufferSize, this.sizeLimit - this.totalBytesRetired - this.bufferSize)
         );
         if (var3 == 0 || var3 < -1 || var3 > this.buffer.length) {
            throw new IllegalStateException(
               this.input.getClass() + "#read(byte[]) returned invalid result: " + var3 + "\nThe InputStream implementation is buggy."
            );
         } else if (var3 > 0) {
            this.bufferSize += var3;
            this.recomputeBufferSizeAfterLimit();
            return this.bufferSize >= var1 ? true : this.tryRefillBuffer(var1);
         } else {
            return false;
         }
      }

      @Override
      public byte readRawByte() {
         if (this.pos == this.bufferSize) {
            this.refillBuffer(1);
         }

         return this.buffer[this.pos++];
      }

      @Override
      public byte[] readRawBytes(int var1) {
         int var2 = this.pos;
         if (var1 <= this.bufferSize - var2 && var1 > 0) {
            this.pos = var2 + var1;
            return Arrays.copyOfRange(this.buffer, var2, var2 + var1);
         } else {
            return this.readRawBytesSlowPath(var1, false);
         }
      }

      private byte[] readRawBytesSlowPath(int var1, boolean var2) {
         byte[] var3 = this.readRawBytesSlowPathOneChunk(var1);
         if (var3 != null) {
            return var2 ? (byte[])var3.clone() : var3;
         }

         int var4 = this.pos;
         int var5 = this.bufferSize - this.pos;
         this.totalBytesRetired = this.totalBytesRetired + this.bufferSize;
         this.pos = 0;
         this.bufferSize = 0;
         int var6 = var1 - var5;
         List var7 = this.readRawBytesSlowPathRemainingChunks(var6);
         byte[] var8 = new byte[var1];
         System.arraycopy(this.buffer, var4, var8, 0, var5);
         int var9 = var5;

         for (byte[] var11 : var7) {
            System.arraycopy(var11, 0, var8, var9, var11.length);
            var9 += var11.length;
         }

         return var8;
      }

      private byte[] readRawBytesSlowPathOneChunk(int var1) {
         if (var1 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
         }

         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         }

         int var2 = this.totalBytesRetired + this.pos + var1;
         if (var2 - this.sizeLimit > 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
         }

         if (var2 > this.currentLimit) {
            this.skipRawBytes(this.currentLimit - this.totalBytesRetired - this.pos);
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         int var3 = this.bufferSize - this.pos;
         int var4 = var1 - var3;
         if (var4 >= 4096 && var4 > available(this.input)) {
            return null;
         }

         byte[] var5 = new byte[var1];
         System.arraycopy(this.buffer, this.pos, var5, 0, var3);
         this.totalBytesRetired = this.totalBytesRetired + this.bufferSize;
         this.pos = 0;
         this.bufferSize = 0;
         int var6 = var3;

         while (var6 < var5.length) {
            int var7 = read(this.input, var5, var6, var1 - var6);
            if (var7 == -1) {
               throw InvalidProtocolBufferException.truncatedMessage();
            }

            this.totalBytesRetired += var7;
            var6 += var7;
         }

         return var5;
      }

      private List<byte[]> readRawBytesSlowPathRemainingChunks(int var1) {
         ArrayList var2 = new ArrayList();

         while (var1 > 0) {
            byte[] var3 = new byte[Math.min(var1, 4096)];
            int var4 = 0;

            while (var4 < var3.length) {
               int var5 = this.input.read(var3, var4, var3.length - var4);
               if (var5 == -1) {
                  throw InvalidProtocolBufferException.truncatedMessage();
               }

               this.totalBytesRetired += var5;
               var4 += var5;
            }

            var1 -= var3.length;
            var2.add(var3);
         }

         return var2;
      }

      private ByteString readBytesSlowPath(int var1) {
         byte[] var2 = this.readRawBytesSlowPathOneChunk(var1);
         if (var2 != null) {
            return ByteString.copyFrom(var2);
         }

         int var3 = this.pos;
         int var4 = this.bufferSize - this.pos;
         this.totalBytesRetired = this.totalBytesRetired + this.bufferSize;
         this.pos = 0;
         this.bufferSize = 0;
         int var5 = var1 - var4;
         List var6 = this.readRawBytesSlowPathRemainingChunks(var5);
         byte[] var7 = new byte[var1];
         System.arraycopy(this.buffer, var3, var7, 0, var4);
         int var8 = var4;

         for (byte[] var10 : var6) {
            System.arraycopy(var10, 0, var7, var8, var10.length);
            var8 += var10.length;
         }

         return ByteString.wrap(var7);
      }

      @Override
      public void skipRawBytes(int var1) {
         if (var1 <= this.bufferSize - this.pos && var1 >= 0) {
            this.pos += var1;
         } else {
            this.skipRawBytesSlowPath(var1);
         }
      }

      private void skipRawBytesSlowPath(int var1) {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         }

         if (this.totalBytesRetired + this.pos + var1 > this.currentLimit) {
            this.skipRawBytes(this.currentLimit - this.totalBytesRetired - this.pos);
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         int var2 = 0;
         if (this.refillCallback == null) {
            this.totalBytesRetired = this.totalBytesRetired + this.pos;
            var2 = this.bufferSize - this.pos;
            this.bufferSize = 0;
            this.pos = 0;

            try {
               while (var2 < var1) {
                  int var3 = var1 - var2;
                  long var4 = skip(this.input, var3);
                  if (var4 < 0L || var4 > var3) {
                     throw new IllegalStateException(
                        this.input.getClass() + "#skip returned invalid result: " + var4 + "\nThe InputStream implementation is buggy."
                     );
                  }

                  if (var4 == 0L) {
                     break;
                  }

                  var2 += (int)var4;
               }
            } finally {
               this.totalBytesRetired += var2;
               this.recomputeBufferSizeAfterLimit();
            }
         }

         if (var2 < var1) {
            int var9 = this.bufferSize - this.pos;
            this.pos = this.bufferSize;
            this.refillBuffer(1);

            while (var1 - var9 > this.bufferSize) {
               var9 += this.bufferSize;
               this.pos = this.bufferSize;
               this.refillBuffer(1);
            }

            this.pos = var1 - var9;
         }
      }

      private interface RefillCallback {
         void onRefill();
      }

      private class SkippedDataSink implements CodedInputStream.StreamDecoder.RefillCallback {
         private int lastPos = StreamDecoder.this.pos;
         private ByteArrayOutputStream byteArrayStream;

         @Override
         public void onRefill() {
            if (this.byteArrayStream == null) {
               this.byteArrayStream = new ByteArrayOutputStream();
            }

            this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
            this.lastPos = 0;
         }

         ByteBuffer getSkippedData() {
            if (this.byteArrayStream == null) {
               return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
            }

            this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
            return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
         }
      }
   }

   private static final class UnsafeDirectNioDecoder extends CodedInputStream {
      private final ByteBuffer buffer;
      private final boolean immutable;
      private final long address;
      private long limit;
      private long pos;
      private long startPos;
      private int bufferSizeAfterLimit;
      private int lastTag;
      private boolean enableAliasing;
      private int currentLimit = Integer.MAX_VALUE;

      static boolean isSupported() {
         return UnsafeUtil.hasUnsafeByteBufferOperations();
      }

      private UnsafeDirectNioDecoder(ByteBuffer var1, boolean var2) {
         this.buffer = var1;
         this.address = UnsafeUtil.addressOffset(var1);
         this.limit = this.address + var1.limit();
         this.pos = this.address + var1.position();
         this.startPos = this.pos;
         this.immutable = var2;
      }

      @Override
      public int readTag() {
         if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
         } else {
            this.lastTag = this.readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) == 0) {
               throw InvalidProtocolBufferException.invalidTag();
            } else {
               return this.lastTag;
            }
         }
      }

      @Override
      public void checkLastTagWas(int var1) {
         if (this.lastTag != var1) {
            throw InvalidProtocolBufferException.invalidEndTag();
         }
      }

      @Override
      public int getLastTag() {
         return this.lastTag;
      }

      @Override
      public boolean skipField(int var1) {
         switch (WireFormat.getTagWireType(var1)) {
            case 0:
               this.skipRawVarint();
               return true;
            case 1:
               this.skipRawBytes(8);
               return true;
            case 2:
               this.skipRawBytes(this.readRawVarint32());
               return true;
            case 3:
               this.skipMessage();
               this.checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4));
               return true;
            case 4:
               return false;
            case 5:
               this.skipRawBytes(4);
               return true;
            default:
               throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      @Override
      public boolean skipField(int var1, CodedOutputStream var2) {
         switch (WireFormat.getTagWireType(var1)) {
            case 0:
               long var8 = this.readInt64();
               var2.writeUInt32NoTag(var1);
               var2.writeUInt64NoTag(var8);
               return true;
            case 1:
               long var7 = this.readRawLittleEndian64();
               var2.writeUInt32NoTag(var1);
               var2.writeFixed64NoTag(var7);
               return true;
            case 2:
               ByteString var6 = this.readBytes();
               var2.writeUInt32NoTag(var1);
               var2.writeBytesNoTag(var6);
               return true;
            case 3:
               var2.writeUInt32NoTag(var1);
               this.skipMessage(var2);
               int var5 = WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4);
               this.checkLastTagWas(var5);
               var2.writeUInt32NoTag(var5);
               return true;
            case 4:
               return false;
            case 5:
               int var3 = this.readRawLittleEndian32();
               var2.writeUInt32NoTag(var1);
               var2.writeFixed32NoTag(var3);
               return true;
            default:
               throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      @Override
      public void skipMessage() {
         int var1;
         do {
            var1 = this.readTag();
         } while (var1 != 0 && this.skipField(var1));
      }

      @Override
      public void skipMessage(CodedOutputStream var1) {
         int var2;
         do {
            var2 = this.readTag();
         } while (var2 != 0 && this.skipField(var2, var1));
      }

      @Override
      public double readDouble() {
         return Double.longBitsToDouble(this.readRawLittleEndian64());
      }

      @Override
      public float readFloat() {
         return Float.intBitsToFloat(this.readRawLittleEndian32());
      }

      @Override
      public long readUInt64() {
         return this.readRawVarint64();
      }

      @Override
      public long readInt64() {
         return this.readRawVarint64();
      }

      @Override
      public int readInt32() {
         return this.readRawVarint32();
      }

      @Override
      public long readFixed64() {
         return this.readRawLittleEndian64();
      }

      @Override
      public int readFixed32() {
         return this.readRawLittleEndian32();
      }

      @Override
      public boolean readBool() {
         return this.readRawVarint64() != 0L;
      }

      @Override
      public String readString() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.remaining()) {
            byte[] var2 = new byte[var1];
            UnsafeUtil.copyMemory(this.pos, var2, 0L, var1);
            String var3 = new String(var2, Internal.UTF_8);
            this.pos += var1;
            return var3;
         } else if (var1 == 0) {
            return "";
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public String readStringRequireUtf8() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.remaining()) {
            int var2 = this.bufferPos(this.pos);
            String var3 = Utf8.decodeUtf8(this.buffer, var2, var1);
            this.pos += var1;
            return var3;
         } else if (var1 == 0) {
            return "";
         } else if (var1 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3) {
         this.checkRecursionLimit();
         this.recursionDepth++;
         var2.mergeFrom(this, var3);
         this.checkLastTagWas(WireFormat.makeTag(var1, 4));
         this.recursionDepth--;
      }

      @Override
      public <T extends MessageLite> T readGroup(int var1, Parser<T> var2, ExtensionRegistryLite var3) {
         this.checkRecursionLimit();
         this.recursionDepth++;
         MessageLite var4 = (MessageLite)var2.parsePartialFrom(this, var3);
         this.checkLastTagWas(WireFormat.makeTag(var1, 4));
         this.recursionDepth--;
         return (T)var4;
      }

      @Deprecated
      @Override
      public void readUnknownGroup(int var1, MessageLite.Builder var2) {
         this.readGroup(var1, var2, ExtensionRegistryLite.getEmptyRegistry());
      }

      @Override
      public void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2) {
         int var3 = this.readRawVarint32();
         this.checkRecursionLimit();
         int var4 = this.pushLimit(var3);
         this.recursionDepth++;
         var1.mergeFrom(this, var2);
         this.checkLastTagWas(0);
         this.recursionDepth--;
         if (this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.popLimit(var4);
      }

      @Override
      public <T extends MessageLite> T readMessage(Parser<T> var1, ExtensionRegistryLite var2) {
         int var3 = this.readRawVarint32();
         this.checkRecursionLimit();
         int var4 = this.pushLimit(var3);
         this.recursionDepth++;
         MessageLite var5 = (MessageLite)var1.parsePartialFrom(this, var2);
         this.checkLastTagWas(0);
         this.recursionDepth--;
         if (this.getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.popLimit(var4);
         return (T)var5;
      }

      @Override
      public ByteString readBytes() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.remaining()) {
            if (this.immutable && this.enableAliasing) {
               ByteBuffer var3 = this.slice(this.pos, this.pos + var1);
               this.pos += var1;
               return ByteString.wrap(var3);
            } else {
               byte[] var2 = new byte[var1];
               UnsafeUtil.copyMemory(this.pos, var2, 0L, var1);
               this.pos += var1;
               return ByteString.wrap(var2);
            }
         } else if (var1 == 0) {
            return ByteString.EMPTY;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public byte[] readByteArray() {
         return this.readRawBytes(this.readRawVarint32());
      }

      @Override
      public ByteBuffer readByteBuffer() {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.remaining()) {
            if (!this.immutable && this.enableAliasing) {
               ByteBuffer var3 = this.slice(this.pos, this.pos + var1);
               this.pos += var1;
               return var3;
            } else {
               byte[] var2 = new byte[var1];
               UnsafeUtil.copyMemory(this.pos, var2, 0L, var1);
               this.pos += var1;
               return ByteBuffer.wrap(var2);
            }
         } else if (var1 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public int readUInt32() {
         return this.readRawVarint32();
      }

      @Override
      public int readEnum() {
         return this.readRawVarint32();
      }

      @Override
      public int readSFixed32() {
         return this.readRawLittleEndian32();
      }

      @Override
      public long readSFixed64() {
         return this.readRawLittleEndian64();
      }

      @Override
      public int readSInt32() {
         return decodeZigZag32(this.readRawVarint32());
      }

      @Override
      public long readSInt64() {
         return decodeZigZag64(this.readRawVarint64());
      }

      @Override
      public int readRawVarint32() {
         long var1;
         int var11;
         label47: {
            var1 = this.pos;
            if (this.limit != var1) {
               byte var3;
               if ((var3 = UnsafeUtil.getByte(var1++)) >= 0) {
                  this.pos = var1;
                  return var3;
               }

               if (this.limit - var1 >= 9L) {
                  if ((var3 = var3 ^ UnsafeUtil.getByte(var1++) << 7) < 0) {
                     var11 = var3 ^ -128;
                     break label47;
                  }

                  if ((var3 = var3 ^ UnsafeUtil.getByte(var1++) << 14) >= 0) {
                     var11 = var3 ^ 16256;
                     break label47;
                  }

                  if ((var3 = var3 ^ UnsafeUtil.getByte(var1++) << 21) < 0) {
                     var11 = var3 ^ -2080896;
                     break label47;
                  }

                  byte var4 = UnsafeUtil.getByte(var1++);
                  var3 ^= var4 << 28;
                  var11 = var3 ^ 266354560;
                  if (var4 >= 0
                     || UnsafeUtil.getByte(var1++) >= 0
                     || UnsafeUtil.getByte(var1++) >= 0
                     || UnsafeUtil.getByte(var1++) >= 0
                     || UnsafeUtil.getByte(var1++) >= 0
                     || UnsafeUtil.getByte(var1++) >= 0) {
                     break label47;
                  }
               }
            }

            return (int)this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var11;
      }

      private void skipRawVarint() {
         if (this.remaining() >= 10) {
            this.skipRawVarintFastPath();
         } else {
            this.skipRawVarintSlowPath();
         }
      }

      private void skipRawVarintFastPath() {
         for (int var1 = 0; var1 < 10; var1++) {
            if (UnsafeUtil.getByte(this.pos++) >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      private void skipRawVarintSlowPath() {
         for (int var1 = 0; var1 < 10; var1++) {
            if (this.readRawByte() >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      @Override
      public long readRawVarint64() {
         long var1;
         long var12;
         label51: {
            var1 = this.pos;
            if (this.limit != var1) {
               byte var5;
               if ((var5 = UnsafeUtil.getByte(var1++)) >= 0) {
                  this.pos = var1;
                  return var5;
               }

               if (this.limit - var1 >= 9L) {
                  if ((var5 = var5 ^ UnsafeUtil.getByte(var1++) << 7) < 0) {
                     var12 = var5 ^ -128;
                     break label51;
                  }

                  if ((var5 = var5 ^ UnsafeUtil.getByte(var1++) << 14) >= 0) {
                     var12 = var5 ^ 16256;
                     break label51;
                  }

                  if ((var5 = var5 ^ UnsafeUtil.getByte(var1++) << 21) < 0) {
                     var12 = var5 ^ -2080896;
                     break label51;
                  }

                  if ((var12 = var5 ^ (long)UnsafeUtil.getByte(var1++) << 28) >= 0L) {
                     var12 ^= 266354560L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)UnsafeUtil.getByte(var1++) << 35) < 0L) {
                     var12 ^= -34093383808L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)UnsafeUtil.getByte(var1++) << 42) >= 0L) {
                     var12 ^= 4363953127296L;
                     break label51;
                  }

                  if ((var12 = var12 ^ (long)UnsafeUtil.getByte(var1++) << 49) < 0L) {
                     var12 ^= -558586000294016L;
                     break label51;
                  }

                  var12 ^= (long)UnsafeUtil.getByte(var1++) << 56;
                  var12 ^= 71499008037633920L;
                  if (var12 >= 0L || UnsafeUtil.getByte(var1++) >= 0L) {
                     break label51;
                  }
               }
            }

            return this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var12;
      }

      @Override
      long readRawVarint64SlowPath() {
         long var1 = 0L;

         for (byte var3 = 0; var3 < 64; var3 += 7) {
            byte var4 = this.readRawByte();
            var1 |= (long)(var4 & 127) << var3;
            if ((var4 & 128) == 0) {
               return var1;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      @Override
      public int readRawLittleEndian32() {
         long var1 = this.pos;
         if (this.limit - var1 < 4L) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.pos = var1 + 4L;
         return UnsafeUtil.getByte(var1) & 0xFF
            | (UnsafeUtil.getByte(var1 + 1L) & 0xFF) << 8
            | (UnsafeUtil.getByte(var1 + 2L) & 0xFF) << 16
            | (UnsafeUtil.getByte(var1 + 3L) & 0xFF) << 24;
      }

      @Override
      public long readRawLittleEndian64() {
         long var1 = this.pos;
         if (this.limit - var1 < 8L) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.pos = var1 + 8L;
         return UnsafeUtil.getByte(var1) & 255L
            | (UnsafeUtil.getByte(var1 + 1L) & 255L) << 8
            | (UnsafeUtil.getByte(var1 + 2L) & 255L) << 16
            | (UnsafeUtil.getByte(var1 + 3L) & 255L) << 24
            | (UnsafeUtil.getByte(var1 + 4L) & 255L) << 32
            | (UnsafeUtil.getByte(var1 + 5L) & 255L) << 40
            | (UnsafeUtil.getByte(var1 + 6L) & 255L) << 48
            | (UnsafeUtil.getByte(var1 + 7L) & 255L) << 56;
      }

      @Override
      public void enableAliasing(boolean var1) {
         this.enableAliasing = var1;
      }

      @Override
      public void resetSizeCounter() {
         this.startPos = this.pos;
      }

      @Override
      public int pushLimit(int var1) {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         }

         var1 += this.getTotalBytesRead();
         int var2 = this.currentLimit;
         if (var1 > var2) {
            throw InvalidProtocolBufferException.truncatedMessage();
         }

         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
         return var2;
      }

      @Override
      public void popLimit(int var1) {
         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
      }

      @Override
      public int getBytesUntilLimit() {
         return this.currentLimit == Integer.MAX_VALUE ? -1 : this.currentLimit - this.getTotalBytesRead();
      }

      @Override
      public boolean isAtEnd() {
         return this.pos == this.limit;
      }

      @Override
      public int getTotalBytesRead() {
         return (int)(this.pos - this.startPos);
      }

      @Override
      public byte readRawByte() {
         if (this.pos == this.limit) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            return UnsafeUtil.getByte(this.pos++);
         }
      }

      @Override
      public byte[] readRawBytes(int var1) {
         if (var1 >= 0 && var1 <= this.remaining()) {
            byte[] var2 = new byte[var1];
            this.slice(this.pos, this.pos + var1).get(var2);
            this.pos += var1;
            return var2;
         }

         if (var1 <= 0) {
            if (var1 == 0) {
               return Internal.EMPTY_BYTE_ARRAY;
            } else {
               throw InvalidProtocolBufferException.negativeSize();
            }
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      @Override
      public void skipRawBytes(int var1) {
         if (var1 >= 0 && var1 <= this.remaining()) {
            this.pos += var1;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      private void recomputeBufferSizeAfterLimit() {
         this.limit = this.limit + this.bufferSizeAfterLimit;
         int var1 = (int)(this.limit - this.startPos);
         if (var1 > this.currentLimit) {
            this.bufferSizeAfterLimit = var1 - this.currentLimit;
            this.limit = this.limit - this.bufferSizeAfterLimit;
         } else {
            this.bufferSizeAfterLimit = 0;
         }
      }

      private int remaining() {
         return (int)(this.limit - this.pos);
      }

      private int bufferPos(long var1) {
         return (int)(var1 - this.address);
      }

      private ByteBuffer slice(long var1, long var3) {
         int var5 = this.buffer.position();
         int var6 = this.buffer.limit();
         ByteBuffer var7 = this.buffer;

         try {
            ((Buffer)var7).position(this.bufferPos(var1));
            ((Buffer)var7).limit(this.bufferPos(var3));
            return this.buffer.slice();
         } catch (IllegalArgumentException var13) {
            InvalidProtocolBufferException var9 = InvalidProtocolBufferException.truncatedMessage();
            var9.initCause(var13);
            throw var9;
         } finally {
            ((Buffer)var7).position(var5);
            ((Buffer)var7).limit(var6);
         }
      }
   }
}
