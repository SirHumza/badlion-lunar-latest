package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class BaseSpscLinkedAtomicArrayQueueProducerColdFields<E> extends BaseSpscLinkedAtomicArrayQueueProducerFields<E> {
   protected long producerBufferLimit;
   protected long producerMask;
   protected AtomicReferenceArray<E> producerBuffer;
}
