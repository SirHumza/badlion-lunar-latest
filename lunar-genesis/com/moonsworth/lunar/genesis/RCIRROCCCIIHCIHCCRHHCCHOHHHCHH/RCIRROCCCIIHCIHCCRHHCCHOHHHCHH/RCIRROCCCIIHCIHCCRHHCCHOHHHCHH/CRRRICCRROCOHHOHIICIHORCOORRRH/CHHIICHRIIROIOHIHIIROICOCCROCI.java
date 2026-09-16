package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class CHHIICHRIIROIOHIHIIROICOCCROCI<T> extends HRHRORCIRICHCCCCCHICOOICIRHRIO implements Iterator<T> {
   protected CHHIICHRIIROIOHIHIIROICOCCROCI() {
   }

   protected abstract Iterator<T> delegate();

   @Override
   public boolean hasNext() {
      return this.delegate().hasNext();
   }

   @CanIgnoreReturnValue
   @Override
   public T next() {
      return this.delegate().next();
   }

   @Override
   public void remove() {
      this.delegate().remove();
   }
}
