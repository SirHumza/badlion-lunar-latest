package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collection;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.Control;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineEvent.Type;

public abstract class TDataLine extends TLine implements DataLine {
   private static final Logger logger = System.getLogger("org.tritonus.TraceSourceDataLine");
   private static final int DEFAULT_BUFFER_SIZE = 128000;
   private AudioFormat m_format;
   private int m_nBufferSize;
   private boolean m_bRunning;

   public TDataLine(TMixer var1, DataLine.Info var2) {
      super(var1, var2);
      this.init(var2);
   }

   public TDataLine(TMixer var1, DataLine.Info var2, Collection<Control> var3) {
      super(var1, var2, var3);
      this.init(var2);
   }

   private void init(DataLine.Info var1) {
      this.m_format = null;
      this.m_nBufferSize = -1;
      this.setRunning(false);
   }

   @Override
   public void start() {
      logger.log(Level.TRACE, "TDataLine.start(): called");
      this.setRunning(true);
   }

   @Override
   public void stop() {
      logger.log(Level.TRACE, "TDataLine.stop(): called");
      this.setRunning(false);
   }

   @Override
   public boolean isRunning() {
      return this.m_bRunning;
   }

   protected void setRunning(boolean var1) {
      boolean var2 = this.isRunning();
      this.m_bRunning = var1;
      if (var2 != this.isRunning()) {
         if (this.isRunning()) {
            this.startImpl();
            this.notifyLineEvent(Type.START);
         } else {
            this.stopImpl();
            this.notifyLineEvent(Type.STOP);
         }
      }
   }

   protected void startImpl() {
   }

   protected void stopImpl() {
   }

   @Override
   public boolean isActive() {
      return this.isRunning();
   }

   @Override
   public AudioFormat getFormat() {
      return this.m_format;
   }

   protected void setFormat(AudioFormat var1) {
      logger.log(Level.TRACE, "TDataLine.setFormat(): setting: " + var1);
      this.m_format = var1;
   }

   @Override
   public int getBufferSize() {
      return this.m_nBufferSize;
   }

   protected void setBufferSize(int var1) {
      logger.log(Level.TRACE, "TDataLine.setBufferSize(): setting: " + var1);
      this.m_nBufferSize = var1;
   }

   @Override
   public int getFramePosition() {
      return -1;
   }

   @Override
   public long getLongFramePosition() {
      return -1L;
   }

   @Override
   public long getMicrosecondPosition() {
      return (long)(this.getFramePosition() * this.getFormat().getFrameRate() * 1000000.0F);
   }

   @Override
   public float getLevel() {
      return -1.0F;
   }

   protected void checkOpen() {
      if (this.getFormat() == null) {
         throw new IllegalStateException("format must be specified");
      }

      if (this.getBufferSize() == -1) {
         this.setBufferSize(this.getDefaultBufferSize());
      }
   }

   protected int getDefaultBufferSize() {
      return 128000;
   }

   @Override
   protected void notifyLineEvent(Type var1) {
      this.notifyLineEvent(new LineEvent(this, var1, this.getFramePosition()));
   }
}
