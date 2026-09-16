package com.moonsworth.lunar.v1_12.forge.mixin;

import net.minecraft.client.ClientBrandRetriever;
import net.minecraftforge.fml.common.FMLCommonHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ClientBrandRetriever.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Overwrite
   public static String getClientModName() {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.getClientBrand() + "," + FMLCommonHandler.instance().getModName();
   }
}
