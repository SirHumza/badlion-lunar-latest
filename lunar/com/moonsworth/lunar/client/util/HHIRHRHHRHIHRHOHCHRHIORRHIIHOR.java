package com.moonsworth.lunar.client.util;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HHIRHRHHRHIHRHOHCHRHIORRHIIHOR<T> extends AbstractQueue<T> {
   private final LinkedList<T> RCCCHIOROIIRIOOIIHIHOCHCIICHOO = new LinkedList<>();
   private final int capacity;

   public HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(int var1) {
      this.capacity = var1;
   }

   @NotNull
   @Override
   public Iterator<T> iterator() {
      return new HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Override
   public int size() {
      return this.RCCCHIOROIIRIOOIIHIHOCHCIICHOO.size();
   }

   @Override
   public boolean offer(T var1) {
      if (this.RCCCHIOROIIRIOOIIHIHOCHCIICHOO.size() >= this.capacity) {
         this.RCCCHIOROIIRIOOIIHIHOCHCIICHOO.remove();
      }

      this.RCCCHIOROIIRIOOIIHIHOCHCIICHOO.add((T)var1);
      return true;
   }

   @Override
   public T poll() {
      return this.RCCCHIOROIIRIOOIIHIHOCHCIICHOO.poll();
   }

   @Override
   public T peek() {
      return this.RCCCHIOROIIRIOOIIHIHOCHCIICHOO.peekFirst();
   }

   public T peekLast() {
      return this.RCCCHIOROIIRIOOIIHIHOCHCIICHOO.peekLast();
   }

   @Nullable
   public T get(int var1) {
      return this.RCCCHIOROIIRIOOIIHIHOCHCIICHOO.get(var1);
   }

   @Generated
   public int getCapacity() {
      return this.capacity;
   }

   private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Iterator<T> {
      private int cursor = 0;

      @Override
      public boolean hasNext() {
         return this.cursor < HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.this.size();
      }

      @Override
      public T next() {
         Object var1 = HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.this.RCCCHIOROIIRIOOIIHIHOCHCIICHOO.get(this.cursor);
         this.cursor++;
         return (T)var1;
      }
   }
}
