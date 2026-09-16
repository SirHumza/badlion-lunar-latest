package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D.Float;
import java.util.Hashtable;
import java.util.Map;

public class mxMarkerRegistry {
   protected static Map<String, mxIMarker> markers = new Hashtable<>();

   public static mxIMarker getMarker(String var0) {
      return markers.get(var0);
   }

   public static void registerMarker(String var0, mxIMarker var1) {
      markers.put(var0, var1);
   }

   static {
      mxIMarker var0 = new mxIMarker() {
         @Override
         public mxPoint paintMarker(mxGraphics2DCanvas var1, mxCellState var2, String var3, mxPoint var4, double var5, double var7, double var9, boolean var11) {
            Polygon var12 = new Polygon();
            var12.addPoint((int)Math.round(var4.getX()), (int)Math.round(var4.getY()));
            var12.addPoint((int)Math.round(var4.getX() - var5 - var7 / 2.0), (int)Math.round(var4.getY() - var7 + var5 / 2.0));
            if (var3.equals("classic")) {
               var12.addPoint((int)Math.round(var4.getX() - var5 * 3.0 / 4.0), (int)Math.round(var4.getY() - var7 * 3.0 / 4.0));
            }

            var12.addPoint((int)Math.round(var4.getX() + var7 / 2.0 - var5), (int)Math.round(var4.getY() - var7 - var5 / 2.0));
            if (mxUtils.isTrue(var2.getStyle(), var11 ? "startFill" : "endFill", true)) {
               var1.fillShape(var12);
            }

            var1.getGraphics().draw(var12);
            return new mxPoint(-var5, -var7);
         }
      };
      registerMarker("classic", var0);
      registerMarker("block", var0);
      registerMarker(
         "open",
         new mxIMarker() {
            @Override
            public mxPoint paintMarker(
               mxGraphics2DCanvas var1, mxCellState var2, String var3, mxPoint var4, double var5, double var7, double var9, boolean var11
            ) {
               var1.getGraphics()
                  .draw(
                     new Float(
                        (int)Math.round(var4.getX() - var5 - var7 / 2.0),
                        (int)Math.round(var4.getY() - var7 + var5 / 2.0),
                        (int)Math.round(var4.getX() - var5 / 6.0),
                        (int)Math.round(var4.getY() - var7 / 6.0)
                     )
                  );
               var1.getGraphics()
                  .draw(
                     new Float(
                        (int)Math.round(var4.getX() - var5 / 6.0),
                        (int)Math.round(var4.getY() - var7 / 6.0),
                        (int)Math.round(var4.getX() + var7 / 2.0 - var5),
                        (int)Math.round(var4.getY() - var7 - var5 / 2.0)
                     )
                  );
               return new mxPoint(-var5 / 2.0, -var7 / 2.0);
            }
         }
      );
      registerMarker(
         "oval",
         new mxIMarker() {
            @Override
            public mxPoint paintMarker(
               mxGraphics2DCanvas var1, mxCellState var2, String var3, mxPoint var4, double var5, double var7, double var9, boolean var11
            ) {
               double var12 = var4.getX() - var5 / 2.0;
               double var14 = var4.getY() - var7 / 2.0;
               double var16 = var9 / 2.0;
               Double var18 = new Double(var12 - var16, var14 - var16, var9, var9);
               if (mxUtils.isTrue(var2.getStyle(), var11 ? "startFill" : "endFill", true)) {
                  var1.fillShape(var18);
               }

               var1.getGraphics().draw(var18);
               return new mxPoint(-var5 / 2.0, -var7 / 2.0);
            }
         }
      );
      registerMarker(
         "diamond",
         new mxIMarker() {
            @Override
            public mxPoint paintMarker(
               mxGraphics2DCanvas var1, mxCellState var2, String var3, mxPoint var4, double var5, double var7, double var9, boolean var11
            ) {
               Polygon var12 = new Polygon();
               var12.addPoint((int)Math.round(var4.getX()), (int)Math.round(var4.getY()));
               var12.addPoint((int)Math.round(var4.getX() - var5 / 2.0 - var7 / 2.0), (int)Math.round(var4.getY() + var5 / 2.0 - var7 / 2.0));
               var12.addPoint((int)Math.round(var4.getX() - var5), (int)Math.round(var4.getY() - var7));
               var12.addPoint((int)Math.round(var4.getX() - var5 / 2.0 + var7 / 2.0), (int)Math.round(var4.getY() - var7 / 2.0 - var5 / 2.0));
               if (mxUtils.isTrue(var2.getStyle(), var11 ? "startFill" : "endFill", true)) {
                  var1.fillShape(var12);
               }

               var1.getGraphics().draw(var12);
               return new mxPoint(-var5 / 2.0, -var7 / 2.0);
            }
         }
      );
   }
}
