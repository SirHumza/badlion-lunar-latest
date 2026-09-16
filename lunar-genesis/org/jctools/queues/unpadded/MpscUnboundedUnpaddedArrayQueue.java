package org.jctools.queues.unpadded;

import org.jctools.queues.LinkedArrayQueueUtil;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.queues.MessagePassingQueueUtil;

public class MpscUnboundedUnpaddedArrayQueue<E> extends BaseMpscLinkedUnpaddedArrayQueue<E> {
   public MpscUnboundedUnpaddedArrayQueue(int var1) {
      super(var1);
   }

   @Override
   protected long availableInQueue(long var1, long var3) {
      return 2147483647L;
   }

   @Override
   public int capacity() {
      return -1;
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1) {
      return this.drain(var1, 4096);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      return MessagePassingQueueUtil.fillUnbounded(this, var1);
   }

   @Override
   protected int getNextBufferSize(E[] var1) {
      return LinkedArrayQueueUtil.length(var1);
   }

   @Override
   protected long getCurrentBufferCapacity(long var1) {
      return var1;
   }
}
