package com.mxgraph.canvas;

import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class mxImageCanvas implements mxICanvas {
   protected mxGraphics2DCanvas canvas;
   protected Graphics2D previousGraphics;
   protected BufferedImage image;

   public mxImageCanvas(mxGraphics2DCanvas var1, int var2, int var3, Color var4, boolean var5) {
      this(var1, var2, var3, var4, var5, true);
   }

   public mxImageCanvas(mxGraphics2DCanvas var1, int var2, int var3, Color var4, boolean var5, boolean var6) {
      this.canvas = var1;
      this.previousGraphics = var1.getGraphics();
      this.image = mxUtils.createBufferedImage(var2, var3, var4);
      if (this.image != null) {
         Graphics2D var7 = this.image.createGraphics();
         mxUtils.setAntiAlias(var7, var5, var6);
         var1.setGraphics(var7);
      }
   }

   public mxGraphics2DCanvas getGraphicsCanvas() {
      return this.canvas;
   }

   public BufferedImage getImage() {
      return this.image;
   }

   @Override
   public Object drawCell(mxCellState var1) {
      return this.canvas.drawCell(var1);
   }

   @Override
   public Object drawLabel(String var1, mxCellState var2, boolean var3) {
      return this.canvas.drawLabel(var1, var2, var3);
   }

   @Override
   public double getScale() {
      return this.canvas.getScale();
   }

   @Override
   public mxPoint getTranslate() {
      return this.canvas.getTranslate();
   }

   @Override
   public void setScale(double var1) {
      this.canvas.setScale(var1);
   }

   @Override
   public void setTranslate(double var1, double var3) {
      this.canvas.setTranslate(var1, var3);
   }

   public BufferedImage destroy() {
      BufferedImage var1 = this.image;
      if (this.canvas.getGraphics() != null) {
         this.canvas.getGraphics().dispose();
      }

      this.canvas.setGraphics(this.previousGraphics);
      this.previousGraphics = null;
      this.canvas = null;
      this.image = null;
      return var1;
   }
}
