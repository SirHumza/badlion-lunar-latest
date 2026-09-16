package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

public class MpscLinkedQueue<E> extends BaseLinkedQueue<E> {
   public MpscLinkedQueue() {
      LinkedQueueNode var1 = this.newNode();
      this.spConsumerNode(var1);
      this.xchgProducerNode(var1);
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      LinkedQueueNode var2 = this.newNode((E)var1);
      LinkedQueueNode var3 = this.xchgProducerNode(var2);
      var3.soNext(var2);
      return true;
   }

   @Override
   public boolean remove(Object var1) {
      if (null == var1) {
         return false;
      }

      LinkedQueueNode var2 = this.lpConsumerNode();
      LinkedQueueNode var3 = var2;

      for (LinkedQueueNode var4 = this.getNextConsumerNode(var2); var4 != null; var4 = this.getNextConsumerNode(var4)) {
         if (var1.equals(var4.lpValue())) {
            LinkedQueueNode var5 = this.getNextConsumerNode(var4);
            if (var5 != null) {
               var3.soNext(var5);
            } else {
               var3.soNext(null);
               if (!this.casProducerNode(var4, var3)) {
                  var5 = this.spinWaitForNextNode(var4);
                  var3.soNext(var5);
               }
            }

            var4.soNext(null);
            var4.spValue(null);
            return true;
         }

         var3 = var4;
      }

      return false;
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      return MessagePassingQueueUtil.fillUnbounded(this, var1);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1, int var2) {
      if (null == var1) {
         throw new IllegalArgumentException("supplier is null");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("limit is negative:" + var2);
      }

      if (var2 == 0) {
         return 0;
      }

      LinkedQueueNode var3 = this.newNode((E)var1.get());
      LinkedQueueNode var4 = var3;

      for (int var5 = 1; var5 < var2; var5++) {
         LinkedQueueNode var6 = this.newNode((E)var1.get());
         var3.spNext(var6);
         var3 = var6;
      }

      LinkedQueueNode var7 = this.xchgProducerNode(var3);
      var7.soNext(var4);
      return var2;
   }

   @Override
   public void fill(MessagePassingQueue.Supplier<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.fill(this, var1, var2, var3);
   }

   private LinkedQueueNode<E> xchgProducerNode(LinkedQueueNode<E> var1) {
      if (UnsafeAccess.SUPPORTS_GET_AND_SET_REF) {
         return (LinkedQueueNode<E>)UnsafeAccess.UNSAFE.getAndSetObject(this, P_NODE_OFFSET, var1);
      }

      LinkedQueueNode var2;
      do {
         var2 = this.lvProducerNode();
      } while (!UnsafeAccess.UNSAFE.compareAndSwapObject(this, P_NODE_OFFSET, var2, var1));

      return var2;
   }

   private LinkedQueueNode<E> getNextConsumerNode(LinkedQueueNode<E> var1) {
      LinkedQueueNode var2 = var1.lvNext();
      if (var2 == null && var1 != this.lvProducerNode()) {
         var2 = this.spinWaitForNextNode(var1);
      }

      return var2;
   }
}
