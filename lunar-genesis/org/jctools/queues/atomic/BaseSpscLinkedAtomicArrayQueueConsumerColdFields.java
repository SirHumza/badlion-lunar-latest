package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class BaseSpscLinkedAtomicArrayQueueConsumerColdFields<E> extends BaseSpscLinkedAtomicArrayQueuePrePad<E> {
   protected long consumerMask;
   protected AtomicReferenceArray<E> consumerBuffer;
}
