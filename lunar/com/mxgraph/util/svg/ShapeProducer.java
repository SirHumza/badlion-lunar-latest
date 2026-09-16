package com.mxgraph.util.svg;

import java.awt.Shape;

public interface ShapeProducer {
   Shape getShape();

   void setWindingRule(int var1);

   int getWindingRule();
}
