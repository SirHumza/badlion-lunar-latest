package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.io.InputStream;

public final class HICHRCOHCCRHOHCICOOCHOIHCCHIRI extends InputStream {
   private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH HIORCIIHRCIICOOIHOCOCORHHHRROH;
   private final InputStream IIHRRORCCRIIRRRRRRCRIRRROCIIHO;
   private byte[] IOOIIIIIORORRCHHCHRCOHCCCORHHR;
   private int OOROCRRIOCOCICHICIHIHHICOHCCHR;
   private final int IOORCIHICORHOHHIRICRCCHOHRCHRC;

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, InputStream var2, byte[] var3, int var4, int var5) {
      this.HIORCIIHRCIICOOIHOCOCORHHHRROH = var1;
      this.IIHRRORCCRIIRRRRRRCRIRRROCIIHO = var2;
      this.IOOIIIIIORORRCHHCHRCOHCCCORHHR = var3;
      this.OOROCRRIOCOCICHICIHIHHICOHCCHR = var4;
      this.IOORCIHICORHOHHIRICRCCHOHRCHRC = var5;
   }

   @Override
   public int available() {
      return this.IOOIIIIIORORRCHHCHRCOHCCCORHHR != null
         ? this.IOORCIHICORHOHHIRICRCCHOHRCHRC - this.OOROCRRIOCOCICHICIHIHHICOHCCHR
         : this.IIHRRORCCRIIRRRRRRCRIRRROCIIHO.available();
   }

   @Override
   public void close() {
      this.IICCCOCIIOROCRIIOICHIROORRCIHR();
      this.IIHRRORCCRIIRRRRRRCRIRRROCIIHO.close();
   }

   @Override
   public synchronized void mark(int var1) {
      if (this.IOOIIIIIORORRCHHCHRCOHCCCORHHR == null) {
         this.IIHRRORCCRIIRRRRRRCRIRRROCIIHO.mark(var1);
      }
   }

   @Override
   public boolean markSupported() {
      return this.IOOIIIIIORORRCHHCHRCOHCCCORHHR == null && this.IIHRRORCCRIIRRRRRRCRIRRROCIIHO.markSupported();
   }

   @Override
   public int read() {
      if (this.IOOIIIIIORORRCHHCHRCOHCCCORHHR != null) {
         int var1 = this.IOOIIIIIORORRCHHCHRCOHCCCORHHR[this.OOROCRRIOCOCICHICIHIHHICOHCCHR++] & 255;
         if (this.OOROCRRIOCOCICHICIHIHHICOHCCHR >= this.IOORCIHICORHOHHIRICRCCHOHRCHRC) {
            this.IICCCOCIIOROCRIIOICHIROORRCIHR();
         }

         return var1;
      } else {
         return this.IIHRRORCCRIIRRRRRRCRIRRROCIIHO.read();
      }
   }

   @Override
   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      if (this.IOOIIIIIORORRCHHCHRCOHCCCORHHR != null) {
         int var4 = this.IOORCIHICORHOHHIRICRCCHOHRCHRC - this.OOROCRRIOCOCICHICIHIHHICOHCCHR;
         if (var3 > var4) {
            var3 = var4;
         }

         System.arraycopy(this.IOOIIIIIORORRCHHCHRCOHCCCORHHR, this.OOROCRRIOCOCICHICIHIHHICOHCCHR, var1, var2, var3);
         this.OOROCRRIOCOCICHICIHIHHICOHCCHR += var3;
         if (this.OOROCRRIOCOCICHICIHIHHICOHCCHR >= this.IOORCIHICORHOHHIRICRCCHOHRCHRC) {
            this.IICCCOCIIOROCRIIOICHIROORRCIHR();
         }

         return var3;
      } else {
         return this.IIHRRORCCRIIRRRRRRCRIRRROCIIHO.read(var1, var2, var3);
      }
   }

   @Override
   public synchronized void reset() {
      if (this.IOOIIIIIORORRCHHCHRCOHCCCORHHR == null) {
         this.IIHRRORCCRIIRRRRRRCRIRRROCIIHO.reset();
      }
   }

   @Override
   public long skip(long var1) {
      long var3 = 0L;
      if (this.IOOIIIIIORORRCHHCHRCOHCCCORHHR != null) {
         int var5 = this.IOORCIHICORHOHHIRICRCCHOHRCHRC - this.OOROCRRIOCOCICHICIHIHHICOHCCHR;
         if (var5 > var1) {
            this.OOROCRRIOCOCICHICIHIHHICOHCCHR += (int)var1;
            return var1;
         }

         this.IICCCOCIIOROCRIIOICHIROORRCIHR();
         var3 += var5;
         var1 -= var5;
      }

      if (var1 > 0L) {
         var3 += this.IIHRRORCCRIIRRRRRRCRIRRROCIIHO.skip(var1);
      }

      return var3;
   }

   private void IICCCOCIIOROCRIIOICHIROORRCIHR() {
      byte[] var1 = this.IOOIIIIIORORRCHHCHRCOHCCCORHHR;
      if (var1 != null) {
         this.IOOIIIIIORORRCHHCHRCOHCCCORHHR = null;
         if (this.HIORCIIHRCIICOOIHOCOCORHHHRROH != null) {
            this.HIORCIIHRCIICOOIHOCOCORHHHRROH.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(var1);
         }
      }
   }
}
