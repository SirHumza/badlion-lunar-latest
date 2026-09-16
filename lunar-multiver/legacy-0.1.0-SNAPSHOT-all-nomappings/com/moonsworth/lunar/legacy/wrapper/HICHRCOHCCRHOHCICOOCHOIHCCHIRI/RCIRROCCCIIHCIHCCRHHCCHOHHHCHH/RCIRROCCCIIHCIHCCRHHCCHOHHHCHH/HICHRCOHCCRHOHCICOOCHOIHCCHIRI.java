package com.moonsworth.lunar.legacy.wrapper.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import net.minecraft.network.play.server.S26PacketMapChunkBulk;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   extends RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH> var1
   ) {
      super(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1 ? S26PacketMapChunkBulk.class : SPacketChunkData.class, var1);
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1
   ) {
      World var2 = (World)var1;
      ArrayList var3 = new ArrayList();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
            var3.add(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
                  new S26PacketMapChunkBulk(((ChunkProviderClient)var2.getChunkProvider()).chunkListing$v1_7)
               )
            );
         } else {
            var3.add(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
                  new S26PacketMapChunkBulk(((ChunkProviderClient)var2.getChunkProvider()).chunkListing$v1_8)
               )
            );
         }

         for (TileEntity var6 : IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0
            ? ((ChunkProviderClient)var2.getChunkProvider()).world.loadedTileEntityList$v1_7
            : ((ChunkProviderClient)var2.getChunkProvider()).world.loadedTileEntityList$v1_8) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
               var3.add(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)var6.getDescriptionPacket$v1_7()
               );
            } else {
               var3.add(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)var6.getDescriptionPacket$v1_8()
               );
            }
         }
      } else {
         ObjectIterator var7 = ((ChunkProviderClient)var2.getChunkProvider()).loadedChunks$v1_12.values().iterator();

         while (var7.hasNext()) {
            Chunk var8 = (Chunk)var7.next();
            if (var8 != null) {
               var3.add(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(
                     new SPacketChunkData(var8, 65535)
                  )
               );
            }
         }
      }

      return var3;
   }
}
