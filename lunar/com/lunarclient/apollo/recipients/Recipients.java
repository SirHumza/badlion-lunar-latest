package com.lunarclient.apollo.recipients;

import com.lunarclient.apollo.Apollo;
import java.util.function.Consumer;

public interface Recipients {
   static ForwardingRecipients of(Iterable<? extends Recipients> var0) {
      return () -> var0;
   }

   static ForwardingRecipients ofEveryone() {
      return () -> Apollo.getPlayerManager().getPlayers();
   }

   default void forEach(Consumer<? super Recipients> var1) {
      var1.accept(this);
   }
}
