package com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.world.World;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
public class CRRRICCRROCOHHOHIICIHORCOORRRH extends EntityPlayerSP implements IHIRRIIORRHORHRORIHOROIRCORCOO {
   private com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH dummyPlayerType = com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SELF;
   private boolean renderNametag;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   private CRRRICCRROCOHHOHIICIHORCOORRRH(Minecraft var1, World var2, NetHandlerPlayClient var3, StatisticsManager var4, boolean var5) {
      super(var1, var2, var3, var4, null);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   private CRRRICCRROCOHHOHIICIHORCOORRRH(Minecraft var1, World var2, NetHandlerPlayClient var3, StatisticsManager var4) {
      super(var1, var2, var3, var4);
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Minecraft var0, World var1, NetHandlerPlayClient var2, StatisticsManager var3) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? new CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1, var2, var3, true)
         : new CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1, var2, var3);
   }

   public void entityInit() {
      super.entityInit();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         if (!this.dataManager.entries$v1_12.containsKey(10)) {
            this.dataManager.register$v1_12(new DataParameter(10, DataSerializers.STRING), "");
         }
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         if (!this.dataManager.watchedObjects$v1_8.containsKey(10)) {
            this.dataManager.addObject$v1_8(10, "");
         }
      } else if (!this.dataManager.watchedObjects$v1_7.containsKey(10)) {
         this.dataManager.addObject$v1_7(10, "");
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean getAlwaysRenderNameTagForRender$v1_8() {
      return false;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   public ItemStack getCurrentArmor$v1_8(int var1) {
      return null;
   }

   public boolean getAlwaysRenderNameTag$v1_8() {
      return false;
   }

   public boolean hasCustomName$v1_8() {
      return false;
   }

   public boolean isUser$v1_8() {
      return false;
   }

   public boolean isSpectatedByPlayer$v1_8(EntityPlayerMP var1) {
      return false;
   }

   public boolean isSpectator$v1_8() {
      return false;
   }

   public NetworkPlayerInfo getPlayerInfo$v1_8() {
      if (this.playerInfo$v1_8 == null) {
         this.playerInfo$v1_8 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(this, this.getGameProfile());
      }

      return this.playerInfo$v1_8;
   }

   public void incrementTicksExisted() {
      this.ticksExisted++;
   }

   public com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getDummyPlayerType() {
      return this.dummyPlayerType;
   }

   public void setDummyPlayerType(com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.dummyPlayerType = var1;
   }

   public void setRenderNametag(boolean var1) {
      this.renderNametag = var1;
   }

   public boolean shouldRenderNametag() {
      return this.renderNametag;
   }

   public void setGameProfile(GameProfile var1) {
      ((com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this)
         .bridge$setGameProfile(var1);
      if (this instanceof IRRCCOICORICIHCHRHIHIHROIRHOCR var2) {
         var2.lunar$onNameTagUpdate();
      }
   }
}
