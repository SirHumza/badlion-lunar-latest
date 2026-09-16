package org.jgrapht.alg.shortestpath;

import org.jgrapht.GraphPath;

public class NegativeCycleDetectedException extends RuntimeException {
   private static final long serialVersionUID = -8064609917721881630L;
   private GraphPath<?, ?> cycle;

   public NegativeCycleDetectedException() {
   }

   public NegativeCycleDetectedException(String var1) {
      super(var1);
   }

   public NegativeCycleDetectedException(String var1, GraphPath<?, ?> var2) {
      super(var1);
      this.cycle = var2;
   }

   public GraphPath<?, ?> getCycle() {
      return this.cycle;
   }

   public void setCycle(GraphPath<?, ?> var1) {
      this.cycle = var1;
   }
}
