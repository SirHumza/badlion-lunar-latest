package com.mxgraph.canvas;

import com.mxgraph.shape.mxActorShape;
import com.mxgraph.shape.mxArrowShape;
import com.mxgraph.shape.mxCloudShape;
import com.mxgraph.shape.mxConnectorShape;
import com.mxgraph.shape.mxCurveShape;
import com.mxgraph.shape.mxCylinderShape;
import com.mxgraph.shape.mxDefaultTextShape;
import com.mxgraph.shape.mxDoubleEllipseShape;
import com.mxgraph.shape.mxDoubleRectangleShape;
import com.mxgraph.shape.mxEllipseShape;
import com.mxgraph.shape.mxHexagonShape;
import com.mxgraph.shape.mxHtmlTextShape;
import com.mxgraph.shape.mxIShape;
import com.mxgraph.shape.mxITextShape;
import com.mxgraph.shape.mxImageShape;
import com.mxgraph.shape.mxLabelShape;
import com.mxgraph.shape.mxLineShape;
import com.mxgraph.shape.mxRectangleShape;
import com.mxgraph.shape.mxRhombusShape;
import com.mxgraph.shape.mxStencilRegistry;
import com.mxgraph.shape.mxSwimlaneShape;
import com.mxgraph.shape.mxTriangleShape;
import com.mxgraph.swing.util.mxSwingConstants;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.CellRendererPane;

public class mxGraphics2DCanvas extends mxBasicCanvas {
   private static final Logger log = Logger.getLogger(mxGraphics2DCanvas.class.getName());
   public static final String TEXT_SHAPE_DEFAULT = "default";
   public static final String TEXT_SHAPE_HTML = "html";
   public static int IMAGE_SCALING = 4;
   protected static Map<String, mxIShape> shapes = new HashMap<>();
   protected static Map<String, mxITextShape> textShapes = new HashMap<>();
   protected CellRendererPane rendererPane;
   protected Graphics2D g;

   public mxGraphics2DCanvas() {
      this(null);
   }

   public mxGraphics2DCanvas(Graphics2D var1) {
      this.g = var1;

      try {
         this.rendererPane = new CellRendererPane();
      } catch (Exception var3) {
         log.log(Level.WARNING, "Failed to initialize renderer pane", var3);
      }
   }

   public static void putShape(String var0, mxIShape var1) {
      shapes.put(var0, var1);
   }

   public mxIShape getShape(Map<String, Object> var1) {
      String var2 = mxUtils.getString(var1, mxConstants.STYLE_SHAPE, null);
      mxIShape var3 = shapes.get(var2);
      if (var3 == null && var2 != null) {
         var3 = mxStencilRegistry.getStencil(var2);
      }

      return var3;
   }

   public static void putTextShape(String var0, mxITextShape var1) {
      textShapes.put(var0, var1);
   }

   public mxITextShape getTextShape(Map<String, Object> var1, boolean var2) {
      String var3;
      if (var2) {
         var3 = "html";
      } else {
         var3 = "default";
      }

      return textShapes.get(var3);
   }

   public CellRendererPane getRendererPane() {
      return this.rendererPane;
   }

   public Graphics2D getGraphics() {
      return this.g;
   }

   public void setGraphics(Graphics2D var1) {
      this.g = var1;
   }

   @Override
   public Object drawCell(mxCellState var1) {
      Map var2 = var1.getStyle();
      mxIShape var3 = this.getShape(var2);
      if (this.g != null && var3 != null) {
         float var4 = mxUtils.getFloat(var2, mxConstants.STYLE_OPACITY, 100.0F);
         Graphics2D var5 = this.g;
         this.g = this.createTemporaryGraphics(var2, var4, var1);
         var3.paintShape(this, var1);
         this.g.dispose();
         this.g = var5;
      }

      return var3;
   }

   @Override
   public Object drawLabel(String var1, mxCellState var2, boolean var3) {
      Map var4 = var2.getStyle();
      mxITextShape var5 = this.getTextShape(var4, var3);
      if (this.g != null && var5 != null && this.drawLabels && var1 != null && var1.length() > 0) {
         float var6 = mxUtils.getFloat(var4, mxConstants.STYLE_TEXT_OPACITY, 100.0F);
         Graphics2D var7 = this.g;
         this.g = this.createTemporaryGraphics(var4, var6, null);
         Color var8 = mxUtils.getColor(var4, mxConstants.STYLE_LABEL_BACKGROUNDCOLOR);
         Color var9 = mxUtils.getColor(var4, mxConstants.STYLE_LABEL_BORDERCOLOR);
         this.paintRectangle(var2.getLabelBounds().getRectangle(), var8, var9);
         var5.paintShape(this, var1, var2, var4);
         this.g.dispose();
         this.g = var7;
      }

      return var5;
   }

