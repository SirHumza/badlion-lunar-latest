package org.tritonus.share.midi;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collection;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiDevice.Info;
import javax.sound.midi.Sequencer.SyncMode;

public abstract class TPreloadingSequencer extends TSequencer {
   private static final Logger logger = System.getLogger("org.tritonus.TraceSequencer");
   private static final int DEFAULT_LATENCY = 100;
   private int m_nLatency;
   private Thread m_loaderThread;

   protected TPreloadingSequencer(Info var1, Collection<SyncMode> var2, Collection<SyncMode> var3) {
      super(var1, var2, var3);
      logger.log(Level.TRACE, "TPreloadingSequencer.<init>(): begin");
      this.m_nLatency = 100;
      logger.log(Level.TRACE, "TPreloadingSequencer.<init>(): end");
   }

   @Override
   public void setLatency(int var1) {
      this.m_nLatency = var1;
   }

   @Override
   public int getLatency() {
      return this.m_nLatency;
   }

   @Override
   protected void openImpl() {
      logger.log(Level.TRACE, "AlsaSequencer.openImpl(): begin");
   }

   public abstract void sendMessageTick(MidiMessage var1, long var2);
}
