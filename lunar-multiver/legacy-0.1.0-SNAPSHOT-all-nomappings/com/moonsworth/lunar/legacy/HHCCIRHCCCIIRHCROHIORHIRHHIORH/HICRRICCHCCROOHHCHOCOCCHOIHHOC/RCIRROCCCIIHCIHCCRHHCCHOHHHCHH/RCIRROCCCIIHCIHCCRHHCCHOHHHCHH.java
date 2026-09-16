package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Optional;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Biome.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Final
   @Shadow
   public String biomeName;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Final
   @Shadow
   public int biomeID$v1_7;

   @Shadow
   public static int getIdForBiome$v1_12(Biome var0) {
      return 0;
   }

   @Shadow
   public abstract float getTemperature$v1_12(BlockPos var1);

   @Shadow
   public abstract float getFloatTemperature$v1_7(int var1, int var2, int var3);

   @Shadow
   public abstract float getFloatTemperature$v1_8(BlockPos var1);

   public String bridge$getBiomeName() {
      return this.biomeName;
   }

   public Optional<Integer> bridge$getBiomeID() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? Optional.of(getIdForBiome$v1_12((Biome)this)) : Optional.of(this.biomeID$v1_7);
   }

   public float bridge$getTemperature(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         return this.getFloatTemperature$v1_7(var1.bridge$getX(), var1.bridge$getY(), var1.bridge$getZ());
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1 ? this.getFloatTemperature$v1_8((BlockPos)var1) : this.getTemperature$v1_12((BlockPos)var1);
      }
   }
}
