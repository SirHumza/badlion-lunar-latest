package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.canvas.mxGraphicsCanvas2D;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mxStencil implements mxIShape {
   private static final Logger log = Logger.getLogger(mxStencil.class.getName());
   protected Element desc;
   protected String aspect = null;
   protected double w0 = 100.0;
   protected double h0 = 100.0;
   protected Element bgNode = null;
   protected Element fgNode = null;
   protected String strokewidth = null;
   protected double lastMoveX = 0.0;
   protected double lastMoveY = 0.0;

   public mxStencil(Element var1) {
      this.setDescription(var1);
   }

   public Element getDescription() {
      return this.desc;
   }

   public void setDescription(Element var1) {
      this.desc = var1;
      this.parseDescription();
   }

   protected mxGraphicsCanvas2D createCanvas(mxGraphics2DCanvas var1) {
      return new mxGraphicsCanvas2D(var1.getGraphics());
   }

   @Override
   public void paintShape(mxGraphics2DCanvas var1, mxCellState var2) {
      Map var3 = var2.getStyle();
      mxGraphicsCanvas2D var4 = this.createCanvas(var1);
      double var5 = mxUtils.getDouble(var3, mxConstants.STYLE_ROTATION, 0.0);
      String var7 = mxUtils.getString(var3, mxConstants.STYLE_DIRECTION, null);
      if (var7 != null) {
         if (var7.equals("north")) {
            var5 += 270.0;
         } else if (var7.equals("west")) {
            var5 += 180.0;
         } else if (var7.equals("south")) {
            var5 += 90.0;
         }
      }

      boolean var8 = mxUtils.isTrue(var3, mxConstants.STYLE_STENCIL_FLIPH, false);
      boolean var9 = mxUtils.isTrue(var3, mxConstants.STYLE_STENCIL_FLIPV, false);
      if (var8 && var9) {
         var5 += 180.0;
         var8 = false;
         var9 = false;
      }

      var4.save();
      var5 %= 360.0;
      if (var5 != 0.0 || var8 || var9) {
         var4.rotate(var5, var8, var9, var2.getCenterX(), var2.getCenterY());
      }

      mxRectangle var10 = this.computeAspect(var2, var2, var7);
      double var11 = Math.min(var10.getWidth(), var10.getHeight());
      double var13 = this.strokewidth.equals("inherit")
         ? mxUtils.getDouble(var2.getStyle(), mxConstants.STYLE_STROKEWIDTH, 1.0) * var2.getView().getScale()
         : Double.parseDouble(this.strokewidth) * var11;
      var4.setStrokeWidth(var13);
      double var15 = mxUtils.getDouble(var3, mxConstants.STYLE_OPACITY, 100.0) / 100.0;
      String var17 = mxUtils.getString(var3, mxConstants.STYLE_GRADIENTCOLOR, null);
      if (var17 != null && var17.equals(mxConstants.NONE)) {
         var17 = null;
      }

      String var18 = mxUtils.getString(var3, mxConstants.STYLE_FILLCOLOR, null);
      if (var18 != null && var18.equals(mxConstants.NONE)) {
         var18 = null;
      }

      String var19 = mxUtils.getString(var3, mxConstants.STYLE_STROKECOLOR, null);
      if (var19 != null && var19.equals(mxConstants.NONE)) {
         var19 = null;
      }

      if (mxUtils.isTrue(var3, mxConstants.STYLE_SHADOW, false)) {
         this.drawShadow(var4, var2, var5, var8, var9, var2, var15, var18 != null, var10);
      }

      var4.setAlpha(var15);
      if (mxUtils.isTrue(var3, mxConstants.STYLE_DASHED, false)) {
         var4.setDashed(true);
      }

      if (var19 != null || var18 != null) {
         if (var19 != null) {
            var4.setStrokeColor(var19);
         }

         if (var18 != null) {
            if (var17 != null && !var17.equals("transparent")) {
               var4.setGradient(var18, var17, var2.getX(), var2.getY(), var2.getWidth(), var2.getHeight(), var7, 1.0, 1.0);
            } else {
               var4.setFillColor(var18);
            }
         }

         this.drawShape(var4, var2, var2, var10, true);
         this.drawShape(var4, var2, var2, var10, false);
      }
   }

   protected void drawShadow(
      mxGraphicsCanvas2D var1, mxCellState var2, double var3, boolean var5, boolean var6, mxRectangle var7, double var8, boolean var10, mxRectangle var11
   ) {
      double var12 = var3 * Math.PI / 180.0;
      double var14 = Math.cos(-var12);
      double var16 = Math.sin(-var12);
      mxPoint var18 = mxUtils.getRotatedPoint(new mxPoint(mxConstants.SHADOW_OFFSETX, mxConstants.SHADOW_OFFSETY), var14, var16);
      if (var5) {
         var18.setX(var18.getX() * -1.0);
      }

      if (var6) {
         var18.setY(var18.getY() * -1.0);
      }

      var1.translate(var18.getX(), var18.getY());
      if (this.drawShape(var1, var2, var7, var11, true)) {
         var1.setAlpha(mxConstants.STENCIL_SHADOW_OPACITY * var8);
      }

      var1.translate(-var18.getX(), -var18.getY());
   }

   public boolean drawShape(mxGraphicsCanvas2D var1, mxCellState var2, mxRectangle var3, mxRectangle var4, boolean var5) {
      Element var6 = var5 ? this.bgNode : this.fgNode;
      if (var6 != null) {
         this.lastMoveX = 0.0;
         this.lastMoveY = 0.0;

         for (Node var7 = var6.getFirstChild(); var7 != null; var7 = var7.getNextSibling()) {
            if (var7.getNodeType() == 1) {
               this.drawElement(var1, var2, (Element)var7, var4);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected mxRectangle computeAspect(mxCellState var1, mxRectangle var2, String var3) {
      double var4 = var2.getX();
      double var6 = var2.getY();
      double var8 = var2.getWidth() / this.w0;
      double var10 = var2.getHeight() / this.h0;
      boolean var12 = var3 != null && (var3.equals("north") || var3.equals("south"));
      if (var12) {
         var10 = var2.getWidth() / this.h0;
         var8 = var2.getHeight() / this.w0;
         double var13 = (var2.getWidth() - var2.getHeight()) / 2.0;
         var4 += var13;
         var6 -= var13;
      }

      if (this.aspect.equals("fixed")) {
         var10 = Math.min(var8, var10);
         var8 = var10;
         if (var12) {
            var4 += (var2.getHeight() - this.w0 * var8) / 2.0;
            var6 += (var2.getWidth() - this.h0 * var10) / 2.0;
         } else {
            var4 += (var2.getWidth() - this.w0 * var8) / 2.0;
            var6 += (var2.getHeight() - this.h0 * var10) / 2.0;
         }
      }

      return new mxRectangle(var4, var6, var8, var10);
   }

   protected void drawElement(mxGraphicsCanvas2D var1, mxCellState var2, Element var3, mxRectangle var4) {
      String var5 = var3.getNodeName();
      double var6 = var4.getX();
      double var8 = var4.getY();
      double var10 = var4.getWidth();
      double var12 = var4.getHeight();
      double var14 = Math.min(var10, var12);
      if (var5.equals("save")) {
         var1.save();
      } else if (var5.equals("restore")) {
         var1.restore();
      } else if (var5.equals("path")) {
         var1.begin();

         for (Node var16 = var3.getFirstChild(); var16 != null; var16 = var16.getNextSibling()) {
            if (var16.getNodeType() == 1) {
               this.drawElement(var1, var2, (Element)var16, var4);
            }
         }
      } else if (var5.equals("close")) {
         var1.close();
      } else if (var5.equals("move")) {
         this.lastMoveX = var6 + this.getDouble(var3, "x") * var10;
         this.lastMoveY = var8 + this.getDouble(var3, "y") * var12;
         var1.moveTo(this.lastMoveX, this.lastMoveY);
      } else if (var5.equals("line")) {
         this.lastMoveX = var6 + this.getDouble(var3, "x") * var10;
         this.lastMoveY = var8 + this.getDouble(var3, "y") * var12;
         var1.lineTo(this.lastMoveX, this.lastMoveY);
      } else if (var5.equals("quad")) {
         this.lastMoveX = var6 + this.getDouble(var3, "x2") * var10;
         this.lastMoveY = var8 + this.getDouble(var3, "y2") * var12;
         var1.quadTo(var6 + this.getDouble(var3, "x1") * var10, var8 + this.getDouble(var3, "y1") * var12, this.lastMoveX, this.lastMoveY);
      } else if (var5.equals("curve")) {
         this.lastMoveX = var6 + this.getDouble(var3, "x3") * var10;
         this.lastMoveY = var8 + this.getDouble(var3, "y3") * var12;
         var1.curveTo(
            var6 + this.getDouble(var3, "x1") * var10,
            var8 + this.getDouble(var3, "y1") * var12,
            var6 + this.getDouble(var3, "x2") * var10,
            var8 + this.getDouble(var3, "y2") * var12,
            this.lastMoveX,
            this.lastMoveY
         );
      } else if (var5.equals("arc")) {
         double var32 = this.getDouble(var3, "rx") * var10;
         double var18 = this.getDouble(var3, "ry") * var12;
         double var20 = this.getDouble(var3, "x-axis-rotation");
         double var22 = this.getDouble(var3, "large-arc-flag");
         double var24 = this.getDouble(var3, "sweep-flag");
         double var26 = var6 + this.getDouble(var3, "x") * var10;
         double var28 = var8 + this.getDouble(var3, "y") * var12;
         double[] var30 = mxUtils.arcToCurves(this.lastMoveX, this.lastMoveY, var32, var18, var20, var22, var24, var26, var28);

         for (byte var31 = 0; var31 < var30.length; var31 += 6) {
            var1.curveTo(var30[var31], var30[var31 + 1], var30[var31 + 2], var30[var31 + 3], var30[var31 + 4], var30[var31 + 5]);
            this.lastMoveX = var30[var31 + 4];
            this.lastMoveY = var30[var31 + 5];
         }
      } else if (var5.equals("rect")) {
         var1.rect(
            var6 + this.getDouble(var3, "x") * var10,
            var8 + this.getDouble(var3, "y") * var12,
            this.getDouble(var3, "w") * var10,
            this.getDouble(var3, "h") * var12
         );
      } else if (var5.equals("roundrect")) {
         double var33 = this.getDouble(var3, "arcsize");
         if (var33 == 0.0) {
            var33 = mxConstants.RECTANGLE_ROUNDING_FACTOR * 100.0;
         }

         double var42 = this.getDouble(var3, "w") * var10;
         double var45 = this.getDouble(var3, "h") * var12;
         double var46 = var33 / 100.0;
         double var47 = Math.min(var42 * var46, var45 * var46);
         var1.roundrect(
            var6 + this.getDouble(var3, "x") * var10,
            var8 + this.getDouble(var3, "y") * var12,
            this.getDouble(var3, "w") * var10,
            this.getDouble(var3, "h") * var12,
            var47,
            var47
         );
      } else if (var5.equals("ellipse")) {
         var1.ellipse(
            var6 + this.getDouble(var3, "x") * var10,
            var8 + this.getDouble(var3, "y") * var12,
            this.getDouble(var3, "w") * var10,
            this.getDouble(var3, "h") * var12
         );
      } else if (var5.equals("image")) {
         String var34 = this.evaluateAttribute(var3, "src", var2);
         var1.image(
            var6 + this.getDouble(var3, "x") * var10,
            var8 + this.getDouble(var3, "y") * var12,
            this.getDouble(var3, "w") * var10,
            this.getDouble(var3, "h") * var12,
            var34,
            false,
            this.getString(var3, "flipH", "0").equals("1"),
            this.getString(var3, "flipV", "0").equals("1")
         );
      } else if (var5.equals("text")) {
         String var35 = this.evaluateAttribute(var3, "str", var2);
         double var17 = this.getString(var3, "vertical", "0").equals("1") ? -90.0 : 0.0;
         var1.text(
            var6 + this.getDouble(var3, "x") * var10,
            var8 + this.getDouble(var3, "y") * var12,
            0.0,
            0.0,
            var35,
            var3.getAttribute("align"),
            var3.getAttribute("valign"),
            false,
            "",
            null,
            false,
            var17,
            null
         );
      } else if (var5.equals("include-shape")) {
         mxStencil var36 = mxStencilRegistry.getStencil(var3.getAttribute("name"));
         if (var36 != null) {
            double var40 = var6 + this.getDouble(var3, "x") * var10;
            double var19 = var8 + this.getDouble(var3, "y") * var12;
            double var21 = this.getDouble(var3, "w") * var10;
            double var23 = this.getDouble(var3, "h") * var12;
            mxRectangle var25 = new mxRectangle(var40, var19, var21, var23);
            var36.drawShape(var1, var2, var25, var4, true);
            var36.drawShape(var1, var2, var25, var4, false);
         }
      } else if (var5.equals("fillstroke")) {
         var1.fillAndStroke();
      } else if (var5.equals("fill")) {
         var1.fill();
      } else if (var5.equals("stroke")) {
         var1.stroke();
      } else if (var5.equals("strokewidth")) {
         double var37 = this.getInt(var3, "fixed", 0) == 1 ? 1.0 : var14;
         var1.setStrokeWidth(this.getDouble(var3, "width") * var37);
      } else if (var5.equals("dashed")) {
         String var38 = var3.getAttribute("dashed");
         if (var38 != null) {
            var1.setDashed(var38.equals("1"));
         }
      } else if (var5.equals("dashpattern")) {
         String var39 = var3.getAttribute("pattern");
         if (var39 != null) {
            String[] var41 = var39.split(" ");
            StringBuffer var43 = new StringBuffer();

            for (int var44 = 0; var44 < var41.length; var44++) {
               if (var41[var44].length() > 0) {
                  var43.append(Double.parseDouble(var41[var44]) * var14);
                  var43.append(" ");
               }
            }

            var39 = var43.toString();
         }

         var1.setDashPattern(var39);
      } else if (var5.equals("strokecolor")) {
         var1.setStrokeColor(var3.getAttribute("color"));
      } else if (var5.equals("linecap")) {
         var1.setLineCap(var3.getAttribute("cap"));
      } else if (var5.equals("linejoin")) {
         var1.setLineJoin(var3.getAttribute("join"));
      } else if (var5.equals("miterlimit")) {
         var1.setMiterLimit(this.getDouble(var3, "limit"));
      } else if (var5.equals("fillcolor")) {
         var1.setFillColor(var3.getAttribute("color"));
      } else if (var5.equals("fontcolor")) {
         var1.setFontColor(var3.getAttribute("color"));
      } else if (var5.equals("fontstyle")) {
         var1.setFontStyle(this.getInt(var3, "style", 0));
      } else if (var5.equals("fontfamily")) {
         var1.setFontFamily(var3.getAttribute("family"));
      } else if (var5.equals("fontsize")) {
         var1.setFontSize(this.getDouble(var3, "size") * var14);
      }
   }

   protected int getInt(Element var1, String var2, int var3) {
      String var4 = var1.getAttribute(var2);
      if (var4 != null && var4.length() > 0) {
         try {
            var3 = (int)Math.floor(Float.parseFloat(var4));
         } catch (NumberFormatException var6) {
            log.log(Level.SEVERE, "Invalid value for attribute " + var2 + " in " + var1.getTagName(), var6);
         }
      }

      return var3;
   }

   protected double getDouble(Element var1, String var2) {
      return this.getDouble(var1, var2, 0.0);
   }

   protected double getDouble(Element var1, String var2, double var3) {
      String var5 = var1.getAttribute(var2);
      if (var5 != null && var5.length() > 0) {
         try {
            var3 = Double.parseDouble(var5);
         } catch (NumberFormatException var7) {
            log.log(Level.SEVERE, "Invalid value for attribute " + var2 + " in " + var1.getTagName(), var7);
         }
      }

      return var3;
   }

   protected String getString(Element var1, String var2, String var3) {
      String var4 = var1.getAttribute(var2);
      if (var4 != null && var4.length() > 0) {
         var3 = var4;
      }

      return var3;
   }

   protected void parseDescription() {
      this.fgNode = (Element)this.desc.getElementsByTagName("foreground").item(0);
      this.bgNode = (Element)this.desc.getElementsByTagName("background").item(0);
      this.w0 = this.getDouble(this.desc, "w", this.w0);
      this.h0 = this.getDouble(this.desc, "h", this.h0);
      this.aspect = this.getString(this.desc, "aspect", "variable");
      this.strokewidth = this.getString(this.desc, "strokewidth", "1");
   }

   public String evaluateAttribute(Element var1, String var2, mxCellState var3) {
      String var4 = var1.getAttribute(var2);
      if (var4 == null) {
      }

      return var4;
   }
}
