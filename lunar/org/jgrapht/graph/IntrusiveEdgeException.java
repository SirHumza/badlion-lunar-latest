package org.jgrapht.graph;

public class IntrusiveEdgeException extends RuntimeException {
   private static final long serialVersionUID = 7261763645809925025L;

   public <V> IntrusiveEdgeException(V var1, V var2) {
      super("Edge already associated with source <" + var1 + "> and target <" + var2 + ">");
   }
}
