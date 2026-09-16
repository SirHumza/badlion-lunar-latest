package org.tritonus.sampled.file;

import java.util.Arrays;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.file.AudioOutputStream;
import org.tritonus.share.sampled.file.TAudioFileWriter;
import org.tritonus.share.sampled.file.TDataOutputStream;

public class WaveAudioFileWriter extends TAudioFileWriter {
   private static final Type[] FILE_TYPES = new Type[]{Type.WAVE};
   private static final AudioFormat[] AUDIO_FORMATS = new AudioFormat[]{
      new AudioFormat(Encoding.PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.ULAW, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.ULAW, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.ALAW, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.ALAW, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 24, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 32, -1, -1, -1.0F, false),
      new AudioFormat(WaveTool.GSM0610, -1.0F, -1, -1, -1, -1.0F, false),
      new AudioFormat(WaveTool.GSM0610, -1.0F, -1, -1, -1, -1.0F, true)
   };

   public WaveAudioFileWriter() {
      super(Arrays.asList(FILE_TYPES), Arrays.asList(AUDIO_FORMATS));
   }

   @Override
   protected boolean isAudioFormatSupportedImpl(AudioFormat var1, Type var2) {
      return WaveTool.getFormatCode(var1) != 0;
   }

   @Override
   protected AudioOutputStream getAudioOutputStream(AudioFormat var1, long var2, Type var4, TDataOutputStream var5) {
      return new WaveAudioOutputStream(var1, var2, var5);
   }
}
