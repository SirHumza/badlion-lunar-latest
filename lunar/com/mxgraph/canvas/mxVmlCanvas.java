package com.mxgraph.canvas;

import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Rectangle;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mxVmlCanvas extends mxBasicCanvas {
   protected Document document;

   public mxVmlCanvas() {
      this(null);
   }

   public mxVmlCanvas(Document var1) {
      this.setDocument(var1);
   }

   public void setDocument(Document var1) {
      this.document = var1;
   }

   public Document getDocument() {
      return this.document;
   }

   public void appendVmlElement(Element var1) {
      if (this.document != null) {
         Node var2 = this.document.getDocumentElement().getFirstChild().getNextSibling();
         if (var2 != null) {
            var2.appendChild(var1);
         }
      }
   }

   @Override
   public Object drawCell(mxCellState var1) {
      Map var2 = var1.getStyle();
      Element var3 = null;
      if (var1.getAbsolutePointCount() > 1) {
         List var4 = var1.getAbsolutePoints();
         var4 = mxUtils.translatePoints(var4, this.translate.getX(), this.translate.getY());
         var3 = this.drawLine(var4, var2);
         Element var5 = this.document.createElement("v:stroke");
         String var6 = mxUtils.getString(var2, mxConstants.STYLE_STARTARROW);
         String var7 = mxUtils.getString(var2, mxConstants.STYLE_ENDARROW);
         if (var6 != null || var7 != null) {
            if (var6 != null) {
               var5.setAttribute("startarrow", var6);
               String var8 = "medium";
               String var9 = "medium";
               double var10 = mxUtils.getFloat(var2, mxConstants.STYLE_STARTSIZE, mxConstants.DEFAULT_MARKERSIZE) * this.scale;
               if (var10 < 6.0) {
                  var8 = "narrow";
                  var9 = "short";
               } else if (var10 > 10.0) {
                  var8 = "wide";
                  var9 = "long";
               }

               var5.setAttribute("startarrowwidth", var8);
               var5.setAttribute("startarrowlength", var9);
            }

            if (var7 != null) {
               var5.setAttribute("endarrow", var7);
               String var18 = "medium";
               String var21 = "medium";
               double var23 = mxUtils.getFloat(var2, mxConstants.STYLE_ENDSIZE, mxConstants.DEFAULT_MARKERSIZE) * this.scale;
               if (var23 < 6.0) {
                  var18 = "narrow";
                  var21 = "short";
               } else if (var23 > 10.0) {
                  var18 = "wide";
                  var21 = "long";
               }

               var5.setAttribute("endarrowwidth", var18);
               var5.setAttribute("endarrowlength", var21);
            }
         }

         if (mxUtils.isTrue(var2, mxConstants.STYLE_DASHED)) {
            var5.setAttribute("dashstyle", "2 2");
         }

         var3.appendChild(var5);
      } else {
         int var14 = (int)(var1.getX() + this.translate.getX());
         int var15 = (int)(var1.getY() + this.translate.getY());
         int var16 = (int)var1.getWidth();
         int var17 = (int)var1.getHeight();
         if (!mxUtils.getString(var2, mxConstants.STYLE_SHAPE, "").equals("swimlane")) {
            var3 = this.drawShape(var14, var15, var16, var17, var2);
            if (mxUtils.isTrue(var2, mxConstants.STYLE_DASHED)) {
               Element var19 = this.document.createElement("v:stroke");
               var19.setAttribute("dashstyle", "2 2");
               var3.appendChild(var19);
            }
         } else {
            int var20 = (int)Math.round(mxUtils.getInt(var2, mxConstants.STYLE_STARTSIZE, mxConstants.DEFAULT_STARTSIZE) * this.scale);
            Hashtable var22 = new Hashtable(var2);
            var22.remove(mxConstants.STYLE_FILLCOLOR);
            var22.remove(mxConstants.STYLE_ROUNDED);
            if (mxUtils.isTrue(var2, mxConstants.STYLE_HORIZONTAL, true)) {
               var3 = this.drawShape(var14, var15, var16, var20, var2);
               this.drawShape(var14, var15 + var20, var16, var17 - var20, var22);
            } else {
               var3 = this.drawShape(var14, var15, var20, var17, var2);
               this.drawShape(var14 + var20, var15, var16 - var20, var17, var22);
            }
         }
      }

      return var3;
   }

   @Override
   public Object drawLabel(String var1, mxCellState var2, boolean var3) {
      mxRectangle var4 = var2.getLabelBounds();
      if (this.drawLabels && var4 != null) {
         int var5 = (int)(var4.getX() + this.translate.getX());
         int var6 = (int)(var4.getY() + this.translate.getY());
         int var7 = (int)var4.getWidth();
         int var8 = (int)var4.getHeight();
         Map var9 = var2.getStyle();
         return this.drawText(var1, var5, var6, var7, var8, var9);
      } else {
         return null;
      }
   }

   public Element drawShape(int var1, int var2, int var3, int var4, Map<String, Object> var5) {
      String var6 = mxUtils.getString(var5, mxConstants.STYLE_FILLCOLOR);
      String var7 = mxUtils.getString(var5, mxConstants.STYLE_STROKECOLOR);
      float var8 = (float)(mxUtils.getFloat(var5, mxConstants.STYLE_STROKEWIDTH, 1.0F) * this.scale);
      String var9 = mxUtils.getString(var5, mxConstants.STYLE_SHAPE);
      Element var10 = null;
      if (var9.equals("image")) {
         String var11 = this.getImageForStyle(var5);
         if (var11 != null) {
            var10 = this.document.createElement("v:img");
            var10.setAttribute("src", var11);
         }
      } else if (var9.equals("line")) {
         String var18 = mxUtils.getString(var5, mxConstants.STYLE_DIRECTION, "east");
         Object var12 = null;
         if (!var18.equals("east") && !var18.equals("west")) {
            int var34 = Math.round(var3 / 2);
            var12 = "m " + var34 + " 0 L " + var34 + " " + var4;
         } else {
            int var13 = Math.round(var4 / 2);
            var12 = "m 0 " + var13 + " l " + var3 + " " + var13;
         }

         var10 = this.document.createElement("v:shape");
         var10.setAttribute("coordsize", var3 + " " + var4);
         var10.setAttribute("path", var12 + " x e");
      } else if (var9.equals("ellipse")) {
         var10 = this.document.createElement("v:oval");
      } else if (var9.equals("doubleEllipse")) {
         var10 = this.document.createElement("v:shape");
         var10.setAttribute("coordsize", var3 + " " + var4);
         int var19 = (int)((3.0F + var8) * this.scale);
         String var28 = "ar 0 0 "
            + var3
            + " "
            + var4
            + " 0 "
            + var4 / 2
            + " "
            + var3 / 2
            + " "
            + var4 / 2
            + " e ar "
            + var19
            + " "
            + var19
            + " "
            + (var3 - var19)
            + " "
            + (var4 - var19)
            + " 0 "
            + var4 / 2
            + " "
            + var3 / 2
            + " "
            + var4 / 2;
         var10.setAttribute("path", var28 + " x e");
      } else if (var9.equals("rhombus")) {
         var10 = this.document.createElement("v:shape");
         var10.setAttribute("coordsize", var3 + " " + var4);
         String var20 = "m " + var3 / 2 + " 0 l " + var3 + " " + var4 / 2 + " l " + var3 / 2 + " " + var4 + " l 0 " + var4 / 2;
         var10.setAttribute("path", var20 + " x e");
      } else if (var9.equals("triangle")) {
         var10 = this.document.createElement("v:shape");
         var10.setAttribute("coordsize", var3 + " " + var4);
         String var21 = mxUtils.getString(var5, mxConstants.STYLE_DIRECTION, "");
         Object var29 = null;
         if (var21.equals("north")) {
            var29 = "m 0 " + var4 + " l " + var3 / 2 + " 0  l " + var3 + " " + var4;
         } else if (var21.equals("south")) {
            var29 = "m 0 0 l " + var3 / 2 + " " + var4 + " l " + var3 + " 0";
         } else if (var21.equals("west")) {
            var29 = "m " + var3 + " 0 l " + var3 + " " + var4 / 2 + " l " + var3 + " " + var4;
         } else {
            var29 = "m 0 0 l " + var3 + " " + var4 / 2 + " l 0 " + var4;
         }

         var10.setAttribute("path", var29 + " x e");
      } else if (var9.equals("hexagon")) {
         var10 = this.document.createElement("v:shape");
         var10.setAttribute("coordsize", var3 + " " + var4);
         String var22 = mxUtils.getString(var5, mxConstants.STYLE_DIRECTION, "");
         Object var31 = null;
         if (!var22.equals("north") && !var22.equals("south")) {
            var31 = "m "
               + (int)(0.25 * var3)
               + " 0 l "
               + (int)(0.75 * var3)
               + " 0 l "
               + var3
               + " "
               + (int)(0.5 * var4)
               + " l "
               + (int)(0.75 * var3)
               + " "
               + var4
               + " l "
               + (int)(0.25 * var3)
               + " "
               + var4
               + " l 0 "
               + (int)(0.5 * var4);
         } else {
            var31 = "m "
               + (int)(0.5 * var3)
               + " 0 l "
               + var3
               + " "
               + (int)(0.25 * var4)
               + " l "
               + var3
               + " "
               + (int)(0.75 * var4)
               + " l "
               + (int)(0.5 * var3)
               + " "
               + var4
               + " l 0 "
               + (int)(0.75 * var4)
               + " l 0 "
               + (int)(0.25 * var4);
         }

         var10.setAttribute("path", var31 + " x e");
      } else if (var9.equals("cloud")) {
         var10 = this.document.createElement("v:shape");
         var10.setAttribute("coordsize", var3 + " " + var4);
         String var23 = "m "
            + (int)(0.25 * var3)
            + " "
            + (int)(0.25 * var4)
            + " c "
            + (int)(0.05 * var3)
            + " "
            + (int)(0.25 * var4)
            + " 0 "
            + (int)(0.5 * var4)
            + " "
            + (int)(0.16 * var3)
            + " "
            + (int)(0.55 * var4)
            + " c 0 "
            + (int)(0.66 * var4)
            + " "
            + (int)(0.18 * var3)
            + " "
            + (int)(0.9 * var4)
            + " "
            + (int)(0.31 * var3)
            + " "
            + (int)(0.8 * var4)
            + " c "
            + (int)(0.4 * var3)
            + " "
            + var4
            + " "
            + (int)(0.7 * var3)
            + " "
            + var4
            + " "
            + (int)(0.8 * var3)
            + " "
            + (int)(0.8 * var4)
            + " c "
            + var3
            + " "
            + (int)(0.8 * var4)
            + " "
            + var3
            + " "
            + (int)(0.6 * var4)
            + " "
            + (int)(0.875 * var3)
            + " "
            + (int)(0.5 * var4)
            + " c "
            + var3
            + " "
            + (int)(0.3 * var4)
            + " "
            + (int)(0.8 * var3)
            + " "
            + (int)(0.1 * var4)
            + " "
            + (int)(0.625 * var3)
            + " "
            + (int)(0.2 * var4)
            + " c "
            + (int)(0.5 * var3)
            + " "
            + (int)(0.05 * var4)
            + " "
            + (int)(0.3 * var3)
            + " "
            + (int)(0.05 * var4)
            + " "
            + (int)(0.25 * var3)
            + " "
            + (int)(0.25 * var4);
         var10.setAttribute("path", var23 + " x e");
      } else if (var9.equals("actor")) {
         var10 = this.document.createElement("v:shape");
         var10.setAttribute("coordsize", var3 + " " + var4);
         double var24 = var3 / 3;
         String var35 = "m 0 "
            + var4
            + " C 0 "
            + 3 * var4 / 5
            + " 0 "
            + 2 * var4 / 5
            + " "
            + var3 / 2
            + " "
            + 2 * var4 / 5
            + " c "
            + (int)(var3 / 2 - var24)
            + " "
            + 2 * var4 / 5
            + " "
            + (int)(var3 / 2 - var24)
            + " 0 "
            + var3 / 2
            + " 0 c "
            + (int)(var3 / 2 + var24)
            + " 0 "
            + (int)(var3 / 2 + var24)
            + " "
            + 2 * var4 / 5
            + " "
            + var3 / 2
            + " "
            + 2 * var4 / 5
            + " c "
            + var3
            + " "
            + 2 * var4 / 5
            + " "
            + var3
            + " "
            + 3 * var4 / 5
            + " "
            + var3
            + " "
            + var4;
         var10.setAttribute("path", var35 + " x e");
      } else if (var9.equals("cylinder")) {
         var10 = this.document.createElement("v:shape");
         var10.setAttribute("coordsize", var3 + " " + var4);
         double var25 = Math.min(40.0, Math.floor(var4 / 5));
         String var36 = "m 0 "
            + (int)var25
            + " C 0 "
            + (int)(var25 / 3.0)
            + " "
            + var3
            + " "
            + (int)(var25 / 3.0)
            + " "
            + var3
            + " "
            + (int)var25
            + " L "
            + var3
            + " "
            + (int)(var4 - var25)
            + " C "
            + var3
            + " "
            + (int)(var4 + var25 / 3.0)
            + " 0 "
            + (int)(var4 + var25 / 3.0)
            + " 0 "
            + (int)(var4 - var25)
            + " x e m 0 "
            + (int)var25
            + " C 0 "
            + (int)(2.0 * var25)
            + " "
            + var3
            + " "
            + (int)(2.0 * var25)
            + " "
            + var3
            + " "
            + (int)var25;
         var10.setAttribute("path", var36 + " e");
      } else if (mxUtils.isTrue(var5, mxConstants.STYLE_ROUNDED, false)) {
         var10 = this.document.createElement("v:roundrect");
         var10.setAttribute("arcsize", mxConstants.RECTANGLE_ROUNDING_FACTOR * 100.0 + "%");
      } else {
         var10 = this.document.createElement("v:rect");
      }

      String var26 = "position:absolute;left:" + String.valueOf(var1) + "px;top:" + var2 + "px;width:" + var3 + "px;height:" + var4 + "px;";
      double var33 = mxUtils.getDouble(var5, mxConstants.STYLE_ROTATION);
      if (var33 != 0.0) {
         var26 = var26 + "rotation:" + var33 + ";";
      }

      var10.setAttribute("style", var26);
      if (mxUtils.isTrue(var5, mxConstants.STYLE_SHADOW, false) && var6 != null) {
         Element var14 = this.document.createElement("v:shadow");
         var14.setAttribute("on", "true");
         var14.setAttribute("color", mxConstants.W3C_SHADOWCOLOR);
         var10.appendChild(var14);
      }

      float var37 = mxUtils.getFloat(var5, mxConstants.STYLE_OPACITY, 100.0F);
      float var15 = mxUtils.getFloat(var5, mxConstants.STYLE_FILL_OPACITY, 100.0F);
      float var16 = mxUtils.getFloat(var5, mxConstants.STYLE_STROKE_OPACITY, 100.0F);
      if (var6 != null) {
         Element var17 = this.document.createElement("v:fill");
         var17.setAttribute("color", var6);
         if (var37 != 100.0F || var15 != 100.0F) {
            var17.setAttribute("opacity", String.valueOf(var37 * var15 / 10000.0F));
         }

         var10.appendChild(var17);
      } else {
         var10.setAttribute("filled", "false");
      }

      if (var7 != null) {
         var10.setAttribute("strokecolor", var7);
         Element var38 = this.document.createElement("v:stroke");
         if (var37 != 100.0F || var16 != 100.0F) {
            var38.setAttribute("opacity", String.valueOf(var37 * var16 / 10000.0F));
         }

         var10.appendChild(var38);
      } else {
         var10.setAttribute("stroked", "false");
      }

      var10.setAttribute("strokeweight", var8 + "px");
      this.appendVmlElement(var10);
      return var10;
   }

   public Element drawLine(List<mxPoint> var1, Map<String, Object> var2) {
      String var3 = mxUtils.getString(var2, mxConstants.STYLE_STROKECOLOR);
      float var4 = (float)(mxUtils.getFloat(var2, mxConstants.STYLE_STROKEWIDTH, 1.0F) * this.scale);
      Element var5 = this.document.createElement("v:shape");
      if (var3 != null && var4 > 0.0F) {
         mxPoint var6 = (mxPoint)var1.get(0);
         Rectangle var7 = new Rectangle(var6.getPoint());
         StringBuilder var8 = new StringBuilder("m " + Math.round(var6.getX()) + " " + Math.round(var6.getY()));

         for (int var9 = 1; var9 < var1.size(); var9++) {
            var6 = (mxPoint)var1.get(var9);
            var8.append(" l " + Math.round(var6.getX()) + " " + Math.round(var6.getY()));
            var7 = var7.union(new Rectangle(var6.getPoint()));
         }

         String var12 = var8.toString();
         var5.setAttribute("path", var12);
         var5.setAttribute("filled", "false");
         var5.setAttribute("strokecolor", var3);
         var5.setAttribute("strokeweight", var4 + "px");
         String var10 = "position:absolute;left:" + String.valueOf(var7.x) + "px;top:" + var7.y + "px;width:" + var7.width + "px;height:" + var7.height + "px;";
         var5.setAttribute("style", var10);
         var5.setAttribute("coordorigin", var7.x + " " + var7.y);
         var5.setAttribute("coordsize", var7.width + " " + var7.height);
      }

      this.appendVmlElement(var5);
      return var5;
   }

   public Element drawText(String var1, int var2, int var3, int var4, int var5, Map<String, Object> var6) {
      Element var7 = mxUtils.createTable(this.document, var1, var2, var3, var4, var5, this.scale, var6);
      this.appendVmlElement(var7);
      return var7;
   }
}
