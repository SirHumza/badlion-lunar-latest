package org.jgrapht.alg.drawing.model;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public interface LayoutModel2D<V> extends Iterable<Entry<V, Point2D>> {
   Box2D getDrawableArea();

   void setDrawableArea(Box2D var1);

   Point2D get(V var1);

   Point2D put(V var1, Point2D var2);

   void setFixed(V var1, boolean var2);

   boolean isFixed(V var1);

   default Map<V, Point2D> collect() {
      LinkedHashMap var1 = new LinkedHashMap();

      for (Entry var3 : this) {
         var1.put(var3.getKey(), (Point2D)var3.getValue());
      }

      return var1;
   }

   @Override
   Iterator<Entry<V, Point2D>> iterator();
}
