package net.optifine.override;

import java.util.Arrays;
import net.optifine.DynamicLights;
import net.optifine.reflect.Reflector;
import net.optifine.util.ArrayCache;

public class ChunkCacheOF implements adq {
   private final adv chunkCache;
   private final int posX;
   private final int posY;
   private final int posZ;
   private final int sizeX;
   private final int sizeY;
   private final int sizeZ;
   private final int sizeXY;
   private int[] combinedLights;
   private alz[] blockStates;
   private final int arraySize;
   private final boolean dynamicLights = Config.isDynamicLights();
   private static final ArrayCache cacheCombinedLights = new ArrayCache(int.class, 16);
   private static final ArrayCache cacheBlockStates = new ArrayCache(alz.class, 16);

   public ChunkCacheOF(adv chunkCache, cj posFromIn, cj posToIn, int subIn) {
      this.chunkCache = chunkCache;
      int minChunkX = posFromIn.n() - subIn >> 4;
      int minChunkY = posFromIn.o() - subIn >> 4;
      int minChunkZ = posFromIn.p() - subIn >> 4;
      int maxChunkX = posToIn.n() + subIn >> 4;
      int maxChunkY = posToIn.o() + subIn >> 4;
      int maxChunkZ = posToIn.p() + subIn >> 4;
      this.sizeX = maxChunkX - minChunkX + 1 << 4;
      this.sizeY = maxChunkY - minChunkY + 1 << 4;
      this.sizeZ = maxChunkZ - minChunkZ + 1 << 4;
      this.sizeXY = this.sizeX * this.sizeY;
      this.arraySize = this.sizeX * this.sizeY * this.sizeZ;
      this.posX = minChunkX << 4;
      this.posY = minChunkY << 4;
      this.posZ = minChunkZ << 4;
   }

   private int getPositionIndex(cj pos) {
      int dx = pos.n() - this.posX;
      if (dx >= 0 && dx < this.sizeX) {
         int dy = pos.o() - this.posY;
         if (dy >= 0 && dy < this.sizeY) {
            int dz = pos.p() - this.posZ;
            return dz >= 0 && dz < this.sizeZ ? dz * this.sizeXY + dy * this.sizeX + dx : -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public int b(cj pos, int lightValue) {
      int index = this.getPositionIndex(pos);
      if (index >= 0 && index < this.arraySize && this.combinedLights != null) {
         int light = this.combinedLights[index];
         if (light == -1) {
            light = this.getCombinedLightRaw(pos, lightValue);
            this.combinedLights[index] = light;
         }

         return light;
      } else {
         return this.getCombinedLightRaw(pos, lightValue);
      }
   }

   private int getCombinedLightRaw(cj pos, int lightValue) {
      int light = this.chunkCache.b(pos, lightValue);
      if (this.dynamicLights && !this.p(pos).c().c()) {
         light = DynamicLights.getCombinedLight(pos, light);
      }

      return light;
   }

   public alz p(cj pos) {
      int index = this.getPositionIndex(pos);
      if (index >= 0 && index < this.arraySize && this.blockStates != null) {
         alz iblockstate = this.blockStates[index];
         if (iblockstate == null) {
            iblockstate = this.chunkCache.p(pos);
            this.blockStates[index] = iblockstate;
         }

         return iblockstate;
      } else {
         return this.chunkCache.p(pos);
      }
   }

   public void renderStart() {
      if (this.combinedLights == null) {
         this.combinedLights = (int[])cacheCombinedLights.allocate(this.arraySize);
      }

      Arrays.fill(this.combinedLights, -1);
      if (this.blockStates == null) {
         this.blockStates = (alz[])cacheBlockStates.allocate(this.arraySize);
      }

      Arrays.fill(this.blockStates, null);
   }

   public void renderFinish() {
      cacheCombinedLights.free(this.combinedLights);
      this.combinedLights = null;
      cacheBlockStates.free(this.blockStates);
      this.blockStates = null;
   }

   public boolean W() {
      return this.chunkCache.W();
   }

   public ady b(cj pos) {
      return this.chunkCache.b(pos);
   }

   public int a(cj pos, cq direction) {
      return this.chunkCache.a(pos, direction);
   }

   public akw s(cj pos) {
      return this.chunkCache.s(pos);
   }

   public adr G() {
      return this.chunkCache.G();
   }

   public boolean d(cj pos) {
      return this.chunkCache.d(pos);
   }

   public boolean isSideSolid(cj pos, cq side, boolean _default) {
      return Reflector.callBoolean(this.chunkCache, Reflector.ForgeChunkCache_isSideSolid, pos, side, _default);
   }
}
