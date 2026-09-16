package org.spongepowered.include.com.google.common.io;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import org.spongepowered.include.com.google.common.base.Preconditions;

public abstract class ByteSink {
   protected ByteSink() {
   }

   public CharSink asCharSink(Charset var1) {
      return new ByteSink.AsCharSink(var1);
   }

   public abstract OutputStream openStream();

   public void write(byte[] var1) {
      Preconditions.checkNotNull(var1);
      Closer var2 = Closer.create();

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

   private final class AsCharSink extends CharSink {
      private final Charset charset;

      private AsCharSink(Charset var2) {
         this.charset = Preconditions.checkNotNull(var2);
      }

      @Override
      public Writer openStream() {
         return new OutputStreamWriter(ByteSink.this.openStream(), this.charset);
      }

      @Override
      public String toString() {
         return ByteSink.this.toString() + ".asCharSink(" + this.charset + ")";
      }
   }
}
