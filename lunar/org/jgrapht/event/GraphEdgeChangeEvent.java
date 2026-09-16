package org.jgrapht.event;

public class GraphEdgeChangeEvent<V, E> extends GraphChangeEvent {
   private static final long serialVersionUID = -4421610303769803253L;
   public static final int BEFORE_EDGE_ADDED = 21;
   public static final int BEFORE_EDGE_REMOVED = 22;
   public static final int EDGE_ADDED = 23;
   public static final int EDGE_REMOVED = 24;
   public static final int EDGE_WEIGHT_UPDATED = 25;
   protected E edge;
   protected V edgeSource;
   protected V edgeTarget;
   protected double edgeWeight;

   public GraphEdgeChangeEvent(Object var1, int var2, E var3, V var4, V var5) {
      this(var1, var2, (E)var3, (V)var4, (V)var5, 1.0);
   }

   public GraphEdgeChangeEvent(Object var1, int var2, E var3, V var4, V var5, double var6) {
      super(var1, var2);
      this.edge = (E)var3;
      this.edgeSource = (V)var4;
      this.edgeTarget = (V)var5;
      this.edgeWeight = var6;
   }

   public E getEdge() {
      return this.edge;
   }

   public V getEdgeSource() {
      return this.edgeSource;
   }

   public V getEdgeTarget() {
      return this.edgeTarget;
   }

   public double getEdgeWeight() {
      return this.edgeWeight;
   }
}
