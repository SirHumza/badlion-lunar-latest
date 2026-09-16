package com.mxgraph.canvas;

public interface mxICanvas2D {
   void save();

   void restore();

   void scale(double var1);

   void translate(double var1, double var3);

   void rotate(double var1, boolean var3, boolean var4, double var5, double var7);

   void setStrokeWidth(double var1);

   void setStrokeColor(String var1);

   void setDashed(boolean var1);

   void setDashed(boolean var1, boolean var2);

   void setDashPattern(String var1);

   void setLineCap(String var1);

   void setLineJoin(String var1);

   void setMiterLimit(double var1);

   void setFontSize(double var1);

   void setFontColor(String var1);

   void setFontFamily(String var1);

   void setFontStyle(int var1);

   void setFontBackgroundColor(String var1);

   void setFontBorderColor(String var1);

   void setAlpha(double var1);

   void setFillAlpha(double var1);

   void setStrokeAlpha(double var1);

   void setFillColor(String var1);

   void setGradient(String var1, String var2, double var3, double var5, double var7, double var9, String var11, double var12, double var14);

   void setShadow(boolean var1);

   void setShadowColor(String var1);

   void setShadowAlpha(double var1);

   void setShadowOffset(double var1, double var3);

   void rect(double var1, double var3, double var5, double var7);

   void roundrect(double var1, double var3, double var5, double var7, double var9, double var11);

   void ellipse(double var1, double var3, double var5, double var7);

   void image(double var1, double var3, double var5, double var7, String var9, boolean var10, boolean var11, boolean var12);

   void text(
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
   );

   void begin();

   void moveTo(double var1, double var3);

   void lineTo(double var1, double var3);

   void quadTo(double var1, double var3, double var5, double var7);

   void curveTo(double var1, double var3, double var5, double var7, double var9, double var11);

   void close();

   void stroke();

   void fill();

   void fillAndStroke();
}
