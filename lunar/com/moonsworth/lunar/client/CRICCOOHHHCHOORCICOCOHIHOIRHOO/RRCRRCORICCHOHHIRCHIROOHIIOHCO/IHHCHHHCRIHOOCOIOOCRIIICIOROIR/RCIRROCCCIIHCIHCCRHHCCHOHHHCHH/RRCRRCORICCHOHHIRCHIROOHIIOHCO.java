package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Supplier;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RORIOROIOIROIICORICCORCIOIHHOH;
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COOHHIORORHOORRCHHHIOHROOOHHHR;
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIRRICIHCCOCIOCRCRHHIIOOCHOIHI;
   private volatile BufferedImage RCHRHICCHROCCHCOOIOCOCIRROCHIR = null;

   protected RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      String var2
   ) {
      this.RORIOROIOIROIICORICCORCIOIHHOH = var1;
      this.COOHHIORORHOORRCHHHIOHROOOHHHR = new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, this::HORIOCOOIOORROCIOHOCHRIIHHIIHC, false);
      this.HIRRICIHCCOCIOCRCRHHIIOOCHOIHI = new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2 + "_outline", this::RHRHROHOIIRRHOHOOOCRIRRRIIHIRI, true
      );
   }

   public void reload() {
      this.COOHHIORORHOORRCHHHIOHROOOHHHR.reload();
      if (this.RORIOROIOIROIICORICCORCIOIHHOH.IIOIOHCIROICIOICICIOCOCIOICICH()) {
         this.HIRRICIHCCOCIOCRCRHHIIOOCHOIHI.reload();
      } else {
         this.HIRRICIHCCOCIOCRCRHHIIOOCHOIHI.IHRHCCOHICIROOCIOCIOHOCRRHOCCC();
         this.RCHRHICCHROCCHCOOIOCOCIRROCHIR = null;
      }
   }

   protected void reset() {
      this.COOHHIORORHOORRCHHHIOHROOOHHHR.IHRHCCOHICIROOCIOCIOHOCRRHOCCC();
      this.HIRRICIHCCOCIOCRCRHHIIOOCHOIHI.IHRHCCOHICIROOCIOCIOHOCRRHOCCC();
      this.RCHRHICCHROCCHCOOIOCOCIRROCHIR = null;
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3,
      float var4,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var5
   ) {
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var6 = this.COOHHIORORHOORRCHHHIOHROOOHHHR.CORHIIHIRICHROHHICROIHORHRRHRH().orElse(null);
      if (var6 != null) {
         int var7 = this.RORIOROIOIROIICORICCORCIOIHHOH.HIIOICCHIHCHIRORICCOIHRIOHHHIO().CRICOHCIOHIOOCRIHHORCOIHOROCII().size();
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var8 = var5.OOHOHIRIOCCOHOIRRIHHCRCOHCHOCC()
            ? RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRHIRIROOIHHCCCIHHRHIORHOIORCI
            : RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OROCRHCRIIOROIRROOCCOOICIHOROH;
         var1.push();
         var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var2, var3, 0.0F);
         float var9 = (var7 + 1) / 16.0F;
         if (var9 > 1.0F) {
            var9 = 1.0F + 1.0F / var9;
         }

         var4 /= Math.max(1.0F, var9);
         var1.scale(var4, var4, 1.0F);
         float var10 = (int)Math.floor(var7 / 2.0F);
         float var11 = (int)Math.ceil(var7 / 2.0F);
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var8.get(var6),
            var6,
            -var10,
            -var10,
            var11 + var10,
            var11 + var10,
            var5x -> var5x.RRCRRCORICCHOHHIRCHIROOHIIOHCO(-var10, var11, 0.0)
               .RRCRRCORICCHOHHIRCHIROOHIIOHCO(0.0F, 1.0F)
               .IHIRRIIORRHORHRORIHOROIRCORCOO(var5.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2 - var10, var3 + var11))
               .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC()
               .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var11, var11, 0.0)
               .RRCRRCORICCHOHHIRCHIROOHIIOHCO(1.0F, 1.0F)
               .IHIRRIIORRHORHRORIHOROIRCORCOO(var5.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2 + var11, var3 + var11))
               .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC()
               .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var11, -var10, 0.0)
               .RRCRRCORICCHOHHIRCHIROOHIIOHCO(1.0F, 0.0F)
               .IHIRRIIORRHORHRORIHOROIRCORCOO(var5.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2 + var11, var3 - var11))
               .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC()
               .RRCRRCORICCHOHHIRCHIROOHIIOHCO(-var10, -var10, 0.0)
               .RRCRRCORICCHOHHIRCHIROOHIIOHCO(0.0F, 0.0F)
               .IHIRRIIORRHORHRORIHOROIRCORCOO(var5.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2 - var11, var3 - var11))
               .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC()
         );
         Optional var12 = this.HIRRICIHCCOCIOCRCRHHIIOOCHOIHI.CORHIIHIRICHROHHICROIHORHRRHRH();
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var13 = this.RORIOROIOIROIICORICCORCIOIHHOH.RCOHHORCCOCCOCOCOHHOIICIRRRHOC();
         if (var13 != null && var12.isPresent()) {
            float var14 = (int)Math.floor((var7 + 2) / 2.0F);
            float var15 = (int)Math.ceil((var7 + 2) / 2.0F);
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OROCRHCRIIOROIRROOCCOOICIHOROH.get((RCIROOOOICRHCCRRCIORHHIRCOIIIC)var12.get()),
               (RCIROOOOICRHCCRRCIORHHIRCOIIIC)var12.get(),
               -var14,
               -var14,
               var15 + var14,
               var15 + var14,
               var5x -> var5x.RRCRRCORICCHOHHIRCHIROOHIIOHCO(-var14, var15, 0.0)
                  .RRCRRCORICCHOHHIRCHIROOHIIOHCO(0.0F, 1.0F)
                  .IHIRRIIORRHORHRORIHOROIRCORCOO(var13.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2 - var14, var3 + var15))
                  .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC()
                  .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var15, var15, 0.0)
                  .RRCRRCORICCHOHHIRCHIROOHIIOHCO(1.0F, 1.0F)
                  .IHIRRIIORRHORHRORIHOROIRCORCOO(var13.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2 + var15, var3 + var15))
                  .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC()
                  .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var15, -var14, 0.0)
                  .RRCRRCORICCHOHHIRCHIROOHIIOHCO(1.0F, 0.0F)
                  .IHIRRIIORRHORHRORIHOROIRCORCOO(var13.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2 + var15, var3 - var15))
                  .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC()
                  .RRCRRCORICCHOHHIRCHIROOHIIOHCO(-var14, -var14, 0.0)
                  .RRCRRCORICCHOHHIRCHIROOHIIOHCO(0.0F, 0.0F)
                  .IHIRRIIORRHORHRORIHOROIRCORCOO(var13.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2 - var15, var3 - var15))
                  .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC()
            );
         }

         var1.pop();
      }
   }

   private BufferedImage HORIOCOOIOORROCIOHOCHRIIHHIIHC() {
      int var1 = this.RORIOROIOIROIICORICCORCIOIHHOH.HIIOICCHIHCHIRORICCOIHRIOHHHIO().CRICOHCIOHIOOCRIHHORCOIHOROCII().size();
      BufferedImage var2 = new BufferedImage(var1, var1, 2);
      boolean[] var3 = this.RORIOROIOIROIICORICCORCIOIHHOH.HIIOICCHIHCHIRORICCOIHRIOHHHIO().ICCCIHRHOCCOICCORHORCHHHROOIRC();

      for (int var4 = 0; var4 < var1 * var1; var4++) {
         if (var3[var4]) {
            var2.setRGB(var4 % var2.getWidth(), var4 / var2.getHeight(), -1);
         }
      }

      this.RCHRHICCHROCCHCOOIOCOCIRROCHIR = var2;
      return var2;
   }

   private BufferedImage RHRHROHOIIRRHOHOOOCRIRRRIIHIRI() {
      int var1 = this.RORIOROIOIROIICORICCORCIOIHHOH.HIIOICCHIHCHIRORICCOIHRIOHHHIO().CRICOHCIOHIOOCRIHHORCOIHOROCII().size();
      byte var2 = 25;
      int var3 = (var1 + 2) * var2;
      int var4 = var1 * var2;
      float var5 = this.RORIOROIOIROIICORICCORCIOIHHOH.CCCIIHCCICCCICIHOHCIHIIOOHRHRC();
      BufferedImage var6 = this.RCHRHICCHROCCHCOOIOCOCIRROCHIR;
      if (var6 == null) {
         var6 = this.HORIOCOOIOORROCIOHOCHRIIHHIIHC();
      }

      this.RCHRHICCHROCCHCOOIOCOCIRROCHIR = null;
      int var7 = var6.getWidth();
      int var8 = var6.getHeight();
      int var9 = (int)Math.ceil((1.0F - var5) * var2);
      int var10 = var2 + (int)Math.floor(var5 * var2);
      BufferedImage var11 = new BufferedImage(var3, var3, 2);
      Graphics2D var12 = (Graphics2D)var11.getGraphics();
      var12.drawImage(var6, var9, var9, var4 + var9, var4 + var9, 0, 0, var7, var8, null);
      var12.drawImage(var6, var9, var10, var4 + var9, var4 + var10, 0, 0, var7, var8, null);
      var12.drawImage(var6, var10, var9, var4 + var10, var4 + var9, 0, 0, var7, var8, null);
      var12.drawImage(var6, var10, var10, var4 + var10, var4 + var10, 0, 0, var7, var8, null);
      var12.drawImage(var6, var2, var9, var4 + var2, var4 + var9, 0, 0, var7, var8, null);
      var12.drawImage(var6, var2, var10, var4 + var2, var4 + var10, 0, 0, var7, var8, null);
      var12.drawImage(var6, var9, var2, var4 + var9, var4 + var2, 0, 0, var7, var8, null);
      var12.drawImage(var6, var10, var2, var4 + var10, var4 + var2, 0, 0, var7, var8, null);
      var12.dispose();
      BufferedImage var13 = new BufferedImage(var3, var3, 2);
      var12 = (Graphics2D)var13.getGraphics();
      var12.drawImage(var6, var2, var2, var4 + var2, var4 + var2, 0, 0, var7, var8, null);
      var12.dispose();

      for (int var14 = 0; var14 < var13.getWidth(); var14++) {
         for (int var15 = 0; var15 < var13.getHeight(); var15++) {
            if (var13.getRGB(var14, var15) == -1) {
               var11.setRGB(var14, var15, 0);
            }
         }
      }

      return var11;
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final RCIROOOOICRHCCRRCIORHHIRCOIIIC IHRHORIHHHORIIRHCICCHHIIRRICRR;
      private final Supplier<BufferedImage> CIOOCROROCCOHHRORCICHIHIOHICOH;
      private final boolean HCIORRCRIRHIOIHORHHHRRIRRIROIC;
      private volatile BufferedImage image = null;
      private boolean loaded = false;
      private boolean needsUpdate = true;
      private boolean CIOOOICCCCOCRHOOIRHHIOOCOCROIH = false;
      private long IROOOOCOICIIIOCHHOHOIOIRCHCROO = -1L;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Supplier<BufferedImage> var2, boolean var3) {
         var1 = var1.toLowerCase(Locale.ROOT);
         this.IHRHORIHHHORIIRHCICCHHIIRRICRR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "custom_crosshair_" + var1);
         this.CIOOCROROCCOHHRORCICHIHIOHICOH = var2;
         this.HCIORRCRIRHIOIHORHHHRRIRRIROIC = var3;
      }

      public void reload() {
         this.IROOOOCOICIIIOCHHOHOIOIRCHCROO = System.currentTimeMillis();
         this.OOCCIOCHOHOCRRRHORCORRRIICIORR();
      }

      public void IHRHCCOHICIROOCIOCIOHOCRRHOCCC() {
         this.IROOOOCOICIIIOCHHOHOIOIRCHCROO = -1L;
         this.needsUpdate = true;
         this.CIOOOICCCCOCRHOOIRHHIOOCOCROIH = false;
         this.image = null;
         if (this.loaded) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getTextureManager()
               .bridge$deleteTexture(this.IHRHORIHHHORIIRHCICCHHIIRRICRR);
            this.loaded = false;
         }
      }

      private void OOCCIOCHOHOCRRRHORCORRRIICIORR() {
         if (this.IROOOOCOICIIIOCHHOHOIOIRCHCROO != -1L && !this.CIOOOICCCCOCRHOOIRHHIOOCOCROIH) {
            if (!this.HCIORRCRIRHIOIHORHHHRRIRRIROIC || System.currentTimeMillis() - this.IROOOOCOICIIIOCHHOHOIOIRCHCROO >= 500L) {
               this.IROOOOCOICIIIOCHHOHOIOIRCHCROO = -1L;
               this.needsUpdate = true;
            }
         }
      }

      public Optional<RCIROOOOICRHCCRRCIORHHIRCOIIIC> CORHIIHIRICHROHHICROIHORHRRHRH() {
         return this.HRRIHRORHIIHCCOHIOCOIIRIIROOHH() ? Optional.of(this.IHRHORIHHHORIIRHCICCHHIIRRICRR) : Optional.empty();
      }

      private boolean HRRIHRORHIIHCCOHIOCOIIRIIROOHH() {
         if (!this.CIOOOICCCCOCRHOOIRHHIOOCOCROIH) {
            this.OOCCIOCHOHOCRRRHORCORRRIICIORR();
            if (this.needsUpdate) {
               this.needsUpdate = false;
               this.CIOOOICCCCOCRHOOIRHHIOOCOCROIH = true;
               if (this.HCIORRCRIRHIOIHORHHHRRIRRIROIC) {
                  ORCOCORROHIROCCIORORRRRCHIOOCH.RHOHHCCOOIHIIRCORRRIORCRIIOHHI().execute(() -> {
                     this.image = this.CIOOCROROCCOHHRORCICHIHIOHICOH.get();
                     ORCOCORROHIROCCIORORRRRCHIOOCH.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(this::update);
                  });
               } else {
                  this.image = this.CIOOCROROCCOHHRORCICHIHIOHICOH.get();
                  this.update();
               }
            }
         }

         return this.loaded && !this.CIOOOICCCCOCRHOOIRHHIOOCOCROIH && this.IROOOOCOICIIIOCHHOHOIOIRCHCROO == -1L;
      }

      private void update() {
         if (this.CIOOOICCCCOCRHOOIRHHIOOCOCROIH) {
            try {
               if (this.loaded) {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$getTextureManager()
                     .bridge$deleteTexture(this.IHRHORIHHHORIIRHCICCHHIIRRICRR);
                  this.loaded = false;
               }

               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getTextureManager()
                  .bridge$loadTexture(
                     this.IHRHORIHHHORIIRHCICCHHIIRRICRR,
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.image)
                  );
               this.loaded = true;
            } finally {
               this.image = null;
               this.CIOOOICCCCOCRHOOIRHHIOOCOCROIH = false;
            }
         }
      }
   }
}
