package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR;

import com.lunarclient.websocket.screenshot.v1.Dimensions;
import com.lunarclient.websocket.screenshot.v1.RecordScreenshotRequest;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.function.Function;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.stream.ImageOutputStream;
import lombok.Generated;
import org.jspecify.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends Thread {
   private static final String RCCIRHCIIROIOICICRCIOCHRROIOIO = "javax_imageio_png_1.0";
   private final CRRRICCRROCOHHOHIICIHORCOORRRH HRORRHCHORRHCCIIOCOIHIOHIRCRHC;
   private int[] CCRIOHHCOCHCRRRHOIIORHRRHIICHC;
   private final int IHOCROOCORCHRCOIHCCHHHCOCIOICO;
   private final int IHHIIORHICRCHCHROCRRCRHCOCRORO;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH IIROHIOICIOIICOHRRRHROOCCOICCH;
   private final File CHHCHOCICRIIRHCRIIRIOROHRIIRRO;
   private final @Nullable HHCCIRHCCCIIRHCROHIORHIRHHIORH OCIRRCRHCRORIRRRHCOOCRCROHHRCR;
   private final Function<int[], BufferedImage> IROHIICCICIHRORRCHIIICOROCRIIC;
   private final Runnable OOHHIHHCROCRIOICCROCOCHORORCRC;

   @Override
   public void run() {
      try {
         int[] var1 = this.CCRIOHHCOCHCRRRHOIIORHRRHIICHC;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            int var4 = var3 & 0xFF;
            int var5 = var3 & 0xFF00;
            int var6 = var3 & 0xFF0000;
            var1[var2] = var4 << 16 | var5 | var6 >> 16;
         }

         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.CCRIOHHCOCHCRRRHOIIORHRRHIICHC, this.IHOCROOCORCHRCOIHCCHHHCOCIOICO, this.IHHIIORHICRCHCHROCRRCRHCOCRORO
         );
         BufferedImage var9;
         if (this.IROHIICCICIHRORRCHIIICOROCRIIC != null) {
            var9 = this.IROHIICCICIHRORRCHIIICOROCRIIC.apply(this.CCRIOHHCOCHCRRRHOIIORHRRHIICHC);
         } else if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
            .CCCCCHHRHOIHHORCHHOCIHHRCHOCRC()) {
            var9 = new BufferedImage(
               this.IIROHIOICIOIICOHRRRHROOCCOICCH.bridge$framebufferWidth(), this.IIROHIOICIOIICOHRRRHROOCCOICCH.bridge$framebufferHeight(), 1
            );
            int var10 = this.IIROHIOICIOIICOHRRRHROOCCOICCH.bridge$framebufferTextureHeight() - this.IIROHIOICIOIICOHRRRHROOCCOICCH.bridge$framebufferHeight();

            for (int var11 = var10; var11 < this.IIROHIOICIOIICOHRRRHROOCCOICCH.bridge$framebufferTextureHeight(); var11++) {
               for (int var12 = 0; var12 < this.IIROHIOICIOIICOHRRRHROOCCOICCH.bridge$framebufferWidth(); var12++) {
                  var9.setRGB(
                     var12,
                     var11 - var10,
                     this.CCRIOHHCOCHCRRRHOIIORHRRHIICHC[var11 * this.IIROHIOICIOIICOHRRRHROOCCOICCH.bridge$framebufferTextureWidth() + var12]
                  );
               }
            }
         } else {
            var9 = new BufferedImage(this.IHOCROOCORCHRCOIHCCHHHCOCIOICO, this.IHHIIORHICRCHCHROCRRCRHCOCRORO, 1);
            var9.setRGB(
               0,
               0,
               this.IHOCROOCORCHRCOIHCCHHHCOCIOICO,
               this.IHHIIORHICRCHCHROCRRCRHCOCRORO,
               this.CCRIOHHCOCHCRRRHOIIORHRRHIICHC,
               0,
               this.IHOCROOCORCHRCOIHCCHHHCOCIOICO
            );
         }

         try {
            if (this.OCIRRCRHCRORIRRRHCOOCRCROHHRCR == null) {
               this.CHHCHOCICRIIRHCRIIRIOROHRIIRRO.getParentFile().mkdirs();
               ImageIO.write(var9, "png", this.CHHCHOCICRIIRHCRIIRIOROHRIIRRO);
               this.OOHHIHHCROCRIOICCROCOCHORORCRC.run();
               return;
            }

            this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var9);
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.HRORRHCHORRHCCIIOCOIHIOHIRCRHC,
               this.CHHCHOCICRIIRHCRIIRIOROHRIIRRO,
               var9,
               this.OCIRRCRHCRORIRRRHCOOCRCROHHRCR.OOOHCORCRRORIIROHOORRRHIIRIIRI(),
               true
            );
            this.OOHHIHHCROCRIOICCROCOCHORORCRC.run();
         } catch (IOException var7) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.warn("Couldn't save screenshot", var7);
         }
      } catch (Throwable var8) {
         throw var8;
      }
   }

   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(BufferedImage var1) {
      ImageWriter var2 = ImageIO.getImageWritersByFormatName("png").next();
      ImageWriteParam var3 = var2.getDefaultWriteParam();

      try {
         IIOMetadata var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var1);

         try (ImageOutputStream var5 = ImageIO.createImageOutputStream(this.CHHCHOCICRIIRHCRIIRIOROHRIIRRO)) {
            if (var5 == null) {
               throw new IOException("Failed to create image output stream: " + this.CHHCHOCICRIIRHCRIIRIOROHRIIRRO.getAbsolutePath());
            }

            var2.setOutput(var5);
            var2.write(var4, new IIOImage(var1, null, var4), var3);
         }
      } catch (Exception var10) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var10, "Save Screenshot with Metadata"
         );
         ImageIO.write(var1, "png", this.CHHCHOCICRIIRHCRIIRIOROHRIIRRO);
      }
   }

   private IIOMetadata RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ImageWriter var1, ImageWriteParam var2, BufferedImage var3) {
      ImageTypeSpecifier var4 = ImageTypeSpecifier.createFromBufferedImageType(1);
      IIOMetadata var5 = var1.getDefaultImageMetadata(var4, var2);
      if (!var5.isReadOnly() && var5.isStandardMetadataFormatSupported()) {
         IIOMetadataNode var6 = new IIOMetadataNode("tEXt");
         Encoder var7 = Base64.getEncoder();
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var6, "lc_1", var7.encodeToString(this.OCIRRCRHCRORIRRRHCOOCRCROHHRCR.RROOCOIRHRROCRORICROIHRRCCROOR().toByteArray())
         );
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var6, "lc_2", var7.encodeToString(this.OCIRRCRHCRORIRRRHCOOCRCROHHRCR.OORIRRRCROHOCIIHCIICRIROHHRHIO().toByteArray())
         );
         IIOMetadataNode var8 = new IIOMetadataNode("javax_imageio_png_1.0");
         var8.appendChild(var6);
         var5.mergeTree("javax_imageio_png_1.0", var8);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCOIHOICHRIIHOCCCIHRRHHRROORCR() != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .RCOIHOICHRIIHOCCCIHRRHHRROORCR()
               .HIRROHCROOOIRHOOCRIRRORORIIRCI()
               .recordScreenshot(
                  null,
                  RecordScreenshotRequest.newBuilder()
                     .setScreenshot(
                        this.OCIRRCRHCRORIRRRHCOOCRCROHHRCR
                           .RROOCOIRHRROCRORICROIHRRCCROOR()
                           .toBuilder()
                           .setSize(Dimensions.newBuilder().setWidth(var3.getWidth()).setHeight(var3.getHeight()))
                     )
                     .build(),
                  var0 -> {}
               );
         }

         return var5;
      } else {
         throw new IllegalArgumentException("The writer does not support metadata!");
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIOMetadataNode var1, String var2, String var3) {
      IIOMetadataNode var4 = new IIOMetadataNode("tEXtEntry");
      var4.setAttribute("keyword", var2);
      var4.setAttribute("value", var3);
      var1.appendChild(var4);
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      int[] var2,
      int var3,
      int var4,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5,
      File var6,
      @Nullable HHCCIRHCCCIIRHCROHIORHIRHHIORH var7,
      Function<int[], BufferedImage> var8,
      Runnable var9
   ) {
      this.HRORRHCHORRHCCIIOCOIHIOHIRCRHC = var1;
      this.CCRIOHHCOCHCRRRHOIIORHRRHIICHC = var2;
      this.IHOCROOCORCHRCOIHCCHHHCOCIOICO = var3;
      this.IHHIIORHICRCHCHROCRRCRHCOCRORO = var4;
      this.IIROHIOICIOIICOHRRRHROOCCOICCH = var5;
      this.CHHCHOCICRIIRHCRIIRIOROHRIIRRO = var6;
      this.OCIRRCRHCRORIRRRHCOOCRCROHHRCR = var7;
      this.IROHIICCICIHRORRCHIIICOROCRIIC = var8;
      this.OOHHIHHCROCRIOICCROCOCHORORCRC = var9;
   }
}
