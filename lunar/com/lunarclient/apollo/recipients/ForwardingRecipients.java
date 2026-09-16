package com.lunarclient.apollo.recipients;

import java.util.function.Consumer;

@FunctionalInterface
public interface ForwardingRecipients extends Recipients {
   Iterable<? extends Recipients> recipients();

   @Override
   default void forEach(Consumer<? super Recipients> var1) {
      for (Recipients var3 : this.recipients()) {
         var1.accept(var3);
      }
   }
}
