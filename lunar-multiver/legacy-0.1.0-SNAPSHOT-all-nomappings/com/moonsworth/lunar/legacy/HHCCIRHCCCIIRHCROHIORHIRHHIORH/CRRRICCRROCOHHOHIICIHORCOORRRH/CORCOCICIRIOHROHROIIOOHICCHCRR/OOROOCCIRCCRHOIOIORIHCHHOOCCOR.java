package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.VertexFormat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(Tessellator.class)
public abstract class OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements RIROICHCRROROHCCROOCCCCOCHCCRI {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Shadow
   public abstract BufferBuilder getWorldRenderer$v1_8();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Shadow
   public abstract BufferBuilder getBuffer$v1_12();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract void draw$v1_8();

   private BufferBuilder impl$getBuffer() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getBuffer$v1_12() : this.getWorldRenderer$v1_8();
   }

   public void bridge$begin(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      this.impl$getBuffer().begin$v1_8(var1.getGLMode(false), (VertexFormat)var2);
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$pos(float var1, float var2, float var3) {
      this.impl$getBuffer().pos$v1_8(var1, var2, var3);
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

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$color(float var1, float var2, float var3, float var4) {
      this.impl$getBuffer().color$v1_8(var1, var2, var3, var4);
      return this;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$uv(float var1, float var2) {
      this.impl$getBuffer().tex$v1_8(var1, var2);
      return this;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$lightmap(int var1) {
      this.impl$getBuffer()
         .lightmap$v1_8(
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1), CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1)
         );
      return this;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$normal(float var1, float var2, float var3) {
      BufferBuilder var4 = this.impl$getBuffer();
      ByteBuffer var5 = var4.byteBuffer$v1_8;
      VertexFormat var6 = var4.getVertexFormat$v1_8();
      int var7 = var6.vertexSize * var4.vertexCount$v1_8 + var6.getOffset(var4.vertexFormatIndex$v1_8);
      var5.put(var7, (byte)((int)(var1 * 127.0F) & 0xFF));
      var5.put(var7 + 1, (byte)((int)(var2 * 127.0F) & 0xFF));
      var5.put(var7 + 2, (byte)((int)(var3 * 127.0F) & 0xFF));
      var4.nextVertexFormatIndex$v1_8();
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

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$endVertex() {
      this.impl$getBuffer().endVertex$v1_8();
      return this;
   }

   public boolean bridge$isDrawing() {
      return this.impl$getBuffer().isDrawing;
   }

   public void bridge$end() {
      this.draw$v1_8();
   }

   public void bridge$setTranslation(double var1, double var3, double var5) {
      this.impl$getBuffer().setTranslation$v1_8(var1, var3, var5);
   }
}
