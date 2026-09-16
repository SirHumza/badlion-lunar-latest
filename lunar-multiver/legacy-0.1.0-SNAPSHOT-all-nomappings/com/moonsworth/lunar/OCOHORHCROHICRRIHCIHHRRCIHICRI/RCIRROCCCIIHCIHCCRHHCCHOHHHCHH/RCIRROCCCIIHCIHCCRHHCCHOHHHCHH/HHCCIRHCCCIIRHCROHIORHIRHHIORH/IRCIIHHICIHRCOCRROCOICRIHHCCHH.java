package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIROICHCRROROHCCROOCCCCOCHCCRI;
import net.minecraft.client.renderer.Tessellator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Tessellator.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements RIROICHCRROROHCCROOCCCCOCHCCRI {
   @Shadow
   public boolean isDrawing;
   private float posX;
   private float posY;
   private float posZ;
   private boolean hasUV = false;
   private float texU;
   private float texV;
   private boolean hasColor = false;
   private float colorR = 1.0F;
   private float colorG = 1.0F;
   private float colorB = 1.0F;
   private float colorA = 1.0F;

   @Shadow
   public abstract void startDrawing(int var1);

   @Shadow
   public abstract int draw();

   @Shadow
   public abstract void addVertex(double var1, double var3, double var5);

   @Shadow
   public abstract void addVertexWithUV(double var1, double var3, double var5, double var7, double var9);

   @Shadow
   public abstract void setColorRGBA_F(float var1, float var2, float var3, float var4);

   @Shadow
   public abstract void setNormal(float var1, float var2, float var3);

   @Shadow
   public abstract void setColorRGBA(int var1, int var2, int var3, int var4);

   @Shadow
   public abstract void setTranslation(double var1, double var3, double var5);

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$pos(float var1, float var2, float var3) {
      this.posX = var1;
      this.posY = var2;
      this.posZ = var3;
      return this;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$pos(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3,
      float var4
   ) {
      throw new RuntimeException("Tessellator pos with matrix's are unsupported in legacy!");
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$normal(float var1, float var2, float var3) {
      this.setNormal(var1, var2, var3);
      return this;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$normal(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      float var2,
      float var3,
      float var4
   ) {
      throw new RuntimeException("Tessellator normal with matrix's are unsupported in legacy!");
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$color(float var1, float var2, float var3, float var4) {
      if (!this.hasColor) {
         throw new IllegalStateException("TessellatorBridge#bridge$color with hasColor = false");
      }

      this.colorR = var1;
      this.colorG = var2;
      this.colorB = var3;
      this.colorA = var4;
      return this;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$uv(float var1, float var2) {
      if (!this.hasUV) {
         throw new IllegalStateException("TessellatorBridge#bridge$uv with hasUV = false");
      }

      this.texU = var1;
      this.texV = var2;
      return this;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$lightmap(int var1) {
      ((Tessellator)this).setBrightness(var1);
      return this;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$endVertex() {
      if (this.hasColor) {
         this.setColorRGBA_F(this.colorR, this.colorG, this.colorB, this.colorA);
      }

      if (this.hasUV) {
         this.addVertexWithUV(this.posX, this.posY, this.posZ, this.texU, this.texV);
      } else {
         this.addVertex(this.posX, this.posY, this.posZ);
      }

      this.posX = this.posY = this.posZ = 0.0F;
      this.colorR = this.colorG = this.colorB = this.colorA = 1.0F;
      this.texU = this.texV = 0.0F;
      return this;
   }

   public void bridge$end() {
      this.draw();
   }

   public boolean bridge$isDrawing() {
      return this.isDrawing;
   }

   public void bridge$begin(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      if (var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
         )
       {
         this.startDrawing(var1.getGLMode(false));
         this.hasUV = var3.HHCHOCHCOICCORICHRIOCRRHIHCICO();
         this.hasColor = var3.CIHHIRCIRROCHROHOIHROOCRHRHOOI();
      } else {
         throw new RuntimeException("Illegal VertexFormatBridge used in 1.7 - " + var2.getClass().getSimpleName());
      }
   }

   public void bridge$setTranslation(double var1, double var3, double var5) {
      this.setTranslation(var1, var3, var5);
   }

   @Overwrite
   public void setColorOpaque(int var1, int var2, int var3) {
      this.setColorRGBA(
         var1,
         var2,
         var3,
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null
               && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().HRCRHCHRCCRIOHCCCOCRCICORHRRCI() != null
               && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
                  .RCIICCOHIRICHCOCIIRCHOCOCRRRCR()
                  .CIHCOICOIROIIOHIRHIRHRCHCHOCOR()
               && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
                  .RCIICCOHIRICHCOCIIRCHOCOCRRRCR()
                  .isEnabled()
            ? (Integer)com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
               .RCIICCOHIRICHCOCIIRCHOCOCRRRCR()
               .ORRRICIRRHCIOCCRRROOHHRRCCCIHR()
               .get()
            : 255
      );
   }
}
