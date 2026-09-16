package com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.resources.SkinManager.SkinAvailableCallback;
import net.minecraft.util.ResourceLocation;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements SkinAvailableCallback {
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH OIRROCOHRHOICHHCHCRHHIIOCOOCCH;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OIRROCOHRHOICHHCHCRHHIIOCOOCCH = var1;
   }

   public void skinAvailable$v1_8(Type var1, ResourceLocation var2, MinecraftProfileTexture var3) {
      if (var1 == Type.SKIN) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.OIRROCOHRHOICHHCHCRHHIIOCOOCCH.playerTextures$v1_12.put(Type.SKIN, var2);
         } else {
            this.OIRROCOHRHOICHHCHCRHHIIOCOOCCH.locationSkin$v1_8 = var2;
         }

         this.OIRROCOHRHOICHHCHCRHHIIOCOOCCH.skinType = var3.getMetadata("model");
         if (this.OIRROCOHRHOICHHCHCRHHIIOCOOCCH.skinType == null) {
            this.OIRROCOHRHOICHHCHCRHHIIOCOOCCH.skinType = "default";
         }
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.OIRROCOHRHOICHHCHCRHHIIOCOOCCH.playerTextures$v1_12.put(Type.CAPE, var2);
      } else {
         this.OIRROCOHRHOICHHCHCRHHIIOCOOCCH.locationCape$v1_8 = var2;
      }
   }

   public void onSkinAvailable$v1_7(Type var1, ResourceLocation var2) {
   }
}
