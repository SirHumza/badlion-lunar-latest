package org.spongepowered.include.com.google.common.io;

import java.io.InputStream;
import java.net.URL;
import org.spongepowered.include.com.google.common.base.Preconditions;

public final class Resources {
   public static ByteSource asByteSource(URL var0) {
      return new Resources.UrlByteSource(var0);
   }

   private static final class UrlByteSource extends ByteSource {
      private final URL url;

      private UrlByteSource(URL var1) {
         this.url = Preconditions.checkNotNull(var1);
      }

      @Override
      public InputStream openStream() {
         return this.url.openStream();
      }

      @Override
      public String toString() {
         return "Resources.asByteSource(" + this.url + ")";
      }
   }
}
