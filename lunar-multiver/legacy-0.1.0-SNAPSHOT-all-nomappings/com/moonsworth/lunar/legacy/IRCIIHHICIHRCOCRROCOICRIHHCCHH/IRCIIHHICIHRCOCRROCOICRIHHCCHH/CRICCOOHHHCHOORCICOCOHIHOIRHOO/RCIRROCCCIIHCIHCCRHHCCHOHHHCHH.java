package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import net.minecraft.network.handshake.client.C00Handshake;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
@Mixin(C00Handshake.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @ModifyConstant(method = "readPacketData", constant = @Constant(intValue = 255))
   private int lunar$modifyHostnameMaxLength(int var1) {
      return 32767;
   }
}
