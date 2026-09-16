package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import javax.annotation.Nullable;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFootStep;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ParticleFootStep.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderParticle$v1_7(Lnet/minecraft/client/renderer/Tessellator;FFFFFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;setColorRGBA_F$v1_7(FFFF)V")
   )
   private void lunar$customFootprintParticleColor(Tessellator var1, float var2, float var3, float var4, float var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = this.lunar$getConfig();
      if (var6 != null) {
         var2 = var6.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2);
         var3 = var6.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var3);
         var4 = var6.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var4);
         var5 = var6.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(var5);
      }

      var1.setColorRGBA_F$v1_7(var2, var3, var4, var5);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(
      method = "renderParticle$v1_8(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/BufferBuilder;color$v1_8(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;")
   )
   private BufferBuilder lunar$customFootprintParticleColor$v1_8(BufferBuilder var1, float var2, float var3, float var4, float var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = this.lunar$getConfig();
      if (var6 != null) {
         var2 = var6.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2);
         var3 = var6.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var3);
         var4 = var6.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var4);
         var5 = var6.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(var5);
      }

      return var1.color$v1_8(var2, var3, var4, var5);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderParticle$v1_7(Lnet/minecraft/client/renderer/Tessellator;FFFFFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;addVertexWithUV$v1_7(DDDDD)V")
   )
   private void lunar$scaleFootprintParticle(Tessellator var1, double var2, double var4, double var6, double var8, double var10) {
      Entity var12 = (Entity)this;
      float var13 = (float)(var12.posX - Particle.interpPosX);
      float var14 = (float)(var12.posY - Particle.interpPosY);
      float var15 = (float)(var12.posZ - Particle.interpPosZ);
      double var16 = var2 - var13;
      double var18 = var6 - var15;
      float var20 = this.lunar$getScale();
      var1.addVertexWithUV$v1_7(var13 + var16 * var20, var14, var15 + var18 * var20, var8, var10);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Redirect(
      method = "renderParticle$v1_8(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/BufferBuilder;pos$v1_8(DDD)Lnet/minecraft/client/renderer/BufferBuilder;")
   )
   private BufferBuilder lunar$scaleFootprintParticle$v1_8(BufferBuilder var1, double var2, double var4, double var6) {
      Entity var8 = (Entity)this;
      float var9 = (float)(var8.posX - Particle.interpPosX);
      float var10 = (float)(var8.posY - Particle.interpPosY);
      float var11 = (float)(var8.posZ - Particle.interpPosZ);
      double var12 = var2 - var9;
      double var14 = var6 - var11;
      float var16 = this.lunar$getScale();
      return var1.pos$v1_8(var9 + var12 * var16, var10, var11 + var14 * var16);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(
      method = "renderParticle$v1_8(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/BufferBuilder;pos$v1_8(DDD)Lnet/minecraft/client/renderer/BufferBuilder;")
   )
   private BufferBuilder lunar$scaleFootprintParticle$v1_12(BufferBuilder var1, double var2, double var4, double var6) {
      Particle var8 = (Particle)this;
      float var9 = (float)(var8.posX$v1_12 - Particle.interpPosX);
      float var10 = (float)(var8.posY$v1_12 - Particle.interpPosY);
      float var11 = (float)(var8.posZ$v1_12 - Particle.interpPosZ);
      double var12 = var2 - var9;
      double var14 = var6 - var11;
      float var16 = this.lunar$getScale();
      return var1.pos$v1_8(var9 + var12 * var16, var10, var11 + var14 * var16);
   }

   @Inject(
      method = {
            "renderParticle$v1_7(Lnet/minecraft/client/renderer/Tessellator;FFFFFF)V",
            "renderParticle$v1_8(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V"
      },
      at = @At("HEAD"),
      cancellable = true
   )
   private void lunar$cancelFootstepParticleRendering(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.lunar$getConfig();
      if (var2 != null && var2.COOOIHCOIIOIOIIOHHCIORROIICHII()) {
         var1.cancel();
      }
   }

   @Unique
   @Nullable
   private com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH lunar$getConfig() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RHRIRRCRRHCCRROCOIHRROORORIIIH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.FOOTSTEP
         );
      return var1 != null && var1.isActive() ? var1 : null;
   }

   @Unique
   private float lunar$getScale() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = this.lunar$getConfig();
      return var1 == null ? 1.0F : var1.IIIIRHIHROIRCROHHROIHIIHRCRRHO(1.0F);
   }
}
