package com.mxgraph.canvas;

import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxLightweightLabel;
import com.mxgraph.util.mxUtils;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D.Double;
import java.text.AttributedString;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.CellRendererPane;
import javax.swing.JLabel;

public class mxGraphicsCanvas2D implements mxICanvas2D {
   private static final Logger log = Logger.getLogger(mxGraphicsCanvas2D.class.getName());
   public static int IMAGE_SCALING = 4;
   public static int JAVA_TEXT_WIDTH_DELTA = 6;
   public static double HTML_SCALE = 1.0;
   public static String HTML_UNIT = "pt";
   public static int COLOR_CACHE_SIZE = 100;
   protected Graphics2D graphics;
   protected boolean textEnabled = true;
   protected transient mxGraphicsCanvas2D.CanvasState state = new mxGraphicsCanvas2D.CanvasState();
   protected transient Stack<mxGraphicsCanvas2D.CanvasState> stack = new Stack<>();
   protected transient GeneralPath currentPath;
   protected CellRendererPane rendererPane;
   protected transient Font lastFont = null;
   protected transient int lastFontStyle = 0;
   protected transient int lastFontSize = 0;
   protected transient String lastFontFamily = "";
   protected transient Stroke lastStroke = null;
   protected transient float lastStrokeWidth = 0.0F;
   protected transient int lastCap = 0;
   protected transient int lastJoin = 0;
   protected transient float lastMiterLimit = 0.0F;
   protected transient boolean lastDashed = false;
   protected transient Object lastDashPattern = "";
   protected transient LinkedHashMap<String, Color> colorCache = new LinkedHashMap<String, Color>() {
      @Override
      protected boolean removeEldestEntry(Entry<String, Color> var1) {
         return this.size() > mxGraphicsCanvas2D.COLOR_CACHE_SIZE;
      }
   };

   public mxGraphicsCanvas2D(Graphics2D var1) {
      this.setGraphics(var1);
      this.state.g = var1;

      try {
         this.rendererPane = new CellRendererPane();
      } catch (Exception var3) {
         log.log(Level.WARNING, "Failed to initialize renderer pane", var3);
      }
   }

   public void setGraphics(Graphics2D var1) {
      this.graphics = var1;
   }

   public Graphics2D getGraphics() {
      return this.graphics;
   }

   public boolean isTextEnabled() {
      return this.textEnabled;
   }

   public void setTextEnabled(boolean var1) {
      this.textEnabled = var1;
   }

   @Override
   public void save() {
      this.stack.push(this.state);
      this.state = this.cloneState(this.state);
      this.state.g = (Graphics2D)this.state.g.create();
   }

   @Override
   public void restore() {
      this.state.g.dispose();
      this.state = this.stack.pop();
   }

   protected mxGraphicsCanvas2D.CanvasState cloneState(mxGraphicsCanvas2D.CanvasState var1) {
      try {
         return (mxGraphicsCanvas2D.CanvasState)var1.clone();
      } catch (CloneNotSupportedException var3) {
         log.log(Level.SEVERE, "Failed to clone the state", var3);
         return null;
      }
   }

   @Override
   public void scale(double var1) {
      this.state.scale *= var1;
   }

   @Override
   public void translate(double var1, double var3) {
      this.state.dx += var1;
      this.state.dy += var3;
   }

   @Override
   public void rotate(double var1, boolean var3, boolean var4, double var5, double var7) {
      var5 += this.state.dx;
      var7 += this.state.dy;
      var5 *= this.state.scale;
      var7 *= this.state.scale;
      this.state.g.rotate(Math.toRadians(var1), var5, var7);
      if (var3 && var4) {
         var1 += 180.0;
      } else if (var3 ^ var4) {
         double var9 = var3 ? var5 : 0.0;
         int var11 = var3 ? -1 : 1;
         double var12 = var4 ? var7 : 0.0;
         int var14 = var4 ? -1 : 1;
         this.state.g.translate(var9, var12);
         this.state.g.scale(var11, var14);
         this.state.g.translate(-var9, -var12);
      }

      this.state.theta = var1;
      this.state.rotationCx = var5;
      this.state.rotationCy = var7;
      this.state.flipH = var3;
      this.state.flipV = var4;
   }

   @Override
   public void setStrokeWidth(double var1) {
      if (var1 != this.state.strokeWidth) {
         this.state.strokeWidth = var1;
      }
   }

