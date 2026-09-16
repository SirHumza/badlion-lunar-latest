package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.apollo.module.serverrule.ServerRuleModule;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.network.play.client.CPacketChatMessage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CPacketChatMessage.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @ModifyConstant(method = {"<init>(Ljava/lang/String;)V", "readPacketData"}, constant = {@Constant(intValue = 100), @Constant(intValue = 256)})
   public int apollo$setMaxLength(int var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ServerRuleModule.class)
         .filter(var0 -> (Boolean)var0.getOptions().get(ServerRuleModule.OVERRIDE_MAX_CHAT_LENGTH))
         .map(var0 -> ((Number)var0.getOptions().get(ServerRuleModule.MAX_CHAT_LENGTH)).intValue())
         .orElse(var1);
   }
}
