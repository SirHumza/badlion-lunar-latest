package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.HOIHOROOIOOCOIHCRIRIRIRRICIIHC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Optional;
import javax.imageio.ImageIO;
import lombok.Generated;
import org.apache.commons.io.IOUtils;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC IORHCHCOOOICIRRORIOOORRIRICOCH;
   private final int HRIOHIRHRHHCCOIRRIHHHRORRCHIRH;
   private final int RHHIRIOHHCHRHICHCCIRIICHCHIHOI;
   private final boolean OHRROHOHIHIHHOIRRHCIRRIROHCHIH;
   private final com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH ROCRRIRHCOIIHHROCRCHRHOCICHCHR;
   private BufferedImage image;
   private RCIROOOOICRHCCRRCIORHHIRCOIIIC HOIICIOIICIHHIRHIHOCIOIOIIIOHO;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      boolean var1,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2,
      int var3,
      int var4,
      boolean var5,
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6,
      BufferedImage var7
   ) {
      super(var1);
      this.IORHCHCOOOICIRRORIOOORRIRICOCH = var2;
      this.HRIOHIRHRHHCCOIRRIHHHRORRCHIRH = var3;
      this.RHHIRIOHHCHRHICHCCIRIICHCHIHOI = var4;
      this.OHRROHOHIHIHHOIRRHCIRRIROHCHIH = var5;
      this.ROCRRIRHCOIIHHROCRCHRHOCICHCHR = var6;
      this.image = var7;
   }

   public static Optional<com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0, String var1, float var2, float var3, float var4, float var5, int var6, int var7
   ) {
      InputStream var8 = null;
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var9 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var1);

      try {
         try {
            var8 = var0.bridge$getInputStream(var9);
         } catch (Exception var27) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Reading pack resource " + var1 + " in pack " + var0.bridge$getPackName() + ", falling back to vanilla (" + var27.getMessage() + ")"
            );
         }

         if (var8 == null) {
            return Optional.empty();
         }

         BufferedImage var10 = ImageIO.read(var8);
         if (var10 == null) {
            return Optional.empty();
         }

         boolean var11 = false;
         int var12 = var10.getWidth();
         int var13 = var10.getHeight();
         if (var12 != var13) {
            try (InputStream var14 = var0.bridge$getInputStream(RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var9 + ".mcmeta"))) {
               var11 = true;
               var13 = var12;
            } catch (Exception var29) {
            }
         }

         int var35 = (int)Math.floor(var2 * var12);
         int var15 = (int)Math.floor(var3 * var13);
         int var16 = (int)Math.floor(var4 * var12);
         int var17 = (int)Math.floor(var5 * var13);
         var35 = Math.max(0, Math.min(var35, var12 - 1));
         var15 = Math.max(0, Math.min(var15, var13 - 1));
         var16 = Math.max(0, Math.min(var16, var12 - 1)) + 1;
         var17 = Math.max(0, Math.min(var17, var13 - 1)) + 1;
         var12 = var16 - var35;
         var13 = var17 - var15;
         var10 = var10.getSubimage(var35, var15, var12, var13);
         return Optional.of(
            new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var0 == IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDefaultResourcePack(),
               var9,
               var12,
               var13,
               var11,
               new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var6, var7
               ),
               HOIHOROOIOOCOIHCRIRIRIRRICIIHC.IIHRRHORCRCROCHHOHORCHCROCIHRO(var10)
            )
         );
      } catch (Exception var30) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var30, "Error while reading resource pack for preview %s%s", var0.bridge$getPackName(), var9.toString()
         );
      } finally {
         IOUtils.closeQuietly(var8);
      }

      return Optional.empty();
   }

   public static Optional<com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0, String var1, int var2, int var3
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, 0.0F, 0.0F, 1.0F, 1.0F, var2, var3);
   }

   @Override
   public boolean CIHOCCIIIOIOCRIHOOHRCHCOORHRHH() {
      if (this.image != null && this.HOIICIOIICIHHIRHIHOCIOIOIIIOHO == null) {
         BufferedImage var1 = this.image;
         this.image = null;
         CORCOCICIRIOHROHROIIOOHICCHCRR var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
         String var3 = this.IORHCHCOOOICIRRORIOOORRIRICOCH.bridge$getPath().replaceAll("/", "_");
         this.HOIICIOIICIHHIRHIHOCIOIOIIIOHO = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getTextureManager()
            .bridge$getDynamicTextureLocation(var3, var2);
      }

      return this.HOIICIOIICIHHIRHIHOCIOIOIIIOHO != null;
   }

   @Override
   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      int var3,
      int var4,
      int var5
   ) {
      if (this.HOIICIOIICIHHIRHIHOCIOIOIIIOHO != null) {
         int var6 = Math.min(this.ROCRRIRHCOIIHHROCRCHRHOCICHCHR.OOIRCOCROHROCRHRICCHIHORHROHII(), this.HRIOHIRHRHHCCOIRRIHHHRORRCHIRH);
         int var7 = Math.min(this.ROCRRIRHCOIIHHROCRCHRHOCICHCHR.ORCOCCCOOOOCROCIHIRIICOIHCIRHR(), this.RHHIRIOHHCHRHICHCCIRIICHCHIHOI);
         if (var7 != var5) {
            var3 += Math.round(var5 / 2.0F - var7 / 2.0F);
         }

         if (var6 != var4) {
            var2 += Math.round(var4 / 2.0F - var6 / 2.0F - 0.25F) - 1;
         }

         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HOIICIOIICIHHIRHIHOCIOIOIIIOHO, var2, var3, var6, var7, -1);
         return new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var6, var7
         );
      } else {
         return com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCICICRCIHIOICOIROROICCOORRCH;
      }
   }

   @Override
   public void destroy() {
      this.image = null;
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1 = this.HOIICIOIICIHHIRHIHOCIOIOIIIOHO;
      this.HOIICIOIICIHHIRHIHOCIOIOIIIOHO = null;
      if (var1 != null) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$deleteTexture(var1);
      }
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC RRHRIHHOCOOIIOHRROORIHHHORCOOO() {
      return this.IORHCHCOOOICIRRORIOOORRIRICOCH;
   }

   @Generated
   public int getWidth() {
      return this.HRIOHIRHRHHCCOIRRIHHHRORRCHIRH;
   }

   @Generated
   public int getHeight() {
      return this.RHHIRIOHHCHRHICHCCIRIICHCHIHOI;
   }

   @Generated
   public boolean ICCRCOIRIROHCRHCCCCHCOIIRHHHOC() {
      return this.OHRROHOHIHIHHOIRRHCIRRIROHCHIH;
   }

   @Generated
   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CHHRHICRCOCOOCOHIHCHRRCOHRHRCR() {
      return this.ROCRRIRHCOIIHHROCRCHRHOCICHCHR;
   }
}
