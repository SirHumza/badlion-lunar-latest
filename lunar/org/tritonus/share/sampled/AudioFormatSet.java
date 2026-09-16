package org.tritonus.share.sampled;

import java.util.Collection;
import javax.sound.sampled.AudioFormat;
import org.tritonus.share.ArraySet;

public class AudioFormatSet extends ArraySet<AudioFormat> {
   private static final long serialVersionUID = 1L;
   protected static final AudioFormat[] EMPTY_FORMAT_ARRAY = new AudioFormat[0];

   public AudioFormatSet() {
   }

   public AudioFormatSet(Collection<AudioFormat> var1) {
      super(var1);
   }

   public boolean add(AudioFormat var1) {
      return var1 == null ? false : super.add(var1);
   }

   public boolean contains(AudioFormat var1) {
      if (var1 == null) {
         return false;
      }

      AudioFormat var2 = var1;

      for (AudioFormat var4 : this) {
         if (AudioFormats.equals(var2, var4)) {
            return true;
         }
      }

      return false;
   }

   public AudioFormat get(AudioFormat var1) {
      if (var1 == null) {
         return null;
      }

      AudioFormat var2 = var1;

      for (AudioFormat var4 : this) {
         if (AudioFormats.equals(var2, var4)) {
            return var4;
         }
      }

      return null;
   }

   public AudioFormat getAudioFormat(AudioFormat var1) {
      return this.get(var1);
   }

   public AudioFormat matches(AudioFormat var1) {
      if (var1 == null) {
         return null;
      }

      for (AudioFormat var3 : this) {
         if (AudioFormats.matches(var1, var3)) {
            return var3;
         }
      }

      return null;
   }

   public AudioFormat[] toAudioFormatArray() {
      return this.toArray(EMPTY_FORMAT_ARRAY);
   }

   public void add(int var1, AudioFormat var2) {
      throw new UnsupportedOperationException("unsupported");
   }

   public AudioFormat set(int var1, AudioFormat var2) {
      throw new UnsupportedOperationException("unsupported");
   }
}
