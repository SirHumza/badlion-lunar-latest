package com.luciad.imageio.webp;

import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Locale;
import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

public class WebPImageReaderSpi extends ImageReaderSpi {
   private static final byte[] RIFF = new byte[]{82, 73, 70, 70};
   private static final byte[] WEBP = new byte[]{87, 69, 66, 80};
   private static final byte[] VP8_ = new byte[]{86, 80, 56, 32};
   private static final byte[] VP8L = new byte[]{86, 80, 56, 76};
   private static final byte[] VP8X = new byte[]{86, 80, 56, 88};

   public WebPImageReaderSpi() {
      super(
         "Luciad",
         "1.0",
         new String[]{"WebP", "webp"},
         new String[]{"webp"},
         new String[]{"image/webp"},
         WebPReader.class.getName(),
         new Class[]{ImageInputStream.class},
         new String[]{WebPImageWriterSpi.class.getName()},
         false,
         null,
         null,
         null,
         null,
         false,
         null,
         null,
         null,
         null
      );
   }

   @Override
   public ImageReader createReaderInstance(Object var1) {
      return new WebPReader(this);
   }

   @Override
   public boolean canDecodeInput(Object var1) {
      if (!(var1 instanceof ImageInputStream var2)) {
         return false;
      } else {
         byte[] var3 = new byte[4];
         ByteOrder var4 = var2.getByteOrder();
         var2.mark();
         var2.setByteOrder(ByteOrder.LITTLE_ENDIAN);

         try {
            var2.readFully(var3);
            if (!Arrays.equals(var3, RIFF)) {
               return false;
            }

            long var5 = var2.readUnsignedInt();
            long var7 = var2.length();
            if (var7 != -1L && var7 != var5 + 8L) {
               return false;
            }

            var2.readFully(var3);
            if (!Arrays.equals(var3, WEBP)) {
               return false;
            }

            var2.readFully(var3);
            if (!Arrays.equals(var3, VP8_) && !Arrays.equals(var3, VP8L) && !Arrays.equals(var3, VP8X)) {
               return false;
            }
         } finally {
            var2.setByteOrder(var4);
            var2.reset();
         }

         return true;
      }
   }

   @Override
   public String getDescription(Locale var1) {
      return "WebP Reader";
   }
}
