package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(EntityArmorStand.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @WrapWithCondition(method = "onUpdate", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;onUpdate()V"))
   private boolean lunar$rewindPreventUselessUpdate(EntityLivingBase var1) {
      return !var1.isInvisible()
         ? true
         : !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> var0.HRCHICHIOHOROOHHHOHROHCICCROIO().RHHIIIHORICCOCHHORHHOCCHCCIICC() / 50L > 20L);
   }
}
