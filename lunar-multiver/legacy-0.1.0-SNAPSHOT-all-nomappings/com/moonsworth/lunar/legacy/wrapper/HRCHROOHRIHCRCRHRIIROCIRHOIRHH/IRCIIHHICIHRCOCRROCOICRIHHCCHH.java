package com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends NetworkPlayerInfo {
   private final CRRRICCRROCOHHOHIICIHORCOORRRH HIHROCROCHOHOHCHROHRCCHHHOROCH;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1, GameProfile var2) {
      super(var2);
      this.HIHROCROCHOHOHCHROHRCCHHHOROCH = var1;
   }

   public void loadPlayerTextures() {
      synchronized (this) {
         if (!this.playerTexturesLoaded) {
            this.playerTexturesLoaded = true;
            Minecraft.getMinecraft()
               .getSkinManager()
               .loadProfileTextures$v1_8(this.HIHROCROCHOHOHCHROHRCCHHHOROCH.mc.getSession().getProfile(), new HHCCIRHCCCIIRHCROHIORHIRHHIORH(this), true);
         }
      }
   }
}
