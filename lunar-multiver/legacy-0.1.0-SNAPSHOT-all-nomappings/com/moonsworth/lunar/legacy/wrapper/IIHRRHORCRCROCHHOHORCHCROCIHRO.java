package com.moonsworth.lunar.legacy.wrapper;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private GuiMainMenu ORRHIHCORHOHHOIIIOHHCIRCIOOHIR;
   private float OHICCRIIOIHRORRCHROIIHRRCOHICI;

   public void RORCCRIIRHIHIHOOCIRORCCRHOROIO() {
      RenderHelper.enableStandardItemLighting();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      boolean var2
   ) {
      OCOHORHCROHICRRIHCIHHRRCIHICRI var3 = var1.IOOHRICRRRCHOIROCOIORIHCRHIHRH().HHIIOHOORHHCCHRHHRCIORCROORCOI();
      Minecraft var4 = Minecraft.getMinecraft();
      CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var5 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH();
      int var6 = var5 == null ? var4.displayWidth : var5.getScaledWidth();
      int var7 = var5 == null ? var4.displayHeight : var5.getScaledHeight();
      if (this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR == null) {
         this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR = new GuiMainMenu();
         this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR.setWorldAndResolution(var4, var6, var7);
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.OHICCRIIOIHRORRCHROIIHRRCOHICI = var3.HOHIHCIHIHRCOOIOCOHIOHROHHIOHR();
      }

      this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR.width = var6;
      this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR.height = var7;
      var3.HORHCHIRIOIOOCOHOIRIRICICHIORH();
      this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR.renderSkybox(0, 0, var3.HOHIHCIHIHRCOOIOCOHIOHROHHIOHR());
      var3.OIIHIOIORRHHRCRRCCORRHHCHRHORH();
   }

   public void HHHCORCOIIIRCHRRICHCHOHOHIRORO() {
      if (this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR != null) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR.panoramaTimer$v1_12 = this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR.panoramaTimer$v1_12
               + this.OHICCRIIOIHRORRCHROIIHRRCOHICI;
         } else {
            this.ORRHIHCORHOHHOIIIOHHCIRCIOOHIR.panoramaTimer$v1_7++;
         }
      }
   }

   public void HOORHCHOCROIIROICHOORROHCOOCCI() {
      RenderHelper.enableGUIStandardItemLighting();
   }

   public void RIOIHHOROOOHRHCIIHOORROCCICIRI() {
      RenderHelper.disableStandardItemLighting();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      Component var2,
      double var3,
      double var5,
      double var7,
      float var9,
      boolean var10,
      boolean var11,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var12
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRICIOOIOOOHHIOIHOCIORIOHCRCHH();
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var15 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var16 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .COIIIOIIOHICCOCIOROOHIIHHIOIOR();
      var16.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(516, 0.1F);
      RenderManager var17 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? Minecraft.getMinecraft().getRenderManager$v1_8() : RenderManager.instance$v1_7;
      if (var10) {
         var16.HHIHIIOICHCCHIIRRCCRHHHOOCOOCO();
         var16.bridge$translate((float)var3, (float)var5 + var9 + 0.5F, (float)var7);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         var16.CORCOCICIRIOHROHROIIOOHICCHCRR(-var17.playerViewY, 0.0F, 1.0F, 0.0F);
         var16.CORCOCICIRIOHROHROIIOOHICCHCRR(var17.playerViewX, 1.0F, 0.0F, 0.0F);
         var16.bridge$scale(-0.02666667F, -0.02666667F, 0.02666667F);
         var16.bridge$translate(0.0F, 9.374999F, 0.0F);
         var16.HCOOCHIICIIHIHHOHOORCHOIRRIRIO();
         var16.CORCOCICIRIOHROHROIIOOHICCHCRR(false);
         var16.RRIRHIRRCRIIHCCIOORCCIOCICOCHI();
         var16.OICRCOIIRHIOHIOCOCOOIHRCORHOIO();
         var16.IRCIIHHICIHRCOCRROCOICRIHHCCHH(770, 771, 1, 0);
         int var18 = (int)(var1.bridge$getStringWidth(var2) / 2.0F);
         Tessellator var19 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? Tessellator.getInstance$v1_8() : Tessellator.INSTANCE;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            BufferBuilder var20 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var19.getBuffer$v1_12() : var19.getWorldRenderer$v1_8();
            var20.begin$v1_8(7, DefaultVertexFormats.POSITION_COLOR);
            var20.pos$v1_8(-var18 - 1, -1.0, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR()).endVertex$v1_8();
            var20.pos$v1_8(-var18 - 1, 8.0, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR()).endVertex$v1_8();
            var20.pos$v1_8(var18 + 1, 8.0, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR()).endVertex$v1_8();
            var20.pos$v1_8(var18 + 1, -1.0, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR()).endVertex$v1_8();
            var19.draw$v1_8();
         } else {
            var19.startDrawingQuads$v1_7();
            var19.setColorRGBA_F$v1_7(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR());
            var19.addVertex$v1_7(-var18 - 1, -1.0, 0.0);
            var19.addVertex$v1_7(-var18 - 1, 8.0, 0.0);
            var19.addVertex$v1_7(var18 + 1, 8.0, 0.0);
            var19.addVertex$v1_7(var18 + 1, -1.0, 0.0);
            var19.draw$v1_7();
         }

         var16.OIOROIIOROCRCRHROCOHOOIHCIIHOI();
         var16.CORCOCICIRIOHROHROIIOOHICCHCRR(true);
         float var30 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, 0.0F);
         int var21 = 553648127;
         if (var13.isEnabled() && (Boolean)var13.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get()) {
            var1.bridge$drawShadow(var15, var2, var30, 0.0F, var21);
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
               .bridge$translate(0.0F, 0.0F, -0.001F);
         }

         if (var12 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() && var2 instanceof TextComponent var22) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15, var22, var30, 0.0F, var21, false, true);
         } else {
            var1.bridge$drawString(var15, var2, var30, 0.0F, var21, false);
         }

         var16.OOIRIOIHHIOOIHIHHIHROCIHHIRCHI();
         this.OCHIHOOCOHCHCHCIRHCOOCOROHOCII();
         var16.RHRHIHHRHRHRIIRCCOCIHHHOHCIOCH();
         var16.CRICCOOHHHCHOORCICOCOHIHOIRHOO(1.0F, 1.0F, 1.0F, 1.0F);
         var16.HROOORICCCOROOORORCORRHRHORIRC();
      } else {
         float var28 = 1.6F;
         float var14 = 0.016666668F * var28;
         var16.HHIHIIOICHCCHIIRRCCRHHHOOCOOCO();
         var16.bridge$translate((float)var3 + 0.0F, (float)var5 + var9 + 0.5F, (float)var7);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         var16.CORCOCICIRIOHROHROIIOOHICCHCRR(-var17.playerViewY, 0.0F, 1.0F, 0.0F);
         var16.CORCOCICIRIOHROHROIIOOHICCHCRR(var17.playerViewX, 1.0F, 0.0F, 0.0F);
         var16.bridge$scale(-var14, -var14, var14);
         var16.HCOOCHIICIIHIHHOHOORCHOIRRIRIO();
         var16.CORCOCICIRIOHROHROIIOOHICCHCRR(false);
         var16.IOIIROROOICRCHCOHHIIHRCRIOIOOH();
         var16.RRIRHIRRCRIIHCCIOORCCIOCICOCHI();
         var16.IRCIIHHICIHRCOCRROCOICRIHHCCHH(770, 771, 1, 0);
         Tessellator var29 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? Tessellator.getInstance$v1_8() : Tessellator.INSTANCE;
         byte var31 = 0;
         if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.doesComponentEqual(
            var2, "deadmau5"
         )) {
            var31 = -10;
         }

         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var32 = var12
               == null
            ? null
            : (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCCICHCRRIICICCHCIRCRRIIRROHHC()
               .CIIIIHORRORIHCCOOOOCIIRORCIOOH()
               .get(var12.bridge$getUniqueID());
         boolean var33 = false;
         if (var12 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var23) {
            var33 = var2.equals(var23.bridge$getDisplayNameComponent())
               && var11
               && var32 != null
               && (
                  var32.ROHCCIOORRRRCOIOIHOHICHORROOIR()
                     || (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                        .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                        .IHCRIIHRIHIRIHCORRHOCIHORHCOHR()
                        .get()
               );
         }

         int var34 = (int)var1.bridge$getStringWidth(var2);
         int var24 = var34 / 2;
         var16.OICRCOIIRHIOHIOCOCOOIHRCORHOIO();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            BufferBuilder var25 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var29.getBuffer$v1_12() : var29.getWorldRenderer$v1_8();
            var25.begin$v1_8(7, DefaultVertexFormats.POSITION_COLOR);
            var25.pos$v1_8(-var24 - 1 - (var33 ? 6 : 0), -1 + var31, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR()).endVertex$v1_8();
            var25.pos$v1_8(-var24 - 1 - (var33 ? 6 : 0), 8 + var31, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR()).endVertex$v1_8();
            var25.pos$v1_8(var24 + 1 + (var33 ? 6 : 0), 8 + var31, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR()).endVertex$v1_8();
            var25.pos$v1_8(var24 + 1 + (var33 ? 6 : 0), -1 + var31, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR()).endVertex$v1_8();
            var29.draw$v1_8();
         } else {
            var29.startDrawingQuads$v1_7();
            var29.setColorRGBA_F$v1_7(0.0F, 0.0F, 0.0F, var13.OIIOHIHCORHCIOCCCHHHIRROHORIRR());
            var29.addVertex$v1_7(-var24 - 1 - (var33 ? 6 : 0), -1 + var31, 0.0);
            var29.addVertex$v1_7(-var24 - 1 - (var33 ? 6 : 0), 8 + var31, 0.0);
            var29.addVertex$v1_7(var24 + 1 + (var33 ? 6 : 0), 8 + var31, 0.0);
            var29.addVertex$v1_7(var24 + 1 + (var33 ? 6 : 0), -1 + var31, 0.0);
            var29.draw$v1_7();
         }

         var16.OIOROIIOROCRCRHROCOHOOIHCIIHOI();
         int var35 = (-var34 + (var33 ? 12 : 0)) / 2;
         int var26 = 553648127;
         if (var13.isEnabled() && (Boolean)var13.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get()) {
            var1.bridge$drawShadow(var15, var2, var35, 0.0F, var26);
            var16.bridge$translate(0.0F, 0.0F, -0.001F);
         }

         if (var12 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() && var2 instanceof TextComponent var27) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15, var27, var35, var31, var26, false, true);
         } else {
            var1.bridge$drawString(var15, var2, var35, var31, var26, false);
         }

         var16.IHCRHHHRRRRHICCHOROCRHHCRCRHOO();
         var16.CORCOCICIRIOHROHROIIOOHICCHCRR(true);
         if (var33) {
            var16.HHIHIIOICHCCHIIRRCCRHHHOOCOOCO();
            int var36 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO(
               var32.HIIORICOHRICICIHHHHOIOIIRIIRCO(), var32.HCHCICROIICOIOCCOCIHHCHCIOIROR(), var32.CRCHRIRHHRIICORCOHRCCOHRROIRRO(), 1.0F
            );
            com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRIIOCROCRROCCOOHRRRCHHCRRHCRI
                  .get(
                     com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RROCCHRRRCOHCROHIRHRHCOCOHCRRC
                  ),
               var15,
               var35 - 12.0F,
               var31 - 1.5F,
               (float)com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.z,
               0.0F,
               0.0F,
               10.0F,
               10.0F,
               10.0F,
               10.0F,
               var36
            );
            if (var32.HIRROCORCHCHRORRHRIHCIHIHCCHIC()) {
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRIIOCROCRROCCOOHRRRCHHCRRHCRI
                     .get(
                        com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.IIIOCOHOOIRRRROCCHORHHICCIIRIH
                     ),
                  var15,
                  var35 - 12.0F + 7.0F,
                  var31 - 1.5F + 2.0F,
                  (float)com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.z,
                  0.0F,
                  0.0F,
                  4.0F,
                  4.0F,
                  4.0F,
                  4.0F,
                  var32.COHORRCHIRRRCHICOCRHOOCHIRIIRC()
               );
            }

            var16.HROOORICCCOROOORORCORRHRHORIRC();
         }

         if (var13.isEnabled() && (Boolean)var13.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get()) {
            var1.bridge$drawShadow(var15, var2, var35, 0.0F, -1);
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
               .bridge$translate(0.0F, 0.0F, -0.001F);
         }

         if (var12 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() && var2 instanceof TextComponent var37) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15, var37, var35, var31, -1, false, true);
         } else {
            var1.bridge$drawString(var15, var2, var35, var31, -1, false);
         }

         var16.OOIRIOIHHIOOIHIHHIHROCIHHIRCHI();
         this.OCHIHOOCOHCHCHCIRHCOOCOROHOCII();
         var16.RHRHIHHRHRHRIIRCCOCIHHHOHCIOCH();
         var16.HROOORICCCOROOORORCORRHRHORIRC();
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      List<Component> var2,
      double var3,
      double var5,
      double var7,
      float var9,
      boolean var10,
      boolean var11,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var12
   ) {
      int var13 = 0;

      for (Component var15 : var2) {
         var5 += var13 / 3.5F;
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var15, var3, var5, var7, var9, var10, var11, var12);
         var13++;
      }
   }

   public void OCHIHOOCOHCHCHCIRHCOOCOROHOCII() {
      GL11.glEnable(2896);
      GL11.glEnable(16384);
      GL11.glEnable(16385);
      GL11.glEnable(2903);
      GL11.glColorMaterial(1032, 5634);
   }

   public void RCRIOOCOCROIHHOIIRCHORCRHIOCHO() {
      throw new IllegalStateException("Not implemented yet");
   }
}
