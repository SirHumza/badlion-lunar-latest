package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Map;

public class mxDefaultTextShape implements mxITextShape {
   @Override
   public void paintShape(mxGraphics2DCanvas var1, String var2, mxCellState var3, Map<String, Object> var4) {
      Rectangle var5 = var3.getLabelBounds().getRectangle();
      Graphics2D var6 = var1.getGraphics();
      if (var6.getClipBounds() == null || var6.getClipBounds().intersects(var5)) {
         boolean var7 = mxUtils.isTrue(var4, mxConstants.STYLE_HORIZONTAL, true);
         double var8 = var1.getScale();
         int var10 = var5.x;
         int var11 = var5.y;
         int var12 = var5.width;
         int var13 = var5.height;
         if (!var7) {
            var6.rotate(-Math.PI / 2, var10 + var12 / 2, var11 + var13 / 2);
            var6.translate(var12 / 2 - var13 / 2, var13 / 2 - var12 / 2);
         }

         Color var14 = mxUtils.getColor(var4, mxConstants.STYLE_FONTCOLOR, Color.black);
         var6.setColor(var14);
         Font var15 = mxUtils.getFont(var4, var8);
         var6.setFont(var15);
         int var16 = mxUtils.getInt(var4, mxConstants.STYLE_FONTSIZE, mxConstants.DEFAULT_FONTSIZE);
         FontMetrics var17 = var6.getFontMetrics();
         int var18 = var15.getSize();
         double var19 = (double)var18 / var16;
         double var21 = var19 / var8;
         var11 = (int)(var11 + (2 * var17.getMaxAscent() - var17.getHeight() + mxConstants.LABEL_INSET * var8));
         String var23 = mxUtils.getString(var4, mxConstants.STYLE_VERTICAL_ALIGN, "middle");
         double var24 = 0.5;
         if (var23.equals("top")) {
            var24 = 0.0;
         } else if (var23.equals("bottom")) {
            var24 = 1.0;
         }

         var11 = (int)(var11 + (1.0 - var21) * var13 * var24);
         String var26 = mxUtils.getString(var4, mxConstants.STYLE_ALIGN, "center");
         if (var26.equals("left")) {
            var10 = (int)(var10 + mxConstants.LABEL_INSET * var8);
         } else if (var26.equals("right")) {
            var10 = (int)(var10 - mxConstants.LABEL_INSET * var8);
         }

         String[] var27 = var2.split("\n");

         for (int var28 = 0; var28 < var27.length; var28++) {
            int var29 = 0;
            if (var26.equals("center")) {
               int var30 = var17.stringWidth(var27[var28]);
               if (var7) {
                  var29 = (var12 - var30) / 2;
               } else {
                  var29 = (var13 - var30) / 2;
               }
            } else if (var26.equals("right")) {
               int var33 = var17.stringWidth(var27[var28]);
               var29 = (var7 ? var12 : var13) - var33;
            }

            var6.drawString(var27[var28], var10 + var29, var11);
            this.postProcessLine(var2, var27[var28], var17, var1, var10 + var29, var11);
            var11 += var17.getHeight() + mxConstants.LINESPACING;
         }
      }
   }

   protected void postProcessLine(String var1, String var2, FontMetrics var3, mxGraphics2DCanvas var4, int var5, int var6) {
   }
}
