package com.mxgraph.canvas;

import com.mxgraph.util.mxBase64;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mxSvgCanvas extends mxBasicCanvas {
   private static final Logger log = Logger.getLogger(mxSvgCanvas.class.getName());
   protected Document document;
   private Map<String, Element> gradients = new Hashtable<>();
   private Map<String, Element> images = new Hashtable<>();
   protected Element defs = null;
   protected boolean embedded = false;

   public mxSvgCanvas() {
      this(null);
   }

   public mxSvgCanvas(Document var1) {
      this.setDocument(var1);
   }

   public void appendSvgElement(Element var1) {
      if (this.document != null) {
         this.document.getDocumentElement().appendChild(var1);
      }
   }

   protected Element getDefsElement() {
      if (this.defs == null) {
         this.defs = this.document.createElement("defs");
         Element var1 = this.document.getDocumentElement();
         if (var1.hasChildNodes()) {
            var1.insertBefore(this.defs, var1.getFirstChild());
         } else {
            var1.appendChild(this.defs);
         }
      }

      return this.defs;
   }

   public Element getGradientElement(String var1, String var2, String var3) {
      String var4 = this.getGradientId(var1, var2, var3);
      Element var5 = this.gradients.get(var4);
      if (var5 == null) {
         var5 = this.createGradientElement(var1, var2, var3);
         var5.setAttribute("id", "g" + (this.gradients.size() + 1));
         this.getDefsElement().appendChild(var5);
         this.gradients.put(var4, var5);
      }

      return var5;
   }

   public Element getGlassGradientElement() {
      String var1 = "mx-glass-gradient";
      Element var2 = this.gradients.get(var1);
      if (var2 == null) {
         var2 = this.document.createElement("linearGradient");
         var2.setAttribute("x1", "0%");
         var2.setAttribute("y1", "0%");
         var2.setAttribute("x2", "0%");
         var2.setAttribute("y2", "100%");
         Element var3 = this.document.createElement("stop");
         var3.setAttribute("offset", "0%");
         var3.setAttribute("style", "stop-color:#ffffff;stop-opacity:0.9");
         var2.appendChild(var3);
         Element var4 = this.document.createElement("stop");
         var4.setAttribute("offset", "100%");
         var4.setAttribute("style", "stop-color:#ffffff;stop-opacity:0.1");
         var2.appendChild(var4);
         var2.setAttribute("id", "g" + (this.gradients.size() + 1));
         this.getDefsElement().appendChild(var2);
         this.gradients.put(var1, var2);
      }

      return var2;
   }

   protected Element createGradientElement(String var1, String var2, String var3) {
      Element var4 = this.document.createElement("linearGradient");
      var4.setAttribute("x1", "0%");
      var4.setAttribute("y1", "0%");
      var4.setAttribute("x2", "0%");
      var4.setAttribute("y2", "0%");
      if (var3 == null || var3.equals("south")) {
         var4.setAttribute("y2", "100%");
      } else if (var3.equals("east")) {
         var4.setAttribute("x2", "100%");
      } else if (var3.equals("north")) {
         var4.setAttribute("y1", "100%");
      } else if (var3.equals("west")) {
         var4.setAttribute("x1", "100%");
      }

      Element var5 = this.document.createElement("stop");
      var5.setAttribute("offset", "0%");
      var5.setAttribute("style", "stop-color:" + var1);
      var4.appendChild(var5);
      var5 = this.document.createElement("stop");
      var5.setAttribute("offset", "100%");
      var5.setAttribute("style", "stop-color:" + var2);
      var4.appendChild(var5);
      return var4;
   }

   public String getGradientId(String var1, String var2, String var3) {
      if (var1.startsWith("#")) {
         var1 = var1.substring(1);
      }

      if (var2.startsWith("#")) {
         var2 = var2.substring(1);
      }

      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      String var4 = null;
      if (var3 == null || var3.equals("south")) {
         var4 = "south";
      } else if (var3.equals("east")) {
         var4 = "east";
      } else {
         String var5 = var1;
         var1 = var2;
         var2 = var5;
         if (var3.equals("north")) {
            var4 = "south";
         } else if (var3.equals("west")) {
            var4 = "east";
         }
      }

      return "mx-gradient-" + var1 + "-" + var2 + "-" + var4;
   }

   protected boolean isImageResource(String var1) {
      return var1 != null && (var1.toLowerCase().endsWith(".png") || var1.toLowerCase().endsWith(".jpg") || var1.toLowerCase().endsWith(".gif"));
   }

   protected InputStream getResource(String var1) {
      InputStream var2 = null;

      try {
         var2 = new BufferedInputStream(new URL(var1).openStream());
      } catch (Exception var4) {
         var2 = this.getClass().getResourceAsStream(var1);
      }

      return var2;
   }

   protected String createDataUrl(String var1) {
      String var2 = null;
      InputStream var3 = this.isImageResource(var1) ? this.getResource(var1) : null;
      if (var3 != null) {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream(1024);
         byte[] var5 = new byte[512];

         int var6;
         while ((var6 = var3.read(var5)) > 0) {
            var4.write(var5, 0, var6);
         }

         String var7 = "png";
         int var8 = var1.lastIndexOf(46);
         if (var8 > 0 && var8 < var1.length()) {
            var7 = var1.substring(var8 + 1);
         }

         var2 = "data:image/" + var7 + ";base64," + mxBase64.encodeToString(var4.toByteArray(), false);
      }

      return var2;
   }

   protected Element getEmbeddedImageElement(String var1) {
      Element var2 = this.images.get(var1);
      if (var2 == null) {
         var2 = this.document.createElement("svg");
         var2.setAttribute("width", "100%");
         var2.setAttribute("height", "100%");
         Element var3 = this.document.createElement("image");
         var3.setAttribute("width", "100%");
         var3.setAttribute("height", "100%");
         this.images.put(var1, var2);
         if (!var1.startsWith("data:image/")) {
            try {
               String var4 = this.createDataUrl(var1);
               if (var4 != null) {
                  var1 = var4;
               }
            } catch (IOException var5) {
               log.log(Level.SEVERE, "Failed to create image data URL", var5);
            }
         }

         var3.setAttributeNS(mxConstants.NS_XLINK, "xlink:href", var1);
         var2.appendChild(var3);
         var2.setAttribute("id", "i" + this.images.size());
         this.getDefsElement().appendChild(var2);
      }

      return var2;
   }

   protected Element createImageElement(
      double var1, double var3, double var5, double var7, String var9, boolean var10, boolean var11, boolean var12, boolean var13
   ) {
      Element var14 = null;
      if (var13) {
         var14 = this.document.createElement("use");
         Element var15 = this.getEmbeddedImageElement(var9);
         var14.setAttributeNS(mxConstants.NS_XLINK, "xlink:href", "#" + var15.getAttribute("id"));
      } else {
         var14 = this.document.createElement("image");
         var14.setAttributeNS(mxConstants.NS_XLINK, "xlink:href", var9);
      }

      var14.setAttribute("x", String.valueOf(var1));
      var14.setAttribute("y", String.valueOf(var3));
      var14.setAttribute("width", String.valueOf(var5));
      var14.setAttribute("height", String.valueOf(var7));
      if (var10) {
         var14.setAttribute("preserveAspectRatio", "xMidYMid");
      } else {
         var14.setAttribute("preserveAspectRatio", "none");
      }

      double var25 = 1.0;
      double var17 = 1.0;
      double var19 = 0.0;
      double var21 = 0.0;
      if (var11) {
         var25 *= -1.0;
         var19 = -var5 - 2.0 * var1;
      }

      if (var12) {
         var17 *= -1.0;
         var21 = -var7 - 2.0 * var3;
      }

      String var23 = "";
      if (var25 != 1.0 || var17 != 1.0) {
         var23 = var23 + "scale(" + var25 + " " + var17 + ") ";
      }

      if (var19 != 0.0 || var21 != 0.0) {
         var23 = var23 + "translate(" + var19 + " " + var21 + ") ";
      }

      if (var23.length() > 0) {
         var14.setAttribute("transform", var23);
      }

      return var14;
   }

   public void setDocument(Document var1) {
      this.document = var1;
   }

   public Document getDocument() {
      return this.document;
   }

   public void setEmbedded(boolean var1) {
      this.embedded = var1;
   }

   public boolean isEmbedded() {
      return this.embedded;
   }

   @Override
   public Object drawCell(mxCellState var1) {
      Map var2 = var1.getStyle();
      Element var3 = null;
      if (var1.getAbsolutePointCount() > 1) {
         List var4 = var1.getAbsolutePoints();
         var4 = mxUtils.translatePoints(var4, this.translate.getX(), this.translate.getY());
         var3 = this.drawLine(var4, var2);
         float var5 = mxUtils.getFloat(var2, mxConstants.STYLE_OPACITY, 100.0F);
         float var6 = mxUtils.getFloat(var2, mxConstants.STYLE_FILL_OPACITY, 100.0F);
         float var7 = mxUtils.getFloat(var2, mxConstants.STYLE_STROKE_OPACITY, 100.0F);
         if (var5 != 100.0F || var6 != 100.0F || var7 != 100.0F) {
            String var8 = String.valueOf(var5 * var6 / 10000.0F);
            String var9 = String.valueOf(var5 * var7 / 10000.0F);
            var3.setAttribute("fill-opacity", var8);
            var3.setAttribute("stroke-opacity", var9);
         }
      } else {
         int var12 = (int)(var1.getX() + this.translate.getX());
         int var13 = (int)(var1.getY() + this.translate.getY());
         int var14 = (int)var1.getWidth();
         int var15 = (int)var1.getHeight();
         if (!mxUtils.getString(var2, mxConstants.STYLE_SHAPE, "").equals("swimlane")) {
            var3 = this.drawShape(var12, var13, var14, var15, var2);
         } else {
            int var16 = (int)Math.round(mxUtils.getInt(var2, mxConstants.STYLE_STARTSIZE, mxConstants.DEFAULT_STARTSIZE) * this.scale);
            Hashtable var17 = new Hashtable(var2);
            var17.remove(mxConstants.STYLE_FILLCOLOR);
            var17.remove(mxConstants.STYLE_ROUNDED);
            if (mxUtils.isTrue(var2, mxConstants.STYLE_HORIZONTAL, true)) {
               var3 = this.drawShape(var12, var13, var14, var16, var2);
               this.drawShape(var12, var13 + var16, var14, var15 - var16, var17);
            } else {
               var3 = this.drawShape(var12, var13, var16, var15, var2);
               this.drawShape(var12 + var16, var13, var14 - var16, var15, var17);
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
      String var6 = mxUtils.getString(var5, mxConstants.STYLE_FILLCOLOR, "none");
      String var7 = mxUtils.getString(var5, mxConstants.STYLE_GRADIENTCOLOR, "none");
      String var8 = mxUtils.getString(var5, mxConstants.STYLE_STROKECOLOR, "none");
      float var9 = (float)(mxUtils.getFloat(var5, mxConstants.STYLE_STROKEWIDTH, 1.0F) * this.scale);
      float var10 = mxUtils.getFloat(var5, mxConstants.STYLE_OPACITY, 100.0F);
      float var11 = mxUtils.getFloat(var5, mxConstants.STYLE_FILL_OPACITY, 100.0F);
      float var12 = mxUtils.getFloat(var5, mxConstants.STYLE_STROKE_OPACITY, 100.0F);
      String var13 = mxUtils.getString(var5, mxConstants.STYLE_SHAPE, "");
      Element var14 = null;
      Element var15 = null;
      if (var13.equals("image")) {
         String var16 = this.getImageForStyle(var5);
         if (var16 != null) {
            boolean var17 = mxUtils.isTrue(var5, mxConstants.STYLE_IMAGE_FLIPH, false);
            boolean var18 = mxUtils.isTrue(var5, mxConstants.STYLE_IMAGE_FLIPV, false);
            var14 = this.createImageElement(var1, var2, var3, var4, var16, PRESERVE_IMAGE_ASPECT, var17, var18, this.isEmbedded());
         }
      } else if (var13.equals("line")) {
         String var25 = mxUtils.getString(var5, mxConstants.STYLE_DIRECTION, "east");
         Object var36 = null;
         if (!var25.equals("east") && !var25.equals("west")) {
            int var46 = var1 + var3 / 2;
            var36 = "M " + var46 + " " + var2 + " L " + var46 + " " + (var2 + var4);
         } else {
            int var45 = var2 + var4 / 2;
            var36 = "M " + var1 + " " + var45 + " L " + (var1 + var3) + " " + var45;
         }

         var14 = this.document.createElement("path");
         var14.setAttribute("d", var36 + " Z");
      } else if (var13.equals("ellipse")) {
         var14 = this.document.createElement("ellipse");
         var14.setAttribute("cx", String.valueOf(var1 + var3 / 2));
         var14.setAttribute("cy", String.valueOf(var2 + var4 / 2));
         var14.setAttribute("rx", String.valueOf(var3 / 2));
         var14.setAttribute("ry", String.valueOf(var4 / 2));
      } else if (var13.equals("doubleEllipse")) {
         var14 = this.document.createElement("g");
         var15 = this.document.createElement("ellipse");
         var15.setAttribute("cx", String.valueOf(var1 + var3 / 2));
         var15.setAttribute("cy", String.valueOf(var2 + var4 / 2));
         var15.setAttribute("rx", String.valueOf(var3 / 2));
         var15.setAttribute("ry", String.valueOf(var4 / 2));
         var14.appendChild(var15);
         int var26 = (int)((3.0F + var9) * this.scale);
         Element var38 = this.document.createElement("ellipse");
         var38.setAttribute("fill", "none");
         var38.setAttribute("stroke", var8);
         var38.setAttribute("stroke-width", String.valueOf(var9));
         var38.setAttribute("cx", String.valueOf(var1 + var3 / 2));
         var38.setAttribute("cy", String.valueOf(var2 + var4 / 2));
         var38.setAttribute("rx", String.valueOf(var3 / 2 - var26));
         var38.setAttribute("ry", String.valueOf(var4 / 2 - var26));
         var14.appendChild(var38);
      } else if (var13.equals("rhombus")) {
         var14 = this.document.createElement("path");
         String var27 = "M "
            + (var1 + var3 / 2)
            + " "
            + var2
            + " L "
            + (var1 + var3)
            + " "
            + (var2 + var4 / 2)
            + " L "
            + (var1 + var3 / 2)
            + " "
            + (var2 + var4)
            + " L "
            + var1
            + " "
            + (var2 + var4 / 2);
         var14.setAttribute("d", var27 + " Z");
      } else if (var13.equals("triangle")) {
         var14 = this.document.createElement("path");
         String var28 = mxUtils.getString(var5, mxConstants.STYLE_DIRECTION, "");
         Object var39 = null;
         if (var28.equals("north")) {
            var39 = "M " + var1 + " " + (var2 + var4) + " L " + (var1 + var3 / 2) + " " + var2 + " L " + (var1 + var3) + " " + (var2 + var4);
         } else if (var28.equals("south")) {
            var39 = "M " + var1 + " " + var2 + " L " + (var1 + var3 / 2) + " " + (var2 + var4) + " L " + (var1 + var3) + " " + var2;
         } else if (var28.equals("west")) {
            var39 = "M " + (var1 + var3) + " " + var2 + " L " + var1 + " " + (var2 + var4 / 2) + " L " + (var1 + var3) + " " + (var2 + var4);
         } else {
            var39 = "M " + var1 + " " + var2 + " L " + (var1 + var3) + " " + (var2 + var4 / 2) + " L " + var1 + " " + (var2 + var4);
         }

         var14.setAttribute("d", var39 + " Z");
      } else if (var13.equals("hexagon")) {
         var14 = this.document.createElement("path");
         String var29 = mxUtils.getString(var5, mxConstants.STYLE_DIRECTION, "");
         Object var41 = null;
         if (!var29.equals("north") && !var29.equals("south")) {
            var41 = "M "
               + (var1 + 0.25 * var3)
               + " "
               + var2
               + " L "
               + (var1 + 0.75 * var3)
               + " "
               + var2
               + " L "
               + (var1 + var3)
               + " "
               + (var2 + 0.5 * var4)
               + " L "
               + (var1 + 0.75 * var3)
               + " "
               + (var2 + var4)
               + " L "
               + (var1 + 0.25 * var3)
               + " "
               + (var2 + var4)
               + " L "
               + var1
               + " "
               + (var2 + 0.5 * var4);
         } else {
            var41 = "M "
               + (var1 + 0.5 * var3)
               + " "
               + var2
               + " L "
               + (var1 + var3)
               + " "
               + (var2 + 0.25 * var4)
               + " L "
               + (var1 + var3)
               + " "
               + (var2 + 0.75 * var4)
               + " L "
               + (var1 + 0.5 * var3)
               + " "
               + (var2 + var4)
               + " L "
               + var1
               + " "
               + (var2 + 0.75 * var4)
               + " L "
               + var1
               + " "
               + (var2 + 0.25 * var4);
         }

         var14.setAttribute("d", var41 + " Z");
      } else if (var13.equals("cloud")) {
         var14 = this.document.createElement("path");
         String var30 = "M "
            + (var1 + 0.25 * var3)
            + " "
            + (var2 + 0.25 * var4)
            + " C "
            + (var1 + 0.05 * var3)
            + " "
            + (var2 + 0.25 * var4)
            + " "
            + var1
            + " "
            + (var2 + 0.5 * var4)
            + " "
            + (var1 + 0.16 * var3)
            + " "
            + (var2 + 0.55 * var4)
            + " C "
            + var1
            + " "
            + (var2 + 0.66 * var4)
            + " "
            + (var1 + 0.18 * var3)
            + " "
            + (var2 + 0.9 * var4)
            + " "
            + (var1 + 0.31 * var3)
            + " "
            + (var2 + 0.8 * var4)
            + " C "
            + (var1 + 0.4 * var3)
            + " "
            + (var2 + var4)
            + " "
            + (var1 + 0.7 * var3)
            + " "
            + (var2 + var4)
            + " "
            + (var1 + 0.8 * var3)
            + " "
            + (var2 + 0.8 * var4)
            + " C "
            + (var1 + var3)
            + " "
            + (var2 + 0.8 * var4)
            + " "
            + (var1 + var3)
            + " "
            + (var2 + 0.6 * var4)
            + " "
            + (var1 + 0.875 * var3)
            + " "
            + (var2 + 0.5 * var4)
            + " C "
            + (var1 + var3)
            + " "
            + (var2 + 0.3 * var4)
            + " "
            + (var1 + 0.8 * var3)
            + " "
            + (var2 + 0.1 * var4)
            + " "
            + (var1 + 0.625 * var3)
            + " "
            + (var2 + 0.2 * var4)
            + " C "
            + (var1 + 0.5 * var3)
            + " "
            + (var2 + 0.05 * var4)
            + " "
            + (var1 + 0.3 * var3)
            + " "
            + (var2 + 0.05 * var4)
            + " "
            + (var1 + 0.25 * var3)
            + " "
            + (var2 + 0.25 * var4);
         var14.setAttribute("d", var30 + " Z");
      } else if (var13.equals("actor")) {
         var14 = this.document.createElement("path");
         double var31 = var3 / 3;
         String var47 = " M "
            + var1
            + " "
            + (var2 + var4)
            + " C "
            + var1
            + " "
            + (var2 + 3 * var4 / 5)
            + " "
            + var1
            + " "
            + (var2 + 2 * var4 / 5)
            + " "
            + (var1 + var3 / 2)
            + " "
            + (var2 + 2 * var4 / 5)
            + " C "
            + (var1 + var3 / 2 - var31)
            + " "
            + (var2 + 2 * var4 / 5)
            + " "
            + (var1 + var3 / 2 - var31)
            + " "
            + var2
            + " "
            + (var1 + var3 / 2)
            + " "
            + var2
            + " C "
            + (var1 + var3 / 2 + var31)
            + " "
            + var2
            + " "
            + (var1 + var3 / 2 + var31)
            + " "
            + (var2 + 2 * var4 / 5)
            + " "
            + (var1 + var3 / 2)
            + " "
            + (var2 + 2 * var4 / 5)
            + " C "
            + (var1 + var3)
            + " "
            + (var2 + 2 * var4 / 5)
            + " "
            + (var1 + var3)
            + " "
            + (var2 + 3 * var4 / 5)
            + " "
            + (var1 + var3)
            + " "
            + (var2 + var4);
         var14.setAttribute("d", var47 + " Z");
      } else if (var13.equals("cylinder")) {
         var14 = this.document.createElement("g");
         var15 = this.document.createElement("path");
         double var32 = Math.min(40.0, Math.floor(var4 / 5));
         String var48 = " M "
            + var1
            + " "
            + (var2 + var32)
            + " C "
            + var1
            + " "
            + (var2 - var32 / 3.0)
            + " "
            + (var1 + var3)
            + " "
            + (var2 - var32 / 3.0)
            + " "
            + (var1 + var3)
            + " "
            + (var2 + var32)
            + " L "
            + (var1 + var3)
            + " "
            + (var2 + var4 - var32)
            + " C "
            + (var1 + var3)
            + " "
            + (var2 + var4 + var32 / 3.0)
            + " "
            + var1
            + " "
            + (var2 + var4 + var32 / 3.0)
            + " "
            + var1
            + " "
            + (var2 + var4 - var32);
         var15.setAttribute("d", var48 + " Z");
         var14.appendChild(var15);
         Element var19 = this.document.createElement("path");
         var48 = "M "
            + var1
            + " "
            + (var2 + var32)
            + " C "
            + var1
            + " "
            + (var2 + 2.0 * var32)
            + " "
            + (var1 + var3)
            + " "
            + (var2 + 2.0 * var32)
            + " "
            + (var1 + var3)
            + " "
            + (var2 + var32);
         var19.setAttribute("d", var48);
         var19.setAttribute("fill", "none");
         var19.setAttribute("stroke", var8);
         var19.setAttribute("stroke-width", String.valueOf(var9));
         var14.appendChild(var19);
      } else {
         var15 = this.document.createElement("rect");
         var14 = var15;
         var14.setAttribute("x", String.valueOf(var1));
         var14.setAttribute("y", String.valueOf(var2));
         var14.setAttribute("width", String.valueOf(var3));
         var14.setAttribute("height", String.valueOf(var4));
         if (mxUtils.isTrue(var5, mxConstants.STYLE_ROUNDED, false)) {
            String var33 = String.valueOf(Math.min(var3 * mxConstants.RECTANGLE_ROUNDING_FACTOR, var4 * mxConstants.RECTANGLE_ROUNDING_FACTOR));
            var14.setAttribute("rx", var33);
            var14.setAttribute("ry", var33);
         }

         if (var13.equals("label")) {
            String var34 = this.getImageForStyle(var5);
            if (var34 != null) {
               String var43 = mxUtils.getString(var5, mxConstants.STYLE_IMAGE_ALIGN, "left");
               String var50 = mxUtils.getString(var5, mxConstants.STYLE_IMAGE_VERTICAL_ALIGN, "middle");
               int var52 = (int)(mxUtils.getInt(var5, mxConstants.STYLE_IMAGE_WIDTH, mxConstants.DEFAULT_IMAGESIZE) * this.scale);
               int var20 = (int)(mxUtils.getInt(var5, mxConstants.STYLE_IMAGE_HEIGHT, mxConstants.DEFAULT_IMAGESIZE) * this.scale);
               int var21 = (int)(mxUtils.getInt(var5, mxConstants.STYLE_SPACING, 2) * this.scale);
               mxRectangle var22 = new mxRectangle(var1, var2, var3, var4);
               if (var43.equals("center")) {
                  var22.setX(var22.getX() + (var22.getWidth() - var52) / 2.0);
               } else if (var43.equals("right")) {
                  var22.setX(var22.getX() + var22.getWidth() - var52 - var21 - 2.0);
               } else {
                  var22.setX(var22.getX() + var21 + 4.0);
               }

               if (var50.equals("top")) {
                  var22.setY(var22.getY() + var21);
               } else if (var50.equals("bottom")) {
                  var22.setY(var22.getY() + var22.getHeight() - var20 - var21);
               } else {
                  var22.setY(var22.getY() + (var22.getHeight() - var20) / 2.0);
               }

               var22.setWidth(var52);
               var22.setHeight(var20);
               var14 = this.document.createElement("g");
               var14.appendChild(var15);
               Element var23 = this.createImageElement(
                  var22.getX(), var22.getY(), var22.getWidth(), var22.getHeight(), var34, false, false, false, this.isEmbedded()
               );
               if (var10 != 100.0F || var11 != 100.0F) {
                  String var24 = String.valueOf(var10 * var11 / 10000.0F);
                  var23.setAttribute("opacity", var24);
               }

               var14.appendChild(var23);
            }

            if (mxUtils.isTrue(var5, mxConstants.STYLE_GLASS, false)) {
               double var44 = 0.4;
               Element var53 = this.document.createElement("path");
               var53.setAttribute("fill", "url(#" + this.getGlassGradientElement().getAttribute("id") + ")");
               String var55 = "m "
                  + (var1 - var9)
                  + ","
                  + (var2 - var9)
                  + " L "
                  + (var1 - var9)
                  + ","
                  + (var2 + var4 * var44)
                  + " Q "
                  + (var1 + var3 * 0.5)
                  + ","
                  + (var2 + var4 * 0.7)
                  + " "
                  + (var1 + var3 + var9)
                  + ","
                  + (var2 + var4 * var44)
                  + " L "
                  + (var1 + var3 + var9)
                  + ","
                  + (var2 - var9)
                  + " z";
               var53.setAttribute("stroke-width", String.valueOf(var9 / 2.0F));
               var53.setAttribute("d", var55);
               var14.appendChild(var53);
            }
         }
      }

      double var35 = mxUtils.getDouble(var5, mxConstants.STYLE_ROTATION);
      int var51 = var1 + var3 / 2;
      int var54 = var2 + var4 / 2;
      Element var56 = var15;
      if (var56 == null) {
         var56 = var14;
      }

      if (!var56.getNodeName().equalsIgnoreCase("use") && !var56.getNodeName().equalsIgnoreCase("image")) {
         if (!var6.equalsIgnoreCase("none") && !var7.equalsIgnoreCase("none")) {
            String var57 = mxUtils.getString(var5, mxConstants.STYLE_GRADIENT_DIRECTION);
            Element var62 = this.getGradientElement(var6, var7, var57);
            if (var62 != null) {
               var56.setAttribute("fill", "url(#" + var62.getAttribute("id") + ")");
            }
         } else {
            var56.setAttribute("fill", var6);
         }

         var56.setAttribute("stroke", var8);
         var56.setAttribute("stroke-width", String.valueOf(var9));
         Element var58 = null;
         if (mxUtils.isTrue(var5, mxConstants.STYLE_SHADOW, false) && !var6.equals("none")) {
            var58 = (Element)var56.cloneNode(true);
            var58.setAttribute("transform", mxConstants.SVG_SHADOWTRANSFORM);
            var58.setAttribute("fill", mxConstants.W3C_SHADOWCOLOR);
            var58.setAttribute("stroke", mxConstants.W3C_SHADOWCOLOR);
            var58.setAttribute("stroke-width", String.valueOf(var9));
            if (var35 != 0.0) {
               var58.setAttribute("transform", "rotate(" + var35 + "," + var51 + "," + var54 + ") " + mxConstants.SVG_SHADOWTRANSFORM);
            }

            if (var10 != 100.0F) {
               String var63 = String.valueOf(var10 / 100.0F);
               var58.setAttribute("fill-opacity", var63);
               var58.setAttribute("stroke-opacity", var63);
            }

            this.appendSvgElement(var58);
         }
      }

      if (var35 != 0.0) {
         var14.setAttribute("transform", var14.getAttribute("transform") + " rotate(" + var35 + "," + var51 + "," + var54 + ")");
      }

      if (var10 != 100.0F || var11 != 100.0F || var12 != 100.0F) {
         String var60 = String.valueOf(var10 * var11 / 10000.0F);
         String var64 = String.valueOf(var10 * var12 / 10000.0F);
         var14.setAttribute("fill-opacity", var60);
         var14.setAttribute("stroke-opacity", var64);
      }

      if (mxUtils.isTrue(var5, mxConstants.STYLE_DASHED)) {
         String var61 = mxUtils.getString(var5, mxConstants.STYLE_DASH_PATTERN, "3, 3");
         var14.setAttribute("stroke-dasharray", var61);
      }

      this.appendSvgElement(var14);
      return var14;
   }

   public Element drawLine(List<mxPoint> var1, Map<String, Object> var2) {
      Element var3 = this.document.createElement("g");
      Element var4 = this.document.createElement("path");
      boolean var5 = mxUtils.isTrue(var2, mxConstants.STYLE_ROUNDED, false);
      String var6 = mxUtils.getString(var2, mxConstants.STYLE_STROKECOLOR);
      float var7 = mxUtils.getFloat(var2, mxConstants.STYLE_STROKEWIDTH, 1.0F);
      float var8 = (float)(var7 * this.scale);
      if (var6 != null && var8 > 0.0F) {
         Object var9 = var2.get(mxConstants.STYLE_STARTARROW);
         mxPoint var10 = (mxPoint)var1.get(1);
         mxPoint var11 = (mxPoint)var1.get(0);
         mxPoint var12 = null;
         if (var9 != null) {
            float var13 = mxUtils.getFloat(var2, mxConstants.STYLE_STARTSIZE, mxConstants.DEFAULT_MARKERSIZE);
            var12 = this.drawMarker(var3, var9, var10, var11, var13, var7, var6);
         } else {
            double var49 = var10.getX() - var11.getX();
            double var15 = var10.getY() - var11.getY();
            double var17 = Math.max(1.0, Math.sqrt(var49 * var49 + var15 * var15));
            double var19 = var49 * var8 / var17;
            double var21 = var15 * var8 / var17;
            var12 = new mxPoint(var19 / 2.0, var21 / 2.0);
         }

         if (var12 != null) {
            var11 = (mxPoint)var11.clone();
            var11.setX(var11.getX() + var12.getX());
            var11.setY(var11.getY() + var12.getY());
            var12 = null;
         }

         var9 = var2.get(mxConstants.STYLE_ENDARROW);
         var10 = (mxPoint)var1.get(var1.size() - 2);
         mxPoint var50 = (mxPoint)var1.get(var1.size() - 1);
         if (var9 != null) {
            float var14 = mxUtils.getFloat(var2, mxConstants.STYLE_ENDSIZE, mxConstants.DEFAULT_MARKERSIZE);
            var12 = this.drawMarker(var3, var9, var10, var50, var14, var7, var6);
         } else {
            double var51 = var10.getX() - var11.getX();
            double var16 = var10.getY() - var11.getY();
            double var18 = Math.max(1.0, Math.sqrt(var51 * var51 + var16 * var16));
            double var20 = var51 * var8 / var18;
            double var22 = var16 * var8 / var18;
            var12 = new mxPoint(var20 / 2.0, var22 / 2.0);
         }

         if (var12 != null) {
            var50 = (mxPoint)var50.clone();
            var50.setX(var50.getX() + var12.getX());
            var50.setY(var50.getY() + var12.getY());
            var12 = null;
         }

         double var52 = mxConstants.LINE_ARCSIZE * this.scale;
         var10 = var11;
         String var53 = "M " + var10.getX() + " " + var10.getY();

         for (int var56 = 1; var56 < var1.size() - 1; var56++) {
            mxPoint var58 = (mxPoint)var1.get(var56);
            double var59 = var10.getX() - var58.getX();
            double var61 = var10.getY() - var58.getY();
            if (!var5 || var56 >= var1.size() - 1 || var59 == 0.0 && var61 == 0.0) {
               var53 = var53 + " L " + var58.getX() + " " + var58.getY();
            } else {
               double var23 = Math.sqrt(var59 * var59 + var61 * var61);
               double var25 = var59 * Math.min(var52, var23 / 2.0) / var23;
               double var27 = var61 * Math.min(var52, var23 / 2.0) / var23;
               double var29 = var58.getX() + var25;
               double var31 = var58.getY() + var27;
               var53 = var53 + " L " + var29 + " " + var31;
               mxPoint var33 = (mxPoint)var1.get(var56 + 1);
               var59 = var33.getX() - var58.getX();
               var61 = var33.getY() - var58.getY();
               var23 = Math.max(1.0, Math.sqrt(var59 * var59 + var61 * var61));
               double var34 = var59 * Math.min(var52, var23 / 2.0) / var23;
               double var36 = var61 * Math.min(var52, var23 / 2.0) / var23;
               double var38 = var58.getX() + var34;
               double var40 = var58.getY() + var36;
               var53 = var53 + " Q " + var58.getX() + " " + var58.getY() + " " + var38 + " " + var40;
               var58 = new mxPoint(var38, var40);
            }

            var10 = var58;
         }

         var53 = var53 + " L " + var50.getX() + " " + var50.getY();
         var4.setAttribute("d", var53);
         var4.setAttribute("stroke", var6);
         var4.setAttribute("fill", "none");
         var4.setAttribute("stroke-width", String.valueOf(var8));
         if (mxUtils.isTrue(var2, mxConstants.STYLE_DASHED)) {
            String var57 = mxUtils.getString(var2, mxConstants.STYLE_DASH_PATTERN, "3, 3");
            var4.setAttribute("stroke-dasharray", var57);
         }

         var3.appendChild(var4);
         this.appendSvgElement(var3);
      }

      return var3;
   }

   public mxPoint drawMarker(Element var1, Object var2, mxPoint var3, mxPoint var4, float var5, float var6, String var7) {
      Object var8 = null;
      double var9 = var4.getX() - var3.getX();
      double var11 = var4.getY() - var3.getY();
      double var13 = Math.max(1.0, Math.sqrt(var9 * var9 + var11 * var11));
      double var15 = var5 * this.scale;
      double var17 = var9 * var15 / var13;
      double var19 = var11 * var15 / var13;
      var4 = (mxPoint)var4.clone();
      var4.setX(var4.getX() - var17 * var6 / (2.0F * var5));
      var4.setY(var4.getY() - var19 * var6 / (2.0F * var5));
      var17 *= 0.5 + var6 / 2.0F;
      var19 *= 0.5 + var6 / 2.0F;
      Element var21 = this.document.createElement("path");
      var21.setAttribute("stroke-width", String.valueOf(var6 * this.scale));
      var21.setAttribute("stroke", var7);
      var21.setAttribute("fill", var7);
      String var22 = null;
      if (var2.equals("classic") || var2.equals("block")) {
         var22 = "M "
            + var4.getX()
            + " "
            + var4.getY()
            + " L "
            + (var4.getX() - var17 - var19 / 2.0)
            + " "
            + (var4.getY() - var19 + var17 / 2.0)
            + (!var2.equals("classic") ? "" : " L " + (var4.getX() - var17 * 3.0 / 4.0) + " " + (var4.getY() - var19 * 3.0 / 4.0))
            + " L "
            + (var4.getX() + var19 / 2.0 - var17)
            + " "
            + (var4.getY() - var19 - var17 / 2.0)
            + " z";
      } else if (var2.equals("open")) {
         var17 *= 1.2;
         var19 *= 1.2;
         var22 = "M "
            + (var4.getX() - var17 - var19 / 2.0)
            + " "
            + (var4.getY() - var19 + var17 / 2.0)
            + " L "
            + (var4.getX() - var17 / 6.0)
            + " "
            + (var4.getY() - var19 / 6.0)
            + " L "
            + (var4.getX() + var19 / 2.0 - var17)
            + " "
            + (var4.getY() - var19 - var17 / 2.0)
            + " M "
            + var4.getX()
            + " "
            + var4.getY();
         var21.setAttribute("fill", "none");
      } else if (var2.equals("oval")) {
         var17 *= 1.2;
         var19 *= 1.2;
         var15 *= 1.2;
         var22 = "M "
            + (var4.getX() - var19 / 2.0)
            + " "
            + (var4.getY() + var17 / 2.0)
            + " a "
            + var15 / 2.0
            + " "
            + var15 / 2.0
            + " 0  1,1 "
            + var17 / 8.0
            + " "
            + var19 / 8.0
            + " z";
      } else if (var2.equals("diamond")) {
         var22 = "M "
            + (var4.getX() + var17 / 2.0)
            + " "
            + (var4.getY() + var19 / 2.0)
            + " L "
            + (var4.getX() - var19 / 2.0)
            + " "
            + (var4.getY() + var17 / 2.0)
            + " L "
            + (var4.getX() - var17 / 2.0)
            + " "
            + (var4.getY() - var19 / 2.0)
            + " L "
            + (var4.getX() + var19 / 2.0)
            + " "
            + (var4.getY() - var17 / 2.0)
            + " z";
      }

      if (var22 != null) {
         var21.setAttribute("d", var22);
         var1.appendChild(var21);
      }

      return (mxPoint)var8;
   }

   public Object drawText(String var1, int var2, int var3, int var4, int var5, Map<String, Object> var6) {
      Element var7 = null;
      String var8 = mxUtils.getString(var6, mxConstants.STYLE_FONTCOLOR, "black");
      String var9 = mxUtils.getString(var6, mxConstants.STYLE_FONTFAMILY, mxConstants.DEFAULT_FONTFAMILIES);
      int var10 = (int)(mxUtils.getInt(var6, mxConstants.STYLE_FONTSIZE, mxConstants.DEFAULT_FONTSIZE) * this.scale);
      if (var1 != null && var1.length() > 0) {
         float var11 = (float)(mxUtils.getFloat(var6, mxConstants.STYLE_STROKEWIDTH, 1.0F) * this.scale);
         float var12 = mxUtils.getFloat(var6, mxConstants.STYLE_TEXT_OPACITY, 100.0F);
         String var13 = mxUtils.getString(var6, mxConstants.STYLE_LABEL_BACKGROUNDCOLOR);
         String var14 = mxUtils.getString(var6, mxConstants.STYLE_LABEL_BORDERCOLOR);
         String var15 = null;
         if (!mxUtils.isTrue(var6, mxConstants.STYLE_HORIZONTAL, true)) {
            double var16 = var2 + var4 / 2;
            double var18 = var3 + var5 / 2;
            var15 = "rotate(270 " + var16 + " " + var18 + ")";
         }

         if (var13 != null || var14 != null) {
            Element var27 = this.document.createElement("rect");
            var27.setAttribute("x", String.valueOf(var2));
            var27.setAttribute("y", String.valueOf(var3));
            var27.setAttribute("width", String.valueOf(var4));
            var27.setAttribute("height", String.valueOf(var5));
            if (var13 != null) {
               var27.setAttribute("fill", var13);
            } else {
               var27.setAttribute("fill", "none");
            }

            if (var14 != null) {
               var27.setAttribute("stroke", var14);
            } else {
               var27.setAttribute("stroke", "none");
            }

            var27.setAttribute("stroke-width", String.valueOf(var11));
            if (var12 != 100.0F) {
               String var17 = String.valueOf(var12 / 100.0F);
               var27.setAttribute("fill-opacity", var17);
               var27.setAttribute("stroke-opacity", var17);
            }

            if (var15 != null) {
               var27.setAttribute("transform", var15);
            }

            this.appendSvgElement(var27);
         }

         var7 = this.document.createElement("text");
         int var28 = mxUtils.getInt(var6, mxConstants.STYLE_FONTSTYLE);
         String var29 = (var28 & 1) == 1 ? "bold" : "normal";
         var7.setAttribute("font-weight", var29);
         String var30 = "";
         if ((var28 & 4) == 4) {
            var30 = "underline";
         }

         if ((var28 & 8) == 8) {
            var30 = var30 + " line-through";
         }

         var7.setAttribute("font-decoration", var30.length() > 0 ? var30 : "none");
         if ((var28 & 2) == 2) {
            var7.setAttribute("font-style", "italic");
         }

         var7.setAttribute("font-size", String.valueOf(var10));
         var7.setAttribute("font-family", var9);
         var7.setAttribute("fill", var8);
         if (var12 != 100.0F) {
            String var19 = String.valueOf(var12 / 100.0F);
            var7.setAttribute("fill-opacity", var19);
            var7.setAttribute("stroke-opacity", var19);
         }

         int var31 = (var28 & 1) == 1 ? 1 : 0;
         var31 += (var28 & 2) == 2 ? 2 : 0;
         String[] var20 = var1.split("\n");
         var3 += var10 + (var5 - var20.length * (var10 + mxConstants.LINESPACING)) / 2 - 2;
         String var21 = mxUtils.getString(var6, mxConstants.STYLE_ALIGN, "center");
         String var22 = "start";
         if (var21.equals("right")) {
            var22 = "end";
            var2 = (int)(var2 + (var4 - mxConstants.LABEL_INSET * this.scale));
         } else if (var21.equals("center")) {
            var22 = "middle";
            var2 += var4 / 2;
         } else {
            var2 = (int)(var2 + mxConstants.LABEL_INSET * this.scale);
         }

         var7.setAttribute("text-anchor", var22);

         for (int var23 = 0; var23 < var20.length; var23++) {
            Element var24 = this.document.createElement("tspan");
            var24.setAttribute("x", String.valueOf(var2));
            var24.setAttribute("y", String.valueOf(var3));
            var24.appendChild(this.document.createTextNode(var20[var23]));
            var7.appendChild(var24);
            var3 += var10 + mxConstants.LINESPACING;
         }

         if (var15 != null) {
            var7.setAttribute("transform", var15);
         }

         this.appendSvgElement(var7);
      }

      return var7;
   }
}
