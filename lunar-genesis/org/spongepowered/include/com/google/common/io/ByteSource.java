package org.spongepowered.include.com.google.common.io;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import org.spongepowered.include.com.google.common.base.Preconditions;

public abstract class ByteSource {
   protected ByteSource() {
   }

   public CharSource asCharSource(Charset var1) {
      return new ByteSource.AsCharSource(var1);
   }

   public abstract InputStream openStream();

   public InputStream openBufferedStream() {
      InputStream var1 = this.openStream();
      return var1 instanceof BufferedInputStream ? (BufferedInputStream)var1 : new BufferedInputStream(var1);
   }

   public byte[] read() {
      Closer var1 = Closer.create();

      try {
         InputStream var2 = var1.register(this.openStream());
         return ByteStreams.toByteArray(var2);
      } catch (Throwable var7) {
         throw var1.rethrow(var7);
      } finally {
         var1.close();
      }
   }

   private final class AsCharSource extends CharSource {
      final Charset charset;

      AsCharSource(Charset var2) {
         this.charset = Preconditions.checkNotNull(var2);
      }

      @Override
      public Reader openStream() {
         return new InputStreamReader(ByteSource.this.openStream(), this.charset);
      }

      @Override
      public String toString() {
         return ByteSource.this.toString() + ".asCharSource(" + this.charset + ")";
      }
   }
}
