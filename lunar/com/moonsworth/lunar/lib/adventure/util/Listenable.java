package com.moonsworth.lunar.lib.adventure.util;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public abstract class Listenable<L> {
   private final List<L> listeners = new CopyOnWriteArrayList<>();

   protected final void forEachListener(@NotNull Consumer<L> var1) {
      for (Object var3 : this.listeners) {
         var1.accept(var3);
      }
   }

   protected final void addListener0(@NotNull L var1) {
      this.listeners.add((L)var1);
   }

   protected final void removeListener0(@NotNull L var1) {
      this.listeners.remove(var1);
   }
}
