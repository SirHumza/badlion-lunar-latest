package org.tritonus.share.midi;

import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.MidiDevice.Info;
import javax.sound.midi.Sequencer.SyncMode;
import org.tritonus.share.ArraySet;

public abstract class TSequencer extends TMidiDevice implements Sequencer {
   private static final Logger logger = System.getLogger("org.tritonus.TraceSequencer");
   private static final float MPQ_BPM_FACTOR = 6.0E7F;
   private static final SyncMode[] EMPTY_SYNCMODE_ARRAY = new SyncMode[0];
   private boolean m_bRunning = false;
   private Sequence m_sequence = null;
   private final Set<MetaEventListener> m_metaListeners = new ArraySet<>();
   private final Set<ControllerEventListener>[] m_aControllerListeners = new Set[128];
   private float m_fNominalTempoInMPQ;
   private float m_fTempoFactor;
   private Collection<SyncMode> m_masterSyncModes;
   private Collection<SyncMode> m_slaveSyncModes;
   private SyncMode m_masterSyncMode;
   private SyncMode m_slaveSyncMode;
   private BitSet m_muteBitSet;
   private BitSet m_soloBitSet;
   private BitSet m_enabledBitSet;
   private long m_lLoopStartPoint;
   private long m_lLoopEndPoint;
   private int m_nLoopCount;

   protected TSequencer(Info var1, Collection<SyncMode> var2, Collection<SyncMode> var3) {
      super(var1);
      this.setTempoFactor(1.0F);
      this.setTempoInMPQ(500000.0F);
      this.m_masterSyncModes = var2;
      this.m_slaveSyncModes = var3;
      if (this.getMasterSyncModes().length > 0) {
         this.m_masterSyncMode = this.getMasterSyncModes()[0];
      }

      if (this.getSlaveSyncModes().length > 0) {
         this.m_slaveSyncMode = this.getSlaveSyncModes()[0];
      }

      this.m_muteBitSet = new BitSet();
      this.m_soloBitSet = new BitSet();
      this.m_enabledBitSet = new BitSet();
      this.updateEnabled();
      this.setLoopStartPoint(0L);
      this.setLoopEndPoint(-1L);
      this.setLoopCount(0);
   }

   @Override
   public void setSequence(Sequence var1) {
      if (this.getSequence() != var1) {
         this.m_sequence = var1;
         this.setSequenceImpl();
         this.setTempoFactor(1.0F);
      }
   }

   protected void setSequenceImpl() {
   }

   @Override
   public void setSequence(InputStream var1) {
      Sequence var2 = MidiSystem.getSequence(var1);
      this.setSequence(var2);
   }

   @Override
   public Sequence getSequence() {
      return this.m_sequence;
   }

   @Override
   public void setLoopStartPoint(long var1) {
      this.m_lLoopStartPoint = var1;
   }

   @Override
   public long getLoopStartPoint() {
      return this.m_lLoopStartPoint;
   }

   @Override
   public void setLoopEndPoint(long var1) {
      this.m_lLoopEndPoint = var1;
   }

   @Override
   public long getLoopEndPoint() {
      return this.m_lLoopEndPoint;
   }

   @Override
   public void setLoopCount(int var1) {
      this.m_nLoopCount = var1;
   }

   @Override
   public int getLoopCount() {
      return this.m_nLoopCount;
   }

   @Override
   public synchronized void start() {
      this.checkOpen();
      if (!this.isRunning()) {
         this.m_bRunning = true;
         this.startImpl();
      }
   }

   protected void startImpl() {
   }

   @Override
   public synchronized void stop() {
      this.checkOpen();
      if (this.isRunning()) {
         this.stopImpl();
         this.m_bRunning = false;
      }
   }

   protected void stopImpl() {
   }

   @Override
   public synchronized boolean isRunning() {
      return this.m_bRunning;
   }

   protected void checkOpen() {
      if (!this.isOpen()) {
         throw new IllegalStateException("Sequencer is not open");
      }
   }

   protected int getResolution() {
      Sequence var1 = this.getSequence();
      int var2;
      if (var1 != null) {
         var2 = var1.getResolution();
      } else {
         var2 = 1;
      }

      return var2;
   }

   protected void setRealTempo() {
      float var1 = this.getTempoFactor();
      if (var1 == 0.0F) {
         var1 = 0.01F;
      }

      float var2 = this.getTempoInMPQ() / var1;
      logger.log(Level.TRACE, "TSequencer.setRealTempo(): real tempo: " + var2);
      this.setTempoImpl(var2);
   }

