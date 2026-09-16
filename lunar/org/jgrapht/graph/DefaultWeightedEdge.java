package org.jgrapht.graph;

public class DefaultWeightedEdge extends IntrusiveWeightedEdge {
   private static final long serialVersionUID = -3259071493169286685L;

   protected Object getSource() {
      return this.source;
   }

   protected Object getTarget() {
      return this.target;
   }

   protected double getWeight() {
      return this.weight;
   }

   @Override
   public String toString() {
      return "(" + this.source + " : " + this.target + ")";
   }
}
