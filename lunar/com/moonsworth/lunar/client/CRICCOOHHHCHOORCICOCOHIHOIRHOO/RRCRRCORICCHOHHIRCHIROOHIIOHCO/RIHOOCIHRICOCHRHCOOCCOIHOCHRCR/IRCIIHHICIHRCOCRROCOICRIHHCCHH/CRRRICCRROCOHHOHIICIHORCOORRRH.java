package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   DOWN(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.Y, -1),
   UP(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.Y, 1),
   NORTH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.Z, -1),
   SOUTH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.Z, 1),
   WEST(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.X, -1),
   EAST(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.X, 1);

   public static final CRRRICCRROCOHHOHIICIHORCOORRRH[] VALUES = values();
   private final CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH axis;
   private final int axisDirection;

   CRRRICCRROCOHHOHIICIHORCOORRRH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3, int var4) {
      this.axis = var3;
      this.axisDirection = var4;
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH getOpposite() {
      return switch (this) {
         case UP -> DOWN;
         case DOWN -> UP;
         case NORTH -> SOUTH;
         case SOUTH -> NORTH;
         case EAST -> WEST;
         case WEST -> EAST;
      };
   }

   public int getStepX() {
      return this.axis.choose(1, 0, 0) * this.axisDirection;
   }

   public int getStepY() {
      return this.axis.choose(0, 1, 0) * this.axisDirection;
   }

   public int getStepZ() {
      return this.axis.choose(0, 0, 1) * this.axisDirection;
   }

   @Generated
   public CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getAxis() {
      return this.axis;
   }

   @Generated
   public int getAxisDirection() {
      return this.axisDirection;
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      X,
      Y,
      Z;

      public static final CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] VALUES = values();

      public int choose(int var1, int var2, int var3) {
         return switch (this) {
            case X -> var1;
            case Y -> var2;
            case Z -> var3;
         };
      }

      public double choose(double var1, double var3, double var5) {
         return switch (this) {
            case X -> var1;
            case Y -> var3;
            case Z -> var5;
         };
      }
   }
}
