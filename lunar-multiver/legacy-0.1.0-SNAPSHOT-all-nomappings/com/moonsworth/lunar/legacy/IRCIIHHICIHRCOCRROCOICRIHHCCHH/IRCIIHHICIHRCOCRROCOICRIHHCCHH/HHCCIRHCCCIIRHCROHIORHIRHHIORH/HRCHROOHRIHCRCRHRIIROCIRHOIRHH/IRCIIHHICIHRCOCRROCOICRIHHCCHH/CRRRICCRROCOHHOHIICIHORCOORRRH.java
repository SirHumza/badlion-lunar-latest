package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderFish_v1_7;
import net.minecraft.client.renderer.entity.RenderFish_v1_8;
import net.minecraft.entity.projectile.EntityFishHook;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin({RenderFish_v1_7.class, RenderFish_v1_8.class})
public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Unique
   private static boolean lunar$deferring;
   @Unique
   private static final float lunar$LINE_SEGMENTS = 16.0F;
   @Unique
   private int lunar$lineVertexIndex;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/BufferBuilder;begin$v1_8(ILnet/minecraft/client/renderer/vertex/VertexFormat;)V",
         ordinal = 1,
         shift = Shift.AFTER
      )
   )
   private void lunar$modifyFishingLineThickness$v1_8(EntityFishHook var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      this.lunar$lineVertexIndex = 0;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      if (var11.ORHOHCRHIRCHCHROHIHCHHRIRCCORC()) {
         GL11.glLineWidth(var11.RHOOIROORRIRROHRICOICHHICIOCHR());
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(
      method = "doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/BufferBuilder;color$v1_8(IIII)Lnet/minecraft/client/renderer/BufferBuilder;")
   )
   private BufferBuilder lunar$modifyFishingLineColor$v1_8(BufferBuilder var1, int var2, int var3, int var4, int var5, Operation<BufferBuilder> var6) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      if (var7.ORHOHCRHIRCHCHROHIHCHHRIRCCORC()) {
         int var8 = var7.IIHHICHCCCOHCHROIRIHICCHHOROCR(this.lunar$lineVertexIndex++ / 16.0F);
         var2 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var8);
         var3 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var8);
         var4 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHCOIHIICIIHOOIICCHHCRORHORHCI(var8);
         var5 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHROOIORCHOIIOOIIHHIHRCOCHIRO(var8);
      }

      return (BufferBuilder)var6.call(new Object[]{var1, var2, var3, var4, var5});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapOperation(
      method = "doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;setColorOpaque_I$v1_7(I)V")
   )
   private void lunar$modifyFishingLine$v1_7(Tessellator var1, int var2, Operation<Void> var3) {
      this.lunar$lineVertexIndex = 0;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      if (var4.ORHOHCRHIRCHCHROHIHCHHRIRCCORC()) {
         GL11.glLineWidth(var4.RHOOIROORRIRROHRICOICHHICIOCHR());
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var5 = var4.HRHHCOOIHCRCCCCOCOOHHRORIOHIHH();
         var1.setColorRGBA_F$v1_7(
            var5.HCHOOCHIOICRRHHIHHHICIRCIOICRI(0.0F) / 255.0F,
            var5.RORRCRCHIRCHHOOIHCCHRCHORHCICI(0.0F) / 255.0F,
            var5.ROCHRRCORRCOOOOOCOICOCROIIHIHH(0.0F) / 255.0F,
            var5.IOHCRRIIHCIHORROOCHCCORIHRHCII(0.0F) / 255.0F
         );
      } else {
         var3.call(new Object[]{var1, var2});
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapOperation(
      method = "doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;addVertex$v1_7(DDD)V")
   )
   private void lunar$modifyFishingLineVertexColor$v1_7(Tessellator var1, double var2, double var4, double var6, Operation<Void> var8) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      if (var9.ORHOHCRHIRCHCHROHIHCHHRIRCCORC() && var9.HRHHCOOIHCRCCCCOCOOHHRORIOHIHH().RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH()) {
         int var10 = var9.IIHHICHCCCOHCHROIRIHICCHHOROCR(this.lunar$lineVertexIndex++ / 16.0F);
         var1.setColorRGBA_F$v1_7(
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var10),
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHHRHCIOCRCHCOOOHORROICORCCCC(var10),
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RICIORHICRROHOCHRRCRIHCROOCIIC(var10),
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HRCRHOOIROHCIIRHIIROHHROHRHHCR(var10)
         );
      }

      var8.call(new Object[]{var1, var2, var4, var6});
   }

   @Inject(method = "doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V", at = @At("RETURN"))
   private void lunar$resetLineWidth(EntityFishHook var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      GL11.glLineWidth(1.0F);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V", at = @At("HEAD"), cancellable = true)
   private void lunar$deferBobber(EntityFishHook var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      if (!lunar$deferring
         && !(this.lunar$getBobberOpacity(var1) >= 1.0F)
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().ORCOCROHCRORRCCHRCCHCRRCCCORRH().IHIIOIICHOIIHIRORHHCOHOOICHIRI()) {
         RenderFish_v1_8 var11 = (RenderFish_v1_8)this;
         int var12 = var1.getBrightnessForRender$v1_12();
         float var13 = var12 % 65536;
         float var14 = var12 / 65536;
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().ORCOCROHCRORRCCHRCCHCRRCCCORRH().HHCCIRHCCCIIRHCROHIORHIRHHIORH(() -> {
            lunar$deferring = true;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, var13, var14);
            var11.doRender(var1, var2, var4, var6, var8, var9);
            lunar$deferring = false;
         });
         var10.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @WrapOperation(
      method = "doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;draw$v1_8()V", ordinal = 0)
   )
   private void lunar$modifyBobberOpacity(Tessellator var1, Operation<Void> var2, @Local(argsOnly = true) EntityFishHook var3) {
      float var4 = this.lunar$getBobberOpacity(var3);
      if (var4 >= 1.0F) {
         var2.call(new Object[]{var1});
      } else {
         GlStateManager.enableBlend();
         GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
         GlStateManager.depthMask(false);
         GlStateManager.color(1.0F, 1.0F, 1.0F, var4);
         var2.call(new Object[]{var1});
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.depthMask(true);
         GlStateManager.disableBlend();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Unique
   private float lunar$getBobberOpacity(EntityFishHook var1) {
      return var1.caughtEntity != null && var1.caughtEntity == Minecraft.getMinecraft().player$v1_8
         ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .RICIHRHIOIHIORCHCHOROOHHRIOIHC()
         : 1.0F;
   }
}
