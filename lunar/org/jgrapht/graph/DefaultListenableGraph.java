package org.jgrapht.graph;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.ListenableGraph;
import org.jgrapht.event.GraphEdgeChangeEvent;
import org.jgrapht.event.GraphListener;
import org.jgrapht.event.GraphVertexChangeEvent;
import org.jgrapht.event.VertexSetListener;
import org.jgrapht.util.TypeUtil;

public class DefaultListenableGraph<V, E> extends GraphDelegator<V, E> implements Cloneable, ListenableGraph<V, E> {
   private static final long serialVersionUID = -1156773351121025002L;
   private List<GraphListener<V, E>> graphListeners = new ArrayList<>();
   private List<VertexSetListener<V>> vertexSetListeners = new ArrayList<>();
   private DefaultListenableGraph.FlyweightEdgeEvent<V, E> reuseableEdgeEvent;
   private DefaultListenableGraph.FlyweightVertexEvent<V> reuseableVertexEvent;
   private boolean reuseEvents;

   public DefaultListenableGraph(Graph<V, E> var1) {
      this(var1, false);
   }

   public DefaultListenableGraph(Graph<V, E> var1, boolean var2) {
      super(var1);
      this.reuseEvents = var2;
      this.reuseableEdgeEvent = new DefaultListenableGraph.FlyweightEdgeEvent<>(this, -1, null);
      this.reuseableVertexEvent = new DefaultListenableGraph.FlyweightVertexEvent<>(this, -1, null);
      if (var1 instanceof ListenableGraph) {
         throw new IllegalArgumentException("base graph cannot be listenable");
      }
   }

   public void setReuseEvents(boolean var1) {
      this.reuseEvents = var1;
   }

   public boolean isReuseEvents() {
      return this.reuseEvents;
   }

   @Override
   public E addEdge(V var1, V var2) {
      Object var3 = super.addEdge((V)var1, (V)var2);
      if (var3 != null) {
         this.fireEdgeAdded((E)var3, (V)var1, (V)var2, 1.0);
      }

      return (E)var3;
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      boolean var4 = super.addEdge((V)var1, (V)var2, (E)var3);
      if (var4) {
         this.fireEdgeAdded((E)var3, (V)var1, (V)var2, 1.0);
      }

      return var4;
   }

   @Override
   public void addGraphListener(GraphListener<V, E> var1) {
      addToListenerList(this.graphListeners, var1);
   }

   @Override
   public V addVertex() {
      Object var1 = super.addVertex();
      if (var1 != null) {
         this.fireVertexAdded((V)var1);
      }

      return (V)var1;
   }

   @Override
   public boolean addVertex(V var1) {
      boolean var2 = super.addVertex((V)var1);
      if (var2) {
         this.fireVertexAdded((V)var1);
      }

      return var2;
   }

   @Override
   public void addVertexSetListener(VertexSetListener<V> var1) {
      addToListenerList(this.vertexSetListeners, var1);
   }

   @Override
   public Object clone() {
      try {
         DefaultListenableGraph var1 = TypeUtil.uncheckedCast(super.clone());
         var1.graphListeners = new ArrayList<>();
         var1.vertexSetListeners = new ArrayList<>();
         return var1;
      } catch (CloneNotSupportedException var2) {
         var2.printStackTrace();
         throw new RuntimeException("internal error");
      }
   }

   @Override
   public E removeEdge(V var1, V var2) {
      Object var3 = super.getEdge((V)var1, (V)var2);
      if (var3 != null) {
         double var4 = super.getEdgeWeight((E)var3);
         if (super.removeEdge((E)var3)) {
            this.fireEdgeRemoved((E)var3, (V)var1, (V)var2, var4);
         }
      }

      return (E)var3;
   }

   @Override
   public boolean removeEdge(E var1) {
      Object var2 = this.getEdgeSource((E)var1);
      Object var3 = this.getEdgeTarget((E)var1);
      double var4 = this.getEdgeWeight((E)var1);
      boolean var6 = super.removeEdge((E)var1);
      if (var6) {
         this.fireEdgeRemoved((E)var1, (V)var2, (V)var3, var4);
      }

      return var6;
   }

   @Override
   public void removeGraphListener(GraphListener<V, E> var1) {
      this.graphListeners.remove(var1);
   }