   @Override
   public float getTempoInBPM() {
      return 6.0E7F / this.getTempoInMPQ();
   }

   @Override
   public void setTempoInBPM(float var1) {
      float var2 = 6.0E7F / var1;
      this.setTempoInMPQ(var2);
   }

   @Override
   public float getTempoInMPQ() {
      return this.m_fNominalTempoInMPQ;
   }

   @Override
   public void setTempoInMPQ(float var1) {
      this.m_fNominalTempoInMPQ = var1;
      this.setRealTempo();
   }

   @Override
   public void setTempoFactor(float var1) {
      this.m_fTempoFactor = var1;
      this.setRealTempo();
   }

   @Override
   public float getTempoFactor() {
      return this.m_fTempoFactor;
   }

   protected abstract void setTempoImpl(float var1);

   @Override
   public long getTickLength() {
      long var1 = 0L;
      if (this.getSequence() != null) {
         var1 = this.getSequence().getTickLength();
      }

      return var1;
   }

   @Override
   public long getMicrosecondLength() {
      long var1 = 0L;
      if (this.getSequence() != null) {
         var1 = this.getSequence().getMicrosecondLength();
      }

      return var1;
   }

   @Override
   public boolean addMetaEventListener(MetaEventListener var1) {
      synchronized (this.m_metaListeners) {
         return this.m_metaListeners.add(var1);
      }
   }

   @Override
   public void removeMetaEventListener(MetaEventListener var1) {
      synchronized (this.m_metaListeners) {
         this.m_metaListeners.remove(var1);
      }
   }

   protected Iterator<MetaEventListener> getMetaEventListeners() {
      synchronized (this.m_metaListeners) {
         return this.m_metaListeners.iterator();
      }
   }

   protected void sendMetaMessage(MetaMessage var1) {
      Iterator var2 = this.getMetaEventListeners();

      while (var2.hasNext()) {
         MetaEventListener var3 = (MetaEventListener)var2.next();
         MetaMessage var4 = (MetaMessage)var1.clone();
         var3.meta(var4);
      }
   }

   @Override
   public int[] addControllerEventListener(ControllerEventListener var1, int[] var2) {
      synchronized (this.m_aControllerListeners) {
         if (var2 == null) {
            for (int var10 = 0; var10 < 128; var10++) {
               this.addControllerListener(var10, var1);
            }
         } else {
            for (int var7 : var2) {
               this.addControllerListener(var7, var1);
            }
         }
      }

      return this.getListenedControllers(var1);
   }

   private void addControllerListener(int var1, ControllerEventListener var2) {
      if (this.m_aControllerListeners[var1] == null) {
         this.m_aControllerListeners[var1] = new ArraySet<>();
      }

      this.m_aControllerListeners[var1].add(var2);
   }

   @Override
   public int[] removeControllerEventListener(ControllerEventListener var1, int[] var2) {
      synchronized (this.m_aControllerListeners) {
         if (var2 == null) {
            for (int var10 = 0; var10 < 128; var10++) {
               this.removeControllerListener(var10, var1);
            }
         } else {
            for (int var7 : var2) {
               this.removeControllerListener(var7, var1);
            }
         }
      }

      return this.getListenedControllers(var1);
   }

   private void removeControllerListener(int var1, ControllerEventListener var2) {
      if (this.m_aControllerListeners[var1] != null) {
         this.m_aControllerListeners[var1].add(var2);
      }
   }

   private int[] getListenedControllers(ControllerEventListener var1) {
      int[] var2 = new int[128];
      int var3 = 0;

      for (int var4 = 0; var4 < 128; var4++) {
         if (this.m_aControllerListeners[var4] != null && this.m_aControllerListeners[var4].contains(var1)) {
            var2[var3] = var4;
            var3++;
         }
      }

      int[] var5 = new int[var3];
      System.arraycopy(var2, 0, var5, 0, var3);
      return var5;
   }

   protected void sendControllerEvent(ShortMessage var1) {
      int var2 = var1.getData1();
      if (this.m_aControllerListeners[var2] != null) {
         for (ControllerEventListener var4 : this.m_aControllerListeners[var2]) {
            ShortMessage var5 = (ShortMessage)var1.clone();
            var4.controlChange(var5);
         }
      }
   }

