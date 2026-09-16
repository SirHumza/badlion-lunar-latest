package com.luciad.imageio.webp;

import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DirectColorModel;
import java.awt.image.SampleModel;
import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Locale;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriter;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.ImageOutputStream;

public class WebPImageWriterSpi extends ImageWriterSpi {
   public WebPImageWriterSpi() {
      super(
         "Luciad",
         "1.0",
         new String[]{"WebP", "webp"},
         new String[]{"webp"},
         new String[]{"image/webp"},
         WebPReader.class.getName(),
         new Class[]{ImageOutputStream.class},
         new String[]{WebPImageReaderSpi.class.getName()},
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
   public boolean canEncodeImage(ImageTypeSpecifier var1) {
      ColorModel var2 = var1.getColorModel();
      SampleModel var3 = var1.getSampleModel();
      int var4 = var3.getTransferType();
      if (var2 instanceof ComponentColorModel) {
         if (!(var3 instanceof ComponentSampleModel)) {
            return false;
         }

         if (var4 != 0 && var4 != 3) {
            return false;
         }
      } else if (var2 instanceof DirectColorModel) {
         if (!(var3 instanceof SinglePixelPackedSampleModel)) {
            return false;
         }

         if (var4 != 3) {
            return false;
         }
      }

      ColorSpace var5 = var2.getColorSpace();
      if (!var5.isCS_sRGB()) {
         return false;
      }

      int[] var6 = var3.getSampleSize();

      for (int var7 = 0; var7 < var6.length; var7++) {
         if (var6[var7] > 8) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ImageWriter createWriterInstance(Object var1) {
      return new WebPWriter(this);
   }

   @Override
   public String getDescription(Locale var1) {
      return "WebP Writer";
   }
}