   @Override
   public void setStrokeColor(String var1) {
      if (this.state.strokeColorValue == null || !this.state.strokeColorValue.equals(var1)) {
         this.state.strokeColorValue = var1;
         this.state.strokeColor = null;
      }
   }

   @Override
   public void setDashed(boolean var1) {
      this.setDashed(var1, this.state.fixDash);
   }

   @Override
   public void setDashed(boolean var1, boolean var2) {
      this.state.dashed = var1;
      this.state.fixDash = var2;
   }

   @Override
   public void setDashPattern(String var1) {
      if (var1 != null && var1.length() > 0) {
         this.state.dashPattern = mxUtils.parseDashPattern(var1);
      }
   }

   @Override
   public void setLineCap(String var1) {
      if (!this.state.lineCap.equals(var1)) {
         this.state.lineCap = var1;
      }
   }

   @Override
   public void setLineJoin(String var1) {
      if (!this.state.lineJoin.equals(var1)) {
         this.state.lineJoin = var1;
      }
   }

   @Override
   public void setMiterLimit(double var1) {
      if (var1 != this.state.miterLimit) {
         this.state.miterLimit = var1;
      }
   }

   @Override
   public void setFontSize(double var1) {
      if (var1 != this.state.fontSize) {
         this.state.fontSize = var1;
      }
   }

   @Override
   public void setFontColor(String var1) {
      if (this.state.fontColorValue == null || !this.state.fontColorValue.equals(var1)) {
         this.state.fontColorValue = var1;
         this.state.fontColor = null;
      }
   }

   @Override
   public void setFontBackgroundColor(String var1) {
      if (this.state.fontBackgroundColorValue == null || !this.state.fontBackgroundColorValue.equals(var1)) {
         this.state.fontBackgroundColorValue = var1;
         this.state.fontBackgroundColor = null;
      }
   }

   @Override
   public void setFontBorderColor(String var1) {
      if (this.state.fontBorderColorValue == null || !this.state.fontBorderColorValue.equals(var1)) {
         this.state.fontBorderColorValue = var1;
         this.state.fontBorderColor = null;
      }
   }

   @Override
   public void setFontFamily(String var1) {
      if (!this.state.fontFamily.equals(var1)) {
         this.state.fontFamily = var1;
      }
   }

   @Override
   public void setFontStyle(int var1) {
      if (var1 != this.state.fontStyle) {
         this.state.fontStyle = var1;
      }
   }

   @Override
   public void setAlpha(double var1) {
      if (this.state.alpha != var1) {
         this.state.g.setComposite(AlphaComposite.getInstance(3, (float)var1));
         this.state.alpha = var1;
      }
   }

   @Override
   public void setFillAlpha(double var1) {
      if (this.state.fillAlpha != var1) {
         this.state.fillAlpha = var1;
         this.state.fillColor = null;
      }
   }

   @Override
   public void setStrokeAlpha(double var1) {
      if (this.state.strokeAlpha != var1) {
         this.state.strokeAlpha = var1;
         this.state.strokeColor = null;
      }
   }

   @Override
   public void setFillColor(String var1) {
      if (this.state.fillColorValue == null || !this.state.fillColorValue.equals(var1)) {
         this.state.fillColorValue = var1;
         this.state.fillColor = null;
         this.state.gradientPaint = null;
      }
   }

   @Override
   public void setGradient(String var1, String var2, double var3, double var5, double var7, double var9, String var11, double var12, double var14) {
      float var16 = (float)((this.state.dx + var3) * this.state.scale);
      float var17 = (float)((this.state.dy + var5) * this.state.scale);
      float var18 = var16;
      float var19 = var17;
      var9 *= this.state.scale;
      var7 *= this.state.scale;
      if (var11 == null || var11.length() == 0 || var11.equals("south")) {
         var19 = (float)(var17 + var9);
      } else if (var11.equals("east")) {
         var18 = (float)(var16 + var7);
      } else if (var11.equals("north")) {
         var17 = (float)(var17 + var9);
      } else if (var11.equals("west")) {
         var16 = (float)(var16 + var7);
      }

      Color var20 = this.parseColor(var1);
      if (var12 != 1.0) {
         var20 = new Color(var20.getRed(), var20.getGreen(), var20.getBlue(), (int)(var12 * 255.0));
      }

      Color var21 = this.parseColor(var2);
      if (var14 != 1.0) {
         var21 = new Color(var21.getRed(), var21.getGreen(), var21.getBlue(), (int)(var14 * 255.0));
      }

      this.state.gradientPaint = new GradientPaint(var16, var17, var20, var18, var19, var21, true);
      this.state.fillColorValue = null;
   }

