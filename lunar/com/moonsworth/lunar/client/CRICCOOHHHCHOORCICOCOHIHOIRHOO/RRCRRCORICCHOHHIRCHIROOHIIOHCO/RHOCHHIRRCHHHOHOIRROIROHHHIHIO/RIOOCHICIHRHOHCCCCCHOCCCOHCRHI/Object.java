package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import lombok.Generated;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final int CRHCRRCHRICRIICCCHOHRRHHRIORCR = 704;
   private final int HIRRIIORHOOCIHORRCCIOIOHCOORII = 544;
   private boolean ICIIOROHCICHHICCOIOIIOHOROCHRC = false;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH IICCRRCHRRCOHCHIHORRRIOHRRCHRO = null;
   private boolean initialized;

   public void init() {
      if (!this.isInitialized()) {
         this.initialized = true;
         this.load();
      }
   }

   public boolean isValid() {
      return this.IICCRRCHRRCOHCHIHORRRIOHRRCHRO != null;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      boolean var2
   ) {
      if (!this.ICIIOROHCICHHICCOIOIIOHOROCHRC && var2) {
         this.IICCRRCHRRCOHCHIHORRRIOHRRCHRO.bridge$setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         this.IICCRRCHRRCOHCHIHORRRIOHRRCHRO.bridge$framebufferClear(true);
      }

      this.ICIIOROHCICHHICCOIOIIOHOROCHRC = var2;
      if (var2) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 1, 0, 2, 0, 10, 1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 11, 0, 15, 0, 10, 1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 0, 1, 0, 2, 1, 16);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 1, 1, 2, 2, 10, 16);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 11, 1, 13, 2, 1, 16);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 12, 1, 15, 2, 10, 16);
      } else {
         var1.bridge$blitToRenderTarget(
            this.IICCRRCHRRCOHCHIHORRRIOHRRCHRO, 0, 0, var1.bridge$framebufferWidth(), var1.bridge$framebufferHeight(), 0, 0, 704, 544, false
         );
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7
   ) {
      int var8 = this.IROCHOHCORHCOCCCOCHORCICRORIIC(var1.bridge$framebufferWidth());
      int var9 = this.RRHHORICORICIRHICOHHROHIIHICCH(var1.bridge$framebufferHeight());
      float var10 = this.RIRHCHOHIHCOIICHHRIIRRCHOHRICC();
      float var11 = this.OOCRORCHHRCHCCCROIIHIHOCHIRRRI();
      var1.bridge$blitToRenderTarget(
         this.IICCRRCHRRCOHCHIHORRRIOHRRCHRO,
         var8 * var2,
         var9 * var3,
         var8 * (var2 + var6),
         var9 * (var3 + var7),
         (int)Math.floor(var10 * var4),
         (int)Math.floor(var11 * ++var5),
         (int)Math.floor(var10 * (var4 + var6)),
         (int)Math.floor(var11 * (var5 + var7)),
         false
      );
   }

   private void load() {
      this.IICCRRCHRRCOHCHIHORRRIOHRRCHRO = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         704, 544, false
      );
   }

   private int IROCHOHCORHCOCCCOCHORCICRORIIC(int var1) {
      return Math.max(1, var1 / 22);
   }

   private int RRHHORICORICIRHICOHHROHIIHICCH(int var1) {
      return Math.max(1, var1 / 17);
   }

   private float RIRHCHOHIHCOIICHHRIIRRCHOHRICC() {
      return 704.0F / 25.0F;
   }

   private float OOCRORCHHRCHCCCROIIHIHOCHIRRRI() {
      return 544.0F / 20.0F;
   }

   @Generated
   public int OIIOOCORHCCCHOCCOHIHRIHIOIIIHI() {
      return 704;
   }

   @Generated
   public int HIIRRIRCOCIHIRHCIICHOIHIICOCOC() {
      return 544;
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH HICROOROOIIHCROHIIRIICOOHROORI() {
      return this.IICCRRCHRRCOHCHIHORRRIOHRRCHRO;
   }

   @Generated
   public boolean isInitialized() {
      return this.initialized;
   }
}
