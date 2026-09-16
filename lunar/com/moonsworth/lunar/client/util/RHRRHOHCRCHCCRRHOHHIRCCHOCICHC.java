package com.moonsworth.lunar.client.util;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<T> implements Map<Integer, T> {
   private final Consumer<Consumer<Map<Integer, T>>> HICRICIORIRHRIRCIICCORORRIRHCI;
   private final T[] HRRHCIICHRCIORRICIRIOIIOCOOHOH;
   private int size = 0;

   public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(int var1, Consumer<Consumer<Map<Integer, T>>> var2) {
      this.HRRHCIICHRCIORRICIRIOIIOCOOHOH = (T[])(new Object[var1]);
      this.HICRICIORIRHRIRCIICCORORRIRHCI = var1x -> {
         System.out.println("overflowed");
         var2.accept(var1x);
      };
   }

   @Override
   public T get(Object var1) {
      Object[] var2 = this.HRRHCIICHRCIORRICIRIOIIOCOOHOH;
      if (var1 instanceof Integer var3) {
         int var4 = var3;
         return (T)(var4 < var2.length && var4 >= 0 ? var2[var4] : null);
      } else {
         return null;
      }
   }

   public T put(Integer var1, T var2) {
      if (var1 != null && var2 != null) {
         Object[] var3 = this.HRRHCIICHRCIORRICIRIOIIOCOOHOH;
         int var4 = var1;
         if (var4 < var3.length && var4 >= 0) {
            Object var5 = var3[var4];
            var3[var4] = var2;
            if (var5 == null) {
               this.size++;
            }

            return (T)var5;
         } else {
            this.HICRICIORIRHRIRCIICCORORRIRHCI.accept(var3x -> {
               var3x.putAll(this);
               var3x.put(var1, (T)var2);
            });
            return null;
         }
      } else {
         throw new IllegalArgumentException("Null keys or values are not permitted");
      }
   }

   @Override
   public int size() {
      return this.size;
   }

   @Override
   public boolean isEmpty() {
      return this.size == 0;
   }

   @Override
   public boolean containsKey(Object var1) {
      Object[] var2 = this.HRRHCIICHRCIORRICIRIOIIOCOOHOH;
      if (var1 instanceof Integer var3) {
         int var4 = var3;
         return var4 < var2.length && var4 >= 0 ? var2[var4] != null : false;
      } else {
         return false;
      }
   }

   @Override
   public boolean containsValue(Object var1) {
      if (var1 == null) {
         return false;
      }

      for (Object var5 : this.HRRHCIICHRCIORRICIRIOIIOCOOHOH) {
         if (var5 != null && var5.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public T remove(Object var1) {
      Object[] var2 = this.HRRHCIICHRCIORRICIRIOIIOCOOHOH;
      if (var1 instanceof Integer var3) {
         int var4 = var3;
         if (var4 < var2.length && var4 >= 0) {
            Object var5 = var2[var4];
            if (var5 != null) {
               this.size--;
            }

            var2[var4] = null;
            return (T)var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public void putAll(@NotNull Map<? extends Integer, ? extends T> var1) {
      Object[] var2 = this.HRRHCIICHRCIORRICIRIOIIOCOOHOH;

      for (Entry var4 : var1.entrySet()) {
         if ((Integer)var4.getKey() >= var2.length) {
            this.HICRICIORIRHRIRCIICCORORRIRHCI.accept(var2x -> {
               var2x.putAll(var1);
               var2x.putAll(this);
            });
            return;
         }
      }

      for (Entry var6 : var1.entrySet()) {
         this.put((Integer)var6.getKey(), (T)var6.getValue());
      }
   }

   @Override
   public void clear() {
      Object[] var1 = this.HRRHCIICHRCIORRICIRIOIIOCOOHOH;
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         var1[var2] = null;
      }
   }

   @NotNull
   @Override
   public Set<Integer> keySet() {
      return new AbstractSet<Integer>() {
         @Override
         public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
               private final Iterator<Entry<Integer, T>> it = RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.this.entrySet().iterator();

               @Override
               public boolean hasNext() {
                  return this.it.hasNext();
               }

               public Integer next() {
                  return this.it.next().getKey();
               }

               @Override
               public void remove() {
                  this.it.remove();
               }
            };
         }

         @Override
         public int size() {
            return RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.this.size();
         }
      };
   }

   @NotNull
   @Override
   public Collection<T> values() {
      return new AbstractCollection<T>() {
         @Override
         public Iterator<T> iterator() {
            return new Iterator<T>() {
               private final Iterator<Entry<Integer, T>> HRRHCHRRORCHCCCOOHIHOHOCRIHROC = RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.this.entrySet().iterator();

               @Override
               public boolean hasNext() {
                  return this.HRRHCHRRORCHCCCOOHIHOHOCRIHROC.hasNext();
               }

               @Override
               public T next() {
                  return this.HRRHCHRRORCHCCCOOHIHOHOCRIHROC.next().getValue();
               }

               @Override
               public void remove() {
                  this.HRRHCHRRORCHCCCOOHIHOHOCRIHROC.remove();
               }
            };
         }

         @Override
         public int size() {
            return RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.this.size;
         }
      };
   }

   @NotNull
   @Override
   public Set<Entry<Integer, T>> entrySet() {
      return new AbstractSet<Entry<Integer, T>>() {
         @Override
         public Iterator<Entry<Integer, T>> iterator() {
            return new Iterator<Entry<Integer, T>>() {
               private int i = 0;
               private int offset = 0;

               @Override
               public boolean hasNext() {
                  return this.i < RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.this.size;
               }

               public Entry<Integer, T> next() {
                  Object[] var1 = RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.this.HRRHCIICHRCIORRICIRIOIIOCOOHOH;

                  Object var2;
                  do {
                     var2 = var1[this.offset];
                     if (var2 != null) {
                        break;
                     }

                     this.offset++;
                  } while (this.offset < var1.length);

                  this.i++;
                  return new SimpleEntry<>(this.offset++, (T)var2);
               }

               @Override
               public void remove() {
                  RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.this.remove(this.offset);
               }
            };
         }

         @Override
         public int size() {
            return RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.this.size;
         }
      };
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var2 ? this.entrySet().equals(var2.entrySet()) : false;
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.HRRHCIICHRCIORRICIRIOIIOCOOHOH);
   }
}
