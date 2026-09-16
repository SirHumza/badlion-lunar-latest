package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.stream.Stream;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   protected CRICCOOHHHCHOORCICOCOHIHOIRHOO() {
   }

   public abstract Writer openStream();

   public Writer openBufferedStream() {
      Writer var1 = this.openStream();
      return var1 instanceof BufferedWriter ? (BufferedWriter)var1 : new BufferedWriter(var1);
   }

   public void write(CharSequence var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         Writer var3 = var2.register(this.openStream());
         var3.append(var1);
         var3.flush();
      } catch (Throwable var7) {
         throw var2.rethrow(var7);
      } finally {
         var2.close();
      }
   }

   public void writeLines(Iterable<? extends CharSequence> var1) {
      this.writeLines(var1, System.getProperty("line.separator"));
   }

   public void writeLines(Iterable<? extends CharSequence> var1, String var2) {
      this.writeLines(var1.iterator(), var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public void writeLines(Stream<? extends CharSequence> var1) {
      this.writeLines(var1, System.getProperty("line.separator"));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public void writeLines(Stream<? extends CharSequence> var1, String var2) {
      this.writeLines(var1.iterator(), var2);
   }

   private void writeLines(Iterator<? extends CharSequence> var1, String var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );

      try (Writer var3 = this.openBufferedStream()) {
         while (var1.hasNext()) {
            var3.append((CharSequence)var1.next()).append(var2);
         }
      }
   }

   @CanIgnoreReturnValue
   public long writeFrom(Readable var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIOCRRHRHOHIOIHRHHRRCIRCOIIIII();

      try {
         Writer var3 = var2.register(this.openStream());
         long var4 = IIHRRHORCRCROCHHOHORCHCROCIHRO.copy(var1, var3);
         var3.flush();
         return var4;
      } catch (Throwable var11) {
         throw var2.rethrow(var11);
      } finally {
         var2.close();
      }
   }
}
