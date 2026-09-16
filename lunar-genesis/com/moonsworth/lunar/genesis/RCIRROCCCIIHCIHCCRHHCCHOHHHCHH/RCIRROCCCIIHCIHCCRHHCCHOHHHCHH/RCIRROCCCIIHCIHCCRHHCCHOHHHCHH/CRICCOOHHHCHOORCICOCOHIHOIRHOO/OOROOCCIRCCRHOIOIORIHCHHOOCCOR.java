package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   private static final int HCIHOHICHIHHOICCOHIOHRICIRHIHC = 8192;
   private static final int HCOIROHHRCHOOCRORCRIOCIROOCICC = 524288;
   private static final int OIIROOIRCORORICRRICIOOHICHOCOR = 2147483639;
   private static final int ROCHRHRICHOOROOIRHROICHCHIIICO = 20;
   private static final OutputStream HCOORIRICCHHOHCOOHHIORRIIICHHC = new OutputStream() {
      @Override
      public void write(int var1) {
      }

      @Override
      public void write(byte[] var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public void write(byte[] var1, int var2, int var3) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public String toString() {
         return "ByteStreams.nullOutputStream()";
      }
   };

   static byte[] createBuffer() {
      return new byte[8192];
   }

   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
   }

   @CanIgnoreReturnValue
   public static long copy(InputStream var0, OutputStream var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      byte[] var2 = createBuffer();
      long var3 = 0L;

      while (true) {
         int var5 = var0.read(var2);
         if (var5 == -1) {
            return var3;
         }

         var1.write(var2, 0, var5);
         var3 += var5;
      }
   }

   @CanIgnoreReturnValue
   public static long copy(ReadableByteChannel var0, WritableByteChannel var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (var0 instanceof FileChannel) {
         FileChannel var9 = (FileChannel)var0;
         long var10 = var9.position();
         long var5 = var10;

         long var7;
         do {
            var7 = var9.transferTo(var5, 524288L, var1);
            var5 += var7;
            var9.position(var5);
         } while (var7 > 0L || var5 < var9.size());

         return var5 - var10;
      } else {
         ByteBuffer var2 = ByteBuffer.wrap(createBuffer());
         long var3 = 0L;

         while (var0.read(var2) != -1) {
            ((Buffer)var2).flip();

            while (var2.hasRemaining()) {
               var3 += var1.write(var2);
            }

            ((Buffer)var2).clear();
         }

         return var3;
      }
   }

   private static byte[] toByteArrayInternal(InputStream var0, Deque<byte[]> var1, int var2) {
      for (int var3 = 8192;
         var2 < 2147483639;
         var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.saturatedMultiply(
            var3, 2
         )
      ) {
         byte[] var4 = new byte[Math.min(var3, 2147483639 - var2)];
         var1.add(var4);
         int var5 = 0;

         while (var5 < var4.length) {
            int var6 = var0.read(var4, var5, var4.length - var5);
            if (var6 == -1) {
               return combineBuffers(var1, var2);
            }

            var5 += var6;
            var2 += var6;
         }
      }

      if (var0.read() == -1) {
         return combineBuffers(var1, 2147483639);
      } else {
         throw new OutOfMemoryError("input is too large to fit in a byte array");
      }
   }

   private static byte[] combineBuffers(Deque<byte[]> var0, int var1) {
      byte[] var2 = new byte[var1];
      int var3 = var1;

      while (var3 > 0) {
         byte[] var4 = (byte[])var0.removeFirst();
         int var5 = Math.min(var3, var4.length);
         int var6 = var1 - var3;
         System.arraycopy(var4, 0, var2, var6, var5);
         var3 -= var5;
      }

      return var2;
   }

   public static byte[] toByteArray(InputStream var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return toByteArrayInternal(var0, new ArrayDeque<>(20), 0);
   }

   static byte[] toByteArray(InputStream var0, long var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0L, "expectedSize (%s) must be non-negative", var1
      );
      if (var1 > 2147483639L) {
         throw new OutOfMemoryError(var1 + " bytes is too large to fit in a byte array");
      }

      byte[] var3 = new byte[(int)var1];
      int var4 = (int)var1;

      while (var4 > 0) {
         int var5 = (int)var1 - var4;
         int var6 = var0.read(var3, var5, var4);
         if (var6 == -1) {
            return Arrays.copyOf(var3, var5);
         }

         var4 -= var6;
      }

      int var7 = var0.read();
      if (var7 == -1) {
         return var3;
      }

      ArrayDeque var8 = new ArrayDeque(22);
      var8.add(var3);
      var8.add(new byte[]{(byte)var7});
      return toByteArrayInternal(var0, var8, var3.length + 1);
   }

   @CanIgnoreReturnValue
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static long exhaust(InputStream var0) {
      long var1 = 0L;
      byte[] var5 = createBuffer();

      long var3;
      while ((var3 = var0.read(var5)) != -1L) {
         var1 += var3;
      }

      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH IIOIROIHIHHCCRICRCOOCHIICHRCOI(
      byte[] var0
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new ByteArrayInputStream(var0));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH OHHRIOHROOIHOROCIRHCHORIHRRRRI(
      byte[] var0, int var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
         var1, var0.length
      );
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new ByteArrayInputStream(var0, var1, var0.length - var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ByteArrayInputStream var0
   ) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var0
         )
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static CRRRICCRROCOHHOHIICIHORCOORRRH CCCRHOCORCCOICHROIROHOOOHCOCIH() {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new ByteArrayOutputStream());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static CRRRICCRROCOHHOHIICIHORCOORRRH ORRRCRCCHIRHIHRHIROROCOHROCHCO(int var0) {
      if (var0 < 0) {
         throw new IllegalArgumentException(String.format("Invalid size: %s", var0));
      } else {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new ByteArrayOutputStream(var0));
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ByteArrayOutputStream var0) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var0
         )
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static OutputStream nullOutputStream() {
      return HCOORIRICCHHOHCOOHHIORRIIICHHC;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static InputStream limit(InputStream var0, long var1) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static void readFully(InputStream var0, byte[] var1) {
      readFully(var0, var1, 0, var1.length);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static void readFully(InputStream var0, byte[] var1, int var2, int var3) {
      int var4 = read(var0, var1, var2, var3);
      if (var4 != var3) {
         throw new EOFException("reached end of stream after reading " + var4 + " bytes; " + var3 + " bytes expected");
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static void skipFully(InputStream var0, long var1) {
      long var3 = skipUpTo(var0, var1);
      if (var3 < var1) {
         throw new EOFException("reached end of stream after skipping " + var3 + " bytes; " + var1 + " bytes expected");
      }
   }

   static long skipUpTo(InputStream var0, long var1) {
      long var3 = 0L;
      byte[] var5 = null;

      while (var3 < var1) {
         long var6 = var1 - var3;
         long var8 = skipSafely(var0, var6);
         if (var8 == 0L) {
            int var10 = (int)Math.min(var6, 8192L);
            if (var5 == null) {
               var5 = new byte[var10];
            }

            if ((var8 = var0.read(var5, 0, var10)) == -1L) {
               break;
            }
         }

         var3 += var8;
      }

      return var3;
   }

   private static long skipSafely(InputStream var0, long var1) {
      int var3 = var0.available();
      return var3 == 0 ? 0L : var0.skip(Math.min(var3, var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   public static <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InputStream var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO<T> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      byte[] var2 = createBuffer();

      int var3;
      do {
         var3 = var0.read(var2);
      } while (var3 != -1 && var1.processBytes(var2, 0, var3));

      return (T)var1.getResult();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   public static int read(InputStream var0, byte[] var1, int var2, int var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (var3 < 0) {
         throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", var3));
      }

      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
         var2, var2 + var3, var1.length
      );
      int var4 = 0;

      while (var4 < var3) {
         int var5 = var0.read(var1, var2 + var4, var3 - var4);
         if (var5 == -1) {
            break;
         }

         var4 += var5;
      }

      return var4;
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends FilterInputStream {
      private long left;
      private long mark = -1L;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(InputStream var1, long var2) {
         super(var1);
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var2 >= 0L, "limit must be non-negative"
         );
         this.left = var2;
      }

      @Override
      public int available() {
         return (int)Math.min(this.in.available(), this.left);
      }

      @Override
      public synchronized void mark(int var1) {
         this.in.mark(var1);
         this.mark = this.left;
      }

      @Override
      public int read() {
         if (this.left == 0L) {
            return -1;
         }

         int var1 = this.in.read();
         if (var1 != -1) {
            this.left--;
         }

         return var1;
      }

      @Override
      public int read(byte[] var1, int var2, int var3) {
         if (this.left == 0L) {
            return -1;
         }

         var3 = (int)Math.min(var3, this.left);
         int var4 = this.in.read(var1, var2, var3);
         if (var4 != -1) {
            this.left -= var4;
         }

         return var4;
      }

      @Override
      public synchronized void reset() {
         if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
         }

         if (this.mark == -1L) {
            throw new IOException("Mark not set");
         }

         this.in.reset();
         this.left = this.mark;
      }

      @Override
      public long skip(long var1) {
         var1 = Math.min(var1, this.left);
         long var3 = this.in.skip(var1);
         this.left -= var3;
         return var3;
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
      final DataOutput RICOICRHROOOHCHIOHCIIHICIIRORC;
      final ByteArrayOutputStream HOOOHOCHOCIOCHOHIHOCHCIROOHOOC;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(ByteArrayOutputStream var1) {
         this.HOOOHOCHOCIOCHOHIHOCHCIROOHOOC = var1;
         this.RICOICRHROOOHCHIOHCIIHICIIRORC = new DataOutputStream(var1);
      }

      @Override
      public void write(int var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.write(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void write(byte[] var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.write(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void write(byte[] var1, int var2, int var3) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.write(var1, var2, var3);
         } catch (IOException var5) {
            throw new AssertionError(var5);
         }
      }

      @Override
      public void writeBoolean(boolean var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeBoolean(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void writeByte(int var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeByte(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void writeBytes(String var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeBytes(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void writeChar(int var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeChar(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void writeChars(String var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeChars(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void writeDouble(double var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeDouble(var1);
         } catch (IOException var4) {
            throw new AssertionError(var4);
         }
      }

      @Override
      public void writeFloat(float var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeFloat(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void writeInt(int var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeInt(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void writeLong(long var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeLong(var1);
         } catch (IOException var4) {
            throw new AssertionError(var4);
         }
      }

      @Override
      public void writeShort(int var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeShort(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public void writeUTF(String var1) {
         try {
            this.RICOICRHROOOHCHIOHCIIHICIIRORC.writeUTF(var1);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public byte[] toByteArray() {
         return this.HOOOHOCHOCIOCHOHIHOCHCIROOHOOC.toByteArray();
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      final DataInput RCRROCCCIHICIOROHRRIHRCIRCCORH;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ByteArrayInputStream var1) {
         this.RCRROCCCIHICIOROHRRIHRCIRCCORH = new DataInputStream(var1);
      }

      @Override
      public void readFully(byte[] var1) {
         try {
            this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readFully(var1);
         } catch (IOException var3) {
            throw new IllegalStateException(var3);
         }
      }

      @Override
      public void readFully(byte[] var1, int var2, int var3) {
         try {
            this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readFully(var1, var2, var3);
         } catch (IOException var5) {
            throw new IllegalStateException(var5);
         }
      }

      @Override
      public int skipBytes(int var1) {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.skipBytes(var1);
         } catch (IOException var3) {
            throw new IllegalStateException(var3);
         }
      }

      @Override
      public boolean readBoolean() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readBoolean();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public byte readByte() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readByte();
         } catch (EOFException var2) {
            throw new IllegalStateException(var2);
         } catch (IOException var3) {
            throw new AssertionError(var3);
         }
      }

      @Override
      public int readUnsignedByte() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readUnsignedByte();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public short readShort() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readShort();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public int readUnsignedShort() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readUnsignedShort();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public char readChar() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readChar();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public int readInt() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readInt();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public long readLong() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readLong();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public float readFloat() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readFloat();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public double readDouble() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readDouble();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public String readLine() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readLine();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }

      @Override
      public String readUTF() {
         try {
            return this.RCRROCCCIHICIOROHRRIHRCIRCCORH.readUTF();
         } catch (IOException var2) {
            throw new IllegalStateException(var2);
         }
      }
   }
}
