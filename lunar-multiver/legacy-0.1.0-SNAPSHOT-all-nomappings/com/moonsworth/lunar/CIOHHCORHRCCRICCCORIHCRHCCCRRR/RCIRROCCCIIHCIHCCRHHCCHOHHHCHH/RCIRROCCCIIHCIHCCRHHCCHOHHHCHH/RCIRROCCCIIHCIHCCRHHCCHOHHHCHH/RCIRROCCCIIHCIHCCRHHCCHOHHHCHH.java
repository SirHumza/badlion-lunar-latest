package com.moonsworth.lunar.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import java.util.Optional;
import net.minecraft.util.BlockPos;
import net.minecraft.world.biome.BiomeGenBase;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(BiomeGenBase.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public String biomeName;
   @Final
   @Shadow
   public int biomeID;

   @Shadow
   public abstract float getFloatTemperature(BlockPos var1);

   public String bridge$getBiomeName() {
      return this.biomeName;
   }

   public Optional<Integer> bridge$getBiomeID() {
      return Optional.of(this.biomeID);
   }

   public float bridge$getTemperature(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return this.getFloatTemperature((BlockPos)var1);
   }
}
