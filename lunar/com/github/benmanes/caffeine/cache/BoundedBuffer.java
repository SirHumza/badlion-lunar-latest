package com.github.benmanes.caffeine.cache;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

final class BoundedBuffer<E> extends StripedBuffer<E> {
   static final int BUFFER_SIZE = 16;
   static final int MASK = 15;

   @Override
   protected Buffer<E> create(E var1) {
      return new BoundedBuffer.RingBuffer<>((E)var1);
   }

   static final class RingBuffer<E> extends BBHeader.ReadAndWriteCounterRef implements Buffer<E> {
      static final VarHandle BUFFER = MethodHandles.arrayElementVarHandle(Object[].class);
      final Object[] buffer = new Object[16];

      public RingBuffer(E var1) {
         BUFFER.set((Object[])this.buffer, (int)0, (Object)var1);
         WRITE.set((BoundedBuffer.RingBuffer)this, (int)1);
      }

      @Override
      public int offer(E var1) {
         long var2 = this.readCounter;
         long var4 = this.writeCounterOpaque();
         long var6 = var4 - var2;
         if (var6 >= 16L) {
            return 1;
         } else if (this.casWriteCounter(var4, var4 + 1L)) {
            int var8 = (int)(var4 & 15L);
            BUFFER.setRelease((Object[])this.buffer, (int)var8, (Object)var1);
            return 0;
         } else {
            return -1;
         }
      }

      @Override
      public void drainTo(Consumer<E> var1) {
         long var2 = this.readCounter;
         long var4 = this.writeCounterOpaque();
         long var6 = var4 - var2;
         if (var6 != 0L) {
            do {
               int var8 = (int)(var2 & 15L);
               Object var9 = (Object)BUFFER.getAcquire((Object[])this.buffer, (int)var8);
               if (var9 == null) {
                  break;
               }

               BUFFER.setRelease((Object[])this.buffer, (int)var8, (Void)null);
               var1.accept(var9);
            } while (++var2 != var4);

            this.setReadCounterOpaque(var2);
         }
      }

      @Override
      public long reads() {
         return this.readCounter;
      }

      @Override
      public long writes() {
         return this.writeCounter;
      }
   }
}
