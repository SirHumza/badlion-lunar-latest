package com.moonsworth.lunar.v1_7.optifine.mixin;

import java.util.Arrays;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.optifine.ConnectedProperties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(ConnectedProperties.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public String[] matchTiles;
   @Shadow
   public int[] matchBlocks;
   @Shadow
   public String[] tiles;
   @Shadow
   public int method;

   public String[] bridge$getMatchTiles() {
      return this.matchTiles;
   }

   public String[] bridge$parseMatchBlocks() {
      return this.matchBlocks != null
         ? Arrays.stream(this.matchBlocks)
            .filter(Objects::nonNull)
            .<Block>mapToObj(Block::getBlockById)
            .filter(Objects::nonNull)
            .filter(var0 -> var0 != Blocks.air)
            .map(Block::getTextureName)
            .toArray(String[]::new)
         : null;
   }

   public String[] bridge$getTiles() {
      return this.tiles;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getMethod() {
      int var1 = this.method;
      if (var1 >= 0 && var1 < com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.VALUES.length) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.VALUES[var1];
      }

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         "[ConnectedPropertiesBridge] Unknown CTM method " + var1, new Object[0]
      );
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE;
   }
}
