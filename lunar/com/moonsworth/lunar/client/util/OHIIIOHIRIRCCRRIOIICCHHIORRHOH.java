package com.moonsworth.lunar.client.util;

import java.util.concurrent.ThreadLocalRandom;

public enum OHIIIOHIRIRCCRRIOIICCHHIORRHOH {
   TOP,
   BOTTOM,
   RIGHT,
   LEFT;

   public OHIIIOHIRIRCCRRIOIICCHHIORRHOH getOpposite() {
      return switch (this) {
         case TOP -> BOTTOM;
         case BOTTOM -> TOP;
         case RIGHT -> LEFT;
         case LEFT -> RIGHT;
      };
   }

   public OHIIIOHIRIRCCRRIOIICCHHIORRHOH rotate90CW() {
      return switch (this) {
         case TOP -> RIGHT;
         case BOTTOM -> LEFT;
         case RIGHT -> BOTTOM;
         case LEFT -> TOP;
      };
   }

   public OHIIIOHIRIRCCRRIOIICCHHIORRHOH rotate90CCW() {
      return switch (this) {
         case TOP -> LEFT;
         case BOTTOM -> RIGHT;
         case RIGHT -> TOP;
         case LEFT -> BOTTOM;
      };
   }

   public boolean isVertical() {
      return this.ordinal() < 2;
   }

   public int offsetX() {
      return this == RIGHT ? 1 : (this == LEFT ? -1 : 0);
   }

   public int offsetY() {
      return this == TOP ? 1 : (this == BOTTOM ? -1 : 0);
   }

   public static OHIIIOHIRIRCCRRIOIICCHHIORRHOH getRandom() {
      OHIIIOHIRIRCCRRIOIICCHHIORRHOH[] var0 = values();
      return var0[ThreadLocalRandom.current().nextInt(var0.length)];
   }

   public static OHIIIOHIRIRCCRRIOIICCHHIORRHOH[] getAxis(boolean var0) {
      return var0 ? new OHIIIOHIRIRCCRRIOIICCHHIORRHOH[]{TOP, BOTTOM} : new OHIIIOHIRIRCCRRIOIICCHHIORRHOH[]{RIGHT, LEFT};
   }
}
