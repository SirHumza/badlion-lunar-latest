package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends Writer {
   private final Appendable ROCRHHRCORHHRICRCHHHHCIOHHRRCC;
   private boolean closed;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Appendable var1) {
      this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   @Override
   public void write(char[] var1, int var2, int var3) {
      this.checkNotClosed();
      this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC.append(new String(var1, var2, var3));
   }

   @Override
   public void write(int var1) {
      this.checkNotClosed();
      this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC.append((char)var1);
   }

   @Override
   public void write(@Nullable String var1) {
      this.checkNotClosed();
      this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC.append(var1);
   }

   @Override
   public void write(@Nullable String var1, int var2, int var3) {
      this.checkNotClosed();
      this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC.append(var1, var2, var2 + var3);
   }

   @Override
   public void flush() {
      this.checkNotClosed();
      if (this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC instanceof Flushable) {
         ((Flushable)this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC).flush();
      }
   }

   @Override
   public void close() {
      this.closed = true;
      if (this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC instanceof Closeable) {
         ((Closeable)this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC).close();
      }
   }

   @Override
   public Writer append(char var1) {
      this.checkNotClosed();
      this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC.append(var1);
      return this;
   }

   @Override
   public Writer append(@Nullable CharSequence var1) {
      this.checkNotClosed();
      this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC.append(var1);
      return this;
   }

   @Override
   public Writer append(@Nullable CharSequence var1, int var2, int var3) {
      this.checkNotClosed();
      this.ROCRHHRCORHHRICRCHHHHCIOHHRRCC.append(var1, var2, var3);
      return this;
   }

   private void checkNotClosed() {
      if (this.closed) {
         throw new IOException("Cannot write to a closed writer.");
      }
   }
}
