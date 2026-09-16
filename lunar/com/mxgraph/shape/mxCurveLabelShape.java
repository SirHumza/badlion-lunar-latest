package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxCurve;
import com.mxgraph.util.mxLine;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class mxCurveLabelShape implements mxITextShape {
   protected String lastValue;
   protected Font lastFont;
   protected List<mxPoint> lastPoints;
   protected mxCurve curve;
   protected mxCellState state;
   protected mxCurveLabelShape.LabelGlyphCache[] labelGlyphs;
   protected double labelSize;
   protected mxRectangle labelBounds;
   protected mxCurveLabelShape.LabelPosition labelPosition = new mxCurveLabelShape.LabelPosition();
   public static double LABEL_BUFFER = 30.0;
   public static double CURVE_TEXT_STRETCH_FACTOR = 20.0;
   public static mxRectangle INVALID_GLYPH_BOUNDS = new mxRectangle(0.0, 0.0, 0.0, 0.0);
   public int centerVisibleIndex = 0;
   public static Object FONT_FRACTIONALMETRICS = RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT;
   public GlyphVector[] rtlGlyphVectors;
   public static FontRenderContext frc = new FontRenderContext(null, false, false);
   protected boolean rotationEnabled = true;

   public mxCurveLabelShape(mxCellState var1, mxCurve var2) {
      this.state = var1;
      this.curve = var2;
   }

   public boolean getRotationEnabled() {
      return this.rotationEnabled;
   }

   public void setRotationEnabled(boolean var1) {
      this.rotationEnabled = var1;
   }

   @Override
   public void paintShape(mxGraphics2DCanvas var1, String var2, mxCellState var3, Map<String, Object> var4) {
      Rectangle var5 = var3.getLabelBounds().getRectangle();
      Graphics2D var6 = var1.getGraphics();
      if (this.labelGlyphs == null) {
         this.updateLabelBounds(var2, var4);
      }

      if (this.labelGlyphs != null && (var6.getClipBounds() == null || var6.getClipBounds().intersects(var5))) {
         float var7 = mxUtils.getFloat(var4, mxConstants.STYLE_OPACITY, 100.0F);
         var6 = var1.createTemporaryGraphics(var4, var7, var3);
         Font var9 = mxUtils.getFont(var4, var1.getScale());
         var6.setFont(var9);
         Color var10 = mxUtils.getColor(var4, mxConstants.STYLE_FONTCOLOR, Color.black);
         var6.setColor(var10);
         var6.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
         var6.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, FONT_FRACTIONALMETRICS);

         for (int var11 = 0; var11 < this.labelGlyphs.length; var11++) {
            mxLine var12 = this.labelGlyphs[var11].glyphGeometry;
            if (this.labelGlyphs[var11].visible && var12 != null && var12 != mxCurve.INVALID_POSITION) {
               mxPoint var13 = var12.getEndPoint();
               double var14 = var13.getX();
               double var16 = Math.atan(var13.getY() / var14);
               if (var14 < 0.0) {
                  var16 += Math.PI;
               }

               AffineTransform var18 = var6.getTransform();
               var6.translate(var12.getX(), var12.getY());
               var6.rotate(var16);
               Shape var19 = this.labelGlyphs[var11].glyphShape;
               var6.fill(var19);
               var6.setTransform(var18);
            }
         }

         var6.dispose();
      }
   }

   public mxRectangle updateLabelBounds(String var1, Map<String, Object> var2) {
      double var3 = this.state.getView().getScale();
      Font var5 = mxUtils.getFont(var2, var3);
      FontMetrics var6 = mxUtils.getFontMetrics(var5);
      int var7 = 0;
      int var8 = 0;
      if (var6 != null) {
         var7 = var6.getDescent();
         var8 = var6.getAscent();
      }

      if (this.labelGlyphs == null || !var1.equals(this.lastValue)) {
         this.labelGlyphs = new mxCurveLabelShape.LabelGlyphCache[var1.length()];
      }

      if (!var1.equals(this.lastValue) || !var5.equals(this.lastFont)) {
         char[] var9 = var1.toCharArray();
         ArrayList var10 = new ArrayList();
         boolean var11 = Bidi.requiresBidi(var9, 0, var9.length);
         this.labelSize = 0.0;
         if (!var11) {
            this.rtlGlyphVectors = null;
            BreakIterator var71 = BreakIterator.getCharacterInstance(Locale.getDefault());
            var71.setText(var1);
            int var72 = 0;

            while (var72 < var1.length()) {
               int var75 = var71.next();
               int var77 = 1;
               if (var75 != -1) {
                  var77 = var75 - var72;
               }

               String var79 = var1.substring(var72, var72 + var77);
               mxCurveLabelShape.LabelGlyphCache var81 = new mxCurveLabelShape.LabelGlyphCache();
               var10.add(var81);
               var81.glyph = var79;
               GlyphVector var82 = var5.createGlyphVector(frc, var79);
               var81.glyphShape = var82.getOutline();
               if (var6 == null) {
                  mxRectangle var84 = new mxRectangle(var5.getStringBounds(var79, frc));
                  var81.labelGlyphBounds = var84;
                  this.labelSize = this.labelSize + var84.getWidth();
               } else {
                  double var85 = var6.stringWidth(var79);
                  var81.labelGlyphBounds = new mxRectangle(0.0, 0.0, var85, var8);
                  this.labelSize += var85;
               }

               var72 += var77;
            }
         } else {
            Bidi var12 = new Bidi(var1, -2);
            int var13 = var12.getRunCount();
            if (this.rtlGlyphVectors == null || this.rtlGlyphVectors.length != var13) {
               this.rtlGlyphVectors = new GlyphVector[var13];
            }

            for (int var14 = 0; var14 < var12.getRunCount(); var14++) {
               String var15 = var1.substring(var12.getRunStart(var14), var12.getRunLimit(var14));
               this.rtlGlyphVectors[var14] = var5.layoutGlyphVector(frc, var15.toCharArray(), 0, var15.length(), 1);
            }

            int var74 = 0;

            for (GlyphVector var18 : this.rtlGlyphVectors) {
               float var19 = 0.0F;

               for (int var20 = 0; var20 < var18.getNumGlyphs(); var20++) {
                  Shape var21 = var18.getGlyphOutline(var20, -var19, 0.0F);
                  mxCurveLabelShape.LabelGlyphCache var22 = new mxCurveLabelShape.LabelGlyphCache();
                  var10.add(var22);
                  var22.glyphShape = var21;
                  mxRectangle var23 = new mxRectangle(var18.getGlyphLogicalBounds(var20).getBounds2D());
                  var22.labelGlyphBounds = var23;
                  this.labelSize = this.labelSize + var23.getWidth();
                  var19 = (float)(var19 + var23.getWidth());
                  var74++;
               }
            }
         }

         this.lastValue = var1;
         this.lastFont = var5;
         this.lastPoints = this.curve.getGuidePoints();
         this.labelGlyphs = var10.toArray(new mxCurveLabelShape.LabelGlyphCache[var10.size()]);
      }

      this.labelPosition.startBuffer = LABEL_BUFFER * var3;
      this.labelPosition.endBuffer = LABEL_BUFFER * var3;
      this.calculationLabelPosition(var2, var1);
      if (this.curve.isLabelReversed()) {
         double var68 = this.labelPosition.startBuffer;
         this.labelPosition.startBuffer = this.labelPosition.endBuffer;
         this.labelPosition.endBuffer = var68;
      }

      double var69 = this.curve.getCurveLength(mxCurve.LABEL_CURVE);
      double var70 = this.labelPosition.startBuffer / var69;
      double var73 = 1.0 - this.labelPosition.endBuffer / var69;
      mxRectangle var78 = null;
      this.centerVisibleIndex = 0;
      double var80 = 0.0;
      double var83 = 0.3;
      double var86 = 0.5;
      mxLine var87 = null;

      for (int var88 = 0; var88 < this.labelGlyphs.length; var88++) {
         if (var70 > var73) {
            this.labelGlyphs[var88].visible = false;
         } else {
            mxLine var24 = var87;
            if (var80 > var83 || var87 == null) {
               var24 = this.curve.getCurveParallel(mxCurve.LABEL_CURVE, var70);
               var80 = 0.0;
               var87 = null;
            }

            this.labelGlyphs[var88].glyphGeometry = var24;
            if (var24 != mxCurve.INVALID_POSITION) {
               double var25 = this.labelGlyphs[var88].labelGlyphBounds.getWidth();
               double var27 = this.labelGlyphs[var88].labelGlyphBounds.getHeight();
               double var29 = var24.getEndPoint().getX();
               double var31 = var24.getEndPoint().getY();
               double var33 = var24.getX() - var7 * var31;
               double var35 = var33;
               double var37 = var33;
               double var39 = var24.getY() + var7 * var29;
               double var41 = var39;
               double var43 = var39;
               double var45 = var33 + (var27 + var7) * var31;
               double var47 = var39 - (var27 + var7) * var29;
               var35 = Math.min(var35, var45);
               var37 = Math.max(var37, var45);
               var41 = Math.min(var41, var47);
               var43 = Math.max(var43, var47);
               double var49 = var33 + var25 * var29;
               double var51 = var39 + var25 * var31;
               var35 = Math.min(var35, var49);
               var37 = Math.max(var37, var49);
               var41 = Math.min(var41, var51);
               var43 = Math.max(var43, var51);
               double var53 = var45 + var25 * var29;
               double var55 = var47 + var25 * var31;
               var35 = Math.min(var35, var53);
               var37 = Math.max(var37, var53);
               var41 = Math.min(var41, var55);
               var43 = Math.max(var43, var55);
               var35 -= 2.0 * var3;
               var41 -= 2.0 * var3;
               var37 += 2.0 * var3;
               var43 += 2.0 * var3;
               this.postprocessGlyph(this.curve, var1, var88, var70);
               double var57 = var70 + (this.labelGlyphs[var88].labelGlyphBounds.getWidth() + this.labelPosition.defaultInterGlyphSpace) / var69;
               var87 = this.curve.getCurveParallel(mxCurve.LABEL_CURVE, var57);
               var70 = var57;
               mxPoint var59 = var87.getEndPoint();
               double var60 = var59.getX();
               double var62 = var59.getY();
               if (var87 != mxCurve.INVALID_POSITION && var88 + 1 < var1.length()) {
                  double var64 = Math.abs(var29 - var60);
                  double var66 = Math.abs(var31 - var62);
                  var80 = Math.sqrt(var64 * var64 + var66 * var66);
               }

               if (var80 > var83) {
                  int var106 = Line2D.relativeCCW(0.0, 0.0, var29, var31, var60, var62);
                  if (var106 == 1) {
                     if (var80 > var86) {
                        var80 = var86;
                     }

                     double var65 = var80 * CURVE_TEXT_STRETCH_FACTOR / var69;
                     var70 += var65;
                     var73 += var65;
                  }
               }

               if (this.labelGlyphs[var88].drawingBounds != null) {
                  this.labelGlyphs[var88].drawingBounds.setRect(var35, var41, var37 - var35, var43 - var41);
               } else {
                  this.labelGlyphs[var88].drawingBounds = new mxRectangle(var35, var41, var37 - var35, var43 - var41);
               }

               if (var78 == null) {
                  var78 = (mxRectangle)this.labelGlyphs[var88].drawingBounds.clone();
               } else {
                  var78.add(this.labelGlyphs[var88].drawingBounds);
               }

               this.labelGlyphs[var88].visible = true;
               this.centerVisibleIndex++;
            }
         }
      }

      this.centerVisibleIndex /= 2;
      if (var78 == null) {
         mxLine var89 = this.curve.getCurveParallel(mxCurve.LABEL_CURVE, 0.5);
         var78 = new mxRectangle(var89.getX(), var89.getY(), 1.0, 1.0);
      }

      this.labelBounds = var78;
      return var78;
   }

   protected void postprocessGlyph(mxCurve var1, String var2, int var3, double var4) {
   }

   public boolean intersectsRect(Rectangle var1) {
      if ((this.labelBounds == null || this.labelBounds.getRectangle().intersects(var1)) && this.labelGlyphs != null) {
         for (int var2 = 0; var2 < this.labelGlyphs.length; var2++) {
            if (this.labelGlyphs[var2].visible && var1.intersects(this.labelGlyphs[var2].drawingBounds.getRectangle())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void calculationLabelPosition(Map<String, Object> var1, String var2) {
      double var3 = this.curve.getCurveLength(mxCurve.LABEL_CURVE);
      double var5 = var3 - this.labelPosition.startBuffer - this.labelPosition.endBuffer;
      this.labelPosition.startBuffer = Math.max(this.labelPosition.startBuffer, this.labelPosition.startBuffer + var5 / 2.0 - this.labelSize / 2.0);
      this.labelPosition.endBuffer = Math.max(this.labelPosition.endBuffer, this.labelPosition.endBuffer + var5 / 2.0 - this.labelSize / 2.0);
   }

   public mxCurve getCurve() {
      return this.curve;
   }

   public void setCurve(mxCurve var1) {
      this.curve = var1;
   }

   public mxRectangle getLabelBounds() {
      return this.labelBounds;
   }

   public mxRectangle getCenterVisiblePosition() {
      return this.labelGlyphs[this.centerVisibleIndex].drawingBounds;
   }

   public class LabelGlyphCache {
      public mxRectangle labelGlyphBounds;
      public mxRectangle drawingBounds;
      public String glyph;
      public mxLine glyphGeometry;
      public Shape glyphShape;
      public boolean visible;
   }

   public class LabelPosition {
      public double startBuffer = mxCurveLabelShape.LABEL_BUFFER;
      public double endBuffer = mxCurveLabelShape.LABEL_BUFFER;
      public double defaultInterGlyphSpace = 0.0;
   }
}
