package org.jgrapht.alg.drawing.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class ListenableLayoutModel2D<V> implements LayoutModel2D<V> {
   protected LayoutModel2D<V> model;
   protected List<BiConsumer<V, Point2D>> listeners;

   public ListenableLayoutModel2D(LayoutModel2D<V> var1) {
      this.model = Objects.requireNonNull(var1);
      this.listeners = new ArrayList<>();
   }

   @Override
   public Box2D getDrawableArea() {
      return this.model.getDrawableArea();
   }

   @Override
   public void setDrawableArea(Box2D var1) {
      this.model.setDrawableArea(var1);
   }

   @Override
   public Iterator<Entry<V, Point2D>> iterator() {
      return this.model.iterator();
   }

   @Override
   public Point2D get(V var1) {
      return this.model.get((V)var1);
   }

   @Override
   public Point2D put(V var1, Point2D var2) {
      if (!this.model.isFixed((V)var1)) {
         Point2D var3 = this.model.put((V)var1, var2);
         this.notifyListeners((V)var1, var2);
         return var3;
      } else {
         return this.model.get((V)var1);
      }
   }

   @Override
   public void setFixed(V var1, boolean var2) {
      this.model.setFixed((V)var1, var2);
   }

   @Override
   public boolean isFixed(V var1) {
      return this.model.isFixed((V)var1);
   }

   public BiConsumer<V, Point2D> addListener(BiConsumer<V, Point2D> var1) {
      this.listeners.add(var1);
      return var1;
   }

   public boolean removeListener(BiConsumer<V, Point2D> var1) {
      return this.listeners.remove(var1);
   }

   protected void notifyListeners(V var1, Point2D var2) {
      for (BiConsumer var4 : this.listeners) {
         var4.accept(var1, var2);
      }
   }
}
