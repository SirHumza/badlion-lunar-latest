package com.mxgraph.util.svg;

public interface PathHandler {
   void startPath();

   void endPath();

   void movetoRel(float var1, float var2);

   void movetoAbs(float var1, float var2);

   void closePath();

   void linetoRel(float var1, float var2);

   void linetoAbs(float var1, float var2);

   void linetoHorizontalRel(float var1);

   void linetoHorizontalAbs(float var1);

   void linetoVerticalRel(float var1);

   void linetoVerticalAbs(float var1);

   void curvetoCubicRel(float var1, float var2, float var3, float var4, float var5, float var6);

   void curvetoCubicAbs(float var1, float var2, float var3, float var4, float var5, float var6);

   void curvetoCubicSmoothRel(float var1, float var2, float var3, float var4);

   void curvetoCubicSmoothAbs(float var1, float var2, float var3, float var4);

   void curvetoQuadraticRel(float var1, float var2, float var3, float var4);

   void curvetoQuadraticAbs(float var1, float var2, float var3, float var4);

   void curvetoQuadraticSmoothRel(float var1, float var2);

   void curvetoQuadraticSmoothAbs(float var1, float var2);

   void arcRel(float var1, float var2, float var3, boolean var4, boolean var5, float var6, float var7);

   void arcAbs(float var1, float var2, float var3, boolean var4, boolean var5, float var6, float var7);
}
