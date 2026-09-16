package org.tritonus.share.sampled;

import java.io.File;
import java.io.OutputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFileFormat.Type;
import org.tritonus.sampled.file.AiffAudioOutputStream;
import org.tritonus.sampled.file.AuAudioOutputStream;
import org.tritonus.sampled.file.WaveAudioOutputStream;
import org.tritonus.share.sampled.file.AudioOutputStream;
import org.tritonus.share.sampled.file.TAudioOutputStream;
import org.tritonus.share.sampled.file.TDataOutputStream;
import org.tritonus.share.sampled.file.TNonSeekableDataOutputStream;
import org.tritonus.share.sampled.file.TSeekableDataOutputStream;

public class AudioSystemShadow {
   public static TDataOutputStream getDataOutputStream(File var0) {
      return new TSeekableDataOutputStream(var0);
   }

   public static TDataOutputStream getDataOutputStream(OutputStream var0) {
      return new TNonSeekableDataOutputStream(var0);
   }

   public static AudioOutputStream getAudioOutputStream(Type var0, AudioFormat var1, long var2, TDataOutputStream var4) {
      TAudioOutputStream var5 = null;
      if (var0.equals(Type.AIFF) || var0.equals(Type.AIFF)) {
         var5 = new AiffAudioOutputStream(var1, var0, var2, var4);
      } else if (var0.equals(Type.AU)) {
         var5 = new AuAudioOutputStream(var1, var2, var4);
      } else if (var0.equals(Type.WAVE)) {
         var5 = new WaveAudioOutputStream(var1, var2, var4);
      }

      return var5;
   }

   public static AudioOutputStream getAudioOutputStream(Type var0, AudioFormat var1, long var2, File var4) {
      TDataOutputStream var5 = getDataOutputStream(var4);
      return getAudioOutputStream(var0, var1, var2, var5);
   }

   public static AudioOutputStream getAudioOutputStream(Type var0, AudioFormat var1, long var2, OutputStream var4) {
      TDataOutputStream var5 = getDataOutputStream(var4);
      return getAudioOutputStream(var0, var1, var2, var5);
   }
}
