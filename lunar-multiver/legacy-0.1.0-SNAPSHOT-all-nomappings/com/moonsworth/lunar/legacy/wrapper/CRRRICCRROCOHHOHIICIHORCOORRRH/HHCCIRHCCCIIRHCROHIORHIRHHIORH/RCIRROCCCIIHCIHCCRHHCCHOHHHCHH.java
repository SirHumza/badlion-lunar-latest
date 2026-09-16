package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.init.Blocks;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends WorldClient {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(NetHandlerPlayClient var1) {
      super(
         var1,
         IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
            ? new WorldSettings(0L, GameType.NOT_SET, true, false, WorldType.DEFAULT)
            : new WorldSettings(0L, net.minecraft.world.WorldSettings.GameType.NOT_SET, true, false, WorldType.DEFAULT),
         0,
         EnumDifficulty.NORMAL,
         new Profiler()
      );
      ((com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this).bridge$setIsRemote(true);
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public Block getBlock$v1_7(int var1, int var2, int var3) {
      return Blocks.AIR;
   }
}
