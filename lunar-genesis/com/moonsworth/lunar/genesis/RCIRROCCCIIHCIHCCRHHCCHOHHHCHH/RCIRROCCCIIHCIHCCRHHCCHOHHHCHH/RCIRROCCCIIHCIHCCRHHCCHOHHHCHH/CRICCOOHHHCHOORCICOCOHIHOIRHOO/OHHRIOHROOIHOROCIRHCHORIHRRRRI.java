package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class OHHRIOHROOIHOROCIRHCHORIHRRRRI extends OutputStream {
   private final int ICHCRCCIOOOHIOIRIRHHOOIIRICIRC;
   private final boolean RORHICIROORRIRIROOHORRHOOCICOI;
   private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH OCIHOHHORHIRRCRCCCRCHOHOHHICRO;
   private final @Nullable File CRRCIHHRRIHOORCIIRCORHRROICIHC;
   @GuardedBy("this")
   private OutputStream out;
   @GuardedBy("this")
   private OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHOCRCORHOIHRROOHHHHIOHOHHRRRC;
   @GuardedBy("this")
   private @Nullable File file;

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   synchronized File getFile() {
      return this.file;
   }

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI(int var1) {
      this(var1, false);
   }

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI(int var1, boolean var2) {
      this(var1, var2, null);
   }

   private OHHRIOHROOIHOROCIRHCHORIHRRRRI(int var1, boolean var2, @Nullable File var3) {
      this.ICHCRCCIOOOHIOIRIRHHOOIIRICIRC = var1;
      this.RORHICIROORRIRIROOHORRHOOCICOI = var2;
      this.CRRCIHHRRIHOORCIIRCORHRROICIHC = var3;
      this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC = new OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      this.out = this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC;
      if (var2) {
         this.OCIHOHHORHIRRCRCCCRCHOHOHHICRO = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
            @Override
            public InputStream openStream() {
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.openInputStream();
            }

            @Override
            protected void finalize() {
               try {
                  OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.reset();
               } catch (Throwable var2x) {
                  var2x.printStackTrace(System.err);
               }
            }
         };
      } else {
         this.OCIHOHHORHIRRCRCCCRCHOHOHHICRO = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
            @Override
            public InputStream openStream() {
               return OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.openInputStream();
            }
         };
      }
   }

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH COCIHCROIIHOHORICCROOCHRROROHC() {
      return this.OCIHOHHORHIRRCRCCCRCHOHOHHICRO;
   }

   private synchronized InputStream openInputStream() {
      return this.file != null
         ? new FileInputStream(this.file)
         : new ByteArrayInputStream(this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC.getBuffer(), 0, this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC.getCount());
   }

   public synchronized void reset() {
      try {
         this.close();
      } finally {
         if (this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC == null) {
            this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC = new OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
         } else {
            this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC.reset();
         }

         this.out = this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC;
         if (this.file != null) {
            File var3 = this.file;
            this.file = null;
            if (!var3.delete()) {
               throw new IOException("Could not delete: " + var3);
            }
         }
      }
   }

   @Override
   public synchronized void write(int var1) {
      this.update(1);
      this.out.write(var1);
   }

   @Override
   public synchronized void write(byte[] var1) {
      this.write(var1, 0, var1.length);
   }

   @Override
   public synchronized void write(byte[] var1, int var2, int var3) {
      this.update(var3);
      this.out.write(var1, var2, var3);
   }

   @Override
   public synchronized void close() {
      this.out.close();
   }

   @Override
   public synchronized void flush() {
      this.out.flush();
   }

   @GuardedBy("this")
   private void update(int var1) {
      if (this.file == null && this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC.getCount() + var1 > this.ICHCRCCIOOOHIOIRIRHHOOIIRICIRC) {
         File var2 = File.createTempFile("FileBackedOutputStream", null, this.CRRCIHHRRIHOORCIIRCORHRROICIHC);
         if (this.RORHICIROORRIRIROOHORRHOOCICOI) {
            var2.deleteOnExit();
         }

         FileOutputStream var3 = new FileOutputStream(var2);
         var3.write(this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC.getBuffer(), 0, this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC.getCount());
         var3.flush();
         this.out = var3;
         this.file = var2;
         this.OHOCRCORHOIHRROOHHHHIOHOHHRRRC = null;
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ByteArrayOutputStream {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      byte[] getBuffer() {
         return this.buf;
      }

      int getCount() {
         return this.count;
      }
   }
}
