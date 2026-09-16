package org.tritonus.sampled.file;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.file.TAudioOutputStream;
import org.tritonus.share.sampled.file.TDataOutputStream;

public class AiffAudioOutputStream extends TAudioOutputStream {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioOutputStream");
   private static final int LENGTH_NOT_KNOWN = -1;
   private Type m_FileType;

   public AiffAudioOutputStream(AudioFormat var1, Type var2, long var3, TDataOutputStream var5) {
      super(var1, var3, var5, var5.supportsSeek());
      if (var3 != -1L && var3 > 2147483647L) {
         throw new IllegalArgumentException("AIFF files cannot be larger than 2GB.");
      }

      this.m_FileType = var2;
      if (!var1.getEncoding().equals(Encoding.PCM_SIGNED) && !var1.getEncoding().equals(Encoding.PCM_UNSIGNED)) {
         this.m_FileType = Type.AIFC;
      }

      if (AiffTool.getFormatCode(var1) == 0) {
         throw new IllegalArgumentException("Unknown encoding/format for AIFF file: " + var1);
      }

      this.requireSign8bit(true);
      this.requireEndianness(true);
      logger.log(Level.TRACE, "Writing " + this.m_FileType + ": " + var1.getSampleSizeInBits() + " bits, " + var1.getEncoding());
   }

   @Override
   protected void writeHeader() {
      logger.log(Level.TRACE, "AiffAudioOutputStream.writeHeader(): called.");
      AudioFormat var1 = this.getFormat();
      boolean var2 = this.m_FileType.equals(Type.AIFC);
      long var3 = this.getLength();
      TDataOutputStream var5 = this.getDataOutputStream();
      byte var6 = 18;
      int var7 = AiffTool.getFormatCode(var1);
      if (var2) {
         var6 += 6;
      }

      int var8 = 12 + var6 + 8;
      if (var2) {
         var8 += 12;
      }

      if (var3 != -1L && var3 + var8 > 2147483647L) {
         var3 = 2147483647L - var8;
      }

      long var9 = var3 != -1L ? var3 + var3 % 2L + 8L : -1L;
      var5.writeInt(1179603533);
      var5.writeInt(var3 != -1L ? (int)(var9 + var8) : -1);
      if (var2) {
         var5.writeInt(1095321155);
         var5.writeInt(1180058962);
         var5.writeInt(4);
         var5.writeInt(-1568648896);
      } else {
         var5.writeInt(1095321158);
      }

      var5.writeInt(1129270605);
      var5.writeInt(var6);
      var5.writeShort((short)var1.getChannels());
      var5.writeInt(var3 != -1L ? (int)(var3 / var1.getFrameSize()) : -1);
      if (var7 == 1970037111) {
         var5.writeShort(16);
      } else {
         var5.writeShort((short)var1.getSampleSizeInBits());
      }

      this.writeIeeeExtended(var5, var1.getSampleRate());
      if (var2) {
         var5.writeInt(var7);
         var5.writeShort(0);
      }

      var5.writeInt(1397968452);
      var5.writeInt(var3 != -1L ? (int)(var3 + 8L) : -1);
      var5.writeInt(0);
      var5.writeInt(0);
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
         logger.log(Level.TRACE, "AiffOutputStream.close(): adding padding byte");
         TDataOutputStream var3 = this.getDataOutputStream();
         var3.writeByte(0);
      }

      super.close();
   }

   public void writeIeeeExtended(TDataOutputStream var1, float var2) {
      int var3 = (int)var2;
      short var4 = 0;

      while (var3 != 0 && (var3 & -2147483648) == 0) {
         var4++;
         var3 <<= 1;
      }

      var1.writeShort(16414 - var4);
      var1.writeInt(var3);
      var1.writeInt(0);
   }
}
