package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer_v1_7;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(TileEntityMobSpawnerRenderer_v1_7.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @ModifyExpressionValue(
      method = "func_147517_a",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/tileentity/MobSpawnerBaseLogic;getEntityToRender$v1_7()Lnet/minecraft/entity/Entity;")
   )
   private static Entity lunar$renderTileEntityAt(
      Entity var0,
      @Local(ordinal = 0, argsOnly = true) double var1,
      @Local(ordinal = 1, argsOnly = true) double var3,
      @Local(ordinal = 2, argsOnly = true) double var5
   ) {
      return !com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((CRRRICCRROCOHHOHIICIHORCOORRRH)var0, var1, var3, var5)
         ? null
         : var0;
   }
}
