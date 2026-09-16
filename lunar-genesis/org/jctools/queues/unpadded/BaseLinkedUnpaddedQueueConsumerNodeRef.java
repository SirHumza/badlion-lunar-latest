package org.jctools.queues.unpadded;

import org.jctools.queues.LinkedQueueNode;
import org.jctools.util.UnsafeAccess;

abstract class BaseLinkedUnpaddedQueueConsumerNodeRef<E> extends BaseLinkedUnpaddedQueuePad1<E> {
   private static final long C_NODE_OFFSET = UnsafeAccess.fieldOffset(BaseLinkedUnpaddedQueueConsumerNodeRef.class, "consumerNode");
   private LinkedQueueNode<E> consumerNode;

   final void spConsumerNode(LinkedQueueNode<E> var1) {
      this.consumerNode = var1;
   }

   final LinkedQueueNode<E> lvConsumerNode() {
      return (LinkedQueueNode<E>)UnsafeAccess.UNSAFE.getObjectVolatile(this, C_NODE_OFFSET);
   }

   final LinkedQueueNode<E> lpConsumerNode() {
      return this.consumerNode;
   }
}
