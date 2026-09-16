package org.jgrapht.traverse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.event.ConnectedComponentTraversalEvent;

public abstract class CrossComponentIterator<V, E, D> extends AbstractGraphIterator<V, E> {
   private static final int CCS_BEFORE_COMPONENT = 1;
   private static final int CCS_WITHIN_COMPONENT = 2;
   private static final int CCS_AFTER_COMPONENT = 3;
   private final ConnectedComponentTraversalEvent ccFinishedEvent = new ConnectedComponentTraversalEvent(this, 32);
   private final ConnectedComponentTraversalEvent ccStartedEvent = new ConnectedComponentTraversalEvent(this, 31);
   private Map<V, D> seen = (Map<V, D>)(new HashMap<>());
   private Iterator<V> entireGraphVertexIterator = null;
   private Iterator<V> startVertexIterator = null;
   private V startVertex;
   private int state = 1;

   public CrossComponentIterator(Graph<V, E> var1) {
      this(var1, (V)null);
   }

   public CrossComponentIterator(Graph<V, E> var1, V var2) {
      this(var1, var2 == null ? null : Collections.singletonList((V)var2));
   }

   public CrossComponentIterator(Graph<V, E> var1, Iterable<V> var2) {
      super(var1);
      if (var2 == null) {
         this.crossComponentTraversal = true;
      } else {
         this.crossComponentTraversal = false;
         this.startVertexIterator = var2.iterator();
      }

      Iterator var3 = this.crossComponentTraversal ? this.getEntireGraphVertexIterator() : this.startVertexIterator;
      if (var3.hasNext()) {
         this.startVertex = (V)var3.next();
         if (!this.graph.containsVertex(this.startVertex)) {
            throw new IllegalArgumentException("graph must contain the start vertex");
         }
      } else {
         this.startVertex = null;
      }
   }

   @Override
   public boolean hasNext() {
      if (this.startVertex != null) {
         this.encounterStartVertex();
      }

      if (!this.isConnectedComponentExhausted()) {
         return true;
      }

      if (this.state == 2) {
         this.state = 3;
         if (this.nListeners != 0) {
            this.fireConnectedComponentFinished(this.ccFinishedEvent);
         }
      }

      Iterator var1 = this.isCrossComponentTraversal() ? this.getEntireGraphVertexIterator() : this.startVertexIterator;

      while (var1 != null && var1.hasNext()) {
         Object var2 = var1.next();
         if (!this.graph.containsVertex((V)var2)) {
            throw new IllegalArgumentException("graph must contain the start vertex");
         }

         if (!this.isSeenVertex((V)var2)) {
            this.encounterVertex((V)var2, null);
            this.state = 1;
            return true;
         }
      }

      return false;
   }

   @Override
   public V next() {
      if (this.startVertex != null) {
         this.encounterStartVertex();
      }

      if (this.hasNext()) {
         if (this.state == 1) {
            this.state = 2;
            if (this.nListeners != 0) {
               this.fireConnectedComponentStarted(this.ccStartedEvent);
            }
         }

         Object var1 = this.provideNextVertex();
         if (this.nListeners != 0) {
            this.fireVertexTraversed(this.createVertexTraversalEvent((V)var1));
         }

         this.addUnseenChildrenOf((V)var1);
         return (V)var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   protected Iterator<V> getEntireGraphVertexIterator() {
      if (this.entireGraphVertexIterator == null) {
         assert this.isCrossComponentTraversal();
         this.entireGraphVertexIterator = this.graph.vertexSet().iterator();
      }

      return this.entireGraphVertexIterator;
   }

   protected abstract boolean isConnectedComponentExhausted();

   protected abstract void encounterVertex(V var1, E var2);

   protected abstract V provideNextVertex();

   protected D getSeenData(V var1) {
      return this.seen.get(var1);
   }

   protected boolean isSeenVertex(V var1) {
      return this.seen.containsKey(var1);
   }

   protected abstract void encounterVertexAgain(V var1, E var2);

   protected D putSeenData(V var1, D var2) {
      return this.seen.put((V)var1, (D)var2);
   }

   protected void finishVertex(V var1) {
      if (this.nListeners != 0) {
         this.fireVertexFinished(this.createVertexTraversalEvent((V)var1));
      }
   }

   protected Set<E> selectOutgoingEdges(V var1) {
      return this.graph.outgoingEdgesOf((V)var1);
   }

   private void addUnseenChildrenOf(V var1) {
      for (Object var3 : this.selectOutgoingEdges((V)var1)) {
         if (this.nListeners != 0) {
            this.fireEdgeTraversed(this.createEdgeTraversalEvent((E)var3));
         }

         Object var4 = Graphs.getOppositeVertex(this.graph, (E)var3, (V)var1);
         if (this.isSeenVertex((V)var4)) {
            this.encounterVertexAgain((V)var4, (E)var3);
         } else {
            this.encounterVertex((V)var4, (E)var3);
         }
      }
   }

   private void encounterStartVertex() {
      this.encounterVertex(this.startVertex, null);
      this.startVertex = null;
   }
}
