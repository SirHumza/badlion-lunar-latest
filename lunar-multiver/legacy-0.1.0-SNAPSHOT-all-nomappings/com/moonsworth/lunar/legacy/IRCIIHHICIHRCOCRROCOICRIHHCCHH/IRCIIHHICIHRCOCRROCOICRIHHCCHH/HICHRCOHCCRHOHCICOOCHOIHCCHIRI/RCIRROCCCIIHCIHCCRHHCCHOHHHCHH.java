package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import javax.annotation.Nullable;
import net.minecraft.client.particle.ParticleDigging;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ParticleDigging.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(
      method = {
            "renderParticle$v1_7(Lnet/minecraft/client/renderer/Tessellator;FFFFFF)V",
            "renderParticle$v1_8(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V"
      },
      at = @At("HEAD"),
      cancellable = true
   )
   private void lunar$cancelParticleRendering(CallbackInfo var1) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.lunar$getConfig();
      if (var2 != null && var2.COOOIHCOIIOIOIIOHHCIORROIICHII()) {
         var1.cancel();
      }
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @WrapOperation(
      method = "renderParticle$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;setColorOpaque_F$v1_7(FFF)V")
   )
   private void lunar$setColors(Tessellator var1, float var2, float var3, float var4, Operation<Void> var5) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = this.lunar$getConfig();
      if (var6 == null) {
         var5.call(new Object[]{var1, var2, var3, var4});
      } else {
         var1.setColorRGBA_F$v1_7(
            var6.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2),
            var6.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var3),
            var6.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var4),
            var6.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(1.0F)
         );
      }
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(
      method = "renderParticle$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/BufferBuilder;color$v1_8(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;")
   )
   private BufferBuilder lunar$setColors(BufferBuilder var1, float var2, float var3, float var4, float var5, Operation<BufferBuilder> var6) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = this.lunar$getConfig();
      return var7 == null
         ? (BufferBuilder)var6.call(new Object[]{var1, var2, var3, var4, var5})
         : (BufferBuilder)var6.call(
            new Object[]{
               var1,
               var7.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2),
               var7.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var3),
               var7.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var4),
               var7.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(var5)
            }
         );
   }

   @ModifyVariable(method = {"renderParticle$v1_7", "renderParticle$v1_8"}, at = @At("STORE"), ordinal = 10)
   private float lunar$modifyScale(float var1) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.lunar$getConfig();
      return var2 != null ? var2.IIIIRHIHROIRCROHHROIHIIHRCRRHO(var1) : var1;
   }

   @Unique
   @Nullable
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH lunar$getConfig() {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RHRIRRCRRHCCRROCOIHRROORORIIIH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(((CRRRICCRROCOHHOHIICIHORCOORRRH)this).bridge$getParticleType());
      return var1 != null && var1.isActive() ? var1 : null;
   }
}
