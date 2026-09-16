package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.lunarclient.apollo.module.entity.EntityModule;
import com.lunarclient.apollo.module.nametag.NametagModule;
import com.lunarclient.apollo.module.serverrule.ServerRuleModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer_v1_8;
import net.minecraft.client.renderer.entity.Render_v1_8;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.Team.EnumVisible;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(RenderLivingBase.class)
public abstract class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<T extends EntityLivingBase & com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR, S extends com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI>
   extends Render_v1_8<T>
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<T, S> {
   @Shadow
   public List<LayerRenderer<T>> layerRenderers;
   @Unique
   private LayerRenderer<?> bridge$layerCape;

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(RenderManager var1) {
      super(var1);
   }

   @Shadow
   public abstract <V extends EntityLivingBase, U extends LayerRenderer<V>> boolean addLayer(U var1);

   @Shadow
   public abstract boolean canRenderName(T var1);

   @WrapMethod(method = "renderName")
   private void lunar$renderName(T var1, double var2, double var4, double var6, Operation<Void> var8) {
      if (var1.getName$v1_8() != null) {
         LinkedList var9 = new LinkedList();
         var9.add(
            0,
            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR)var1)
               .bridge$getDisplayNameComponent()
         );
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var10 = (IRCRRHRCIRHIHIHROHCRRHIIHHHHCH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.class,
               () -> new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1,
                  var2,
                  var4,
                  var6,
                  var9,
                  (Component)var9.get(0)
               )
            );
         if ((var10 == null || !var10.isCancelled()) && (this.canRenderName((T)var1) || this.lunar$canShowInThirdPerson((T)var1))) {
            int var11 = 0;

            for (Component var13 : var10 == null ? var9 : var10.getLines()) {
               if (var13 instanceof TextComponent var14) {
                  double var15 = var10 == null ? var4 : var10.getY() + var11 / 3.5F + var1.height + 0.5;
                  var15 -= var1.isChild() ? var1.height / 2.0F : 0.0;
                  boolean var17 = false;
                  String var18;
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                     var18 = var1.getName$v1_8();
                  } else {
                     var18 = var1.getCommandSenderName$v1_7();
                  }

                  if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getFirstTextComponent(
                        ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR)var1)
                           .bridge$getDisplayNameComponent()
                     )
                     != null) {
                     var17 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.doesComponentContain(
                        var14, new String[]{var18}
                     );
                  }

                  if (var1.isSneaking()) {
                     this.impl$renderLabelSneaking(var1, var14, var2, var15 - 0.25, var6, var17);
                  } else {
                     AtomicInteger var19 = new AtomicInteger(var1.isSneaking() ? 32 : 64);
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
                        .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ServerRuleModule.class)
                        .filter(var0 -> (Boolean)var0.getOptions().get(ServerRuleModule.OVERRIDE_NAMETAG_RENDER_DISTANCE))
                        .map(var0 -> ((IOIICIRIICICIIOORHCIIIIRRIHRHI)var0).HRHCHIHCCIIOIIOCRCHCIHCICCCCIR())
                        .ifPresent(var2x -> var19.set(var1.isSneaking() ? var2x / 2 : var2x));
                     double var20 = var10 == null
                        ? this.impl$renderLivingLabel((T)var1, var14, var2, var15, var4, var19.get(), var17)
                        : this.impl$renderLivingLabel((T)var1, var14, var10.getX(), var15, var10.getZ(), var19.get(), var17);
                     if (var20 != var15) {
                        var11++;
                     }
                  }

                  var11++;
               }
            }
         }
      }
   }

   @Unique
   private boolean lunar$canShowInThirdPerson(T var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRICIOOIOOOHHIOIHOCIORIOHCRCHH()
         .IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "getSwingProgress", at = @At("HEAD"), cancellable = true)
   private void impl$getSwingProgress(EntityLivingBase var1, float var2, CallbackInfoReturnable<Float> var3) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIOHIORIROHRRCOOOHCROHORCOIIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .ICORHOCRRIRHRIOHCCHIIOHHICCCCC();
      if (var1 == Minecraft.getMinecraft().player$v1_8 && var4.HROCHCHIRRCORHRIIOIIIIORICHIIR().isEnabled()) {
         float var5 = var1.getSwingProgress(var2);
         var3.setReturnValue(var4.HROCHCHIRRCORHRIIOIIIIORICHIIR().RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var5, var2));
      }
   }

   private void impl$setupLabelTransform(double var1, double var3, double var5) {
      float var7 = 0.02666667F;
      GlStateManager.translate(var1, var3, var5);
      if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIIOORORHHCCHICIRRROIHICRCOOCR
         )
       {
         GlStateManager.rotate(
            -com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.playerViewY,
            0.0F,
            1.0F,
            0.0F
         );
         GlStateManager.rotate(
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.playerViewX,
            1.0F,
            0.0F,
            0.0F
         );
      } else {
         GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
         GlStateManager.rotate(this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
      }

      GlStateManager.scale(-0.02666667F, -0.02666667F, 0.02666667F);
   }

   @Unique
   private void impl$renderLabelSneaking(Entity var1, TextComponent var2, double var3, double var5, double var7, boolean var9) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRICIOOIOOOHHIOIHOCIORIOHCRCHH();
      float var11 = var10.OIIOHIHCORHCIOCCCHHHIRROHORIRR();
      FontRenderer var12 = this.getFontRendererFromRenderManager();
      GlStateManager.pushMatrix();
      this.impl$setupLabelTransform(var3, var5, var7);
      GlStateManager.disableLighting();
      GlStateManager.depthMask(false);
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      int var13 = (int)com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWidth(
            var2,
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var12
         )
         / 2;
      int var14 = -(var13 + 1);
      int var15 = var13 + 1;
      float var16 = 0.0F;
      Tessellator var17 = Tessellator.getInstance$v1_8();
      BufferBuilder var18;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var18 = var17.getBuffer$v1_12();
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var18 = var17.getWorldRenderer$v1_8();
      } else {
         var18 = null;
      }

      GlStateManager.disableTexture2D();
      var18.begin$v1_8(7, DefaultVertexFormats.POSITION_COLOR);
      var18.pos$v1_8(var14, -1.0F + var16, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var11).endVertex$v1_8();
      var18.pos$v1_8(var14, 8.0F + var16, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var11).endVertex$v1_8();
      var18.pos$v1_8(var15, 8.0F + var16, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var11).endVertex$v1_8();
      var18.pos$v1_8(var15, -1.0F + var16, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var11).endVertex$v1_8();
      var17.draw$v1_8();
      GlStateManager.enableTexture2D();
      GlStateManager.depthMask(true);
      int var19 = 553648127;
      if (var10.isEnabled() && (Boolean)var10.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get()) {
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var12)
            .bridge$drawShadow(OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(), var2, var14 + 1, var16, var19);
         GlStateManager.translate(0.0F, 0.0F, -0.001F);
      }

      ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var12)
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(), var2, var14 + 1, var16, var19, false, true);
      GlStateManager.enableLighting();
      GlStateManager.disableBlend();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.popMatrix();
   }

   @Unique
   public double impl$renderLivingLabel(T var1, TextComponent var2, double var3, double var5, double var7, int var9, boolean var10) {
      Object var11;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var11 = this.renderManager.renderViewEntity$v1_8;
      } else {
         var11 = this.renderManager.livingPlayer$v1_7;
      }

      double var12 = 0.0;
      if (var11 != null && !(var1 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO)) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            var12 = var1.getDistanceSq$v1_12((Entity)var11);
         } else {
            var12 = var1.getDistanceSqToEntity$v1_7((Entity)var11);
         }

         if (var12 > var9 * var9) {
            return var5;
         }
      }

      if (var1 instanceof AbstractClientPlayer && var10 && var12 < 100.0) {
         Scoreboard var14 = ((AbstractClientPlayer)var1).getWorldScoreboard();
         ScoreObjective var15 = var14.getObjectiveInDisplaySlot(2);
         if (var15 != null) {
            Score var16;
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               var16 = var14.getOrCreateScore$v1_12(var1.getName$v1_8(), var15);
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               var16 = var14.getValueFromObjective$v1_7(var1.getName$v1_8(), var15);
            } else {
               var16 = var14.getValueFromObjective$v1_7(var1.getCommandSenderName$v1_7(), var15);
            }

            this.impl$drawLabel((T)var1, Component.text(var16.getScorePoints() + " " + var15.getDisplayName()), var3, var5, var7, false);
            var5 += this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15F * 0.02666667F;
         }
      }

      return this.impl$drawLabel((T)var1, var2, var3, var5, var7, var10);
   }

   public double impl$drawLabel(T var1, TextComponent var2, double var3, double var5, double var7, boolean var9) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCICHRRIHOHCCHRORHIIOCHCROHRIC().IHRHIIOIRCORCOIIHICHIRHOOHROIC() instanceof com.moonsworth.lunar.legacy.wrapper.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var10
         && var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2,
            var3,
            var5,
            var7,
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1,
            var9
         )) {
         return var5;
      } else {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var26 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RRICIOOIOOOHHIOIHOCIORIOHCRCHH();
         float var27 = var26.OIIOHIHCORHCIOCCCHHHIRROHORIRR();
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var12 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
         FontRenderer var13 = Minecraft.getMinecraft().fontRenderer;
         GlStateManager.pushMatrix();
         this.impl$setupLabelTransform(var3, var5, var7);
         GlStateManager.disableLighting();
         GlStateManager.depthMask(false);
         GlStateManager.disableDepth();
         GlStateManager.enableBlend();
         GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
         Tessellator var14 = Tessellator.INSTANCE;
         BufferBuilder var15;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            var15 = var14.getBuffer$v1_12();
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            var15 = var14.getWorldRenderer$v1_8();
         } else {
            var15 = null;
         }

         float var16 = 0.0F;
         if (var2.content().equals("deadmau5")) {
            var16 = -10.0F;
         }

         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 = (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HCCICHCRRIICICCHCIRCRRIIRROHHC()
            .CIIIIHORRORIHCCOOOOCIIRORCIOOH()
            .get(var1.getUniqueID());
         boolean var18 = var1 instanceof EntityPlayer
            && var9
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCCICHCRRIICICCHCIRCRRIIRROHHC()
               .CIIIIHORRORIHCCOOOOCIIRORCIOOH()
               .containsKey(var1.getUniqueID());
         boolean var19 = var18
            && var17 != null
            && (
               var17.ROHCCIOORRRRCOIOIHOHICHORROOIR()
                  || (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                     .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                     .IHCRIIHRIHIRIHCORRHOCIHORHCOHR()
                     .get()
            );
         boolean var20 = var18
            && var17 != null
            && var17.RROOHCOHROIIROCRCRICHOHHCCOOCR() != null
            && (
               var17.ROHCCIOORRRRCOIOIHOHICHORROOIR()
                  || (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                     .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                     .ICCIOIOHCRHRCOOOIICCIOHRICCHOC()
                     .get()
            );
         int var21 = (int)com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWidth(
               var2,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var13
            )
            / 2;
         if (var20) {
            var21 += 5;
         }

         if (var19) {
            var21 += 6;
         }

         int var22 = -(var21 + 1);
         int var23 = var21 + 1;
         int var24 = -var21 + (var19 ? 12 : 0);
         GlStateManager.disableTexture2D();
         var15.begin$v1_8(7, DefaultVertexFormats.POSITION_COLOR);
         var15.pos$v1_8(var22, -1.0F + var16, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var27).endVertex$v1_8();
         var15.pos$v1_8(var22, 8.0F + var16, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var27).endVertex$v1_8();
         var15.pos$v1_8(var23, 8.0F + var16, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var27).endVertex$v1_8();
         var15.pos$v1_8(var23, -1.0F + var16, 0.0).color$v1_8(0.0F, 0.0F, 0.0F, var27).endVertex$v1_8();
         var14.draw$v1_8();
         GlStateManager.enableTexture2D();
         int var25 = 553648127;
         if (var26.isEnabled() && (Boolean)var26.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get()) {
            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var13)
               .bridge$drawShadow(var12, var2, var24, var16, var25);
            GlStateManager.translate(0.0F, 0.0F, -0.001F);
         }

         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var13)
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var2, var24, var16, var25, false, true);
         this.lunar$renderNametagAdditions(
            var12,
            var19,
            var20,
            var17,
            var16,
            var23,
            var22,
            0.15F,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OROCRHCRIIOROIRROOCCOOICIHOROH
         );
         GlStateManager.enableDepth();
         GlStateManager.depthMask(true);
         this.lunar$renderNametagAdditions(
            var12,
            var19,
            var20,
            var17,
            var16,
            var23,
            var22,
            1.0F,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRIIOCROCRROCCOOHRRRCHHCRRHCRI
         );
         if (var26.isEnabled() && (Boolean)var26.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get()) {
            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var13)
               .bridge$drawShadow(var12, var2, var24, var16, -1);
            GlStateManager.translate(0.0F, 0.0F, -0.001F);
         }

         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var13)
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var2, var24, var16, -1, false, true);
         GlStateManager.enableLighting();
         GlStateManager.disableBlend();
         GlStateManager.popMatrix();
         return var5;
      }
   }

   @Unique
   private void lunar$renderNametagAdditions(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      boolean var2,
      boolean var3,
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4,
      float var5,
      float var6,
      float var7,
      float var8,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var9
   ) {
      if (var2) {
         var1.push();
         int var10 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO(
            var4.HIIORICOHRICICIHHHHOIOIIRIIRCO(), var4.HCHCICROIICOIOCCOCIHHCHCIOIROR(), var4.CRCHRIRHHRIICORCOHRCCOHRROIRRO(), var8
         );
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var9.get(
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RROCCHRRRCOHCROHIRHRHCOCOHCRRC
            ),
            var1,
            var7 + 1.0F,
            var5 - 1.5F,
            (float)com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.z,
            0.0F,
            0.0F,
            10.0F,
            10.0F,
            10.0F,
            10.0F,
            var10
         );
         if (var4.HIRROCORCHCHRORRHRIHCIHIHCCHIC()) {
            GlStateManager.translate(0.0F, 0.0F, -1.0F);
            com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var9.get(
                  com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.IIIOCOHOOIRRRROCCHORHHICCIIRIH
               ),
               var1,
               var7 + 1.0F + 7.25F,
               var5 - 1.5F + 1.5F,
               (float)com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.z,
               0.0F,
               0.0F,
               3.0F,
               3.0F,
               3.0F,
               3.0F,
               com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4.COHORRCHIRRRCHICOCRHOOCHIRIIRC(), var8)
            );
         }

         var1.pop();
      }

      if (var3) {
         int var11 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(-1, var8);
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1, var4.RROOHCOHROIIROCRCRICHOHHCCOOCR(), var6 - 10.0F, var5 - 0.5F, 8.0F, 8.0F, var11, var9
         );
      }
   }

   @Inject(method = "canRenderName", at = @At("HEAD"), cancellable = true)
   private void bridge$onShouldShowName(T var1, CallbackInfoReturnable<Boolean> var2) {
      if (var1 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO var3) {
         var2.setReturnValue(var3.shouldRenderNametag());
      } else {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            if (Minecraft.getMinecraft().player$v1_8 == null) {
               var2.setReturnValue(false);
            }
         } else if (Minecraft.getMinecraft().thePlayer$v1_7 == null) {
            var2.setReturnValue(false);
         }
      }
   }

   @Inject(method = "canRenderName", at = @At("HEAD"), cancellable = true)
   private void apollo$hiddenNametagOverride(T var1, CallbackInfoReturnable<Boolean> var2) {
      if (!(var1 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO)) {
         if (var1 != IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RRICIOOIOOOHHIOIHOCIORIOHCRCHH().isEnabled()) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
                  .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(NametagModule.class)
                  .ifPresent(
                     var2x -> {
                        IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var2x;
                        if (var3.OHHRIOHROOIHOROCIRHCHORIHRRRRI(
                           ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1)
                              .bridge$getUniqueID()
                        )) {
                           var2.setReturnValue(false);
                        }
                     }
                  );
            }
         }
      }
   }

   @WrapOperation(
      method = "canRenderName",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/scoreboard/Team;getNameTagVisibility$v1_8()Lnet/minecraft/scoreboard/Team$EnumVisible;")
   )
   private EnumVisible apollo$shownNametagOverride(Team var1, Operation<EnumVisible> var2, @Local(argsOnly = true) EntityLivingBase var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RRICIOOIOOOHHIOIHOCIORIOHCRCHH().isEnabled()) {
         UUID var4 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var3)
            .bridge$getUniqueID();
         boolean var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(NametagModule.class)
            .map(var1x -> ((IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1x).IIRHCHHOICHRICOOCRORCCIOOIHOIR(var4))
            .orElse(false);
         if (var5) {
            return EnumVisible.ALWAYS;
         }
      }

      return (EnumVisible)var2.call(new Object[]{var1});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "applyRotations$v1_12",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/text/TextFormatting;getTextWithoutFormattingCodes(Ljava/lang/String;)Ljava/lang/String;"),
      cancellable = true
   )
   public void apollo$applyRotations$v1_12(T var1, float var2, float var3, float var4, CallbackInfo var5) {
      this.apollo$applyRotations((T)var1, var5);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(
      method = "rotateCorpse$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/text/TextFormatting;getTextWithoutFormattingCodes(Ljava/lang/String;)Ljava/lang/String;"),
      cancellable = true
   )
   public void apollo$applyRotations$v1_8(T var1, float var2, float var3, float var4, CallbackInfo var5) {
      this.apollo$applyRotations((T)var1, var5);
   }

   @Unique
   private void apollo$applyRotations(T var1, CallbackInfo var2) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(EntityModule.class)
         .ifPresent(
            var2x -> {
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR var3 = (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR)var2x;
               boolean var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
                  ? var3.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1.getUniqueID())
                  : var3.RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(var1.getEntityId());
               if (var4) {
                  GlStateManager.translate(0.0F, var1.height + 0.1F, 0.0F);
                  GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                  var2.cancel();
               }
            }
         );
   }

   public void bridge$addLayer(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T, S> var1,
      boolean var2
   ) {
      if (this instanceof RenderPlayer_v1_8) {
         this.addLayer(new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, (RenderPlayer_v1_8)this));
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getLayerCape() {
      if (this.bridge$layerCape != null) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.bridge$layerCape;
      }

      for (LayerRenderer var2 : this.layerRenderers) {
         if (var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            )
          {
            return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)(
               this.bridge$layerCape = var2
            );
         }
      }

      return null;
   }
}
