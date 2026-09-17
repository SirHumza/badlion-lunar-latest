package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.Font;
import java.io.InputStream;
import java.util.concurrent.CompletableFuture;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final int HRIRIICIHHRIOCROHRCORICRIOOIRO = 1048;
   public static final float CCRHIIOHHRICCCRRHIIRROCHIOHHRC = 1048.0F;
   protected final RCIROOOOICRHCCRRCIORHHIRCOIIIC IROIHCCHHRCOOHCORIOOHIRIHCICIC;
   protected final RCIROOOOICRHCCRRCIORHHIRCOIIIC CRIHIHRHRRCRICOOHHOROIIIICCROH;
   private final float CHROOOHIIIHOIOORROOOIRIOOCCCOR;
   protected int index;
   protected int remaining;
   protected boolean[] rendered;
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] RICOIRORIICHHCIOCOCOHIHCIRIHOH = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[256];
   protected Font COICIHIIHRRCCRRICOCRCHRROOICRC;
   protected boolean antiAlias;
   protected boolean RORIOOOCOHCHOCOOHROIOROIIRRORC;
   protected int OCICHRHROHIORCRRRIHHHHCIHIHIOH = -1;
   protected int RCOCRCOCHHRCIHCOIIIROIIOOHIOOC = 0;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, float var2) {
      this.IROIHCCHHRCOOHCORIOOHIRIHCICIC = var1;
      String var3 = var1.bridge$getPath();
      var3 = var3.substring(var3.indexOf(47) + 1, var3.indexOf(46));
      this.CRIHIHRHRRCRICOOHHOROIIIICCROH = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", var3 + "-cfont_default-" + (int)var2);
      this.CHROOOHIIIHOIOORROOOIRIOOCCCOR = var2;
      this.antiAlias = true;
      this.RORIOOOCOHCHOCOOHROIOROIIRRORC = true;
   }

   @Override
   public boolean HICCORIOHCOHCRRHHCIOIIIRCCROOC() {
      if (this.COICIHIIHRRCCRRICOCRCHRROOICRC != null) {
         return true;
      }

      Font var1;
      try {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRHCOOHHRHIRCRHHROCRHCHIOIROHH()
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getResourceManager() != null) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getResourceManager()
               .bridge$getResource(this.IROIHCCHHRCOOHCORIOOHIRIHCICIC);
            if (var4 != null) {
               var1 = Font.createFont(0, var4.bridge$getInputStream()).deriveFont(this.CHROOOHIIIHOIOORROOOIRIOOCCCOR);
            } else {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Couldn't find the CFont resource file: " + this.IROIHCCHHRCOOHCORIOOHIRIHCICIC
               );
               var1 = new Font("Arial", 0, (int)this.CHROOOHIIIHOIOORROOOIRIOOCCCOR);
            }
         } else {
            InputStream var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getMcDefaultResourcePack()
               .bridge$getInputStream(this.IROIHCCHHRCOOHCORIOOHIRIHCICIC);
            var1 = Font.createFont(0, var2).deriveFont(this.CHROOOHIIIHOIOORROOOIRIOOCCCOR);
         }
      } catch (Exception var3) {
         var1 = new Font("Arial", 0, (int)this.CHROOOHIIIHOIOORROOOIRIOOCCCOR);
      }

      this.COICIHIIHRRCCRRICOCRCHRROOICRC = var1;
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$deleteTexture(this.CRIHIHRHRRCRICOOHHOROIIIICCROH);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.CRIHIHRHRRCRICOOHHOROIIIICCROH,
            this.COICIHIIHRRCCRRICOCRCHRROOICRC,
            this.antiAlias,
            this.RORIOOOCOHCHOCOOHROIOROIIRRORC,
            this.RICOIRORIICHHCIOCOCOHIHCIRIHOH,
            true
         )
         .thenAccept(var1x -> this.OCICHRHROHIORCRRRIHHHHCIHIHIOH = var1x);
      return true;
   }

   @Override
   public String CCCHICIIIROIRRRHCROHIOIRIROCIH() {
      return this.IROIHCCHHRCOOHCORIOOHIRIHCICIC.bridge$getPath();
   }

   protected CompletableFuture<Integer> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1,
      Font var2,
      boolean var3,
      boolean var4,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var5,
      boolean var6
   ) {
      try {
         RICRIRRCOHRCOCRRHHCRHRROOIOHHR var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getTextureManager()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, new com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI());
         return HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRHORCCRRIRHCRHIIRICCCHHROCIHH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var2, var3, var4, var5, var6, var1.toString());
      } catch (Throwable var8) {
         throw var8;
      }
   }

   protected void markRendered() {
      if (!this.rendered[this.index]) {
         this.rendered[this.index] = true;
         this.remaining--;
      }
   }

   public int getHeight() {
      return (this.OCICHRHROHIORCRRRIHHHHCIHIHIOH - 8) / 2;
   }

   public float IOOOHRRHCHICHHHCRIRHIICORRCIRO(String var1) {
      int var2 = 0;

      for (char var6 : var1.toCharArray()) {
         if (var6 < this.RICOIRORIICHHCIOCOCOHIHCIRIHOH.length) {
            var2 += this.RICOIRORIICHHCIOCOCOHIHCIRIHOH[var6].width - 8 + this.RCOCRCOCHHRCIHCOIIIROIIOOHIOOC;
         }
      }

      return var2 / 2.0F;
   }

   @Generated
   public Font CRIHCHIIOHOOCHRRRCHCOCHHCRRROC() {
      return this.COICIHIIHRRCCRRICOCRCHRROOICRC;
   }

   @Generated
   public boolean isAntiAlias() {
      return this.antiAlias;
   }

   @Generated
   public boolean HHCHRRHOHIOHICROOOHCHHROOOOIIC() {
      return this.RORIOOOCOHCHOCOOHROIOROIIRRORC;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public int width;
      public int height;
      public int COIHOHCHOCORIHIHIICRORHHCRCOCH;
      public int IICIOCOOICCIORRRCOHROOCCIHCHHI;
      public float RIOCICHCIOORHICCIIIICCRHOOCHRH;
      public float RHIORHRHOOIROORIROOOIOROROOHCC;
      public float OHIRICIOHHHOHHICRCIICHCORCOHCC;
      public float CIRHOHHIOHCRORCCHROIOHOIHCCHOI;
   }
}
