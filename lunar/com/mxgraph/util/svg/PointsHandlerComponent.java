package com.mxgraph.util.svg;

import java.awt.Shape;
import java.awt.geom.GeneralPath;

public class AWTPolylineProducer implements PointsHandler, ShapeProducer {
   protected GeneralPath path;
   protected boolean newPath;
   protected int windingRule;

   public static Shape createShape(String var0, int var1) {
      AWTPolylineProducer var2 = new AWTPolylineProducer();
      var2.setWindingRule(var1);
      PointsParser var3 = new PointsParser(var2);
      var3.parse(var0);
      return var2.getShape();
   }

   @Override
   public void setWindingRule(int var1) {
      this.windingRule = var1;
   }

   @Override
   public int getWindingRule() {
      return this.windingRule;
   }

   @Override
   public Shape getShape() {
      return this.path;
   }

   @Override
   public void startPoints() {
      this.path = new GeneralPath(this.windingRule);
      this.newPath = true;
   }

   @Override
   public void point(float var1, float var2) {
      if (this.newPath) {
         this.newPath = false;
         this.path.moveTo(var1, var2);
      } else {
         this.path.lineTo(var1, var2);
      }
   }

   @Override
   public void endPoints() {
   }
}
