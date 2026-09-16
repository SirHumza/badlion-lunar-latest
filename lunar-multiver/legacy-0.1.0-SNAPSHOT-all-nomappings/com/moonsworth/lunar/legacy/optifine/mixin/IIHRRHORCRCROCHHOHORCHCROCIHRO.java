package com.moonsworth.lunar.legacy.optifine.mixin;

import com.lunarclient.apollo.module.packetenrichment.PacketEnrichmentModule;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.gui.GuiChat;
import net.optifine.gui.GuiChatOF;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(GuiChat.class)
public class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   @Inject(method = "initGui", at = @At("TAIL"))
   private void apollo$handleChatOpen(CallbackInfo var1) {
      this.apollo$sendChatPacket(true);
   }

   @Inject(method = "onGuiClosed", at = @At("TAIL"))
   private void apollo$handleChatClose(CallbackInfo var1) {
      this.apollo$sendChatPacket(false);
   }

   @Unique
   private void apollo$sendChatPacket(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen() instanceof GuiChatOF) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(PacketEnrichmentModule.class)
            .filter(
               var1x -> (Boolean)var1x.getOptions()
                  .get(var1 ? PacketEnrichmentModule.PLAYER_CHAT_OPEN_PACKET : PacketEnrichmentModule.PLAYER_CHAT_CLOSE_PACKET)
            )
            .ifPresent(
               var1x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR)var1x)
                  .RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var1)
            );
      }
   }
}