   public void drawImage(Rectangle var1, String var2) {
      this.drawImage(var1, var2, PRESERVE_IMAGE_ASPECT, false, false);
   }

   public void drawImage(Rectangle var1, String var2, boolean var3, boolean var4, boolean var5) {
      if (var2 != null && var1.getWidth() > 0.0 && var1.getHeight() > 0.0) {
         BufferedImage var6 = this.loadImage(var2);
         if (var6 != null) {
            int var9 = var1.x;
            int var10 = var1.y;
            Dimension var11 = this.getImageSize(var6);
            int var7;
            int var8;
            if (var3) {
               double var12 = Math.min((double)var1.width / var11.width, (double)var1.height / var11.height);
               var7 = (int)(var11.width * var12);
               var8 = (int)(var11.height * var12);
               var9 += (var1.width - var7) / 2;
               var10 += (var1.height - var8) / 2;
            } else {
               var7 = var1.width;
               var8 = var1.height;
            }

            Image var18 = var7 == var11.width && var8 == var11.height ? var6 : var6.getScaledInstance(var7, var8, IMAGE_SCALING);
            if (var18 != null) {
               AffineTransform var13 = null;
               if (var4 || var5) {
                  var13 = this.g.getTransform();
                  byte var14 = 1;
                  byte var15 = 1;
                  int var16 = 0;
                  int var17 = 0;
                  if (var4) {
                     var14 = -1;
                     var16 = -var7 - 2 * var9;
                  }

                  if (var5) {
                     var15 = -1;
                     var17 = -var8 - 2 * var10;
                  }

                  this.g.scale(var14, var15);
                  this.g.translate(var16, var17);
               }

               this.drawImageImpl(var18, var9, var10);
               if (var13 != null) {
                  this.g.setTransform(var13);
               }
            }
         }
      }
   }

   protected void drawImageImpl(Image var1, int var2, int var3) {
      this.g.drawImage(var1, var2, var3, null);
   }

   protected Dimension getImageSize(Image var1) {
      return new Dimension(var1.getWidth(null), var1.getHeight(null));
   }

   public void paintPolyline(mxPoint[] var1, boolean var2) {
      if (var1 != null && var1.length > 1) {
         mxPoint var3 = var1[0];
         mxPoint var4 = var1[var1.length - 1];
         double var5 = mxConstants.LINE_ARCSIZE * this.scale;
         GeneralPath var7 = new GeneralPath();
         var7.moveTo((float)var3.getX(), (float)var3.getY());

         for (int var8 = 1; var8 < var1.length - 1; var8++) {
            mxPoint var9 = var1[var8];
            double var10 = var3.getX() - var9.getX();
            double var12 = var3.getY() - var9.getY();
            if (var2 && var8 < var1.length - 1 && (var10 != 0.0 || var12 != 0.0)) {
               double var14 = Math.sqrt(var10 * var10 + var12 * var12);
               double var16 = var10 * Math.min(var5, var14 / 2.0) / var14;
               double var18 = var12 * Math.min(var5, var14 / 2.0) / var14;
               double var20 = var9.getX() + var16;
               double var22 = var9.getY() + var18;
               var7.lineTo((float)var20, (float)var22);

               mxPoint var24;
               for (var24 = var1[var8 + 1];
                  var8 < var1.length - 2 && Math.round(var24.getX() - var9.getX()) == 0L && Math.round(var24.getY() - var9.getY()) == 0L;
                  var8++
               ) {
                  var24 = var1[var8 + 2];
               }

               var10 = var24.getX() - var9.getX();
               var12 = var24.getY() - var9.getY();
               var14 = Math.max(1.0, Math.sqrt(var10 * var10 + var12 * var12));
               double var25 = var10 * Math.min(var5, var14 / 2.0) / var14;
               double var27 = var12 * Math.min(var5, var14 / 2.0) / var14;
               double var29 = var9.getX() + var25;
               double var31 = var9.getY() + var27;
               var7.quadTo((float)var9.getX(), (float)var9.getY(), (float)var29, (float)var31);
               var9 = new mxPoint(var29, var31);
            } else {
               var7.lineTo((float)var9.getX(), (float)var9.getY());
            }

            var3 = var9;
         }

         var7.lineTo((float)var4.getX(), (float)var4.getY());
         this.g.draw(var7);
      }
   }