   protected Color parseColor(String var1) {
      return this.parseColor(var1, 1.0);
   }

   protected Color parseColor(String var1, double var2) {
      Color var4 = this.colorCache.get(var1);
      if (var4 == null) {
         var4 = mxUtils.parseColor(var1, var2);
         this.colorCache.put(var1 + "-" + (int)(var2 * 255.0), var4);
      }

      return var4;
   }

   @Override
   public void rect(double var1, double var3, double var5, double var7) {
      this.currentPath = new GeneralPath();
      this.currentPath
         .append(
            new Double((this.state.dx + var1) * this.state.scale, (this.state.dy + var3) * this.state.scale, var5 * this.state.scale, var7 * this.state.scale),
            false
         );
   }

   @Override
   public void roundrect(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.begin();
      this.moveTo(var1 + var9, var3);
      this.lineTo(var1 + var5 - var9, var3);
      this.quadTo(var1 + var5, var3, var1 + var5, var3 + var11);
      this.lineTo(var1 + var5, var3 + var7 - var11);
      this.quadTo(var1 + var5, var3 + var7, var1 + var5 - var9, var3 + var7);
      this.lineTo(var1 + var9, var3 + var7);
      this.quadTo(var1, var3 + var7, var1, var3 + var7 - var11);
      this.lineTo(var1, var3 + var11);
      this.quadTo(var1, var3, var1 + var9, var3);
   }

   @Override
   public void ellipse(double var1, double var3, double var5, double var7) {
      this.currentPath = new GeneralPath();
      this.currentPath
         .append(
            new java.awt.geom.Ellipse2D.Double(
               (this.state.dx + var1) * this.state.scale, (this.state.dy + var3) * this.state.scale, var5 * this.state.scale, var7 * this.state.scale
            ),
            false
         );
   }

   @Override
   public void image(double var1, double var3, double var5, double var7, String var9, boolean var10, boolean var11, boolean var12) {
      if (var9 != null && var5 > 0.0 && var7 > 0.0) {
         Image var13 = this.loadImage(var9);
         if (var13 != null) {
            Rectangle var14 = this.getImageBounds(var13, var1, var3, var5, var7, var10);
            var13 = this.scaleImage(var13, var14.width, var14.height);
            if (var13 != null) {
               this.drawImage(this.createImageGraphics(var14.x, var14.y, var14.width, var14.height, var11, var12), var13, var14.x, var14.y);
            }
         }
      }
   }

   protected void drawImage(Graphics2D var1, Image var2, int var3, int var4) {
      var1.drawImage(var2, var3, var4, null);
   }

   protected Image loadImage(String var1) {
      return mxUtils.loadImage(var1);
   }

   protected final Rectangle getImageBounds(Image var1, double var2, double var4, double var6, double var8, boolean var10) {
      var2 = (this.state.dx + var2) * this.state.scale;
      var4 = (this.state.dy + var4) * this.state.scale;
      var6 *= this.state.scale;
      var8 *= this.state.scale;
      if (var10) {
         Dimension var11 = this.getImageSize(var1);
         double var12 = Math.min(var6 / var11.width, var8 / var11.height);
         int var14 = (int)Math.round(var11.width * var12);
         int var15 = (int)Math.round(var11.height * var12);
         var2 += (var6 - var14) / 2.0;
         var4 += (var8 - var15) / 2.0;
         var6 = var14;
         var8 = var15;
      } else {
         var6 = Math.round(var6);
         var8 = Math.round(var8);
      }

      return new Rectangle((int)var2, (int)var4, (int)var6, (int)var8);
   }

   protected Dimension getImageSize(Image var1) {
      return new Dimension(var1.getWidth(null), var1.getHeight(null));
   }

   protected Image scaleImage(Image var1, int var2, int var3) {
      Dimension var4 = this.getImageSize(var1);
      return var2 == var4.width && var3 == var4.height ? var1 : var1.getScaledInstance(var2, var3, IMAGE_SCALING);
   }

