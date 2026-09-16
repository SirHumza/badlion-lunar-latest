package org.jgrapht.util;

import java.util.AbstractSequentialList;
import java.util.ConcurrentModificationException;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import org.jgrapht.alg.util.Pair;

public class DoublyLinkedList<E> extends AbstractSequentialList<E> implements Deque<E> {
   private DoublyLinkedList.ListNodeImpl<E> head = null;
   private int size;

   private DoublyLinkedList.ListNodeImpl<E> tail() {
      return this.head.prev;
   }

   @Override
   public boolean isEmpty() {
      return this.head == null;
   }

   @Override
   public int size() {
      return this.size;
   }

   @Override
   public void clear() {
      if (!this.isEmpty()) {
         DoublyLinkedList.ListNodeImpl var1 = this.head;

         do {
            DoublyLinkedList.ListNodeImpl var2 = var1.next;
            boolean var3 = this.removeListNode(var1);
            assert var3;
            var1 = var2;
         } while (var1 != this.head);

         this.head = null;
         assert this.size == 0;
      }
   }

   private void addListNode(DoublyLinkedList.ListNodeImpl<E> var1) {
      if (var1.list != null) {
         String var2 = var1.list == this ? "this" : "other";
         throw new IllegalArgumentException("Node <" + var1 + "> already contained in " + var2 + " list");
      }

      var1.list = this;
      this.size++;
      this.modCount++;
   }

   private void moveAllListNodes(DoublyLinkedList<E> var1) {
      DoublyLinkedList.ListNodeIteratorImpl var2 = var1.new ListNodeIteratorImpl(0);

      while (var2.hasNext()) {
         DoublyLinkedList.ListNodeImpl var3 = var2.nextNode();
         assert var3.list == var1;
         var3.list = this;
      }

      this.size = this.size + var1.size;
      var1.size = 0;
      this.modCount++;
      var1.modCount++;
   }

   private boolean removeListNode(DoublyLinkedList.ListNodeImpl<E> var1) {
      if (var1.list == this) {
         var1.list = null;
         var1.next = null;
         var1.prev = null;
         this.size--;
         this.modCount++;
         return true;
      } else {
         return false;
      }
   }

   private void link(DoublyLinkedList.ListNodeImpl<E> var1, DoublyLinkedList.ListNodeImpl<E> var2) {
      var1.next = var2;
      var2.prev = var1;
   }

   private void linkBefore(DoublyLinkedList.ListNodeImpl<E> var1, DoublyLinkedList.ListNodeImpl<E> var2) {
      this.addListNode(var1);
      this.link(var2.prev, var1);
      this.link(var1, var2);
   }

   private void linkLast(DoublyLinkedList.ListNodeImpl<E> var1) {
      if (this.isEmpty()) {
         this.addListNode(var1);
         this.link(var1, var1);
         this.head = var1;
      } else {
         this.linkBefore(var1, this.head);
      }
   }

   private void linkListIntoThisBefore(int var1, DoublyLinkedList<E> var2) {
      int var3 = this.size;
      this.moveAllListNodes(var2);
      if (var3 == 0) {
         this.head = var2.head;
      } else {
         DoublyLinkedList.ListNodeImpl var4 = var1 == var3 ? this.head : this.getNodeAt(var1);
         DoublyLinkedList.ListNodeImpl var5 = var2.tail();
         this.link(var4.prev, var2.head);
         this.link(var5, var4);
         if (var1 == 0) {
            this.head = var2.head;
         }
      }

      var2.head = null;
   }

