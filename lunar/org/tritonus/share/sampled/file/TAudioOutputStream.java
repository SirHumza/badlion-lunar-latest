package org.tritonus.share.sampled.file;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.AudioUtils;
import org.tritonus.share.sampled.TConversionTool;

public abstract class TAudioOutputStream implements AudioOutputStream {
   private static final Logger logger = System.getLogger(TAudioOutputStream.class.getName());
   private AudioFormat m_audioFormat;
   private long m_lLength;
   private long m_lCalculatedLength;
   private TDataOutputStream m_dataOutputStream;
   private boolean m_bDoBackPatching;
   private boolean m_bHeaderWritten;
   private boolean m_doSignConversion;
   private boolean m_doEndianConversion;

   protected TAudioOutputStream(AudioFormat var1, long var2, TDataOutputStream var4, boolean var5) {
      this.m_audioFormat = var1;
      this.m_lLength = var2;
      this.m_lCalculatedLength = 0L;
      this.m_dataOutputStream = var4;
      this.m_bDoBackPatching = var5;
      this.m_bHeaderWritten = false;
   }

   protected void requireSign8bit(boolean var1) {
      if (this.m_audioFormat.getSampleSizeInBits() == 8 && AudioUtils.isPCM(this.m_audioFormat)) {
         boolean var2 = this.m_audioFormat.getEncoding().equals(Encoding.PCM_SIGNED);
         this.m_doSignConversion = var1 != var2;
      }
   }

   protected void requireEndianness(boolean var1) {
      int var2 = this.m_audioFormat.getSampleSizeInBits();
      if ((var2 == 16 || var2 == 24 || var2 == 32) && AudioUtils.isPCM(this.m_audioFormat)) {
         this.m_doEndianConversion = var1 != this.m_audioFormat.isBigEndian();
      }
   }

   @Override
   public AudioFormat getFormat() {
      return this.m_audioFormat;
   }

   @Override
   public long getLength() {
      return this.m_lLength;
   }

   public long getCalculatedLength() {
      return this.m_lCalculatedLength;
   }

   protected TDataOutputStream getDataOutputStream() {
      return this.m_dataOutputStream;
   }

   private void handleImplicitConversions(byte[] var1, int var2, int var3) {
      if (this.m_doSignConversion) {
         TConversionTool.convertSign8(var1, var2, var3);
      }

      if (this.m_doEndianConversion) {
         switch (this.m_audioFormat.getSampleSizeInBits()) {
            case 16:
               TConversionTool.swapOrder16(var1, var2, var3 / 2);
               break;
            case 24:
               TConversionTool.swapOrder24(var1, var2, var3 / 3);
               break;
            case 32:
               TConversionTool.swapOrder32(var1, var2, var3 / 4);
         }
      }
   }

   @Override
   public int write(byte[] var1, int var2, int var3) {
      logger.log(Level.TRACE, "TAudioOutputStream.write(): wanted length: " + var3);
      if (!this.m_bHeaderWritten) {
         this.writeHeader();
         this.m_bHeaderWritten = true;
      }

      long var4 = this.getLength();
      if (var4 != -1L && this.m_lCalculatedLength + var3 > var4) {
         logger.log(Level.TRACE, "TAudioOutputStream.write(): requested more bytes to write than possible.");
         var3 = (int)(var4 - this.m_lCalculatedLength);
         if (var3 < 0) {
            var3 = 0;
         }
      }

      if (var3 > 0) {
         this.handleImplicitConversions(var1, var2, var3);
         this.m_dataOutputStream.write(var1, var2, var3);
         this.m_lCalculatedLength += var3;
         this.handleImplicitConversions(var1, var2, var3);
      }

      logger.log(
         Level.TRACE,
         "TAudioOutputStream.write(): calculated (total) length: "
            + this.m_lCalculatedLength
            + " bytes = "
            + this.m_lCalculatedLength / this.getFormat().getFrameSize()
            + " frames"
      );
      return var3;
   }

   protected abstract void writeHeader();

   @Override
   public void close() {
      logger.log(Level.TRACE, "TAudioOutputStream.close(): called");
      if (this.m_bDoBackPatching) {
         logger.log(Level.TRACE, "TAudioOutputStream.close(): patching header");
         this.patchHeader();
      }

      this.m_dataOutputStream.close();
   }

   protected void patchHeader() {
      logger.log(Level.TRACE, "TAudioOutputStream.patchHeader(): called");
   }

   protected void setLengthFromCalculatedLength() {
      this.m_lLength = this.m_lCalculatedLength;
   }
}
