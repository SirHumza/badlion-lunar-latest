package org.jgrapht.traverse;

import java.util.ArrayDeque;
import java.util.Deque;
import org.jgrapht.Graph;
import org.jgrapht.util.TypeUtil;

public class DepthFirstIterator<V, E> extends CrossComponentIterator<V, E, DepthFirstIterator.VisitColor> {
   public static final Object SENTINEL = new Object();
   private Deque<Object> stack = new ArrayDeque<>();

   public DepthFirstIterator(Graph<V, E> var1) {
      this(var1, (V)null);
   }

   public DepthFirstIterator(Graph<V, E> var1, V var2) {
      super(var1, (V)var2);
   }

   public DepthFirstIterator(Graph<V, E> var1, Iterable<V> var2) {
      super(var1, var2);
   }

   @Override
   protected boolean isConnectedComponentExhausted() {
      while (!this.stack.isEmpty()) {
         if (this.stack.getLast() != SENTINEL) {
            return false;
         }

         this.stack.removeLast();
         this.recordFinish();
      }

      return true;
   }

   @Override
   protected void encounterVertex(V var1, E var2) {
      this.putSeenData((V)var1, DepthFirstIterator.VisitColor.WHITE);
      this.stack.addLast(var1);
   }

   @Override
   protected void encounterVertexAgain(V var1, E var2) {
      DepthFirstIterator.VisitColor var3 = this.getSeenData((V)var1);
      if (var3 == DepthFirstIterator.VisitColor.WHITE) {
         boolean var4 = this.stack.removeLastOccurrence(var1);
         assert var4;
         this.stack.addLast(var1);
      }
   }

   @Override
   protected V provideNextVertex() {
      while (true) {
         Object var2 = this.stack.removeLast();
         if (var2 != SENTINEL) {
            Object var1 = TypeUtil.uncheckedCast(var2);
            this.stack.addLast(var1);
            this.stack.addLast(SENTINEL);
            this.putSeenData((V)var1, DepthFirstIterator.VisitColor.GRAY);
            return (V)var1;
         }

         this.recordFinish();
      }
   }

   private void recordFinish() {
      Object var1 = TypeUtil.uncheckedCast(this.stack.removeLast());
      this.putSeenData((V)var1, DepthFirstIterator.VisitColor.BLACK);
      this.finishVertex((V)var1);
   }

   public Deque<Object> getStack() {
      return this.stack;
   }

   protected enum VisitColor {
      WHITE,
      GRAY,
      BLACK;
   }
}
