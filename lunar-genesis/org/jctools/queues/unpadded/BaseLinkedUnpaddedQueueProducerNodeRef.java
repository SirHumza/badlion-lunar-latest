package org.jctools.queues.unpadded;

import org.jctools.queues.LinkedQueueNode;
import org.jctools.util.UnsafeAccess;

abstract class BaseLinkedUnpaddedQueueProducerNodeRef<E> extends BaseLinkedUnpaddedQueuePad0<E> {
   static final long P_NODE_OFFSET = UnsafeAccess.fieldOffset(BaseLinkedUnpaddedQueueProducerNodeRef.class, "producerNode");
   private volatile LinkedQueueNode<E> producerNode;

   final void spProducerNode(LinkedQueueNode<E> var1) {
      UnsafeAccess.UNSAFE.putObject(this, P_NODE_OFFSET, var1);
   }

   final void soProducerNode(LinkedQueueNode<E> var1) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, P_NODE_OFFSET, var1);
   }

   final LinkedQueueNode<E> lvProducerNode() {
      return this.producerNode;
   }

   final boolean casProducerNode(LinkedQueueNode<E> var1, LinkedQueueNode<E> var2) {
      return UnsafeAccess.UNSAFE.compareAndSwapObject(this, P_NODE_OFFSET, var1, var2);
   }

   final LinkedQueueNode<E> lpProducerNode() {
      return this.producerNode;
   }
}
