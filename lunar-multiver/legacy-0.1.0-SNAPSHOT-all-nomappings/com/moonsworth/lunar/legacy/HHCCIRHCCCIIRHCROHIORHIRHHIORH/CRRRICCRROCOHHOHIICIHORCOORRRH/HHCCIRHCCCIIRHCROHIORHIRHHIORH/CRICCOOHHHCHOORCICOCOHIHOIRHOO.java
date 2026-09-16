package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.network.NetworkManager_v1_12;
import net.minecraft.network.NetworkManager_v1_7;
import net.minecraft.network.NetworkManager_v1_8;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GuiConnecting.class)
public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Shadow
   public NetworkManager_v1_12 networkManager$v1_12;
   @Shadow
   public NetworkManager_v1_8 networkManager$v1_8;
   @Shadow
   public NetworkManager_v1_7 networkManager$v1_7;

   @Nullable
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getClientPacketListener() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         NetworkManager_v1_12 var1 = this.networkManager$v1_12;
         if (var1 != null
            && var1.packetListener instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
            )
          {
            return var2;
         }
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         NetworkManager_v1_8 var4 = this.networkManager$v1_8;
         if (var4 != null
            && var4.packetListener instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6
            )
          {
            return var6;
         }
      } else {
         NetworkManager_v1_7 var5 = this.networkManager$v1_7;
         if (var5 != null
            && var5.packetListener instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7
            )
          {
            return var7;
         }
      }

      return null;
   }
}
