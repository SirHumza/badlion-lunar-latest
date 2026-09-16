package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxLightweightLabel;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Map;
import javax.swing.CellRendererPane;

public class mxHtmlTextShape implements mxITextShape {
   protected boolean replaceHtmlLinefeeds = true;

   public boolean isReplaceHtmlLinefeeds() {
      return this.replaceHtmlLinefeeds;
   }

   public void setReplaceHtmlLinefeeds(boolean var1) {
      this.replaceHtmlLinefeeds = var1;
   }

   protected String createHtmlDocument(Map<String, Object> var1, String var2, int var3, int var4) {
      String var5 = mxUtils.getString(var1, mxConstants.STYLE_OVERFLOW, "");
      if (var5.equals("fill")) {
         return mxUtils.createHtmlDocument(var1, var2, 1.0, var3, null, "height:" + var4 + "pt;");
      } else {
         return var5.equals("width") ? mxUtils.createHtmlDocument(var1, var2, 1.0, var3) : mxUtils.createHtmlDocument(var1, var2);
      }
   }

   @Override
   public void paintShape(mxGraphics2DCanvas var1, String var2, mxCellState var3, Map<String, Object> var4) {
      mxLightweightLabel var5 = mxLightweightLabel.getSharedInstance();
      CellRendererPane var6 = var1.getRendererPane();
      Rectangle var7 = var3.getLabelBounds().getRectangle();
      Graphics2D var8 = var1.getGraphics();
      if (var5 != null && var6 != null && (var8.getClipBounds() == null || var8.getClipBounds().intersects(var7))) {
         double var9 = var1.getScale();
         int var11 = var7.x;
         int var12 = var7.y;
         int var13 = var7.width;
         int var14 = var7.height;
         if (!mxUtils.isTrue(var4, mxConstants.STYLE_HORIZONTAL, true)) {
            var8.rotate(-Math.PI / 2, var11 + var13 / 2, var12 + var14 / 2);
            var8.translate(var13 / 2 - var14 / 2, var14 / 2 - var13 / 2);
            int var15 = var13;
            var13 = var14;
            var14 = var15;
         }

         if (this.isReplaceHtmlLinefeeds()) {
            var2 = var2.replaceAll("\n", "<br>");
         }

         var5.setText(
            this.createHtmlDocument(var4, var2, (int)Math.round(var13 / var3.getView().getScale()), (int)Math.round(var14 / var3.getView().getScale()))
         );
         var5.setFont(mxUtils.getFont(var4, var1.getScale()));
         var8.scale(var9, var9);
         var6.paintComponent(
            var8,
            var5,
            var6,
            (int)(var11 / var9) + mxConstants.LABEL_INSET,
            (int)(var12 / var9) + mxConstants.LABEL_INSET,
            (int)(var13 / var9),
            (int)(var14 / var9),
            true
         );
      }
   }
}
