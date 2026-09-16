package org.jctools.queues.unpadded;

abstract class BaseSpscLinkedUnpaddedArrayQueueConsumerColdFields<E> extends BaseSpscLinkedUnpaddedArrayQueuePrePad<E> {
   protected long consumerMask;
   protected E[] consumerBuffer;
}
