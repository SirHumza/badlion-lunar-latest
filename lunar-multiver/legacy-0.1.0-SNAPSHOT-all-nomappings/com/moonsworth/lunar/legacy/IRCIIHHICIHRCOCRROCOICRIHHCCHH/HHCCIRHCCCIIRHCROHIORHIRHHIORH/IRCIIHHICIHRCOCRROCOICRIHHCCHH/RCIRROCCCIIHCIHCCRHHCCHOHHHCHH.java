package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

@IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 5)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends GuiButton {
   private static final int RHOHRRIOHRIOOHOCIRRCCHIHOOCRRC = 20;
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC CCIRHHROOCORCCOCOHIIRHCORIIRCC = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "minecraft", "textures/gui/checkbox.png"
   );
   private boolean selected;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, int var3, String var4, boolean var5) {
      super(var1, var2, var3, 0, 0, var4);
      this.selected = var5;
      this.width = 24 + (int)IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$getStringWidth(var4);
      this.height = 20;
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   public void drawButton$v1_7(Minecraft var1, int var2, int var3) {
      if (this.visible) {
         this.hovered = var2 >= this.x && var3 >= this.y && var2 < this.x + 20 && var3 < this.y + 20;
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$bindTexture(CCIRHHROOCORCCOCOHIIRHCORIIRCC);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            GlStateManager.blendFunc(770, 771);
         } else {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
         }

         int var4 = this.hovered ? 20 : 0;
         int var5 = this.selected ? 20 : 0;
         drawModalRectWithCustomSizedTexture(this.x, this.y, var4, var5, 20, 20, 64.0F, 64.0F);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR()
            .bridge$drawString(
               OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
               this.displayString,
               this.x + 20 + 4,
               this.y + (this.height - 8) / 2,
               14737632,
               false
            );
      }
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public void drawButton$v1_12(Minecraft var1, int var2, int var3, float var4) {
      if (this.visible) {
         this.hovered = var2 >= this.x && var3 >= this.y && var2 < this.x + 20 && var3 < this.y + 20;
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$bindTexture(CCIRHHROOCORCCOCOHIIRHCORIIRCC);
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.enableBlend();
         GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
         GlStateManager.blendFunc(770, 771);
         int var5 = this.hovered ? 20 : 0;
         int var6 = this.selected ? 20 : 0;
         drawModalRectWithCustomSizedTexture(this.x, this.y, var5, var6, 20, 20, 64.0F, 64.0F);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR()
            .bridge$drawString(
               OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
               this.displayString,
               this.x + 20 + 4,
               this.y + (this.height - 8) / 2,
               14737632,
               false
            );
      }
   }

   public boolean mousePressed(Minecraft var1, int var2, int var3) {
      boolean var4 = var2 >= this.x && var3 >= this.y && var2 < this.x + 20 && var3 < this.y + 20;
      if (this.enabled && this.visible && var4) {
         this.selected = !this.selected;
         return false;
      } else {
         return false;
      }
   }

   @Generated
   public boolean isSelected() {
      return this.selected;
   }
}
