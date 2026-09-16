package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.apollo.module.serverlink.ServerLinkModule;
import com.lunarclient.gameipc.browser.v1.OpenUrlRequest.Initiator;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiListExtended.IGuiListEntry;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.I18n;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends GuiScreen
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final int ROIICRICRRIHOOHHHHOHCOCROHOOOO = 40;
   private static final int IHRRRRHIIRCRCCIHCIHHHCOCHRHRCR = 30;
   private static final int CIHRHRHCRICHHCOOIROOICCOCHIRHH = 64;
   private static final int RHOHCIHRHHHOICRCHHRRHRCHHROOCR = 10;
   private static final int IRHCIIIHROHHIOCRCROHRRICOOOOIR = 8;
   public ORHIOICIOCRRHOOCOHRORIHICHRCRR IHHCHIROIRICORCHHRROHIIHICIIOC;
   private com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROIHCHCORHHCHICOOOCRHCHRHCCRCO;
   @Nullable
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC OOCROCROOOOOROOCICRCOCOROHCOOO;
   private final Collection<com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ORCHCHCOCRCCHIRCRROIICOCROOHIO;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ORHIOICIOCRRHOOCOHRORIHICHRCRR var1) {
      this.IHHCHIROIRICORCHHRROHIIHICIIOC = var1;
      Optional var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ServerLinkModule.class)
         .map(var0 -> (IHIRRIIORRHORHRORIHOROIRCORCOO)var0);
      if (var2.isPresent()) {
         IHIRRIIORRHORHRORIHOROIRCORCOO var3 = (IHIRRIIORRHORHRORIHOROIRCORCOO)var2.get();
         this.OOCROCROOOOOROOCICRCOCOROHCOOO = var3.getResource();
         this.ORCHCHCOCRCCHIRCRROIICOCROOHIO = var3.CICCCRHCRIOIRCCORORICCICICRCRO();
      } else {
         this.OOCROCROOOOOROOCICRCOCOROHCOOO = null;
         this.ORCHCHCOCRCCHIRCRROIICOCROOHIO = Collections.emptyList();
      }
   }

   public void initGui() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         this.buttonList$v1_7.clear();
      } else {
         this.buttonList$v1_8.clear();
      }

      this.ROIHCHCORHHCHICOOOCRHCHRHCCRCO = new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.mc, this.width, this.height, this.ORCOCCCOOOOCROCIHIRIICOIHCIRHR(), this.height - 30, 25
      );
      ((com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.ROIHCHCORHHCHICOOOCRHCHRHCCRCO)
         .ext$setRenderBackgrounds(false);
      GuiButton var1 = new GuiButton(0, this.width / 2 - 100, this.height - 30 + 5, 200, 20, I18n.format("gui.back", new Object[0]));
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         this.buttonList$v1_7.add(var1);
      } else {
         this.buttonList$v1_8.add(var1);
      }
   }

   public void actionPerformed(GuiButton var1) {
      if (var1.id == 0) {
         this.onClose();
      }
   }

   public void onClose() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(this.IHHCHIROIRICORCHHRROHIIHICIIOC);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      super.drawScreen(var1, var2, var3);
      int var4 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH().getScaledHeight();
      float var5 = (float)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayHeight() / var4;
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var6 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, 0, this.ORCOCCCOOOOCROCIHIRIICOIHCIRHR(), this.width, this.height - 30, var5, var4);
      this.ROIHCHCORHHCHICOOOCRHCHRHCCRCO.drawScreen(var1, var2, var3);
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var6);
      if (this.OOCROCROOOOOROOCICRCOCOROHCOOO == null) {
         String var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.apollo.serverLinks", "title", new Object[0]);
         int var8 = (int)IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$getStringWidth(var7);
         int var9 = (this.width - var8) / 2;
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR()
            .bridge$drawString(OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(), var7, var9, 20.0F, 16777215, false);
      } else {
         this.IHROCRRIRIROCCCRCRRROCRRCRIIHH(this.OOCROCROOOOOROOCICRCOCOROHCOOO);
      }
   }

   private void IHROCRRIRIROCCCRCRRROCRRCRIIHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      int var2 = this.width / 2 - 32;
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$bindTexture(var1);
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

      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      drawModalRectWithCustomSizedTexture(var2, 10, 0.0F, 0.0F, 64, 64, 64.0F, 64.0F);
   }

   private int ORCOCCCOOOOCROCIHIRIICOIHCIRHR() {
      return this.OOCROCROOOOOROOCICRCOCOROHCOOO == null ? 40 : Math.max(40, 82);
   }

   public void handleMouseInput() {
      super.handleMouseInput();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.ROIHCHCORHHCHICOOOCRHCHRHCCRCO.handleMouseInput$v1_8();
      }
   }

   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.ROIHCHCORHHCHICOOOCRHCHRHCCRCO.mouseClicked$v1_8(var1, var2, var3);
      } else {
         this.ROIHCHCORHHCHICOOOCRHCHRHCCRCO.func_148179_a$v1_7(var1, var2, var3);
      }
   }

   public void mouseReleased(int var1, int var2, int var3) {
      super.mouseReleased(var1, var2, var3);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.ROIHCHCORHHCHICOOOCRHCHRHCCRCO.mouseReleased$v1_8(var1, var2, var3);
      } else {
         this.ROIHCHCORHHCHICOOOCRHCHRHCCRCO.func_148181_b$v1_7(var1, var2, var3);
      }
   }

   private final class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements IGuiListEntry {
      private final GuiButton RHCHOHCIOOROOHRICCIOORHOCRCIHC;
      private final com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHICRHRRIIHHCCCOHRIRCOCOHRCIRO;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         GuiButton var2,
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
      ) {
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC = var2;
         this.CHICRHRRIIHHCCCOHRIRCOCOHRCIRO = var3;
      }

      @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
      public void drawEntry$v1_7(int var1, int var2, int var3, int var4, int var5, Tessellator var6, int var7, int var8, boolean var9) {
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.x = var2;
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.y = var3;
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.drawButton$v1_7(Minecraft.getMinecraft(), var7, var8);
      }

      @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
      public void drawEntry$v1_8(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.x = var2;
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.y = var3;
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.drawButton$v1_7(Minecraft.getMinecraft(), var6, var7);
      }

      @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
      public void drawEntry$v1_12(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.x = var2;
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.y = var3;
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.drawButton$v1_12(Minecraft.getMinecraft(), var6, var7, var9);
      }

      public boolean mousePressed(int var1, int var2, int var3, int var4, int var5, int var6) {
         if (this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.mousePressed(Minecraft.getMinecraft(), var2, var3)) {
            this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.playPressSound(Minecraft.getMinecraft().getSoundHandler());
            RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
            URI var8 = this.CHICRHRRIIHHCCCOHRIRCOCOHRCIRO.uri();
            String var9 = var8.toString();
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = var7.bridge$getGameSettings();
            if (!var10.bridge$isChatLinks()) {
               return false;
            }

            if (var10.bridge$isChatPromptLinks()) {
               var7.bridge$displayScreen(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((ORHIOICIOCRRHOOCOHRORIHICHRCRR)RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this, var9, var8, false)
               );
            } else {
               com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var9, Initiator.INITIATOR_UNSPECIFIED);
            }

            return true;
         } else {
            return false;
         }
      }

      public void mouseReleased(int var1, int var2, int var3, int var4, int var5, int var6) {
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.mouseReleased(var2, var3);
      }

      @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
      public void setSelected$v1_8(int var1, int var2, int var3) {
      }

      @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
      public void updatePosition$v1_12(int var1, int var2, int var3, float var4) {
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.x = var2;
         this.RHCHOHCIOOROOHRICCIOORHOCRCIHC.y = var3;
      }
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends GuiListExtended {
      private final List<com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> CICIHIIOHOCHIOCOHIIOIIIHHROIOC = new ArrayList<>();

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Minecraft var2, int var3, int var4, int var5, int var6, int var7) {
         super(var2, var3, var4, var5, var6, var7);
         int var8 = this.getListWidth();
         int var9 = 1;

         for (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.ORCHCHCOCRCCHIRCRROIICOCROOHIO) {
            String var12 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(
               var11.IIRCRORCCCHRHHICHOHOOCIICCCHOR()
            );
            GuiButton var13 = new GuiButton(var9++, 0, 0, var8, 20, var12);
            this.CICIHIIOHOCHIOCOHIIOIIIHHROIOC.add(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var13, var11));
         }
      }

      public IGuiListEntry getListEntry(int var1) {
         return this.CICIHIIOHOCHIOCOHIIOIIIHHROIOC.get(var1);
      }

      public int getSize() {
         return this.CICIHIIOHOCHIOCOHIIOIIIHHROIOC.size();
      }

      public int getListWidth() {
         return Math.min(310, this.width - 20);
      }

      public int getScrollBarX() {
         return this.width / 2 + this.getListWidth() / 2 + 6;
      }
   }
}
