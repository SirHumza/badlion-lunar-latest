package com.lunarclient.apollo.event;

import java.util.function.Consumer;

public interface ApolloListener {
   default <T extends Event> void handle(Class<T> var1, Consumer<T> var2) {
      EventBus.getBus().register(var1, var2);
   }
}
