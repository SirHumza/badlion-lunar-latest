package com.moonsworth.lunar.legacy.optifine.mixin;

import java.util.HashSet;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.optifine.ConnectedProperties;
import net.optifine.config.MatchBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(ConnectedProperties.class)
public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public String[] matchTiles;
   @Shadow
   public MatchBlock[] matchBlocks;
   @Shadow
   public String[] tiles;
   @Shadow
   public int method;
   @Shadow
   public int[] metadatas;

   public String[] bridge$getMatchTiles() {
      return this.matchTiles;
   }

   public String[] bridge$parseMatchBlocks() {
      if (this.matchBlocks == null) {
         return null;
      }

      HashSet var1 = new HashSet();

      for (MatchBlock var5 : this.matchBlocks) {
         if (var5 != null) {
            Block var6 = Block.getBlockById(var5.getBlockId());
            if (var6 != null && var6 != Blocks.AIR) {
               ResourceLocation var7 = (ResourceLocation)Block.REGISTRY$v1_8.getNameForObject(var6);
               if (var7 != null) {
                  var1.add(var7.toString());
               }

               ModelManager var8 = Minecraft.getMinecraft().modelManager$v1_8;
               if (var8 != null && var8.getBlockModelShapes() != null) {
                  HashSet var9 = new HashSet();
                  if (var5.getMetadatas() != null) {
                     for (int var13 : var5.getMetadatas()) {
                        var9.add(var13);
                     }
                  }

                  if (this.metadatas != null) {
                     for (int var21 : this.metadatas) {
                        var9.add(var21);
                     }
                  }

                  for (int var18 : var9) {
                     TextureAtlasSprite var20 = null;

                     try {
                        IBlockState var22 = var6.getStateFromMeta$v1_8(var18);
                        if (var22 != null) {
                           var20 = var8.getBlockModelShapes().getTexture(var22);
                        }
                     } catch (Throwable var14) {
                     }

                     if (var20 != null && !var20.iconName.equals("missingno")) {
                        var1.add(var20.iconName);
                     }
                  }
               }
            }
         }
      }

      return var1.toArray(new String[0]);
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
