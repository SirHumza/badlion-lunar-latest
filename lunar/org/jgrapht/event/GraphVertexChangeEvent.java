package org.jgrapht.event;

public class GraphVertexChangeEvent<V> extends GraphChangeEvent {
   private static final long serialVersionUID = 3690189962679104053L;
   public static final int BEFORE_VERTEX_ADDED = 11;
   public static final int BEFORE_VERTEX_REMOVED = 12;
   public static final int VERTEX_ADDED = 13;
   public static final int VERTEX_REMOVED = 14;
   protected V vertex;

   public GraphVertexChangeEvent(Object var1, int var2, V var3) {
      super(var1, var2);
      this.vertex = (V)var3;
   }

   public V getVertex() {
      return this.vertex;
   }
}
