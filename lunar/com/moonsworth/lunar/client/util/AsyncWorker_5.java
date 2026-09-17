package com.moonsworth.lunar.client.util;

import java.io.IOException;
import java.io.InputStream;

public class OIOORROOHCRRCOCOHICICRCIOCIIOH extends InputStream {
   private final byte[] HIHORRRIICORROCRORHCORCOHRRIRI;
   private final int HCOOICHICHOCCHRHIOCORHRHCORCCR;
   private final int OHCIROCRCCOCRHIHHCROHROIOHCIHR;
   private boolean COCHRRORCCCCIRHRHCCHROCIOORRRR = false;
   private int OOHCHHIHHCROIHOHCCRORROCHRIIOR = 0;
   private int IOOHRORRCROHHROROHRCROCCOCOHCC = 0;
   private int count = 0;
   private boolean writerClosed = false;
   private boolean HIIOCCRRCIHIIHIROHIIRRCRHCIHCO = false;

   public OIOORROOHCRRCOCOHICICRCIOCIIOH(int var1) {
      this(var1, 0);
   }

   public OIOORROOHCRRCOCOHICICRCIOCIIOH(int var1, int var2) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("RingBufferStream capacity must be positive.");
      }

      if (var2 >= 0 && var2 <= var1) {
         this.HIHORRRIICORROCRORHCORCOHRRIRI = new byte[var1];
         this.HCOOICHICHOCCHRHIOCORHRHCORCCR = var1;
         this.OHCIROCRCCOCRHIHHCROHROIOHCIHR = var2;
         if (this.OHCIROCRCCOCRHIHHCROHROIOHCIHR == 0) {
            this.COCHRRORCCCCIRHRHCCHROCIOORRRR = true;
         }
      } else {
         throw new IllegalArgumentException("Low watermark must be between 0 and capacity.");
      }
   }

   public synchronized void write(byte var1) {
      this.write(new byte[]{var1}, 0, 1);
   }

   public synchronized void write(byte[] var1, int var2, int var3) {
      if (this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO) {
         throw new IOException("Stream closed by reader; cannot write.");
      }

      if (this.writerClosed) {
         throw new IOException("Writer closed; cannot write.");
      }

      if (var1 == null) {
         throw new NullPointerException("Data buffer cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0 && var2 + var3 <= var1.length) {
         if (var3 != 0) {
            int var4 = 0;

            while (var4 < var3) {
               while (this.count == this.HCOOICHICHOCCHRHIOCORHRHCORCCR && !this.writerClosed && !this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO) {
                  try {
                     this.wait();
                  } catch (InterruptedException var10) {
                     Thread.currentThread().interrupt();
                     throw new IOException("Write interrupted", var10);
                  }
               }

               if (this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO) {
                  throw new IOException("Stream closed by reader; write aborted.");
               }

               if (this.writerClosed) {
                  throw new IOException("Writer closed; write aborted.");
               }

               int var5 = var3 - var4;
               int var6 = this.HCOOICHICHOCCHRHIOCORHRHCORCCR - this.count;
               int var7 = Math.min(var5, var6);
               if (var7 == 0) {
                  if (this.writerClosed || this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO) {
                     throw new IOException("Stream closed and buffer full, cannot complete write.");
                  }
               } else {
                  int var8 = Math.min(var7, this.HCOOICHICHOCCHRHIOCORHRHCORCCR - this.IOOHRORRCROHHROROHRCROCCOCOHCC);
                  System.arraycopy(var1, var2 + var4, this.HIHORRRIICORROCRORHCORCOHRRIRI, this.IOOHRORRCROHHROROHRCROCCOCOHCC, var8);
                  this.IOOHRORRCROHHROROHRCROCCOCOHCC = (this.IOOHRORRCROHHROROHRCROCCOCOHCC + var8) % this.HCOOICHICHOCCHRHIOCORHRHCORCCR;
                  this.count += var8;
                  var4 += var8;
                  if (var4 < var3 && var7 > var8) {
                     int var9 = var7 - var8;
                     System.arraycopy(var1, var2 + var4, this.HIHORRRIICORROCRORHCORCOHRRIRI, this.IOOHRORRCROHHROROHRCROCCOCOHCC, var9);
                     this.IOOHRORRCROHHROROHRCROCCOCOHCC = (this.IOOHRORRCROHHROROHRCROCCOCOHCC + var9) % this.HCOOICHICHOCCHRHIOCORHRHCORCCR;
                     this.count += var9;
                     var4 += var9;
                  }

                  if (!this.COCHRRORCCCCIRHRHCCHROCIOORRRR && this.count >= this.OHCIROCRCCOCRHIHHCROHROIOHCIHR) {
                     this.COCHRRORCCCCIRHRHCCHROCIOORRRR = true;
                  }

                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IndexOutOfBoundsException("Invalid offset/length for data buffer.");
      }
   }

   public synchronized void HORCRRCIRROCHCOHIOCCHRICRIOIRO() {
      if (!this.writerClosed) {
         this.writerClosed = true;
         if (!this.COCHRRORCCCCIRHRHCCHROCIOORRRR) {
            this.COCHRRORCCCCIRHRHCCHROCIOORRRR = true;
         }

         this.notifyAll();
      }
   }

   @Override
   public synchronized int read() {
      while (
         (this.count == 0 || !this.COCHRRORCCCCIRHRHCCHROCIOORRRR)
            && !this.writerClosed
            && !this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO
            && (!this.COCHRRORCCCCIRHRHCCHROCIOORRRR || this.count <= 0)
      ) {
         if (!this.COCHRRORCCCCIRHRHCCHROCIOORRRR && this.count > 0 && (this.writerClosed || this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO)) {
            this.COCHRRORCCCCIRHRHCCHROCIOORRRR = true;
            break;
         }

         try {
            this.wait();
         } catch (InterruptedException var2) {
            Thread.currentThread().interrupt();
            throw new IOException("Read interrupted", var2);
         }
      }

      if (!this.COCHRRORCCCCIRHRHCCHROCIOORRRR && (this.writerClosed || this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO)) {
         this.COCHRRORCCCCIRHRHCCHROCIOORRRR = true;
      }

      if (this.count == 0 && (this.writerClosed || this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO)) {
         return -1;
      }

      if (this.count == 0 && !this.COCHRRORCCCCIRHRHCCHROCIOORRRR) {
         return -1;
      }

      int var1 = this.HIHORRRIICORROCRORHCORCOHRRIRI[this.OOHCHHIHHCROIHOHCCRORROCHRIIOR] & 255;
      this.OOHCHHIHHCROIHOHCCRORROCHRIIOR = (this.OOHCHHIHHCROIHOHCCRORROCHRIIOR + 1) % this.HCOOICHICHOCCHRHIOCORHRHCORCCR;
      this.count--;
      this.notifyAll();
      return var1;
   }

   @Override
   public synchronized int read(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new NullPointerException();
      }

      if (var2 < 0 || var3 < 0 || var3 > var1.length - var2) {
         throw new IndexOutOfBoundsException();
      }

      if (var3 == 0) {
         return 0;
      }

      while (
         (this.count == 0 || !this.COCHRRORCCCCIRHRHCCHROCIOORRRR)
            && !this.writerClosed
            && !this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO
            && (!this.COCHRRORCCCCIRHRHCCHROCIOORRRR || this.count <= 0)
      ) {
         if (!this.COCHRRORCCCCIRHRHCCHROCIOORRRR && this.count > 0 && (this.writerClosed || this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO)) {
            this.COCHRRORCCCCIRHRHCCHROCIOORRRR = true;
            break;
         }

         try {
            this.wait();
         } catch (InterruptedException var8) {
            Thread.currentThread().interrupt();
            throw new IOException("Read interrupted", var8);
         }
      }

      if (!this.COCHRRORCCCCIRHRHCCHROCIOORRRR && (this.writerClosed || this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO)) {
         this.COCHRRORCCCCIRHRHCCHROCIOORRRR = true;
      }

      if (this.count != 0 || !this.writerClosed && !this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO) {
         if (this.count == 0 && !this.COCHRRORCCCCIRHRHCCHROCIOORRRR) {
            return -1;
         }

         int var4 = Math.min(var3, this.count);
         int var5 = 0;
         int var6 = Math.min(var4, this.HCOOICHICHOCCHRHIOCORHRHCORCCR - this.OOHCHHIHHCROIHOHCCRORROCHRIIOR);
         System.arraycopy(this.HIHORRRIICORROCRORHCORCOHRRIRI, this.OOHCHHIHHCROIHOHCCRORROCHRIIOR, var1, var2 + var5, var6);
         this.OOHCHHIHHCROIHOHCCRORROCHRIIOR = (this.OOHCHHIHHCROIHOHCCRORROCHRIIOR + var6) % this.HCOOICHICHOCCHRHIOCORHRHCORCCR;
         this.count -= var6;
         var5 += var6;
         if (var5 < var4) {
            int var7 = var4 - var5;
            System.arraycopy(this.HIHORRRIICORROCRORHCORCOHRRIRI, this.OOHCHHIHHCROIHOHCCRORROCHRIIOR, var1, var2 + var5, var7);
            this.OOHCHHIHHCROIHOHCCRORROCHRIIOR = (this.OOHCHHIHHCROIHOHCCRORROCHRIIOR + var7) % this.HCOOICHICHOCCHRHIOCORHRHCORCCR;
            this.count -= var7;
         }

         this.notifyAll();
         return var4;
      } else {
         return -1;
      }
   }

   @Override
   public synchronized int available() {
      return !this.COCHRRORCCCCIRHRHCCHROCIOORRRR && !this.writerClosed && !this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO ? 0 : this.count;
   }

   @Override
   public synchronized void close() {
      if (!this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO) {
         this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO = true;
         if (!this.COCHRRORCCCCIRHRHCCHROCIOORRRR) {
            this.COCHRRORCCCCIRHRHCCHROCIOORRRR = true;
         }

         this.notifyAll();
      }
   }

   public synchronized boolean CRIHRCHCCIHOHRICCRHIHOIRCIOROO() {
      return this.HIIOCCRRCIHIIHIROHIIRRCRHCIHCO;
   }
}