   protected final Graphics2D createImageGraphics(double var1, double var3, double var5, double var7, boolean var9, boolean var10) {
      Graphics2D var11 = this.state.g;
      if (var9 || var10) {
         var11 = (Graphics2D)var11.create();
         if (var10 && var9) {
            var11.rotate(Math.toRadians(180.0), var1 + var5 / 2.0, var3 + var7 / 2.0);
         } else {
            byte var12 = 1;
            byte var13 = 1;
            int var14 = 0;
            int var15 = 0;
            if (var9) {
               var12 = -1;
               var14 = (int)(-var5 - 2.0 * var1);
            }

            if (var10) {
               var13 = -1;
               var15 = (int)(-var7 - 2.0 * var3);
            }

            var11.scale(var12, var13);
            var11.translate(var14, var15);
         }
      }

      return var11;
   }

   protected String createHtmlDocument(String var1, String var2, String var3, int var4, int var5, boolean var6, String var7, boolean var8) {
      StringBuffer var9 = new StringBuffer();
      var9.append("display:inline;");
      var9.append("font-family:" + this.state.fontFamily + ";");
      var9.append("font-size:" + Math.round(this.state.fontSize) + HTML_UNIT + ";");
      var9.append("color:" + this.state.fontColorValue + ";");
      var9.append(
         "line-height:"
            + (mxConstants.ABSOLUTE_LINE_HEIGHT ? Math.round(this.state.fontSize * mxConstants.LINE_HEIGHT) + " " + HTML_UNIT : mxConstants.LINE_HEIGHT)
            + ";"
      );
      boolean var10 = false;
      if ((this.state.fontStyle & 1) == 1) {
         var9.append("font-weight:bold;");
      }

      if ((this.state.fontStyle & 2) == 2) {
         var9.append("font-style:italic;");
      }

      String var11 = "";
      if ((this.state.fontStyle & 4) == 4) {
         var11 = "underline";
      }

      if ((this.state.fontStyle & 8) == 8) {
         var11 = var11 + " line-through";
      }

      if (var11.length() > 0) {
         var9.append("text-decoration: " + var11 + ";");
      }

      if (var2 != null) {
         if (var2.equals("center")) {
            var9.append("text-align:center;");
         } else if (var2.equals("right")) {
            var9.append("text-align:right;");
         }
      }

      if (this.state.fontBackgroundColorValue != null) {
         var9.append("background-color:" + this.state.fontBackgroundColorValue + ";");
      }

      if (this.state.fontBorderColorValue != null) {
         var9.append("border:1pt solid " + this.state.fontBorderColorValue + ";");
      }

      if (var8) {
         var9.append("overflow:hidden;");
         var10 = true;
      } else if (var7 != null) {
         if (var7.equals("fill")) {
            var9.append("height:" + Math.round(var5) + HTML_UNIT + ";");
            var10 = true;
         } else if (var7.equals("width")) {
            var10 = true;
            if (var5 > 0) {
               var9.append("height:" + Math.round(var5) + HTML_UNIT + ";");
            }
         }
      }

      if (var6) {
         if (!var8) {
            var10 = true;
         }

         var9.append("white-space:normal;");
      } else {
         var9.append("white-space:nowrap;");
      }

      if (var10 && var4 > 0) {
         var9.append("width:" + Math.round(var4) + HTML_UNIT + ";");
      }

      return this.createHtmlDocument(var1, var9.toString());
   }

   protected String createHtmlDocument(String var1, String var2) {
      return "<html><div style=\"" + var2 + "\">" + var1 + "</div></html>";
   }

   protected JLabel getTextRenderer() {
      return mxLightweightLabel.getSharedInstance();
   }

   protected Point2D getMargin(String var1, String var2) {
      double var3 = 0.0;
      double var5 = 0.0;
      if (var1 != null) {
         if (var1.equals("center")) {
            var3 = -0.5;
         } else if (var1.equals("right")) {
            var3 = -1.0;
         }
      }

      if (var2 != null) {
         if (var2.equals("middle")) {
            var5 = -0.5;
         } else if (var2.equals("bottom")) {
            var5 = -1.0;
         }
      }

      return new java.awt.geom.Point2D.Double(var3, var5);
   }

