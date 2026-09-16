package com.moonsworth.lunar.legacy.wrapper.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.network.play.server.SPacketOpenWindow;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.IWorldNameable;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR
   extends RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR {
   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH> var1
   ) {
      super(SPacketOpenWindow.class, var1);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      Container var2 = (Container)var1;
      if (var2 instanceof ContainerChest var3) {
         IInventory var4 = var3.getLowerChestInventory();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
            return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
               new SPacketOpenWindow(var2.windowId, 0, var4.getInventoryName$v1_7(), var4.getSizeInventory(), var4.isCustomInventoryName$v1_7())
            );
         } else {
            return var4 instanceof IInteractionObject var5
               ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
                  new SPacketOpenWindow(var2.windowId, var5.getGuiID(), var5.getDisplayName(), var4.getSizeInventory())
               )
               : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
                  new SPacketOpenWindow(var2.windowId, "minecraft:container", ((IWorldNameable)var4).getDisplayName(), var4.getSizeInventory())
               );
         }
      } else {
         return null;
      }
   }
}
