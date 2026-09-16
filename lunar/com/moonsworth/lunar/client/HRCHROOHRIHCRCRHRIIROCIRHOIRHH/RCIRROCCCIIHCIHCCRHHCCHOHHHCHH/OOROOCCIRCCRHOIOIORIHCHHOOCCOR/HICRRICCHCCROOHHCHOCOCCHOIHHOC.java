package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import lombok.Generated;

public abstract class HICRRICCHCCROOHHCHOCOCCHOIHHOC extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final double HICHRICIIOOIHIIRHCCOHOHICHHOCC;
   private final double RICHIROOHRHRRRHOHRCCCHROHRCORC;
   private final double OHOORCICRORIHIOCHRORIHHIHOORRC;
   private final float HRHHOORHOOHRHRHHOCRCOICCRORRCR;
   private final float OOHIHHRRIRIORIRIIOCOORRIRHCRCO;

   @Override
   public String toString() {
      return "{x: "
         + this.HICHRICIIOOIHIIRHCCOHOHICHHOCC
         + ", y: "
         + this.RICHIROOHRHRRRHOHRCCCHROHRCORC
         + ", z: "
         + this.OHOORCICRORIHIOCHRORIHHIHOORRC
         + ", rotX: "
         + this.HRHHOORHOOHRHRHHOCRCOICCRORRCR
         + ", rotY: "
         + this.OOHIHHRRIRIORIRIIOCOORRIRHCRCO
         + "}";
   }

   @Generated
   public double getX() {
      return this.HICHRICIIOOIHIIRHCCOHOHICHHOCC;
   }

   @Generated
   public double getY() {
      return this.RICHIROOHRHRRRHOHRCCCHROHRCORC;
   }

   @Generated
   public double getZ() {
      return this.OHOORCICRORIHIOCHRORIHHIHOORRC;
   }

   @Generated
   public float RIROOHCHCHIHCOHOICHOCRHCHHOIIC() {
      return this.HRHHOORHOOHRHRHHOCRCOICCRORRCR;
   }

   @Generated
   public float RCCCROCCCRORIOCIROROOOHHHRCHRO() {
      return this.OOHIHHRRIRIORIRIIOCOORRIRHCRCO;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (Double.compare(this.getX(), var2.getX()) != 0) {
         return false;
      } else if (Double.compare(this.getY(), var2.getY()) != 0) {
         return false;
      } else if (Double.compare(this.getZ(), var2.getZ()) != 0) {
         return false;
      } else {
         return Float.compare(this.RIROOHCHCHIHCOHOICHOCRHCHHOIIC(), var2.RIROOHCHCHIHCOHOICHOCRHCHHOIIC()) != 0
            ? false
            : Float.compare(this.RCCCROCCCRORIOCIROROOOHHHRCHRO(), var2.RCCCROCCCRORIOCIROROOOHHHRCHRO()) == 0;
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      long var3 = Double.doubleToLongBits(this.getX());
      var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
      long var5 = Double.doubleToLongBits(this.getY());
      var2 = var2 * 59 + (int)(var5 >>> 32 ^ var5);
      long var7 = Double.doubleToLongBits(this.getZ());
      var2 = var2 * 59 + (int)(var7 >>> 32 ^ var7);
      var2 = var2 * 59 + Float.floatToIntBits(this.RIROOHCHCHIHCOHOICHOCRHCHHOIIC());
      return var2 * 59 + Float.floatToIntBits(this.RCCCROCCCRORIOCIROROOOHHHRCHRO());
   }

   @Generated
   public HICRRICCHCCROOHHCHOCOCCHOIHHOC(double var1, double var3, double var5, float var7, float var8) {
      this.HICHRICIIOOIHIIRHCCOHOHICHHOCC = var1;
      this.RICHIROOHRHRRRHOHRCCCHROHRCORC = var3;
      this.OHOORCICRORIHIOCHRORIHHIHOORRC = var5;
      this.HRHHOORHOOHRHRHHOCRCOICCRORRCR = var7;
      this.OOHIHHRRIRIORIRIIOCOORRIRHCRCO = var8;
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HICRRICCHCCROOHHCHOCOCCHOIHHOC {
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(double var1, double var3, double var5, float var7, float var8) {
         super(var1, var3, var5, var7, var8);
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HICRRICCHCCROOHHCHOCOCCHOIHHOC {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1, double var3, double var5, float var7, float var8) {
         super(var1, var3, var5, var7, var8);
      }
   }
}
