package com.lunarclient.apollo.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import lombok.Generated;
import lombok.NonNull;

public final class EventBus {
   private static final EventBus bus = new EventBus();
   private final Map<Class<? extends Event>, CopyOnWriteArrayList<Consumer<? extends Event>>> events = new ConcurrentHashMap<>();

   public void register(@NonNull Object var1) {
      if (var1 == null) {
         throw new NullPointerException("instance is marked non-null but is null");
      }

      for (Method var3 : this.getEventMethods(var1)) {
         this.events
            .computeIfAbsent((Class<? extends Event>)var3.getParameterTypes()[0], var0 -> new CopyOnWriteArrayList<>())
            .add(new ReflectiveConsumer<>(var1, var3));
      }
   }

   public <T extends Event> boolean register(@NonNull Class<T> var1, @NonNull Consumer<T> var2) {
      if (var1 == null) {
         throw new NullPointerException("event is marked non-null but is null");
      } else if (var2 == null) {
         throw new NullPointerException("consumer is marked non-null but is null");
      } else {
         return this.events.computeIfAbsent(var1, var0 -> new CopyOnWriteArrayList<>()).add(var2);
      }
   }

   public void unregister(@NonNull Object var1) {
      if (var1 == null) {
         throw new NullPointerException("instance is marked non-null but is null");
      }

      for (Method var3 : this.getEventMethods(var1)) {
         List var4 = this.events.get(var3.getParameterTypes()[0]);
         if (var4 != null) {
            var4.removeIf(var1x -> var1x instanceof ReflectiveConsumer && ((ReflectiveConsumer)var1x).getInstance() == var1);
         }
      }
   }

   public <T extends Event> boolean unregister(@NonNull Class<T> var1, @NonNull Consumer<T> var2) {
      if (var1 == null) {
         throw new NullPointerException("event is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("consumer is marked non-null but is null");
      }

      CopyOnWriteArrayList var3 = this.events.get(var1);
      return var3 != null && var3.remove(var2);
   }

   public <T extends Event> EventBus.EventResult<T> post(@NonNull T var1) {
      if (var1 == null) {
         throw new NullPointerException("event is marked non-null but is null");
      }

      CopyOnWriteArrayList var2 = this.events.get(var1.getClass());
      if (var2 != null && !var2.isEmpty()) {
         ArrayList var3 = null;

         for (Consumer var5 : var2) {
            try {
               var5.accept(var1);
            } catch (Throwable var7) {
               if (var3 == null) {
                  var3 = new ArrayList();
               }

               var3.add(var7);
            }
         }

         return new EventBus.EventResult<>((T)var1, var3 == null ? Collections.emptyList() : var3);
      } else {
         return new EventBus.EventResult<>((T)var1, Collections.emptyList());
      }
   }

   private List<Method> getEventMethods(Object var1) {
      return Arrays.stream(var1.getClass().getDeclaredMethods())
         .filter(var0 -> var0.isAnnotationPresent(Listen.class) && var0.getParameterCount() == 1 && Event.class.isAssignableFrom(var0.getParameterTypes()[0]))
         .collect(Collectors.toList());
   }

   @Generated
   private EventBus() {
   }

   @Generated
   public static EventBus getBus() {
      return bus;
   }

   public static final class EventResult<T extends Event> {
      private final T event;
      private final List<Throwable> throwing;

      @Generated
      public EventResult(T var1, List<Throwable> var2) {
         this.event = (T)var1;
         this.throwing = var2;
      }

      @Generated
      public T getEvent() {
         return this.event;
      }

      @Generated
      public List<Throwable> getThrowing() {
         return this.throwing;
      }

      @Generated
      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof EventBus.EventResult)) {
            return false;
         } else {
            EventBus.EventResult var2 = (EventBus.EventResult)var1;
            Event var3 = this.getEvent();
            Event var4 = var2.getEvent();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               List var5 = this.getThrowing();
               List var6 = var2.getThrowing();
               return var5 == null ? var6 == null : var5.equals(var6);
            } else {
               return false;
            }
         }
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         Event var3 = this.getEvent();
         var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
         List var4 = this.getThrowing();
         return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      }

      @Generated
      @Override
      public String toString() {
         return "EventBus.EventResult(event=" + this.getEvent() + ", throwing=" + this.getThrowing() + ")";
      }
   }
}