   private boolean unlink(DoublyLinkedList.ListNodeImpl<E> var1) {
      DoublyLinkedList.ListNodeImpl var2 = var1.prev;
      DoublyLinkedList.ListNodeImpl var3 = var1.next;
      if (this.removeListNode(var1)) {
         if (this.size == 0) {
            this.head = null;
         } else {
            this.link(var2, var3);
            if (this.head == var1) {
               this.head = var3;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void addNode(int var1, DoublyLinkedList.ListNode<E> var2) {
      DoublyLinkedList.ListNodeImpl var3 = (DoublyLinkedList.ListNodeImpl)var2;
      if (var1 == this.size) {
         this.linkLast(var3);
      } else {
         DoublyLinkedList.ListNodeImpl var4 = var1 == 0 ? this.head : this.getNodeAt(var1);
         this.linkBefore(var3, var4);
         if (this.head == var4) {
            this.head = var3;
         }
      }
   }

   public void addNodeFirst(DoublyLinkedList.ListNode<E> var1) {
      this.addNode(0, var1);
   }

   public void addNodeLast(DoublyLinkedList.ListNode<E> var1) {
      this.addNode(this.size, var1);
   }

   public void addNodeBefore(DoublyLinkedList.ListNode<E> var1, DoublyLinkedList.ListNode<E> var2) {
      DoublyLinkedList.ListNodeImpl var3 = (DoublyLinkedList.ListNodeImpl)var2;
      DoublyLinkedList.ListNodeImpl var4 = (DoublyLinkedList.ListNodeImpl)var1;
      if (var3.list != this) {
         throw new IllegalArgumentException("Node <" + var3 + "> not in this list");
      }

      this.linkBefore(var4, var3);
      if (this.head == var3) {
         this.head = var4;
      }
   }

   public DoublyLinkedList.ListNode<E> getFirstNode() {
      if (this.isEmpty()) {
         throw new NoSuchElementException();
      } else {
         return this.head;
      }
   }

   public DoublyLinkedList.ListNode<E> getLastNode() {
      if (this.isEmpty()) {
         throw new NoSuchElementException();
      } else {
         return this.tail();
      }
   }

   public DoublyLinkedList.ListNode<E> getNode(int var1) {
      return this.getNodeAt(var1);
   }

   private DoublyLinkedList.ListNodeImpl<E> getNodeAt(int var1) {
      if (var1 >= 0 && this.size > var1) {
         DoublyLinkedList.ListNodeImpl var2;
         if (var1 < this.size / 2) {
            var2 = this.head;

            for (int var3 = 0; var3 < var1; var3++) {
               var2 = var2.next;
            }
         } else {
            var2 = this.tail();

            for (int var4 = this.size - 1; var1 < var4; var4--) {
               var2 = var2.prev;
            }
         }

         return var2;
      } else {
         throw new IndexOutOfBoundsException("Index: " + var1);
      }
   }

   public int indexOfNode(DoublyLinkedList.ListNode<E> var1) {
      if (!this.containsNode(var1)) {
         return -1;
      }

      DoublyLinkedList.ListNodeImpl var2 = this.head;

      for (int var3 = 0; var3 < this.size; var3++) {
         if (var2 == var1) {
            return var3;
         }

         var2 = var2.next;
      }

      throw new IllegalStateException("Node contained in list not found: " + var1);
   }

   public boolean containsNode(DoublyLinkedList.ListNode<E> var1) {
      return ((DoublyLinkedList.ListNodeImpl)var1).list == this;
   }

   public boolean removeNode(DoublyLinkedList.ListNode<E> var1) {
      return this.unlink((DoublyLinkedList.ListNodeImpl<E>)var1);
   }

   public DoublyLinkedList.ListNode<E> nodeOf(Object var1) {
      return this.searchNode(() -> this.head, var0 -> var0.next, var1).getFirst();
   }

   public DoublyLinkedList.ListNode<E> lastNodeOf(Object var1) {
      return this.searchNode(this::tail, var0 -> var0.prev, var1).getFirst();
   }

   private Pair<DoublyLinkedList.ListNodeImpl<E>, Integer> searchNode(
      Supplier<DoublyLinkedList.ListNodeImpl<E>> var1, UnaryOperator<DoublyLinkedList.ListNodeImpl<E>> var2, Object var3
   ) {
      if (!this.isEmpty()) {
         int var4 = 0;
         DoublyLinkedList.ListNodeImpl var5 = (DoublyLinkedList.ListNodeImpl)var1.get();
         DoublyLinkedList.ListNodeImpl var6 = var5;

         do {
            if (Objects.equals(var6.value, var3)) {
               return Pair.of(var6, var4);
            }

            var4++;
            var6 = var2.apply(var6);
         } while (var6 != var5);
      }

      return Pair.of(null, -1);
   }

   public DoublyLinkedList.ListNode<E> addElementFirst(E var1) {
      DoublyLinkedList.ListNodeImpl var2 = new DoublyLinkedList.ListNodeImpl<>(var1);
      this.addNode(0, var2);
      return var2;
   }

   public DoublyLinkedList.ListNode<E> addElementLast(E var1) {
      DoublyLinkedList.ListNodeImpl var2 = new DoublyLinkedList.ListNodeImpl<>(var1);
      this.addNode(this.size, var2);
      return var2;
   }

   public DoublyLinkedList.ListNode<E> addElementBeforeNode(DoublyLinkedList.ListNode<E> var1, E var2) {
      DoublyLinkedList.ListNodeImpl var3 = new DoublyLinkedList.ListNodeImpl<>(var2);
      this.addNodeBefore(var3, var1);
      return var3;
   }

   @Override
   public void add(int var1, E var2) {
      if (var1 == this.size) {
         this.addElementLast((E)var2);
      } else {
         this.addElementBeforeNode(this.getNode(var1), (E)var2);
      }
   }

   @Override
   public E get(int var1) {
      return this.getNodeAt(var1).value;
   }

   @Override
   public E remove(int var1) {
      DoublyLinkedList.ListNode var2 = this.getNode(var1);
      this.removeNode(var2);
      return (E)var2.getValue();
   }

   @Override
   public void addFirst(E var1) {
      this.addElementFirst((E)var1);
   }

   @Override
   public void addLast(E var1) {
      this.addElementLast((E)var1);
   }

   @Override
   public boolean offerFirst(E var1) {
      this.addElementFirst((E)var1);
      return true;
   }

   @Override
   public boolean offerLast(E var1) {
      this.addElementLast((E)var1);
      return true;
   }

   @Override
   public E removeFirst() {
      if (this.isEmpty()) {
         throw new NoSuchElementException();
      }

      DoublyLinkedList.ListNodeImpl var1 = this.head;
      this.removeNode(var1);
      return (E)var1.getValue();
   }

   @Override
   public E removeLast() {
      if (this.isEmpty()) {
         throw new NoSuchElementException();
      }

      DoublyLinkedList.ListNodeImpl var1 = this.tail();
      this.removeNode(var1);
      return (E)var1.getValue();
   }

   @Override
   public E pollFirst() {
      if (this.isEmpty()) {
         return null;
      }

      DoublyLinkedList.ListNodeImpl var1 = this.head;
      this.removeNode(var1);
      return (E)var1.getValue();
   }

   @Override
   public E pollLast() {
      if (this.isEmpty()) {
         return null;
      }

      DoublyLinkedList.ListNodeImpl var1 = this.tail();
      this.removeNode(var1);
      return (E)var1.getValue();
   }

   @Override
   public E getFirst() {
      return this.getFirstNode().getValue();
   }

   @Override
   public E getLast() {
      return this.getLastNode().getValue();
   }

   @Override
   public E peekFirst() {
      return this.isEmpty() ? null : this.getFirst();
   }

   @Override
   public E peekLast() {
      return this.isEmpty() ? null : this.getLast();
   }

   @Override
   public boolean removeFirstOccurrence(Object var1) {
      DoublyLinkedList.ListNode var2 = this.nodeOf(var1);
      if (var2 != null) {
         this.removeNode(var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean removeLastOccurrence(Object var1) {
      DoublyLinkedList.ListNode var2 = this.lastNodeOf(var1);
      if (var2 != null) {
         this.removeNode(var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean offer(E var1) {
      return this.offerLast((E)var1);
   }

   @Override
   public E remove() {
      return this.removeFirst();
   }

   @Override
   public E poll() {
      return this.pollFirst();
   }

   @Override
   public E element() {
      return this.getFirst();
   }

   @Override
   public E peek() {
      return this.peekFirst();
   }

   @Override
   public void push(E var1) {
      this.addFirst((E)var1);
   }

   @Override
   public E pop() {
      return this.removeFirst();
   }

   public void invert() {
      if (this.size >= 2) {
         DoublyLinkedList.ListNodeImpl var1 = this.tail();
         DoublyLinkedList.ListNodeImpl var2 = this.head;

         do {
            DoublyLinkedList.ListNodeImpl var3 = var2.next;
            var2.next = var2.prev;
            var2.prev = var3;
            var2 = var3;
         } while (var2 != this.head);

         this.head = var1;
         this.modCount++;
      }
   }

   public void moveFrom(int var1, DoublyLinkedList<E> var2) {
      this.linkListIntoThisBefore(var1, var2);
   }

   public void append(DoublyLinkedList<E> var1) {
      this.moveFrom(this.size, var1);
   }

   public void prepend(DoublyLinkedList<E> var1) {
      this.moveFrom(0, var1);
   }

   public DoublyLinkedList.NodeIterator<E> circularIterator(E var1) {
      DoublyLinkedList.ListNodeImpl var2 = (DoublyLinkedList.ListNodeImpl)this.nodeOf(var1);
      if (var2 == null) {
         throw new NoSuchElementException();
      } else {
         return new DoublyLinkedList.ListNodeIteratorImpl(0, var2);
      }
   }

   public DoublyLinkedList.NodeIterator<E> reverseCircularIterator(E var1) {
      DoublyLinkedList.ListNodeImpl var2 = (DoublyLinkedList.ListNodeImpl)this.nodeOf(var1);
      if (var2 == null) {
         throw new NoSuchElementException();
      } else {
         return reverseIterator(new DoublyLinkedList.ListNodeIteratorImpl(this.size, var2.next));
      }
   }

   public DoublyLinkedList.NodeIterator<E> descendingIterator() {
      return reverseIterator(this.listIterator(this.size));
   }

   public DoublyLinkedList.NodeIterator<E> iterator() {
      return this.listIterator();
   }

   public DoublyLinkedList.ListNodeIterator<E> listIterator() {
      return this.listIterator(0);
   }

   public DoublyLinkedList.ListNodeIterator<E> listIterator(int var1) {
      return new DoublyLinkedList.ListNodeIteratorImpl(var1);
   }

   public DoublyLinkedList.ListNodeIterator<E> listIterator(E var1) {
      Pair var2 = this.searchNode(() -> this.head, var0 -> var0.next, var1);
      DoublyLinkedList.ListNodeImpl var3 = (DoublyLinkedList.ListNodeImpl)var2.getFirst();
      int var4 = (Integer)var2.getSecond();
      if (var3 == null) {
         throw new NoSuchElementException();
      } else {
         return new DoublyLinkedList.ListNodeIteratorImpl(var4, var3);
      }
   }

   private static <E> DoublyLinkedList.NodeIterator<E> reverseIterator(final DoublyLinkedList.ListNodeIterator<E> var0) {
      return new DoublyLinkedList.NodeIterator<E>() {
         @Override
         public boolean hasNext() {
            return var0.hasPrevious();
         }

         @Override
         public DoublyLinkedList.ListNode<E> nextNode() {
            return var0.previousNode();
         }

         @Override
         public void remove() {
            var0.remove();
         }
      };
   }

   public interface ListNode<V> {
      V getValue();

      DoublyLinkedList.ListNode<V> getNext();

      DoublyLinkedList.ListNode<V> getPrev();
   }

   private static class ListNodeImpl<V> implements DoublyLinkedList.ListNode<V> {
      private final V value;
      private DoublyLinkedList<V> list = null;
      private DoublyLinkedList.ListNodeImpl<V> next = null;
      private DoublyLinkedList.ListNodeImpl<V> prev = null;

      ListNodeImpl(V var1) {
         this.value = (V)var1;
      }

      @Override
      public String toString() {
         return this.list == null ? " - " + this.value + " - " : this.prev.value + " -> " + this.value + " -> " + this.next.value;
      }

      @Override
      public V getValue() {
         return this.value;
      }

      public DoublyLinkedList.ListNodeImpl<V> getNext() {
         return this.next;
      }

      public DoublyLinkedList.ListNodeImpl<V> getPrev() {
         return this.prev;
      }
   }

   public interface ListNodeIterator<E> extends ListIterator<E>, DoublyLinkedList.NodeIterator<E> {
      @Override
      default E next() {
         return this.nextNode().getValue();
      }

      @Override
      default E previous() {
         return this.previousNode().getValue();
      }

      DoublyLinkedList.ListNode<E> previousNode();
   }

   private class ListNodeIteratorImpl implements DoublyLinkedList.ListNodeIterator<E> {
      private int nextIndex;
      private DoublyLinkedList.ListNodeImpl<E> next;
      private DoublyLinkedList.ListNodeImpl<E> last = null;
      private int expectedModCount;

      private ListNodeIteratorImpl(int var2) {
         this.expectedModCount = DoublyLinkedList.this.modCount;
         this.nextIndex = var2;
         if (var2 == DoublyLinkedList.this.size) {
            this.next = DoublyLinkedList.this.isEmpty() ? null : DoublyLinkedList.this.head;
         } else {
            this.next = DoublyLinkedList.this.getNodeAt(var2);
         }
      }

      private ListNodeIteratorImpl(int var2, DoublyLinkedList.ListNodeImpl<E> var3) {
         this.expectedModCount = DoublyLinkedList.this.modCount;
         this.nextIndex = var2;
         this.next = var3;
      }

      @Override
      public boolean hasNext() {
         return this.nextIndex < DoublyLinkedList.this.size;
      }

      @Override
      public boolean hasPrevious() {
         return this.nextIndex > 0;
      }

      @Override
      public int nextIndex() {
         return this.nextIndex;
      }

      @Override
      public int previousIndex() {
         return this.nextIndex - 1;
      }

      public DoublyLinkedList.ListNodeImpl<E> nextNode() {
         this.checkForComodification();
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         this.last = this.next;
         this.next = this.next.next;
         this.nextIndex++;
         return this.last;
      }

      @Override
      public DoublyLinkedList.ListNode<E> previousNode() {
         this.checkForComodification();
         if (!this.hasPrevious()) {
            throw new NoSuchElementException();
         }

         this.last = this.next = this.next.prev;
         this.nextIndex--;
         return this.last;
      }

      @Override
      public void add(E var1) {
         this.checkForComodification();
         if (this.nextIndex == DoublyLinkedList.this.size) {
            DoublyLinkedList.this.addElementLast((E)var1);
            if (DoublyLinkedList.this.size == 1) {
               this.next = DoublyLinkedList.this.head;
            }
         } else {
            DoublyLinkedList.this.addElementBeforeNode(this.next, (E)var1);
         }

         this.last = null;
         this.nextIndex++;
         this.expectedModCount++;
      }

      @Override
      public void set(E var1) {
         if (this.last == null) {
            throw new IllegalStateException();
         }

         this.checkForComodification();
         DoublyLinkedList.ListNodeImpl var2 = this.last.next;
         boolean var3 = this.last == DoublyLinkedList.this.tail();
         DoublyLinkedList.this.removeNode(this.last);
         if (var3) {
            this.last = (DoublyLinkedList.ListNodeImpl<E>)DoublyLinkedList.this.addElementLast((E)var1);
         } else {
            this.last = (DoublyLinkedList.ListNodeImpl<E>)DoublyLinkedList.this.addElementBeforeNode(var2, (E)var1);
         }

         this.expectedModCount += 2;
      }

      @Override
      public void remove() {
         if (this.last == null) {
            throw new IllegalStateException();
         }

         this.checkForComodification();
         DoublyLinkedList.ListNodeImpl var1 = this.last.next;
         DoublyLinkedList.this.removeNode(this.last);
         if (this.next == this.last) {
            this.next = var1;
         } else {
            this.nextIndex--;
         }

         this.last = null;
         this.expectedModCount++;
      }

      private void checkForComodification() {
         if (this.expectedModCount != DoublyLinkedList.this.modCount) {
            throw new ConcurrentModificationException();
         }
      }
   }

   public interface NodeIterator<E> extends Iterator<E> {
      @Override
      default E next() {
         return this.nextNode().getValue();
      }

      DoublyLinkedList.ListNode<E> nextNode();
   }
}
