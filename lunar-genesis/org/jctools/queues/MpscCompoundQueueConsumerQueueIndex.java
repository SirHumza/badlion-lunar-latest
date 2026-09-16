package org.jctools.queues;

abstract class MpscCompoundQueueConsumerQueueIndex<E> extends MpscCompoundQueueMidPad<E> {
   int consumerQueueIndex;

   MpscCompoundQueueConsumerQueueIndex(int var1, int var2) {
      super(var1, var2);
   }
}
