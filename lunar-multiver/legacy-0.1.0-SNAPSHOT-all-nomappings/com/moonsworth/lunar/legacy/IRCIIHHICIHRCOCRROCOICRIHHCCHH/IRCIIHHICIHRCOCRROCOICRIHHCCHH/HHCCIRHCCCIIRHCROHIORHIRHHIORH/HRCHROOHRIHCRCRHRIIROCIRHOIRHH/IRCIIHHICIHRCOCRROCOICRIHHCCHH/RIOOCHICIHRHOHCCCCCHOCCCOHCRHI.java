package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.lunarclient.apollo.module.glow.GlowModule;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Optional;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.Render_v1_8;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.ScorePlayerTeam;
import org.lwjgl.actually3.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(RenderLivingBase.class)
public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<T extends EntityLivingBase>
   extends Render_v1_8<T>
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Unique
   private OHHRIOHROOIHOROCIRHCHORIHRRRRI lunar$highlightColor = null;
   @Unique
   private boolean lunar$renderOutlines;
   @Unique
   private static final FloatBuffer BUF_FLOAT_4 = BufferUtils.createFloatBuffer(4);
   @Unique
   private float lunar$partialTicks;

   @Shadow
   public abstract void renderLayers(T var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8);

   @Redirect(
      method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/RenderLivingBase;renderModel(Lnet/minecraft/entity/EntityLivingBase;FFFFFF)V")
   )
   private void lunar$doRenderModel(RenderLivingBase var1, T var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
       {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var9 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var2
               )
            );
         if (var9 != null && var9.isCancelled()) {
            return;
         }
      }

      var1.renderModel(var2, var3, var4, var5, var6, var7, var8);
   }

   @WrapOperation(
      method = "setBrightness",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderLivingBase;getColorMultiplier(Lnet/minecraft/entity/EntityLivingBase;FF)I"
      )
   )
   private int lunar$highlightHook(RenderLivingBase var1, T var2, float var3, float var4, Operation<Integer> var5) {
      this.lunar$highlightColor = null;
      if (var2.hurtTime <= 0 && var2.deathTime <= 0) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRORCOIRRIICOOICOIOCORHORCHCOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RCRCCIHHCIHIICHCOHCCCHCOHRHCOH();
         if (var6.isEnabled()
            && var2 instanceof EntityPlayer var7
            && var6.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var7
            )) {
            OHHRIOHROOIHOROCIRHCHORIHRRRRI var8 = var6.ROIHOHRRRROCIRIOHIRCHHIICIRORC();
            this.lunar$highlightColor = var8;
            return var8.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F);
         }
      }

      return (Integer)var5.call(new Object[]{var1, var2, var3, var4});
   }

   @WrapOperation(method = "setBrightness", at = @At(value = "INVOKE", target = "Ljava/nio/FloatBuffer;flip()Ljava/nio/Buffer;"))
   private Buffer lunar$highlightHook(FloatBuffer var1, Operation<Buffer> var2) {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var3 = this.lunar$highlightColor;
      this.lunar$highlightColor = null;
      if (var3 != null) {
         int var4 = var3.OCOHORHCROHICRRIHCIHHRRCIHICRI(0.0F);
         var1.clear();
         var1.put(com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var4));
         var1.put(com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHHRHCIOCRCHCOOOHORROICORCCCC(var4));
         var1.put(com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RICIORHICRROHOCHRRCRIHCROOCIIC(var4));
         var1.put(com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HRCRHOOIROHCIIRHIIROHHROHRHHCR(var4));
         var1.flip();
         return var1;
      } else {
         return (Buffer)var2.call(new Object[]{var1});
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyArg(
      method = "setBrightness",
      at = @At(value = "INVOKE", target = "java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;", ordinal = 0),
      slice = @Slice(
         from = @At(value = "FIELD", target = "net/minecraft/client/renderer/OpenGlHelper.GL_INTERPOLATE : I"),
         to = @At(value = "CONSTANT", args = "floatValue=255.0")
      )
   )
   private float lunar$modifyHitColorRed(float var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COIHORORRIICCRIIRHIRIRRHCHOHHC()
         .RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyArg(
      method = "setBrightness",
      at = @At(value = "INVOKE", target = "java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;", ordinal = 1),
      slice = @Slice(
         from = @At(value = "FIELD", target = "net/minecraft/client/renderer/OpenGlHelper.GL_INTERPOLATE : I"),
         to = @At(value = "CONSTANT", args = "floatValue=255.0")
      )
   )
   private float lunar$modifyHitColorGreen(float var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COIHORORRIICCRIIRHIRIRRHCHOHHC()
         .RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyArg(
      method = "setBrightness",
      at = @At(value = "INVOKE", target = "java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;", ordinal = 2),
      slice = @Slice(
         from = @At(value = "FIELD", target = "net/minecraft/client/renderer/OpenGlHelper.GL_INTERPOLATE : I"),
         to = @At(value = "CONSTANT", args = "floatValue=255.0")
      )
   )
   private float lunar$modifyHitColorBlue(float var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COIHORORRIICCRIIRHIRIRRHCHOHHC()
         .HIHHOCRHHRORRHHRORRRIIHHORIHOC(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyArg(
      method = "setBrightness",
      at = @At(value = "INVOKE", target = "java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;", ordinal = 3),
      slice = @Slice(
         from = @At(value = "FIELD", target = "net/minecraft/client/renderer/OpenGlHelper.GL_INTERPOLATE : I"),
         to = @At(value = "CONSTANT", args = "floatValue=255.0")
      )
   )
   private float lunar$modifyHitColorAlpha(float var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COIHORORRIICCRIIRHIRIRRHCHOHHC()
         .OOCHRIIIRIHRRCRIORHCROIIHCRRIC(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Unique
   private int lunar$getTeamColor$v1_8(EntityLivingBase var1) {
      int var2 = 16777215;
      ScorePlayerTeam var3 = (ScorePlayerTeam)var1.getTeam$v1_7();
      if (var3 != null) {
         String var4 = FontRenderer.getFormatFromString(var3.getColorPrefix$v1_7());
         if (var4.length() >= 2) {
            var2 = this.getFontRendererFromRenderManager().getColorCode$v1_8(var4.charAt(1));
         }
      }

      return var2;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Redirect(method = "setScoreTeamColor", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V"))
   private void lunar$setGlowingColor$v1_8(float var1, float var2, float var3, float var4, @Local(ordinal = 0, argsOnly = true) EntityLivingBase var5) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var6 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var5;
      Optional var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(GlowModule.class)
         .filter(
            var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1x)
               .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var6)
         )
         .map(
            var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1x)
               .HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var6)
         );
      if (var7.isPresent()) {
         int var8 = (Integer)var7.get();
         if (var8 == Integer.MIN_VALUE) {
            var8 = this.lunar$getTeamColor$v1_8(var5);
         }

         var1 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var8);
         var2 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHHRHCIOCRCHCOOOHORROICORCCCC(var8);
         var3 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RICIORHICRROHOCHRRCRIHCROOCIIC(var8);
      } else if (var6.bridge$getGlowingColor() != -1) {
         int var10 = var6.bridge$getGlowingColor();
         var1 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var10);
         var2 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHHRHCIOCRCHCOOOHORROICORCCCC(var10);
         var3 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RICIORHICRROHOCHRRCRIHCROOCIIC(var10);
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI();
      if (var11 != null && var11.RCHHHIICCRCOROCHCCOICIOIIRIHHO().IROCHOOOIORRICOOORROOHOIORIHIH() == var6) {
         int var9 = var11.RCHHHIICCRCOROCHCCOICIOIIRIHHO().getHighlightColor();
         var1 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var9);
         var2 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHHRHCIOCRCHCOOOHORROICORCCCC(var9);
         var3 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RICIORHICRROHOCHRRCRIHCROOCIIC(var9);
      }

      GlStateManager.color(var1, var2, var3, var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(
      method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;enableOutlineMode$v1_12(I)V")
   )
   public void lunar$setGlowingColor$v1_12(int var1, @Local(ordinal = 0, argsOnly = true) EntityLivingBase var2) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2;
      Optional var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(GlowModule.class)
         .filter(
            var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1x)
               .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4)
         )
         .map(
            var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1x)
               .HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var4)
         );
      int var3;
      if (var5.isPresent()) {
         var3 = (Integer)var5.get();
         if (var3 == Integer.MIN_VALUE) {
            var3 = this.getTeamColor$v1_12(var2);
         }
      } else if (var4.bridge$getGlowingColor() != -1) {
         var3 = var4.bridge$getGlowingColor();
      } else {
         var3 = this.getTeamColor$v1_12(var2);
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI();
      if (var6 != null && var6.RCHHHIICCRCOROCHCCOICIOIIRIHHO().IROCHOOOIORRICOOORROOHOIORIHIH() == var4) {
         var3 = var6.RCHHHIICCRCOROCHCCOICIOIIRIHHO().getHighlightColor();
      }

      GlStateManager.enableOutlineMode$v1_12(var3);
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
         ScorePlayerTeam var3 = (ScorePlayerTeam)(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var1.getTeam$v1_12() : var1.getTeam$v1_7());
         if (var3 != null) {
            String var4 = FontRenderer.getFormatFromString(
               IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var3.getColor$v1_12().formattingCode + "" : var3.getColorPrefix$v1_7()
            );
            if (var4.length() >= 2) {
               char var5 = var4.charAt(1);
               int var6 = "0123456789abcdefklmnor".indexOf(var5);
               var2 = this.getFontRendererFromRenderManager().colorCode[var6];
            }
         }
      }

      float var7 = (var2 >> 16 & 0xFF) / 255.0F;
      float var8 = (var2 >> 8 & 0xFF) / 255.0F;
      float var9 = (var2 & 0xFF) / 255.0F;
      GL11.glDisable(2896);
      OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
      GL11.glColor4f(var7, var8, var9, 1.0F);
      GL11.glDisable(3553);
      OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
      GL11.glDisable(3553);
      OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
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

   @Inject(method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V", at = @At("HEAD"))
   private void lunar$storePartialTicks(T var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      this.lunar$partialTicks = var9;
   }

   @WrapOperation(
      method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderLivingBase;renderModel(Lnet/minecraft/entity/EntityLivingBase;FFFFFF)V",
         ordinal = 0
      )
   )
   private void lunar$doOutlinePass(RenderLivingBase var1, T var2, float var3, float var4, float var5, float var6, float var7, float var8, Operation<Void> var9) {
      int var10 = -1;
      if (this.lunar$renderOutlines) {
         var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(GlowModule.class)
            .filter(
               var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1x)
                  .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2
                  )
            )
            .map(
               var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1x)
                  .HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2
                  )
            )
            .map(
               var2x -> var2x == Integer.MIN_VALUE
                  ? (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getTeamColor$v1_12(var2) : this.lunar$getTeamColor$v1_8(var2))
                  : var2x
            )
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
         this.lunar$unsetScoreTeamColor();
         lunar$disableOutlineMode();
         GL11.glDisable(2903);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 && (!(var2 instanceof EntityPlayer) || !((EntityPlayer)var2).isSpectator$v1_8())) {
            GL11.glEnable(2903);
            lunar$enableOutlineMode(var10);
            this.renderLayers((T)var2, var3, var4, this.lunar$partialTicks, var5, var6, var7, var8);
            lunar$disableOutlineMode();
            GL11.glDisable(2903);
            this.lunar$unsetScoreTeamColor();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V",
      at = @At(
         value = "INVOKE",
         target = "net/minecraft/client/renderer/entity/RendererLivingEntity.preRenderCallback (Lnet/minecraft/entity/EntityLivingBase;F)V"
      )
   )
   private void lunar$changeEntityScale$v1_8(T var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR)var1, 1.0F
            )
         );
      if (var11 != null) {
         float var12 = var11.getScale();
         GlStateManager.scale(var12, var12, var12);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "prepareScale$v1_12",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderLivingBase;preRenderCallback(Lnet/minecraft/entity/EntityLivingBase;F)V"
      )
   )
   private void lunar$changeEntityScale$v1_12(EntityLivingBase var1, float var2, CallbackInfoReturnable<Float> var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR)var1, 1.0F
            )
         );
      if (var4 != null) {
         float var5 = var4.getScale();
         GlStateManager.scale(var5, var5, var5);
      }
   }

   @Inject(method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V", at = @At("HEAD"), cancellable = true)
   private void lunar$skipArmorStandRenderLogic(T var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      if (var1 instanceof EntityArmorStand var11) {
         if (var11.isInvisible()) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               for (ItemStack var13 : var11.armorItems$v1_12) {
                  if (var13 != ItemStack.EMPTY$v1_12) {
                     return;
                  }
               }

               for (ItemStack var18 : var11.handItems$v1_12) {
                  if (var18 != ItemStack.EMPTY$v1_12) {
                     return;
                  }
               }
            } else {
               for (ItemStack var15 : var11.getInventory$v1_8()) {
                  if (var15 != null) {
                     return;
                  }
               }
            }

            var10.cancel();
            this.renderName(var1, var2, var4, var6);
         }
      }
   }

   @WrapOperation(
      method = "canRenderName(Lnet/minecraft/entity/EntityLivingBase;)Z",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;isGuiEnabled()Z")
   )
   private boolean lunar$rewindForceNametagRenderingInFreecam(Operation<Boolean> var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      return var2.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> !var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer())
         ? true
         : (Boolean)var1.call(new Object[0]);
   }
}
