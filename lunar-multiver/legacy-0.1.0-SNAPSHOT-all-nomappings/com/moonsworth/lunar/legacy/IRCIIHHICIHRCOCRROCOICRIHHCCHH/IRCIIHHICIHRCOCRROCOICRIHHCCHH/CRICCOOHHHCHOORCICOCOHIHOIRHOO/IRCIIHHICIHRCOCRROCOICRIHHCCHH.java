package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.lunarclient.apollo.module.serverrule.ServerRuleModule;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketChatMessage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CPacketChatMessage.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Redirect(method = "<init>(Ljava/lang/String;)V", at = @At(value = "INVOKE", target = "Ljava/lang/String;substring(II)Ljava/lang/String;"))
   private String lunar$modifyChatLengthLimit(String var1, int var2, int var3) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      int var5 = var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Minecraft.getMinecraft().isSingleplayer(), var3);
      int var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ServerRuleModule.class)
         .filter(var0 -> (Boolean)var0.getOptions().get(ServerRuleModule.OVERRIDE_MAX_CHAT_LENGTH))
         .map(var0 -> ((Number)var0.getOptions().get(ServerRuleModule.MAX_CHAT_LENGTH)).intValue())
         .orElse(var5);
      if (var1.length() > var6) {
         var1 = var1.substring(0, var6);
      }

      return var1;
   }
}
