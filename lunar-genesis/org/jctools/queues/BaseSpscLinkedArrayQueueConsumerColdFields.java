package org.jctools.queues;

abstract class BaseSpscLinkedArrayQueueConsumerColdFields<E> extends BaseSpscLinkedArrayQueuePrePad<E> {
   protected long consumerMask;
   protected E[] consumerBuffer;
}
