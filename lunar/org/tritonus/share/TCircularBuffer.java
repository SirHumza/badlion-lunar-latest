package org.tritonus.share;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class TCircularBuffer {
   private static final Logger logger = System.getLogger("org.tritonus.TraceCircularBuffer");
   private boolean m_bBlockingRead;
   private boolean m_bBlockingWrite;
   private byte[] m_abData;
   private int m_nSize;
   private long m_lReadPos;
   private long m_lWritePos;
   private TCircularBuffer.Trigger m_trigger;
   private boolean m_bOpen;

   public TCircularBuffer(int var1, boolean var2, boolean var3, TCircularBuffer.Trigger var4) {
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

   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public int read(byte[] var1, int var2, int var3) {
      if (logger.isLoggable(Level.TRACE)) {
         logger.log(Level.TRACE, ">TCircularBuffer.read(): called.");
         this.dumpInternalState();
      }

      if (!this.isOpen()) {
         if (this.availableRead() <= 0) {
            logger.log(Level.TRACE, "< not open. returning -1.");
            return -1;
         }

         var3 = Math.min(var3, this.availableRead());
         logger.log(Level.TRACE, "reading rest in closed buffer, length: " + var3);
      }

      synchronized (this) {
         if (this.m_trigger != null && this.availableRead() < var3) {
            logger.log(Level.TRACE, "executing trigger.");
            this.m_trigger.execute();
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
                  logger.log(Level.ERROR, var9.getMessage(), var9);
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

         if (logger.isLoggable(Level.TRACE)) {
            logger.log(Level.TRACE, "After read:");
            this.dumpInternalState();
            logger.log(Level.TRACE, "< completed. Read " + var3 + " bytes");
         }

         return var3;
      }
   }

   public int write(byte[] var1) {
      return this.write(var1, 0, var1.length);
   }

   public int write(byte[] var1, int var2, int var3) {
      if (logger.isLoggable(Level.TRACE)) {
         logger.log(Level.TRACE, ">TCircularBuffer.write(): called; nLength: " + var3);
         this.dumpInternalState();
      }

      synchronized (this) {
         logger.log(Level.TRACE, "entered synchronized block.");
         if (!this.m_bBlockingWrite) {
            var3 = Math.min(this.availableWrite(), var3);
         }

         int var5 = var3;

         while (var5 > 0) {
            while (this.availableWrite() == 0) {
               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  logger.log(Level.ERROR, var9.getMessage(), var9);
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

         if (logger.isLoggable(Level.TRACE)) {
            logger.log(Level.TRACE, "After write:");
            this.dumpInternalState();
            logger.log(Level.TRACE, "< completed. Wrote " + var3 + " bytes");
         }

         return var3;
      }
   }

   private void dumpInternalState() {
      logger.log(Level.TRACE, "m_lReadPos  = " + this.m_lReadPos + " ^= " + this.getReadPos());
      logger.log(Level.TRACE, "m_lWritePos = " + this.m_lWritePos + " ^= " + this.getWritePos());
      logger.log(Level.TRACE, "availableRead()  = " + this.availableRead());
      logger.log(Level.TRACE, "availableWrite() = " + this.availableWrite());
   }

   public interface Trigger {
      void execute();
   }
}
