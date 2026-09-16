package org.jgrapht.event;

import java.util.EventObject;

public class ConnectedComponentTraversalEvent extends EventObject {
   private static final long serialVersionUID = 3834311717709822262L;
   public static final int CONNECTED_COMPONENT_STARTED = 31;
   public static final int CONNECTED_COMPONENT_FINISHED = 32;
   private int type;

   public ConnectedComponentTraversalEvent(Object var1, int var2) {
      super(var1);
      this.type = var2;
   }

   public int getType() {
      return this.type;
   }
}
