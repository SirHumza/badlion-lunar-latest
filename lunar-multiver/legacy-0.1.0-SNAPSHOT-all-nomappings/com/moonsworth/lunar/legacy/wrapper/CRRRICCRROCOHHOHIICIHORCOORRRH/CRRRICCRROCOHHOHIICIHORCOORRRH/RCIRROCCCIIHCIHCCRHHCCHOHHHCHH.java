package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.NetworkManager_v1_12;
import net.minecraft.network.NetworkManager_v1_7;
import net.minecraft.network.NetworkManager_v1_8;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends NetHandlerPlayClient {
   private static final UUID ICHRCCHRIOOHIRRRROROCCCCIIHHRI = new UUID(0L, 0L);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Minecraft var1) {
      super(
         var1,
         var1.currentScreen,
         (NetworkManager_v1_12)IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOORHIHCCRIHRRROHIROOHRCOIHIHI(),
         new GameProfile(ICHRCCHRIOOHIRRRROROCCCCIIHHRI, var1.getSession().getProfile().getName())
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Minecraft var1, int var2) {
      super(
         var1,
         var1.currentScreen,
         (NetworkManager_v1_8)IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOORHIHCCRIHRRROHIROOHRCOIHIHI(),
         new GameProfile(ICHRCCHRIOOHIRRRROROCCCCIIHHRI, var1.getSession().getProfile().getName())
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Minecraft var1, boolean var2) {
      super(var1, var1.currentScreen, (NetworkManager_v1_7)IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOORHIHCCRIHRRROHIROOHRCOIHIHI());
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(Minecraft var0) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 0) : new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, false);
      }
   }
}
