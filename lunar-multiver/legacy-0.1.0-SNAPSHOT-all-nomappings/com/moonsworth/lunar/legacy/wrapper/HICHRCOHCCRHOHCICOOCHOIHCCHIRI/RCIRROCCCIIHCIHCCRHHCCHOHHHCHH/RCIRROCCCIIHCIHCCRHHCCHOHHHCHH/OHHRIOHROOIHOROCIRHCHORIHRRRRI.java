package com.moonsworth.lunar.legacy.wrapper.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.GuiPlayerInfo;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraft.network.play.server.SPacketPlayerListItem.Action;
import net.minecraft.network.play.server.SPacketPlayerListItem.AddPlayerData;
import net.minecraft.world.WorldSettings.GameType;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI
   extends RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH> var1
   ) {
      super(SPacketPlayerListItem.class, var1);
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      WorldClient var3 = (WorldClient)var1;
      NetHandlerPlayClient var4 = (NetHandlerPlayClient)var2;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 0) {
         ArrayList var11 = new ArrayList();
         SPacketPlayerListItem var12 = new SPacketPlayerListItem(Action.ADD_PLAYER, new EntityPlayerMP[0]);
         Class<AddPlayerData> var14 = AddPlayerData.class;
         Constructor var16 = var14.getConstructors()[0];

         for (NetworkPlayerInfo var10 : var4.playerInfoMap$v1_8.values()) {
            var11.add(var10.getGameProfile().getId());
            var12.getEntries$v1_8()
               .add(
                  (AddPlayerData)var16.newInstance(
                     var12,
                     var10.getGameProfile(),
                     var10.responseTime,
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1 ? var10.getGameType$v1_8() : var10.getGameType$v1_12(),
                     var10.getDisplayName()
                  )
               );
         }

         for (EntityPlayer var19 : var3.playerEntities$v1_8) {
            if (!var11.contains(var19.getGameProfile().getId())) {
               var12.getEntries$v1_8()
                  .add(
                     (AddPlayerData)var16.newInstance(
                        var12,
                        var19.getGameProfile(),
                        Integer.MIN_VALUE,
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1 ? GameType.NOT_SET : net.minecraft.world.GameType.NOT_SET,
                        var19.getDisplayName$v1_8()
                     )
                  );
            }
         }

         return List.of((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)var12);
      } else {
         ArrayList var5 = new ArrayList();
         ArrayList var6 = new ArrayList();

         for (GuiPlayerInfo var8 : var4.playerInfoList$v1_7) {
            var5.add(var8.name);
            var6.add(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
                  new SPacketPlayerListItem(var8.name, true, var8.responseTime)
               )
            );
         }

         for (EntityPlayer var15 : var3.playerEntities$v1_7) {
            String var9 = var15.getCommandSenderName$v1_7();
            if (!var5.contains(var9)) {
               var6.add(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
                     new SPacketPlayerListItem(var9, true, Integer.MIN_VALUE)
                  )
               );
            }
         }

         return var6;
      }
   }
}
