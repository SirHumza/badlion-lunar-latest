package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.util.mxUtils;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.util.svg.AWTPathProducer;
import com.mxgraph.util.svg.AWTPolygonProducer;
import com.mxgraph.util.svg.AWTPolylineProducer;
import com.mxgraph.util.svg.ExtendedGeneralPath;
import com.mxgraph.view.mxCellState;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mxStencilShape extends mxBasicShape {
   private static final Logger log = Logger.getLogger(mxStencilShape.class.getName());
   protected GeneralPath shapePath;
   protected Node root;
   protected mxStencilShape.svgShape rootShape;
   protected Rectangle2D boundingBox;
   protected String name;
   protected String iconPath;
   protected AffineTransform cachedTransform = new AffineTransform();

   public mxStencilShape() {
   }

   public mxStencilShape(String var1) {
      this(mxXmlUtils.parseXml(var1));
   }

   public mxStencilShape(Document var1) {
      if (var1 != null) {
         NodeList var2 = var1.getElementsByTagName("name");
         if (var2 != null && var2.getLength() > 0) {
            this.name = var2.item(0).getTextContent();
         }

         NodeList var3 = var1.getElementsByTagName("icon");
         if (var3 != null && var3.getLength() > 0) {
            this.iconPath = var3.item(0).getTextContent();
         }

         NodeList var4 = var1.getElementsByTagName("svg:svg");
         if (var4 != null && var4.getLength() > 0) {
            this.root = var4.item(0);
         } else {
            var4 = var1.getElementsByTagName("svg");
            if (var4 != null && var4.getLength() > 0) {
               this.root = var4.item(0);
            }
         }

         if (this.root != null) {
            this.rootShape = new mxStencilShape.svgShape(null, null);
            this.createShape(this.root, this.rootShape);
         }
      }
   }

   @Override
   public void paintShape(mxGraphics2DCanvas var1, mxCellState var2) {
      double var3 = var2.getX();
      double var5 = var2.getY();
      double var7 = var2.getWidth();
      double var9 = var2.getHeight();
      var1.getGraphics().translate(var3, var5);
      double var11 = 1.0;
      double var13 = 1.0;
      if (this.boundingBox != null) {
         var11 = var7 / this.boundingBox.getWidth();
         var13 = var9 / this.boundingBox.getHeight();
      }

      this.paintNode(var1, var2, this.rootShape, var11, var13);
      var1.getGraphics().translate(-var3, -var5);
   }

   public void paintNode(mxGraphics2DCanvas var1, mxCellState var2, mxStencilShape.svgShape var3, double var4, double var6) {
      Shape var8 = var3.shape;
      boolean var9 = false;
      boolean var10 = true;
      Color var11 = null;
      Color var12 = null;
      Map var13 = var3.style;
      if (var13 != null) {
         String var14 = mxUtils.getString(var13, "fill");
         String var15 = mxUtils.getString(var13, "stroke");
         if (var15 != null && var15.equals("none")) {
            if (var15.equals("none")) {
               var10 = false;
            } else if (var15.trim().startsWith("#")) {
               int var16 = var15.indexOf("#");
               var12 = mxUtils.parseColor(var15.substring(var16 + 1));
            }
         }

         if (var14 != null) {
            if (var14.equals("none")) {
               var9 = false;
            } else if (var14.trim().startsWith("#")) {
               int var20 = var14.indexOf("#");
               var11 = mxUtils.parseColor(var14.substring(var20 + 1));
               var9 = true;
            } else {
               var9 = true;
            }
         }
      }

      if (var8 != null) {
         boolean var17 = false;
         if (var4 != 1.0 || var6 != 1.0) {
            this.transformShape(var8, 0.0, 0.0, var4, var6);
            var17 = true;
         }

         if (var9 && this.configureGraphics(var1, var2, true)) {
            if (var11 != null) {
               var1.getGraphics().setColor(var11);
            }

            var1.getGraphics().fill(var8);
         }

         if (var10 && this.configureGraphics(var1, var2, false)) {
            if (var12 != null) {
               var1.getGraphics().setColor(var12);
            }

            var1.getGraphics().draw(var8);
         }

         if (var17) {
            this.transformShape(var8, 0.0, 0.0, 1.0 / var4, 1.0 / var6);
         }
      }

      for (mxStencilShape.svgShape var19 : var3.subShapes) {
         this.paintNode(var1, var2, var19, var4, var6);
      }
   }

   protected void transformShape(Shape var1, double var2, double var4, double var6, double var8) {
      if (var1 instanceof Rectangle2D) {
         Rectangle2D var10 = (Rectangle2D)var1;
         if (var2 != 0.0 || var4 != 0.0) {
            var10.setFrame(var10.getX() + var2, var10.getY() + var4, var10.getWidth(), var10.getHeight());
         }

         if (var6 != 1.0 || var8 != 1.0) {
            var10.setFrame(var10.getX() * var6, var10.getY() * var8, var10.getWidth() * var6, var10.getHeight() * var8);
         }
      } else if (var1 instanceof Line2D) {
         Line2D var11 = (Line2D)var1;
         if (var2 != 0.0 || var4 != 0.0) {
            var11.setLine(var11.getX1() + var2, var11.getY1() + var4, var11.getX2() + var2, var11.getY2() + var4);
         }

         if (var6 != 1.0 || var8 != 1.0) {
            var11.setLine(var11.getX1() * var6, var11.getY1() * var8, var11.getX2() * var6, var11.getY2() * var8);
         }
      } else if (var1 instanceof GeneralPath) {
         GeneralPath var12 = (GeneralPath)var1;
         this.cachedTransform.setToScale(var6, var8);
         this.cachedTransform.translate(var2, var4);
         var12.transform(this.cachedTransform);
      } else if (var1 instanceof ExtendedGeneralPath) {
         ExtendedGeneralPath var13 = (ExtendedGeneralPath)var1;
         this.cachedTransform.setToScale(var6, var8);
         this.cachedTransform.translate(var2, var4);
         var13.transform(this.cachedTransform);
      } else if (var1 instanceof Ellipse2D) {
         Ellipse2D var14 = (Ellipse2D)var1;
         if (var2 != 0.0 || var4 != 0.0) {
            var14.setFrame(var14.getX() + var2, var14.getY() + var4, var14.getWidth(), var14.getHeight());
         }

         if (var6 != 1.0 || var8 != 1.0) {
            var14.setFrame(var14.getX() * var6, var14.getY() * var8, var14.getWidth() * var6, var14.getHeight() * var8);
         }
      }
   }

   public void createShape(Node var1, mxStencilShape.svgShape var2) {
      for (Node var3 = var1.getFirstChild(); var3 != null; var3 = var3.getNextSibling()) {
         if (this.isGroup(var3.getNodeName())) {
            String var4 = ((Element)var1).getAttribute("style");
            Map var5 = getStylenames(var4);
            mxStencilShape.svgShape var6 = new mxStencilShape.svgShape(null, var5);
            this.createShape(var3, var6);
         }

         mxStencilShape.svgShape var7 = this.createElement(var3);
         if (var7 != null) {
            var2.subShapes.add(var7);
         }
      }

      for (mxStencilShape.svgShape var10 : var2.subShapes) {
         if (var10 != null && var10.shape != null) {
            if (this.boundingBox == null) {
               this.boundingBox = var10.shape.getBounds2D();
            } else {
               this.boundingBox.add(var10.shape.getBounds2D());
            }
         }
      }

      if (this.boundingBox != null && (this.boundingBox.getX() != 0.0 || this.boundingBox.getY() != 0.0)) {
         for (mxStencilShape.svgShape var11 : var2.subShapes) {
            if (var11 != null && var11.shape != null) {
               this.transformShape(var11.shape, -this.boundingBox.getX(), -this.boundingBox.getY(), 1.0, 1.0);
            }
         }
      }
   }

   public mxStencilShape.svgShape createElement(Node var1) {
      Element var2 = null;
      if (var1 instanceof Element) {
         var2 = (Element)var1;
         String var3 = var2.getAttribute("style");
         Map var4 = getStylenames(var3);
         if (this.isRectangle(var1.getNodeName())) {
            mxStencilShape.svgShape var30 = null;

            try {
               String var33 = var2.getAttribute("x");
               String var36 = var2.getAttribute("y");
               String var37 = var2.getAttribute("width");
               String var40 = var2.getAttribute("height");
               double var10 = 0.0;
               double var43 = 0.0;
               double var46 = 0.0;
               double var48 = 0.0;
               if (var33.length() > 0) {
                  var10 = Double.valueOf(var33);
               }

               if (var36.length() > 0) {
                  var43 = Double.valueOf(var36);
               }

               if (var37.length() > 0) {
                  var46 = Double.valueOf(var37);
                  if (var46 < 0.0) {
                     return null;
                  }
               }

               if (var40.length() > 0) {
                  var48 = Double.valueOf(var40);
                  if (var48 < 0.0) {
                     return null;
                  }
               }

               String var18 = var2.getAttribute("rx");
               String var19 = var2.getAttribute("ry");
               double var20 = 0.0;
               double var22 = 0.0;
               if (var18.length() > 0) {
                  var20 = Double.valueOf(var18);
                  if (var20 < 0.0) {
                     return null;
                  }
               }

               if (var19.length() > 0) {
                  var22 = Double.valueOf(var19);
                  if (var22 < 0.0) {
                     return null;
                  }
               }

               if (!(var20 > 0.0) && !(var22 > 0.0)) {
                  var30 = new mxStencilShape.svgShape(new java.awt.geom.Rectangle2D.Double(var10, var43, var46, var48), var4);
               } else {
                  if (var20 > 0.0 && var19.length() == 0) {
                     var22 = var20;
                  } else if (var22 > 0.0 && var18.length() == 0) {
                     var20 = var22;
                  }

                  if (var20 > var46 / 2.0) {
                     var20 = var46 / 2.0;
                  }

                  if (var22 > var48 / 2.0) {
                     var22 = var48 / 2.0;
                  }

                  var30 = new mxStencilShape.svgShape(new java.awt.geom.RoundRectangle2D.Double(var10, var43, var46, var48, var20, var22), var4);
               }
            } catch (Exception var24) {
               log.log(Level.SEVERE, "Failed to create SVG element", var24);
            }

            return var30;
         }

         if (this.isLine(var1.getNodeName())) {
            String var29 = var2.getAttribute("x1");
            String var32 = var2.getAttribute("x2");
            String var35 = var2.getAttribute("y1");
            String var8 = var2.getAttribute("y2");
            double var39 = 0.0;
            double var42 = 0.0;
            double var45 = 0.0;
            double var47 = 0.0;
            if (var29.length() > 0) {
               var39 = Double.valueOf(var29);
            }

            if (var32.length() > 0) {
               var42 = Double.valueOf(var32);
            }

            if (var35.length() > 0) {
               var45 = Double.valueOf(var35);
            }

            if (var8.length() > 0) {
               var47 = Double.valueOf(var8);
            }

            return new mxStencilShape.svgShape(new java.awt.geom.Line2D.Double(var39, var45, var42, var47), var4);
         }

         if (this.isPolyline(var1.getNodeName()) || this.isPolygon(var1.getNodeName())) {
            String var28 = var2.getAttribute("points");
            Shape var31;
            if (this.isPolygon(var1.getNodeName())) {
               var31 = AWTPolygonProducer.createShape(var28, 1);
            } else {
               var31 = AWTPolylineProducer.createShape(var28, 1);
            }

            if (var31 != null) {
               return new mxStencilShape.svgShape(var31, var4);
            }

            return null;
         }

         if (this.isCircle(var1.getNodeName())) {
            double var27 = 0.0;
            double var34 = 0.0;
            double var38 = 0.0;
            String var41 = var2.getAttribute("cx");
            String var12 = var2.getAttribute("cy");
            String var44 = var2.getAttribute("r");
            if (var41.length() > 0) {
               var27 = Double.valueOf(var41);
            }

            if (var12.length() > 0) {
               var34 = Double.valueOf(var12);
            }

            if (var44.length() > 0) {
               var38 = Double.valueOf(var44);
               if (var38 < 0.0) {
                  return null;
               }
            }

            return new mxStencilShape.svgShape(new java.awt.geom.Ellipse2D.Double(var27 - var38, var34 - var38, var38 * 2.0, var38 * 2.0), var4);
         }

         if (this.isEllipse(var1.getNodeName())) {
            double var26 = 0.0;
            double var7 = 0.0;
            double var9 = 0.0;
            double var11 = 0.0;
            String var13 = var2.getAttribute("cx");
            String var14 = var2.getAttribute("cy");
            String var15 = var2.getAttribute("rx");
            String var16 = var2.getAttribute("ry");
            if (var13.length() > 0) {
               var26 = Double.valueOf(var13);
            }

            if (var14.length() > 0) {
               var7 = Double.valueOf(var14);
            }

            if (var15.length() > 0) {
               var9 = Double.valueOf(var15);
               if (var9 < 0.0) {
                  return null;
               }
            }

            if (var16.length() > 0) {
               var11 = Double.valueOf(var16);
               if (var11 < 0.0) {
                  return null;
               }
            }

            return new mxStencilShape.svgShape(new java.awt.geom.Ellipse2D.Double(var26 - var9, var7 - var11, var9 * 2.0, var11 * 2.0), var4);
         }

         if (this.isPath(var1.getNodeName())) {
            String var5 = var2.getAttribute("d");
            Shape var6 = AWTPathProducer.createShape(var5, 1);
            return new mxStencilShape.svgShape(var6, var4);
         }
      }

      return null;
   }

   private boolean isRectangle(String var1) {
      return var1.equals("svg:rect") || var1.equals("rect");
   }

   private boolean isPath(String var1) {
      return var1.equals("svg:path") || var1.equals("path");
   }

   private boolean isEllipse(String var1) {
      return var1.equals("svg:ellipse") || var1.equals("ellipse");
   }

   private boolean isLine(String var1) {
      return var1.equals("svg:line") || var1.equals("line");
   }

   private boolean isPolyline(String var1) {
      return var1.equals("svg:polyline") || var1.equals("polyline");
   }

   private boolean isCircle(String var1) {
      return var1.equals("svg:circle") || var1.equals("circle");
   }

   private boolean isPolygon(String var1) {
      return var1.equals("svg:polygon") || var1.equals("polygon");
   }

   private boolean isGroup(String var1) {
      return var1.equals("svg:g") || var1.equals("g");
   }

   protected static Map<String, Object> getStylenames(String var0) {
      if (var0 != null && var0.length() > 0) {
         Hashtable var1 = new Hashtable();
         if (var0 != null) {
            String[] var2 = var0.split(";");

            for (int var3 = 0; var3 < var2.length; var3++) {
               String[] var4 = var2[var3].split(":");
               if (var4.length == 2) {
                  var1.put(var4[0].trim(), var4[1].trim());
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getIconPath() {
      return this.iconPath;
   }

   public void setIconPath(String var1) {
      this.iconPath = var1;
   }

   public Rectangle2D getBoundingBox() {
      return this.boundingBox;
   }

   public void setBoundingBox(Rectangle2D var1) {
      this.boundingBox = var1;
   }

   protected class svgShape {
      public Shape shape;
      protected Map<String, Object> style;
      public List<mxStencilShape.svgShape> subShapes;
      protected double currentXScale;
      protected double currentYScale;

      public svgShape(Shape var2, Map<String, Object> var3) {
         this.shape = var2;
         this.style = var3;
         this.subShapes = new ArrayList<>();
      }

      public double getCurrentXScale() {
         return this.currentXScale;
      }

      public void setCurrentXScale(double var1) {
         this.currentXScale = var1;
      }

      public double getCurrentYScale() {
         return this.currentYScale;
      }

      public void setCurrentYScale(double var1) {
         this.currentYScale = var1;
      }
   }
}
