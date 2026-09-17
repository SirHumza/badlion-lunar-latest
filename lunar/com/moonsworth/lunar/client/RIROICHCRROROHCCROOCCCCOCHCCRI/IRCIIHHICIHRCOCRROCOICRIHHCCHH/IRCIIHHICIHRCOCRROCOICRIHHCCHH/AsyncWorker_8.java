package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.util.concurrent.AtomicDouble;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lombok.Generated;
import org.joml.Vector3f;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final float ICIRIHCHIHCROOCHRCHHIOHIHCIHOH = 0.1F;
   public static final int OOCOOHIRRIORHHRHRHROHCOHOIRIRC = 5;
   public static final int OHIRCIIHOOHCRRIHHCOIOORHIRRCHO = 8;
   private static final long CCIICOCOHRRIRCIOICCICCOCHIHHHC = TimeUnit.MILLISECONDS.convert(5L, TimeUnit.SECONDS);
   private static final long CICRHRRORCCHRICROOHIORHRICCOCH = TimeUnit.MILLISECONDS.convert(10L, TimeUnit.MILLISECONDS);
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH[][] RRCCHIOIHHIRHIRCHCOIRCROHOOOIC = new IRCIIHHICIHRCOCRROCOICRIHHCCHH[5][8];
   private final List<HHCCIRHCCCIIRHCROHIORHIRHHIORH> HCIROOIICICOIRROOCROHCHOOICIRC = new ArrayList<>();
   private final AtomicDouble RRHRIRHOOOOOOCHRCHIHRICRHOHHOI = new AtomicDouble();
   private final AtomicDouble CIRHHOOHHROOORCROOCRICCIHCRHHC = new AtomicDouble();
   private final AtomicDouble CRCRRIIIHCROCIRORIOCCRHOOCIICO = new AtomicDouble();
   private final AtomicBoolean IIIHCHHCIRHICHRCOICICICOIIIORH = new AtomicBoolean();
   private boolean ORRCRHHORRIHOIHROHOCROIHIOIHOR = false;
   private long IOOOHRCRIHOIRCIIIHORCIHHOICIRC = 0L;
   private long IROIRIOCOCCOIOCHHHOHRRRHICHOCO = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
   private long lastUpdate = 0L;
   public static final Thread RHCCCCRCORHIOOCCOCORHOCICHOIIO = new Thread(
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::HCCHIORCIHOCIRCIOOIRCIHRCHCICH, "Cloth Cloak Physics Thread"
   );

   public static void HCCHIORCIHOCIRCIOOIRCIHRCHCICH() {
      try {
         while (true) {
            for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 : CORCOCICIRIOHROHROIIOOHICCHCRR.HIOHCOORROOHIRIIORICROICHICCHH().values()) {
               var1.ICHCCHOOCRROIHHHORCHCCRIIOCIHI();
            }

            Thread.sleep(10L);
         }
      } catch (Throwable var2) {
         throw var2;
      }
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      float var1 = -0.4F;

      for (int var2 = 0; var2 < 8; var2++) {
         float var3 = -0.25F;

         for (int var4 = 0; var4 < 5; var4++) {
            float var5 = 5.0E-7F * (float)Math.sin(var4 * 1.2F + var2 * 0.5F);
            Vector3f var6 = new Vector3f(var3, var1, var5);
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(this, var6, var4, var2);
            this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var4][var2] = var7;
            var3 += 0.1F;
         }

         var1 += 0.1F;
      }

      this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[0][0].lock();
      this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[4][0].lock();

      for (int var8 = 0; var8 < 5; var8++) {
         for (int var9 = 0; var9 < 8; var9++) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 = this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var8][var9];
            if (var8 < 4) {
               this.HCIROOIICICOIRROOCROHCHOOICIRC.add(new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var10, this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var8 + 1][var9], 0.1F));
            }

            if (var9 < 7) {
               this.HCIROOIICICOIRROOCROHCHOOICIRC.add(new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var10, this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var8][var9 + 1], 0.1F));
            }

            if (var8 < 4 && var9 < 7) {
               this.HCIROOIICICOIRROOCROHCHOOICIRC
                  .add(
                     new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var8][var9], this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var8 + 1][var9 + 1], 0.14141999F
                     )
                  );
            }

            if (var8 > 0 && var9 < 7) {
               this.HCIROOIICICOIRROOCROHCHOOICIRC
                  .add(
                     new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var8][var9], this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var8 - 1][var9 + 1], 0.14141999F
                     )
                  );
            }
         }
      }
   }

   public void ICHCCHOOCRROIHHHORCHCCRIIOCIHI() {
      long var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
      if (var1 - this.IROIRIOCOCCOIOCHHHOHRRRHICHOCO <= CCIICOCOHRRIRCIOICCICCOCHIHHHC) {
         long var3 = var1 - this.lastUpdate;
         if (var3 >= CICRHRRORCCHRICROOHIORHRICCOCH) {
            float var5 = (float)((double)var3 / CICRHRRORCCHRICROOHIORHRICCOCH);
            Vector3f var6 = new Vector3f(
               (float)(-this.RRHRIRHOOOOOOCHRCHIHRICRHOHHOI.get()),
               (float)this.CIRHHOOHHROOORCROOCRICCIHCRHHC.get(),
               (float)this.CRCRRIIIHCROCIRORIOCCRHOOCIICO.get()
            );
            var6.mul(0.1F);
            var6.mul(var5);
            float var7 = 0.2F;
            if (var6.length() > var7) {
               var6.normalize().mul(var7);
            }

            float var8 = 0.95F;
            if (this.ORRCRHHORRIHOIHROHOCROIHIOIHOR != this.IIIHCHHCIRHICHRCOICICICOIIIORH.get()) {
               this.ORRCRHHORRIHOIHROHOCROIHIOIHOR = this.IIIHCHHCIRHICHRCOICICICOIIIORH.get();
               this.IOOOHRCRIHOIRCIIIHORCIHHOICIRC = var1;
               if (this.ORRCRHHORRIHOIHROHOCROIHIOIHOR && var6.length() <= 1.0E-4F) {
                  this.IIROIOIORRCIHIIOORORCHCRORCORI();
               }
            }

            if (var1 - this.IOOOHRCRIHOIRCIIIHORCIHHOICIRC < 100L) {
               var8 = 0.75F;
            }

            float var9 = 0.015F;

            for (int var10 = 0; var10 < 2; var10++) {
               for (int var11 = 0; var11 < 5; var11++) {
                  for (int var12 = 0; var12 < 8; var12++) {
                     IRCIIHHICIHRCOCRROCOICRIHHCCHH var13 = this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var11][var12];
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var6, var9);
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var9);
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var6, var11, var12, var9);
                     var13.CICOIHIRIIHHCIOICHRHICRIRCIOHC(var8);
                     var13.HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(this.IIIHCHHCIRHICHRCOICICICOIIIORH.get());
                     var13.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var11 > 0 ? this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var11 - 1][var12] : this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var11 + 1][var12],
                        var12 > 0 ? this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var11][var12 - 1] : this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var11][var12 + 1],
                        var11 > 0 && var12 > 0 || var11 == 0 && var12 == 0
                     );
                  }
               }

               for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var15 : this.HCIROOIICICOIRROOCROHCHOOICIRC) {
                  var15.IRIHOOIORROHRCCRIRHICOHHIHIHIO();
               }
            }

            this.lastUpdate = var1;
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, Vector3f var2, float var3) {
      Vector3f var4 = new Vector3f(var2);
      var4.mul(var3);
      var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, Vector3f var2, int var3, int var4, float var5) {
      long var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime() % 180000L;
      float var8 = (float)var6 / 1000.0F;
      float var9 = var2.length();
      float var10 = 2.0F * (1.0F + var9 * 4.0F);
      float var11 = 0.3F * (1.0F + var9 * 4.0F);
      float var12 = 2.0E-4F * (1.0F + var9);
      float var13 = var12 * (3.0F + var9 * 4000.0F);
      float var14 = var3 * 0.3F;
      float var15 = var4 * var11 + var8 * var10 + var14;
      Vector3f var16 = new Vector3f(0.0F, 0.0F, var13 * (float)Math.sin(var15));
      var16.mul(var5);
      var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var16);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, float var2) {
      Vector3f var3 = new Vector3f();
      float var4 = (float)Math.toRadians(this.IIIHCHHCIRHICHRCOICICICOIIIORH.get() ? -30.0 : 0.0);
      float var5 = 0.02F;
      float var6 = var5 * (float)Math.cos(var4);
      float var7 = var5 * (float)Math.sin(var4);
      var3.y += var6;
      var3.z += var7;
      var3.mul(var2);
      var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var3);
   }

   private void IIROIOIORRCIHIIOORORCHCRORCORI() {
      for (int var1 = 0; var1 < 5; var1++) {
         for (int var2 = 0; var2 < 8; var2++) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC[var1][var2];
            Vector3f var4 = new Vector3f();
            float var5 = (float)Math.toRadians(var2 == 5 ? 0.0 : -30.0);
            float var6 = 4.5F;
            float var7 = var6 * (float)Math.sin(var5);
            var4.z += var7;
            float var8 = 0.015F;
            var4.mul(var8);
            var3.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(new Vector3f(var4));
         }
      }
   }

   @Generated
   public List<HHCCIRHCCCIIRHCROHIORHIRHHIORH> CIOOHCORHIIOCHCCOCHRCROHROCCRO() {
      return this.HCIROOIICICOIRROOCROHCHOOICIRC;
   }

   @Generated
   public AtomicDouble RRHOCHOOROHCRICOCOHHCHIOOOIHHR() {
      return this.RRHRIRHOOOOOOCHRCHIHRICRHOHHOI;
   }

   @Generated
   public AtomicDouble ROIIOHHIIORRHRHIHRRICCHIRICRHO() {
      return this.CIRHHOOHHROOORCROOCRICCIHCRHHC;
   }

   @Generated
   public AtomicDouble CHOCRCOICHRRIHIHCORHOHIIRRRICR() {
      return this.CRCRRIIIHCROCIRORIOCCRHOOCIICO;
   }

   @Generated
   public AtomicBoolean OHRIOOHOCROIORRCHHRCOCCCHCCHHI() {
      return this.IIIHCHHCIRHICHRCOICICICOIIIORH;
   }

   @Generated
   public boolean OHIICCHHCRCRIOHOIOOROIICIHCROH() {
      return this.ORRCRHHORRIHOIHROHOCROIHIOIHOR;
   }

   @Generated
   public long OROCHOOCOOCRCOCIICIOOCRIOIRHHO() {
      return this.IOOOHRCRIHOIRCIIIHORCIHHOICIRC;
   }

   @Generated
   public long HOCCCCIOIOHOHOIIOOOCHCCRCOICHI() {
      return this.IROIRIOCOCCOIOCHHHOHRRRHICHOCO;
   }

   @Generated
   public long HCHOICOCRRIIICOHCOCCOCCCOIOHHC() {
      return this.lastUpdate;
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH[][] RHOCIOIHROHOIHCOHHIOOHOHRRCICI() {
      return this.RRCCHIOIHHIRHIRCHCOIRCROHOOOIC;
   }

   @Generated
   public void IIIIRHIHROIRCROHHROIHIIHRCRRHO(long var1) {
      this.IROIRIOCOCCOIOCHHHOHRRRHICHOCO = var1;
   }

   static {
      RHCCCCRCORHIOOCCOCORHOCICHOIIO.setDaemon(true);
      RHCCCCRCORHIOOCCOCORHOCICHOIIO.start();
   }
}
