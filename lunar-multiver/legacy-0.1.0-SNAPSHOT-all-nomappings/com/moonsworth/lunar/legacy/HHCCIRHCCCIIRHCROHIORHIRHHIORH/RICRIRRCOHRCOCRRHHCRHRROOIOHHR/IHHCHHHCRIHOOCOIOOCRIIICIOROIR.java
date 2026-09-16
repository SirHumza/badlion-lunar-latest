package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Vec3d.class)
public interface IHHCHHHCRIHOOCOIOOCRIIICIOROIR {
   @Mutable
   @Accessor("x")
   void bridge$setX(double var1);

   @Mutable
   @Accessor("y")
   void bridge$setY(double var1);

   @Mutable
   @Accessor("z")
   void bridge$setZ(double var1);
}
