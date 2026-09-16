package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EntityLiving.SpawnPlacementType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.storage.MapData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldClient.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   extends World
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Shadow
   public ChunkProviderClient clientChunkProvider;
   @Shadow
   public Set entityList;

   @Shadow
   public abstract void sendQuittingDisconnectingPacket();

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getScoreboard() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH)this.getScoreboard();
   }

   @Inject(method = "sendQuittingDisconnectingPacket()V", at = @At("HEAD"))
   private void lunar$sendQuittingDisconnectingPacket(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.HRHIOHRHORHOCIICRCHICCOIROORHC();
   }

   public void bridge$disconnect() {
      this.sendQuittingDisconnectingPacket();
   }

   public int bridge$getLoadedChunkCount() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1
         ? this.clientChunkProvider.getLoadedChunkCount$v1_7()
         : this.clientChunkProvider.loadedChunks$v1_12.size();
   }

   public long bridge$getGameTime() {
      return this.worldInfo.totalTime;
   }

   public long bridge$getDayTime() {
      return this.worldInfo.getWorldTime();
   }

   public boolean bridge$isRaining() {
      return this.isRaining();
   }

   public boolean bridge$isSnowing(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      Biome var2 = (Biome)this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1);
      float var3;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         var3 = var2.getTemperature$v1_12((BlockPos)var1);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         var3 = var2.getFloatTemperature$v1_8((BlockPos)var1);
      } else {
         var3 = var2.getFloatTemperature$v1_7(var1.bridge$getX(), var1.bridge$getY(), var1.bridge$getZ());
      }

      return var3 < 0.15F;
   }

   public boolean bridge$isThundering() {
      return this.isThundering();
   }

   public boolean bridge$canMonstersSpawn(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0
         ? WorldEntitySpawner.canCreatureTypeSpawnAtLocation$v1_7(
            EnumCreatureType.monster$v1_7, this, var1.bridge$getX(), var1.bridge$getY() + 1, var1.bridge$getZ()
         )
         : WorldEntitySpawner.canCreatureTypeSpawnAtLocation$v1_8(SpawnPlacementType.ON_GROUND, this, (BlockPos)var1.bridge$above());
   }

   public int bridge$calculateSkylightSubtract(long var1) {
      float var3 = this.provider.calculateCelestialAngle(var1, 1.0F);
      float var4 = 1.0F - (MathHelper.cos(var3 * (float) Math.PI * 2.0F) * 2.0F + 0.5F);
      var4 = 1.0F - Math.max(0.0F, Math.min(1.0F, var4));
      var4 = (float)(var4 * (1.0 - this.rainingStrength * 5.0F / 16.0));
      var4 = (float)(var4 * (1.0 - this.thunderingStrength * 5.0F / 16.0));
      var4 = 1.0F - var4;
      return (int)(var4 * 11.0F);
   }

   public Iterable<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$entitiesForRendering() {
      return this.entityList;
   }

   public int bridge$getLightLevel(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, boolean var2, boolean var3
   ) {
      Chunk var4;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         var4 = this.getChunkFromBlockCoords$v1_7(var1.bridge$getX(), var1.bridge$getZ());
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         var4 = this.getChunkFromBlockCoords$v1_8((BlockPos)var1);
      } else {
         var4 = this.getChunk$v1_12((BlockPos)var1);
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         int var5 = var1.bridge$getX() & 15;
         int var6 = var1.bridge$getZ() & 15;
         if (var2 && var3) {
            int var7 = var4.getSavedLightValue$v1_7(EnumSkyBlock.Block$v1_7, var5, var1.bridge$getY(), var6);
            int var8 = var4.getSavedLightValue$v1_7(EnumSkyBlock.Sky$v1_7, var5, var1.bridge$getY(), var6);
            return Math.max(var7, var8);
         } else if (!var2 && !var3) {
            throw new IllegalStateException("bridge$getLightLevel requires either block or sky to be true!");
         } else {
            return var4.getSavedLightValue$v1_7(var3 ? EnumSkyBlock.Sky$v1_7 : EnumSkyBlock.Block$v1_7, var5, var1.bridge$getY(), var6);
         }
      } else if (var2) {
         return var3 ? var4.getLightSubtracted$v1_8((BlockPos)var1, 0) : var4.getLightFor$v1_8(EnumSkyBlock.BLOCK$v1_8, (BlockPos)var1);
      } else if (var3) {
         return var4.getLightFor$v1_8(EnumSkyBlock.SKY$v1_8, (BlockPos)var1);
      } else {
         throw new IllegalStateException("bridge$getLightLevel requires either block or sky to be true!");
      }
   }

   public Map<Object, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getAllMapData() {
      HashMap var1 = new HashMap();
      Map var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.mapStorage.loadedDataMap$v1_8 : this.mapStorage.loadedDataMap$v1_7;

      for (Object var4 : var2.values()) {
         if (var4 instanceof MapData var5) {
            String var6 = var5.mapName;
            if (var6.startsWith("map_")) {
               var6 = var6.substring(4);
            }

            try {
               var1.put(
                  Integer.parseInt(var6),
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4
               );
            } catch (NumberFormatException var8) {
            }
         }
      }

      return var1;
   }

   public int bridge$getFoliageColor(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return BiomeColorHelper.getFoliageColorAtPos(this, (BlockPos)var1);
      }

      int var2 = var1.bridge$getX();
      int var3 = var1.bridge$getY();
      int var4 = var1.bridge$getZ();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for (int var8 = -1; var8 <= 1; var8++) {
         for (int var9 = -1; var9 <= 1; var9++) {
            int var10 = this.getBiomeGenForCoords$v1_7(var2 + var9, var4 + var8).getBiomeFoliageColor$v1_7(var2 + var9, var3, var4 + var8);
            var5 += (var10 & 0xFF0000) >> 16;
            var6 += (var10 & 0xFF00) >> 8;
            var7 += var10 & 0xFF;
         }
      }

      return (var5 / 9 & 0xFF) << 16 | (var6 / 9 & 0xFF) << 8 | var7 / 9 & 0xFF;
   }
}
