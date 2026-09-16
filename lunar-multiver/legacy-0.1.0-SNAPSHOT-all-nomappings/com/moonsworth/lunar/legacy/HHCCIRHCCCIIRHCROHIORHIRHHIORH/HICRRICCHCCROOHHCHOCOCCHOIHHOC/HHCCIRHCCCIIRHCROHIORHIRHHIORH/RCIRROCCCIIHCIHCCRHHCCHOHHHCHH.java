package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Map;
import net.minecraft.network.play.server.SPacketMaps;
import net.minecraft.util.Vec4b;
import net.minecraft.world.storage.MapData;
import net.minecraft.world.storage.MapDecoration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(MapData.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public Map<String, Vec4b> mapDecorations$v1_8;
   @Shadow
   public Map<String, MapDecoration> mapDecorations$v1_12;
   @Shadow
   public byte[] colors;
   @Shadow
   public byte scale;
   @Shadow
   public boolean trackingPosition$v1_12;

   public Map<String, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$getMapDecorations() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.mapDecorations$v1_12;
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.mapDecorations$v1_8 : Map.of();
      }
   }

   public void bridge$setMapDecorations(
      Map<String, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.mapDecorations$v1_12 = var1;
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.mapDecorations$v1_8 = var1;
      }
   }

   public byte[] bridge$getColors() {
      return this.colors;
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getMapPacket(Object var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         return (CRRRICCRROCOHHOHIICIHORCOORRRH)(new SPacketMaps((Integer)var1, this.colors));
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1
            ? (CRRRICCRROCOHHOHIICIHORCOORRRH)(new SPacketMaps((Integer)var1, this.scale, this.mapDecorations$v1_8.values(), this.colors, 0, 0, 128, 128))
            : (CRRRICCRROCOHHOHIICIHORCOORRRH)(
               new SPacketMaps((Integer)var1, this.scale, this.trackingPosition$v1_12, this.mapDecorations$v1_12.values(), this.colors, 0, 0, 128, 128)
            );
      }
   }
}
