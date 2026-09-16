package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.webosr.wrappers.image.TexturedImageSource;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final Set<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CRCIRORHOHHICCCIRRCRCHRHHCCCOI = new HashSet<>();
   public static Boolean COICOCOHHCCCHOROICCIRRIIIOHORI;
   private static boolean RORICCCOHOOOROOOHRIRRCHORIIIOO;
   public static Integer ROIHIHHCCIIRHRORHHCRCHIOCRIOCC;
   public static boolean CROCOIRICICICRHCIHHRRRRIIHCOCR;
   public static Integer ORIOCIHCOOCHRHOIROORHHCIROCIHO;
   private final String HOOOHHHOCHIICHIIRCIRIIHIICCOOR;
   private final boolean CIHIOROROICOIOIIRHHIICHORRHOOH;
   private TexturedImageSource OIIOHCIHICOIHIOOIRHOOHOCRROHIR;
   private final Map<Integer, HHCCIRHCCCIIRHCROHIORHIRHHIORH> CORCROCRCHHIHHIICIHRRIRCCOOORI = new HashMap<>();
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH OOOROCOIHIOHCIRIIIOROHOCIIIOHI;
   private boolean HOCHHCCHRHOHOIHCCOHRHHORHROCRR;
   private final int RHRHICRICHRIRIROIOOROHRIOICOIR;
   private long IRIRRHIOIOOIRRCCOCIHIHCCOHCCIC;
   private int IHROICCRCIHRICIROIOHCOHOOOOOIH = 0;
   private int RRIIHIOOIRCIRCCCRROCIOOCCOCOII = 0;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, boolean var2) {
      this(var1, var2, 0);
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, boolean var2, int var3) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC().CHOIOICOCCRCOIHIRRHCRCIOHCHRHI(var1);
      this.HOOOHHHOCHIICHIIRCIRIIHIICCOOR = var1;
      this.CIHIOROROICOIOIIRHHIICHORRHOOH = var2;
      this.RHRHICRICHRIRIROIOOROHRIOICOIR = var3;
      if (!IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHRROROHOOIOHHCICCHIOIHCRIICHC()) {
         this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR = IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICOIOCHIOHOHCOCOHICOOHIRRIROO().createImageSourceTextured(var1);
         CRCIRORHOHHICCCIRRCRCHRHHCCCOI.add(this);
      }
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
      this(var1, false);
   }

   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      if (this.RHRHICRICHRIRIROIOOROHRIOICOIR == 0
         || System.currentTimeMillis() - this.IRIRRHIOIOOIRRCCOCIHIHCCOHCCIC >= 1000 / this.RHRHICRICHRIRIROIOOROHRIOICOIR) {
         if (this.OCIORRHHOCIHHOCOIIHRIOHCIROCRI()) {
            if (!com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
               .CCCCCHHRHOIHHORCHHOCIHHRCHOCRC()) {
               this.IIOOCCIIOHHIIRRIOHRIHROIOCHOCH(true);
            } else {
               this.OCOROCROIRCHIHIHHOOIRIIIRRCRHI(var1.bridge$framebufferWidth(), var1.bridge$framebufferHeight());
               this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
               this.IRIRRHIOIOOIRRCCOCIHIHCCOHCCIC = System.currentTimeMillis();
            }
         }
      }
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, int var2, int var3) {
      if (var2 > 0 && var3 > 0) {
         if (this.RHRHICRICHRIRIROIOOROHRIOICOIR != 0
            && System.currentTimeMillis() - this.IRIRRHIOIOOIRRCCOCIHIHCCOHCCIC < 1000 / this.RHRHICRICHRIRIROIOOROHRIOICOIR) {
            return false;
         } else if (!this.OCIORRHHOCIHHOCOIIHRIOHCIROCRI()) {
            return false;
         } else if (!com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
            .CCCCCHHRHOIHHORCHHOCIHHRCHOCRC()) {
            this.IIOOCCIIOHHIIRRIOHRIHROIOCHOCH(true);
            return false;
         } else {
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3);
            var1.OIIHIOIORRHHRCRRCCORRHHCHRHORH();
            var1.OIOIICCHICHHHCRROHIHIOICHROOCR();
            return true;
         }
      } else {
         return false;
      }
   }

   public void IOIICIRIICICIIOORHCIIIIRRIHRHI(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      this.HHRIICOIOORCHCOIICOOIHIRHHICRI(var1);
      this.invalidate();
      this.IRIRRHIOIOOIRRCCOCIHIHCCOHCCIC = System.currentTimeMillis();
   }

   public void delete() {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 : this.CORCROCRCHHIHHIICIHRRIRCCOOORI.values()) {
         var2.bridge$delete();
      }

      this.CORCROCRCHHIHHIICIHRRIRCCOOORI.clear();
      CRCIRORHOHHICCCIRRCRCHRHHCCCOI.remove(this);
      this.IIOOCCIIOHHIIRRIOHRIHROIOCHOCH(false);
      if (this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR != null) {
         this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR.unbind();
         this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR.close();
         this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR = null;
         if (this.HOCHHCCHRHOHOIHCCOHRHHORHROCRR) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC().COIHRHIHIHIIRCCOHOIHHOOIRRCOII().HHIICHIOCCIICOCROHHHOCIRCOHROO(),
                  "gameTexture",
                  IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
                     .toJson(
                        new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           this.HOOOHHHOCHIICHIIRCIRIIHIICCOOR, false
                        )
                     )
               );
            this.HOCHHCCHRHOHOIHCCOHRHHORHROCRR = false;
         }
      }
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH HICROOROOIIHCROHIIRIICOOHROORI() {
      return this.OOOROCOIHIOHCIRIIIOROHOCIIIOHI;
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, int var2, int var3) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = this.CORCROCRCHHIHHIICIHRRIRCCOOORI.get(this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR.hashCode());
      boolean var5 = var4 == null || var2 != var4.bridge$framebufferWidth() || var3 != var4.bridge$framebufferHeight();
      if (var4 == null || var5) {
         if (var4 != null) {
            var4.bridge$delete();
         }

         HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = this.CIHIOROROICOIOIIRHHIICHORRHOOH
            ? HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var2, var3)
            : HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3, false);
         var6.bridge$setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         var4 = var6;
         this.CORCROCRCHHIHHIICIHRRIRCCOOORI.put(this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR.hashCode(), var4);
      }

      this.OOOROCOIHIOHCIRIIIOROHOCIIIOHI = var4;
      this.OCOROCROIRCHIHIHHOOIRIIIRRCRHI(var2, var3);
      this.OOOROCOIHIOHCIRIIIOROHOCIIIOHI.bridge$framebufferClear();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OOOROCOIHIOHCIRIIIOROHOCIIIOHI, true);
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         this.OOOROCOIHIOHCIRIIIOROHOCIIIOHI
      );
   }

   private void OCOROCROIRCHIHIHHOOIRIIIRRCRHI(int var1, int var2) {
      if (this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR != null && var1 > 0 && var2 > 0) {
         if (var1 != this.IHROICCRCIHRICIROIOHCOHOOOOOIH || var2 != this.RRIIHIOOIRCIRCCCRROCIOOCCOCOII) {
            this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR.size(var1, var2);
            this.IHROICCRCIHRICIROIOHCOHOOOOOIH = var1;
            this.RRIIHIOOIRCIRCCCRROCIOOCCOCOII = var2;
         }
      }
   }

   private void HHRIICOIOORCHCOIICOOIHIRHHICRI(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, true);
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         null
      );
   }

   private void IIOOCCIIOHHIIRRIOHRIHROIOCHOCH(boolean var1) {
      Optional var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR();
      if (var2.isPresent()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var2.get();
         CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var3.getConfig();
         if (var1) {
            if (var4.hasFastRender() && (COICOCOHHCCCHOROICCIRRIIIOHORI == null || COICOCOHHCCCHOROICCIRRIIIOHORI)) {
               if (COICOCOHHCCCHOROICCIRRIIIOHORI != null) {
                  COICOCOHHCCCHOROICCIRRIIIOHORI = null;
                  return;
               }

               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "OptiFine Fast Render disabled due to active GameTextures"
               );
               COICOCOHHCCCHOROICCIRRIIIOHORI = false;
               RORICCCOHOOOROOOHRIRRCHORIIIOO = true;
            }

            if (var4.hasAntiAliasing() && var4.getAntialiasingLevel() > 0 && ROIHIHHCCIIRHRORHHCRCHIOCRIOCC == null) {
               ORIOCIHCOOCHRHOIROORHHCIROCIHO = var4.getAntialiasingLevel();
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "OptiFine Antialiasing disabled due to active GameTextures (original level: " + ORIOCIHCOOCHRHOIROORHHCIROCIHO + ")"
               );
               ROIHIHHCCIIRHRORHHCRCHIOCRIOCC = 0;
               CROCOIRICICICRHCIHHRRRRIIHCOCR = true;
            }
         } else {
            if (!CRCIRORHOHHICCCIRRCRCHRHHCCCOI.isEmpty()) {
               return;
            }

            if (RORICCCOHOOOROOOHRIRRCHORIIIOO && (COICOCOHHCCCHOROICCIRRIIIOHORI == null || !COICOCOHHCCCHOROICCIRRIIIOHORI)) {
               if (COICOCOHHCCCHOROICCIRRIIIOHORI != null) {
                  COICOCOHHCCCHOROICCIRRIIIOHORI = null;
                  return;
               }

               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "OptiFine Fast Render enabled"
               );
               COICOCOHHCCCHOROICCIRRIIIOHORI = true;
               RORICCCOHOOOROOOHRIRRCHORIIIOO = false;
            }

            if (CROCOIRICICICRHCIHHRRRRIIHCOCR
               && ROIHIHHCCIIRHRORHHCRCHIOCRIOCC == null
               && var4.getAntialiasingLevel() == 0
               && ORIOCIHCOOCHRHOIROORHHCIROCIHO != null) {
               ROIHIHHCCIIRHRORHHCRCHIOCRIOCC = ORIOCIHCOOCHRHOIROORHHCIROCIHO;
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "OptiFine Antialiasing restored to level: " + ROIHIHHCCIIRHRORHHCRCHIOCRIOCC
               );
               CROCOIRICICICRHCIHHRRRRIIHCOCR = false;
            }
         }
      }
   }

   private void invalidate() {
      this.CORCOCICIRIOHROHROIIOOHICCHCRR(this.OOOROCOIHIOHCIRIIIOROHOCIIIOHI);
   }

   private void CORCOCICIRIOHROHROIIOOHICCHCRR(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      if (this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR != null) {
         int var2 = var1.bridge$framebufferWidth();
         int var3 = var1.bridge$framebufferHeight();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1.bridge$getColorTexture(true),
               0,
               0,
               var2,
               var3,
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RGBA8,
               this::update
            );
      }
   }

   private void update(ByteBuffer var1) {
      if (this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR != null) {
         byte var2 = 0;

         for (int var3 = var1.remaining(); var2 < var3; var2 += 4) {
            byte var4 = var1.get(var2);
            var1.put(var2, var1.get(var2 + 2));
            var1.put(var2 + 2, var4);
         }

         this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR.update(var1);
         this.HRICCCHOHHIRIIOOCOHHIROOCROROI();
      }
   }

   private void HRICCCHOHHIRIIOOCOHHIROOCROROI() {
      if (!this.HOCHHCCHRHOHOIHCCOHRHHORHROCRR) {
         this.HOCHHCCHRHOHOIHCCOHRHHORHROCRR = true;
         this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR.bind();
         IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC().COIHRHIHIHIIRCCOHOIHHOOIRRCOII().HHIICHIOCCIICOCROHHHOCIRCOHROO(),
               "gameTexture",
               IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
                  .toJson(
                     new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        this.HOOOHHHOCHIICHIIRCIRIIHIICCOOR, true
                     )
                  )
            );
      }
   }

   private boolean OCIORRHHOCIHHOCOIIHRIOHCIROCRI() {
      if (this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR == null && !IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHRROROHOOIOHHCICCHIOIHCRIICHC()) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC().CHOIOICOCCRCOIHIRRHCRCIOHCHRHI(this.HOOOHHHOCHIICHIIRCIRIIHIICCOOR);
         this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR = IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICOIOCHIOHOHCOCOHICOOHIRRIROO()
            .createImageSourceTextured(this.HOOOHHHOCHIICHIIRCIRIIHIICCOOR);
         CRCIRORHOHHICCCIRRCRCHRHHCCCOI.add(this);
      }

      return this.OIIOHCIHICOIHIOOIRHOOHOCRROHIR != null;
   }

   public static void RRICRIHHHCIOOHROCIRCHHHORRIHCI() {
      if (COICOCOHHCCCHOROICCIRRIIIOHORI != null || ROIHIHHCCIIRHRORHHCRCHIOCRIOCC != null) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
         Optional var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR();
         if (var1.isPresent()) {
            boolean var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion()
               .IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                  com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORIIROOCCCIHOHRIRIICCRHOICROOC
               );
            boolean var3 = false;
            boolean var4 = false;
            boolean var5 = false;
            CRRRICCRROCOHHOHIICIHORCOORRRH var6 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1.get())
               .getConfig();
            if (ROIHIHHCCIIRHRORHHCRCHIOCRIOCC != null) {
               int var7 = ROIHIHHCCIIRHRORHHCRCHIOCRIOCC;
               if (var6.hasAntiAliasing() && var7 == 0) {
                  var6.setAntialiasingLevel(0);
                  var3 = true;
                  var4 = true;
               } else if (!var6.hasFastRender() && var7 > 0) {
                  var6.setAntialiasingLevel(var7);
                  var5 = true;
                  var4 = true;
                  var3 = true;
               }

               ROIHIHHCCIIRHRORHHCRCHIOCRIOCC = null;
            }

            if (COICOCOHHCCCHOROICCIRRIIIOHORI != null) {
               if (var6.hasFastRender() && !COICOCOHHCCCHOROICCIRRIIIOHORI) {
                  var6.setFastRender(false);
                  var4 = true;
                  var3 = var3 || var2;
               } else if (!var6.hasFastRender() && COICOCOHHCCCHOROICCIRRIIIOHORI) {
                  var6.setFastRender(true);
                  var5 = true;
                  var4 = true;
                  var3 = var3 || var2;
               }

               COICOCOHHCCCHOROICCIRRIIIOHORI = null;
            }

            if (var5) {
               var0.bridge$getGameRenderer().bridge$stopUseShader();
            }

            if (var4) {
               var6.updateFramebufferSize();
               var0.bridge$recreateLoadingScreen();
            }

            if (var3) {
               var6.updateLevelRenderer();
            }
         }
      }
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      @SerializedName("id")
      private final String CRCCRROICRHHCRCCCCHOCOIOCOCORO;
      @SerializedName("ready")
      private final boolean ready;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, boolean var2) {
         this.CRCCRROICRHHCRCCCCHOCOIOCOCORO = var1;
         this.ready = var2;
      }

      @SerializedName("id")
      public String id() {
         return this.CRCCRROICRHHCRCCCCHOCOIOCOCORO;
      }
   }
}
