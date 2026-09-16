package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import org.joml.Vector3i;
import org.joml.Vector3ic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Vector3i.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements HHCCIRHCCCIIRHCROHIORHIRHHIORH,
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   Vector3ic {
   @Shadow
   public abstract Vector3i add(Vector3ic var1);

   @Shadow
   public abstract Vector3i set(int var1, int var2, int var3);

   public int bridge$getX() {
      return this.x();
   }

   public int bridge$getY() {
      return this.y();
   }

   public int bridge$getZ() {
      return this.z();
   }

   public void bridge$setPos(int var1, int var2, int var3) {
      this.set(var1, var2, var3);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$add(Vector3ic var1) {
      return (HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.add(var1);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$below() {
      return super.bridge$below();
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$above() {
      return super.bridge$above();
   }

   public long bridge$asLong() {
      return this.hashCode();
   }

   public Vector3i bridge$toJoml() {
      return (Vector3i)this;
   }
}
