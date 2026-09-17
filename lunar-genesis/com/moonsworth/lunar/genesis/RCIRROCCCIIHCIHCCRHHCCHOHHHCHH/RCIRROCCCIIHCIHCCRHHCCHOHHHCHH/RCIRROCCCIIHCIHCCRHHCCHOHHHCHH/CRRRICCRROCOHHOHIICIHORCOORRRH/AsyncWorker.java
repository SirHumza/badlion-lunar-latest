package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.time.Duration;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class IICRCOCCHCORCRHHHOIHROCHIROIHH {
   private IICRCOCCHCORCRHHHOIHROCHIROIHH() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> ArrayBlockingQueue<E> newArrayBlockingQueue(int var0) {
      return new ArrayBlockingQueue<>(var0);
   }

   public static <E> ArrayDeque<E> newArrayDeque() {
      return new ArrayDeque<>();
   }

   public static <E> ArrayDeque<E> newArrayDeque(Iterable<? extends E> var0) {
      if (var0 instanceof Collection) {
         return new ArrayDeque<>(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0));
      }

      ArrayDeque var1 = new ArrayDeque();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> ConcurrentLinkedQueue<E> newConcurrentLinkedQueue() {
      return new ConcurrentLinkedQueue<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(Iterable<? extends E> var0) {
      if (var0 instanceof Collection) {
         return new ConcurrentLinkedQueue<>(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0));
      }

      ConcurrentLinkedQueue var1 = new ConcurrentLinkedQueue();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> LinkedBlockingDeque<E> newLinkedBlockingDeque() {
      return new LinkedBlockingDeque<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(int var0) {
      return new LinkedBlockingDeque<>(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(Iterable<? extends E> var0) {
      if (var0 instanceof Collection) {
         return new LinkedBlockingDeque<>(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0));
      }

      LinkedBlockingDeque var1 = new LinkedBlockingDeque();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue() {
      return new LinkedBlockingQueue<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue(int var0) {
      return new LinkedBlockingQueue<>(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue(Iterable<? extends E> var0) {
      if (var0 instanceof Collection) {
         return new LinkedBlockingQueue<>(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0));
      }

      LinkedBlockingQueue var1 = new LinkedBlockingQueue();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E extends Comparable> PriorityBlockingQueue<E> newPriorityBlockingQueue() {
      return new PriorityBlockingQueue<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E extends Comparable> PriorityBlockingQueue<E> newPriorityBlockingQueue(Iterable<? extends E> var0) {
      if (var0 instanceof Collection) {
         return new PriorityBlockingQueue<>(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0));
      }

      PriorityBlockingQueue var1 = new PriorityBlockingQueue();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   public static <E extends Comparable> PriorityQueue<E> newPriorityQueue() {
      return new PriorityQueue<>();
   }

   public static <E extends Comparable> PriorityQueue<E> newPriorityQueue(Iterable<? extends E> var0) {
      if (var0 instanceof Collection) {
         return new PriorityQueue<>(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0));
      }

      PriorityQueue var1 = new PriorityQueue();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> SynchronousQueue<E> newSynchronousQueue() {
      return new SynchronousQueue<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> int drain(BlockingQueue<E> var0, Collection<? super E> var1, int var2, Duration var3) {
      return drain(var0, var1, var2, var3.toNanos(), TimeUnit.NANOSECONDS);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> int drain(BlockingQueue<E> var0, Collection<? super E> var1, int var2, long var3, TimeUnit var5) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      long var6 = System.nanoTime() + var5.toNanos(var3);
      int var8 = 0;

      while (var8 < var2) {
         var8 += var0.drainTo(var1, var2 - var8);
         if (var8 < var2) {
            Object var9 = var0.poll(var6 - System.nanoTime(), TimeUnit.NANOSECONDS);
            if (var9 == null) {
               break;
            }

            var1.add(var9);
            var8++;
         }
      }

      return var8;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> int drainUninterruptibly(BlockingQueue<E> var0, Collection<? super E> var1, int var2, Duration var3) {
      return drainUninterruptibly(var0, var1, var2, var3.toNanos(), TimeUnit.NANOSECONDS);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> int drainUninterruptibly(BlockingQueue<E> var0, Collection<? super E> var1, int var2, long var3, TimeUnit var5) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      long var6 = System.nanoTime() + var5.toNanos(var3);
      int var8 = 0;
      boolean var9 = false;

      try {
         while (var8 < var2) {
            var8 += var0.drainTo(var1, var2 - var8);
            if (var8 < var2) {
               Object var10;
               while (true) {
                  try {
                     var10 = var0.poll(var6 - System.nanoTime(), TimeUnit.NANOSECONDS);
                     break;
                  } catch (InterruptedException var15) {
                     var9 = true;
                  }
               }

               if (var10 == null) {
                  break;
               }

               var1.add(var10);
               var8++;
            }
         }
      } finally {
         if (var9) {
            Thread.currentThread().interrupt();
         }
      }

      return var8;
   }

   public static <E> Queue<E> synchronizedQueue(Queue<E> var0) {
      return OOOOCHIHOOCHCCIHHRRICIRIOHOCRO.queue(var0, null);
   }

   public static <E> Deque<E> synchronizedDeque(Deque<E> var0) {
      return OOOOCHIHOOCHCCIHHRRICIRIOHOCRO.deque(var0, null);
   }
}
