package com.moonsworth.lunar.client.mumble;

import lombok.Generated;

public final class MumbleVec {
   public double xCoord;
   public double yCoord;
   public double zCoord;

   @Generated
   public MumbleVec(double var1, double var3, double var5) {
      this.xCoord = var1;
      this.yCoord = var3;
      this.zCoord = var5;
   }

   @Generated
   @Override
   public String toString() {
      return "MumbleVec(xCoord=" + this.xCoord + ", yCoord=" + this.yCoord + ", zCoord=" + this.zCoord + ")";
   }
}
