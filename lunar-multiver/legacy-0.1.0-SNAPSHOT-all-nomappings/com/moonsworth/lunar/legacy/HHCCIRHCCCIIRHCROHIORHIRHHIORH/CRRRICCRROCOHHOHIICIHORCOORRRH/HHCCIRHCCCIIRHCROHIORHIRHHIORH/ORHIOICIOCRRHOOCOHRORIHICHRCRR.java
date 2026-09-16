package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.gui.GuiResourcePackList;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GuiResourcePackList.class)
public abstract class ORHIOICIOCRRHOOCOHRORIHICHRCRR
   extends GuiListExtended
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IOIICIRIICICIIOORHCIIIIRRIHRHI {
   @Mutable
   @Final
   @Shadow
   public List field_148204_l$v1_7;
   @Mutable
   @Final
   @Shadow
   public List<ResourcePackListEntry> resourcePackEntries$v1_8;

   public ORHIOICIOCRRHOOCOHRORIHICHRCRR(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void setUnderlyingList(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR> var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.resourcePackEntries$v1_8 = var1;
      } else {
         this.field_148204_l$v1_7 = var1;
      }
   }

   public void overlayBackground(int var1, int var2, int var3, int var4) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() == null
         || !(Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .RCCHCHHRRIIRIOOHHIRIHHICOCRHRR()
            .get()) {
         super.overlayBackground(var1, var2, var3, var4);
      }
   }

   public void drawScreen(int var1, int var2, float var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 || this.visible$v1_8) {
         if (!Mouse.isButtonDown(0)) {
            this.setEnabled(true);
         }

         this.mouseX = var1;
         this.mouseY = var2;
         this.drawBackground();
         int var4 = this.getScrollBarX();
         int var5 = var4 + 6;
         int var10 = this.getSize();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 && var1 > this.left && var1 < this.right && var2 > this.top && var2 < this.bottom) {
            if (!Mouse.isButtonDown(0) || !this.getEnabled()) {
               for (; !this.mc.gameSettings.touchscreen && Mouse.next(); this.mc.currentScreen.handleMouseInput()) {
                  int var18 = Mouse.getEventDWheel();
                  if (var18 != 0) {
                     if (var18 > 0) {
                        var18 = -1;
                     } else if (var18 < 0) {
                        var18 = 1;
                     }

                     this.amountScrolled = this.amountScrolled + var18 * this.slotHeight / 2;
                  }
               }

               this.initialClickY$v1_7 = -1.0F;
            } else if (this.initialClickY$v1_7 == -1.0F) {
               boolean var11 = true;
               if (var2 >= this.top && var2 <= this.bottom) {
                  int var12 = this.width / 2 - this.getListWidth() / 2;
                  int var6 = this.width / 2 + this.getListWidth() / 2;
                  int var7 = var2 - this.top - this.headerPadding + (int)this.amountScrolled - 4;
                  int var13 = var7 / this.slotHeight;
                  if (var1 >= var12 && var1 <= var6 && var13 >= 0 && var7 >= 0 && var13 < var10) {
                     boolean var14 = var13 == this.selectedElement && Minecraft.getSystemTime() - this.lastClicked < 250L;
                     this.elementClicked(var13, var14, var1, var2);
                     this.selectedElement = var13;
                     this.lastClicked = Minecraft.getSystemTime();
                  } else if (var1 >= var12 && var1 <= var6 && var7 < 0) {
                     this.func_148132_a$v1_7(var1 - var12, var2 - this.top + (int)this.amountScrolled - 4);
                     var11 = false;
                  }

                  if (var1 >= var4 && var1 <= var5) {
                     this.scrollMultiplier = -1.0F;
                     int var9 = this.func_148135_f$v1_7();
                     if (var9 < 1) {
                        var9 = 1;
                     }

                     int var8 = (int)((float)((this.bottom - this.top) * (this.bottom - this.top)) / this.getContentHeight());
                     if (var8 < 32) {
                        var8 = 32;
                     }

                     if (var8 > this.bottom - this.top - 8) {
                        var8 = this.bottom - this.top - 8;
                     }

                     this.scrollMultiplier = this.scrollMultiplier / ((float)(this.bottom - this.top - var8) / var9);
                  } else {
                     this.scrollMultiplier = 1.0F;
                  }

                  if (var11) {
                     this.initialClickY$v1_7 = var2;
                  } else {
                     this.initialClickY$v1_7 = -2.0F;
                  }
               } else {
                  this.initialClickY$v1_7 = -2.0F;
               }
            } else if (this.initialClickY$v1_7 >= 0.0F) {
               this.amountScrolled = this.amountScrolled - (var2 - this.initialClickY$v1_7) * this.scrollMultiplier;
               this.initialClickY$v1_7 = var2;
            }
         }

         this.bindAmountScrolled();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            GlStateManager.disableLighting();
            GlStateManager.disableFog();
         } else {
            GL11.glDisable(2896);
            GL11.glDisable(2912);
         }

         Tessellator var19 = Tessellator.INSTANCE;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() == null
            || !(Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
               .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
               .RCCHCHHRRIIRIOOHHIRIHHICOCRHRR()
               .get()) {
            this.mc.getTextureManager().bindTexture(Gui.OPTIONS_BACKGROUND);
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            } else {
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }

            float var20 = 32.0F;
            com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
               this.left,
               this.top,
               this.right - this.left,
               this.bottom - this.top,
               -1879048192
            );
         }

         int var21 = this.left + this.width / 2 - this.getListWidth() / 2 + 2;
         int var22 = this.top + 4 - (int)this.amountScrolled;
         if (this.hasListHeader) {
            this.drawListHeader(var21, var22, var19);
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.drawSelectionBox$v1_12(var21, var22, var1, var2, var3);
         } else {
            this.drawSelectionBox$v1_7(var21, var22, var1, var2);
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            GlStateManager.disableDepth();
         } else {
            GL11.glDisable(2929);
         }

         this.overlayBackground(0, this.top, 255, 255);
         this.overlayBackground(this.bottom, this.height, 255, 255);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
            GlStateManager.disableAlpha();
            GlStateManager.shadeModel(7425);
            GlStateManager.disableTexture2D();
         } else {
            GL11.glEnable(3042);
            OpenGlHelper.glBlendFunc(770, 771, 0, 1);
            GL11.glDisable(3008);
            GL11.glShadeModel(7425);
            GL11.glDisable(3553);
         }

         int var23 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getMaxScroll$v1_12() : this.func_148135_f$v1_7();
         if (var23 > 0) {
            int var15 = (this.bottom - this.top) * (this.bottom - this.top) / this.getContentHeight();
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               var15 = MathHelper.clamp$v1_12(var15, 32, this.bottom - this.top - 8);
            } else {
               if (var15 < 32) {
                  var15 = 32;
               }

               if (var15 > this.bottom - this.top - 8) {
                  var15 = this.bottom - this.top - 8;
               }
            }

            int var16 = (int)this.amountScrolled * (this.bottom - this.top - var15) / var23 + this.top;
            if (var16 < this.top) {
               var16 = this.top;
            }

            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               BufferBuilder var17 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var19.getBuffer$v1_12() : var19.getWorldRenderer$v1_8();
               var17.begin$v1_8(7, DefaultVertexFormats.POSITION_TEX_COLOR);
               var17.pos$v1_8(var4, this.bottom, 0.0).tex$v1_8(0.0, 1.0).color$v1_8(0, 0, 0, 255).endVertex$v1_8();
               var17.pos$v1_8(var5, this.bottom, 0.0).tex$v1_8(1.0, 1.0).color$v1_8(0, 0, 0, 255).endVertex$v1_8();
               var17.pos$v1_8(var5, this.top, 0.0).tex$v1_8(1.0, 0.0).color$v1_8(0, 0, 0, 255).endVertex$v1_8();
               var17.pos$v1_8(var4, this.top, 0.0).tex$v1_8(0.0, 0.0).color$v1_8(0, 0, 0, 255).endVertex$v1_8();
               var19.draw$v1_8();
               var17.begin$v1_8(7, DefaultVertexFormats.POSITION_TEX_COLOR);
               var17.pos$v1_8(var4, var16 + var15, 0.0).tex$v1_8(0.0, 1.0).color$v1_8(128, 128, 128, 255).endVertex$v1_8();
               var17.pos$v1_8(var5, var16 + var15, 0.0).tex$v1_8(1.0, 1.0).color$v1_8(128, 128, 128, 255).endVertex$v1_8();
               var17.pos$v1_8(var5, var16, 0.0).tex$v1_8(1.0, 0.0).color$v1_8(128, 128, 128, 255).endVertex$v1_8();
               var17.pos$v1_8(var4, var16, 0.0).tex$v1_8(0.0, 0.0).color$v1_8(128, 128, 128, 255).endVertex$v1_8();
               var19.draw$v1_8();
               var17.begin$v1_8(7, DefaultVertexFormats.POSITION_TEX_COLOR);
               var17.pos$v1_8(var4, var16 + var15 - 1, 0.0).tex$v1_8(0.0, 1.0).color$v1_8(192, 192, 192, 255).endVertex$v1_8();
               var17.pos$v1_8(var5 - 1, var16 + var15 - 1, 0.0).tex$v1_8(1.0, 1.0).color$v1_8(192, 192, 192, 255).endVertex$v1_8();
               var17.pos$v1_8(var5 - 1, var16, 0.0).tex$v1_8(1.0, 0.0).color$v1_8(192, 192, 192, 255).endVertex$v1_8();
               var17.pos$v1_8(var4, var16, 0.0).tex$v1_8(0.0, 0.0).color$v1_8(192, 192, 192, 255).endVertex$v1_8();
               var19.draw$v1_8();
            } else {
               var19.startDrawingQuads$v1_7();
               var19.setColorRGBA_I$v1_7(0, 255);
               var19.addVertexWithUV$v1_7(var4, this.bottom, 0.0, 0.0, 1.0);
               var19.addVertexWithUV$v1_7(var5, this.bottom, 0.0, 1.0, 1.0);
               var19.addVertexWithUV$v1_7(var5, this.top, 0.0, 1.0, 0.0);
               var19.addVertexWithUV$v1_7(var4, this.top, 0.0, 0.0, 0.0);
               var19.draw$v1_7();
               var19.startDrawingQuads$v1_7();
               var19.setColorRGBA_I$v1_7(8421504, 255);
               var19.addVertexWithUV$v1_7(var4, var16 + var15, 0.0, 0.0, 1.0);
               var19.addVertexWithUV$v1_7(var5, var16 + var15, 0.0, 1.0, 1.0);
               var19.addVertexWithUV$v1_7(var5, var16, 0.0, 1.0, 0.0);
               var19.addVertexWithUV$v1_7(var4, var16, 0.0, 0.0, 0.0);
               var19.draw$v1_7();
               var19.startDrawingQuads$v1_7();
               var19.setColorRGBA_I$v1_7(12632256, 255);
               var19.addVertexWithUV$v1_7(var4, var16 + var15 - 1, 0.0, 0.0, 1.0);
               var19.addVertexWithUV$v1_7(var5 - 1, var16 + var15 - 1, 0.0, 1.0, 1.0);
               var19.addVertexWithUV$v1_7(var5 - 1, var16, 0.0, 1.0, 0.0);
               var19.addVertexWithUV$v1_7(var4, var16, 0.0, 0.0, 0.0);
               var19.draw$v1_7();
            }
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.renderDecorations$v1_12(var1, var2);
         } else {
            this.func_148142_b$v1_7(var1, var2);
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            GlStateManager.enableTexture2D();
            GlStateManager.shadeModel(7424);
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
         } else {
            GL11.glEnable(3553);
            GL11.glShadeModel(7424);
            GL11.glEnable(3008);
            GL11.glDisable(3042);
         }
      }
   }
}