   @Override
   public boolean removeVertex(V var1) {
      if (this.containsVertex((V)var1)) {
         Set var2 = this.edgesOf((V)var1);
         this.removeAllEdges(new ArrayList<>(var2));
         super.removeVertex((V)var1);
         this.fireVertexRemoved((V)var1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      super.setEdgeWeight((E)var1, var2);
      Object var4 = this.getEdgeSource((E)var1);
      Object var5 = this.getEdgeTarget((E)var1);
      this.fireEdgeWeightUpdated((E)var1, (V)var4, (V)var5, var2);
   }

   @Override
   public void removeVertexSetListener(VertexSetListener<V> var1) {
      this.vertexSetListeners.remove(var1);
   }

   protected void fireEdgeAdded(E var1, V var2, V var3, double var4) {
      GraphEdgeChangeEvent var6 = this.createGraphEdgeChangeEvent(23, (E)var1, (V)var2, (V)var3, var4);

      for (GraphListener var8 : this.graphListeners) {
         var8.edgeAdded(var6);
      }
   }

   protected void fireEdgeRemoved(E var1, V var2, V var3, double var4) {
      GraphEdgeChangeEvent var6 = this.createGraphEdgeChangeEvent(24, (E)var1, (V)var2, (V)var3, var4);

      for (GraphListener var8 : this.graphListeners) {
         var8.edgeRemoved(var6);
      }
   }

   protected void fireEdgeWeightUpdated(E var1, V var2, V var3, double var4) {
      GraphEdgeChangeEvent var6 = this.createGraphEdgeChangeEvent(25, (E)var1, (V)var2, (V)var3, var4);

      for (GraphListener var8 : this.graphListeners) {
         var8.edgeWeightUpdated(var6);
      }
   }

   protected void fireVertexAdded(V var1) {
      GraphVertexChangeEvent var2 = this.createGraphVertexChangeEvent(13, (V)var1);

      for (VertexSetListener var4 : this.vertexSetListeners) {
         var4.vertexAdded(var2);
      }

      for (GraphListener var6 : this.graphListeners) {
         var6.vertexAdded(var2);
      }
   }

   protected void fireVertexRemoved(V var1) {
      GraphVertexChangeEvent var2 = this.createGraphVertexChangeEvent(14, (V)var1);

      for (VertexSetListener var4 : this.vertexSetListeners) {
         var4.vertexRemoved(var2);
      }

      for (GraphListener var6 : this.graphListeners) {
         var6.vertexRemoved(var2);
      }
   }

   private static <L extends EventListener> void addToListenerList(List<L> var0, L var1) {
      if (!var0.contains(var1)) {
         var0.add(var1);
      }
   }

   private GraphEdgeChangeEvent<V, E> createGraphEdgeChangeEvent(int var1, E var2, V var3, V var4, double var5) {
      if (this.reuseEvents) {
         this.reuseableEdgeEvent.setType(var1);
         this.reuseableEdgeEvent.setEdge((E)var2);
         this.reuseableEdgeEvent.setEdgeSource((V)var3);
         this.reuseableEdgeEvent.setEdgeTarget((V)var4);
         this.reuseableEdgeEvent.setEdgeWeight(var5);
         return this.reuseableEdgeEvent;
      } else {
         return new GraphEdgeChangeEvent<>(this, var1, (E)var2, (V)var3, (V)var4, var5);
      }
   }

   private GraphVertexChangeEvent<V> createGraphVertexChangeEvent(int var1, V var2) {
      if (this.reuseEvents) {
         this.reuseableVertexEvent.setType(var1);
         this.reuseableVertexEvent.setVertex((V)var2);
         return this.reuseableVertexEvent;
      } else {
         return new GraphVertexChangeEvent<>(this, var1, (V)var2);
      }
   }

   private static class FlyweightEdgeEvent<VV, EE> extends GraphEdgeChangeEvent<VV, EE> {
      private static final long serialVersionUID = 3907207152526636089L;

      public FlyweightEdgeEvent(Object var1, int var2, EE var3) {
         super(var1, var2, (EE)var3, null, null);
      }

      protected void setEdge(EE var1) {
         this.edge = (EE)var1;
      }

      protected void setEdgeSource(VV var1) {
         this.edgeSource = (VV)var1;
      }

      protected void setEdgeTarget(VV var1) {
         this.edgeTarget = (VV)var1;
      }

      protected void setEdgeWeight(double var1) {
         this.edgeWeight = var1;
      }

      protected void setType(int var1) {
         this.type = var1;
      }
   }

   private static class FlyweightVertexEvent<VV> extends GraphVertexChangeEvent<VV> {
      private static final long serialVersionUID = 3257848787857585716L;

      public FlyweightVertexEvent(Object var1, int var2, VV var3) {
         super(var1, var2, (VV)var3);
      }

      protected void setType(int var1) {
         this.type = var1;
      }

      protected void setVertex(VV var1) {
         this.vertex = (VV)var1;
      }
   }
}
