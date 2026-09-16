package org.jgrapht.graph.specifics;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;
import org.jgrapht.graph.EdgeSetFactory;

public class DirectedEdgeContainer<V, E> implements Serializable {
   private static final long serialVersionUID = 7494242245729767106L;
   Set<E> incoming;
   Set<E> outgoing;
   private transient Set<E> unmodifiableIncoming = null;
   private transient Set<E> unmodifiableOutgoing = null;

   DirectedEdgeContainer(EdgeSetFactory<V, E> var1, V var2) {
      this.incoming = var1.createEdgeSet(var2);
      this.outgoing = var1.createEdgeSet(var2);
   }

   public Set<E> getUnmodifiableIncomingEdges() {
      if (this.unmodifiableIncoming == null) {
         this.unmodifiableIncoming = Collections.unmodifiableSet(this.incoming);
      }

      return this.unmodifiableIncoming;
   }

   public Set<E> getUnmodifiableOutgoingEdges() {
      if (this.unmodifiableOutgoing == null) {
         this.unmodifiableOutgoing = Collections.unmodifiableSet(this.outgoing);
      }

      return this.unmodifiableOutgoing;
   }

   public void addIncomingEdge(E var1) {
      this.incoming.add((E)var1);
   }

   public void addOutgoingEdge(E var1) {
      this.outgoing.add((E)var1);
   }

   public void removeIncomingEdge(E var1) {
      this.incoming.remove(var1);
   }

   public void removeOutgoingEdge(E var1) {
      this.outgoing.remove(var1);
   }
}
