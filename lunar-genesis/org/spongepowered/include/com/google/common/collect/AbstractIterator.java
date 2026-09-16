package org.spongepowered.include.com.google.common.collect;

import java.util.NoSuchElementException;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {
   private AbstractIterator.State state = AbstractIterator.State.NOT_READY;
   private T next;

   protected AbstractIterator() {
   }

   protected abstract T computeNext();

   @CanIgnoreReturnValue
   protected final T endOfData() {
      this.state = AbstractIterator.State.DONE;
      return null;
   }

   @CanIgnoreReturnValue
   @Override
   public final boolean hasNext() {
      Preconditions.checkState(this.state != AbstractIterator.State.FAILED);
      switch (this.state) {
         case DONE:
            return false;
         case READY:
            return true;
         default:
            return this.tryToComputeNext();
      }
   }

   private boolean tryToComputeNext() {
      this.state = AbstractIterator.State.FAILED;
      this.next = this.computeNext();
      if (this.state != AbstractIterator.State.DONE) {
         this.state = AbstractIterator.State.READY;
         return true;
      } else {
         return false;
      }
   }

   @CanIgnoreReturnValue
   @Override
   public final T next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.state = AbstractIterator.State.NOT_READY;
      Object var1 = this.next;
      this.next = null;
      return (T)var1;
   }

   private enum State {
      READY,
      NOT_READY,
      DONE,
      FAILED;
   }
}
