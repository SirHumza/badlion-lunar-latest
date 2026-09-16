package com.moonsworth.lunar.legacy.optifine.mixin;

import java.util.Objects;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.texture.TextureMap;
import net.optifine.CustomItemProperties;
import net.optifine.util.StrUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(CustomItemProperties.class)
public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   @Shadow
   public static ModelBlock makeModelBlock(String[] var0) {
      throw new AssertionError();
   }

   @Overwrite
   public static IBakedModel makeBakedModel(TextureMap var0, ItemModelGenerator var1, String[] var2, boolean var3) {
      String[] var4 = new String[var2.length];

      for (int var5 = 0; var5 < var4.length; var5++) {
         String var6 = var2[var5];
         var4[var5] = StrUtils.removePrefix(var6, "textures/");
      }

      ModelBlock var7 = makeModelBlock(var4);
      ModelBakery var8 = Objects.requireNonNull(
         com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRHCCIHCOHROHICHIRIOCROCOIHRCH
      );
      return com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var8, var0, var7
      );
   }
}