   protected void htmlText(
      double var1,
      double var3,
      double var5,
      double var7,
      String var9,
      String var10,
      String var11,
      boolean var12,
      String var13,
      String var14,
      boolean var15,
      double var16
   ) {
      var1 += this.state.dx;
      var3 += this.state.dy;
      JLabel var18 = this.getTextRenderer();
      if (var18 != null && this.rendererPane != null) {
         AffineTransform var19 = this.state.g.getTransform();
         double var20 = var16 * (Math.PI / 180.0);
         this.state.g.rotate(var20, var1, var3);
         this.state.g.scale(this.state.scale * HTML_SCALE, this.state.scale * HTML_SCALE);
         boolean var22 = false;
         boolean var23 = false;
         String var24 = var9;
         if (var14 != null) {
            var22 = var14.equals("width");
            var23 = var14.equals("fill");
         }

         var9 = this.createHtmlDocument(
            var9, var10, var11, !var22 && !var23 ? 0 : (int)Math.round(var5), var23 ? (int)Math.round(var7) : 0, var12, var14, var15
         );
         var18.setText(var9);
         Dimension var25 = var18.getPreferredSize();
         int var26 = var25.width;
         int var27 = var25.height;
         if ((var15 || var12) && var26 > var5 / HTML_SCALE && var5 > 0.0 || var15 && var27 > var7 / HTML_SCALE && var7 > 0.0) {
            int var28 = (int)Math.round(var5 + (var12 ? JAVA_TEXT_WIDTH_DELTA : 0));
            int var29 = (int)Math.round(var7);
            var9 = this.createHtmlDocument(var24, var10, var11, var28, var29, var12, var14, var15);
            var18.setText(var9);
            var25 = var18.getPreferredSize();
            var26 = var25.width;
            var27 = var25.height + 2;
         }

         if (var15 && var5 > 0.0 && var7 > 0.0) {
            var26 = Math.min(var25.width, (int)(var5 / HTML_SCALE));
            var27 = Math.min(var27, (int)(var7 / HTML_SCALE));
            var7 = var27 * HTML_SCALE;
         } else if (!var15 && var12 && var5 > 0.0 && var7 > 0.0) {
            var26 = var25.width;
            var5 = Math.max(var25.width, (int)(var5 / HTML_SCALE));
            var7 = var27 * HTML_SCALE;
            var27 = Math.max(var27, (int)(var7 / HTML_SCALE));
         } else if (!var15 && !var12) {
            if (var5 > 0.0 && var5 / HTML_SCALE < var26) {
               var5 = var26 * HTML_SCALE;
            }

            if (var7 > 0.0 && var7 / HTML_SCALE < var27) {
               var7 = var27 * HTML_SCALE;
            }
         }

         Point2D var36 = this.getMargin(var10, var11);
         var1 += var36.getX() * var26 * HTML_SCALE;
         var3 += var36.getY() * var27 * HTML_SCALE;
         if (var5 == 0.0) {
            var5 = var26 * HTML_SCALE;
         }

         if (var7 == 0.0) {
            var7 = var27 * HTML_SCALE;
         }

         this.rendererPane
            .paintComponent(
               this.state.g,
               var18,
               this.rendererPane,
               (int)Math.round(var1 / HTML_SCALE),
               (int)Math.round(var3 / HTML_SCALE),
               (int)Math.round(var5 / HTML_SCALE),
               (int)Math.round(var7 / HTML_SCALE),
               true
            );
         this.state.g.setTransform(var19);
      }
   }

   @Override
   public void text(
      double var1,
      double var3,
      double var5,
      double var7,
      String var9,
      String var10,
      String var11,
      boolean var12,
      String var13,
      String var14,
      boolean var15,
      double var16,
      String var18
   ) {
      if (var13 != null && var13.equals("html")) {
         this.htmlText(var1, var3, var5, var7, var9, var10, var11, var12, var13, var14, var15, var16);
      } else {
         this.plainText(var1, var3, var5, var7, var9, var10, var11, var12, var13, var14, var15, var16);
      }
   }

