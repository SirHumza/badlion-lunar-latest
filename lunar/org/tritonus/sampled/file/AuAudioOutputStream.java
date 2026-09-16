package org.tritonus.sampled.file;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.AudioFormat;
import org.tritonus.share.sampled.file.TAudioOutputStream;
import org.tritonus.share.sampled.file.TDataOutputStream;

public class AuAudioOutputStream extends TAudioOutputStream {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioOutputStream");
   private static final String description = "Created by Tritonus";

   protected static void writeText(TDataOutputStream var0, String var1) {
      if (!var1.isEmpty()) {
         var0.writeBytes(var1);
         var0.writeByte(0);
         if (var1.length() % 2 == 0) {
            var0.writeByte(0);
         }
      }
   }

   protected static int getTextLength(String var0) {
      return var0.isEmpty() ? 0 : var0.length() + 2 & -2;
   }

   public AuAudioOutputStream(AudioFormat var1, long var2, TDataOutputStream var4) {
      super(var1, var2 > 2147483647L ? -1L : var2, var4, var4.supportsSeek());
      if (AuTool.getFormatCode(var1) == 0) {
         throw new IllegalArgumentException("Unknown encoding/format for AU file: " + var1);
      }

      this.requireSign8bit(true);
      this.requireEndianness(true);
      logger.log(Level.TRACE, "Writing AU: " + var1.getSampleSizeInBits() + " bits, " + var1.getEncoding());
   }

   @Override
   protected void writeHeader() {
      logger.log(Level.TRACE, "AuAudioOutputStream.writeHeader(): called.");
      AudioFormat var1 = this.getFormat();
      long var2 = this.getLength();
      TDataOutputStream var4 = this.getDataOutputStream();
      logger.log(Level.TRACE, "AuAudioOutputStream.writeHeader(): AudioFormat: " + var1);
      logger.log(Level.TRACE, "AuAudioOutputStream.writeHeader(): length: " + var2);
      var4.writeInt(779316836);
      var4.writeInt(24 + getTextLength("Created by Tritonus"));
      var4.writeInt(var2 != -1L ? (int)var2 : -1);
      var4.writeInt(AuTool.getFormatCode(var1));
      var4.writeInt((int)var1.getSampleRate());
      var4.writeInt(var1.getChannels());
      writeText(var4, "Created by Tritonus");
   }

   @Override
   protected void patchHeader() {
      TDataOutputStream var1 = this.getDataOutputStream();
      var1.seek(0L);
      this.setLengthFromCalculatedLength();
      this.writeHeader();
   }
}
