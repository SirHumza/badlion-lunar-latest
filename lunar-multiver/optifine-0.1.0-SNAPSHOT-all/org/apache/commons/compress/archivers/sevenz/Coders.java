package org.apache.commons.compress.archivers.sevenz;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.tukaani.xz.ARMOptions;
import org.tukaani.xz.ARMThumbOptions;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.FinishableOutputStream;
import org.tukaani.xz.FinishableWrapperOutputStream;
import org.tukaani.xz.IA64Options;
import org.tukaani.xz.LZMAInputStream;
import org.tukaani.xz.PowerPCOptions;
import org.tukaani.xz.SPARCOptions;
import org.tukaani.xz.X86Options;

class Coders {
   private static final Map<SevenZMethod, CoderBase> CODER_MAP = new HashMap<SevenZMethod, CoderBase>() {
      private static final long serialVersionUID = 1664829131806520867L;

      {
         this.put(SevenZMethod.COPY, new Coders.CopyDecoder());
         this.put(SevenZMethod.LZMA, new Coders.LZMADecoder());
         this.put(SevenZMethod.LZMA2, new LZMA2Decoder());
         this.put(SevenZMethod.DEFLATE, new Coders.DeflateDecoder());
         this.put(SevenZMethod.BZIP2, new Coders.BZIP2Decoder());
         this.put(SevenZMethod.AES256SHA256, new AES256SHA256Decoder());
         this.put(SevenZMethod.BCJ_X86_FILTER, new Coders.BCJDecoder(new X86Options()));
         this.put(SevenZMethod.BCJ_PPC_FILTER, new Coders.BCJDecoder(new PowerPCOptions()));
         this.put(SevenZMethod.BCJ_IA64_FILTER, new Coders.BCJDecoder(new IA64Options()));
         this.put(SevenZMethod.BCJ_ARM_FILTER, new Coders.BCJDecoder(new ARMOptions()));
         this.put(SevenZMethod.BCJ_ARM_THUMB_FILTER, new Coders.BCJDecoder(new ARMThumbOptions()));
         this.put(SevenZMethod.BCJ_SPARC_FILTER, new Coders.BCJDecoder(new SPARCOptions()));
         this.put(SevenZMethod.DELTA_FILTER, new DeltaDecoder());
      }
   };

   static CoderBase findByMethod(SevenZMethod var0) {
      return CODER_MAP.get(var0);
   }

   static InputStream addDecoder(InputStream var0, long var1, Coder var3, byte[] var4) {
      CoderBase var5 = findByMethod(SevenZMethod.byId(var3.decompressionMethodId));
      if (var5 == null) {
         throw new IOException("Unsupported compression method " + Arrays.toString(var3.decompressionMethodId));
      } else {
         return var5.decode(var0, var1, var3, var4);
      }
   }

   static OutputStream addEncoder(OutputStream var0, SevenZMethod var1, Object var2) {
      CoderBase var3 = findByMethod(var1);
      if (var3 == null) {
         throw new IOException("Unsupported compression method " + var1);
      } else {
         return var3.encode(var0, var2);
      }
   }

   static class BCJDecoder extends CoderBase {
      private final FilterOptions opts;

      BCJDecoder(FilterOptions var1) {
         super();
         this.opts = var1;
      }

      @Override
      InputStream decode(InputStream var1, long var2, Coder var4, byte[] var5) {
         try {
            return this.opts.getInputStream(var1);
         } catch (AssertionError var8) {
            IOException var7 = new IOException("BCJ filter needs XZ for Java > 1.4 - see http://commons.apache.org/proper/commons-compress/limitations.html#7Z");
            var7.initCause(var8);
            throw var7;
         }
      }

      @Override
      OutputStream encode(OutputStream var1, Object var2) {
         FinishableOutputStream var3 = this.opts.getOutputStream(new FinishableWrapperOutputStream(var1));
         return new FilterOutputStream(var3) {
            @Override
            public void flush() {
            }
         };
      }
   }

   static class BZIP2Decoder extends CoderBase {
      BZIP2Decoder() {
         super(Number.class);
      }

      @Override
      InputStream decode(InputStream var1, long var2, Coder var4, byte[] var5) {
         return new BZip2CompressorInputStream(var1);
      }

      @Override
      OutputStream encode(OutputStream var1, Object var2) {
         int var3 = numberOptionOrDefault(var2, 9);
         return new BZip2CompressorOutputStream(var1, var3);
      }
   }

   static class CopyDecoder extends CoderBase {
      CopyDecoder() {
         super();
      }

      @Override
      InputStream decode(InputStream var1, long var2, Coder var4, byte[] var5) {
         return var1;
      }

      @Override
      OutputStream encode(OutputStream var1, Object var2) {
         return var1;
      }
   }

   static class DeflateDecoder extends CoderBase {
      DeflateDecoder() {
         super(Number.class);
      }

      @Override
      InputStream decode(InputStream var1, long var2, Coder var4, byte[] var5) {
         return new InflaterInputStream(new Coders.DummyByteAddingInputStream(var1), new Inflater(true));
      }

      @Override
      OutputStream encode(OutputStream var1, Object var2) {
         int var3 = numberOptionOrDefault(var2, 9);
         return new DeflaterOutputStream(var1, new Deflater(var3, true));
      }
   }

   private static class DummyByteAddingInputStream extends FilterInputStream {
      private boolean addDummyByte = true;

      private DummyByteAddingInputStream(InputStream var1) {
         super(var1);
      }

      @Override
      public int read() {
         int var1 = super.read();
         if (var1 == -1 && this.addDummyByte) {
            this.addDummyByte = false;
            var1 = 0;
         }

         return var1;
      }

      @Override
      public int read(byte[] var1, int var2, int var3) {
         int var4 = super.read(var1, var2, var3);
         if (var4 == -1 && this.addDummyByte) {
            this.addDummyByte = false;
            var1[var2] = 0;
            return 1;
         } else {
            return var4;
         }
      }
   }

   static class LZMADecoder extends CoderBase {
      LZMADecoder() {
         super();
      }

      @Override
      InputStream decode(InputStream var1, long var2, Coder var4, byte[] var5) {
         byte var6 = var4.properties[0];
         long var7 = var4.properties[1];

         for (int var9 = 1; var9 < 4; var9++) {
            var7 |= (var4.properties[var9 + 1] & 255L) << 8 * var9;
         }

         if (var7 > 2147483632L) {
            throw new IOException("Dictionary larger than 4GiB maximum size");
         } else {
            return new LZMAInputStream(var1, var2, var6, (int)var7);
         }
      }
   }
}
