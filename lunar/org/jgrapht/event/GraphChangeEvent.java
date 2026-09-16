package org.jgrapht.event;

import java.util.EventObject;

public class GraphChangeEvent extends EventObject {
   private static final long serialVersionUID = 3834592106026382391L;
   protected int type;

   public GraphChangeEvent(Object var1, int var2) {
      super(var1);
      this.type = var2;
   }

   public int getType() {
      return this.type;
   }
}
