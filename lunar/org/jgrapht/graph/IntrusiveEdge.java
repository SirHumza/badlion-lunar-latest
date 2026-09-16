package org.jgrapht.graph;

import java.io.Serializable;

class IntrusiveEdge implements Serializable, Cloneable {
   private static final long serialVersionUID = 3258408452177932855L;
   Object source;
   Object target;

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }
}
