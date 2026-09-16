package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import net.minecraft.server.integrated.IntegratedPlayerList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(IntegratedPlayerList.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(method = "allowUserToConnect", at = @At("HEAD"), cancellable = true)
   private void lunar$allowUserToConnect(SocketAddress var1, GameProfile var2, CallbackInfoReturnable<String> var3) {
      com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CCRHICOCOHIIRIHCOCIRCHHROHCCRR();
      boolean var5 = false;
      if (var1 instanceof InetSocketAddress var6) {
         var5 = !var6.getAddress().isLoopbackAddress();
      }

      if (var5
         && var4.OOOIIOOHHRRRORIHROOCHHCICOIIOC()
         && var4.IORRRROCRRCHCHHRCCOHCRRCRHCRHH().HIRROICHOOICOOCOCHIROHOCCHCOIR().HHIOOCCHHCCHOOOIRRHIIOIRHRRRHO() != CRRRICCRROCOHHOHIICIHORCOORRRH.LAN) {
         var3.setReturnValue("This world does not accept LAN connections.");
      }
   }
}
