package com.github.benmanes.caffeine.cache;

import java.util.function.Consumer;

interface Buffer<E> {
   int FULL = 1;
   int FAILED = -1;
   int SUCCESS = 0;

   static <E> Buffer<E> disabled() {
      return DisabledBuffer.INSTANCE;
   }

   int offer(E var1);

   void drainTo(Consumer<E> var1);

   default long size() {
      return this.writes() - this.reads();
   }

   long reads();

   long writes();
}
