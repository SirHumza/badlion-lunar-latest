package org.jgrapht.graph;

public class DefaultEdge extends IntrusiveEdge {
   private static final long serialVersionUID = 3258408452177932855L;

   protected Object getSource() {
      return this.source;
   }

   protected Object getTarget() {
      return this.target;
   }

   @Override
   public String toString() {
      return "(" + this.source + " : " + this.target + ")";
   }
}
