package com.github.trilarion.sound.sampled;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CircularBuffer {
   private static final Logger LOG = Logger.getLogger(CircularBuffer.class.getName());
   private final boolean m_bBlockingRead;
   private final boolean m_bBlockingWrite;
   private final byte[] m_abData;
   private final int m_nSize;
   private long m_lReadPos;
   private long m_lWritePos;
   private final CircularBuffer.BufferListener m_trigger;
   private boolean m_bOpen;

   public CircularBuffer(int var1, boolean var2, boolean var3, CircularBuffer.BufferListener var4) {
      this.m_bBlockingRead = var2;
      this.m_bBlockingWrite = var3;
      this.m_nSize = var1;
      this.m_abData = new byte[this.m_nSize];
      this.m_lReadPos = 0L;
      this.m_lWritePos = 0L;
      this.m_trigger = var4;
      this.m_bOpen = true;
   }

   public void close() {
      this.m_bOpen = false;
   }

   private boolean isOpen() {
      return this.m_bOpen;
   }

   public int availableRead() {
      return (int)(this.m_lWritePos - this.m_lReadPos);
   }

   public int availableWrite() {
      return this.m_nSize - this.availableRead();
   }

   private int getReadPos() {
      return (int)(this.m_lReadPos % this.m_nSize);
   }

   private int getWritePos() {
      return (int)(this.m_lWritePos % this.m_nSize);
   }

   public int read(byte[] var1, int var2, int var3) {
      LOG.log(Level.FINE, ">TCircularBuffer.read(): called.");
      this.dumpInternalState();
      if (!this.isOpen()) {
         if (this.availableRead() <= 0) {
            LOG.log(Level.FINE, "< not open. returning -1.");
            return -1;
         }

         var3 = Math.min(var3, this.availableRead());
         LOG.log(Level.FINE, "reading rest in closed buffer, length: {0}", var3);
      }

      synchronized (this) {
         if (this.m_trigger != null && this.availableRead() < var3) {
            LOG.log(Level.FINE, "executing trigger.");
            this.m_trigger.dataReady();
         }

         if (!this.m_bBlockingRead) {
            var3 = Math.min(this.availableRead(), var3);
         }

         int var5 = var3;

         while (var5 > 0) {
            while (this.availableRead() == 0) {
               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  LOG.log(Level.FINE, var9.getMessage());
               }
            }

            int var6 = Math.min(this.availableRead(), var5);

            while (var6 > 0) {
               int var7 = Math.min(var6, this.m_nSize - this.getReadPos());
               System.arraycopy(this.m_abData, this.getReadPos(), var1, var2, var7);
               this.m_lReadPos += var7;
               var2 += var7;
               var6 -= var7;
               var5 -= var7;
            }

            this.notifyAll();
         }

         LOG.log(Level.FINE, "After read:");
         LOG.log(Level.FINE, "< completed. Read {0} bytes", var3);
         return var3;
      }
   }

   public int write(byte[] var1, int var2, int var3) {
      LOG.log(Level.FINE, ">TCircularBuffer.write(): called; nLength: {0}", var3);
      this.dumpInternalState();
      synchronized (this) {
         LOG.log(Level.FINE, "entered synchronized block.");
         if (!this.m_bBlockingWrite) {
            var3 = Math.min(this.availableWrite(), var3);
         }

         int var5 = var3;

         while (var5 > 0) {
            while (this.availableWrite() == 0) {
               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  LOG.log(Level.FINE, var9.getMessage());
               }
            }

            int var6 = Math.min(this.availableWrite(), var5);

            while (var6 > 0) {
               int var7 = Math.min(var6, this.m_nSize - this.getWritePos());
               System.arraycopy(var1, var2, this.m_abData, this.getWritePos(), var7);
               this.m_lWritePos += var7;
               var2 += var7;
               var6 -= var7;
               var5 -= var7;
            }

            this.notifyAll();
         }

         LOG.log(Level.FINE, "After write:");
         this.dumpInternalState();
         LOG.log(Level.FINE, "< completed. Wrote {0} bytes", var3);
         return var3;
      }
   }

   private void dumpInternalState() {
      LOG.log(Level.FINE, "m_lReadPos  = {0} ^= {1}", new Object[]{this.m_lReadPos, this.getReadPos()});
      LOG.log(Level.FINE, "m_lWritePos = {0} ^= {1}", new Object[]{this.m_lWritePos, this.getWritePos()});
      LOG.log(Level.FINE, "availableRead()  = {0}", this.availableRead());
      LOG.log(Level.FINE, "availableWrite() = {0}", this.availableWrite());
   }

   public interface BufferListener {
      void dataReady();
   }
}
