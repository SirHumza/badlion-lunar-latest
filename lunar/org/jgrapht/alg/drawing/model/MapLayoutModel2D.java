package org.jgrapht.alg.drawing.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapLayoutModel2D<V> implements LayoutModel2D<V> {
   protected Box2D drawableArea;
   protected Map<V, Point2D> points;
   protected Set<V> fixed;

   public MapLayoutModel2D(Box2D var1) {
      this.drawableArea = var1;
      this.points = new LinkedHashMap<>();
      this.fixed = new HashSet<>();
   }

   @Override
   public Box2D getDrawableArea() {
      return this.drawableArea;
   }

   @Override
   public void setDrawableArea(Box2D var1) {
      this.drawableArea = var1;
   }

   @Override
   public Iterator<Entry<V, Point2D>> iterator() {
      return this.points.entrySet().iterator();
   }

   @Override
   public Point2D get(V var1) {
      return this.points.get(var1);
   }

   @Override
   public Point2D put(V var1, Point2D var2) {
      boolean var3 = this.fixed.contains(var1);
      return !var3 ? this.points.put((V)var1, var2) : this.points.putIfAbsent((V)var1, var2);
   }

   @Override
   public void setFixed(V var1, boolean var2) {
      if (var2) {
         this.fixed.add((V)var1);
      } else {
         this.fixed.remove(var1);
      }
   }

   @Override
   public boolean isFixed(V var1) {
      return this.fixed.contains(var1);
   }
}
