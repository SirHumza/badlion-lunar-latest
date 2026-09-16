package org.jgrapht.traverse;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.event.ConnectedComponentTraversalEvent;
import org.jgrapht.event.EdgeTraversalEvent;
import org.jgrapht.event.TraversalListener;
import org.jgrapht.event.VertexTraversalEvent;

public abstract class AbstractGraphIterator<V, E> implements GraphIterator<V, E> {
   private final Set<TraversalListener<V, E>> traversalListeners = new LinkedHashSet<>();
   protected int nListeners = 0;
   protected final AbstractGraphIterator.FlyweightEdgeEvent<V, E> reusableEdgeEvent;
   protected final AbstractGraphIterator.FlyweightVertexEvent<V> reusableVertexEvent;
   protected final Graph<V, E> graph;
   protected boolean crossComponentTraversal;
   protected boolean reuseEvents;

   public AbstractGraphIterator(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "graph must not be null");
      this.reusableEdgeEvent = new AbstractGraphIterator.FlyweightEdgeEvent<>(this, null);
      this.reusableVertexEvent = new AbstractGraphIterator.FlyweightVertexEvent<>(this, null);
      this.crossComponentTraversal = true;
      this.reuseEvents = false;
   }

   public Graph<V, E> getGraph() {
      return this.graph;
   }

   public void setCrossComponentTraversal(boolean var1) {
      this.crossComponentTraversal = var1;
   }

   @Override
   public boolean isCrossComponentTraversal() {
      return this.crossComponentTraversal;
   }

   @Override
   public void setReuseEvents(boolean var1) {
      this.reuseEvents = var1;
   }

   @Override
   public boolean isReuseEvents() {
      return this.reuseEvents;
   }

   @Override
   public void addTraversalListener(TraversalListener<V, E> var1) {
      this.traversalListeners.add(var1);
      this.nListeners = this.traversalListeners.size();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException("remove");
   }

   @Override
   public void removeTraversalListener(TraversalListener<V, E> var1) {
      this.traversalListeners.remove(var1);
      this.nListeners = this.traversalListeners.size();
   }

   protected void fireConnectedComponentFinished(ConnectedComponentTraversalEvent var1) {
      for (TraversalListener var3 : this.traversalListeners) {
         var3.connectedComponentFinished(var1);
      }
   }

   protected void fireConnectedComponentStarted(ConnectedComponentTraversalEvent var1) {
      for (TraversalListener var3 : this.traversalListeners) {
         var3.connectedComponentStarted(var1);
      }
   }

   protected void fireEdgeTraversed(EdgeTraversalEvent<E> var1) {
      for (TraversalListener var3 : this.traversalListeners) {
         var3.edgeTraversed(var1);
      }
   }

   protected void fireVertexTraversed(VertexTraversalEvent<V> var1) {
      for (TraversalListener var3 : this.traversalListeners) {
         var3.vertexTraversed(var1);
      }
   }

   protected void fireVertexFinished(VertexTraversalEvent<V> var1) {
      for (TraversalListener var3 : this.traversalListeners) {
         var3.vertexFinished(var1);
      }
   }

   protected VertexTraversalEvent<V> createVertexTraversalEvent(V var1) {
      if (this.reuseEvents) {
         this.reusableVertexEvent.setVertex((V)var1);
         return this.reusableVertexEvent;
      } else {
         return new VertexTraversalEvent<>(this, (V)var1);
      }
   }

   protected EdgeTraversalEvent<E> createEdgeTraversalEvent(E var1) {
      if (this.isReuseEvents()) {
         this.reusableEdgeEvent.setEdge((E)var1);
         return this.reusableEdgeEvent;
      } else {
         return new EdgeTraversalEvent<>(this, (E)var1);
      }
   }

   static class FlyweightEdgeEvent<VV, localE> extends EdgeTraversalEvent<localE> {
      private static final long serialVersionUID = 4051327833765000755L;

      public FlyweightEdgeEvent(Object var1, localE var2) {
         super(var1, (localE)var2);
      }

      protected void setEdge(localE var1) {
         this.edge = (localE)var1;
      }
   }

   static class FlyweightVertexEvent<VV> extends VertexTraversalEvent<VV> {
      private static final long serialVersionUID = 3834024753848399924L;

      public FlyweightVertexEvent(Object var1, VV var2) {
         super(var1, (VV)var2);
      }

      protected void setVertex(VV var1) {
         this.vertex = (VV)var1;
      }
   }
}