   protected void notifyListeners(MidiMessage var1) {
      if (var1 instanceof MetaMessage) {
         this.sendMetaMessage((MetaMessage)var1);
      } else if (var1 instanceof ShortMessage && ((ShortMessage)var1).getCommand() == 176) {
         this.sendControllerEvent((ShortMessage)var1);
      }
   }

   @Override
   public SyncMode getMasterSyncMode() {
      return this.m_masterSyncMode;
   }

   @Override
   public void setMasterSyncMode(SyncMode var1) {
      if (this.m_masterSyncModes.contains(var1)) {
         if (!this.getMasterSyncMode().equals(var1)) {
            this.m_masterSyncMode = var1;
            this.setMasterSyncModeImpl(var1);
         }
      } else {
         throw new IllegalArgumentException("sync mode not allowed: " + var1);
      }
   }

   protected void setMasterSyncModeImpl(SyncMode var1) {
   }

   @Override
   public SyncMode[] getMasterSyncModes() {
      return this.m_masterSyncModes.toArray(EMPTY_SYNCMODE_ARRAY);
   }

   @Override
   public SyncMode getSlaveSyncMode() {
      return this.m_slaveSyncMode;
   }

   @Override
   public void setSlaveSyncMode(SyncMode var1) {
      if (this.m_slaveSyncModes.contains(var1)) {
         if (!this.getSlaveSyncMode().equals(var1)) {
            this.m_slaveSyncMode = var1;
            this.setSlaveSyncModeImpl(var1);
         }
      } else {
         throw new IllegalArgumentException("sync mode not allowed: " + var1);
      }
   }

   protected void setSlaveSyncModeImpl(SyncMode var1) {
   }

   @Override
   public SyncMode[] getSlaveSyncModes() {
      return this.m_slaveSyncModes.toArray(EMPTY_SYNCMODE_ARRAY);
   }

   @Override
   public boolean getTrackSolo(int var1) {
      boolean var2 = false;
      if (this.getSequence() != null && var1 < this.getSequence().getTracks().length) {
         var2 = this.m_soloBitSet.get(var1);
      }

      return var2;
   }

   @Override
   public void setTrackSolo(int var1, boolean var2) {
      if (this.getSequence() != null && var1 < this.getSequence().getTracks().length) {
         boolean var3 = this.m_soloBitSet.get(var1);
         if (var2 != var3) {
            if (var2) {
               this.m_soloBitSet.set(var1);
            } else {
               this.m_soloBitSet.clear(var1);
            }

            this.updateEnabled();
            this.setTrackSoloImpl(var1, var2);
         }
      }
   }

   protected void setTrackSoloImpl(int var1, boolean var2) {
   }

   @Override
   public boolean getTrackMute(int var1) {
      boolean var2 = false;
      if (this.getSequence() != null && var1 < this.getSequence().getTracks().length) {
         var2 = this.m_muteBitSet.get(var1);
      }

      return var2;
   }

   @Override
   public void setTrackMute(int var1, boolean var2) {
      if (this.getSequence() != null && var1 < this.getSequence().getTracks().length) {
         boolean var3 = this.m_muteBitSet.get(var1);
         if (var2 != var3) {
            if (var2) {
               this.m_muteBitSet.set(var1);
            } else {
               this.m_muteBitSet.clear(var1);
            }

            this.updateEnabled();
            this.setTrackMuteImpl(var1, var2);
         }
      }
   }

   protected void setTrackMuteImpl(int var1, boolean var2) {
   }

   private void updateEnabled() {
      BitSet var1 = (BitSet)this.m_enabledBitSet.clone();
      boolean var2 = !this.m_soloBitSet.isEmpty();
      if (var2) {
         this.m_enabledBitSet = (BitSet)this.m_soloBitSet.clone();
      } else {
         for (int var3 = 0; var3 < this.m_muteBitSet.size(); var3++) {
            if (this.m_muteBitSet.get(var3)) {
               this.m_enabledBitSet.clear(var3);
            } else {
               this.m_enabledBitSet.set(var3);
            }
         }
      }

      var1.xor(this.m_enabledBitSet);

      for (int var4 = 0; var4 < var1.size(); var4++) {
         if (var1.get(var4)) {
            this.setTrackEnabledImpl(var4, this.m_enabledBitSet.get(var4));
         }
      }
   }

   protected void setTrackEnabledImpl(int var1, boolean var2) {
   }

   protected boolean isTrackEnabled(int var1) {
      return this.m_enabledBitSet.get(var1);
   }

   public void setLatency(int var1) {
   }

   public int getLatency() {
      return -1;
   }
}
