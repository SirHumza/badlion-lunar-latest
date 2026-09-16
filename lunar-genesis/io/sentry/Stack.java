package io.sentry;

import io.sentry.util.Objects;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import org.jetbrains.annotations.NotNull;

final class Stack {
   @NotNull
   private final Deque<Stack.StackItem> items = new LinkedBlockingDeque<>();
   @NotNull
   private final ILogger logger;

   public Stack(@NotNull ILogger var1, @NotNull Stack.StackItem var2) {
      this.logger = Objects.requireNonNull(var1, "logger is required");
      this.items.push(Objects.requireNonNull(var2, "rootStackItem is required"));
   }

   public Stack(@NotNull Stack var1) {
      this(var1.logger, new Stack.StackItem(var1.items.getLast()));
      Iterator var2 = var1.items.descendingIterator();
      if (var2.hasNext()) {
         var2.next();
      }

      while (var2.hasNext()) {
         this.push(new Stack.StackItem((Stack.StackItem)var2.next()));
      }
   }

   @NotNull
   Stack.StackItem peek() {
      return this.items.peek();
   }

   void pop() {
      synchronized (this.items) {
         if (this.items.size() != 1) {
            this.items.pop();
         } else {
            this.logger.log(SentryLevel.WARNING, "Attempt to pop the root scope.");
         }
      }
   }

   void push(@NotNull Stack.StackItem var1) {
      this.items.push(var1);
   }

   int size() {
      return this.items.size();
   }

   static final class StackItem {
      private final SentryOptions options;
      @NotNull
      private volatile ISentryClient client;
      @NotNull
      private volatile IScope scope;

      StackItem(@NotNull SentryOptions var1, @NotNull ISentryClient var2, @NotNull IScope var3) {
         this.client = Objects.requireNonNull(var2, "ISentryClient is required.");
         this.scope = Objects.requireNonNull(var3, "Scope is required.");
         this.options = Objects.requireNonNull(var1, "Options is required");
      }

      StackItem(@NotNull Stack.StackItem var1) {
         this.options = var1.options;
         this.client = var1.client;
         this.scope = var1.scope.clone();
      }

      @NotNull
      public ISentryClient getClient() {
         return this.client;
      }

      public void setClient(@NotNull ISentryClient var1) {
         this.client = var1;
      }

      @NotNull
      public IScope getScope() {
         return this.scope;
      }

      @NotNull
      public SentryOptions getOptions() {
         return this.options;
      }
   }
}
