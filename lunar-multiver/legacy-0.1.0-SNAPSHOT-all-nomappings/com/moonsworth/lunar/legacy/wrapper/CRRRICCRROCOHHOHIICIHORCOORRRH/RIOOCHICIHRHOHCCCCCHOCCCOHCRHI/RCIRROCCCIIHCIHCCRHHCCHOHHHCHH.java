package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.TextureMap;
import org.lwjgl.opengl.GL11;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   private static RenderBlocks RCRIRIRRORRRIRRCCCCCRCRRICCHCC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableTexture2D();
         Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
         GlStateManager.enableColorMaterial();
         GlStateManager.enableLighting();
         RenderHelper.enableStandardItemLighting();
         GlStateManager.enableRescaleNormal();
         GlStateManager.enableAlpha();
         GlStateManager.alphaFunc(516, 0.1F);
      } else {
         GL11.glEnable(3553);
         Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.locationItemsTexture$v1_7);
         GL11.glEnable(2903);
         GL11.glEnable(2896);
         RenderHelper.enableStandardItemLighting();
         GL11.glEnable(32826);
         GL11.glEnable(3008);
         GL11.glAlphaFunc(516, 0.1F);
         if (RCRIRIRRORRRIRRCCCCCRCRRICCHCC == null) {
            RCRIRIRRORRRIRRCCCCCRCRRICCHCC = new RenderBlocks();
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3,
      int var4
   ) {
      int var5 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         var4
      );
      int var6 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
         var4
      );
      OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, var5, var6);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.pushMatrix();
         IBlockState var7 = ((Block)var2).getStateFromMeta$v1_8(var3);
         Minecraft.getMinecraft().getBlockRendererDispatcher$v1_8().renderBlockBrightness(var7, 1.0F);
         GlStateManager.popMatrix();
      } else {
         GL11.glPushMatrix();
         RCRIRIRRORRRIRRCCCCCRCRRICCHCC.renderBlockAsItem((Block)var2, var3, 1.0F);
         GL11.glPopMatrix();
      }
   }

   public void HIRRICOIICIHRRICIOCOOOCOCHHORR() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.disableRescaleNormal();
         GlStateManager.disableLighting();
      } else {
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(32826);
         GL11.glDisable(2896);
      }

      OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
   }
}
