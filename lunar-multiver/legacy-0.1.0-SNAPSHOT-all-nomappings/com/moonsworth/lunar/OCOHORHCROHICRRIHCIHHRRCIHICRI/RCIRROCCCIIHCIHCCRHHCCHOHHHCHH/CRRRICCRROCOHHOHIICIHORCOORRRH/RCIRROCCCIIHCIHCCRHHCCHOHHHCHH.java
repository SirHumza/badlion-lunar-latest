package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = World.class, priority = 201)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Shadow
   public abstract List getEntitiesWithinAABBExcludingEntity(Entity var1, AxisAlignedBB var2, IEntitySelector var3);

   @Shadow
   public abstract BiomeGenBase getBiomeGenForCoords(int var1, int var2);

   public List<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getEntities(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      Predicate<? super CRRRICCRROCOHHOHIICIHORCOORRRH> var2
   ) {
      return this.getEntitiesWithinAABBExcludingEntity(
         null,
         (AxisAlignedBB)var1,
         new com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2
         )
      );
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getBiome(int var1, int var2, int var3) {
      return (IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getBiomeGenForCoords(var1, var3);
   }
}
