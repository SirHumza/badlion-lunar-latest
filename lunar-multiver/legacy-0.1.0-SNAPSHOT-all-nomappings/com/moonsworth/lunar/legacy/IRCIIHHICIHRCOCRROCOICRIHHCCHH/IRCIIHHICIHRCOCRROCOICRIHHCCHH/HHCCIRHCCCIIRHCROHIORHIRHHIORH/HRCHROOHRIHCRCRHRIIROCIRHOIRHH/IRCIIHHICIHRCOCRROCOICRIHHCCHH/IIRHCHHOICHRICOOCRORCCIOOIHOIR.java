package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer_v1_8;
import net.minecraft.util.EnumFacing;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(TileEntitySkullRenderer_v1_8.class)
public class IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "renderSkull$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/ModelBase;render(Lnet/minecraft/entity/Entity;FFFFFF)V")
   )
   public void lunar$onTileEntitySkullRender(
      float var1, float var2, float var3, EnumFacing var4, float var5, int var6, GameProfile var7, int var8, CallbackInfo var9
   ) {
      try {
         if (var6 == 3 && var7 != null) {
            Minecraft var10 = Minecraft.getMinecraft();
            Map var11 = var10.getSkinManager().loadSkinFromCache$v1_8(var7);
            if (var11 != null && var11.containsKey(Type.SKIN)) {
               GL11.glEnable(3042);
               GL14.glBlendEquation(32774);
               GL11.glBlendFunc(770, 771);
            }
         }
      } catch (IllegalArgumentException var12) {
      }
   }
}