   public void plainText(
      double var1,
      double var3,
      double var5,
      double var7,
      String var9,
      String var10,
      String var11,
      boolean var12,
      String var13,
      String var14,
      boolean var15,
      double var16
   ) {
      if (this.state.fontColor == null) {
         this.state.fontColor = this.parseColor(this.state.fontColorValue);
      }

      if (this.state.fontColor != null) {
         var1 = (this.state.dx + var1) * this.state.scale;
         var3 = (this.state.dy + var3) * this.state.scale;
         var5 *= this.state.scale;
         var7 *= this.state.scale;
         Graphics2D var18 = this.createTextGraphics(var1, var3, var5, var7, var16, var15, var10, var11);
         FontMetrics var19 = var18.getFontMetrics();
         String[] var20 = var9.split("\n");
         int[] var21 = new int[var20.length];
         int var22 = 0;

         for (int var23 = 0; var23 < var20.length; var23++) {
            var21[var23] = var19.stringWidth(var20[var23]);
            var22 = Math.max(var22, var21[var23]);
         }

         int var38 = Math.round(var20.length * (var19.getFont().getSize() * mxConstants.LINE_HEIGHT));
         if (var15 && var38 > var7 && var7 > 0.0) {
            var38 = (int)var7;
         }

         Point2D var24 = this.getMargin(var10, var11);
         var1 += var24.getX() * var22;
         var3 += var24.getY() * var38;
         if (this.state.fontBackgroundColorValue != null) {
            if (this.state.fontBackgroundColor == null) {
               this.state.fontBackgroundColor = this.parseColor(this.state.fontBackgroundColorValue);
            }

            if (this.state.fontBackgroundColor != null) {
               var18.setColor(this.state.fontBackgroundColor);
               var18.fillRect((int)Math.round(var1), (int)Math.round(var3 - 1.0), var22 + 1, var38 + 2);
            }
         }

         if (this.state.fontBorderColorValue != null) {
            if (this.state.fontBorderColor == null) {
               this.state.fontBorderColor = this.parseColor(this.state.fontBorderColorValue);
            }

            if (this.state.fontBorderColor != null) {
               var18.setColor(this.state.fontBorderColor);
               var18.drawRect((int)Math.round(var1), (int)Math.round(var3 - 1.0), var22 + 1, var38 + 2);
            }
         }

         var18.setColor(this.state.fontColor);
         var3 += var19.getHeight() - var19.getDescent() - (var24.getY() + 0.5);

         for (int var25 = 0; var25 < var20.length; var25++) {
            double var26 = 0.0;
            if (var10 != null) {
               if (var10.equals("center")) {
                  var26 = (var22 - var21[var25]) / 2;
               } else if (var10.equals("right")) {
                  var26 = var22 - var21[var25];
               }
            }

            if (!var20[var25].isEmpty()) {
               boolean var28 = (this.state.fontStyle & 4) == 4;
               boolean var29 = (this.state.fontStyle & 8) == 8;
               if (!var28 && !var29) {
                  var18.drawString(var20[var25], (int)Math.round(var1 + var26), (int)Math.round(var3));
               } else {
                  AttributedString var30 = new AttributedString(var20[var25]);
                  var30.addAttribute(TextAttribute.FONT, var18.getFont());
                  if (var28) {
                     var30.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                  }

                  if (var29) {
                     var30.addAttribute(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
                  }

                  var18.drawString(var30.getIterator(), (int)Math.round(var1 + var26), (int)Math.round(var3));
               }
            }

            var3 += Math.round(var19.getFont().getSize() * mxConstants.LINE_HEIGHT);
         }
      }
   }

   protected final Graphics2D createTextGraphics(double var1, double var3, double var5, double var7, double var9, boolean var11, String var12, String var13) {
      Graphics2D var14 = this.state.g;
      this.updateFont();
      if (var9 != 0.0) {
         var14 = (Graphics2D)this.state.g.create();
         double var15 = var9 * (Math.PI / 180.0);
         var14.rotate(var15, var1, var3);
      }

      if (var11 && var5 > 0.0 && var7 > 0.0) {
         if (var14 == this.state.g) {
            var14 = (Graphics2D)this.state.g.create();
         }

         Point2D var19 = this.getMargin(var12, var13);
         var1 += var19.getX() * var5;
         var3 += var19.getY() * var7;
         var14.clip(new Double(var1, var3, var5, var7));
      }

      return var14;
   }

   @Override
   public void begin() {
      this.currentPath = new GeneralPath();
   }

   @Override
   public void moveTo(double var1, double var3) {
      if (this.currentPath != null) {
         this.currentPath.moveTo((float)((this.state.dx + var1) * this.state.scale), (float)((this.state.dy + var3) * this.state.scale));
      }
   }

   @Override
   public void lineTo(double var1, double var3) {
      if (this.currentPath != null) {
         this.currentPath.lineTo((float)((this.state.dx + var1) * this.state.scale), (float)((this.state.dy + var3) * this.state.scale));
      }
   }

   @Override
   public void quadTo(double var1, double var3, double var5, double var7) {
      if (this.currentPath != null) {
         this.currentPath
            .quadTo(
               (float)((this.state.dx + var1) * this.state.scale),
               (float)((this.state.dy + var3) * this.state.scale),
               (float)((this.state.dx + var5) * this.state.scale),
               (float)((this.state.dy + var7) * this.state.scale)
            );
      }
   }

   @Override
   public void curveTo(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.currentPath != null) {
         this.currentPath
            .curveTo(
               (float)((this.state.dx + var1) * this.state.scale),
               (float)((this.state.dy + var3) * this.state.scale),
               (float)((this.state.dx + var5) * this.state.scale),
               (float)((this.state.dy + var7) * this.state.scale),
               (float)((this.state.dx + var9) * this.state.scale),
               (float)((this.state.dy + var11) * this.state.scale)
            );
      }
   }

