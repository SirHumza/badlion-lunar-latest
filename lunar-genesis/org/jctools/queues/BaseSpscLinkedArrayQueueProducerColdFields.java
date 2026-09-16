package org.jctools.queues;

abstract class BaseSpscLinkedArrayQueueProducerColdFields<E> extends BaseSpscLinkedArrayQueueProducerFields<E> {
   protected long producerBufferLimit;
   protected long producerMask;
   protected E[] producerBuffer;
}
