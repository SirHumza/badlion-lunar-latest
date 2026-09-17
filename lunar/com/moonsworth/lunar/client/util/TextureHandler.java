package com.moonsworth.lunar.client.util;

import com.google.common.hash.Hashing;
import com.google.common.net.MediaType;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import javax.imageio.ImageIO;
import lombok.Generated;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public final class OIICIRRCOOCIHRHOIOIOOROCRHCHIC {
   private static final Path OCRCORIRHIOCRHORCIIHOHHHIROCRO = IIRHCHHOICHRICOOCRORCCIOOIHOIR.CCOHHIHIIHCHIHCCOIOOHCRCCHIIOO.resolve("downloaded-images");
   private static final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC OCOHRHORHICIIICIHIHOCCROHORCCI = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "lunar", "backgrounds/dirt_background.png"
   );

   public static InputStream IHHCHHHCRIHOOCOIOOCRIIICIOROIR(BufferedImage var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      ImageIO.write(var0, "jpeg", var1);
      return new ByteArrayInputStream(var1.toByteArray());
   }

   public static BufferedImage HRCHROOHRIHCRCRHRIIROCIRHOIRHH(InputStream var0) {
      if (var0 == null) {
         return null;
      }

      BufferedImage var1;
      try {
         var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
      } finally {
         IOUtils.closeQuietly(var0);
      }

      return var1;
   }

   public static Optional<BufferedImage> CROHIOCIRCHHOROIOOROHIRHRHRORR(String var0) {
      ByteBuf var1 = Unpooled.copiedBuffer(var0, Charsets.UTF_8);
      ByteBuf var2 = Base64.decode(var1);

      try {
         return Optional.ofNullable(HRCHROOHRIHCRCRHRIIROCIRHOIRHH(new ByteBufInputStream(var2)));
      } catch (IOException var7) {
         var7.printStackTrace();
      } finally {
         var1.release();
         var2.release();
      }

      return Optional.empty();
   }

   private static String HOHOOIHHIHCRCCROOCIOOIHCRCHICR(String var0) {
      return Hashing.md5().hashString(var0, com.google.common.base.Charsets.UTF_8).toString();
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var0, String var1
   ) {
      Path var2 = OCRCORIRHIOCRHORCIIHOHHHIROCRO;
      MediaType var3 = MediaType.PNG;

      try {
         Files.createDirectories(var2);
      } catch (IOException var7) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, "Loading Downloads");
         return;
      }

      String var4 = HOHOOIHHIHCRCCROOCIOOIHCRCHICR(var1);
      Path var5 = var2.resolve(var4 + "." + var3.subtype());
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO var6 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.toFile(), var1, var0, OCOHRHORHICIIICIHIHOCCROHORCCI);
      var6.setMimeType(MediaType.PNG);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$loadTexture(var0, var6);
   }

   @Generated
   private OIICIRRCOOCIHRHOIOIOOROCRHCHIC() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   @Generated
   public static Path CRRRRRRCCCIROCHRORHOOCHROOIHIC() {
      return OCRCORIRHIOCRHORCIIHOHHHIROCRO;
   }
}
