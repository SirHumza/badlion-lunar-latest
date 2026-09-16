package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO HHCCIRHCCCIIRHCROHIORHIRHHIORH(Charset var1) {
      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   public abstract OutputStream openStream();

   public OutputStream openBufferedStream() {
      OutputStream var1 = this.openStream();
      return var1 instanceof BufferedOutputStream ? (BufferedOutputStream)var1 : new BufferedOutputStream(var1);
   }

   public void write(byte[] var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         OutputStream var3 = var2.register(this.openStream());
         var3.write(var1);
         var3.flush();
      } catch (Throwable var7) {
         throw var2.rethrow(var7);
      } finally {
         var2.close();
      }
   }

   @CanIgnoreReturnValue
   public long writeFrom(InputStream var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         OutputStream var3 = var2.register(this.openStream());
         long var4 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.copy(var1, var3);
         var3.flush();
         return var4;
      } catch (Throwable var11) {
         throw var2.rethrow(var11);
      } finally {
         var2.close();
      }
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRICCOOHHHCHOORCICOCOHIHOIRHOO {
      private final Charset IIIRRCCCIICORHHHCHCOOIROIHCOIR;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Charset var2) {
         this.IIIRRCCCIICORHHHCHCOOIROIHCOIR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public Writer openStream() {
         return new OutputStreamWriter(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.openStream(), this.IIIRRCCCIICORHHHCHCOOIROIHCOIR);
      }

      @Override
      public String toString() {
         return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.toString() + ".asCharSink(" + this.IIIRRCCCIICORHHHCHCOOIROIHCOIR + ")";
      }
   }
}
