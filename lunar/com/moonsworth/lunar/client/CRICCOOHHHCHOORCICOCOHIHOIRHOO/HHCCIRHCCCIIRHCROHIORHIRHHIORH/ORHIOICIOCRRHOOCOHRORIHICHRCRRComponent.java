package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum RRCRRCORICCHOHHIRCHIROOHIIOHCO implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   TOP_LEFT(
      "topLeft",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.LEFT,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.TOP
   ),
   TOP_CENTER(
      "topCenter",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.MIDDLE,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.TOP
   ),
   TOP_RIGHT(
      "topRight",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIGHT,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.TOP
   ),
   MIDDLE_LEFT(
      "middleLeft",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.LEFT,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.MIDDLE
   ),
   MIDDLE_CENTER(
      "middleCenter",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.MIDDLE,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.MIDDLE
   ),
   MIDDLE_RIGHT(
      "middleRight",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIGHT,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.MIDDLE
   ),
   BOTTOM_LEFT(
      "bottomLeft",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.LEFT,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOTTOM
   ),
   BOTTOM_CENTER_L(
      "bottomCenterLeft",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIGHT,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOTTOM
   ),
   BOTTOM_CENTER_R(
      "bottomCenterRight",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.LEFT,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOTTOM
   ),
   BOTTOM_RIGHT(
      "bottomRight",
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIGHT,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOTTOM
   );

   public static final float PAD = 2.0F;
   private static final float BOTTOM_CENTER_REACH = 30.0F;
   private final String id;
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH horizontal;
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH vertical;

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.id;
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO fromId(String var0) {
      for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 : values()) {
         if (var0.equals(var4.id)) {
            return var4;
         }
      }

      return null;
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO getMousePosition(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      return getMousePosition(
         var0,
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.COCCCCOIIOCCOICRRRIRORHOIHHCRI()
            .RRHOHHRRCHRROORRRHIRORHORIIIII()
      );
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO getMousePosition(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      double var2 = var0.ICORIROICCORCRROCRCIRRRHHHOOIR();
      double var4 = var0.OICOHRRRRCOICCHOIOROHOCOORCHII();
      double var6 = var1.ICORIROICCORCRROCRCIRRRHHHOOIR();
      double var8 = var1.OICOHRRRRCOICCHOIOROHOCOORCHII();
      if (var2 < var6 / 3.0 && var4 < var8 / 3.0) {
         return TOP_LEFT;
      } else if (var2 > var6 / 3.0 * 2.0 && var4 < var8 / 3.0) {
         return TOP_RIGHT;
      } else if (var4 < var8 / 3.0) {
         return TOP_CENTER;
      } else if (var2 < var6 / 3.0 && var4 < var8 / 3.0 * 2.0) {
         return MIDDLE_LEFT;
      } else if (var2 > var6 / 3.0 * 2.0 && var4 < var8 / 3.0 * 2.0) {
         return MIDDLE_RIGHT;
      } else if (var4 < var8 / 3.0 * 2.0) {
         return MIDDLE_CENTER;
      } else if (var2 < var6 / 3.0) {
         return BOTTOM_LEFT;
      } else if (var2 < var6 / 3.0 * 2.0) {
         return var2 > var6 / 3.0 + var6 / 6.0 ? BOTTOM_CENTER_R : BOTTOM_CENTER_L;
      } else {
         return BOTTOM_RIGHT;
      }
   }

   public static double anchorOriginX(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, double var1, double var3) {
      return switch (var0) {
         case TOP_LEFT, MIDDLE_LEFT, BOTTOM_LEFT -> 2.0;
         case TOP_CENTER, MIDDLE_CENTER -> var1 / 2.0 - var3 / 2.0;
         case BOTTOM_CENTER_L -> var1 / 2.0 - var3 + 30.0;
         case BOTTOM_CENTER_R -> var1 / 2.0 - 30.0;
         case TOP_RIGHT, MIDDLE_RIGHT, BOTTOM_RIGHT -> var1 - var3 - 2.0;
      };
   }

   public static double scalePivotX(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, double var1, double var3, double var5) {
      return var1 - edgeRateX(var0, var3, false) * var5;
   }

   public static double scalePivotY(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, double var1, double var3, double var5) {
      return var1 - edgeRateY(var0, var3, false) * var5;
   }

   private static double edgeRateX(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, double var1, boolean var3) {
      double var4 = switch (var0) {
         case TOP_LEFT, MIDDLE_LEFT, BOTTOM_LEFT -> 2.0;
         case TOP_CENTER, MIDDLE_CENTER -> -var1 / 2.0;
         case BOTTOM_CENTER_L -> 30.0 - var1;
         case BOTTOM_CENTER_R -> -30.0;
         case TOP_RIGHT, MIDDLE_RIGHT, BOTTOM_RIGHT -> -var1 - 2.0;
      };
      return var3 ? var4 + var1 : var4;
   }

   private static double edgeRateY(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, double var1, boolean var3) {
      double var4 = switch (var0) {
         case TOP_LEFT, TOP_CENTER, TOP_RIGHT -> 2.0;
         case MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT -> -var1 / 2.0;
         case BOTTOM_LEFT, BOTTOM_CENTER_L, BOTTOM_CENTER_R, BOTTOM_RIGHT -> -var1 - 2.0;
      };
      return var3 ? var4 + var1 : var4;
   }

   public static double anchorOriginY(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, double var1, double var3) {
      return switch (var0) {
         case TOP_LEFT, TOP_CENTER, TOP_RIGHT -> 2.0;
         case MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT -> var1 / 2.0 - var3 / 2.0;
         case BOTTOM_LEFT, BOTTOM_CENTER_L, BOTTOM_CENTER_R, BOTTOM_RIGHT -> var1 - var3 - 2.0;
      };
   }

   @Generated
   RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      String var3,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5
   ) {
      this.id = var3;
      this.horizontal = var4;
      this.vertical = var5;
   }

   @Generated
   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH getHorizontal() {
      return this.horizontal;
   }

   @Generated
   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH getVertical() {
      return this.vertical;
   }
}
