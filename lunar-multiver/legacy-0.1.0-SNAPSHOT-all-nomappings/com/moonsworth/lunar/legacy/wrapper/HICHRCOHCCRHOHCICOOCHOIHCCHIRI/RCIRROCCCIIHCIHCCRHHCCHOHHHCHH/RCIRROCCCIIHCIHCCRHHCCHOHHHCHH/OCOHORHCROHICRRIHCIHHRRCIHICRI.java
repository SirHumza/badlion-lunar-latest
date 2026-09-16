package com.moonsworth.lunar.legacy.wrapper.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.network.play.server.SPacketJoinGame;
import net.minecraft.world.World;

public class OCOHORHCROHICRRIHCIHHRRCIHICRI
   extends RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI {
   public OCOHORHCROHICRRIHCIHHRRCIHICRI(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH> var1
   ) {
      super(SPacketJoinGame.class, var1);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      World var3 = (World)var1;
      EntityPlayerSP var4 = (EntityPlayerSP)var2;
      PlayerControllerMP var5 = Minecraft.getMinecraft().playerController;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
            new SPacketJoinGame(
               var2.bridge$getEntityId(),
               var5.currentGameType$v1_7,
               var3.worldInfo.isHardcoreModeEnabled(),
               var1.bridge$getDimensionId(),
               var3.difficultySetting$v1_7,
               0,
               var3.worldInfo.getTerrainType()
            )
         );
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1
            ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
               new SPacketJoinGame(
                  var2.bridge$getEntityId(),
                  var5.currentGameType$v1_7,
                  var3.worldInfo.isHardcoreModeEnabled(),
                  var1.bridge$getDimensionId(),
                  var3.worldInfo.getDifficulty$v1_8(),
                  0,
                  var3.worldInfo.getTerrainType(),
                  var4.hasReducedDebug$v1_8()
               )
            )
            : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
               new SPacketJoinGame(
                  var2.bridge$getEntityId(),
                  var5.currentGameType$v1_12,
                  var3.worldInfo.isHardcoreModeEnabled(),
                  var1.bridge$getDimensionId(),
                  var3.worldInfo.getDifficulty$v1_8(),
                  0,
                  var3.worldInfo.getTerrainType(),
                  var4.hasReducedDebug$v1_8()
               )
            );
      }
   }
}
