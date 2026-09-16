package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.lunarclient.apollo.module.entity.EntityModule;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import net.minecraft.client.renderer.entity.layers.LayerSheepWool;
import net.minecraft.entity.passive.EntitySheep;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(LayerSheepWool.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Redirect(
      method = "doRenderLayer(Lnet/minecraft/entity/passive/EntitySheep;FFFFFFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/passive/EntitySheep;hasCustomName()Z")
   )
   private boolean apollo$shouldMakeSheepRainbow_1(EntitySheep var1, @Share("sheep") LocalRef<EntitySheep> var2) {
      var2.set(var1);
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(EntityModule.class)
            .map(var0 -> (CORCOCICIRIOHROHROIIOOHICCHCRR)var0)
            .filter(
               var1x -> var1x.CCIOORRIHHRCIORHOROIHRRORIORHH()
                  ? var1x.CORCOCICIRIOHROHROIIOOHICCHCRR(var1.getUniqueID())
                  : var1x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1.getEntityId())
            )
            .isPresent()
         || var1.hasCustomName$v1_8();
   }

   @Redirect(
      method = "doRenderLayer(Lnet/minecraft/entity/passive/EntitySheep;FFFFFFF)V",
      at = @At(value = "INVOKE", target = "Ljava/lang/String;equals(Ljava/lang/Object;)Z")
   )
   private boolean apollo$shouldMakeSheepRainbow(String var1, Object var2, @Share("sheep") LocalRef<EntitySheep> var3) {
      EntitySheep var4 = (EntitySheep)var3.get();
      return var4 == null
         ? var1.equals(var2)
         : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
               .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(EntityModule.class)
               .map(var0 -> (CORCOCICIRIOHROHROIIOOHICCHCRR)var0)
               .filter(
                  var1x -> var1x.CCIOORRIHHRCIORHOROIHRRORIORHH()
                     ? var1x.CORCOCICIRIOHROHROIIOOHICCHCRR(var4.getUniqueID())
                     : var1x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var4.getEntityId())
               )
               .isPresent()
            || var1.equals(var2);
   }
}
