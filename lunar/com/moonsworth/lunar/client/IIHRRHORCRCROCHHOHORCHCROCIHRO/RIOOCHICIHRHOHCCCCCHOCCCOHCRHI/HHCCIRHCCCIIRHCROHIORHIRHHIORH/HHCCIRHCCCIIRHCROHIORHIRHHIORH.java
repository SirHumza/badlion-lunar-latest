package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final HHCCIRHCCCIIRHCROHIORHIRHHIORH HIRHHCOOCCORCOOORRCHIRCRHHORIO = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private final ColorModel IOOOROCIROHORCORIICIOOIOIROIOH = ColorModel.getRGBdefault();
   private final int[] COICCICHICHIIICCRIRCRHHOHCOHII = new int[1098304];
   private final WritableRaster OOOCCOHCROICOCOCOIRRCHRCRIIRIC = this.RHROIROROOHRHROIOCRROOIHCCOIRI();
   private final Semaphore HHHOCHIRHOORHCRCCICCCIRRHOIORI = new Semaphore(1);
   private final ConcurrentLinkedQueue<Runnable> OHCRHROOROHCRIOHRRRCOOHORHICRR = new ConcurrentLinkedQueue<>();

   private WritableRaster RHROIROROOHRHROIOCRROOIHCCOIRI() {
      int[] var1 = new int[]{16711680, 65280, 255, -16777216};
      DataBufferInt var2 = new DataBufferInt(this.COICCICHICHIIICCRIRCRHHOHCOHII, this.COICCICHICHIIICCRIRCRHHOHCOHII.length, 0);
      return Raster.createPackedRaster(var2, 1048, 1048, 1048, var1, null);
   }

   public CompletableFuture<Integer> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRRCCOICORICIHCHRHIHIHROIRHOCR var1,
      Font var2,
      boolean var3,
      boolean var4,
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var5,
      boolean var6,
      String var7
   ) {
      if (var6) {
         try {
            int var8 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var4, var5);
            int var9 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var7);
            return CompletableFuture.completedFuture(var8);
         } catch (Throwable var10) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error("Failed to load font", var10);
            if (this.HHHOCHIRHOORHCRCCICCCIRRHOIORI.availablePermits() == 0) {
               this.HHHOCHIRHOORHCRCCICCCIRRHOIORI.release(1);
            }

            return CompletableFuture.completedFuture(0);
         }
      } else {
         return CompletableFuture.<Integer>supplyAsync(
               () -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var4, var5), ORCOCORROHIROCCIORORRRRCHIOOCH.RHOHHCCOOIHIIRCORRRIORCRIIOHHI()
            )
            .thenApplyAsync(var4x -> {
               int var5x = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var5x, var7);
               return (Integer)var4x;
            }, this.executor())
            .exceptionally(var1x -> {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error("Failed to load font", var1x);
               if (this.HHHOCHIRHOORHCRCCICCCIRRHOIORI.availablePermits() == 0) {
                  this.HHHOCHIRHOORHCRCCICCCIRRHOIORI.release(1);
               }

               return 0;
            });
      }
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Font var1, boolean var2, boolean var3, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var4) {
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().ICCIRICOHOCCCICROHCRCIOHOIRIIC()) {
         while (!this.HHHOCHIRHOORHCRCCICCCIRRHOIORI.tryAcquire(1)) {
            Runnable var5 = this.OHCRHROOROHCRIOHRRRCOOHORHICRR.poll();
            if (var5 != null) {
               var5.run();
            }
         }
      } else {
         this.HHHOCHIRHOORHCRCCICCCIRRHOIORI.acquireUninterruptibly(1);
      }

      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3, var4);
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var1) {
      int var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
      float var3 = var2;

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 : var1) {
         var7.RIOCICHCIOORHICCIIIICCRHOOCHRH = var7.COIHOHCHOCORIHIHIICRORHHCRCOCH / 1048.0F;
         var7.OHIRICIOHHHOHHICRCIICHCORCOHCC = (var7.COIHOHCHOCORIHIHIICRORHHCRCOCH + var7.width) / 1048.0F;
         var7.RHIORHRHOOIROORIROOOIOROROOHCC = var7.IICIOCOOICCIORRRCOHROOCCIHCHHI / var3;
         var7.CIRHOHHIOHCRORCCHROIOHOIHCCHOI = (var7.IICIOCOOICCIORRRCOHROOCCIHCHHI + var7.height) / var3;
      }

      return var2;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR var1, int var2, String var3) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORICICIICROCRICRHRHHRCHHRCRHOR();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var5 = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         false,
         false,
         null,
         null,
         1048,
         var2,
         var2,
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ARGB,
         this.COICCICHICHIIICCRIRCRHHOHCOHII,
         var3
      );
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1);
      this.HHHOCHIRHOORHCRCCICCCIRRHOIORI.release(1);
   }

   public Executor executor() {
      return var1 -> {
         this.OHCRHROOROHCRIOHRRRCOOHORHICRR.add(var1);
         ORCOCORROHIROCCIORORRRRCHIOOCH.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(() -> {
            Runnable var1x = this.OHCRHROOROHCRIOHRRRCOOHORHICRR.poll();
            if (var1x != null) {
               var1x.run();
            }
         });
      };
   }

   protected int IRCIIHHICIHRCOCRROCOICRIHHCCHH(Font var1, boolean var2, boolean var3, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var4) {
      short var5 = 1048;
      BufferedImage var6 = new BufferedImage(this.IOOOROCIROHORCORIICIOOIOIROIOH, this.OOOCCOHCROICOCOCOIRRCHRCRIIRIC, false, new Hashtable());
      Graphics2D var7 = (Graphics2D)var6.getGraphics();
      var7.setFont(var1);
      Arrays.fill(this.COICCICHICHIIICCRIRCRHHOHCOHII, 0);
      var7.setColor(Color.WHITE);
      var7.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var3 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
      var7.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var2 ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
      var7.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var2 ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
      FontMetrics var8 = var7.getFontMetrics();
      int var9 = 0;
      int var10 = 0;
      int var11 = 1;
      int var12 = -1;

      for (int var13 = 0; var13 < var4.length; var13++) {
         char var14 = (char)var13;
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
         Rectangle2D var16 = var8.getStringBounds(String.valueOf(var14), var7);
         var15.width = var16.getBounds().width + 8;
         var15.height = var16.getBounds().height;
         if (var10 + var15.width >= var5) {
            var10 = 0;
            var11 += var9;
            var9 = 0;
         }

         if (var15.height > var9) {
            var9 = var15.height;
         }

         var15.COIHOHCHOCORIHIHIICRORHHCRCOCH = var10;
         var15.IICIOCOOICCIORRRCOHROOCCIHCHHI = var11;
         if (var15.height > var12) {
            var12 = var15.height;
         }

         var4[var13] = var15;
         var7.drawString(String.valueOf(var14), var10 + 2, var11 + var8.getAscent());
         var10 += var15.width;
      }

      return var12;
   }

   public static int IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var0) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = var0[var0.length - 1];
      return var1.IICIOCOOICCIORRRCOHROOCCIHCHHI + var1.height;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH CRHORCCRRIRHCRHIIRICCCHHROCIHH() {
      return HIRHHCOOCCORCOOORRCHIRCRHHORIO;
   }
}
