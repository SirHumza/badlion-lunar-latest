package org.tritonus.sampled.file;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.AudioFormat;
import org.tritonus.share.sampled.file.TAudioOutputStream;
import org.tritonus.share.sampled.file.TDataOutputStream;

public class WaveAudioOutputStream extends TAudioOutputStream {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioOutputStream");
   private static final int LENGTH_NOT_KNOWN = -1;

   public WaveAudioOutputStream(AudioFormat var1, long var2, TDataOutputStream var4) {
      super(var1, var2, var4, var4.supportsSeek());
      if (var2 != -1L && var2 + 46L > 4294967295L) {
         logger.log(
            Level.TRACE,
            "WaveAudioOutputStream: Length exceeds 4GB: "
               + var2
               + "=0x"
               + Long.toHexString(var2)
               + " with header="
               + (var2 + 46L)
               + "=0x"
               + Long.toHexString(var2 + 46L)
         );
         throw new IllegalArgumentException("Wave files cannot be larger than 4GB.");
      }

      if (WaveTool.getFormatCode(this.getFormat()) == 0) {
         throw new IllegalArgumentException("Unknown encoding/format for WAVE file: " + var1);
      }

      this.requireSign8bit(false);
      this.requireEndianness(false);
      logger.log(Level.TRACE, "Writing WAVE: " + var1.getSampleSizeInBits() + " bits, " + var1.getEncoding());
   }

   @Override
   protected void writeHeader() {
      logger.log(Level.TRACE, "WaveAudioOutputStream.writeHeader()");
      short var1 = WaveTool.getFormatCode(this.getFormat());
      AudioFormat var2 = this.getFormat();
      long var3 = this.getLength();
      byte var5 = 0;
      if (var1 == 49) {
         var5 += 2;
      }

      int var6 = 46 + var5;
      if (var1 != 1) {
         var6 += 12;
      }

      if (var3 != -1L && var3 + var6 > 4294967295L) {
         var3 = 4294967295L - var6;
      }

      long var7 = var3 + var3 % 2L;
      if (var3 == -1L || var7 > 4294967295L) {
         var7 = 4294967295L;
      }

      long var9 = var7 + var6 - 8L;
      if (var3 == -1L || var9 > 4294967295L) {
         var9 = 4294967295L;
      }

      TDataOutputStream var11 = this.getDataOutputStream();
      var11.writeInt(1380533830);
      var11.writeLittleEndian32((int)var9);
      var11.writeInt(1463899717);
      int var12 = 18 + var5;
      short var13 = (short)var2.getSampleSizeInBits();
      int var14 = 1;
      if (var1 == 49) {
         if (var2.getFrameSize() == 33) {
            var14 = 160;
         } else if (var2.getFrameSize() == 65) {
            var14 = 320;
         } else {
            var14 = (int)(var2.getFrameSize() * 4.923077F);
         }

         var13 = 0;
      }

      int var15 = (int)var2.getSampleRate() / var14 * var2.getFrameSize();
      var11.writeInt(1718449184);
      var11.writeLittleEndian32(var12);
      var11.writeLittleEndian16((short)var1);
      var11.writeLittleEndian16((short)var2.getChannels());
      var11.writeLittleEndian32((int)var2.getSampleRate());
      var11.writeLittleEndian32(var15);
      var11.writeLittleEndian16((short)var2.getFrameSize());
      var11.writeLittleEndian16(var13);
      var11.writeLittleEndian16(var5);
      if (var1 == 49) {
         var11.writeLittleEndian16((short)var14);
      }

      if (var1 != 1) {
         long var16 = 0L;
         if (var3 != -1L) {
            var16 = var3 / var2.getFrameSize() * var14;
         }

         if (var16 > 4294967295L) {
            var16 = 4294967295L / var14 * var14;
         }

         var11.writeInt(1717658484);
         var11.writeLittleEndian32(4);
         var11.writeLittleEndian32((int)var16);
      }

      var11.writeInt(1684108385);
      var11.writeLittleEndian32(var3 != -1L ? (int)var3 : -1);
   }

   @Override
   protected void patchHeader() {
      TDataOutputStream var1 = this.getDataOutputStream();
      var1.seek(0L);
      this.setLengthFromCalculatedLength();
      this.writeHeader();
   }

   @Override
   public void close() {
      long var1 = this.getCalculatedLength();
      if (var1 % 2L == 1L) {
         logger.log(Level.TRACE, "WaveOutputStream.close(): adding padding byte");
         TDataOutputStream var3 = this.getDataOutputStream();
         var3.writeByte(0);
      }

      super.close();
   }
}
