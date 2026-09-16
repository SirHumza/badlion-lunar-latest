package com.moonsworth.lunar.client.util;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.google.common.collect.Sets;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V> extends Thread {
   private static final Object CIRCCCCRIOICRCIIHCOCRIROCRRIOI = new Object();
   private static final Object OCRRIIHRORROHRCHHHOHCIICRCCOCC = new Object();
   private static final Object OROIHRHOHHROOIRIHOIRIRIORIRRRH = new Object();
   private final Set<K> COCRHRCCHRICICHOCCHIOOHRCCIIHI = Sets.newConcurrentHashSet();
   private final Deque<OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K>> IRRICIOHOROCHRCIRROIIHIOICCHRI = new ArrayDeque<>();
   private final Map<K, OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K>> RHCIORHIRHOICRICCCORIIIIHRRHRC = new HashMap<>();
   @Nullable
   private final ExecutorService executorService;
   private final long RIICROHOCOOOCOCCRCHRHCOCIIHIIH;
   private final int HCIRORRRHIRIROHICIRHORHCCIHRCC;
   private final OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> IIRCOCHRHIOHIHRRCHOCHCIRHHOIIR;
   private final Cache<K, Object> IOIRHCOHRHCHHCRORRHIIRIIOCRHHI;
   @Nullable
   private Cache<K, Object> CHHOOIOROHORROORICOHCCCHOIRORR;

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      @Nullable ExecutorService var1, long var2, int var4, OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> var5, @NotNull Caffeine var6
   ) {
      this.setDaemon(true);
      this.executorService = var1;
      this.RIICROHOCOOOCOCCRCHRHCOCIIHIIH = var2;
      this.HCIRORRRHIRIROHICIRHORHCCIHRCC = var4;
      this.IIRCOCHRHIOHIHRRCHOCHCIRHHOIIR = var5;
      this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI = var6.build();
   }

   @Override
   public synchronized void start() {
      super.start();
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Starting fetch thread %s", this.getName()
      );
   }

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, TimeUnit var2) {
      this.CHHOOIOROHORROORICOHCCCHOIRORR = Caffeine.newBuilder().expireAfterWrite(var1, var2).build();
      return this;
   }

   public V get(K var1) {
      if (var1 == null) {
         return null;
      }

      Object var2 = this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.getIfPresent((K)var1);
      if (var2 == OCRRIIHRORROHRCHHHOHCIICRCCOCC) {
         return null;
      }

      if (var2 != null && var2 != CIRCCCCRIOICRCIIHCOCRIROCRRIOI) {
         return (V)var2;
      }

      if (this.CHHOOIOROHORROORICOHCCCHOIRORR != null) {
         this.CHHOOIOROHORROORICOHCCCHOIRORR.put((K)var1, OROIHRHOHHROOIRIHOIRIRIORIRRRH);
      }

      this.COCRHRCCHRICICHOCCHIOOHRCCIIHI.add((K)var1);
      return null;
   }

   public List<V> IHCRHRCORHHCOOIRCOCHRRRHHRCHIO() {
      return this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI
         .asMap()
         .values()
         .stream()
         .filter(var0 -> var0 != CIRCCCCRIOICRCIIHCOCRIROCRRIOI && var0 != OCRRIIHRORROHRCHHHOHCIICRCCOCC && var0 != null)
         .map(var0 -> (V)var0)
         .toList();
   }

   @Override
   public void run() {
      while (true) {
         boolean var1 = false;

         try {
            synchronized (this) {
               this.CCRIHCRRROOCRCCOCOCRIRCIIORCCI();
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.IRRICIOHOROCHRCIRROIIHIOICCHRI.poll();
               if (var3 != null
                  && (
                     this.CHHOOIOROHORROORICOHCCCHOIRORR == null
                        || this.CHHOOIOROHORROORICOHCCCHOIRORR.getIfPresent(var3.IIROORROCOHRCOIHOCICOROHOHRORI) != null
                  )) {
                  var1 = true;
                  if (this.executorService == null) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
                  } else {
                     this.executorService.execute(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3));
                  }
               }
            }
         } catch (Exception var7) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var7, "Fatal fetch thread exception %s", this.getName()
            );
         }

         try {
            long var2 = var1 ? Math.max(1L, this.RIICROHOCOOOCOCCRCHRHCOCIIHIIH) : 10L;
            Thread.sleep(var2);
         } catch (InterruptedException var5) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Fetch thread %s interrupt %s", this.getName(), var5
            );
            return;
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K> var1) {
      Object var2 = var1.IIROORROCOHRCOIHOCICOROHOHRORI;
      boolean var3 = false;

      try {
         if (this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.getIfPresent((K)var2) != CIRCCCCRIOICRCIIHCOCRIROCRRIOI) {
            return;
         }

         Object var4 = this.IIRCOCHRHIOHIHRRCHOCHCIRHHOIIR.fetch((K)var2);
         var3 = true;
         synchronized (this) {
            if (this.RHCIORHIRHOICRICCCORIIIIHRRHRC.get(var2) == var1) {
               this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.put((K)var2, var4 == null ? OCRRIIHRORROHRCHHHOHCIICRCCOCC : var4);
            }
         }
      } catch (Throwable var10) {
         var10.printStackTrace();
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var10, "Fetch thread task %s %s", this.getName(), var2
         );
      }

      boolean var11 = !var3 && ++var1.RCORIOROHHOROIHIHCRRIIHROOCICI < this.HCIRORRRHIRIROHICIRHORHCCIHRCC;
      synchronized (this) {
         if (this.RHCIORHIRHOICRICCCORIIIIHRRHRC.get(var2) == var1) {
            if (var11) {
               this.IRRICIOHOROCHRCIRROIIHIOICCHRI.addFirst(var1);
            } else {
               this.RHCIORHIRHOICRICCCORIIIIHRRHRC.remove(var2);
               if (!var3 && this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.getIfPresent((K)var2) == CIRCCCCRIOICRCIIHCOCRIROCRRIOI) {
                  this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.put((K)var2, OCRRIIHRORROHRCHHHOHCIICRCCOCC);
               }
            }
         }
      }
   }

   private void CCRIHCRRROOCRCCOCOCRIRCIIORCCI() {
      if (!this.COCRHRCCHRICICHOCCHIOOHRCCIIHI.isEmpty()) {
         Iterator var1 = this.COCRHRCCHRICICHOCCHIOOHRCCIIHI.iterator();

         while (var1.hasNext()) {
            Object var2 = var1.next();
            var1.remove();
            Object var3 = this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.getIfPresent((K)var2);
            if (var3 == null) {
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var2);
               this.IRRICIOHOROCHRCIRROIIHIOICCHRI.add(var4);
               this.RHCIORHIRHOICRICCCORIIIIHRRHRC.put((K)var2, var4);
               this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.put((K)var2, CIRCCCCRIOICRCIIHCOCRIROCRRIOI);
            } else if (var3 == CIRCCCCRIOICRCIIHCOCRIROCRRIOI) {
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.RHCIORHIRHOICRICCCORIIIIHRRHRC.get(var2);
               if (var5 != null && this.IRRICIOHOROCHRCIRROIIHIOICCHRI.remove(var5)) {
                  this.IRRICIOHOROCHRCIRROIIHIOICCHRI.addFirst(var5);
               }
            }
         }
      }
   }

   public synchronized void invalidateAll() {
      this.HIIHCCOCRHHIHOICRHIICHIRCCRCIC();
      this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.invalidateAll();
      if (this.CHHOOIOROHORROORICOHCCCHOIRORR != null) {
         this.CHHOOIOROHORROORICOHCCCHOIRORR.invalidateAll();
      }
   }

   public synchronized void HIIHCCOCRHHIHOICRHIICHIRCCRCIC() {
      if (!this.RHCIORHIRHOICRICCCORIIIIHRRHRC.isEmpty()) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "[" + this.getName() + "] Clearing tasks, keyToTask=%s taskQueue=%s keysToProcess=%s cache=%s]",
            this.RHCIORHIRHOICRICCCORIIIIHRRHRC.size(),
            this.IRRICIOHOROCHRCIRROIIHIOICCHRI.size(),
            this.COCRHRCCHRICICHOCCHIOOHRCCIIHI.size(),
            this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.estimatedSize()
         );
         Iterator var1 = this.RHCIORHIRHOICRICCCORIIIIHRRHRC.entrySet().iterator();

         while (var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            var1.remove();
            Object var3 = var2.getKey();
            this.COCRHRCCHRICICHOCCHIOOHRCCIIHI.remove(var3);
            Object var4 = this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.getIfPresent((K)var3);
            if (var4 == CIRCCCCRIOICRCIIHCOCRIROCRRIOI) {
               this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.invalidate((K)var3);
            }

            if (this.CHHOOIOROHORROORICOHCCCHOIRORR != null) {
               this.CHHOOIOROHORROORICOHCCCHOIRORR.invalidate((K)var3);
            }

            OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2.getValue();
            this.IRRICIOHOROCHRCIRROIIHIOICCHRI.remove(var5);
         }
      }
   }

   public String getInfo() {
      Collection var1 = this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.asMap().values();
      return String.format(
         "keysToProcess=%d, taskQueue=%d, keyToTask=%d, executor=%b, waitTime=%d, retries=%d, cache=%d, expiryCache=%s, nullMarkers=%d, processingMarkers=%d",
         this.COCRHRCCHRICICHOCCHIOOHRCCIIHI.size(),
         this.IRRICIOHOROCHRCIRROIIHIOICCHRI.size(),
         this.RHCIORHIRHOICRICCCORIIIIHRRHRC.size(),
         this.executorService != null,
         this.RIICROHOCOOOCOCCRCHRHCOCIIHIIH,
         this.HCIRORRRHIRIROHICIRHORHCCIHRCC,
         this.IOIRHCOHRHCHHCRORRHIIRIIOCRHHI.estimatedSize(),
         this.CHHOOIOROHORROORICOHCCCHOIRORR == null ? "N/A" : String.valueOf(this.CHHOOIOROHORROORICOHCCCHOIRORR.estimatedSize()),
         (int)var1.stream().filter(var0 -> var0 == OCRRIIHRORROHRCHHHOHCIICRCCOCC).count(),
         (int)var1.stream().filter(var0 -> var0 == CIRCCCCRIOICRCIIHCOCRIROCRRIOI).count()
      );
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K> {
      private final K IIROORROCOHRCOIHOCICOROHOHRORI;
      private volatile int RCORIOROHHOROIHIHCRRIIHROOCICI = 0;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(K var1) {
         this.IIROORROCOHRCOIHOCICOROHOHRORI = (K)var1;
      }
   }

   @FunctionalInterface
   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
      V fetch(K var1);
   }
}
