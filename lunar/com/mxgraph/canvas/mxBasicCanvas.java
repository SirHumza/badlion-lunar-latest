package com.mxgraph.canvas;

import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUtils;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import java.util.Map;

public abstract class mxBasicCanvas implements mxICanvas {
   public static boolean PRESERVE_IMAGE_ASPECT = true;
   public static String DEFAULT_IMAGEBASEPATH = "";
   protected String imageBasePath = DEFAULT_IMAGEBASEPATH;
   protected mxPoint translate = new mxPoint();
   protected double scale = 1.0;
   protected boolean drawLabels = true;
   protected Hashtable<String, BufferedImage> imageCache = new Hashtable<>();

   @Override
   public void setTranslate(double var1, double var3) {
      this.translate = new mxPoint(var1, var3);
   }

   @Override
   public mxPoint getTranslate() {
      return this.translate;
   }

   @Override
   public void setScale(double var1) {
      this.scale = var1;
   }

   @Override
   public double getScale() {
      return this.scale;
   }

   public void setDrawLabels(boolean var1) {
      this.drawLabels = var1;
   }

   public String getImageBasePath() {
      return this.imageBasePath;
   }

   public void setImageBasePath(String var1) {
      this.imageBasePath = var1;
   }

   public boolean isDrawLabels() {
      return this.drawLabels;
   }

   public BufferedImage loadImage(String var1) {
      BufferedImage var2 = this.imageCache.get(var1);
      if (var2 == null) {
         var2 = mxUtils.loadImage(var1);
         if (var2 != null) {
            this.imageCache.put(var1, var2);
         }
      }

      return var2;
   }

   public void flushImageCache() {
      this.imageCache.clear();
   }

   public String getImageForStyle(Map<String, Object> var1) {
      String var2 = mxUtils.getString(var1, mxConstants.STYLE_IMAGE);
      if (var2 != null && !var2.startsWith("/") && !var2.startsWith("file:/")) {
         var2 = this.imageBasePath + var2;
      }

      return var2;
   }
}
