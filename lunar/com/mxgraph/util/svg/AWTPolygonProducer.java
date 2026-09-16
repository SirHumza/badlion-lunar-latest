package com.mxgraph.util.svg;

import java.awt.Shape;

public class AWTPolygonProducer extends AWTPolylineProducer {
   public static Shape createShape(String var0, int var1) {
      AWTPolygonProducer var2 = new AWTPolygonProducer();
      var2.setWindingRule(var1);
      PointsParser var3 = new PointsParser(var2);
      var3.parse(var0);
      return var2.getShape();
   }

   @Override
   public void endPoints() {
      this.path.closePath();
   }
}