   @Override
   public void close() {
      if (this.currentPath != null) {
         this.currentPath.closePath();
      }
   }

   @Override
   public void stroke() {
      this.paintCurrentPath(false, true);
   }

   @Override
   public void fill() {
      this.paintCurrentPath(true, false);
   }

   @Override
   public void fillAndStroke() {
      this.paintCurrentPath(true, true);
   }

   protected void paintCurrentPath(boolean var1, boolean var2) {
      if (this.currentPath != null) {
         if (var2) {
            if (this.state.strokeColor == null) {
               this.state.strokeColor = this.parseColor(this.state.strokeColorValue, this.state.strokeAlpha);
            }

            if (this.state.strokeColor != null) {
               this.updateStroke();
            }
         }

         if (var1 && this.state.gradientPaint == null && this.state.fillColor == null) {
            this.state.fillColor = this.parseColor(this.state.fillColorValue, this.state.fillAlpha);
         }

         if (this.state.shadow) {
            this.paintShadow(var1, var2);
         }

         if (var1) {
            if (this.state.gradientPaint != null) {
               this.state.g.setPaint(this.state.gradientPaint);
               this.state.g.fill(this.currentPath);
            } else if (this.state.fillColor != null) {
               this.state.g.setColor(this.state.fillColor);
               this.state.g.setPaint(null);
               this.state.g.fill(this.currentPath);
            }
         }

         if (var2 && this.state.strokeColor != null) {
            this.state.g.setColor(this.state.strokeColor);
            this.state.g.draw(this.currentPath);
         }
      }
   }

   protected void paintShadow(boolean var1, boolean var2) {
      if (this.state.shadowColor == null) {
         this.state.shadowColor = this.parseColor(this.state.shadowColorValue);
      }

      if (this.state.shadowColor != null) {
         double var3 = -this.state.theta * (Math.PI / 180.0);
         double var5 = Math.cos(var3);
         double var7 = Math.sin(var3);
         double var9 = this.state.shadowOffsetX * this.state.scale;
         double var11 = this.state.shadowOffsetY * this.state.scale;
         if (this.state.flipH) {
            var9 *= -1.0;
         }

         if (this.state.flipV) {
            var11 *= -1.0;
         }

         double var13 = var9 * var5 - var11 * var7;
         double var15 = var9 * var7 + var11 * var5;
         this.state.g.setColor(this.state.shadowColor);
         this.state.g.translate(var13, var15);
         double var17 = this.state.alpha * this.state.shadowAlpha;
         Composite var19 = this.state.g.getComposite();
         this.state.g.setComposite(AlphaComposite.getInstance(3, (float)var17));
         if (var1 && (this.state.gradientPaint != null || this.state.fillColor != null)) {
            this.state.g.fill(this.currentPath);
         }

         if (var2 && this.state.strokeColor != null) {
            this.state.g.draw(this.currentPath);
         }

         this.state.g.translate(-var13, -var15);
         this.state.g.setComposite(var19);
      }
   }

   @Override
   public void setShadow(boolean var1) {
      this.state.shadow = var1;
   }

   @Override
   public void setShadowColor(String var1) {
      this.state.shadowColorValue = var1;
   }

   @Override
   public void setShadowAlpha(double var1) {
      this.state.shadowAlpha = var1;
   }

   @Override
   public void setShadowOffset(double var1, double var3) {
      this.state.shadowOffsetX = var1;
      this.state.shadowOffsetY = var3;
   }

