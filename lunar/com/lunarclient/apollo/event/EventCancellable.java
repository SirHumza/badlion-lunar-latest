package com.lunarclient.apollo.event;

public interface EventCancellable extends Event {
   boolean isCancelled();

   void setCancelled(boolean var1);
}
