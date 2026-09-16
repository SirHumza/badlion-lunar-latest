package org.jgrapht.event;

import java.util.EventObject;

public class VertexTraversalEvent<V> extends EventObject {
   private static final long serialVersionUID = 3688790267213918768L;
   protected V vertex;

   public VertexTraversalEvent(Object var1, V var2) {
      super(var1);
      this.vertex = (V)var2;
   }

   public V getVertex() {
      return this.vertex;
   }
}
