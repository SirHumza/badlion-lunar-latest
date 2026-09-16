package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import net.minecraft.util.math.AxisAlignedBB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AxisAlignedBB.class)
public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Mutable
   @Accessor("minY")
   void bridge$setMinY(double var1);

   @Mutable
   @Accessor("maxY")
   void bridge$setMaxY(double var1);
}
