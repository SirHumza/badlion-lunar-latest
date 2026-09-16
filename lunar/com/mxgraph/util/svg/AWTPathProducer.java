package com.mxgraph.util.svg;

import java.awt.Shape;
import java.awt.geom.Point2D;

public class AWTPathProducer implements PathHandler, ShapeProducer {
   protected ExtendedGeneralPath path;
   protected float currentX;
   protected float currentY;
   protected float xCenter;
   protected float yCenter;
   protected int windingRule;

   public static Shape createShape(String var0, int var1) {
      AWTPathProducer var2 = new AWTPathProducer();
      var2.setWindingRule(var1);
      PathParser var3 = new PathParser(var2);
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
   public void startPath() {
      this.currentX = 0.0F;
      this.currentY = 0.0F;
      this.xCenter = 0.0F;
      this.yCenter = 0.0F;
      this.path = new ExtendedGeneralPath(this.windingRule);
   }

   @Override
   public void endPath() {
   }

   @Override
   public void movetoRel(float var1, float var2) {
      this.path.moveTo(this.xCenter = this.currentX += var1, this.yCenter = this.currentY += var2);
   }

   @Override
   public void movetoAbs(float var1, float var2) {
      this.path.moveTo(this.xCenter = this.currentX = var1, this.yCenter = this.currentY = var2);
   }

   @Override
   public void closePath() {
      this.path.closePath();
      Point2D var1 = this.path.getCurrentPoint();
      this.currentX = (float)var1.getX();
      this.currentY = (float)var1.getY();
   }

   @Override
   public void linetoRel(float var1, float var2) {
      this.path.lineTo(this.xCenter = this.currentX += var1, this.yCenter = this.currentY += var2);
   }

   @Override
   public void linetoAbs(float var1, float var2) {
      this.path.lineTo(this.xCenter = this.currentX = var1, this.yCenter = this.currentY = var2);
   }

   @Override
   public void linetoHorizontalRel(float var1) {
      this.path.lineTo(this.xCenter = this.currentX += var1, this.yCenter = this.currentY);
   }

   @Override
   public void linetoHorizontalAbs(float var1) {
      this.path.lineTo(this.xCenter = this.currentX = var1, this.yCenter = this.currentY);
   }

   @Override
   public void linetoVerticalRel(float var1) {
      this.path.lineTo(this.xCenter = this.currentX, this.yCenter = this.currentY += var1);
   }

   @Override
   public void linetoVerticalAbs(float var1) {
      this.path.lineTo(this.xCenter = this.currentX, this.yCenter = this.currentY = var1);
   }

   @Override
   public void curvetoCubicRel(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.path
         .curveTo(
            this.currentX + var1,
            this.currentY + var2,
            this.xCenter = this.currentX + var3,
            this.yCenter = this.currentY + var4,
            this.currentX += var5,
            this.currentY += var6
         );
   }

   @Override
   public void curvetoCubicAbs(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.path.curveTo(var1, var2, this.xCenter = var3, this.yCenter = var4, this.currentX = var5, this.currentY = var6);
   }

   @Override
   public void curvetoCubicSmoothRel(float var1, float var2, float var3, float var4) {
      this.path
         .curveTo(
            this.currentX * 2.0F - this.xCenter,
            this.currentY * 2.0F - this.yCenter,
            this.xCenter = this.currentX + var1,
            this.yCenter = this.currentY + var2,
            this.currentX += var3,
            this.currentY += var4
         );
   }

   @Override
   public void curvetoCubicSmoothAbs(float var1, float var2, float var3, float var4) {
      this.path
         .curveTo(
            this.currentX * 2.0F - this.xCenter,
            this.currentY * 2.0F - this.yCenter,
            this.xCenter = var1,
            this.yCenter = var2,
            this.currentX = var3,
            this.currentY = var4
         );
   }

   @Override
   public void curvetoQuadraticRel(float var1, float var2, float var3, float var4) {
      this.path.quadTo(this.xCenter = this.currentX + var1, this.yCenter = this.currentY + var2, this.currentX += var3, this.currentY += var4);
   }

   @Override
   public void curvetoQuadraticAbs(float var1, float var2, float var3, float var4) {
      this.path.quadTo(this.xCenter = var1, this.yCenter = var2, this.currentX = var3, this.currentY = var4);
   }

   @Override
   public void curvetoQuadraticSmoothRel(float var1, float var2) {
      this.path
         .quadTo(
            this.xCenter = this.currentX * 2.0F - this.xCenter,
            this.yCenter = this.currentY * 2.0F - this.yCenter,
            this.currentX += var1,
            this.currentY += var2
         );
   }

   @Override
   public void curvetoQuadraticSmoothAbs(float var1, float var2) {
      this.path
         .quadTo(
            this.xCenter = this.currentX * 2.0F - this.xCenter, this.yCenter = this.currentY * 2.0F - this.yCenter, this.currentX = var1, this.currentY = var2
         );
   }

   @Override
   public void arcRel(float var1, float var2, float var3, boolean var4, boolean var5, float var6, float var7) {
      this.path.arcTo(var1, var2, var3, var4, var5, this.xCenter = this.currentX += var6, this.yCenter = this.currentY += var7);
   }

   @Override
   public void arcAbs(float var1, float var2, float var3, boolean var4, boolean var5, float var6, float var7) {
      this.path.arcTo(var1, var2, var3, var4, var5, this.xCenter = this.currentX = var6, this.yCenter = this.currentY = var7);
   }
}
