package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render_v1_7;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(RendererLivingEntity.class)
public abstract class CIOHHCORHRCCRICCCORIHCRHCCCRRR
   extends Render_v1_7
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @WrapOperation(
      method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RendererLivingEntity;getColorMultiplier(Lnet/minecraft/entity/EntityLivingBase;FF)I"
      )
   )
   private int lunar$highlightHook(RendererLivingEntity var1, EntityLivingBase var2, float var3, float var4, Operation<Integer> var5) {
      if (var2.hurtTime <= 0 && var2.deathTime <= 0) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRORCOIRRIICOOICOIOCORHORCHCOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RCRCCIHHCIHIICHCOHCCCHCOHRHCOH();
         if (var6.isEnabled()
            && var2 instanceof EntityPlayer var7
            && var6.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var7
            )) {
            return var6.ROIHOHRRRROCIRIOHIRCHHIICIRORC().CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F);
         }
      }

      return (Integer)var5.call(new Object[]{var1, var2, var3, var4});
   }

   @Redirect(
      method = "doRender",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glColor4f(FFFF)V", ordinal = 0),
      slice = @Slice(
         from = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/renderer/entity/RendererLivingEntity;renderEquippedItems(Lnet/minecraft/entity/EntityLivingBase;F)V"
         )
      )
   )
   private void lunar$colorPlayerHit(float var1, float var2, float var3, float var4) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COIHORORRIICCRIIRHIRIRRHCHOHHC();
      GL11.glColor4f(
         var5.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var1),
         var5.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var2),
         var5.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var3),
         var5.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(var4)
      );
   }

   @Redirect(
      method = "doRender",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glColor4f(FFFF)V", ordinal = 1),
      slice = @Slice(
         from = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/renderer/entity/RendererLivingEntity;renderEquippedItems(Lnet/minecraft/entity/EntityLivingBase;F)V"
         )
      )
   )
   private void colorArmorHit(float var1, float var2, float var3, float var4) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COIHORORRIICCRIIRHIRIRRHCHOHHC();
      if (var5.isEnabled()) {
         if ((Boolean)var5.OHCCOCHRHIOIHHHROHRORIHROIOHRR().get()) {
            GL11.glColor4f(
               var5.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var1),
               var5.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var2),
               var5.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var3),
               var5.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(var4)
            );
         } else {
            GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
         }
      } else {
         GL11.glColor4f(var1, var2, var3, var4);
      }
   }

   @Inject(
      method = "doRender",
      at = @At(value = "INVOKE", target = "net/minecraft/entity/EntityLivingBase.getBrightness(F)F"),
      slice = @Slice(
         from = @At(
            value = "INVOKE",
            target = "net/minecraft/client/renderer/entity/RendererLivingEntity.renderEquippedItems (Lnet/minecraft/entity/EntityLivingBase;F)V"
         )
      )
   )
   private void impl$preHurtRender(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRORIIHIHICCRHIHICOOICOIIRCHHI = true;
   }

   @Inject(
      method = "doRender",
      at = @At(
         value = "INVOKE",
         target = "net/minecraft/client/model/ModelBase.render(Lnet/minecraft/entity/Entity;FFFFFF)V",
         shift = Shift.AFTER,
         ordinal = 0
      ),
      slice = @Slice(
         from = @At(
            value = "INVOKE",
            target = "net/minecraft/client/renderer/entity/RendererLivingEntity.renderEquippedItems (Lnet/minecraft/entity/EntityLivingBase;F)V"
         )
      )
   )
   private void impl$postHurtRender(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRORIIHIHICCRHIHICOOICOIIRCHHI = false;
   }

   @Redirect(
      method = {"doRender", "renderLivingAt", "rotateCorpse"},
      at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glRotatef (FFFF)V", remap = false),
      require = 0
   )
   private void lunar$onRotatef(float var1, float var2, float var3, float var4) {
      GL11.glRotatef(var1, var2, var3, var4);
      if (com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
         != null) {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
            .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2, var3, var4);
      }
   }

   @Redirect(
      method = {"doRender", "renderLivingAt", "rotateCorpse"},
      at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glScalef (FFF)V", remap = false),
      require = 0
   )
   private void lunar$onScalef(float var1, float var2, float var3) {
      GL11.glScalef(var1, var2, var3);
      if (com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
         != null) {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
            .scale(var1, var2, var3);
      }
   }

   @Redirect(
      method = {"doRender", "renderLivingAt", "rotateCorpse"},
      at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glTranslatef (FFF)V", remap = false),
      require = 0
   )
   private void lunar$onTranslatef(float var1, float var2, float var3) {
      GL11.glTranslatef(var1, var2, var3);
      if (com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
         != null) {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
            .CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var2, var3);
      }
   }

   @Redirect(method = "canRenderName", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;isGuiEnabled()Z"))
   private boolean lunar$canRenderNameHook() {
      if (Minecraft.isGuiEnabled()) {
         return true;
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var1.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> !var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer())) {
         return true;
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRICIOOIOOOHHIOIHOCIORIOHCRCHH();
      return var2.isEnabled() && !(Boolean)var2.OHRRCIICROOCOHOOOHOCHHRRIOICIR().get();
   }

   @Inject(
      method = "doRender(Lnet/minecraft/entity/EntityLivingBase;DDDFF)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RendererLivingEntity;preRenderCallback(Lnet/minecraft/entity/EntityLivingBase;F)V"
      )
   )
   private void lunar$changeEntityScale(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR)var1, 1.0F
            )
         );
      if (var11 != null) {
         float var12 = var11.getScale();
         GL11.glScalef(var12, var12, var12);
         if (com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
            != null) {
            com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
               .scale(var12, var12, var12);
         }
      }
   }
}
