package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.HOIHOROOIOOCOIHCRIRIRIRRICIIHC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import it.unimi.dsi.fastutil.Pair;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector2i;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final ConcurrentHashMap<Long, com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IORRRRCOHCOOIRORHHOHOHHICOROCO = new ConcurrentHashMap<>();
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC CCOHCRRRCOIOIHOHOIRRHCOIOHCCHR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "minecraft", IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 26 ? "textures/entity/equipment/wings/elytra.png" : "textures/entity/elytra.png"
   );
   public final RCIROOOOICRHCCRRCIORHHIRCOIIIC IOROOCOCOCCCHIOOCCRIROICHORICC;
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC RCIHRIIIHRIHOOHHHROORHCCCIRHCC;
   private BufferedImage HICROOHICCIHRCORCRCHRCCOIIRORR;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, RCIROOOOICRHCCRRCIORHHIRCOIIIC var2, RCIROOOOICRHCCRRCIORHHIRCOIIIC var3, IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4
   ) {
      super(var1, var4);
      this.IOROOCOCOCCCHIOOCCRIROICHORICC = var2;
      this.RCIHRIIIHRIHOOHHHROORHCCCIRHCC = var3;
   }

   @Override
   protected Callable<Optional<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      return new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, var2, this.CHHIHOHRROHIHCHORRHCCHIRIOHCIH
      );
   }

   @Override
   protected void IIORCROOIHRCIRCROOROHOHOORCRRR() {
      this.HICROOHICCIHRCORCRCHRCCOIIRORR.flush();
      this.HICROOHICCIHRCORCRCHRCCOIIRORR = null;
   }

   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var0,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      @Nullable Consumer<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2
   ) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .CIRRROHIOHRRIOCCRRHIOROOCIRIRO()
         .get()) {
         return var0;
      }

      if (var1 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3.bridge$getWornCosmetics(),
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK,
            0
         );
         if (var4 != null && var4.RCIIIRRHHHHRHRIRHHROIRICHIHROC().canShowCosmetic()) {
            RCIROOOOICRHCCRRCIORHHIRCOIIIC var5 = var4.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var3);
            Optional var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCCICHCRRIICICCHCIRCRRIIRROHHC()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var3.bridge$getUniqueID());
            if (var6.isEmpty()) {
               return var0;
            }

            RCIROOOOICRHCCRRCIORHHIRCOIIIC var7 = CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, var3.bridge$getUniqueID());
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCCICHCRRIICICCHCIRCRRIIRROHHC()
               .CIIROOOCRHORHRRICHOOOIIIORIHIH()
               .get(var7);
            if (var8 != null) {
               return var0;
            }

            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9;
            if (IORRRRCOHCOOIRORHHOHOHHICOROCO.containsKey(var4.RCOCIIHHOIHOOCCCIICCRHHRRCCCCH())) {
               var9 = IORRRRCOHCOOIRORHHOHOHHICOROCO.get(var4.RCOCIIHHOIHOOCCCIICCRHHRRCCCCH());
            } else {
               RCIROOOOICRHCCRRCIORHHIRCOIIIC var10 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "elytra_" + var5.bridge$getPath());
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var10, var5, CCOHCRRRCOIOIHOHOIRRHCOIOHCCHR, IHHCHHHCRIHOOCOIOOCRIIICIOROIR.FULL
               );
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var11);
               IORRRRCOHCOOIRORHHOHOHHICOROCO.put(var4.RCOCIIHHOIHOOCCCIICCRHHRRCCCCH(), var11);
               var9 = var11;
            }

            if (var9 != null && var9.IRIHHHOROHICICOCIOOIHHRRRCOHIO()) {
               if (var2 != null) {
                  IRRCCOICORICIHCHRHIHIHROIRHOCR var13 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$getTextureManager()
                     .bridge$getTexture(var5);
                  if (var13.OOIIHHIHCIROIOOCOCHHROIRCROOHI() instanceof CRRRICCRROCOHHOHIICIHORCOORRRH var14) {
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 = var14.ORRIRRIIIICIRHHIHIHCCICHORHIOO();
                     if (var15 != null) {
                        var2.accept(var15);
                     }
                  }
               }

               var9.HICOOCROHIOCRCIIRROOOCRHRHOOOC();
               return var9.RIHCIOHHOOHOOCCHIICHROCRHIRIHH;
            }

            if (var9 != null) {
               var9.IRRCCOICORICIHCHRHIHIHROIRHOCR(true);
            }

            return var0;
         }
      }

      return var0;
   }

   private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CORCOCICIRIOHROHROIIOOHICCHCRR {
      private static final List<Pair<Vector2i, Vector2i>> HHOCOHCCRCCHCOIOOCORRHHCIOCRHI = List.of(
         Pair.of(new Vector2i(0, 10), new Vector2i(0, 16)),
         Pair.of(new Vector2i(1, 12), new Vector2i(1, 16)),
         Pair.of(new Vector2i(2, 14), new Vector2i(2, 16)),
         Pair.of(new Vector2i(1, 16), new Vector2i(4, 16)),
         Pair.of(new Vector2i(1, 0), new Vector2i(7, 0)),
         Pair.of(new Vector2i(7, 1), new Vector2i(10, 1)),
         Pair.of(new Vector2i(8, 2), new Vector2i(10, 2)),
         Pair.of(new Vector2i(9, 3), new Vector2i(10, 5)),
         Pair.of(new Vector2i(10, 1), new Vector2i(10, 9))
      );
      private IRCIIHHICIHRCOCRROCOICRIHHCCHH HHIOCCHIHRRHHIROORCOOOICHRCCCH = null;
      private int RIHORCOCRHCHOCOIHCHIOCOOIRIOHH = -1;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2,
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3,
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4
      ) {
         super(
            var2,
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RCIHRIIIHRIHOOHHHROORHCCCIRHCC,
            var3,
            var4,
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.CCHIOORHCORRIHRRHIOHHCHCOIRHOR
         );
      }

      @Override
      protected BufferedImage RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BufferedImage var1, IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = this.RRRCHCRCOCCICIORHIHIOHRHIIOHIR
            .bridge$getResource(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IOROOCOCOCCCHIOOCCRIROICHORICC);
         if (var3 == null) {
            throw new RuntimeException("Couldn't find elytra cloak resource: " + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IOROOCOCOCCCHIOOCCRIROICHORICC);
         }

         try {
            InputStream var4 = var3.bridge$getInputStream();
            BufferedImage var5 = HOIHOROOIOOCOIHCRIRIRIRRICIIHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, null);
            var5 = this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var5);
            this.RIHORCOCRHCHOCOIHCHIOCOOIRIOHH = var5.getHeight();
            IRRCCOICORICIHCHRHIHIHROIRHOCR var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getTextureManager()
               .bridge$getTexture(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IOROOCOCOCCCHIOOCCRIROICHORICC);
            float var7 = (float)var5.getWidth() / var5.getHeight();
            boolean var8 = var7 < 1.9 || var7 > 2.1;
            int var9 = var5.getWidth() / (var8 ? 22 : 64);
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = null;
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH var11 = var6.OOIIHHIHCIROIOOCOCHHROIRCROOHI();
            if (var11 != null) {
               if (var11 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH var12) {
                  var10 = var12.ORRIRRIIIICIRHHIHIHCCICHORHIOO();
                  if (var10 == null && var3.bridge$hasMetadata()) {
                     try {
                        IRCIIHHICIHRCOCRROCOICRIHHCCHH var13 = var3.bridge$getMetadata("animation");
                        var10 = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13);
                        var10.setFrameCount(this.RIHORCOCRHCHOCOIHCHIOCOOIRIOHH);
                     } catch (RuntimeException var21) {
                        var21.printStackTrace();
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           "Texture",
                           "Failed reading metadata of %s: %s",
                           RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIHCIOHHOOHOOCCHIICHROCRHIRIHH,
                           var21.getMessage()
                        );
                     }
                  }
               }

               if (var10 != null) {
                  this.HHIOCCHIHRRHHIROORCOOOICHRCCCH = var10.RIHIRICHOCOICIORCRIRIIROCCCIRC();
                  var9 = var5.getWidth() / 22;
                  this.IHRIOOOHHRCOIRHHIOIOIHRRHRHRIC = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.LOW;
               }
            }

            int var24 = var10 == null ? 1 : var10.getFrameCount();
            BufferedImage var25 = new BufferedImage(64 * var9, 32 * var9 * var24, 2);
            int var14 = 32 * var9;
            int var15 = var5.getHeight() / var24;

            for (int var16 = 0; var16 < var24; var16++) {
               int var17 = var16 * var14;
               int var18 = var16 * var15;

               for (Pair var20 : HHOCOHCCRCCHCOIOOCORRHHCIOCRHI) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Vector2i)var20.first(), (Vector2i)var20.second(), var5, var9, var18);
               }

               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new Vector2i(0, 1), new Vector2i(1, 9), new Vector2i(35, 1), var5, var25, var9, var18, var17);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new Vector2i(1, 1), new Vector2i(11, 17), new Vector2i(35, 1), var5, var25, var9, var18, var17);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new Vector2i(8, 0), new Vector2i(11, 1), new Vector2i(23, 0), var5, var25, var9, var18, var17);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new Vector2i(12, 10), new Vector2i(13, 16), new Vector2i(10, 1), var5, var25, var9, var18, var17);
            }

            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.HICROOHICCIHRCORCRCHRCCOIIRORR = var25;
            return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.HICROOHICCIHRCORCRCHRCCOIIRORR;
         } catch (IOException var22) {
            throw new RuntimeException(var22);
         }
      }

      @Override
      protected int CORCOCICIRIOHROHROIIOOHICCHCRR(BufferedImage var1) {
         return 32;
      }

      @Override
      protected IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         return this.HHIOCCHIHRRHHIROORCOOOICHRCCCH != null ? this.HHIOCCHIHRRHHIROORCOOOICHRCCCH : var1;
      }

      @Override
      protected int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BufferedImage var1, int var2) {
         return this.HHIOCCHIHRRHHIROORCOOOICHRCCCH != null ? this.RIHORCOCRHCHOCOIHCHIOCOOIRIOHH : super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Vector2i var1, Vector2i var2, Vector2i var3, BufferedImage var4, BufferedImage var5, int var6, int var7, int var8
      ) {
         for (int var9 = var1.x * var6; var9 < var2.x * var6; var9++) {
            for (int var10 = var1.y * var6; var10 < var2.y * var6; var10++) {
               var5.setRGB(var9 + var3.x * var6, var10 + var3.y * var6 + var8, var4.getRGB(var9, var10 + var7));
            }
         }
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector2i var1, Vector2i var2, BufferedImage var3, int var4, int var5) {
         for (int var6 = var1.x * var4; var6 < (var2.x + 1) * var4; var6++) {
            for (int var7 = var1.y * var4; var7 < (var2.y + 1) * var4; var7++) {
               var3.setRGB(var6, var7 + var5, 0);
            }
         }
      }

      private BufferedImage CRICCOOHHHCHOORCICOCOHIHOIRHOO(BufferedImage var1) {
         BufferedImage var2 = new BufferedImage(var1.getWidth(), var1.getHeight(), 2);
         var2.getGraphics().drawImage(var1, 0, 0, null);
         return var2;
      }
   }
}
