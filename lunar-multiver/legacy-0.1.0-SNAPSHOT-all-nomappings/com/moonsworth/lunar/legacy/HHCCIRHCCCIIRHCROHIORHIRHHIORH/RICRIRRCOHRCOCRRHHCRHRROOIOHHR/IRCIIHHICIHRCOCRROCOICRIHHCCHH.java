package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.util.math.AxisAlignedBB;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AxisAlignedBB.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public double minX;
   @Final
   @Shadow
   public double minY;
   @Final
   @Shadow
   public double minZ;
   @Final
   @Shadow
   public double maxX;
   @Final
   @Shadow
   public double maxY;
   @Final
   @Shadow
   public double maxZ;

   @Shadow
   public abstract double calculateXOffset(AxisAlignedBB var1, double var2);

   @Shadow
   public abstract double calculateYOffset(AxisAlignedBB var1, double var2);

   @Shadow
   public abstract double calculateZOffset(AxisAlignedBB var1, double var2);

   @Shadow
   public abstract AxisAlignedBB offset(double var1, double var3, double var5);

   @Shadow
   public abstract AxisAlignedBB expand(double var1, double var3, double var5);

   @Shadow
   public abstract boolean intersectsWith$v1_7(AxisAlignedBB var1);

   @Shadow
   public abstract boolean intersects$v1_12(AxisAlignedBB var1);

   @Shadow
   public abstract boolean hasNaN$v1_8();

   @Shadow
   public abstract AxisAlignedBB union(AxisAlignedBB var1);

   public double bridge$getMinX() {
      return this.minX;
   }

   public double bridge$getMinY() {
      return this.minY;
   }

   public double bridge$getMinZ() {
      return this.minZ;
   }

   public double bridge$getMaxX() {
      return this.maxX;
   }

   public double bridge$getMaxY() {
      return this.maxY;
   }

   public double bridge$getMaxZ() {
      return this.maxZ;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$expand(
      double var1, double var3, double var5
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.expand(var1, var3, var5);
      }

      double var7 = this.minX;
      double var9 = this.minY;
      double var11 = this.minZ;
      double var13 = this.maxX;
      double var15 = this.maxY;
      double var17 = this.maxZ;
      if (var1 < 0.0) {
         var7 += var1;
      } else if (var1 > 0.0) {
         var13 += var1;
      }

      if (var3 < 0.0) {
         var9 += var3;
      } else if (var3 > 0.0) {
         var15 += var3;
      }

      if (var5 < 0.0) {
         var11 += var5;
      } else if (var5 > 0.0) {
         var17 += var5;
      }

      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
         new AxisAlignedBB(var7, var9, var11, var13, var15, var17)
      );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$offset(
      double var1, double var3, double var5
   ) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.offset(var1, var3, var5);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$union(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.union((AxisAlignedBB)var1);
   }

   public boolean bridge$intersectsWith(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? this.intersects$v1_12((AxisAlignedBB)var1) : this.intersectsWith$v1_7((AxisAlignedBB)var1);
   }

   public double bridge$calculateXOffset(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, double var2
   ) {
      return this.calculateXOffset((AxisAlignedBB)var1, var2);
   }

   public double bridge$calculateYOffset(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, double var2
   ) {
      return this.calculateYOffset((AxisAlignedBB)var1, var2);
   }

   public double bridge$calculateZOffset(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, double var2
   ) {
      return this.calculateZOffset((AxisAlignedBB)var1, var2);
   }

   public boolean bridge$hasNaN() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.hasNaN$v1_8() : false;
   }

   public double bridge$getSize() {
      double var1 = this.maxX - this.minX;
      double var3 = this.maxY - this.minY;
      double var5 = this.maxZ - this.minZ;
      return (var1 + var3 + var5) / 3.0;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof AxisAlignedBB var2)) {
         return false;
      } else if (Double.compare(var2.minX, this.minX) != 0) {
         return false;
      } else if (Double.compare(var2.minY, this.minY) != 0) {
         return false;
      } else if (Double.compare(var2.minZ, this.minZ) != 0) {
         return false;
      } else if (Double.compare(var2.maxX, this.maxX) != 0) {
         return false;
      } else {
         return Double.compare(var2.maxY, this.maxY) != 0 ? false : Double.compare(var2.maxZ, this.maxZ) == 0;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Override
   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.minX);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.minY);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.minZ);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.maxX);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.maxY);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.maxZ);
      return 31 * var3 + (int)(var1 ^ var1 >>> 32);
   }
}
