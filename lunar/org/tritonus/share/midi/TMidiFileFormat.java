package org.tritonus.share.midi;

import javax.sound.midi.MidiFileFormat;

public class TMidiFileFormat extends MidiFileFormat {
   private int m_nTrackCount;

   public TMidiFileFormat(int var1, float var2, int var3, int var4, long var5, int var7) {
      super(var1, var2, var3, var4, var5);
      this.m_nTrackCount = var7;
   }

   public int getTrackCount() {
      return this.m_nTrackCount;
   }
}