   protected void updateFont() {
      int var1 = (int)Math.round(this.state.fontSize * this.state.scale);
      int var2 = (this.state.fontStyle & 1) == 1 ? 1 : 0;
      var2 += (this.state.fontStyle & 2) == 2 ? 2 : 0;
      if (this.lastFont == null || !this.lastFontFamily.equals(this.state.fontFamily) || var1 != this.lastFontSize || var2 != this.lastFontStyle) {
         this.lastFont = this.createFont(this.state.fontFamily, var2, var1);
         this.lastFontFamily = this.state.fontFamily;
         this.lastFontStyle = var2;
         this.lastFontSize = var1;
      }

      this.state.g.setFont(this.lastFont);
   }

   protected Font createFont(String var1, int var2, int var3) {
      return new Font(this.getFontName(var1), var2, var3);
   }

   protected String getFontName(String var1) {
      if (var1 != null) {
         int var2 = var1.indexOf(44);
         if (var2 >= 0) {
            var1 = var1.substring(0, var2);
         }
      }

      return var1;
   }

   protected void updateStroke() {
      float var1 = (float)Math.max(1.0, this.state.strokeWidth * this.state.scale);
      byte var2 = 0;
      if (this.state.lineCap.equals("round")) {
         var2 = 1;
      } else if (this.state.lineCap.equals("square")) {
         var2 = 2;
      }

      byte var3 = 0;
      if (this.state.lineJoin.equals("round")) {
         var3 = 1;
      } else if (this.state.lineJoin.equals("bevel")) {
         var3 = 2;
      }

      float var4 = (float)this.state.miterLimit;
      if (this.lastStroke == null
         || this.lastStrokeWidth != var1
         || this.lastCap != var2
         || this.lastJoin != var3
         || this.lastMiterLimit != var4
         || this.lastDashed != this.state.dashed
         || this.state.dashed && this.lastDashPattern != this.state.dashPattern) {
         float[] var5 = null;
         if (this.state.dashed) {
            var5 = new float[this.state.dashPattern.length];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = (float)(this.state.dashPattern[var6] * (this.state.fixDash ? this.state.scale : var1));
            }
         }

         this.lastStroke = new BasicStroke(var1, var2, var3, var4, var5, 0.0F);
         this.lastStrokeWidth = var1;
         this.lastCap = var2;
         this.lastJoin = var3;
         this.lastMiterLimit = var4;
         this.lastDashed = this.state.dashed;
         this.lastDashPattern = this.state.dashPattern;
      }

      this.state.g.setStroke(this.lastStroke);
   }

   protected class CanvasState implements Cloneable {
      protected double alpha = 1.0;
      protected double fillAlpha = 1.0;
      protected double strokeAlpha = 1.0;
      protected double scale = 1.0;
      protected double dx = 0.0;
      protected double dy = 0.0;
      protected double theta = 0.0;
      protected double rotationCx = 0.0;
      protected double rotationCy = 0.0;
      protected boolean flipV = false;
      protected boolean flipH = false;
      protected double miterLimit = 10.0;
      protected int fontStyle = 0;
      protected double fontSize = mxConstants.DEFAULT_FONTSIZE;
      protected String fontFamily = mxConstants.DEFAULT_FONTFAMILIES;
      protected String fontColorValue = "#000000";
      protected Color fontColor;
      protected String fontBackgroundColorValue;
      protected Color fontBackgroundColor;
      protected String fontBorderColorValue;
      protected Color fontBorderColor;
      protected String lineCap = "flat";
      protected String lineJoin = "miter";
      protected double strokeWidth = 1.0;
      protected String strokeColorValue;
      protected Color strokeColor;
      protected String fillColorValue;
      protected Color fillColor;
      protected Paint gradientPaint;
      protected boolean dashed = false;
      protected boolean fixDash = false;
      protected float[] dashPattern = new float[]{3.0F, 3.0F};
      protected boolean shadow = false;
      protected String shadowColorValue = mxConstants.W3C_SHADOWCOLOR;
      protected Color shadowColor;
      protected double shadowAlpha = 1.0;
      protected double shadowOffsetX = mxConstants.SHADOW_OFFSETX;
      protected double shadowOffsetY = mxConstants.SHADOW_OFFSETY;
      protected transient Graphics2D g;

      @Override
      public Object clone() {
         return super.clone();
      }
   }
}
