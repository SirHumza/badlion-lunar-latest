package com.moonsworth.lunar.client.util;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.Optional;
import lombok.Generated;

public final class HRRHRCCOOIOIIIRORIOOORORHOORIH {
   public static double RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Line2D var0) {
      return (var0.getY2() - var0.getY1()) / (var0.getX2() - var0.getX1());
   }

   public static double IRCIIHHICIHRCOCRROCOICRIHHCCHH(Line2D var0) {
      return var0.getY1() - RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0) * var0.getX1();
   }

   public static Optional<Point2D> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Line2D var0, Line2D var1) {
      if (!var0.intersectsLine(var1)) {
         return Optional.empty();
      }

      double var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
      double var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      double var6 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
      double var8 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
      double var10 = (var8 - var6) / (var2 - var4);
      double var12 = var2 * var10 + var6;
      return Optional.of(new Double(var10, var12));
   }

   @Generated
   private HRRHRCCOOIOIIIRORIOOORORHOORIH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
