package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.lunarclient.apollo.module.entity.EntityModule;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.renderer.entity.RenderSheep_v1_7;
import net.minecraft.entity.passive.EntitySheep;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(RenderSheep_v1_7.class)
public class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   @Redirect(
      method = "shouldRenderPass(Lnet/minecraft/entity/passive/EntitySheep;IF)I",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/passive/EntitySheep;hasCustomNameTag()Z")
   )
   private boolean apollo$shouldRenderPass$customNametag(EntitySheep var1, @Share("sheep") LocalRef<EntitySheep> var2) {
      var2.set(var1);
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(EntityModule.class)
            .filter(
               var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR)var1x)
                  .OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1.getEntityId())
            )
            .isPresent()
         || var1.hasCustomNameTag$v1_7();
   }

   @Redirect(
      method = "shouldRenderPass(Lnet/minecraft/entity/passive/EntitySheep;IF)I",
      at = @At(value = "INVOKE", target = "Ljava/lang/String;equals(Ljava/lang/Object;)Z")
   )
   private boolean apollo$shouldRenderPass$rainbowTag(String var1, Object var2, @Share("sheep") LocalRef<EntitySheep> var3) {
      EntitySheep var4 = (EntitySheep)var3.get();
      return var4 == null
         ? var1.equals(var2)
         : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
               .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(EntityModule.class)
               .filter(
                  var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR)var1x)
                     .OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var4.getEntityId())
               )
               .isPresent()
            || var1.equals(var2);
   }
}
