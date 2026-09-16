package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JavaSafeCompressor extends LZ4Compressor {
   public static final LZ4Compressor INSTANCE = new LZ4JavaSafeCompressor();

   static int compress64k(byte[] src, int srcOff, int srcLen, byte[] dest, int destOff, int destEnd) {
      int srcEnd = srcOff + srcLen;
      int srcLimit = srcEnd - 5;
      int mflimit = srcEnd - 12;
      int sOff = srcOff;
      int dOff = destOff;
      int anchor = sOff;
      if (srcLen >= 13) {
         short[] hashTable = new short[8192];
         sOff++;

         label55:
         while (true) {
            int forwardOff = sOff;
            int step = 1;
            int searchMatchNb = 1 << LZ4Constants.SKIP_STRENGTH;

            int ref;
            do {
               sOff = forwardOff;
               forwardOff += step;
               step = searchMatchNb++ >>> LZ4Constants.SKIP_STRENGTH;
               if (forwardOff > mflimit) {
                  break label55;
               }

               int h = LZ4Utils.hash64k(SafeUtils.readInt(src, sOff));
               ref = srcOff + SafeUtils.readShort(hashTable, h);
               SafeUtils.writeShort(hashTable, h, sOff - srcOff);
            } while (!LZ4SafeUtils.readIntEquals(src, ref, sOff));

            int excess = LZ4SafeUtils.commonBytesBackward(src, ref, sOff, srcOff, anchor);
            sOff -= excess;
            ref -= excess;
            int runLen = sOff - anchor;
            int tokenOff = dOff++;
            if (dOff + runLen + 8 + (runLen >>> 8) > destEnd) {
               throw new LZ4Exception("maxDestLen is too small");
            }

            if (runLen >= 15) {
               SafeUtils.writeByte(dest, tokenOff, 240);
               dOff = LZ4SafeUtils.writeLen(runLen - 15, dest, dOff);
            } else {
               SafeUtils.writeByte(dest, tokenOff, runLen << 4);
            }

            LZ4SafeUtils.wildArraycopy(src, anchor, dest, dOff, runLen);
            dOff += runLen;

            while (true) {
               SafeUtils.writeShortLE(dest, dOff, (short)(sOff - ref));
               dOff += 2;
               sOff += 4;
               ref += 4;
               int matchLen = LZ4SafeUtils.commonBytes(src, ref, sOff, srcLimit);
               if (dOff + 6 + (matchLen >>> 8) > destEnd) {
                  throw new LZ4Exception("maxDestLen is too small");
               }

               sOff += matchLen;
               if (matchLen >= 15) {
                  SafeUtils.writeByte(dest, tokenOff, SafeUtils.readByte(dest, tokenOff) | 15);
                  dOff = LZ4SafeUtils.writeLen(matchLen - 15, dest, dOff);
               } else {
                  SafeUtils.writeByte(dest, tokenOff, SafeUtils.readByte(dest, tokenOff) | matchLen);
               }

               if (sOff > mflimit) {
                  anchor = sOff;
                  break label55;
               }

               SafeUtils.writeShort(hashTable, LZ4Utils.hash64k(SafeUtils.readInt(src, sOff - 2)), sOff - 2 - srcOff);
               int h = LZ4Utils.hash64k(SafeUtils.readInt(src, sOff));
               ref = srcOff + SafeUtils.readShort(hashTable, h);
               SafeUtils.writeShort(hashTable, h, sOff - srcOff);
               if (!LZ4SafeUtils.readIntEquals(src, sOff, ref)) {
                  anchor = sOff++;
                  break;
               }

               tokenOff = dOff++;
               SafeUtils.writeByte(dest, tokenOff, 0);
            }
         }
      }

      dOff = LZ4SafeUtils.lastLiterals(src, anchor, srcEnd - anchor, dest, dOff, destEnd);
      return dOff - destOff;
   }

   @Override
   public int compress(byte[] src, int srcOff, int srcLen, byte[] dest, int destOff, int maxDestLen) {
      SafeUtils.checkRange(src, srcOff, srcLen);
      SafeUtils.checkRange(dest, destOff, maxDestLen);
      int destEnd = destOff + maxDestLen;
      if (srcLen < 65547) {
         return compress64k(src, srcOff, srcLen, dest, destOff, destEnd);
      }

      int srcEnd = srcOff + srcLen;
      int srcLimit = srcEnd - 5;
      int mflimit = srcEnd - 12;
      int sOff = srcOff;
      int dOff = destOff;
      int anchor = sOff++;
      int[] hashTable = new int[4096];
      Arrays.fill(hashTable, anchor);

      label63:
      while (true) {
         int forwardOff = sOff;
         int step = 1;
         int searchMatchNb = 1 << LZ4Constants.SKIP_STRENGTH;

         label59:
         while (true) {
            sOff = forwardOff;
            forwardOff += step;
            step = searchMatchNb++ >>> LZ4Constants.SKIP_STRENGTH;
            if (forwardOff > mflimit) {
               break;
            }

            int h = LZ4Utils.hash(SafeUtils.readInt(src, sOff));
            int ref = SafeUtils.readInt(hashTable, h);
            int back = sOff - ref;
            SafeUtils.writeInt(hashTable, h, sOff);
            if (back < 65536 && LZ4SafeUtils.readIntEquals(src, ref, sOff)) {
               h = LZ4SafeUtils.commonBytesBackward(src, ref, sOff, srcOff, anchor);
               sOff -= h;
               ref -= h;
               int runLen = sOff - anchor;
               int tokenOff = dOff++;
               if (dOff + runLen + 8 + (runLen >>> 8) > destEnd) {
                  throw new LZ4Exception("maxDestLen is too small");
               }

               if (runLen >= 15) {
                  SafeUtils.writeByte(dest, tokenOff, 240);
                  dOff = LZ4SafeUtils.writeLen(runLen - 15, dest, dOff);
               } else {
                  SafeUtils.writeByte(dest, tokenOff, runLen << 4);
               }

               LZ4SafeUtils.wildArraycopy(src, anchor, dest, dOff, runLen);
               dOff += runLen;

               while (true) {
                  SafeUtils.writeShortLE(dest, dOff, back);
                  dOff += 2;
                  sOff += 4;
                  int matchLen = LZ4SafeUtils.commonBytes(src, ref + 4, sOff, srcLimit);
                  if (dOff + 6 + (matchLen >>> 8) > destEnd) {
                     throw new LZ4Exception("maxDestLen is too small");
                  }

                  sOff += matchLen;
                  if (matchLen >= 15) {
                     SafeUtils.writeByte(dest, tokenOff, SafeUtils.readByte(dest, tokenOff) | 15);
                     dOff = LZ4SafeUtils.writeLen(matchLen - 15, dest, dOff);
                  } else {
                     SafeUtils.writeByte(dest, tokenOff, SafeUtils.readByte(dest, tokenOff) | matchLen);
                  }

                  if (sOff > mflimit) {
                     anchor = sOff;
                     break label59;
                  }

                  SafeUtils.writeInt(hashTable, LZ4Utils.hash(SafeUtils.readInt(src, sOff - 2)), sOff - 2);
                  int hx = LZ4Utils.hash(SafeUtils.readInt(src, sOff));
                  ref = SafeUtils.readInt(hashTable, hx);
                  SafeUtils.writeInt(hashTable, hx, sOff);
                  back = sOff - ref;
                  if (back >= 65536 || !LZ4SafeUtils.readIntEquals(src, ref, sOff)) {
                     anchor = sOff++;
                     continue label63;
                  }

                  tokenOff = dOff++;
                  SafeUtils.writeByte(dest, tokenOff, 0);
               }
            }
         }

         dOff = LZ4SafeUtils.lastLiterals(src, anchor, srcEnd - anchor, dest, dOff, destEnd);
         return dOff - destOff;
      }
   }

   static int compress64k(ByteBuffer src, int srcOff, int srcLen, ByteBuffer dest, int destOff, int destEnd) {
      int srcEnd = srcOff + srcLen;
      int srcLimit = srcEnd - 5;
      int mflimit = srcEnd - 12;
      int sOff = srcOff;
      int dOff = destOff;
      int anchor = sOff;
      if (srcLen >= 13) {
         short[] hashTable = new short[8192];
         sOff++;

         label55:
         while (true) {
            int forwardOff = sOff;
            int step = 1;
            int searchMatchNb = 1 << LZ4Constants.SKIP_STRENGTH;

            int ref;
            do {
               sOff = forwardOff;
               forwardOff += step;
               step = searchMatchNb++ >>> LZ4Constants.SKIP_STRENGTH;
               if (forwardOff > mflimit) {
                  break label55;
               }

               int h = LZ4Utils.hash64k(ByteBufferUtils.readInt(src, sOff));
               ref = srcOff + SafeUtils.readShort(hashTable, h);
               SafeUtils.writeShort(hashTable, h, sOff - srcOff);
            } while (!LZ4ByteBufferUtils.readIntEquals(src, ref, sOff));

            int excess = LZ4ByteBufferUtils.commonBytesBackward(src, ref, sOff, srcOff, anchor);
            sOff -= excess;
            ref -= excess;
            int runLen = sOff - anchor;
            int tokenOff = dOff++;
            if (dOff + runLen + 8 + (runLen >>> 8) > destEnd) {
               throw new LZ4Exception("maxDestLen is too small");
            }

            if (runLen >= 15) {
               ByteBufferUtils.writeByte(dest, tokenOff, 240);
               dOff = LZ4ByteBufferUtils.writeLen(runLen - 15, dest, dOff);
            } else {
               ByteBufferUtils.writeByte(dest, tokenOff, runLen << 4);
            }

            LZ4ByteBufferUtils.wildArraycopy(src, anchor, dest, dOff, runLen);
            dOff += runLen;

            while (true) {
               ByteBufferUtils.writeShortLE(dest, dOff, (short)(sOff - ref));
               dOff += 2;
               sOff += 4;
               ref += 4;
               int matchLen = LZ4ByteBufferUtils.commonBytes(src, ref, sOff, srcLimit);
               if (dOff + 6 + (matchLen >>> 8) > destEnd) {
                  throw new LZ4Exception("maxDestLen is too small");
               }

               sOff += matchLen;
               if (matchLen >= 15) {
                  ByteBufferUtils.writeByte(dest, tokenOff, ByteBufferUtils.readByte(dest, tokenOff) | 15);
                  dOff = LZ4ByteBufferUtils.writeLen(matchLen - 15, dest, dOff);
               } else {
                  ByteBufferUtils.writeByte(dest, tokenOff, ByteBufferUtils.readByte(dest, tokenOff) | matchLen);
               }

               if (sOff > mflimit) {
                  anchor = sOff;
                  break label55;
               }

               SafeUtils.writeShort(hashTable, LZ4Utils.hash64k(ByteBufferUtils.readInt(src, sOff - 2)), sOff - 2 - srcOff);
               int h = LZ4Utils.hash64k(ByteBufferUtils.readInt(src, sOff));
               ref = srcOff + SafeUtils.readShort(hashTable, h);
               SafeUtils.writeShort(hashTable, h, sOff - srcOff);
               if (!LZ4ByteBufferUtils.readIntEquals(src, sOff, ref)) {
                  anchor = sOff++;
                  break;
               }

               tokenOff = dOff++;
               ByteBufferUtils.writeByte(dest, tokenOff, 0);
            }
         }
      }

      dOff = LZ4ByteBufferUtils.lastLiterals(src, anchor, srcEnd - anchor, dest, dOff, destEnd);
      return dOff - destOff;
   }

   @Override
   public int compress(ByteBuffer src, int srcOff, int srcLen, ByteBuffer dest, int destOff, int maxDestLen) {
      if (src.hasArray() && dest.hasArray()) {
         return this.compress(src.array(), srcOff + src.arrayOffset(), srcLen, dest.array(), destOff + dest.arrayOffset(), maxDestLen);
      }

      src = ByteBufferUtils.inNativeByteOrder(src);
      dest = ByteBufferUtils.inNativeByteOrder(dest);
      ByteBufferUtils.checkRange(src, srcOff, srcLen);
      ByteBufferUtils.checkRange(dest, destOff, maxDestLen);
      int destEnd = destOff + maxDestLen;
      if (srcLen < 65547) {
         return compress64k(src, srcOff, srcLen, dest, destOff, destEnd);
      }

      int srcEnd = srcOff + srcLen;
      int srcLimit = srcEnd - 5;
      int mflimit = srcEnd - 12;
      int sOff = srcOff;
      int dOff = destOff;
      int anchor = sOff++;
      int[] hashTable = new int[4096];
      Arrays.fill(hashTable, anchor);

      label69:
      while (true) {
         int forwardOff = sOff;
         int step = 1;
         int searchMatchNb = 1 << LZ4Constants.SKIP_STRENGTH;

         label65:
         while (true) {
            sOff = forwardOff;
            forwardOff += step;
            step = searchMatchNb++ >>> LZ4Constants.SKIP_STRENGTH;
            if (forwardOff > mflimit) {
               break;
            }

            int h = LZ4Utils.hash(ByteBufferUtils.readInt(src, sOff));
            int ref = SafeUtils.readInt(hashTable, h);
            int back = sOff - ref;
            SafeUtils.writeInt(hashTable, h, sOff);
            if (back < 65536 && LZ4ByteBufferUtils.readIntEquals(src, ref, sOff)) {
               h = LZ4ByteBufferUtils.commonBytesBackward(src, ref, sOff, srcOff, anchor);
               sOff -= h;
               ref -= h;
               int runLen = sOff - anchor;
               int tokenOff = dOff++;
               if (dOff + runLen + 8 + (runLen >>> 8) > destEnd) {
                  throw new LZ4Exception("maxDestLen is too small");
               }

               if (runLen >= 15) {
                  ByteBufferUtils.writeByte(dest, tokenOff, 240);
                  dOff = LZ4ByteBufferUtils.writeLen(runLen - 15, dest, dOff);
               } else {
                  ByteBufferUtils.writeByte(dest, tokenOff, runLen << 4);
               }

               LZ4ByteBufferUtils.wildArraycopy(src, anchor, dest, dOff, runLen);
               dOff += runLen;

               while (true) {
                  ByteBufferUtils.writeShortLE(dest, dOff, back);
                  dOff += 2;
                  sOff += 4;
                  int matchLen = LZ4ByteBufferUtils.commonBytes(src, ref + 4, sOff, srcLimit);
                  if (dOff + 6 + (matchLen >>> 8) > destEnd) {
                     throw new LZ4Exception("maxDestLen is too small");
                  }

                  sOff += matchLen;
                  if (matchLen >= 15) {
                     ByteBufferUtils.writeByte(dest, tokenOff, ByteBufferUtils.readByte(dest, tokenOff) | 15);
                     dOff = LZ4ByteBufferUtils.writeLen(matchLen - 15, dest, dOff);
                  } else {
                     ByteBufferUtils.writeByte(dest, tokenOff, ByteBufferUtils.readByte(dest, tokenOff) | matchLen);
                  }

                  if (sOff > mflimit) {
                     anchor = sOff;
                     break label65;
                  }

                  SafeUtils.writeInt(hashTable, LZ4Utils.hash(ByteBufferUtils.readInt(src, sOff - 2)), sOff - 2);
                  int hx = LZ4Utils.hash(ByteBufferUtils.readInt(src, sOff));
                  ref = SafeUtils.readInt(hashTable, hx);
                  SafeUtils.writeInt(hashTable, hx, sOff);
                  back = sOff - ref;
                  if (back >= 65536 || !LZ4ByteBufferUtils.readIntEquals(src, ref, sOff)) {
                     anchor = sOff++;
                     continue label69;
                  }

                  tokenOff = dOff++;
                  ByteBufferUtils.writeByte(dest, tokenOff, 0);
               }
            }
         }

         dOff = LZ4ByteBufferUtils.lastLiterals(src, anchor, srcEnd - anchor, dest, dOff, destEnd);
         return dOff - destOff;
      }
   }
}
