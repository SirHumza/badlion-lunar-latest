package org.jgrapht.event;

import java.util.EventObject;

public class EdgeTraversalEvent<E> extends EventObject {
   private static final long serialVersionUID = 4050768173789820979L;
   protected E edge;

   public EdgeTraversalEvent(Object var1, E var2) {
      super(var1);
      this.edge = (E)var2;
   }

   public E getEdge() {
      return this.edge;
   }
}