   public void paintRectangle(Rectangle var1, Color var2, Color var3) {
      if (var2 != null) {
         this.g.setColor(var2);
         this.fillShape(var1);
      }

      if (var3 != null) {
         this.g.setColor(var3);
         this.g.draw(var1);
      }
   }

   public void fillShape(Shape var1) {
      this.fillShape(var1, false);
   }

   public void fillShape(Shape var1, boolean var2) {
      int var3 = var2 ? mxConstants.SHADOW_OFFSETX : 0;
      int var4 = var2 ? mxConstants.SHADOW_OFFSETY : 0;
      if (var2) {
         Paint var5 = this.g.getPaint();
         Color var6 = this.g.getColor();
         this.g.setColor(mxSwingConstants.SHADOW_COLOR);
         this.g.translate(var3, var4);
         this.fillShape(var1, false);
         this.g.translate(-var3, -var4);
         this.g.setColor(var6);
         this.g.setPaint(var5);
      }

      this.g.fill(var1);
   }

   public Stroke createStroke(Map<String, Object> var1) {
      double var2 = mxUtils.getFloat(var1, mxConstants.STYLE_STROKEWIDTH, 1.0F) * this.scale;
      boolean var4 = mxUtils.isTrue(var1, mxConstants.STYLE_DASHED);
      if (!var4) {
         return new BasicStroke((float)var2);
      }

      float[] var5 = mxUtils.getFloatArray(var1, mxConstants.STYLE_DASH_PATTERN, mxConstants.DEFAULT_DASHED_PATTERN, " ");
      float[] var6 = new float[var5.length];

      for (int var7 = 0; var7 < var5.length; var7++) {
         var6[var7] = (float)(var5[var7] * this.scale * var2);
      }

      return new BasicStroke((float)var2, 0, 0, 10.0F, var6, 0.0F);
   }

   public Paint createFillPaint(mxRectangle var1, Map<String, Object> var2) {
      Color var3 = mxUtils.getColor(var2, mxConstants.STYLE_FILLCOLOR);
      GradientPaint var4 = null;
      if (var3 != null) {
         Color var5 = mxUtils.getColor(var2, mxConstants.STYLE_GRADIENTCOLOR);
         if (var5 != null) {
            String var6 = mxUtils.getString(var2, mxConstants.STYLE_GRADIENT_DIRECTION);
            float var7 = (float)var1.getX();
            float var8 = (float)var1.getY();
            float var9 = (float)var1.getX();
            float var10 = (float)var1.getY();
            if (var6 == null || var6.equals("south")) {
               var10 = (float)(var1.getY() + var1.getHeight());
            } else if (var6.equals("east")) {
               var9 = (float)(var1.getX() + var1.getWidth());
            } else if (var6.equals("north")) {
               var8 = (float)(var1.getY() + var1.getHeight());
            } else if (var6.equals("west")) {
               var7 = (float)(var1.getX() + var1.getWidth());
            }

            var4 = new GradientPaint(var7, var8, var3, var9, var10, var5, true);
         }
      }

      return var4;
   }

   public Graphics2D createTemporaryGraphics(Map<String, Object> var1, float var2, mxRectangle var3) {
      Graphics2D var4 = (Graphics2D)this.g.create();
      var4.translate(this.translate.getX(), this.translate.getY());
      if (var3 != null) {
         double var5 = mxUtils.getDouble(var1, mxConstants.STYLE_ROTATION, 0.0);
         if (var5 != 0.0) {
            var4.rotate(Math.toRadians(var5), var3.getCenterX(), var3.getCenterY());
         }
      }

      if (var2 != 100.0F) {
         var4.setComposite(AlphaComposite.getInstance(3, var2 / 100.0F));
      }

      return var4;
   }

   static {
      putShape("actor", new mxActorShape());
      putShape("arrow", new mxArrowShape());
      putShape("cloud", new mxCloudShape());
      putShape("connector", new mxConnectorShape());
      putShape("cylinder", new mxCylinderShape());
      putShape("curve", new mxCurveShape());
      putShape("doubleRectangle", new mxDoubleRectangleShape());
      putShape("doubleEllipse", new mxDoubleEllipseShape());
      putShape("ellipse", new mxEllipseShape());
      putShape("hexagon", new mxHexagonShape());
      putShape("image", new mxImageShape());
      putShape("label", new mxLabelShape());
      putShape("line", new mxLineShape());
      putShape("rectangle", new mxRectangleShape());
      putShape("rhombus", new mxRhombusShape());
      putShape("swimlane", new mxSwimlaneShape());
      putShape("triangle", new mxTriangleShape());
      putTextShape("default", new mxDefaultTextShape());
      putTextShape("html", new mxHtmlTextShape());
   }
}
