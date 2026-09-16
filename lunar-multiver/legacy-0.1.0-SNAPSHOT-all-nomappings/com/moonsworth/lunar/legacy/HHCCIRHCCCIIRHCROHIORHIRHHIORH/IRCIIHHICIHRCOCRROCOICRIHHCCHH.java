package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import org.joml.Vector3i;
import org.joml.Vector3ic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Vector3ic.class)
public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends HHCCIRHCCCIIRHCROHIORHIRHHIORH,
   OHIIIOHIRIRCCRRIOIICCHHIORRHOH,
   RORCHCIIICOHIRROOORHOCCCCIOCCI,
   Vector3ic {
   @Shadow
   Vector3i add(Vector3ic var1, Vector3i var2);

   @Shadow
   int x();

   @Shadow
   int y();

   @Shadow
   int z();

   default int bridge$getX() {
      return this.x();
   }

   default int bridge$getY() {
      return this.y();
   }

   default int bridge$getZ() {
      return this.z();
   }

   default HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$add(Vector3ic var1) {
      return (HHCCIRHCCCIIRHCROHIORHIRHHIORH)(new Vector3i(this.x() + var1.x(), this.y() + var1.y(), this.z() + var1.z()));
   }

   default long bridge$asLong() {
      return this.hashCode();
   }
}
