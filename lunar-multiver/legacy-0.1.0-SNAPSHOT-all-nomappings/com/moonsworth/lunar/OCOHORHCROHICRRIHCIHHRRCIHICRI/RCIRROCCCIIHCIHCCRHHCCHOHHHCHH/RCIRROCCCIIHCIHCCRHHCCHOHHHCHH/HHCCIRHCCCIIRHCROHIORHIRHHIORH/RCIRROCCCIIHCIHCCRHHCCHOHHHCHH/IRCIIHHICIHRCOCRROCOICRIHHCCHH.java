package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.lunarclient.apollo.module.entity.EntityModule;
import com.lunarclient.apollo.module.glow.GlowModule;
import com.lunarclient.apollo.module.nametag.NametagModule;
import com.lunarclient.apollo.module.serverrule.ServerRuleModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.util.CIHCOICOOICHOCCHICIHRCOCIHRIOC;
import com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.StringUtils;
import org.lwjgl.actually3.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RendererLivingEntity.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends Render implements RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Unique
   private static final FloatBuffer BUF_FLOAT_4 = BufferUtils.createFloatBuffer(4);
   @Shadow
   public ModelBase renderPassModel;
   @Unique
   private static final int NAMETAG_RANGE = 64;
   @Unique
   private static final float NAMETAG_RANGE_SNEAK = 32.0F;
   @Unique
   private boolean lunar$renderOutlines = false;
   private static Entity model_e;
   private static float model_v;
   private static float model_v1;
   private static float model_v2;
   private static float model_v3;
   private static float model_v4;
   private static float model_v5;

   @Shadow
   public abstract boolean canRenderName(EntityLivingBase var1);

   @Shadow
   public abstract int shouldRenderPass(EntityLivingBase var1, int var2, float var3);

   @Shadow
   public abstract void func_82408_c(EntityLivingBase var1, int var2, float var3);

   @WrapMethod(method = "passSpecialRender")
   public void proxy$passSpecialRender(EntityLivingBase var1, double var2, double var4, double var6, Operation<Void> var8) {
      Component var9 = ((CORCOCICIRIOHROHROIIOOHICCHCRR)var1).bridge$getDisplayNameComponent();
      List var10 = (List)CIHCOICOOICHOCCHICIHRCOCIHRIOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(LinkedList::new, var1x -> var1x.add(var9));
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var11 = (IRCRRHRCIRHIHIHROHCRRHIIHHHHCH)HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.class, () -> new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH((CORCOCICIRIOHROHROIIOOHICCHCRR)var1, var2, var4, var6, var10, var9)
         );
      if ((var11 == null || !var11.isCancelled()) && (this.canRenderName(var1) || this.lunar$canShowInThirdPerson(var1))) {
         int var12 = 0;

         for (Component var14 : var11 == null ? var10 : var11.getLines()) {
            if (var14 instanceof TextComponent var15) {
               double var16 = var11 == null ? var4 : var11.getY() + var12 / 3.5F;
               if (var1.isChild()) {
                  if (var1 instanceof EntityAgeable) {
                     float var18 = ((EntityAgeable)var1).getGrowingAge();
                     float var19 = var18 >= 0.0F ? 1.0F : 0.5F + (-24000.0F - var18 / -24000.0F * 0.5F);
                     var16 -= var1.height / (2.0F * var19);
                  } else {
                     var16 -= var1.height / 2.0F;
                  }
               }

               if (var1.isSneaking()) {
                  Float var20 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
                     .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ServerRuleModule.class)
                     .filter(var0 -> (Boolean)var0.getOptions().get(ServerRuleModule.OVERRIDE_NAMETAG_RENDER_DISTANCE))
                     .map(var0 -> ((IOIICIRIICICIIOORHCIIIIRRIHRHI)var0).HRHCHIHCCIIOIIOCRCHCIHCICCCCIR() / 2.0F)
                     .orElse(32.0F);
                  this.impl$renderLabelSneaking(var1, var15, var2, var16 + 0.225F, var6, var20);
               } else {
                  double var21 = var11 == null
                     ? this.impl$renderOffsetLivingLabel(var1, var15, var2, var16, var6)
                     : this.impl$renderOffsetLivingLabel(var1, var15, var11.getX(), var16, var11.getZ());
                  if (var21 != var16) {
                     var12++;
                  }
               }

               var12++;
            }
         }
      }
   }

   @Unique
   private boolean lunar$canShowInThirdPerson(EntityLivingBase var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRICIOOIOOOHHIOIHOCIORIOHCRCHH()
         .IHCRORHRORIICHRHRCHRRIRRHHOCOO((CRRRICCRROCOHHOHIICIHORCOORRRH)var1);
   }

   private void impl$renderLabelSneaking(EntityLivingBase var1, TextComponent var2, double var3, double var5, double var7, float var9) {
      GL11.glAlphaFunc(516, 0.1F);
      if (this.canRenderName(var1)) {
         float var10 = 1.6F;
         float var11 = 0.016666668F * var10;
         double var12 = var1.getDistanceSqToEntity(this.renderManager.livingPlayer);
         if (var12 < var9 * var9) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .RRICIOOIOOOHHIOIHOCIORIOHCRCHH();
            FontRenderer var15 = Minecraft.getMinecraft().fontRendererObj;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)var3 + 0.0F, (float)var5 + var1.height + 0.5F, (float)var7);
            GL11.glNormal3f(0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
            GL11.glScalef(-var11, -var11, var11);
            GL11.glDisable(2896);
            GL11.glTranslatef(0.0F, 0.25F / var11, 0.0F);
            GL11.glDepthMask(false);
            GL11.glEnable(3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            Tessellator var16 = Tessellator.instance;
            float var17 = 0.0F;
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var18 = (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCCICHCRRIICICCHCIRCRRIIRROHHC()
               .CIIIIHORRORIHCCOOOOCIIRORCIOOH()
               .get(var1.getUniqueID());
            GL11.glDisable(3553);
            var16.startDrawingQuads();
            float var19 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWidth(
                  var2,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var15
               )
               / 2.0F;
            float var20 = -var19 - 1.0F;
            float var21 = var19 + 1.0F;
            float var22 = var20 + 2.0F;
            var16.setColorRGBA_F(0.0F, 0.0F, 0.0F, var14.OIIOHIHCORHCIOCCCHHHIRROHORIRR());
            var16.addVertex(var20, -1.0F + var17, 0.0);
            var16.addVertex(var20, 8.0F + var17, 0.0);
            var16.addVertex(var21, 8.0F + var17, 0.0);
            var16.addVertex(var21, -1.0F + var17, 0.0);
            var16.draw();
            GL11.glEnable(3553);
            GL11.glDepthMask(true);
            CIOHHCORHRCCRICCCORIHCRHCCCRRR var23 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
            int var24 = 553648127;
            if (var14.isEnabled() && (Boolean)var14.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get()) {
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var15)
                  .bridge$drawShadow(var23, var2, var22, var17, var24);
               GL11.glTranslatef(0.0F, 0.0F, -0.001F);
            }

            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var15)
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23, var2, var22, var17, var24, false, true);
            this.lunar$renderNametagAdditions(
               var23, false, false, var18, var17, var21, var20, 0.15F, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OROCRHCRIIOROIRROOCCOOICIHOROH
            );
            GL11.glEnable(2896);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
         }
      }
   }

   private double impl$renderOffsetLivingLabel(EntityLivingBase var1, TextComponent var2, double var3, double var5, double var7) {
      return var1.isPlayerSleeping()
         ? this.impl$renderLivingLabel(var1, var2, var3, var5 - 1.5, var7) + 1.5
         : this.impl$renderLivingLabel(var1, var2, var3, var5, var7);
   }

   public double impl$renderLivingLabel(Entity var1, TextComponent var2, double var3, double var5, double var7) {
      int var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ServerRuleModule.class)
         .filter(var0 -> (Boolean)var0.getOptions().get(ServerRuleModule.OVERRIDE_NAMETAG_RENDER_DISTANCE))
         .map(var0 -> ((IOIICIRIICICIIOORHCIIIIRRIHRHI)var0).HRHCHIHCCIIOIIOCRCHCIHCICCCCIR())
         .orElse(64);
      if (var1 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO var10 && !var10.shouldRenderNametag()) {
         return 0.0;
      } else {
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var30 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
         boolean var11 = false;
         EntityLivingBase var12 = this.renderManager.livingPlayer;
         double var13 = var12 == null ? Double.MAX_VALUE : var1.getDistanceSqToEntity(var12);
         if (var1 instanceof AbstractClientPlayer) {
            String var15 = StringUtils.stripControlCodes(((AbstractClientPlayer)var1).getGameProfile().getName());
            if (!var15.isEmpty()) {
               var11 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.doesComponentContain(
                  var2, new String[]{var15}
               );
               if (var11 && var13 < 100.0) {
                  Scoreboard var16 = ((AbstractClientPlayer)var1).getWorldScoreboard();
                  ScoreObjective var17 = var16.getObjectiveInDisplaySlot(2);
                  if (var17 != null) {
                     Score var18 = var16.getValueFromObjective(var1.getCommandSenderName(), var17);
                     this.impl$renderLivingLabel(var1, Component.text(var18.getScorePoints() + " " + var17.getDisplayName()), var3, var5, var7);
                     var5 += this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15F * 0.02666667F;
                  }
               }
            }
         }

         if (var13 <= var9 * var9
            || com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIIOORORHHCCHICIRRROIHICRCOOCR
            )
          {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var31 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .RRICIOOIOOOHHIOIHOCIORIOHCRCHH();
            FontRenderer var32 = Minecraft.getMinecraft().fontRendererObj;
            float var33 = 1.6F;
            float var34 = 0.016666668F * var33;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)var3 + 0.0F, (float)var5 + var1.height + 0.5F, (float)var7);
            GL11.glNormal3f(0.0F, 1.0F, 0.0F);
            if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIIOORORHHCCHICIRRROIHICRCOOCR
               )
             {
               GL11.glRotatef(
                  -com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.playerViewY,
                  0.0F,
                  1.0F,
                  0.0F
               );
               GL11.glRotatef(
                  com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.playerViewX,
                  1.0F,
                  0.0F,
                  0.0F
               );
            } else {
               GL11.glRotatef(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
            }

            GL11.glScalef(-var34, -var34, var34);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            GL11.glDisable(2929);
            GL11.glEnable(3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            Tessellator var19 = Tessellator.instance;
            float var20 = 0.0F;
            if (var2.content().equals("deadmau5")) {
               var20 = -10.0F;
            }

            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var21 = (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCCICHCRRIICICCHCIRCRRIIRROHHC()
               .CIIIIHORRORIHCCOOOOCIIRORCIOOH()
               .get(var1.getUniqueID());
            boolean var22 = var1 instanceof EntityPlayer
               && var11
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HCCICHCRRIICICCHCIRCRRIIRROHHC()
                  .CIIIIHORRORIHCCOOOOCIIRORCIOOH()
                  .containsKey(var1.getUniqueID());
            boolean var23 = var22
               && var21 != null
               && (
                  var21.ROHCCIOORRRRCOIOIHOHICHORROOIR()
                     || (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                        .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                        .IHCRIIHRIHIRIHCORRHOCIHORHCOHR()
                        .get()
               );
            boolean var24 = var22
               && var21 != null
               && var21.RROOHCOHROIIROCRCRICHOHHCCOOCR() != null
               && (
                  var21.ROHCCIOORRRRCOIOIHOHICHORROOIR()
                     || (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                        .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                        .ICCIOIOHCRHRCOOOIICCIOHRICCHOC()
                        .get()
               );
            GL11.glDisable(3553);
            var19.startDrawingQuads();
            float var25 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWidth(
                  var2,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var32
               )
               / 2.0F;
            float var26 = -var25 - 1.0F;
            float var27 = var25 + 1.0F;
            if (var24) {
               var26 -= 5.0F;
               var27 += 5.0F;
            }

            float var28 = var26 + 2.0F;
            if (var23) {
               var26 -= 6.0F;
               var27 += 6.0F;
               var28 = var26 + 13.0F;
            }

            var19.setColorRGBA_F(0.0F, 0.0F, 0.0F, var31.OIIOHIHCORHCIOCCCHHHIRROHORIRR());
            var19.addVertex(var26, -1.0F + var20, 0.0);
            var19.addVertex(var26, 8.0F + var20, 0.0);
            var19.addVertex(var27, 8.0F + var20, 0.0);
            var19.addVertex(var27, -1.0F + var20, 0.0);
            var19.draw();
            GL11.glEnable(3553);
            int var29 = 553648127;
            if (var31.isEnabled() && (Boolean)var31.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get()) {
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var32)
                  .bridge$drawShadow(var30, var2, var28, var20, var29);
               GL11.glTranslatef(0.0F, 0.0F, -0.001F);
            }

            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var32)
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var30, var2, var28, var20, var29, false, true);
            this.lunar$renderNametagAdditions(
               var30, var23, var24, var21, var20, var27, var26, 0.15F, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OROCRHCRIIOROIRROOCCOOICIHOROH
            );
            GL11.glEnable(2929);
            GL11.glDepthMask(true);
            this.lunar$renderNametagAdditions(
               var30, var23, var24, var21, var20, var27, var26, 1.0F, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRIIOCROCRROCCOOHRRRCHHCRRHCRI
            );
            if (var31.isEnabled() && (Boolean)var31.IIHCHRICRRICOIIHRHIOIIIHIIORRH().get()) {
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var32)
                  .bridge$drawShadow(var30, var2, var28, var20, -1);
               GL11.glTranslatef(0.0F, 0.0F, -0.001F);
            }

            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var32)
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var30, var2, var28, var20, -1, false, true);
            GL11.glEnable(2896);
            GL11.glDisable(3042);
            GL11.glPopMatrix();
         }

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
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var9
   ) {
      if (var2) {
         var1.push();
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
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO(
               var4.HIIORICOHRICICIHHHHOIOIIRIIRCO(), var4.HCHCICROIICOIOCCOCIHHCHCIOIROR(), var4.CRCHRIRHHRIICORCOHRCCOHRROIRRO(), var8
            )
         );
         if (var4.HIRROCORCHCHRORRHRIHCIHIHCCHIC()) {
            GL11.glTranslatef(0.0F, 0.0F, -1.0F);
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
         var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(1.0F, 1.0F, 1.0F, var8);
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1,
            var4.RROOHCOHROIIROCRCRICHOHHCCOOCR(),
            var6 - 10.0F,
            var5 - 0.5F,
            8.0F,
            8.0F,
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(-1, var8),
            var9
         );
      }
   }

   @Inject(method = "canRenderName", at = @At("HEAD"), cancellable = true)
   private void impl$canRenderNameDummy(EntityLivingBase var1, CallbackInfoReturnable<Boolean> var2) {
      if (var1 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO var3) {
         var2.setReturnValue(var3.shouldRenderNametag());
      }
   }

   @Inject(method = "canRenderName", at = @At("HEAD"), cancellable = true)
   private void apollo$hiddenNametagOverride(EntityLivingBase var1, CallbackInfoReturnable<Boolean> var2) {
      if (!(var1 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO)) {
         if (var1 != IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RRICIOOIOOOHHIOIHOCIORIOHCRCHH().isEnabled()) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
                  .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(NametagModule.class)
                  .ifPresent(var2x -> {
                     IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var2x;
                     if (var3.OHHRIOHROOIHOROCIRHCHORIHRRRRI(((CRRRICCRROCOHHOHIICIHORCOORRRH)var1).bridge$getUniqueID())) {
                        var2.setReturnValue(false);
                     }
                  });
            }
         }
      }
   }

   @Redirect(
      method = "canRenderName",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/entity/RenderManager;livingPlayer:Lnet/minecraft/entity/EntityLivingBase;")
   )
   public EntityLivingBase impl$canRenderName(RenderManager var1, EntityLivingBase var2) {
      if (var2 == Minecraft.getMinecraft().thePlayer && !(var2 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO)) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RRICIOOIOOOHHIOIHOCIORIOHCRCHH();
         boolean var4 = var3.isEnabled() && (Boolean)var3.IIOCIIICRHCORHCORHOOCIICHOIRHI().get()
            || IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
               .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                  var0 -> var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHHCCIOICIIRRIRCHROOCCHRIHOROC()
                     || !var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer()
               );
         return var4 ? null : var2;
      } else {
         return null;
      }
   }

   @Redirect(method = "doRender", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/ModelBase;render(Lnet/minecraft/entity/Entity;FFFFFF)V"))
   public void doRender(ModelBase var1, Entity var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      model_e = var2;
      model_v = var3;
      model_v1 = var4;
      model_v2 = var5;
      model_v3 = var6;
      model_v4 = var7;
      model_v5 = var8;
      var1.render(var2, var3, var4, var5, var6, var7, var8);
   }

   @ModifyConstant(method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V", constant = @Constant(intValue = 15, ordinal = 0))
   public int impl$eventRenderGlint(int var1, EntityLivingBase var2) {
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            ORHIOICIOCRRHOOCOHRORIHICHRCRR.class,
            () -> new ORHIOICIOCRRHOOCOHRORIHICHRCRR(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.EQUIPPED_ARMOR,
               var1xx -> this.renderPassModel.render(model_e, model_v, model_v1, model_v2, model_v3, model_v4, model_v5),
               null,
               (CRRRICCRROCOHHOHIICIHORCOORRRH)var2,
               null,
               OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
            )
         );
      return var3 != null && var3.isCancelled() ? 0 : var1;
   }

   @Inject(method = "renderArrowsStuckInEntity", at = @At("HEAD"), cancellable = true)
   public void impl$onRenderArrowsStuckInEntity(EntityLivingBase var1, float var2, CallbackInfo var3) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
         .RHHIIHHCIOHHRRCICCCHOCRHIOORCC()) {
         var3.cancel();
      }
   }

   @Inject(
      method = "rotateCorpse",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/EnumChatFormatting;getTextWithoutFormattingCodes(Ljava/lang/String;)Ljava/lang/String;"),
      cancellable = true
   )
   public void apollo$applyRotations(EntityLivingBase var1, float var2, float var3, float var4, CallbackInfo var5) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(EntityModule.class)
         .ifPresent(
            var2x -> {
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR var3x = (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR)var2x;
               if (var3x.RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(var1.getEntityId())) {
                  GL11.glTranslatef(0.0F, var1.height + 0.1F, 0.0F);
                  GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
                  var5.cancel();
               }
            }
         );
   }

   @Unique
   private static void lunar$enableOutlineMode(int var0) {
      BUF_FLOAT_4.put(0, (var0 >> 16 & 0xFF) / 255.0F);
      BUF_FLOAT_4.put(1, (var0 >> 8 & 0xFF) / 255.0F);
      BUF_FLOAT_4.put(2, (var0 >> 0 & 0xFF) / 255.0F);
      BUF_FLOAT_4.put(3, (var0 >> 24 & 0xFF) / 255.0F);
      GL11.glTexEnv(8960, 8705, BUF_FLOAT_4);
      GL11.glTexEnvi(8960, 8704, 34160);
      GL11.glTexEnvi(8960, 34161, 7681);
      GL11.glTexEnvi(8960, 34176, 34166);
      GL11.glTexEnvi(8960, 34192, 768);
      GL11.glTexEnvi(8960, 34162, 7681);
      GL11.glTexEnvi(8960, 34184, 5890);
      GL11.glTexEnvi(8960, 34200, 770);
   }

   @Unique
   private static void lunar$disableOutlineMode() {
      GL11.glTexEnvi(8960, 8704, 8448);
      GL11.glTexEnvi(8960, 34161, 8448);
      GL11.glTexEnvi(8960, 34162, 8448);
      GL11.glTexEnvi(8960, 34176, 5890);
      GL11.glTexEnvi(8960, 34184, 5890);
      GL11.glTexEnvi(8960, 34192, 768);
      GL11.glTexEnvi(8960, 34200, 770);
   }

   @Unique
   private int lunar$setScoreTeamColor(EntityLivingBase var1) {
      int var2 = 16777215;
      if (var1 instanceof EntityPlayer) {
         ScorePlayerTeam var3 = (ScorePlayerTeam)var1.getTeam();
         if (var3 != null) {
            String var4 = FontRenderer.getFormatFromString(var3.getColorPrefix());
            if (var4.length() >= 2) {
               char var5 = var4.charAt(1);
               int var6 = "0123456789abcdefklmnor".indexOf(var5);
               var2 = this.getFontRendererFromRenderManager().colorCode[var6];
            }
         }
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI();
      if (var7 != null && var7.RCHHHIICCRCOROCHCCOICIOIIRIHHO().IROCHOOOIORRICOOORROOHOIORIHIH() == var1) {
         var2 = var7.RCHHHIICCRCOROCHCCOICIOIIRIHHO().getHighlightColor();
      }

      float var8 = (var2 >> 16 & 0xFF) / 255.0F;
      float var9 = (var2 >> 8 & 0xFF) / 255.0F;
      float var10 = (var2 & 0xFF) / 255.0F;
      GL11.glDisable(2896);
      OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
      GL11.glColor4f(var8, var9, var10, 1.0F);
      GL11.glDisable(3553);
      OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
      GL11.glDisable(3553);
      OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
      return var2;
   }

   @Unique
   private int lunar$getTeamColor(EntityLivingBase var1) {
      int var2 = 16777215;
      ScorePlayerTeam var3 = (ScorePlayerTeam)var1.getTeam();
      if (var3 != null) {
         String var4 = FontRenderer.getFormatFromString(var3.getColorPrefix());
         if (var4.length() >= 2) {
            int var5 = "0123456789abcdef".indexOf(var4.charAt(1));
            var2 = this.getFontRendererFromRenderManager().colorCode[var5];
         }
      }

      return var2;
   }

   @Unique
   public void lunar$unsetScoreTeamColor() {
      GL11.glEnable(2896);
      OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
      GL11.glEnable(3553);
      OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
      GL11.glEnable(3553);
      OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
   }

   public void bridge$setRenderOutlines(boolean var1) {
      this.lunar$renderOutlines = var1;
   }

   @WrapOperation(
      method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RendererLivingEntity;renderModel(Lnet/minecraft/entity/EntityLivingBase;FFFFFF)V"
      )
   )
   private void lunar$doOutlinePass(
      RendererLivingEntity var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8, Operation<Void> var9
   ) {
      int var10 = -1;
      if (this.lunar$renderOutlines) {
         var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(GlowModule.class)
            .filter(var1x -> ((HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1x).RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((CRRRICCRROCOHHOHIICIHORCOORRRH)var2))
            .map(var1x -> ((HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1x).HRCHROOHRIHCRCRHRIIROCIRHOIRHH((CRRRICCRROCOHHOHIICIHORCOORRRH)var2))
            .map(var2x -> var2x == Integer.MIN_VALUE ? this.lunar$getTeamColor(var2) : var2x)
            .orElseGet(() -> this.lunar$setScoreTeamColor(var2));
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HOROHROIORRIRIIIOOCCIROCRCROHI();
         if (var11 != null && var11.RCHHHIICCRCOROCHCCOICIOIIRIHHO().IROCHOOOIORRICOOORROOHOIORIHIH() == var2) {
            var10 = var11.RCHHHIICCRCOROCHCCOICIOIIRIHHO().getHighlightColor();
         }

         GL11.glEnable(2903);
         lunar$enableOutlineMode(var10);
      }

      var9.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var8});
      if (this.lunar$renderOutlines) {
         for (int var14 = 0; var14 < 4; var14++) {
            int var12 = this.shouldRenderPass(var2, var14, var8);
            if (var12 > 0 && this.renderPassModel != null) {
               this.renderPassModel.setLivingAnimations(var2, var3, var4, var8);
               this.renderPassModel.render(var2, var3, var4, var5, var6, var7, var8);
               if ((var12 & 240) == 16) {
                  this.func_82408_c(var2, var14, var8);
                  this.renderPassModel.render(var2, var3, var4, var5, var6, var7, var8);
               }

               GL11.glDisable(3042);
               GL11.glEnable(3008);
            }
         }
      }
   }

   @Inject(
      method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/OpenGlHelper;setActiveTexture(I)V", ordinal = 2),
      cancellable = true
   )
   private void lunar$cancelRenderingEntity(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      if (this.lunar$renderOutlines) {
         this.lunar$unsetScoreTeamColor();
         lunar$disableOutlineMode();
         GL11.glDisable(2903);
         GL11.glDepthMask(true);
         GL11.glDisable(32826);
         OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
         GL11.glEnable(3553);
         OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
         GL11.glEnable(2884);
         GL11.glPopMatrix();
         var10.cancel();
      }
   }
}
