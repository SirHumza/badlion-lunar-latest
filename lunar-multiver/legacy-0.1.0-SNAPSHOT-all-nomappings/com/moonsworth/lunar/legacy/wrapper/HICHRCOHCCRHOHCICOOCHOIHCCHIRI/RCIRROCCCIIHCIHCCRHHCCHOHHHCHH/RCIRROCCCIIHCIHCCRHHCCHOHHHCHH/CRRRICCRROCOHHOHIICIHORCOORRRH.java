package com.moonsworth.lunar.legacy.wrapper.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.BossInfoClient;
import net.minecraft.network.play.server.SPacketUpdateBossInfo;
import net.minecraft.network.play.server.SPacketUpdateBossInfo.Operation;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   extends RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH> var1
   ) {
      super(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1 ? null : SPacketUpdateBossInfo.class, var1);
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH> IOCHRIRCHHIROCCHIIIIICRCHOIOHI() {
      ArrayList var1 = new ArrayList();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         for (BossInfoClient var3 : Minecraft.getMinecraft().ingameGUI.getBossOverlay$v1_12().mapBossInfos.values()) {
            var1.add(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
                  new SPacketUpdateBossInfo(Operation.ADD, var3)
               )
            );
         }
      }

      return var1;
   }
}
