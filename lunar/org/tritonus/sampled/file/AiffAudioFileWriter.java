package org.tritonus.sampled.file;

import java.util.Arrays;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.file.AudioOutputStream;
import org.tritonus.share.sampled.file.TAudioFileWriter;
import org.tritonus.share.sampled.file.TDataOutputStream;

public class AiffAudioFileWriter extends TAudioFileWriter {
   private static final Type[] FILE_TYPES = new Type[]{Type.AIFF, Type.AIFC};
   private static final Encoding ULAW = Encoding.ULAW;
   private static final Encoding IMA_ADPCM = new Encoding("IMA_ADPCM");
   private static final AudioFormat[] AUDIO_FORMATS = new AudioFormat[]{
      new AudioFormat(PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(ULAW, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(ULAW, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 24, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 32, -1, -1, -1.0F, true),
      new AudioFormat(IMA_ADPCM, -1.0F, 4, -1, -1, -1.0F, true),
      new AudioFormat(IMA_ADPCM, -1.0F, 4, -1, -1, -1.0F, false)
   };

   public AiffAudioFileWriter() {
      super(Arrays.asList(FILE_TYPES), Arrays.asList(AUDIO_FORMATS));
   }

   @Override
   protected boolean isAudioFormatSupportedImpl(AudioFormat var1, Type var2) {
      return AiffTool.getFormatCode(var1) != 0;
   }

   @Override
   protected AudioOutputStream getAudioOutputStream(AudioFormat var1, long var2, Type var4, TDataOutputStream var5) {
      return new AiffAudioOutputStream(var1, var4, var2, var5);
   }
}
