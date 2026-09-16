package com.mxgraph.view;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class mxStyleRegistry {
   protected static Map<String, Object> values = new Hashtable<>();

   public static void putValue(String var0, Object var1) {
      values.put(var0, var1);
   }

   public static Object getValue(String var0) {
      return values.get(var0);
   }

   public static String getName(Object var0) {
      for (Entry var2 : values.entrySet()) {
         if (var2.getValue() == var0) {
            return (String)var2.getKey();
         }
      }

      return null;
   }

   static {
      putValue("elbowEdgeStyle", mxEdgeStyle.ElbowConnector);
      putValue("entityRelationEdgeStyle", mxEdgeStyle.EntityRelation);
      putValue("loopEdgeStyle", mxEdgeStyle.Loop);
      putValue("sideToSideEdgeStyle", mxEdgeStyle.SideToSide);
      putValue("topToBottomEdgeStyle", mxEdgeStyle.TopToBottom);
      putValue("orthogonalEdgeStyle", mxEdgeStyle.OrthConnector);
      putValue("segmentEdgeStyle", mxEdgeStyle.SegmentConnector);
      putValue("ellipsePerimeter", mxPerimeter.EllipsePerimeter);
      putValue("rectanglePerimeter", mxPerimeter.RectanglePerimeter);
      putValue("rhombusPerimeter", mxPerimeter.RhombusPerimeter);
      putValue("trianglePerimeter", mxPerimeter.TrianglePerimeter);
      putValue("hexagonPerimeter", mxPerimeter.HexagonPerimeter);
   }
}
