package com.github.trilarion.sound.vorbis.sampled;

import java.util.Map;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFileFormat.Type;

public class VorbisAudioFileFormat extends AudioFileFormat {
   private static final Logger LOG = Logger.getLogger(VorbisAudioFileFormat.class.getName());

   public VorbisAudioFileFormat(Type var1, AudioFormat var2, int var3, int var4, Map<String, Object> var5) {
      super(var1, var4, var2, var3);
   }
}
