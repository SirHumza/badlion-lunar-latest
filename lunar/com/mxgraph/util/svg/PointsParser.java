package com.mxgraph.util.svg;

public class PointsParser extends NumberParser {
   protected PointsHandler pointsHandler;
   protected boolean eRead;

   public PointsParser(PointsHandler var1) {
      this.pointsHandler = var1;
   }

   public void setPointsHandler(PointsHandler var1) {
      this.pointsHandler = var1;
   }

   public PointsHandler getPointsHandler() {
      return this.pointsHandler;
   }

   @Override
   protected void doParse() {
      this.pointsHandler.startPoints();
      this.current = this.reader.read();
      this.skipSpaces();

      while (this.current != -1) {
         float var1 = this.parseFloat();
         this.skipCommaSpaces();
         float var2 = this.parseFloat();
         this.pointsHandler.point(var1, var2);
         this.skipCommaSpaces();
      }

      this.pointsHandler.endPoints();
   }
}
