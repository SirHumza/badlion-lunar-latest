package org.jctools.queues.unpadded;

abstract class BaseSpscLinkedUnpaddedArrayQueueProducerColdFields<E> extends BaseSpscLinkedUnpaddedArrayQueueProducerFields<E> {
   protected long producerBufferLimit;
   protected long producerMask;
   protected E[] producerBuffer;
}
