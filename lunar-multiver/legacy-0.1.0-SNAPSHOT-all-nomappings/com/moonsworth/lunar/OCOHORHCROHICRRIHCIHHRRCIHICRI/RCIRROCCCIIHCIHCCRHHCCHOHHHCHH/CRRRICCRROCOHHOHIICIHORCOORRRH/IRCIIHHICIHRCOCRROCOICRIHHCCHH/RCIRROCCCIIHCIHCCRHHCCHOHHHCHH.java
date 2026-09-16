package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.Chunk;
import org.joml.Vector3i;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = Chunk.class, priority = 201)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public int xPosition;
   @Final
   @Shadow
   public int zPosition;

   @Shadow
   public abstract void getEntitiesWithinAABBForEntity(Entity var1, AxisAlignedBB var2, List var3, IEntitySelector var4);

   @Shadow
   public abstract BiomeGenBase getBiomeGenForWorldCoords(int var1, int var2, WorldChunkManager var3);

   public List<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getEntities(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      Predicate<? super CRRRICCRROCOHHOHIICIHORCOORRRH> var2
   ) {
      ArrayList var3 = new ArrayList();
      this.getEntitiesWithinAABBForEntity(
         null,
         (AxisAlignedBB)var1,
         var3,
         new com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2
         )
      );
      return var3;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getBiome(Vector3i var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2) {
      return (IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getBiomeGenForWorldCoords(
         var1.x() - this.xPosition * 16 & 15, var1.z() - this.zPosition * 16 & 15, (WorldChunkManager)var2
      );
   }
}
